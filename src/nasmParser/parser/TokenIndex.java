/* This file was generated by SableCC (http://www.sablecc.org/). */

package nasmParser.parser;

import nasmParser.node.*;
import nasmParser.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 0;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 1;
    }

    @Override
    public void caseTTimes(@SuppressWarnings("unused") TTimes node)
    {
        this.index = 2;
    }

    @Override
    public void caseTBrackopen(@SuppressWarnings("unused") TBrackopen node)
    {
        this.index = 3;
    }

    @Override
    public void caseTBrackclose(@SuppressWarnings("unused") TBrackclose node)
    {
        this.index = 4;
    }

    @Override
    public void caseTSemicol(@SuppressWarnings("unused") TSemicol node)
    {
        this.index = 5;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 6;
    }

    @Override
    public void caseTQuote(@SuppressWarnings("unused") TQuote node)
    {
        this.index = 7;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 8;
    }

    @Override
    public void caseTPercentage(@SuppressWarnings("unused") TPercentage node)
    {
        this.index = 9;
    }

    @Override
    public void caseTByte(@SuppressWarnings("unused") TByte node)
    {
        this.index = 10;
    }

    @Override
    public void caseTWord(@SuppressWarnings("unused") TWord node)
    {
        this.index = 11;
    }

    @Override
    public void caseTDword(@SuppressWarnings("unused") TDword node)
    {
        this.index = 12;
    }

    @Override
    public void caseTPrefixRegister(@SuppressWarnings("unused") TPrefixRegister node)
    {
        this.index = 13;
    }

    @Override
    public void caseTInc(@SuppressWarnings("unused") TInc node)
    {
        this.index = 14;
    }

    @Override
    public void caseTSection(@SuppressWarnings("unused") TSection node)
    {
        this.index = 15;
    }

    @Override
    public void caseTData(@SuppressWarnings("unused") TData node)
    {
        this.index = 16;
    }

    @Override
    public void caseTDefinebyte(@SuppressWarnings("unused") TDefinebyte node)
    {
        this.index = 17;
    }

    @Override
    public void caseTDefineword(@SuppressWarnings("unused") TDefineword node)
    {
        this.index = 18;
    }

    @Override
    public void caseTDefinedoubleword(@SuppressWarnings("unused") TDefinedoubleword node)
    {
        this.index = 19;
    }

    @Override
    public void caseTDefinequadword(@SuppressWarnings("unused") TDefinequadword node)
    {
        this.index = 20;
    }

    @Override
    public void caseTDefinetenbytes(@SuppressWarnings("unused") TDefinetenbytes node)
    {
        this.index = 21;
    }

    @Override
    public void caseTBss(@SuppressWarnings("unused") TBss node)
    {
        this.index = 22;
    }

    @Override
    public void caseTReservebyte(@SuppressWarnings("unused") TReservebyte node)
    {
        this.index = 23;
    }

    @Override
    public void caseTReserveword(@SuppressWarnings("unused") TReserveword node)
    {
        this.index = 24;
    }

    @Override
    public void caseTReservedoubleword(@SuppressWarnings("unused") TReservedoubleword node)
    {
        this.index = 25;
    }

    @Override
    public void caseTReservequadword(@SuppressWarnings("unused") TReservequadword node)
    {
        this.index = 26;
    }

    @Override
    public void caseTReservetenbytes(@SuppressWarnings("unused") TReservetenbytes node)
    {
        this.index = 27;
    }

    @Override
    public void caseTText(@SuppressWarnings("unused") TText node)
    {
        this.index = 28;
    }

    @Override
    public void caseTGlobal(@SuppressWarnings("unused") TGlobal node)
    {
        this.index = 29;
    }

    @Override
    public void caseTMov(@SuppressWarnings("unused") TMov node)
    {
        this.index = 30;
    }

    @Override
    public void caseTPush(@SuppressWarnings("unused") TPush node)
    {
        this.index = 31;
    }

    @Override
    public void caseTPop(@SuppressWarnings("unused") TPop node)
    {
        this.index = 32;
    }

    @Override
    public void caseTAdd(@SuppressWarnings("unused") TAdd node)
    {
        this.index = 33;
    }

    @Override
    public void caseTSub(@SuppressWarnings("unused") TSub node)
    {
        this.index = 34;
    }

    @Override
    public void caseTImul(@SuppressWarnings("unused") TImul node)
    {
        this.index = 35;
    }

    @Override
    public void caseTIdiv(@SuppressWarnings("unused") TIdiv node)
    {
        this.index = 36;
    }

    @Override
    public void caseTAnd(@SuppressWarnings("unused") TAnd node)
    {
        this.index = 37;
    }

    @Override
    public void caseTOr(@SuppressWarnings("unused") TOr node)
    {
        this.index = 38;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 39;
    }

    @Override
    public void caseTNot(@SuppressWarnings("unused") TNot node)
    {
        this.index = 40;
    }

    @Override
    public void caseTCmp(@SuppressWarnings("unused") TCmp node)
    {
        this.index = 41;
    }

    @Override
    public void caseTJmp(@SuppressWarnings("unused") TJmp node)
    {
        this.index = 42;
    }

    @Override
    public void caseTJe(@SuppressWarnings("unused") TJe node)
    {
        this.index = 43;
    }

    @Override
    public void caseTJne(@SuppressWarnings("unused") TJne node)
    {
        this.index = 44;
    }

    @Override
    public void caseTJg(@SuppressWarnings("unused") TJg node)
    {
        this.index = 45;
    }

    @Override
    public void caseTJge(@SuppressWarnings("unused") TJge node)
    {
        this.index = 46;
    }

    @Override
    public void caseTJl(@SuppressWarnings("unused") TJl node)
    {
        this.index = 47;
    }

    @Override
    public void caseTJle(@SuppressWarnings("unused") TJle node)
    {
        this.index = 48;
    }

    @Override
    public void caseTCall(@SuppressWarnings("unused") TCall node)
    {
        this.index = 49;
    }

    @Override
    public void caseTRet(@SuppressWarnings("unused") TRet node)
    {
        this.index = 50;
    }

    @Override
    public void caseTInt(@SuppressWarnings("unused") TInt node)
    {
        this.index = 51;
    }

    @Override
    public void caseTEax(@SuppressWarnings("unused") TEax node)
    {
        this.index = 52;
    }

    @Override
    public void caseTEbx(@SuppressWarnings("unused") TEbx node)
    {
        this.index = 53;
    }

    @Override
    public void caseTEcx(@SuppressWarnings("unused") TEcx node)
    {
        this.index = 54;
    }

    @Override
    public void caseTEdx(@SuppressWarnings("unused") TEdx node)
    {
        this.index = 55;
    }

    @Override
    public void caseTEbp(@SuppressWarnings("unused") TEbp node)
    {
        this.index = 56;
    }

    @Override
    public void caseTEsp(@SuppressWarnings("unused") TEsp node)
    {
        this.index = 57;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 58;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 59;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 60;
    }
}