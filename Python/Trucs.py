print("== OPERATIONS SUR CHAINES ==")
name = "BAC SC 2023"
"-- Afficher dernier caractère --"
print(name[-2] + name[-1])
"-- Afficher longueur de chaine --"
print(len(name))
"-- Supprimer chiffre d'unité --"
test = "abcdefgh"
test = test[0:-1]
print(test)
"-- Afficher position d'une sous_chaine --"
chaine = "Je suis Jihed Kdiss"
sous_chaine = "Jihed"
print(chaine.find(sous_chaine))
"-- Convertir en majuscule --"
minus = "123minuscule"
print(minus.upper())
