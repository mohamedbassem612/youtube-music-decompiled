package defpackage;

import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kbt extends hna {
    public final /* synthetic */ kbu a;

    public kbt(kbu kbuVar) {
        this.a = kbuVar;
    }

    @Override // defpackage.hna
    public final void I() {
        kbu kbuVar = this.a;
        kcb kcbVar = kbuVar.b;
        if (kcbVar != null) {
            try {
                kfm kfmVar = kbuVar.d;
                if (kfmVar != null) {
                    kfmVar.j();
                }
                kcbVar.k();
            } catch (RemoteException unused) {
                khn.e();
            }
            qcb qcbVar = this.a.e;
            if (qcbVar != null) {
                ((aepb) qcbVar.a).c(new keg(new kef(3)));
            }
        }
    }

    @Override // defpackage.hna
    public final void J(int i) {
        kro.w(this, i);
    }

    @Override // defpackage.hna
    public final void K(int i) {
        kcb kcbVar = this.a.b;
        if (kcbVar != null) {
            try {
                kcbVar.h(i);
            } catch (RemoteException unused) {
                khn.e();
            }
        }
    }

    @Override // defpackage.hna
    public final void L(int i) {
        kro.w(this, i);
    }
}
