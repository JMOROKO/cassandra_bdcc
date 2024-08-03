## Cassandra
# Docker
<img src="assets/1.png" /> <br>
# Application.properties
<img src="assets/2.png" /> <br>
# Docker-compose
<img src="assets/3.png" /> <br>
# Entities
<img src="assets/dd.png" /> <br>
# Repositories
<img src="assets/55.png" /> <br>
# Service
<img src="assets/66.png" /> <br>
# Postman
<img src="assets/77.png" /> <br>
<img src="assets/88.png" /> <br>
<img src="assets/99.png" /> <br>
<img src="assets/10.png" /> <br>
<img src="assets/11.png" /> <br>
## Informations utiles
1- il faut d'abord installer docker desktop <br>
2- il faut créer le fichier docker-compose.yaml et inscrire la configuration relatif à cassandra <br>
3- Il faut ouvrir le fichier de ligne de commande dans le repertoire ou se trouve le fichier docker-compose.yaml <br>
4- Il faut lancer la commande docker-compose up -d cela aura pour effet d'installer l'image de cassandra si elle n'est pas encore téléchargé et lancer le container <br>
5- il faut saisir docker ps en ligne de commande pour afficher les différentes instances<br>
6- copier l'identifiant relatif à cassandra<br>
7- Toujours en ligne de commande il faut saisir docker exec -it 89ca74fa914a cqlsh<br>