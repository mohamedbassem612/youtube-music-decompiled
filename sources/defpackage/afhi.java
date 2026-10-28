package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhi implements ahcy {
    public final List a;
    public final int b;
    public final Executor c;
    public int d = -1;
    private final agex e;
    private final ahcy f;

    public afhi(List list, agex agexVar, Executor executor) {
        this.a = list;
        this.b = list.size();
        this.e = agexVar;
        this.c = executor;
        long j = afwl.a;
        this.f = new ahdb(afty.c(false), this, 1);
    }

    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        if (this.e.a(obj)) {
            return obj == null ? aher.a : new aher(obj);
        }
        return b();
    }

    public final ListenableFuture b() {
        int i = this.d + 1;
        this.d = i;
        if (i >= this.b) {
            return aher.a;
        }
        ListenableFuture listenableFuture = (ListenableFuture) this.a.get(i);
        ahcy ahcyVar = this.f;
        Executor executor = this.c;
        int i2 = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFuture, ahcyVar);
        listenableFuture.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }
}
