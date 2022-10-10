# FONCTION FACTORIEL
def factoriel(n):
    facto = 1
    for i in range(2, n+1):
        facto = facto * i
    return facto

# FONCTION SAISIR
def saisir():
    global n
    n = int(input("n="))
    while n < 10 or n > 99:
        n = int(input("n="))

# FONCTION AFFICHER
def afficher():
    print(factoriel(n//10) + factoriel(n%10))

# PROGRAMME PRINCIPAL
saisir()
afficher()
