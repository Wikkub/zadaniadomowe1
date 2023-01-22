package zad2devices;

public class Tablet extends MobileDevice {
    private String pencilSupport;

    @Override
    public void showDeviceInfo() {
        super.showDeviceInfo();
        System.out.println(pencilSupport);
    }
}
