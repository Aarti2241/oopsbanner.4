class uc5 { 
    public static void main(String[] args) {
    String names; 
    if(args.length ==0){
        names = "world";
    
    }
    else{
        names=String.join(",", args);
    }
    System.out.println("Hello, " + names + "!");
}
}