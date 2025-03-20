package TDA_Pila.src;
import java.util.Stack;



class Pila<T> {
    private Stack<T> elementos = new Stack<>();
    private Stack<T> deshechos = new Stack<>();

    public void apilar(T elemento) {
        elementos.push(elemento);
        deshechos.clear();
    }

    public void deshacer(){

        if (!elementos.isEmpty()){
            deshechos.push(elementos.pop());
        } else{
            System.out.println("No hay elementos para deshacer");
        }
    }
    
    public void rehacer (){
        if (!deshechos.isEmpty()){
            elementos.push(deshechos.pop());
        }else{
            System.out.println("No hay elementos para rehacer");
        }
    }

    public void mostrar(){
        if (elementos.isEmpty()){
            System.out.println("No hay elementos para mostrar");
        }else {
            for (T elemento : elementos){
                System.out.println(elemento);
            }
        }
    }
    

}