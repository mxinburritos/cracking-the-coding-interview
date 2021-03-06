package Ch02_Linked_Lists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Q02_08_Loop_Detection_Test {

    private Q02_08_Loop_Detection s = new Q02_08_Loop_Detection();

    @Test
    public void withEmptyList() {
        assertNull(s.detect(LinkedListNode.empty()));
    }

    @Test
    public void withListWithoutLoop() {
        assertNull(s.detect(LinkedListNode.of(1, 2, 3)));
    }

    @Test
    public void testWithLoop_FromListHead() {
        LinkedListNode list = LinkedListNode.of(1, 2, 3, 4, 5);
        list.next.next.next.next.next = list;
        assertEquals(1, s.detect(list).val);
    }

    @Test
    public void testWithLoop_FromListTail() {
        LinkedListNode list = LinkedListNode.of(1, 2, 3, 4, 5);
        LinkedListNode tail = list.next.next.next.next;
        tail.next = tail;
        assertEquals(5, s.detect(list).val);
    }

    @Test
    public void testWithLoop_FromListMiddle() {
        LinkedListNode list = LinkedListNode.of(1, 2, 3, 4, 5);
        list.next.next.next.next.next = list.next;
        assertEquals(2, s.detect(list).val);
    }
}