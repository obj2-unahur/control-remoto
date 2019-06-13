# Domótica

Se está diseñando una aplicación para domótica ([domótica](https://es.wikipedia.org/wiki/Dom%C3%B3tica)) para la cual se cuenta con un conjunto de clases que operan distintos tipos de productos electrónicos de la casa:

* Luz de techo
* Luz de jardin
* Luz exterior
* Television
* Ventilador de techo
* Puerta de garage
* Stereo

Por otro lado tenemos una clase que modela el control remoto que contiene 10 slots disponibles con 2 botones cada uno, `on` y `off`. Cada slot es configurable y se le puede asignar cualquier dispotivo.

Las clases que controlar los dispositivos electronicos ya estan provistas.

Se solicita completar la clases `ControlRemoto`de forma tal que nos permita operar los distintos dispositivos desde el control remoto (prenderlos y apagarlos) y que la asignación de slots sea dinámica, es decir, pueda intercambiar de slots los dispositivos sin necesidad de modificar el código.
