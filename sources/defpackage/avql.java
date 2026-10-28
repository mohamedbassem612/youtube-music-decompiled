package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avql extends avlb {
    final avle[] a;

    public avql(avle[] avleVarArr) {
        this.a = avleVarArr;
    }

    @Override // defpackage.avlb
    public final void H(avlc avlcVar) {
        avmm avmmVar = new avmm();
        avqk avqkVar = new avqk(avlcVar, new AtomicBoolean(), avmmVar);
        avlcVar.d(avmmVar);
        for (int i = 0; i < 2; i++) {
            avle avleVar = this.a[i];
            if (avmmVar.b) {
                return;
            }
            if (avleVar == null) {
                avmmVar.dispose();
                avqkVar.b(new NullPointerException("A completable source is null"));
                return;
            }
            avleVar.kp(avqkVar);
        }
        avqkVar.kn();
    }
}
