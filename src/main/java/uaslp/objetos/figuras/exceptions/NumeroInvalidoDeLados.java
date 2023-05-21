package uaslp.objetos.figuras.exceptions;

public class NumeroInvalidoDeLados extends Exception{
    private String message;
    public NumeroInvalidoDeLados(String message){
        super(message);
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
    public NumeroInvalidoDeLados(){}
}
