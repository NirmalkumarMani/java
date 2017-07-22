class matrix
{
    public static void main(String args[])
    {
        int[][] arr=new int[5][5];
        int i,j,k=0;
        for(i=0;i<arr.length;i++)
        for(j=0;j<arr.length;j++){
        arr[i][j]=k;
        k++;
        }
        for(i=0;i<arr.length;i++)
        {
        for(j=0;j<arr.length;j++)

        
        System.out.println(arr[i][j] + "  ");}
        System.out.println();
        
    }
}