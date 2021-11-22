package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.buttons.WindowsButton;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.checkboxes.WindowsCheckbox;
import refactoring_guru.abstract_factory.example.logos.WindowsLogo;
import refactoring_guru.abstract_factory.example.logos.Logo;
/**
 * EN: Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 *
 * RU: Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Logo createLogo() {
        return new WindowsLogo();
    }
}
