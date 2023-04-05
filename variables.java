class variables
{
    public static void main(String[] args) {
        int a = 10, b=10, c=40;
        if(a>b){
            if(a>c){
                System.out.println(a+ " a is greater number.");
            }
            else{
                System.out.println(c+ " c is greater number.");
            }
        }
        else{
            if(b>c){
                System.out.println(b+ " b is greater number. ");
            }
            else{
                System.out.println(c+ " c is greater number.");
            }
        }
        
    }
}