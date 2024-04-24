/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class TIncr extends Token
{
    public TIncr()
    {
        super.setText("+=");
    }

    public TIncr(int line, int pos)
    {
        super.setText("+=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIncr(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIncr(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIncr text.");
    }
}
