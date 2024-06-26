/* This file was generated by SableCC (http://www.sablecc.org/). */

package lParser.node;

import lParser.analysis.*;

@SuppressWarnings("nls")
public final class ANbExp extends PExp
{
    private TNombre _nombre_;

    public ANbExp()
    {
        // Constructor
    }

    public ANbExp(
        @SuppressWarnings("hiding") TNombre _nombre_)
    {
        // Constructor
        setNombre(_nombre_);

    }

    @Override
    public Object clone()
    {
        return new ANbExp(
            cloneNode(this._nombre_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANbExp(this);
    }

    public TNombre getNombre()
    {
        return this._nombre_;
    }

    public void setNombre(TNombre node)
    {
        if(this._nombre_ != null)
        {
            this._nombre_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nombre_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nombre_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nombre_ == child)
        {
            this._nombre_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nombre_ == oldChild)
        {
            setNombre((TNombre) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
