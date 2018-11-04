class ListNode {
    int val;
    ListNode next = null;
    ListNode(){}
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null && list2 == null)
            return null;
        ListNode head = new ListNode();
        ListNode head1 = head;
        while(list1!=null || list2!=null){
            int l = 0;
            if(list1 == null)
            {
                l = list2.val;
                list2 = list2.next;
            }
            else if(list2 == null) {
                l = list1.val;
                list1 = list1.next;
            }
            else{
                if(list1.val <= list2.val){
                     l = list1.val;
                   list1 = list1.next;
                }
                else{
                    l = list2.val;
                   list2 = list2.next;
                }
                
            }
            head.next = new ListNode(l);
            head = head.next;
        }
        return head1.next;
    }
}
public class MyClass{
    public static void main(String[] args){
        ListNode head0 = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        head0.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        ListNode lead0 = new ListNode(2);
        ListNode lead1 = new ListNode(3);
        ListNode lead2 = new ListNode(4);
        ListNode lead3 = new ListNode(5);
        ListNode lead4 = new ListNode(7);
        lead0.next = lead1;
        lead1.next = lead2;
        lead2.next = lead3;
        lead3.next = lead4;
    
    Solution so = new Solution();
    ListNode list  = so.Merge(head0,lead0);
        while(list!=null){
            System.out.println(list.val);
            list = list.next;
        }
    }
}
