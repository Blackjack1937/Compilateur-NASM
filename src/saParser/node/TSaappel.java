/* This file was generated by SableCC (http://www.sablecc.org/). */

package saParser.node;

import saParser.analysis.*;

@SuppressWarnings("nls")
public final class TSaappel extends Token
{
    public TSaappel()
    {
        super.setText("SaAppel");
    }

    public TSaappel(int line, int pos)
    {
        super.setText("SaAppel");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSaappel(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSaappel(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSaappel text.");
    }
}
