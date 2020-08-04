package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    private SecurityCenter securityCenter;
    private MockDoorPanel mockDoorPanel;

    @BeforeEach
    public void setUp() {
        mockDoorPanel = new MockDoorPanel();
        securityCenter = new SecurityCenter(mockDoorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        assertEquals("", mockDoorPanel.wasCalled);
        securityCenter.switchOn();
        assertEquals("Mock door panel close method was called.", mockDoorPanel.wasCalled);
    }
}
