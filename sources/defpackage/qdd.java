package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qdd implements qdg {
    public final mbc a;
    public final awmd b;

    public qdd(mbc mbcVar, awmd awmdVar) {
        this.a = mbcVar;
        this.b = awmdVar;
    }

    @Override // defpackage.qdg
    public final ListenableFuture a() {
        return ahng.n(new qde(this, 1));
    }
}
