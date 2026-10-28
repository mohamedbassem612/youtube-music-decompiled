package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ufr implements rbq {
    public final agbv b;
    public final apsd c;
    public final Optional d;
    public final long e;
    public final Optional f;
    public final Optional g;
    public final askh h;
    public final aczl i;

    public ufr(agbv agbvVar, apsd apsdVar, Optional optional, long j, Optional optional2, Optional optional3, askh askhVar, aczl aczlVar) {
        this.b = agbvVar;
        this.c = apsdVar;
        this.d = optional;
        this.e = j;
        this.f = optional2;
        this.g = optional3;
        this.h = askhVar;
        this.i = aczlVar;
    }

    @Override // defpackage.rbs
    public final Optional a() {
        return this.f;
    }

    @Override // defpackage.rbs
    public final void b(aueh auehVar) {
        k(new ufo(this, auehVar, 2));
    }

    @Override // defpackage.rbr
    public final void c(asjv asjvVar) {
        k(new ufo(this, asjvVar, 4));
    }

    @Override // defpackage.rbr
    public final void d() {
        k(new ufp(this, 2));
    }

    @Override // defpackage.rbr
    public final void e(long j) {
        if (((adbm) this.i.a).a()) {
            k(new ufn(this, j, 0));
        }
    }

    @Override // defpackage.rbr
    public final void f(Optional optional) {
        if (((adbm) this.i.a).a()) {
            k(new ufo(this, optional, 3));
        }
    }

    @Override // defpackage.rbr
    public final void g(long j) {
        if (((adbm) this.i.a).a()) {
            k(new ufn(this, j, 1));
        }
    }

    @Override // defpackage.rbs
    public final void h(quk qukVar) {
        k(new ufo(this, qukVar, 0));
    }

    @Override // defpackage.rbs, defpackage.rbr
    public final void i() {
        k(new ufp(this, 0));
    }

    @Override // defpackage.rbs
    public final void j(apsh apshVar) {
        k(new ufo(this, apshVar, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void k(ufq ufqVar) {
        aczl aczlVar = this.i;
        aczlVar.b.execute(new jup(aczlVar.c.f().toEpochMilli(), ufqVar, 11));
    }

    public final void l(agke agkeVar) {
        aczl aczlVar = this.i;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aczlVar.e;
        concurrentHashMap.put(Long.valueOf(this.e), agkeVar);
        agke agkeVar2 = (agke) Collection.EL.stream(concurrentHashMap.values()).flatMap(new snm(9)).distinct().collect(aghu.a);
        aepy aepyVar = (aepy) ((qcb) aczlVar.d).a;
        aepyVar.c = agkeVar2;
        if (aepyVar.d.l(54, 45401589L, false)) {
            ((ahud) aepyVar.a.io()).Y(aepw.a);
        }
    }
}
