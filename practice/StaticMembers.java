class A{
    int x;
    private static int y;

  void fun1(){
    y=22;
  }

  void fun2(){
    System.out.println(y);
  }
}


class StaticMembers{
    public static void main(String []args){
        
        System.out.println("Static Members");
        A a1=new A();
         a1.fun1();
         a1.fun2();
    }
}