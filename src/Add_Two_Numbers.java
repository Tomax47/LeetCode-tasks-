public class Add_Two_Numbers {

    public static void main(String[] args) {

        //Initializing l1 & l2
        ListNode l1 = new ListNode(2);
        //Second value
        l1.next = new ListNode(4);
        //Third value
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode additionList = addTwoNumbers(l1,l2);

        while (additionList != null) {
            System.out.print(additionList.val);
            additionList = additionList.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

//    public int getNumebr (ListNode l) {
//        String number = "";
//        for (int i = l.size(); i> 0 ; i--) {
//            number+= String.valueOf(l.get(i));
//        }
//
//        int finalNumber = Integer.parseInt(number);
//    }
//
//    public ListNode createArray(int number) {
//        String num = String.valueOf(number);
//        ListNode ln = new ListNode<>();
//        for (int i = num.length; i > 0; i--) {
//            ln.add(Integer.parseInt(num.charAt(i)));
//        }
//
//        return ln;
//    }
