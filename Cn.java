public class Cn {
    public static void main(String[] args) {

        int data=1101;
        int m=countDig(data);
        int count=calculate(m);
        int size=m+count;
        redundancy(size,data);
        
    }

    public static int calculate(int p){
        for(int i=2;i<p;i++){
            if(Math.pow(2,i)>=p+(i+1)){
                return i;
            }
        }
    return 1;}

    public static int countDig(int n)  
{  
int count = 0;  
while(n != 0)  
{  
// removing the last digit of the number n  
n = n / 10;  
// increasing count by 1  
count = count + 1;  
}  
return count;  
}  


public static int redundancy(int size,int data){
    int arr[]=new int[size];


}
}
