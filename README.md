# FacebootClient

Proyecto final "Faceboot" de arquitectura de software en el ITSON, semestre 5 agosto-diciembre 2021.

Este proyecto es el cliente MVC desarrollado en Java, depende de [FacebootNet](https://github.com/ArquitecturaSWITSON082021/FacebootNet) para funcionar.

# Reglas

1) Favor de trabajar en un fork personal, **no se aceptarán pull requests directos a la rama master.** Utilizar la rama **dev** para cambios incrementales.
2) **MANTENER TODO EL CÓDIGO EN INGLÉS.**
3) Utilizar **PascalCase** (ejemplo: MiVariable) en variables públicas y funciones públicas.
4) Utilizar **camelCase** (ejemplo: miVariable) en variables privadas y funciones privadas.
5) TODAS las clases utilizaran **PascalCase** en sus nombres (ejemplo: MiClase).

# Instrucciones para comenzar a trabajar

1) Comienza haciendo **fork** del repositorio oficial. Esto lo haces haciendo clic en el botón de "fork" que aparece arriba.
2) Una vez que hayas hecho el fork, lo vas a clonar con el siguiente comando:
```
git clone -b dev https://github.com/TU_NOMBRE_DE_USUARIO_EN_GIT_REMPLAZAR/FacebootClient.git
```
Donde **TU_NOMBRE_DE_USUARIO_EN_GIT_REMPLAZAR** es tu nombre de usuario en GitHub, en mi caso es **BrayanIribe**.

3) Ahora clonarás la biblioteca actual de [FacebootNet](https://github.com/ArquitecturaSWITSON082021/FacebootNet) necesaria para hacer funcionar el cliente, con el siguiente comando:
```
git clone https://github.com/ArquitecturaSWITSON082021/FacebootNet.git
```
4) Abre el proyecto de **FacebootClient** en Netbeans.
5) Abrirás el proyecto de **FacebootNet** en Netbeans, lo compilarás y el JAR producido lo enlazarás al proyecto de **FacebootClient** que clonaste anteriormente (esto dentro de FacebootClient > Libraries > Add JAR).

<img src="https://user-images.githubusercontent.com/520683/138584313-3b71cb8a-b795-4c01-97d6-a85d50a2e52a.png" alt="jar library" />

6) Ya puedes trabajar en **FacebootClient**.

# Para subir tu trabajo hecho

1) Abrirás la terminal en la raíz del proyecto.
2) Vas a **agregar** todos los cambios hechos con el siguiente comando:
```
git add .
```
3) Luego vas hacer **commit**, mensajes **concisos y breves de preferencia.** Con el siguiente comando:
```
git commit -m "Agregado view de cuentas asociadas, modificado componentes de cajas de texto..."
```
4) Vas a **empujar** a tu fork personal, con el siguiente comando:
```
git push origin dev
```
5) Una vez hecho el **push**, harás un **pull request** en tu fork personal. Esto lo haces yendo a tu fork, y sigues la siguiente secuencia:

<img src="https://user-images.githubusercontent.com/520683/138584494-7b301f13-e5b6-4d79-9d91-4e6994fcc770.png" alt="PR">

6) Sigues los pasos del asistente del pull request, si hay conflictos yo (BrayanIribe) los voy a solucionar.

# Estructura

-- **FacebootClient:** Proyecto en Netbeans, con todo el código de cliente.
-- **uml:** Contiene los diagramas UML, para renderizar es necesario utilizar PlantUML.