public class Corredor implements Runnable{
    private static double distanciaTotalDaCorrida = 200;
    private double distanciaTotalPercorrida = 0;
    private Thread threadPrincipal;
    public Corredor (Thread threadPrincipal) {
        this.threadPrincipal = threadPrincipal;
    }

    public void run(){
        try {
            threadPrincipal.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Enquanto o corredor não tiver terminado
        while (distanciaTotalPercorrida < distanciaTotalDaCorrida){

            //Correr um valor aleatório entre 0 e 50
            distanciaTotalPercorrida += Math.random()*50;

            //Exibir a informação de que o corredor atual já correu tantos metros
            System.out.printf("%s: %.2fm\n", Thread.currentThread().getName(), distanciaTotalPercorrida);
            
            //Dormir um quantidade aleatória de milissegundos (2 a 5)
            try {
                Thread.sleep(2000 + (int)(Math.random()* 3000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Quando terminar, o corredor exibe seu nome dizendo que terminou
        System.out.printf("%s terminou...\n", Thread.currentThread().getName());

    }
}
