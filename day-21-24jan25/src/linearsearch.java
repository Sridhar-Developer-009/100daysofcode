import java.util.ArrayList;

public class linearsearch {

        public static void main(String[] args) {

            int arr[]={9,2,3,3,7,5};
            int target=3;
           // System.out.println(search(arr,0,target));

            ArrayList<Integer> ans=searchhlistt(arr,0,target,new ArrayList<>());
            System.out.println(ans);
        }
        static int search(int[] arr,int index,int target){
            //base condition
            if(index==arr.length-1){
                return -1;
            }
            if(arr[index]==target){
                return index;
            }
            else return search(arr,index+1,target);
        }
 static ArrayList<Integer> list = new ArrayList();//this list will store indices of multiple occcurences;
    static int searchhlist(int[] arr,int index,int target){
        //base condition
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            list.add(index);
        }
         return searchhlist(arr,index+1,target);
    }

    static ArrayList searchhlistt(int[] arr,int index,int target,ArrayList<Integer> list){
        //base condition
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return searchhlistt(arr,index+1,target,list);
    }

    //different approach returning thelist without passing the arrraylist
    static ArrayList ssearchhlistt(int[] arr,int index,int target){
        ArrayList<Integer> list=new ArrayList<>();
        //base condition
        if(index==arr.length-1){
            return list;
        }
        //this will contain ans for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelow=ssearchhlistt(arr,index+1,target);
                list.addAll(ansfrombelow);
        return list;
    }


}
