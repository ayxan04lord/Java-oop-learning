package Practice;

public class SmartThermostat {
    private int temperature;

    public SmartThermostat(int temperature) {
        this.temperature = 24;

    }

    public int getTemperature(){
        return temperature;
    }

    public String setTemperature(int temperature) {
        if (temperature < 30 & temperature>15){
            this.temperature = temperature;
        } else if(temperature<15){
            temperature = 15;
            return "Xeberdardliq: Cox soyuq! Minimum 15 dereceye tenzimlendi";
        }
        return "Temperatur dusdu";
    }
}
