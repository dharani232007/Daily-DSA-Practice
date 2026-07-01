package Stack.Day13;

import LinkedList.Day12.MergeTwoSortedList.ListNode;

public class IntersectionTwoLinkedList {

    public  ListNode findIntersectionPoint(ListNode LongestNode , ListNode ShortestNode , int difference){
        while(LongestNode != null && difference > 0){
            LongestNode = LongestNode.next;
            difference--;
        }

        while(LongestNode != null && ShortestNode != null){
            if(LongestNode == ShortestNode){
                return LongestNode;
            }
            LongestNode = LongestNode.next;
            ShortestNode = ShortestNode.next;
        }
        return null;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //Brustforce Approach
        //Time Complexity : O(N+M)
        //Space Complexity: O(N)

        // HashSet<ListNode>set = new HashSet<>();

        // ListNode temp1 = headA;
        // ListNode temp2 = headB;

        // while(temp1 != null){
        //     set.add(temp1);
        //     temp1 = temp1.next;
        // }

        // while(temp2 != null){
        //     if(set.contains(temp2)){
        //         return temp2;
        //     }
        //     set.add(temp2);
        //     temp2 = temp2.next;
        // }
        // return null;

       //TimeComplexity: O(N+M) + O(N+M)
       //SpaceComplexity: O(1)

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int len1 = 0;
        int len2 = 0;

        while(temp1 != null){
            len1++;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            len2++;
            temp2 = temp2.next;
        }

        if(len1 >= len2){
            return findIntersectionPoint(headA , headB , len1-len2);
        }
        else{
            return findIntersectionPoint(headB , headA , len2-len1);
        }



        
    }
    
}
