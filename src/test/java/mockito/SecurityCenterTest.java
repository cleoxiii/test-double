package mockito;

import org.junit.jupiter.api.Test;

import mock.DoorPanel;
import mock.SecurityCenter;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SecurityCenterTest {

    @Test
    void should_verify_door_is_close() {
        DoorPanel doorPanel = mock(DoorPanel.class);
        SecurityCenter securityCenter = new SecurityCenter(doorPanel);
        securityCenter.switchOn();
        verify(doorPanel).close();
    }
}
