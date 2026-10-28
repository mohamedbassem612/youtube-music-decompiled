package defpackage;

import android.text.TextPaint;
import android.view.View;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxv extends oya {
    public final String a;
    public long b;
    public final mew c;
    public final mew d;
    private final orq e;

    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    public oxv(asxi asxiVar, orq orqVar) {
        mew mewVar;
        String str;
        this.b = 0L;
        this.e = orqVar;
        mew mewVar2 = null;
        if (asxiVar.aU()) {
            if (asxiVar.f == null && (Memory.peekByte(asxiVar.c + 8) & 4) != 0) {
                asxiVar.f = new mew(asxiVar.cp(true != asxi.a ? 20 : 24, atcm.a));
            }
            mewVar = asxiVar.f == null ? atcl.a : asxiVar.f;
        } else {
            mewVar = null;
        }
        this.c = mewVar;
        if (asxiVar.e == null && (Memory.peekByte(asxiVar.c + 8) & 16) == 0) {
            str = null;
        } else {
            atcs atcsVarAV = asxiVar.aV();
            if ((atcsVarAV.d == null && (Memory.peekByte(atcsVarAV.c + 8) & 1) == 0) || (Memory.peekByte(asxiVar.aV().aR().c + 8) & 1) == 0) {
                str = null;
            } else {
                atcp atcpVarAR = asxiVar.aV().aR();
                if (atcpVarAR.e == null) {
                    if ((Memory.peekByte(atcpVarAR.c + 8) & 1) != 0) {
                        atcpVarAR.e = atcpVarAR.cq(atcp.d.b);
                    } else {
                        atcpVarAR.e = "";
                    }
                }
                str = atcpVarAR.e;
            }
        }
        this.a = str;
        if (asxiVar.aT()) {
            if (asxiVar.g == null && (Memory.peekByte(asxiVar.c + 8) & 8) != 0) {
                asxiVar.g = new mew(asxiVar.cp(true == asxi.a ? 32 : 24, atcm.a));
            }
            mewVar2 = asxiVar.g == null ? atcl.a : asxiVar.g;
        }
        this.d = mewVar2;
        if (asxiVar.aU()) {
            this.b |= 2;
        }
        if (asxiVar.aT()) {
            this.b |= 4;
        }
    }

    @Override // defpackage.oya
    public final boolean a(View view) {
        mew mewVar = this.d;
        if (mewVar == null) {
            return false;
        }
        orq orqVar = this.e;
        orr orrVarB = ors.b();
        orrVarB.e(view);
        orqVar.d(mewVar, orrVarB.a());
        return true;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        mew mewVar = this.c;
        if (mewVar != null) {
            orq orqVar = this.e;
            orr orrVarB = ors.b();
            orrVarB.e(view);
            orqVar.d(mewVar, orrVarB.a());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public oxv(mew mewVar, mew mewVar2, String str, orq orqVar) {
        long j = 0;
        this.b = 0L;
        this.e = orqVar;
        this.c = mewVar;
        this.d = mewVar2;
        this.a = str;
        if (mewVar != null) {
            j = 2;
            this.b = 2L;
        }
        if (mewVar2 != null) {
            this.b = j | 4;
        }
    }
}
