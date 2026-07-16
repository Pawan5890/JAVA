import java.util.Stack;

public class Dsa {
    public static void main(String[] args) {
        int[] arr ={5,7,6,12,3,1,2,11};
        //Normal approach

       //int min = arr[0];
       //for(int i=1;i<arr.length;i++){
            //if(arr[i]<min){
                //min = arr[i];
            //}
        //}
        //System.out.println("Minimum element in the array is: " + min);
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<arr.length;i++){
          if(st.isEmpty() ||arr[i]<st.peek()){
            st.push(arr[i]);
          }
        }
        System.out.println("Minimum element in the array is: " + st.peek());
    }
}
