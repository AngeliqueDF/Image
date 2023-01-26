import java.util.Arrays;

public class Image {
    public static void main(String[] args) {
        int[][] image = creerImage();
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
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
