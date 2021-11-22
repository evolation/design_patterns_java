package refactoring_guru.abstract_factory.example.logos;

public class WindowsLogo implements Logo {
    @Override
    public void paint(){
        System.out.println("You have created WindowsLogo.");
    }
}
