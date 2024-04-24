/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ADecfoncListedecfonc extends PListedecfonc
{
    private PDecfonc _decfonc_;
    private PListedecfonc _listedecfonc_;

    public ADecfoncListedecfonc()
    {
        // Constructor
    }

    public ADecfoncListedecfonc(
        @SuppressWarnings("hiding") PDecfonc _decfonc_,
        @SuppressWarnings("hiding") PListedecfonc _listedecfonc_)
    {
        // Constructor
        setDecfonc(_decfonc_);

        setListedecfonc(_listedecfonc_);

    }

    @Override
    public Object clone()
    {
        return new ADecfoncListedecfonc(
            cloneNode(this._decfonc_),
            cloneNode(this._listedecfonc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecfoncListedecfonc(this);
    }

    public PDecfonc getDecfonc()
    {
        return this._decfonc_;
    }

    public void setDecfonc(PDecfonc node)
    {
        if(this._decfonc_ != null)
        {
            this._decfonc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decfonc_ = node;
    }

    public PListedecfonc getListedecfonc()
    {
        return this._listedecfonc_;
    }

    public void setListedecfonc(PListedecfonc node)
    {
        if(this._listedecfonc_ != null)
        {
            this._listedecfonc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listedecfonc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decfonc_)
            + toString(this._listedecfonc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decfonc_ == child)
        {
            this._decfonc_ = null;
            return;
        }

        if(this._listedecfonc_ == child)
        {
            this._listedecfonc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._decfonc_ == oldChild)
        {
            setDecfonc((PDecfonc) newChild);
            return;
        }

        if(this._listedecfonc_ == oldChild)
        {
            setListedecfonc((PListedecfonc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
