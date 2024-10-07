 class Demo{
    int x,y;
    Demo(){
        System.out.println("Constructor  1 executed");
    }
    void f1(){
        System.out.println("function 1 executed");
    }
 }
 
 class Construct {
    public static void main(String[] args) {
        Demo d1= new Demo();
        Demo d2= new Demo();
        Demo d3= new Demo();
        

    }
}
