package defpackage;

import android.text.TextPaint;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mrn extends frp {
    public final String a;
    private final nry b;
    private final ntx c;
    private final omj d;
    private final omj e;

    public mrn(mxe mxeVar, nry nryVar, omj omjVar, ntx ntxVar, nsl nslVar) {
        this.b = nryVar;
        this.c = ntxVar;
        this.d = mxeVar.n() ? omjVar.B(mxeVar.j(), nslVar) : null;
        this.a = (mxeVar.o() && mxeVar.k().h() && mxeVar.k().g().h()) ? mxeVar.k().g().g() : null;
        this.e = mxeVar.m() ? omjVar.B(mxeVar.i(), nslVar) : null;
    }

    @Override // defpackage.frp
    public final boolean a() {
        return this.d != null;
    }

    @Override // defpackage.frp
    public final boolean b() {
        return this.e != null;
    }

    @Override // defpackage.frp
    public final boolean c(View view) {
        omj omjVar = this.e;
        if (omjVar == null) {
            return false;
        }
        nry nryVar = this.b;
        CommandOuterClass$Command commandOuterClass$CommandX = omjVar.x();
        nrt nrtVarD = nrv.d();
        nrtVarD.d(view);
        nrtVarD.g = this.c;
        nryVar.a(commandOuterClass$CommandX, nrtVarD.a()).D();
        return true;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        omj omjVar = this.d;
        if (omjVar != null) {
            nry nryVar = this.b;
            CommandOuterClass$Command commandOuterClass$CommandX = omjVar.x();
            nrt nrtVarD = nrv.d();
            nrtVarD.d(view);
            nrtVarD.g = this.c;
            nryVar.a(commandOuterClass$CommandX, nrtVarD.a()).D();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
