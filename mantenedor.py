from funciones import *

def mantenedor(menu= int):
    print("*******************************************\n*           MANTENEDOR USUARIOS           *\n*******************************************\n\n")

menu= ("Agregar usuario", "Editar usuario","Eliminar usuario","Buscar usuario", "Volver")
contador= 0

# Recorremos el menu #
for i in menu:
    contador +=1
    print(f"[{contador}]- {i}")

# Menu mantenedor #
while  True:
    opcion= int(input("Ingrese un numero del menu: "))

    if opcion == 1:
        nombre= str(input("Ingrese el nuevo nombre: "))
        email= str(input("Ingrese el correo: "))
        fecha= str(input("Ingrese la fecha de hoy: "))
        agregar_usuario(nombre,email,fecha)
    elif opcion == 2:
        usuario_id= int(input("ingrese el ID del usuario que desea editar: "))
        nombre= str(input("Ingrese el nuevo nombre: "))
        email= str(input("Ingrese el correo: "))
        fecha= str(input("Ingrese la fecha de hoy: "))
        editar_usuario(usuario_id, nombre, email, fecha)
    elif opcion == 3:
        usuario_id= int(input("ingrese el ID del usuario que desea eliminar: "))
        eliminar_usuario(usuario_id)
    elif opcion == 4:
        lista_usuario()
    else:
        print("Volviendo...")
        break