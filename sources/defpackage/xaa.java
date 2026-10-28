package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xaa extends ClickableSpan {
    final /* synthetic */ adly a;
    final /* synthetic */ ampd b;
    final /* synthetic */ xac c;

    public xaa(xac xacVar, adly adlyVar, ampd ampdVar) {
        this.a = adlyVar;
        this.b = ampdVar;
        this.c = xacVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        xac xacVar = this.c;
        xacVar.r = true;
        xacVar.hU(this.a, this.b);
    }
}
