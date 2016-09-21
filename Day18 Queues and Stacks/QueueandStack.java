public class Solution {
    // Write your code here.
    private class Node {
        public char value;
        public Node next;

        public Node(char s) {
            value = s;
        }
    }

    Node stackRoot;
    Node queueFirst;
    Node queueEnd;
        
    public void pushCharacter(char ch) {
        if(stackRoot == null) {
            stackRoot = new Node(ch);
        }
        else {
            //We have a root
            Node temp = new Node(ch);

            temp.next = stackRoot;

            stackRoot = temp;
        }
    }

    public char popCharacter() {
        if(stackRoot == null) {
            return '0';
        }
        else {
            char c = stackRoot.value;

            stackRoot = stackRoot.next;

            return c;
        }
    }
    
    public void enqueueCharacter(char ch) {
        if(queueFirst == null) {
            queueFirst = new Node(ch);
            queueEnd = queueFirst;
        }
        else {
            Node temp = new Node(ch);
            
            Node scan = queueFirst;
            
            while(scan.next != null) {
                scan = scan.next;
            }
            
            scan.next = temp;
            queueEnd = temp;
        }
    }
    
    public char dequeueCharacter() {
        if(queueFirst == null) {
            return '0';
        }
        else {
            char c = queueFirst.value;
            queueFirst = queueFirst.next;
            return c;
        }
    }
    