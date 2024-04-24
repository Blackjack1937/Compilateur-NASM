/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class TSub extends Token
{
    public TSub()
    {
        super.setText("sub");
    }

    public TSub(int line, int pos)
    {
        super.setText("sub");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSub(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSub(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSub text.");
    }
}