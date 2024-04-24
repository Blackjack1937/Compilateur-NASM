/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.node;

import nasmParser.analysis.*;

@SuppressWarnings("nls")
public final class AReswVar extends PVar
{
    private PLabel _label_;
    private TSemicol _semicol_;
    private TReserveword _reserveword_;
    private TNumber _number_;

    public AReswVar()
    {
        // Constructor
    }

    public AReswVar(
        @SuppressWarnings("hiding") PLabel _label_,
        @SuppressWarnings("hiding") TSemicol _semicol_,
        @SuppressWarnings("hiding") TReserveword _reserveword_,
        @SuppressWarnings("hiding") TNumber _number_)
    {
        // Constructor
        setLabel(_label_);

        setSemicol(_semicol_);

        setReserveword(_reserveword_);

        setNumber(_number_);

    }

    @Override
    public Object clone()
    {
        return new AReswVar(
            cloneNode(this._label_),
            cloneNode(this._semicol_),
            cloneNode(this._reserveword_),
            cloneNode(this._number_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReswVar(this);
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

    public TSemicol getSemicol()
    {
        return this._semicol_;
    }

    public void setSemicol(TSemicol node)
    {
        if(this._semicol_ != null)
        {
            this._semicol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicol_ = node;
    }

    public TReserveword getReserveword()
    {
        return this._reserveword_;
    }

    public void setReserveword(TReserveword node)
    {
        if(this._reserveword_ != null)
        {
            this._reserveword_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._reserveword_ = node;
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._label_)
            + toString(this._semicol_)
            + toString(this._reserveword_)
            + toString(this._number_);
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

        if(this._semicol_ == child)
        {
            this._semicol_ = null;
            return;
        }

        if(this._reserveword_ == child)
        {
            this._reserveword_ = null;
            return;
        }

        if(this._number_ == child)
        {
            this._number_ = null;
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

        if(this._semicol_ == oldChild)
        {
            setSemicol((TSemicol) newChild);
            return;
        }

        if(this._reserveword_ == oldChild)
        {
            setReserveword((TReserveword) newChild);
            return;
        }

        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
