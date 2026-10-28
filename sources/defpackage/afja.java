package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afja implements afrf {
    public static final agrf a = agrf.h("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet");
    public static final long b;
    public final mbc c;
    public final afid d;
    public final afhw e;
    public final ahex f;
    public final ahex g;
    public final abhh h;
    public final abhh i;
    private final auor j;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        b = 2592000000L;
    }

    public afja(mbc mbcVar, abhh abhhVar, afid afidVar, afhw afhwVar, ahex ahexVar, ahex ahexVar2, abhh abhhVar2, auor auorVar) {
        this.c = mbcVar;
        this.i = abhhVar;
        this.d = afidVar;
        this.e = afhwVar;
        this.f = ahexVar;
        this.g = ahexVar2;
        this.h = abhhVar2;
        this.j = auorVar;
    }

    public final ListenableFuture a() {
        return this.j.d(afwl.c(new afgi(this, 4)), this.g);
    }

    @Override // defpackage.afrf
    public final ListenableFuture b() {
        ahcx ahcxVarC = afwl.c(new afgi(this, 3));
        ahex ahexVar = this.f;
        return ahbz.e(ahng.s(ahcxVarC, ahexVar), Throwable.class, afwl.a(new aeni(8)), ahexVar);
    }
}
