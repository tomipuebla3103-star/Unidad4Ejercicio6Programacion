<img width="565" height="497" alt="image" src="https://github.com/user-attachments/assets/5f81bd11-f4d2-43ab-9f7d-8901871fefb7" />

 Sistema de Exportación de Reportes Financieros

 Descripción

Este proyecto consiste en desarrollar un sistema de exportación de reportes financieros en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo y las interfaces.

El sistema permite exportar un mismo reporte financiero a diferentes formatos digitales, como PDF, Excel y HTML, utilizando una estructura común.

 Objetivo

Implementar un motor de reportes capaz de procesar y exportar información financiera a diferentes formatos sin necesidad de conocer los detalles internos de cada exportador.

Clases utilizadas

Exportable: Interfaz o clase abstracta que declara el método exportar(String contenidoReporte).

ExportadorPDF: Representa el exportador de archivos PDF y define su propio formato de salida.

ExportadorExcel: Representa el exportador de planillas de cálculo Excel y simula su estructura de datos.

ExportadorHTML: Representa el exportador de documentos HTML y aplica sus propias etiquetas y estilos.

MotorReportes: Clase encargada de gestionar una colección de exportadores y procesar los reportes de manera masiva.

Main: Contiene el método principal, instancia los exportadores y demuestra el funcionamiento del sistema.

Conceptos aplicados

Programación Orientada a Objetos (POO).

Polimorfismo.

Interfaces.

Abstracción.

Sobrescritura de métodos (@Override).

Colecciones de objetos.

Desacoplamiento entre clases.

Funcionamiento

Se define la interfaz Exportable con el método exportar().

Se crean las clases ExportadorPDF, ExportadorExcel y ExportadorHTML, cada una con su propia implementación.

La clase MotorReportes recibe y administra una colección de objetos de tipo Exportable.

Se prepara un reporte financiero base con la información que se desea exportar.

Se recorren los diferentes exportadores y se procesa el reporte de manera polimórfica.

Finalmente, se muestran por consola los resultados con el formato correspondiente a cada exportador.

Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

Resultado esperado

Al ejecutar el programa, el motor de reportes podrá procesar un mismo contenido financiero y representarlo en diferentes formatos digitales. Cada exportador aplicará su propia estructura y formato mediante el polimorfismo.
