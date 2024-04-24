/* This file was generated by SableCC (http://www.sablecc.org/). */

package c3aParser.node;

import c3aParser.analysis.*;

@SuppressWarnings("nls")
public final class AJmpsupeg extends PJmpsupeg
{
    private PEtiqop _etiqop_;
    private TIf _if_;
    private PCtv _op1_;
    private TSupeq _supeq_;
    private PCtv _op2_;
    private TGoto _goto_;
    private PConstante _result_;

    public AJmpsupeg()
    {
        // Constructor
    }

    public AJmpsupeg(
        @SuppressWarnings("hiding") PEtiqop _etiqop_,
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PCtv _op1_,
        @SuppressWarnings("hiding") TSupeq _supeq_,
        @SuppressWarnings("hiding") PCtv _op2_,
        @SuppressWarnings("hiding") TGoto _goto_,
        @SuppressWarnings("hiding") PConstante _result_)
    {
        // Constructor
        setEtiqop(_etiqop_);

        setIf(_if_);

        setOp1(_op1_);

        setSupeq(_supeq_);

        setOp2(_op2_);

        setGoto(_goto_);

        setResult(_result_);

    }

    @Override
    public Object clone()
    {
        return new AJmpsupeg(
            cloneNode(this._etiqop_),
            cloneNode(this._if_),
            cloneNode(this._op1_),
            cloneNode(this._supeq_),
            cloneNode(this._op2_),
            cloneNode(this._goto_),
            cloneNode(this._result_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAJmpsupeg(this);
    }

    public PEtiqop getEtiqop()
    {
        return this._etiqop_;
    }

    public void setEtiqop(PEtiqop node)
    {
        if(this._etiqop_ != null)
        {
            this._etiqop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._etiqop_ = node;
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PCtv getOp1()
    {
        return this._op1_;
    }

    public void setOp1(PCtv node)
    {
        if(this._op1_ != null)
        {
            this._op1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._op1_ = node;
    }

    public TSupeq getSupeq()
    {
        return this._supeq_;
    }

    public void setSupeq(TSupeq node)
    {
        if(this._supeq_ != null)
        {
            this._supeq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._supeq_ = node;
    }

    public PCtv getOp2()
    {
        return this._op2_;
    }

    public void setOp2(PCtv node)
    {
        if(this._op2_ != null)
        {
            this._op2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._op2_ = node;
    }

    public TGoto getGoto()
    {
        return this._goto_;
    }

    public void setGoto(TGoto node)
    {
        if(this._goto_ != null)
        {
            this._goto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._goto_ = node;
    }

    public PConstante getResult()
    {
        return this._result_;
    }

    public void setResult(PConstante node)
    {
        if(this._result_ != null)
        {
            this._result_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._result_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._etiqop_)
            + toString(this._if_)
            + toString(this._op1_)
            + toString(this._supeq_)
            + toString(this._op2_)
            + toString(this._goto_)
            + toString(this._result_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._etiqop_ == child)
        {
            this._etiqop_ = null;
            return;
        }

        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._op1_ == child)
        {
            this._op1_ = null;
            return;
        }

        if(this._supeq_ == child)
        {
            this._supeq_ = null;
            return;
        }

        if(this._op2_ == child)
        {
            this._op2_ = null;
            return;
        }

        if(this._goto_ == child)
        {
            this._goto_ = null;
            return;
        }

        if(this._result_ == child)
        {
            this._result_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._etiqop_ == oldChild)
        {
            setEtiqop((PEtiqop) newChild);
            return;
        }

        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._op1_ == oldChild)
        {
            setOp1((PCtv) newChild);
            return;
        }

        if(this._supeq_ == oldChild)
        {
            setSupeq((TSupeq) newChild);
            return;
        }

        if(this._op2_ == oldChild)
        {
            setOp2((PCtv) newChild);
            return;
        }

        if(this._goto_ == oldChild)
        {
            setGoto((TGoto) newChild);
            return;
        }

        if(this._result_ == oldChild)
        {
            setResult((PConstante) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}