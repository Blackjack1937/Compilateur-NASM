/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AInfExp3 extends PExp3
{
    private PExp3 _exp3_;
    private TInf _inf_;
    private PExp4 _exp4_;

    public AInfExp3()
    {
        // Constructor
    }

    public AInfExp3(
        @SuppressWarnings("hiding") PExp3 _exp3_,
        @SuppressWarnings("hiding") TInf _inf_,
        @SuppressWarnings("hiding") PExp4 _exp4_)
    {
        // Constructor
        setExp3(_exp3_);

        setInf(_inf_);

        setExp4(_exp4_);

    }

    @Override
    public Object clone()
    {
        return new AInfExp3(
            cloneNode(this._exp3_),
            cloneNode(this._inf_),
            cloneNode(this._exp4_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInfExp3(this);
    }

    public PExp3 getExp3()
    {
        return this._exp3_;
    }

    public void setExp3(PExp3 node)
    {
        if(this._exp3_ != null)
        {
            this._exp3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp3_ = node;
    }

    public TInf getInf()
    {
        return this._inf_;
    }

    public void setInf(TInf node)
    {
        if(this._inf_ != null)
        {
            this._inf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inf_ = node;
    }

    public PExp4 getExp4()
    {
        return this._exp4_;
    }

    public void setExp4(PExp4 node)
    {
        if(this._exp4_ != null)
        {
            this._exp4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp4_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp3_)
            + toString(this._inf_)
            + toString(this._exp4_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp3_ == child)
        {
            this._exp3_ = null;
            return;
        }

        if(this._inf_ == child)
        {
            this._inf_ = null;
            return;
        }

        if(this._exp4_ == child)
        {
            this._exp4_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp3_ == oldChild)
        {
            setExp3((PExp3) newChild);
            return;
        }

        if(this._inf_ == oldChild)
        {
            setInf((TInf) newChild);
            return;
        }

        if(this._exp4_ == oldChild)
        {
            setExp4((PExp4) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
