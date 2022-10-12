
class pattern{
static void Pattern(int N){
    //Enter your code here
    for(int i=0;i<N;i++)
    {
        int t =i * 6;
        for(int j=0;j<N;j++)
        {
            int k=j * 4;
            System.out.print(t + k + " " );
        }
        System.out.println();
    }
    }
}