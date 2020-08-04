package mock;

public class MockDoorPanel extends DoorPanel{
    public String wasCalled = "";

    @Override
    void close() {
        this.wasCalled = "Mock door panel close method was called.";
    }
}
