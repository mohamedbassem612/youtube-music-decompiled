package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adac implements nrw {
    public final abxv a;
    private final Handler b;
    private final avmb c;

    public adac(abxv abxvVar, Handler handler, avmb avmbVar) {
        this.a = abxvVar;
        this.b = handler;
        this.c = avmbVar;
    }

    private final avlb d(String str, boolean z, int i, nrv nrvVar) {
        View viewA = nrvVar.a();
        if (viewA == null) {
            return avlb.e();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return avlb.n(new mgd(this, viewA, str, 15, (char[]) null)).v(this.c);
        }
        Handler handler = this.b;
        if (z) {
            handler.postDelayed(new adab(this, str, viewA, 1), i);
        } else {
            handler.post(new adab(this, str, viewA, 0));
        }
        return avlb.e();
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return aozp.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        aozp aozpVar = (aozp) obj;
        int i = aozpVar.c;
        if ((i & 1) != 0) {
            return d(aozpVar.d, (i & 2) != 0, aozpVar.e, nrvVar);
        }
        return avlb.e();
    }

    @Override // defpackage.nrw
    public final avlb e(mew mewVar, nrv nrvVar) {
        arzw arzwVar = (arzw) mewVar.d(arzw.d);
        if ((Memory.peekByte(arzwVar.c + 8) & 1) == 0) {
            return avlb.e();
        }
        if (arzwVar.f == null) {
            if ((Memory.peekByte(arzwVar.c + 8) & 1) != 0) {
                arzwVar.f = arzwVar.cq(arzy.e.b);
            } else {
                arzwVar.f = "";
            }
        }
        return d(arzwVar.f, (Memory.peekByte(arzwVar.c + 8) & 2) != 0, Memory.peekInt(arzwVar.c + 12, false), nrvVar);
    }
}
