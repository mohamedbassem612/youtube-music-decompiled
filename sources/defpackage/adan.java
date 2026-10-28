package defpackage;

import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adan implements nrw {
    private final aeew a;
    private final xgm b;

    public adan(aeew aeewVar, xgm xgmVar) {
        this.a = aeewVar;
        this.b = xgmVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return aqnz.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        aqnz aqnzVar = (aqnz) obj;
        if ((aqnzVar.c & 1) == 0) {
            return avlb.e();
        }
        alhq alhqVar = aqnzVar.d;
        if (alhqVar == null) {
            alhqVar = alhq.a;
        }
        alhq alhqVar2 = alhqVar;
        View viewA = nrvVar.a();
        if (viewA == null) {
            return avlb.e();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return avlb.n(new mgd(this, alhqVar2, viewA, 16, (short[]) null)).v(avmh.a());
        }
        d(alhqVar2, viewA);
        return avlb.e();
    }

    public final void d(alhq alhqVar, View view) {
        int i = alhqVar.b;
        if ((i & 16) == 0 && (i & 64) == 0) {
            this.a.d(alhqVar, view, this.b.hB());
        } else {
            this.a.b(alhqVar, view, alhqVar, this.b.hB());
        }
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}
