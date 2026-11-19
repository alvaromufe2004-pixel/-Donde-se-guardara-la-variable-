public class Donde_reposanLas_variables {
    public static void main (String[] args){
        //Si tienes String a = "Hola"
        //¿Que pasara si hacemos String b = a?
        //Bien, la forma mas sencilla de comprobar esto es a lo bruto
        String a = "Hola";
        String b = a;
        a = "GTA VI";
        /* Básicamente tengo dos hipótesis. La primera es que al igualar b con a, este pase a referenciar directamente
         al objeto hola.
         La segunda hipótesis es que la variable b referencie a la variable a y esta a su vez referencie lo que le
         corresponde. Por lo que al imprimirla mostraria por pantalla el utlimo valor de a: GTA 6
         */
        System.out.println(b);
        /*Al ejecutarlo vemos por programa que sale un Hola asi,
        que ya sabemos que esta almacenando la ref de dicho objeto*/
    }
}
