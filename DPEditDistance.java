   //Edit Distance: https://www.youtube.com/watch?v=MiqoA-yF-0M
   //Find the Minimum Edit Distance of two strings
   //Dynamic Programming- using a 2D matrix
   //Time Complexity: O(m*n) m,n = length of strings
   // Leet Code: 72 Edit Distance
 
   class DPEditDistance {
	public static void main(String[] args){
		String str1 = "horse", str2 = "ros";
		System.out.println(str1 +" "+ str2 + ": " + minDistance(str1, str2));
	}

       public static int minDistance(String word1, String word2) {
           char[] arr1 = word1.toCharArray();
           char[] arr2 = word2.toCharArray();
           int row = arr1.length + 1;
           int column = arr2.length + 1;
   
          int[][] distance = new int[row][column];
          for(int i = 0; i < row; i++){
              distance[i][0] = i;
          }
          for(int i = 1; i < column; i++){
             distance[0][i] = i;
          }
  
          for(int i = 1; i < row; i++){
              for(int j = 1; j < column; j++){
                  if(arr1[i-1] == arr2[j-1]){
		      //if match, use the diagonal value
                      distance[i][j] = distance[i-1][j-1];
                  }else{
		      //if does not match, use minimum of three neighbors plus 1
                      int min = getMinimum(distance[i-1][j], distance[i][j-1], distance[i-1][j-1]);
                      distance[i][j] = min + 1;
                  }
              }
          }
  
          return distance[row-1][column-1];
      }
  
      public static int getMinimum(int a, int b, int c){
          if(a < b && a < c){
              return a;
          }else if(b < a && b < c){
              return b;
          }else{
              return c;
          }
      }
  }

