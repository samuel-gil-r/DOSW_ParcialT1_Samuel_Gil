# DOSW_ParcialT1_Samuel_Gil
## Samuel Antonio Gil Romero
## DOSW-2
## Herramientas de modelado
![Draw.io](docs/images/drawio.png)

## Herramienta de diseño
![Figma](docs/images/figma.png)
## punto 1 digrama de contexto 
![img_1.png](docs/images/img_1.png)

## punto 2 Patrones de diseño que eligire para el ejercicio ECI PAYMENT INTEGRATION HUB
-Implementare Adapter
- un patron Estructural
- justificacion : tengo 4 proveedores que se comunican de manera distinta esto me lleva a elegirlo "Cada proveedor expone la información de forma distinta"

- implementare Abstract Factory (creacional)
- el crea familias relacionadas de objetos 

## punto 3 

# Funcionales
-procesar el pago con proveedor adecuado  
-validar solicitudes antes de procesarlas  
-unificar respuestas de proveedores

# NOFUNCIONALES
-Rendimiento  
-paleta de colores usabilidad o identidad 

## punto 4 
diagrama de casos de uso
![img_1.png](docs/images/img_1.png)
![img_1.png](docs/images/img_1.png)
historia de usuario 
RF1: procesar pago 
como usuario estudiantil  
quiero realizar un pago de un servicio institucional usando mi medio de pago preferido  
para completar mi tramite de forma rapida sin importar qle proveedor 

RF2 : Validar solicitud 
como sistema de pagos Institucional  
quiero validar los datos de cada solicitud antes del proceso  
para rechazar las solicitudes invalidas 

##punto #5

## punto 7 
![img.png](img.png)
Single responsability
cada clase tendra que tener unas sola responsabilidad 
open/close 
si en otro momento llega a aparecer otro proveedor se va a poder extender sin necesidad de cambiar  


