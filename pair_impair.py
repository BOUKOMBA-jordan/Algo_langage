nombre = input("Veillez saisie un nombre: ")
reste = int(nombre)%2
if reste == 0:
    print("Le nombre "+ nombre + " est pair.")
else:
    print("Le nombre "+ nombre + " est impair.")