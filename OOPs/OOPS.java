public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();          // constructure. special function
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setColor("Yello");

        p1.setTip (5);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());

    }

}
class Pen {
    private String color;
    private int tip;

    String getColor (){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor (String newColor){
        color = newColor;
    }

    void setTip (int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage (int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }
}