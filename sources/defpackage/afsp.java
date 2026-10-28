package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afsp implements afso {
    private final /* synthetic */ int $cid;
    final /* synthetic */ ahcy a;
    final /* synthetic */ Object b;

    public afsp(ahcy ahcyVar, Object obj, int i) {
        this.$cid = i;
        this.a = ahcyVar;
        this.b = obj;
    }

    @Override // defpackage.afso
    public final ListenableFuture a() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.a(this.b);
        }
        ahcy ahcyVar = this.a;
        Object obj = this.b;
        return i != 1 ? ahcyVar.a(obj) : ahcyVar.a(obj);
    }

    @Override // defpackage.afso
    public final ListenableFuture b(Duration duration) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? aher.a : aher.a;
        }
        return aher.a;
    }
}
