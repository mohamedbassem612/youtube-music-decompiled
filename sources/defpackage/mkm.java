package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mkm implements ntp {
    final /* synthetic */ asnu a;
    public final /* synthetic */ mkn b;
    final /* synthetic */ adfx c;

    public mkm(mkn mknVar, adfx adfxVar, asnu asnuVar) {
        this.c = adfxVar;
        this.a = asnuVar;
        this.b = mknVar;
    }

    @Override // defpackage.ntp
    public final void d(View view, View view2) {
        mkn.c();
        Object[] objArr = {this.a};
        aguu.j(objArr, 1);
        agpi agpiVar = new agpi(objArr, 1);
        if (view2 != null) {
            view = view2;
        }
        adfx adfxVar = this.c;
        adfxVar.i(agpiVar, 2, new qlb(this, view, adfxVar, 1));
    }
}
