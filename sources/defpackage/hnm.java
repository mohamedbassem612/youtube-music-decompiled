package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hnm implements aajz {
    private final /* synthetic */ int $cid;
    public final hpy a;
    public final Executor b;
    public final grj c;

    public hnm(grj grjVar, hpy hpyVar, Executor executor, int i) {
        this.$cid = i;
        this.c = grjVar;
        this.a = hpyVar;
        this.b = executor;
    }

    @Override // defpackage.aajz
    public final ListenableFuture a(Collection collection) {
        if (this.$cid != 0) {
            List list = (List) j$.util.Collection.EL.stream(collection).map(new hfw(this, 9)).collect(Collectors.toList());
            return ahno.au(list).k(new ub(list, 12), this.b);
        }
        List list2 = (List) j$.util.Collection.EL.stream(collection).map(new hfw(this, 10)).collect(Collectors.toList());
        return ahng.g(list2).a(new ub(list2, 13), this.b);
    }

    @Override // defpackage.aajz
    public final Class b() {
        return this.$cid != 0 ? anjx.class : anuk.class;
    }
}
