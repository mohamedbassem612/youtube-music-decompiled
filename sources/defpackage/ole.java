package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ole implements omb {
    public final ome a;
    public final olt b;
    public final Executor c;
    public final oii d;
    public final ong e;
    private final olt f;
    private final Uri g;
    private final Uri h;
    private final omj i;
    private final ayq j;

    public ole(ong ongVar, ome omeVar, olt oltVar, olt oltVar2, Uri uri, Uri uri2, omj omjVar, ayq ayqVar, Executor executor, oii oiiVar) {
        this.e = ongVar;
        this.a = omeVar;
        this.b = oltVar;
        this.f = oltVar2;
        this.g = uri;
        this.h = uri2;
        this.i = omjVar;
        this.j = ayqVar;
        this.c = executor;
        this.d = oiiVar;
    }

    private static ListenableFuture j() {
        return ahng.m(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void k(Uri uri) throws qqf {
        ayq ayqVar = this.j;
        if (ayqVar.ac(uri)) {
            ayqVar.aa(uri);
        }
    }

    @Override // defpackage.omb
    public final ListenableFuture a() {
        int iOrdinal = this.i.a().ordinal();
        int i = 1;
        if (iOrdinal == 1) {
            return this.a.a();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.a();
        }
        ListenableFuture listenableFutureB = b(this.a.a());
        oll ollVar = new oll(this, i);
        Executor executor = this.c;
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), ollVar, 1);
        int i2 = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureB, ahdbVar);
        listenableFutureB.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    public final ListenableFuture b(ListenableFuture listenableFuture) {
        kke kkeVar = new kke(20);
        Executor executor = this.c;
        return ahno.am(ahno.ar(listenableFuture, kkeVar, executor), Exception.class, new olk(1), executor);
    }

    @Override // defpackage.omb
    public final ListenableFuture c() {
        cru cruVar = new cru(7);
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.a.c();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.c();
        }
        ListenableFuture listenableFutureB = b(this.a.c());
        olb olbVar = new olb(this, cruVar, 17);
        Executor executor = this.c;
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), olbVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureB, ahdbVar);
        listenableFutureB.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.omb
    public final ListenableFuture d() {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            try {
                try {
                    k(this.g);
                    return this.a.d();
                } finally {
                    k(this.h);
                }
            } catch (IOException e) {
                return ahng.m(e);
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return j();
            }
            try {
                k(this.g);
                return this.f.d();
            } catch (IOException e2) {
                return ahng.m(e2);
            }
        }
        try {
            k(this.h);
            ListenableFuture listenableFutureD = this.a.d();
            ods odsVar = new ods(this, 20);
            Executor executor = this.c;
            long j = afwl.a;
            ahdb ahdbVar = new ahdb(afty.c(false), odsVar, 1);
            int i = ahcs.c;
            ahcq ahcqVar = new ahcq(listenableFutureD, ahdbVar);
            listenableFutureD.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
            return ahcqVar;
        } catch (IOException e3) {
            return ahng.m(e3);
        }
    }

    @Override // defpackage.omb
    public final ListenableFuture e(oiz oizVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.a.e(oizVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.e(oizVar);
        }
        return ahno.as(b(this.a.e(oizVar)), new olb((Object) this, (aihn) oizVar, 11), this.c);
    }

    @Override // defpackage.omb
    public final ListenableFuture f(agkz agkzVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.a.f(agkzVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.f(agkzVar);
        }
        return ahno.as(b(this.a.f(agkzVar)), new olb(this, agkzVar, 13), this.c);
    }

    @Override // defpackage.omb
    public final ListenableFuture g(oiz oizVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.a.g(oizVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.g(oizVar);
        }
        return ahno.as(b(this.a.g(oizVar)), new olb((Object) this, (aihn) oizVar, 15), this.c);
    }

    @Override // defpackage.omb
    public final ListenableFuture h(oiz oizVar, ojb ojbVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.a.h(oizVar, ojbVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? j() : this.f.h(oizVar, ojbVar);
        }
        return ahno.as(b(this.a.h(oizVar, ojbVar)), new okx(this, oizVar, ojbVar, 7), this.c);
    }

    public final ListenableFuture i(onu onuVar, onu onuVar2, int i) {
        this.d.p();
        if (onb.a(10000L)) {
            boolean zEquals = onuVar.equals(onuVar2);
            ong ongVar = this.e;
            if (zEquals) {
                ongVar.o(1106);
            } else {
                ongVar.o(i);
            }
        }
        return onuVar.a ? ahng.n(onuVar.a()) : ahng.m((Throwable) onuVar.b());
    }
}
