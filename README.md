# CustomListViewAdapter

Ejemplo de ListView con adaptador personalizado. La interfaz de cada elemento de la lista está compuesta por:
- 2 LinearLayouts para organizar contenidos
- 1 ImageView para la foto del héroe o heroina
- 2 TextView para el nombre y edad del héroe o heroina

El ListView se ha diseñado para que permita selección simple de sus elementos. Además cada elemento del mismo recibe el evento clic que servirá para:
- Seleccionar el elemento cambiando su color de fondo
- Animar la imagen del superhéroe seleccionado.

El modelo de datos de la lista está basado en el POJO constituido por la clase Heroe.

A continuación se muestra el diseño de las interfaces de la aplicación:

![Interfaz principal](https://raw.githubusercontent.com/pmdmdam2/CustomListViewAdapter/master/app/src/main/assets/clvw1.png)

![Interfaz de los item de la lista](https://raw.githubusercontent.com/pmdmdam2/CustomListViewAdapter/master/app/src/main/assets/clvw2.png)

A continuación se muetra una captura de la aplicación en ejecución:

![Aplicación en ejecución](https://raw.githubusercontent.com/pmdmdam2/CustomListViewAdapter/master/app/src/main/assets/clvw3.png)
