package defpackage;

import j$.util.Optional;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aciw implements acjd {
    public final TreeMap a = new TreeMap();
    public long b;
    public final long c;
    public final Optional d;
    public final Optional e;
    public acjb f;
    public final tyy g;
    public final String h;
    public final wjf i;
    public final int j;
    public final aigj k;
    public final abxz l;
    public final String m;
    public final boolean n;
    public final Optional o;

    public aciw(acjb acjbVar, tyy tyyVar, long j, long j2, Long l, Long l2, String str, wjf wjfVar, int i, aigj aigjVar, abxz abxzVar, String str2, boolean z, Optional optional) {
        this.f = acjbVar;
        this.g = tyyVar;
        this.i = wjfVar;
        this.h = str;
        this.b = l(wjfVar, j2);
        this.j = i;
        this.c = j;
        this.d = Optional.ofNullable(l);
        this.e = Optional.ofNullable(l2);
        this.k = aigjVar;
        this.l = abxzVar;
        this.m = str2;
        this.n = z;
        this.o = optional;
    }

    private static long l(wjf wjfVar, long j) {
        return (wjfVar.V() || wjfVar.Y() || wjfVar.Q()) ? j : Math.min(j, wjfVar.d());
    }

    @Override // defpackage.acjd
    public final acjb a() {
        acjb acjbVar = this.f;
        acjbVar.getClass();
        return acjbVar;
    }

    @Override // defpackage.acjd
    public final String b() {
        return this.h;
    }

    @Override // defpackage.acjd
    public final void c(acjb acjbVar) {
        this.f = acjbVar;
    }

    public final long d() {
        rub rubVar = new rub(this, 7);
        Optional optionalEmpty = this.e;
        if (true == optionalEmpty.isPresent()) {
            if (((Long) optionalEmpty.get()).longValue() > ((aciw) rubVar.a).b) {
                optionalEmpty = Optional.empty();
            }
        }
        return ((Long) optionalEmpty.orElse(-1L)).longValue();
    }

    public final long e() {
        return ((Long) this.d.orElse(-1L)).longValue();
    }

    final aciu f(long j) {
        return k(j, this.b, null);
    }

    public final aciw g(long j) {
        try {
            acjb acjbVar = (acjb) this.a.get(Long.valueOf(j));
            if (acjbVar == null) {
                return null;
            }
            acjd acjdVar = acjbVar.h;
            if (acjdVar instanceof aciw) {
                return (aciw) acjdVar;
            }
            return null;
        } catch (NullPointerException unused) {
            zvp.a(zvn.b, zvm.k, "Null key in childMap.");
            return null;
        }
    }

    public final void h(acjb acjbVar) {
        acjbVar.i = this;
        this.a.put(Long.valueOf(acjbVar.a), acjbVar);
    }

    public final void i(long j) {
        long jL = l(this.i, j);
        long j2 = this.b;
        if (j2 != jL) {
            acjb acjbVar = this.f;
            if (acjbVar != null) {
                aciw aciwVar = acjbVar.i;
                acjb acjbVarW = acjbVar.w();
                if (j() && acjbVar.g && aciwVar != null && acjbVarW != null) {
                    for (acjb acjbVar2 : aciwVar.a.tailMap(Long.valueOf(acjbVar.a)).values()) {
                        long j3 = j2 - jL;
                        acjbVarW.L(acjbVar2);
                        if (acjbVar2 == acjbVar) {
                            acjbVar2.j -= j3;
                        } else {
                            acjbVar2.k -= j3;
                        }
                        acjbVarW.H(acjbVar2);
                    }
                }
            }
            this.b = jL;
        }
    }

    public final boolean j() {
        wjf wjfVar = this.i;
        return wjfVar.f() != null && wjfVar.f().ag();
    }

    final aciu k(long j, long j2, zgp zgpVar) {
        Object objA = this.g.a();
        if (objA == null) {
            return null;
        }
        long jE = e();
        long jD = d();
        wjf wjfVar = this.i;
        boolean z = false;
        if (!wjfVar.V() && j2 >= wjfVar.d()) {
            z = true;
        }
        return new aciu((acfs) objA, j, j2, jE, jD, z, zgpVar);
    }
}
