import java.util.Arrays;

public class Image {
    public static void main(String[] args) {
        int[][] image = creerImage();
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
        System.out.println("Pourcentage de points blancs : " + compterPointsBlancs(image));
        System.out.println("Image éclaircie :");
        int[][] imageEclaircie = eclaircirImage(image);
        for (int i = 0; i < imageEclaircie.length; i++) {
            System.out.println(Arrays.toString(imageEclaircie[i]));
        }

    }

    public static int[][] eclaircirImage(int[][] image) {
        int[][] copieImage = new int[image.length][image[0].length];
        for (int i = 0; i < copieImage.length; i++) {
            for (int j = 0; j < copieImage[0].length; j++) {
                if (image[i][j] + 30 > 255) {
                    copieImage[i][j] = 255;
                } else {
                    copieImage[i][j] = image[i][j] + 30;
                }
            }
        }
        return copieImage;
    }

    public static float compterPointsBlancs(int[][] image) {
        int res = 0;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == 0)
                    res++;
            }
        }
        System.out.println(image.length * image[0].length);
        return ((float) res / (image.length * image[0].length)) * 100;
    }

    public static int[][] creerImage() {
        System.out.println("Entrez la largeur de l'image");
        int largeur = Terminal.lireInt();
        System.out.println("Entrez la hauteur de l'image");
        int hauteur = Terminal.lireInt();
        int[][] image = new int[hauteur][largeur];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.println("Entrez le niveau de gris de l'image");
                int nvGris = -1;
                try {
                    nvGris = Terminal.lireInt();
                } catch (TerminalException te) {
                    System.out.println("Erreur : le niveau de gris doit être une valeur numérique;");
                }
                if (nvGris < 0 || nvGris > 255)
                    throw new NiveauGrisException();
                image[i][j] = nvGris;
            }
        }
        return image;
    }
}

class NiveauGrisException extends RuntimeException {
    NiveauGrisException() {
        super("Erreur : le niveau de gris doit être une valeur numérique comprise entre 0 et 255.");
    }
};