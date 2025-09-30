class CommandLine2{
public static void main(String args[]){
System.out.println("Enter Number of arguments:"+args.length);
if(args.length<=0){
System.out.println("Error: Pass minimum one parameter");
}
else{
    int sum=0;
for(int i=0; i<args.length;i++){
    sum=sum+Integer.parseInt(args[i]);
}
System.out.println("Sum: "+sum);
}
}
}
