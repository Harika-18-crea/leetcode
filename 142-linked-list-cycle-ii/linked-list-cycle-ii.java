public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f=head,s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f)
            break;
        }
        if(f==null || f.next==null){
            return null;
        }
        while(head!=s){
            head=head.next;
            s=s.next;
        }
        return head;
    }
}