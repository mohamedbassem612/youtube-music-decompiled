package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abqm implements yqh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public abqm(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.yqh
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((abqj) obj).a.T();
        } else {
            ((abqn) obj).a.T();
        }
    }

    @Override // defpackage.yqh
    public final void b() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            ((abqj) obj).a.U();
        } else {
            ((abqn) obj).a.U();
        }
    }

    @Override // defpackage.yqh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.yqh
    public final ListenableFuture d(Executor executor, tnm tnmVar) {
        if (this.$cid != 0) {
            throw new IllegalStateException("requestQueueV2 should not parseNetworkResponse from InnertubeRequest");
        }
        throw new IllegalStateException("requestQueueV2 should not parseNetworkResponse from InnertubeRequest");
    }
}
