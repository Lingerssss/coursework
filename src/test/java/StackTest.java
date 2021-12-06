import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    Stack stack1 = new Stack();
    Entry entry1=new Entry(Symbol.PLUS);
    Entry entry2=new Entry(Symbol.PLUS);
    Entry entry3=new Entry(Symbol.PLUS);

    @Test
    //Test1
    //this test verifies if size method work correctly.
    public void should_return_size() {
        int result = stack1.size();
        Assert.assertEquals(0,result);
    }


    @Test
    //Test2
    //this test verifies if top method work correctly.
    public void should_top() {
        stack1.push(entry1);
        Entry result=stack1.top();
        Assert.assertEquals(entry1,result);
    }

    @Test
    //Test3
    //this test verifies if push method work correctly.
    public void should_push() {
        stack1.push(entry1);
        stack1.push(entry2);
        stack1.push(entry3);
        int actualSize = stack1.size();
        Assert.assertEquals(3, actualSize);
    }

    @Test
    //Test4
    //this test verifies if pop method work correctly.
    public void should_pop() {
        stack1.push(entry1);
        stack1.push(entry2);
        stack1.pop();
        int actualSize = stack1.size();
        Entry result=stack1.top();
        Assert.assertEquals(1, actualSize);
        Assert.assertEquals(entry1,result);
    }


    @Test
    //Test5
    //this test verifies whether throw exceptions
    public void should_throw_exceptions() {
        try {
            stack1.top();
        }catch (Exception ex){
            Assert.assertEquals(ex.getClass(),EmptyStackException.class);
        }
    }
}
