<p align="center">
    <img src="https://github.com/GeeksHubsAcademy/2020-geekshubs-media/blob/master/image/logo.png" >	
</p>

    Considere el siguiente problema:

    Escriba un programa corto que permita obtener las letras de los elementos en posición par del array 
	y devuelva una string con la unión de los mismos
    
     N = 4 
    
         ['h', 'o', 'l', 'a', '!']
	i =    0    1    2    3    4

     Resultado
	 
         "hl!"

    
    En caso de que el array tenga un 'size' par, debe de contarse la última posición.
	En caso de que el array sea nulo, el resultado debe de devolver "nulo". 
	En caso de que el array sea vacío, el resultado debe de devolver "vacio". 
	El array no contiene valores nulos ni números, solamente letras.   
    
    Se atiente al siguiente ejemplo:
   
   	    N = 1        N = 2              N = 3                N = 4               
      
        ['h']        ['f', 'o']         ['f', 'o', 'o']      ['g', 'e', 'e', 'k']          
                 
    Resultado:
 	
	    "h"	 	 "fo"	   	    "foo"            	  "gek"        	              
                                  

    En la carpeta 'src/main/java/es/geekshubs/academy/Union.java' se encuentra el fichero con la 
    definición de nuestro método vacío.
    En la carpeta 'src/test/java/es/geekshubs/academy/UnionTest.java' se encuentra el fichero con la suite de test.
    
    El modus operandi de trabajo es el siguiente:
    
    Debes 'forkear' el proyecto a tu cuenta.
    Puedes hacer PR's ilimitadas e ir validando poco a poco la solución contra nuestro respositorio con CI.
    Puedes trabajar en local y subir la solución haciendo un PR a nuestro repositorio.
    Cuando se envíe la PR final, debes indicar el tiempo de dedicación y los intentos que has hecho.
    También puedes añadir un comentario para dar cualquier tipo de feedback.
    
    En caso de duda, revisa en el apartado de 'Referencias'.

    Tests run: 28, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  6.857 s
    [INFO] Finished at: 2021-05-07T15:29:17+02:00
    [INFO] ------------------------------------------------------------------------
    Process finished with exit code 0



## Referencias

* [Tutorial - Testing Automatizado](https://github.com/GeeksHubsAcademy/2020-js-vanilla-testing-FFFF/blob/master/README.md)
