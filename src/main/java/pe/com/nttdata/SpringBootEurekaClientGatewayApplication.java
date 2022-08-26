/**
 * Resumen.
 * Objeto                   : SpringBootEurekaClientGatewayApplication.java
 * Descripción              : Clase para iniciar el gateway.
 * Fecha de Creación        : 08/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              17/08/2022        Mario Vásquez           Realizar la creación de un método nuevo.
 */

package pe.com.nttdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Clase para iniciar el gateway.
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringBootEurekaClientGatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootEurekaClientGatewayApplication.class, args);
	}

}
