package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olc implements ola {
    public final olq a;
    public final Executor b;
    private final omc c;
    private final olq d;
    private final Uri e;
    private final Uri f;
    private final oii g;
    private final ong h;
    private final omj i;
    private final ayq j;

    public olc(ong ongVar, omc omcVar, olq olqVar, olq olqVar2, Uri uri, Uri uri2, omj omjVar, ayq ayqVar, Executor executor, oii oiiVar) {
        this.h = ongVar;
        this.c = omcVar;
        this.d = olqVar2;
        this.a = olqVar;
        this.e = uri;
        this.f = uri2;
        this.i = omjVar;
        this.j = ayqVar;
        this.b = executor;
        this.g = oiiVar;
    }

    private static ListenableFuture q() {
        return ahng.m(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) throws qqf {
        ayq ayqVar = this.j;
        if (ayqVar.ac(uri)) {
            ayqVar.aa(uri);
        }
    }

    @Override // defpackage.ola
    public final ListenableFuture a(oip oipVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.a(oipVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.a(oipVar);
        }
        return ahno.as(n(this.c.a(oipVar)), new olb((Object) this, (aihn) oipVar, 7), this.b);
    }

    @Override // defpackage.ola
    public final ListenableFuture b() {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.b();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.b();
        }
        ListenableFuture listenableFutureN = n(this.c.b());
        ods odsVar = new ods(this, 17);
        Executor executor = this.b;
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), odsVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureN, ahdbVar);
        listenableFutureN.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.ola
    public final ListenableFuture c() {
        cru cruVar = new cru(6);
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.c();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.c();
        }
        ListenableFuture listenableFutureN = n(this.c.c());
        okn oknVar = new okn(this, cruVar, 13);
        Executor executor = this.b;
        long j = afwl.a;
        ahcq ahcqVar = new ahcq(listenableFutureN, new ahdb(afty.c(false), oknVar, 1));
        listenableFutureN.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.ola
    public final ListenableFuture d() {
        cru cruVar = new cru(5);
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.d();
        }
        int i = 3;
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.d();
        }
        ListenableFuture listenableFutureN = n(this.c.d());
        olb olbVar = new olb(this, cruVar, i);
        Executor executor = this.b;
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), olbVar, 1);
        int i2 = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureN, ahdbVar);
        listenableFutureN.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.ola
    public final ListenableFuture e() {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.e();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.e();
        }
        ListenableFuture listenableFutureN = n(this.c.e());
        ods odsVar = new ods(this, 19);
        Executor executor = this.b;
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), odsVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureN, ahdbVar);
        listenableFutureN.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.ola
    public final ListenableFuture f() {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            try {
                try {
                    r(this.e);
                    return aher.a;
                } finally {
                    r(this.f);
                }
            } catch (IOException e) {
                return ahng.m(e);
            }
        }
        if (iOrdinal == 2) {
            try {
                r(this.f);
                return aher.a;
            } catch (IOException e2) {
                return ahng.m(e2);
            }
        }
        if (iOrdinal != 3) {
            return q();
        }
        try {
            r(this.e);
            return aher.a;
        } catch (IOException e3) {
            return ahng.m(e3);
        }
    }

    @Override // defpackage.ola
    public final ListenableFuture g(oiw oiwVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.g(oiwVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.g(oiwVar);
        }
        return ahno.as(n(this.c.g(oiwVar)), new olb((Object) this, (aihn) oiwVar, 6), this.b);
    }

    @Override // defpackage.ola
    public final ListenableFuture h(oiw oiwVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.h(oiwVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.h(oiwVar);
        }
        return ahno.as(n(this.c.h(oiwVar)), new olb((Object) this, (aihn) oiwVar, 0), this.b);
    }

    @Override // defpackage.ola
    public final ListenableFuture i(oiw oiwVar) {
        int iOrdinal = this.i.a().ordinal();
        int i = 1;
        if (iOrdinal == 1) {
            return this.c.i(oiwVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.i(oiwVar);
        }
        return ahno.as(n(this.c.i(oiwVar)), new olb((Object) this, (aihn) oiwVar, i), this.b);
    }

    @Override // defpackage.ola
    public final ListenableFuture j(List list) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.j(list);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.j(list);
        }
        ListenableFuture listenableFutureN = n(this.c.j(list));
        olb olbVar = new olb(this, list, 4);
        Executor executor = this.b;
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), olbVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureN, ahdbVar);
        listenableFutureN.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.ola
    public final ListenableFuture k() {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.k();
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.k();
        }
        ListenableFuture listenableFutureN = n(this.c.k());
        ods odsVar = new ods(this, 18);
        Executor executor = this.b;
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), odsVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureN, ahdbVar);
        listenableFutureN.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    @Override // defpackage.ola
    public final ListenableFuture l(oiw oiwVar, oip oipVar) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.l(oiwVar, oipVar);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.l(oiwVar, oipVar);
        }
        return ahno.as(n(this.c.l(oiwVar, oipVar)), new okx((Object) this, (Object) oiwVar, (Object) oipVar, 3, (byte[]) null), this.b);
    }

    @Override // defpackage.ola
    public final ListenableFuture m(List list) {
        int iOrdinal = this.i.a().ordinal();
        if (iOrdinal == 1) {
            return this.c.m(list);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? q() : this.d.m(list);
        }
        ListenableFuture listenableFutureN = n(this.c.m(list));
        okn oknVar = new okn(this, list, 17);
        Executor executor = this.b;
        long j = afwl.a;
        ahdb ahdbVar = new ahdb(afty.c(false), oknVar, 1);
        int i = ahcs.c;
        ahcq ahcqVar = new ahcq(listenableFutureN, ahdbVar);
        listenableFutureN.addListener(ahcqVar, MoreExecutors.c(executor, ahcqVar));
        return ahcqVar;
    }

    public final ListenableFuture n(ListenableFuture listenableFuture) {
        kke kkeVar = new kke(18);
        Executor executor = this.b;
        return ahno.am(ahno.ar(listenableFuture, kkeVar, executor), Exception.class, new kke(19), executor);
    }

    public final ListenableFuture o(onu onuVar, onu onuVar2, int i) {
        this.g.p();
        if (onb.a(10000L)) {
            boolean zEquals = onuVar.equals(onuVar2);
            ong ongVar = this.h;
            if (zEquals) {
                ongVar.o(1107);
            } else {
                ongVar.o(i);
            }
        }
        return onuVar.a ? ahng.n(onuVar.a()) : ahng.m((Throwable) onuVar.b());
    }

    public final ListenableFuture p(onu onuVar, onu onuVar2, Comparator comparator, int i) {
        this.g.p();
        if (onb.a(10000L)) {
            boolean zD = onu.d(onuVar, onuVar2, comparator);
            ong ongVar = this.h;
            if (zD) {
                ongVar.o(1106);
            } else {
                ongVar.o(i);
            }
        }
        if (onuVar.a) {
            List list = (List) onuVar.a();
            list.getClass();
            return ahng.n(list);
        }
        Object objB = onuVar.b();
        objB.getClass();
        return ahng.m((Throwable) objB);
    }
}
