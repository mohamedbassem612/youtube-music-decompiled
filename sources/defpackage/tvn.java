package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tvn implements tvh {
    public final sya a;
    private final tpq b;
    private final agek c;

    public tvn(tpq tpqVar, sya syaVar, agek agekVar) {
        tpqVar.getClass();
        this.b = tpqVar;
        this.a = syaVar;
        this.c = agekVar;
    }

    @Override // defpackage.tvh
    public final ListenableFuture a() {
        return ahcs.e(this.b.a(), new rwj(this.c, 11), MoreExecutors.directExecutor());
    }

    @Override // defpackage.tvh
    public final ListenableFuture b(Object obj) {
        return this.b.b(new tvm(this, obj, 0));
    }
}
