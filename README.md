# TimestampClient
Servicio REST con Springboot para probar la conexión entre contenedores de docker.

Desarrolladores: 
  
	David Camacho
	Diego Sánchez
	Felipe Grisales
	Marcela Vaquiro
	Michael Rondón

Requisitos ejecución:

  - Requere java 8

Requisitos de instalación:

  - Maven https://maven.apache.org/install.html

Uso con Docker: (Si se tiene instalado Docker y Maven)

  - Descargar el repositorio.
  - Descomprimir el contenido.
  - Ejecutar el archivo Ejecutar.bat

Prueba:
  - Ejecutar el comando 
  <code>docker run -p 4001:8080 timestamp-client</code>
  - Mediante un navegador WEB ingresar a la ruta: http://DOCKER_HOST:4001/swagger-ui.html

Uso de Docker Link: (Requiere que el contenedor TimeStampTest: https://github.com/MichaelRondon/TimeStampTest)
  - Ejecutar el archivo EjecutarLink.bat
  - Utilizar una herramienta para consumir servicios REST con los siguientes parámetros:
  
	-- Método GET
	
	-- Endpoint http://DOCKER_HOST:4001/api/timestamp-client
	
	-- Header con cualquiera de los siguientes valores: {"Accept":"application/json"} ó {"Accept":"application/xml"} ó {"Accept":"text/plain"} ó {"Accept":"text/html"}

    
