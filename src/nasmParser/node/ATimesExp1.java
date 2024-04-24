/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class ATimesExp1 extends PExp1
{
    private PExp1 _exp1_;
    private TTimes _times_;
    private PExp2 _exp2_;

    public ATimesExp1()
    {
        // Constructor
    }

    public ATimesExp1(
        @SuppressWarnings("hiding") PExp1 _exp1_,
        @SuppressWarnings("hiding") TTimes _times_,
        @SuppressWarnings("hiding") PExp2 _exp2_)
    {
        // Constructor
        setExp1(_exp1_);

        setTimes(_times_);

        setExp2(_exp2_);

    }

    @Override
    public Object clone()
    {
        return new ATimesExp1(
            cloneNode(this._exp1_),
            cloneNode(this._times_),
            cloneNode(this._exp2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATimesExp1(this);
    }

    public PExp1 getExp1()
    {
        return this._exp1_;
    }

    public void setExp1(PExp1 node)
    {
        if(this._exp1_ != null)
        {
            this._exp1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp1_ = node;
    }

    public TTimes getTimes()
    {
        return this._times_;
    }

    public void setTimes(TTimes node)
    {
        if(this._times_ != null)
        {
            this._times_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._times_ = node;
    }

    public PExp2 getExp2()
    {
        return this._exp2_;
    }

    public void setExp2(PExp2 node)
    {
        if(this._exp2_ != null)
        {
            this._exp2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp1_)
            + toString(this._times_)
            + toString(this._exp2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp1_ == child)
        {
            this._exp1_ = null;
            return;
        }

        if(this._times_ == child)
        {
            this._times_ = null;
            return;
        }

        if(this._exp2_ == child)
        {
            this._exp2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp1_ == oldChild)
        {
            setExp1((PExp1) newChild);
            return;
        }

        if(this._times_ == oldChild)
        {
            setTimes((TTimes) newChild);
            return;
        }

        if(this._exp2_ == oldChild)
        {
            setExp2((PExp2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
