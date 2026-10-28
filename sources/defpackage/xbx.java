package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xbx extends qa {
    final /* synthetic */ xby a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbx(xby xbyVar) {
        super((byte[]) null);
        this.a = xbyVar;
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        xby xbyVar = this.a;
        if (recyclerView == xbyVar.i()) {
            xbyVar.c();
            xbyVar.e = i;
            xbyVar.l.kk(Boolean.valueOf(i == 1));
            if (xbyVar.e == 1) {
                xbyVar.d = false;
                return;
            }
            if (xbyVar.f()) {
                xbyVar.d = false;
            } else if (xbyVar.d) {
                xbyVar.d();
            } else {
                xbyVar.a(10000L);
            }
        }
    }
}
