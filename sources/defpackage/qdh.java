package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qdh implements qdg {
    final awmd a;
    final awmd b;
    final awmd c;

    public qdh(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
    }

    @Override // defpackage.qdg
    public final ListenableFuture a() {
        return ahng.n(new qde(this, 2));
    }
}
