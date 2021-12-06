import org.junit.Assert;
import org.junit.Test;

public class EntryTest {

    @Test
    //Test1
    //this test verifies the constructor with symbol parameter
    public void should_generate_entry_with_symbol_constructor(){
        Entry entry=new Entry(Symbol.PLUS);
        Assert.assertEquals(Symbol.PLUS,entry.getSymbol());
    }


    @Test
    //Test2
    //this test verifies the constructor with value parameter
    public void should_generate_entry_with_value_constructor(){
        Entry entry=new Entry(1.0f);
        Assert.assertEquals(1.0f,entry.getValue(),0.001);
    }

    @Test
    //Test3
    //this test verifies the equals() method
    public void should_equal_when_type_and_value_are_equal(){
        Entry entry1=new Entry(1.0f,Symbol.PLUS);
        Entry entry2=new Entry(1.0f,Symbol.PLUS);
        Assert.assertEquals(entry1,entry2);
    }

    @Test
    //Test4
    //this test verifies the toString() method
    public void should_print_string(){
        Entry entry1=new Entry(1.0f,Symbol.PLUS);
        String expectedString="Entry{number=1.0, symbol=PLUS, str='null', type=null}";
        Assert.assertEquals(expectedString,entry1.toString());
    }
}
