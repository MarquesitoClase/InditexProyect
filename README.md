En este proyecto para la prueba de developer de back de Inditex, seguí los siguientes pasos:
1. Partí de la información de similarProducts.yaml con OpenApi, para generar el esqueleto de la app servidor. Para esto utilicé Swagger.codegen.
2. Desde swagger, con la información de existingApis.yaml, generé el cliente.
3. Usé el cliente para acceder a la api existente, y adapté la respuesta.

  Testeo:
1. Arranqué el servidor recibido desde Docker en el puerto 3001
2. Levanté la aplicación del puerto 5000
3. Probe a lanzar peticiones contra esta
