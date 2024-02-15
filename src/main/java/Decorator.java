import javax.swing.*;

abstract class Decorator {

    void decorate(){
        System.out.println("Decorating the office");
    }

}

class Painter extends Decorator {

    void decorate(String room){
        System.out.println("Painting " + room);
    }
}

class DecorateMain {
    public static void main(String[] args){
        Painter painter = new Painter();
        painter.decorate();
    }
}
