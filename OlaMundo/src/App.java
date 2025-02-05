public class App {
    public static void main(String[] args) throws Exception {
        OlaMundo olaMatheus = new OlaMundo("Matheus");
        OlaMundo olaMarco = new OlaMundo("Marco");
        olaMatheus.printText();
        olaMatheus.boasVindas();
        olaMarco.boasVindas();
    }
}
