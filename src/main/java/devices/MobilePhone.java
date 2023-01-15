package devices;

public class MobilePhone extends MobileDevice {
    private String LTESupport;

    @Override
    public void showDeviceInfo() {
        super.showDeviceInfo();
        System.out.println(LTESupport);
    }
}
