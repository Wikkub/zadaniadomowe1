package zad2devices;

/*
Zadanie 2
Stwórz klasę devices.MobileDevice, która będzie klasą bazową z polami:
- rozmiar wyświetlacza
- pamięć ram
- cpu
- system operacyjny
- typ urządzenia
Stwórz dodatkowo dwie klasy dziedziczące po klasie devices.MobileDevice:
- devices.MobilePhone z polami: LTE support
- Tablet -> pencil support
Stwórz metodę w klasie bazowej:
- showDeviceInfo, która wyświetli szczegóły urzadzenia
- metoda powinna zostać nadpisana w klasach pochodnych (wyświetlenie dodatkowych szczegółów)
 */

public abstract class MobileDevice {
    private int screenSize;
    private int ram;
    private int cpu;
    private String operationSystem;
    private String deviceType;



    public void showDeviceInfo() {
        System.out.println(screenSize + ram + cpu + operationSystem + deviceType);
    }
}
