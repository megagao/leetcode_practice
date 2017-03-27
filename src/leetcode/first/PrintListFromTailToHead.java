package leetcode.first;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * created on 2017年3月26日 
 *
 * 从尾到头打印链表值
 *
 * @author  megagao
 * @version  0.0.1
 */
class ListNode { 
	int val; 
	ListNode next = null; 
	ListNode(int val){
	this.val = val;
	} 
} 

public class PrintListFromTailToHead {

	//方法一：借助堆栈的“后进先出”实现 
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) { 
		Stack<Integer> stack= new Stack<Integer>(); 
		while(listNode!=null){
			stack.push(listNode.val); 
		    listNode=listNode.next;
		}
		ArrayList<Integer> list=new ArrayList<Integer>(); 
		while(!stack.isEmpty()){ 
			list.add(stack.pop());  
		} 
		return list; 
	} 

	//方法二：借助递归实现（递归的本质还是使用了堆栈结构） 
	public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) { 
		ArrayList<Integer> list=new ArrayList<Integer>(); 
		ListNode pNode=listNode; 
		if(pNode!=null){ 
			if(pNode.next!=null){ 
				list=printListFromTailToHead(pNode.next);
			} 
			list.add(pNode.val); 
		}
		return list;
	} 
}
