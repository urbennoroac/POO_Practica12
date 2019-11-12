class AppHilos{
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");
        //Instanciar un objeto Hilo con parametro "#1".
        Hilo h=new Hilo("1:");
        //Construir un hilo de ese objeto.
        Thread nuevoHilo=new Thread(h);
        //Comienzar la ejecución del hilo.
        nuevoHilo.start();
        for (int i=0; i<50;i++){
            System.out.print(" .");
        }try{
            Thread.sleep(100);
        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }
}
