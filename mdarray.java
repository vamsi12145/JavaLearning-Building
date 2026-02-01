public class mdarray {
    
    public static void main(String[] args){
        int nums[][]=new int[3][5];

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                nums[i][j]=(int)(Math.random()*100);
                System.out.print(nums[i][j]+" ");

            }
    }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(nums[i][j]+" ");

            }
            System.out.println();
    }
}
}
