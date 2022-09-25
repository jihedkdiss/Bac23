print("== INVERSER UN ENTIER N ==")
"-- Méthode Arithmétique --"
value = input("Entrer n: ")
n = int(value)
n1 = n % 10
n2 = int(n / 10) % 10
n3 = int(n / 100)
n_inversé = n1 * 100 + n2 * 10 + n3
print(n_inversé)
"-- Méthode Chaine de Caractères --"
print(value[2] + value[1] + value[0])
