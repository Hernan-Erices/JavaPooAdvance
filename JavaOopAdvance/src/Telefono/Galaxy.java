package Telefono;

public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }


    @Override

    public void displayInfo() {

		System.out.println("Numero de version: " + getVersionNumber());
		System.out.println("Porcentaje de bateria: " + getBatteryPercentage());
		System.out.println("Cargador: " + getCarrier());
		System.out.println("Tono de llamada: " + getRingTone());

    }
    
	public void ring() {
		System.out.println(ring);
	}

	
	public void unlock() {
		System.out.println(unlock);
	}
    

}
