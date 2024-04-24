/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class AJneInst extends PInst
{
    private POplabel _oplabel_;
    private TJne _jne_;
    private PLabel _label_;

    public AJneInst()
    {
        // Constructor
    }

    public AJneInst(
        @SuppressWarnings("hiding") POplabel _oplabel_,
        @SuppressWarnings("hiding") TJne _jne_,
        @SuppressWarnings("hiding") PLabel _label_)
    {
        // Constructor
        setOplabel(_oplabel_);

        setJne(_jne_);

        setLabel(_label_);

    }

    @Override
    public Object clone()
    {
        return new AJneInst(
            cloneNode(this._oplabel_),
            cloneNode(this._jne_),
            cloneNode(this._label_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAJneInst(this);
    }

    public POplabel getOplabel()
    {
        return this._oplabel_;
    }

    public void setOplabel(POplabel node)
    {
        if(this._oplabel_ != null)
        {
            this._oplabel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._oplabel_ = node;
    }

    public TJne getJne()
    {
        return this._jne_;
    }

    public void setJne(TJne node)
    {
        if(this._jne_ != null)
        {
            this._jne_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._jne_ = node;
    }

    public PLabel getLabel()
    {
        return this._label_;
    }

    public void setLabel(PLabel node)
    {
        if(this._label_ != null)
        {
            this._label_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._label_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._oplabel_)
            + toString(this._jne_)
            + toString(this._label_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._oplabel_ == child)
        {
            this._oplabel_ = null;
            return;
        }

        if(this._jne_ == child)
        {
            this._jne_ = null;
            return;
        }

        if(this._label_ == child)
        {
            this._label_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._oplabel_ == oldChild)
        {
            setOplabel((POplabel) newChild);
            return;
        }

        if(this._jne_ == oldChild)
        {
            setJne((TJne) newChild);
            return;
        }

        if(this._label_ == oldChild)
        {
            setLabel((PLabel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}