package leetcode.first;
/**
 * 
 * created on 2017年3月30日 
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * @author  megagao
 * @version  0.0.1
 */
public class FindKthToTail {
	public ListNode1 findKthToTail(ListNode1 head,int k) {
		if(head == null || k<1){ //注意判断空指针和非法k
            return null;
        }
        ListNode1 pre = head;
        ListNode1 follow = head;
        for(int i=0;i<k-1;i++){
            if(pre.next != null){ //注意判断k大于链表长度的情况
                pre = pre.next;
            }else{
                return null;
            }
        }
        while(pre.next != null){
            pre = pre.next;
            follow = follow.next;
        }
        return follow;
    }
}

class ListNode1{
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}