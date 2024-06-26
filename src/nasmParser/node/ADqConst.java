/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class ADqConst extends PConst
{
    private PLabel _label_;
    private TDefinequadword _definequadword_;
    private PNumconst _numconst_;

    public ADqConst()
    {
        // Constructor
    }

    public ADqConst(
        @SuppressWarnings("hiding") PLabel _label_,
        @SuppressWarnings("hiding") TDefinequadword _definequadword_,
        @SuppressWarnings("hiding") PNumconst _numconst_)
    {
        // Constructor
        setLabel(_label_);

        setDefinequadword(_definequadword_);

        setNumconst(_numconst_);

    }

    @Override
    public Object clone()
    {
        return new ADqConst(
            cloneNode(this._label_),
            cloneNode(this._definequadword_),
            cloneNode(this._numconst_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADqConst(this);
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

    public TDefinequadword getDefinequadword()
    {
        return this._definequadword_;
    }

    public void setDefinequadword(TDefinequadword node)
    {
        if(this._definequadword_ != null)
        {
            this._definequadword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._definequadword_ = node;
    }

    public PNumconst getNumconst()
    {
        return this._numconst_;
    }

    public void setNumconst(PNumconst node)
    {
        if(this._numconst_ != null)
        {
            this._numconst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numconst_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._label_)
            + toString(this._definequadword_)
            + toString(this._numconst_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._label_ == child)
        {
            this._label_ = null;
            return;
        }

        if(this._definequadword_ == child)
        {
            this._definequadword_ = null;
            return;
        }

        if(this._numconst_ == child)
        {
            this._numconst_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._label_ == oldChild)
        {
            setLabel((PLabel) newChild);
            return;
        }

        if(this._definequadword_ == oldChild)
        {
            setDefinequadword((TDefinequadword) newChild);
            return;
        }

        if(this._numconst_ == oldChild)
        {
            setNumconst((PNumconst) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
