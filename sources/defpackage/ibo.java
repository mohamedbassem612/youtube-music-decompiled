package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibo implements abhz {
    private final hpy a;
    private final Executor b;

    public ibo(hpy hpyVar, Executor executor) {
        this.a = hpyVar;
        this.b = executor;
    }

    @Override // defpackage.abhz
    public final ListenableFuture a(agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return ahng.n(agpi.a);
        }
        return ahcs.e(this.a.b(((agkz) Collection.EL.stream(agkeVar).map(new iaa(7)).collect(aghu.b)).g()), afwl.a(new iat(agkeVar, 7)), this.b);
    }
}
