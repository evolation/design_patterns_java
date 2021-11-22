package refactoring_guru.bridge.example.devices;

public class Light implements Device{

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

        
    }

    @Override
    public void disable() {

        
    }

    @Override
    public int getVolume() {

        return 0;
    }

    @Override
    public void setVolume(int percent) {

        
    }

    @Override
    public int getChannel() {

        return 0;
    }

    @Override
    public void setChannel(int channel) {

        
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm light.");
        System.out.println("------------------------------------\n");
    }
    
}
