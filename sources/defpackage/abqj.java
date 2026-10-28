package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abqj implements yrw, tmw, tns {
    public wlo a;
    final /* synthetic */ abql b;
    private final /* synthetic */ wlo c;
    private yrr d;
    private final xir e;
    private final ypp f;

    public abqj(abql abqlVar, yrr yrrVar, ypp yppVar, wlo wloVar, xir xirVar) {
        this.b = abqlVar;
        this.c = wloVar;
        this.d = yrrVar;
        this.f = yppVar;
        this.a = wloVar;
        this.e = xirVar;
    }

    @Override // defpackage.tns
    public final void A(agek agekVar) {
        this.c.j = agekVar;
    }

    @Override // defpackage.tns
    public final void B(tok tokVar) {
        throw null;
    }

    @Override // defpackage.tns
    public final boolean C() {
        return this.c.g;
    }

    @Override // defpackage.tns
    public final boolean D() {
        return this.c.e;
    }

    @Override // defpackage.tns
    public final boolean E() {
        return this.c.E();
    }

    @Override // defpackage.tns
    public final boolean F() {
        return true;
    }

    @Override // defpackage.tns
    public final boolean G() {
        return this.c.f;
    }

    @Override // defpackage.tns
    public final boolean H() {
        return this.c.H();
    }

    @Override // defpackage.tns
    public final boolean I() {
        return this.c.c;
    }

    @Override // defpackage.tns
    public final boolean J() {
        return true;
    }

    @Override // defpackage.tns
    public final void K(Object obj) {
        throw null;
    }

    @Override // defpackage.tns
    public final List L() {
        return agpi.a;
    }

    @Override // defpackage.tns
    public final int M() {
        return this.c.k;
    }

    @Override // defpackage.tmw
    public final /* synthetic */ tmu P(Object obj) {
        tmu tmuVar;
        tmu tmuVar2;
        alyi alyiVar = (alyi) obj;
        Iterator<E> it = this.b.g.iterator();
        do {
            tmuVar = null;
            if (!it.hasNext()) {
                break;
            }
            abqh abqhVar = (abqh) it.next();
            agkz agkzVar = abqhVar.a;
            aqdr aqdrVarA = aqdr.a(alyiVar.h);
            if (aqdrVarA == null) {
                aqdrVarA = aqdr.STREAMING_WATCH_RESPONSE_TYPE_UNKNOWN;
            }
            if (agkzVar.contains(aqdrVarA)) {
                String strY = abqhVar.h().Y();
                strY.getClass();
                MessageLite messageLiteA = abqhVar.b.a(alyiVar);
                messageLiteA.getClass();
                tmuVar2 = new tmu(strY, messageLiteA);
            } else {
                tmuVar2 = null;
            }
            if (tmuVar2 != null) {
                abmw abmwVar = abmw.MEDIASESSION;
                Class<?> cls = abqhVar.getClass();
                int i = awrn.a;
                new awqv(cls).c();
                aqdr aqdrVarA2 = aqdr.a(alyiVar.h);
                if (aqdrVarA2 == null) {
                    aqdrVarA2 = aqdr.STREAMING_WATCH_RESPONSE_TYPE_UNKNOWN;
                }
                aqdrVarA2.name();
                tmuVar = tmuVar2;
            }
        } while (tmuVar == null);
        return tmuVar == null ? new tmu("", "") : tmuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tmw
    public final tmw Q(List list) {
        boolean z;
        list.getClass();
        agqs agqsVarListIterator = this.b.g.listIterator(0);
        agqsVarListIterator.getClass();
        while (agqsVarListIterator.hasNext()) {
            E next = agqsVarListIterator.next();
            next.getClass();
            abqh abqhVar = (abqh) next;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (awrc.c(((tmv) it.next()).Y(), abqhVar.h().Y())) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            abqhVar.c = z;
            if (z) {
                abmw abmwVar = abmw.MEDIASESSION;
                Class<?> cls = abqhVar.getClass();
                int i = awrn.a;
                new awqv(cls).c();
                if (abqhVar instanceof abpg) {
                    this.d = null;
                }
            }
        }
        this.a = this.f.k();
        return this;
    }

    @Override // defpackage.tmw
    public final /* synthetic */ Object R(tmv tmvVar, Object obj) {
        alyi alyiVar;
        tmvVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.b.g) {
            if (obj instanceof MessageLite) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            alyiVar = null;
            if (!it.hasNext()) {
                break;
            }
            abqh abqhVar = (abqh) it.next();
            alyi alyiVarB = abqhVar.b(tmvVar, (MessageLite) obj);
            if (alyiVarB != null) {
                abmw abmwVar = abmw.MEDIASESSION;
                Class<?> cls = abqhVar.getClass();
                int i = awrn.a;
                new awqv(cls).c();
                alyiVar = alyiVarB;
            }
        } while (alyiVar == null);
        if (alyiVar != null) {
            return alyiVar;
        }
        aihh aihhVar = (aihh) alyi.a.createBuilder();
        aihhVar.getClass();
        return afyd.F(aihhVar);
    }

    @Override // defpackage.tmw
    public final List S() {
        abql abqlVar = this.b;
        if (abqlVar.j != 3) {
            return awno.a;
        }
        agke agkeVar = abqlVar.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : agkeVar) {
            if (!((abqh) obj).c) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.toc
    public final boolean T() {
        return false;
    }

    @Override // defpackage.yrw
    public final xir U() {
        return this.e;
    }

    @Override // defpackage.yrw
    public final yqh V() {
        return new abqm(this, 1);
    }

    @Override // defpackage.yrw
    public final yrr W() {
        return this.d;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        return this.c.aa(tnmVar);
    }

    @Override // defpackage.tns
    public final Class ab() {
        return this.c.ab();
    }

    @Override // defpackage.tns
    public final String ac() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
        this.c.S((alyi) obj);
    }

    @Override // defpackage.tns
    public final byte[] ae() {
        return this.c.ae();
    }

    @Override // defpackage.tns
    public final tnr af() {
        return this.c.b;
    }

    @Override // defpackage.tns
    public final Map e() {
        return this.c.e();
    }

    @Override // defpackage.tns
    public final tnz h() {
        return this.c.d;
    }

    @Override // defpackage.tns
    public final toe i(toe toeVar) {
        return this.c.i(toeVar);
    }

    @Override // defpackage.tns
    public final ListenableFuture j(Executor executor, tnm tnmVar, boolean z) {
        return this.c.j(executor, tnmVar, z);
    }

    @Override // defpackage.tns
    public final ListenableFuture k(Executor executor, tnm tnmVar, boolean z) {
        return this.c.k(executor, tnmVar, z);
    }

    @Override // defpackage.tns
    public final ainp l() {
        return this.c.i;
    }

    @Override // defpackage.tns
    public final aqrv m() {
        return this.c.m();
    }

    @Override // defpackage.tns
    public final Optional n() {
        return this.c.n();
    }

    @Override // defpackage.tns
    public final Optional o() {
        return this.c.h;
    }

    @Override // defpackage.tns
    public final Object p(Class cls) {
        return this.c.p(cls);
    }

    @Override // defpackage.tns
    public final String q() {
        return this.c.q();
    }

    @Override // defpackage.tns
    public final String r() {
        return this.c.r();
    }

    @Override // defpackage.tns
    public final String s() {
        return this.c.s();
    }

    @Override // defpackage.tns
    public final Collection t() {
        return this.c.t();
    }

    @Override // defpackage.tns
    public final List u(tnm tnmVar) {
        return this.c.u(tnmVar);
    }

    @Override // defpackage.tns
    public final List v() {
        return this.c.v();
    }

    @Override // defpackage.tns
    public final void w() {
        this.c.w();
    }

    @Override // defpackage.tns
    public final void x() {
        this.c.x();
    }

    @Override // defpackage.tns
    public final void y(toe toeVar) {
        this.c.y(toeVar);
    }

    @Override // defpackage.tns
    public final void z(Object obj) {
        throw null;
    }

    @Override // defpackage.tns
    public final void N() {
    }

    @Override // defpackage.tns
    public final void O() {
    }
}
