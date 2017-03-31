package leetcode.first;
/**
 * 
 * created on 2017年3月31日 
 *
 * 合并两个排序的链表
 *
 * @author  megagao
 * @version  0.0.1
 */
public class Merge {
	//递归
	public ListNode3 merge1(ListNode3 list1,ListNode3 list2) {
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		if(list1.val <= list2.val){
			list1.next = merge1(list1.next, list2);
			return list1;
		}else{
			list2.next = merge1(list1, list2.next);
			return list2;
		}
	}
	
	//非递归
	public ListNode3 merge2(ListNode3 list1,ListNode3 list2) {
		if(list1 == null){
			return list2;
		}
		if(list2 == null){
			return list1;
		}
		ListNode3 mergeHead = null;
		ListNode3 current = null;
		while(list1!=null && list2!=null){
			if(list1.val <= list2.val){
				if(mergeHead == null){
				mergeHead = current = list1; //对象赋值，引用传递，current.next改变，mergeHead.next也会改变
				}else{
					current.next = list1;
					current = current.next;
				}
				list1 = list1.next;
			}else{
				if(mergeHead == null){
					mergeHead = current = list2;
				}else{
					current.next = list2;
					current = current.next;
				}
				list2 = list2.next;
			}
		}
		if(list1 == null){
			current.next = list2;
		}else{
			current.next = list1;
		}
		return mergeHead;
	}
}

class ListNode3{
    int val;
    ListNode3 next = null;

    ListNode3(int val) {
        this.val = val;
    }
}