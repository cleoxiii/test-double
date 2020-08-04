package mock;

public class MockDoorPanel extends DoorPanel{
    public String wasCalled = "";

    @Override
    public void close() {
        this.wasCalled = "Mock door panel close method was called.";
    }
}
