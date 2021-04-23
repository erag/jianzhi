public class searchin2arr {
    public boolean Find(int target, int [][] array) {
        int l1=array.length;
        if(l1==0){
            return false;
        }
        int l2=array[0].length-1;

        int i=0,j=l2;
        while (i<l1&&j>=0){
            int val=array[i][j];
            if(val==target){
                return true;
            }
            else if(val<target){
                ++i;

            }
            else {
                --j;
            }
        }
        return false;


    }
}
