package refactoring_guru.bridge.example.remotes;

import refactoring_guru.bridge.example.devices.Device;

public class LightRemote implements Remote{
    protected Device device;

    public LightRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void volumeDown() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void volumeUp() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void channelDown() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void channelUp() {
        // TODO Auto-generated method stub
        
    }

    public void changeLed(int light)
    {

    }
    
}
