package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acra {
    public final long a;
    public volatile long b;
    public final boolean c;
    public final aigj d;
    public final awly e;
    public ajwo f;
    public acut g;
    public alqc h;
    public acrp i;
    public long j;
    public final AtomicLong k;
    public final long l;
    public boolean m;
    public boolean n;
    public final List o;
    public long p;
    public volatile long q;
    public final boolean r;
    private awly s;
    private avlr t;
    private final hno u;

    /* JADX WARN: Code duplicated, block: B:7:0x0060  */
    public acra(long j, long j2, ajwo ajwoVar, aigj aigjVar, long j3, boolean z, hno hnoVar, adif adifVar) {
        boolean z2;
        awly awlyVarAz = new awli().az();
        this.s = awlyVarAz;
        this.t = awlyVarAz.r();
        this.j = Long.MIN_VALUE;
        this.k = new AtomicLong(0L);
        new AtomicBoolean(false);
        this.m = false;
        Optional.empty();
        this.n = false;
        this.o = new ArrayList();
        this.p = 0L;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            z2 = true;
        } else {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        ahno.O(z2);
        this.b = j;
        this.q = j2;
        ajwoVar.getClass();
        this.f = ajwoVar;
        this.d = aigjVar;
        this.l = j3;
        this.r = z;
        this.a = ((AtomicLong) adifVar.a).getAndIncrement();
        this.u = hnoVar;
        this.e = new awli(this.f).az();
        int iAB = aecm.aB(ajwoVar);
        this.c = iAB == 4 || iAB == 3 || iAB == 5;
    }

    public final acra a() {
        List list = this.o;
        if (!list.isEmpty()) {
            long j = this.p;
            if (j >= 0 && j < list.size()) {
                return (acra) list.get((int) this.p);
            }
        }
        return null;
    }

    public final apef b() {
        ajwo ajwoVar = this.f;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apef.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (apef) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public final apfp c() {
        ajwo ajwoVar = this.f;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public final avlr d() {
        return this.u.aO() ? this.t : this.s;
    }

    public final String e() {
        return aecm.ad(this.f);
    }

    public final void f() {
        this.h = null;
    }

    public final void g() {
        this.h = null;
        this.g = null;
        acrp acrpVar = this.i;
        if (acrpVar != null) {
            acrpVar.M();
            this.i = null;
        }
        hno hnoVar = this.u;
        if (hnoVar.s()) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((acra) it.next()).g();
            }
        }
        if (((vxz) hnoVar.i).l(197, 45761219L, false)) {
            this.s.kn();
            awly awlyVarAz = new awli().az();
            this.s = awlyVarAz;
            this.t = awlyVarAz.r();
        }
    }

    public final void h(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        boolean z = true;
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (!ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                z = false;
            }
        }
        ahno.O(z);
        ajwoVar.getClass();
        this.f = ajwoVar;
        this.g = null;
        this.e.kk(ajwoVar);
    }

    public final void i(alqc alqcVar, boolean z) {
        if (this.u.aO()) {
            this.h = alqcVar;
            if (z) {
                this.s.kk(alqcVar);
                return;
            }
            return;
        }
        if (this.h != alqcVar) {
            this.h = alqcVar;
            this.s.kk(alqcVar);
        }
    }

    public final boolean j() {
        return aawr.w(this.f);
    }

    public final boolean k() {
        ajwo ajwoVar = this.f;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apef.b);
        ajwoVar.c(aihlVarCheckIsLite);
        return ajwoVar.j.n(aihlVarCheckIsLite.d);
    }

    public final boolean l() {
        return !this.o.isEmpty();
    }

    public final boolean m() {
        ajwo ajwoVar = this.f;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        return ajwoVar.j.n(aihlVarCheckIsLite.d) && !j();
    }
}
