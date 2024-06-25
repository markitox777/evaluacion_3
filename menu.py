
import os
print("*******************************************\n*             MUNDO LIBRO                 *\n*******************************************\n\n\n")

menu= ("Mantenedor de usuario", "Reportes", "Salir")
contador= 0

# Recorremos el menu #
for i in menu:
    contador +=1
    print(f"[{contador}]- {i}")

while True:

    opcion= int(input("Ingrese el numero del menu: "))
    if opcion== 1:
        from mantenedor import *
        mantenedor()
    elif opcion == 2:
        print (f"*******************************************\n*   Categoria    -   Cantidad de libros *\n*******************************************\n    Ficcion\t\t\t1\n    Realismo Magico\t\t0\n    Poesia\t\t\t10\n    Ciencia Ficcion\t\t5")
        os.system(5)
        