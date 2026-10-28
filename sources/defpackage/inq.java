package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class inq implements ahcx {
    private final /* synthetic */ int $cid;

    public /* synthetic */ inq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahcx
    public final ListenableFuture a() {
        int i = this.$cid;
        if (i == 0) {
            Duration duration = inr.a;
            return aher.a;
        }
        if (i != 1) {
            return i != 2 ? aher.a : aher.a;
        }
        return aher.a;
    }
}
