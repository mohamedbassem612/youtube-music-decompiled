package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ige implements abor {
    public final Context a;
    public final igf b;
    public final igh c;
    private final Executor d;
    private final jij e;

    public ige(Context context, Executor executor, igf igfVar, igh ighVar, jij jijVar) {
        this.a = context;
        this.d = executor;
        this.b = igfVar;
        this.c = ighVar;
        this.e = jijVar;
    }

    public static int a(agke agkeVar, apzf apzfVar) {
        if (k(apzfVar)) {
            return -1;
        }
        int iMin = Math.min(agkeVar.size() - 1, Math.max(0, apzfVar.f));
        if (!(((apzfVar.c & 1) != 0 && !apzfVar.d.isEmpty()) || (apzfVar.c & 2) == 0 || apzfVar.e.isEmpty()) || apzfVar.d.equals(((anyx) agkeVar.get(iMin)).getAndroidMediaStoreContentUri())) {
            return iMin;
        }
        for (int i = 0; i < agkeVar.size(); i++) {
            if (((anyx) agkeVar.get(i)).getAndroidMediaStoreContentUri().equals(apzfVar.d)) {
                return i;
            }
        }
        return -1;
    }

    private final ListenableFuture j(ListenableFuture listenableFuture, apzf apzfVar) {
        return ahno.as(listenableFuture, new gqb(this, apzfVar, 12), this.d);
    }

    private static boolean k(apzf apzfVar) {
        if (apzfVar.d.isEmpty()) {
            apzg apzgVar = apzfVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.abor
    public final Pair b(abnl abnlVar, String str, abnp abnpVar, boolean z) {
        ListenableFuture listenableFutureJ;
        xsc xscVarI = i(abnlVar);
        Object obj = xscVarI.c;
        Optional optional = (Optional) xscVarI.b;
        if (optional.isPresent()) {
            listenableFutureJ = (ListenableFuture) optional.get();
        } else {
            ?? r3 = xscVarI.a;
            apzf apzfVarQ = gzj.Q(abnlVar);
            apzfVarQ.getClass();
            listenableFutureJ = j(r3, apzfVarQ);
        }
        return Pair.create(obj, listenableFutureJ);
    }

    @Override // defpackage.abor
    public final abrj c(abnl abnlVar, String str, abnp abnpVar, boolean z) {
        Pair pairB = b(abnlVar, str, abnpVar, z);
        return acqf.g((ListenableFuture) pairB.first, (ListenableFuture) pairB.second);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.abor
    public final ListenableFuture d(abnl abnlVar, String str, int i, aphs aphsVar, abnp abnpVar) {
        return i(abnlVar).c;
    }

    @Override // defpackage.abor
    public final ListenableFuture e(abnl abnlVar, abnp abnpVar) {
        apzf apzfVarQ = gzj.Q(abnlVar);
        apzfVarQ.getClass();
        return j(this.e.i(apzfVarQ), apzfVarQ);
    }

    @Override // defpackage.abor
    public final ListenableFuture f(abnl abnlVar, abnt abntVar, xir xirVar, abnp abnpVar) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.abor
    public final ListenableFuture g(abnl abnlVar, aooj aoojVar, xir xirVar, abnp abnpVar) {
        return i(abnlVar).c;
    }

    @Override // defpackage.abor
    public final ListenableFuture h(String str, abnl abnlVar, abnp abnpVar, aphs aphsVar, boolean z) {
        return d(abnlVar, str, 0, null, abnpVar);
    }

    public final xsc i(abnl abnlVar) {
        ListenableFuture listenableFutureAr;
        ListenableFuture listenableFutureAr2;
        apzf apzfVarQ = gzj.Q(abnlVar);
        apzfVarQ.getClass();
        ListenableFuture listenableFutureI = this.e.i(apzfVarQ);
        if (k(apzfVarQ)) {
            gqb gqbVar = new gqb(this, apzfVarQ, 11);
            Executor executor = this.d;
            ListenableFuture listenableFutureAs = ahno.as(listenableFutureI, gqbVar, executor);
            listenableFutureAr2 = ahno.ar(listenableFutureAs, new iam(12), executor);
            listenableFutureAr = ahno.ar(listenableFutureAs, new iat(this, 18), executor);
        } else {
            listenableFutureAr = ahno.ar(listenableFutureI, new idw(this, apzfVarQ, 2), this.d);
            listenableFutureAr2 = null;
        }
        return new xsc(listenableFutureI, listenableFutureAr, Optional.ofNullable(listenableFutureAr2));
    }
}
