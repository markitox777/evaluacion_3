import json

def agregar_usuario(nombre:str, email: str, fecha: int):
    with open("biblioteca.json", mode="r") as agregarJson:
        leerJson= json.load(agregarJson)
        usuario_nuevo= {
            "UsuarioID": len(leerJson["Usuario"])+1,
            "Nombre": nombre,
            "Email": email,
            "FechaRegistro": fecha
        }
        leerJson["Usuario"].append(usuario_nuevo)
    with open("biblioteca.json", mode="w") as agregarJson:
        json.dump(leerJson,agregarJson, indent= 6)
        print("Se agrego correctamente el nuevo usuario")

def editar_usuario(usuario_id: int, nombre:str, email: str, fecha: float):
    with open("biblioteca.json", mode="r") as editarJson:
        leerJson= json.load(editarJson)
        usuario_encontrado= False
        for usuario in leerJson["Usuario"]:
            if usuario["UsuarioID"] ==usuario_id:
                usuario["Nombre"]= nombre
                usuario["Email"]= email
                usuario["FechaRegistro"]= fecha
                usuario_encontrado= True
                break
            if not usuario_encontrado:
                print(f"No se ha encontrado el usuario con el I{usuario_id}")
            else:
                with open("biblioteca.json", mode="w") as editarJson:
                    json.dump(leerJson,editarJson, indent=6)
                print("Se edito el usuario correctamente")


def eliminar_usuario(usuario_id:int):
    with open("biblioteca.json", mode="r") as eliminarJson:
        leerJson= json.load(eliminarJson)
        clienteEncontrado= False
        for i, usuario in enumerate(leerJson["Usuario"]):
            if usuario["UsuarioID"] == usuario_id:
                leerJson["Usuario"].pop(i)
                clienteEncontrado = True
                break
        if not clienteEncontrado:
            print("El usuario no se ha encontrado")
        else:
            # Recorremos el json, #
            for j in range(i,len(leerJson["Usuario"])):
                leerJson["Usuario"][j]["UsuarioID"] -= 1

            with open("biblioteca.json", mode="w") as eliminarJson:
                json.dump(leerJson,eliminarJson, indent=6)
                print("Usuario eliminado exitosamente")

        
def lista_usuario():
    with open("biblioteca.json", mode="r") as buscarJson:
        leerJson= json.load(buscarJson)
        print(leerJson["Usuario"])