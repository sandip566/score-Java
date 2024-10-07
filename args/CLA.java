class CLA{
    public static void main(String []args){

        float s=0;
        for(int i=0; i<args.length;i++){
            s = s+ Float.parseFloat(args[i]);
        }
        System.out.println(s);
        System.out.println("Average is"+ s/args.length);
      
}
    }
