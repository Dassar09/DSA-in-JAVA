public class Solution {
    public int repeatedNumber(final List<Integer> A) {
        int slow=A.get(0);
        int fast=A.get(0);
        do{
            slow=A.get(slow);
            fast=A.get(A.get(fast));
        }while(slow!=fast);
        
        fast=A.get(0);
        while(slow!=fast){
            slow=A.get(slow);
            fast=A.get(fast);
        }
        return slow;
    }
}
