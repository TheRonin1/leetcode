/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid =getmid(head);
        ListNode left=sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }
    ListNode merge(ListNode list1,ListNode list2){
        ListNode temp= new ListNode();
        ListNode tail=temp;
        while(list1!=null&& list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                tail=tail.next;
                list1=list1.next;
            }else{
                tail.next=list2;
                tail=tail.next;
                list2=list2.next;
            }
            
            
        }
        if(list1!=null){
                tail.next=list1;
            }
        if(list2!=null){
            tail.next=list2;
        }
        return temp.next;
    }
    ListNode getmid(ListNode head){
        ListNode s=head;
        ListNode f=head;
        ListNode prev=null;
        while(f!=null && f.next!=null){
            prev=s;
            s=s.next;
            f= f.next.next;
        }
        prev.next = null;
        return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna