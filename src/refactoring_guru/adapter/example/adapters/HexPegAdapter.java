package refactoring_guru.adapter.example.adapters;

import refactoring_guru.adapter.example.hex.HexPeg;
import refactoring_guru.adapter.example.round.RoundPeg;

public class HexPegAdapter extends RoundPeg{
    private HexPeg peg;
    
    public HexPegAdapter(HexPeg peg) {
        this.peg = peg;
    }
    
    @Override
    public double getRadius()
    {
        return this.peg.getWidth();
    }
}
