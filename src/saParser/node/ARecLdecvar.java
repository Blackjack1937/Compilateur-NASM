/* This file was generated by SableCC (http://www.sablecc.org/). */

package saParser.node;

import saParser.analysis.*;

@SuppressWarnings("nls")
public final class ARecLdecvar extends PLdecvar
{
    private TPo _po_;
    private TSaldecvar _saldecvar_;
    private PDecvar _decvar_;
    private PLdecvar _ldecvar_;
    private TPf _pf_;

    public ARecLdecvar()
    {
        // Constructor
    }

    public ARecLdecvar(
        @SuppressWarnings("hiding") TPo _po_,
        @SuppressWarnings("hiding") TSaldecvar _saldecvar_,
        @SuppressWarnings("hiding") PDecvar _decvar_,
        @SuppressWarnings("hiding") PLdecvar _ldecvar_,
        @SuppressWarnings("hiding") TPf _pf_)
    {
        // Constructor
        setPo(_po_);

        setSaldecvar(_saldecvar_);

        setDecvar(_decvar_);

        setLdecvar(_ldecvar_);

        setPf(_pf_);

    }

    @Override
    public Object clone()
    {
        return new ARecLdecvar(
            cloneNode(this._po_),
            cloneNode(this._saldecvar_),
            cloneNode(this._decvar_),
            cloneNode(this._ldecvar_),
            cloneNode(this._pf_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARecLdecvar(this);
    }

    public TPo getPo()
    {
        return this._po_;
    }

    public void setPo(TPo node)
    {
        if(this._po_ != null)
        {
            this._po_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._po_ = node;
    }

    public TSaldecvar getSaldecvar()
    {
        return this._saldecvar_;
    }

    public void setSaldecvar(TSaldecvar node)
    {
        if(this._saldecvar_ != null)
        {
            this._saldecvar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._saldecvar_ = node;
    }

    public PDecvar getDecvar()
    {
        return this._decvar_;
    }

    public void setDecvar(PDecvar node)
    {
        if(this._decvar_ != null)
        {
            this._decvar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._decvar_ = node;
    }

    public PLdecvar getLdecvar()
    {
        return this._ldecvar_;
    }

    public void setLdecvar(PLdecvar node)
    {
        if(this._ldecvar_ != null)
        {
            this._ldecvar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ldecvar_ = node;
    }

    public TPf getPf()
    {
        return this._pf_;
    }

    public void setPf(TPf node)
    {
        if(this._pf_ != null)
        {
            this._pf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pf_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._po_)
            + toString(this._saldecvar_)
            + toString(this._decvar_)
            + toString(this._ldecvar_)
            + toString(this._pf_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._po_ == child)
        {
            this._po_ = null;
            return;
        }

        if(this._saldecvar_ == child)
        {
            this._saldecvar_ = null;
            return;
        }

        if(this._decvar_ == child)
        {
            this._decvar_ = null;
            return;
        }

        if(this._ldecvar_ == child)
        {
            this._ldecvar_ = null;
            return;
        }

        if(this._pf_ == child)
        {
            this._pf_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._po_ == oldChild)
        {
            setPo((TPo) newChild);
            return;
        }

        if(this._saldecvar_ == oldChild)
        {
            setSaldecvar((TSaldecvar) newChild);
            return;
        }

        if(this._decvar_ == oldChild)
        {
            setDecvar((PDecvar) newChild);
            return;
        }

        if(this._ldecvar_ == oldChild)
        {
            setLdecvar((PLdecvar) newChild);
            return;
        }

        if(this._pf_ == oldChild)
        {
            setPf((TPf) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
