package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aepq extends qjs {
    final /* synthetic */ aesz a;
    final /* synthetic */ aepr b;

    public aepq(aepr aeprVar, aesz aeszVar) {
        this.a = aeszVar;
        this.b = aeprVar;
    }

    @Override // defpackage.qjs
    protected final ListenableFuture c(axhz axhzVar) {
        boolean z = false;
        if (axhzVar != null && (axhzVar.b & 64) != 0) {
            z = true;
        }
        aeqj aeqjVar = new aeqj(this.a.b, axhzVar, z);
        axhq axhqVar = axhzVar.h;
        if (axhqVar == null) {
            axhqVar = axhq.a;
        }
        int iBt = a.bt(axhqVar.g);
        if (iBt == 0 || iBt != 6) {
            boolean z2 = aeqjVar.c;
            aepr aeprVar = this.b;
            if (z2) {
                aeprVar.a.e(aeqjVar);
            } else {
                aeprVar.a.c(aeqjVar);
            }
        } else {
            aepr aeprVar2 = this.b;
            aqiy aqiyVar = aeprVar2.b.io().e;
            if (aqiyVar == null) {
                aqiyVar = aqiy.a;
            }
            if (aqiyVar.q) {
                aeprVar2.c.kk(aeqjVar);
            }
        }
        return aher.a;
    }
}
