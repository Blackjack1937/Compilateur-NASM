/* This file was generated by SableCC (http://www.sablecc.org/). */

package saParser.node;

import saParser.analysis.*;

@SuppressWarnings("nls")
public final class TSavarindicee extends Token
{
    public TSavarindicee()
    {
        super.setText("SaVarIndicee");
    }

    public TSavarindicee(int line, int pos)
    {
        super.setText("SaVarIndicee");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSavarindicee(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSavarindicee(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSavarindicee text.");
    }
}
