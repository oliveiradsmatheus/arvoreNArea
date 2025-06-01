public class Main {
    public static void main(String[] args) {
        NArea arv = new NArea();

        for (int i = 1; i <= 10000 ; i++)
            arv.inserir(i);

        arv.emOrdem();
    }
}