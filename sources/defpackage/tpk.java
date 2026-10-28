package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tpk implements tpq {
    public final awmd a;
    public final sya b;
    private final tpq c;

    public tpk(awmd awmdVar, tpq tpqVar, sya syaVar) {
        this.a = awmdVar;
        this.c = tpqVar;
        this.b = syaVar;
    }

    @Override // defpackage.tpq
    public final ListenableFuture a() {
        return ahcs.e(this.c.a(), new rwj(this, 7), MoreExecutors.directExecutor());
    }

    @Override // defpackage.tpq
    public final ListenableFuture b(agek agekVar) {
        return this.c.b(new kjh(this, agekVar, 20, null));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.tpq
    public final MessageLite c() {
        return this.b.a(this.a.io(), this.c.c());
    }

    @Override // defpackage.tpq
    public final avlh d() {
        return this.c.d().H(new ibj(this, 20));
    }
}
