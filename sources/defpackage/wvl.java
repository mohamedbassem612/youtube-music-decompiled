package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wvl {
    public agek a;
    public agek b;
    public Boolean c;
    private final awmd d;
    private final awmd e;
    private final tqj f;

    public wvl(awmd awmdVar, awmd awmdVar2, tqj tqjVar) {
        this.d = awmdVar;
        this.e = awmdVar2;
        this.f = tqjVar;
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureN;
        Boolean bool = this.c;
        if (bool != null) {
            tqj tqjVar = this.f;
            int i = tqr.a;
            if (tqjVar.k(1073830190)) {
                tqh tqhVarD = tqjVar.d(1);
                tqhVarD.b(1073830208, true != bool.booleanValue() ? 0L : 1L);
                tqhVarD.a();
            }
        }
        byte[] bArr = null;
        if (this.c != null) {
            syn synVar = (syn) this.e.io();
            listenableFutureN = synVar.a(new qzc((Object) synVar, (Object) new vdm(this, 19), (Object) MoreExecutors.directExecutor(), 5, (byte[]) null));
        } else {
            listenableFutureN = ahng.n(null);
        }
        ListenableFuture listenableFutureN2 = (this.a == null && this.b == null) ? ahng.n(null) : ((qrx) this.d.io()).a(new vdm(this, 20), MoreExecutors.directExecutor());
        return ahng.h(listenableFutureN, listenableFutureN2).b(new wan(listenableFutureN, listenableFutureN2, 3, bArr), MoreExecutors.directExecutor());
    }
}
