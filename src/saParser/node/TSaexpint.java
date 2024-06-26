/* This file was generated by SableCC (http://www.sablecc.org/). */

package saParser.node;

import saParser.analysis.*;

@SuppressWarnings("nls")
public final class TSaexpint extends Token
{
    public TSaexpint()
    {
        super.setText("SaExpInt");
    }

    public TSaexpint(int line, int pos)
    {
        super.setText("SaExpInt");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSaexpint(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSaexpint(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSaexpint text.");
    }
}
