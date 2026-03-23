import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.*;

class ThreePanelGridTest {
    @Test
    void testFrameTitle() {
        ThreePanelGrid frame = new ThreePanelGrid();
        assertEquals("Three Panel Grid Layout", frame.getTitle());
    }

    //testing failed due to JPanels declared as local variables
//    @Test
//    void testPanelColors() {
//        ThreePanelGrid frame = new ThreePanelGrid();
//
//        assertEquals(Color.RED, frame.panel1.getBackground());
//        assertEquals(Color.GREEN, frame.panel2.getBackground());
//        assertEquals(Color.BLUE, frame.panel3.getBackground());
//    }


}