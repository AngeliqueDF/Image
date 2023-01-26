# Question 2

On peut représenter une image en couleur en donnant pour chaque point un niveau d’intensité pour une des couleurs fondamentales : rouge, vert et bleu. Ce niveau sera de 0 pour pas du tout de cette couleur, 255 pour le maximum de la couleur. On obtiendra les différentes nuances par mélange de couleur (par exemple, du rouge et du vert pour le jaune). Comment peut-on représenter une image en couleur dans une variable Java en n’utilisant que des constructions Java vues dans le cours NFA001 ? On demande une explication en 5 lignes maximum.

Avec un tableau à trois dimensions. Le nombre d'éléments du premier tableau est la hauteur de l'image. Les tableaux qu'il contient représentent chacun un point de l'image. Enfin, la couleur de chaque point de l'image est indiquée par un tableau à trois valeurs numériques entre 0 et 255 qui indiquent le niveau de chaque couleur : le rouge, le vert et le bleu.
