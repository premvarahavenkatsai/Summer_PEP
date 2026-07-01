public class Pattern_matrix{
 public static void main(String[] args){
      int[][] matrix = {
         {6,11,4,10},
         {13,1,15,2},
         {8,12,5,14},
         {3,16,9,7}
      };
      int index = 0;
      int top = 0;
      int left = 0;
      int[] arr = new int[(matrix.length * matrix[0].length) - 2];
      int bottom = matrix.length - 1;
      int right = matrix[0].length - 1;
      while(left <= right){
         for(int i=top;i<bottom;i++){
            arr[index++] = matrix[i][left];
         } 
         left++;
         for(int i=bottom;i>=top;i--){
            arr[index++] = matrix[i][left];
         }
         left++;
      }
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
   }
}