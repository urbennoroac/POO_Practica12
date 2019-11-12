 class Hilo implements Runnable {
    String nombreHilo;
    Hilo(String nombre){
        nombreHilo=nombre;
    }
    // ejecucion de hilos
    public void run(){
        System.out.println("Inicio: "+nombreHilo);
        try {
            for (int contar=0; contar<10; contar++){
                Thread.sleep(400);
                System.out.println("En "+nombreHilo+", cuenta "+contar);
            }
        }catch (InterruptedException exc){
            System.out.println(nombreHilo + "Interrumpido.");
        }
        System.out.println("Terminando "+nombreHilo);
    }
}
