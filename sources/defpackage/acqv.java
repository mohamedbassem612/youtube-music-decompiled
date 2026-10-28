package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acqv extends acqc {
    final /* synthetic */ acqx n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acqv(acqx acqxVar, Context context, hno hnoVar, float f, float f2) {
        super(context, hnoVar, f, f2);
        this.n = acqxVar;
    }

    @Override // defpackage.od
    protected final void c(View view, ob obVar) {
        acqx acqxVar = this.n;
        int[] iArrC = acqxVar.c(acqxVar.b.z, view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iJ = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (iJ > 0) {
            obVar.b(i, i2, iJ, this.j);
        }
    }
}
