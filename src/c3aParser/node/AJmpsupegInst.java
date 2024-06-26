/* This file was generated by SableCC (http://www.sablecc.org/). */

package c3aParser.node;

import c3aParser.analysis.*;

@SuppressWarnings("nls")
public final class AJmpsupegInst extends PInst
{
    private PJmpsupeg _jmpsupeg_;

    public AJmpsupegInst()
    {
        // Constructor
    }

    public AJmpsupegInst(
        @SuppressWarnings("hiding") PJmpsupeg _jmpsupeg_)
    {
        // Constructor
        setJmpsupeg(_jmpsupeg_);

    }

    @Override
    public Object clone()
    {
        return new AJmpsupegInst(
            cloneNode(this._jmpsupeg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAJmpsupegInst(this);
    }

    public PJmpsupeg getJmpsupeg()
    {
        return this._jmpsupeg_;
    }

    public void setJmpsupeg(PJmpsupeg node)
    {
        if(this._jmpsupeg_ != null)
        {
            this._jmpsupeg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._jmpsupeg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._jmpsupeg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._jmpsupeg_ == child)
        {
            this._jmpsupeg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._jmpsupeg_ == oldChild)
        {
            setJmpsupeg((PJmpsupeg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
