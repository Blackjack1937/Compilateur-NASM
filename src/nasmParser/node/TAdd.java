/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class TAdd extends Token
{
    public TAdd()
    {
        super.setText("add");
    }

    public TAdd(int line, int pos)
    {
        super.setText("add");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAdd(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAdd(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAdd text.");
    }
}
