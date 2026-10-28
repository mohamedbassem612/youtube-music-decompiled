package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvy {
    public final ConcurrentHashMap a;
    public final Set b;
    public volatile acip c;
    public volatile acip d;
    private final avlh e;
    private final avlh f;
    private final avlh g;
    private final avlh h;
    private final abmt i;
    private final awkx j;
    private final avmm k;

    public abvy(avlh avlhVar, avlh avlhVar2, avlh avlhVar3, avlh avlhVar4, abmt abmtVar) {
        avlhVar.getClass();
        avlhVar2.getClass();
        this.e = avlhVar;
        this.f = avlhVar2;
        this.g = avlhVar3;
        this.h = avlhVar4;
        this.i = abmtVar;
        this.a = new ConcurrentHashMap();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        keySetViewNewKeySet.getClass();
        this.b = keySetViewNewKeySet;
        this.j = new awkx();
        avmm avmmVar = new avmm();
        this.k = avmmVar;
        avmmVar.c(avlhVar.ak(new abtq(new rri(this, 6), 14)));
        avmmVar.c(avlhVar2.ak(new abtq(new rri(this, 7), 15)));
        if (avlhVar3 != null) {
            avmmVar.c(avlhVar3.ak(new abtq(new rri(this, 8), 16)));
        }
        if (avlhVar4 != null) {
            avmmVar.c(avlhVar4.ak(new abtq(new rri(this, 9), 17)));
        }
    }

    public final acip a(String str) {
        str.getClass();
        return (acip) this.a.get(str);
    }

    public final acip b(acip acipVar) {
        String strAu = acipVar.au();
        if (strAu == null) {
            return acipVar;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        acip acipVar2 = (acip) concurrentHashMap.get(strAu);
        if (acipVar2 != null) {
            return acipVar2;
        }
        abmt abmtVar = this.i;
        if (abmtVar != null && abmtVar.aR()) {
            return c(acipVar);
        }
        concurrentHashMap.put(strAu, acipVar);
        return acipVar;
    }

    public final acip c(acip acipVar) {
        abmt abmtVar = this.i;
        if (abmtVar != null && !abmtVar.aR()) {
            return acipVar;
        }
        acjl acjlVar = acipVar instanceof acjl ? (acjl) acipVar : new acjl(acipVar);
        String strAu = acipVar.au();
        if (strAu != null) {
            this.a.put(strAu, acjlVar);
            acip acipVar2 = this.c;
            if (awrc.c(acipVar2 != null ? acipVar2.au() : null, strAu)) {
                this.c = acjlVar;
            }
            acip acipVar3 = this.d;
            if (awrc.c(acipVar3 != null ? acipVar3.au() : null, strAu)) {
                this.d = acjlVar;
            }
        } else {
            if (this.c == acipVar) {
                this.c = acjlVar;
            }
            if (this.d == acipVar) {
                this.d = acjlVar;
            }
        }
        this.j.kk(acjlVar);
        return acjlVar;
    }

    public final void d(String str) {
        this.b.remove(str);
        this.a.remove(str);
        acip acipVar = this.c;
        if (awrc.c(acipVar != null ? acipVar.au() : null, str)) {
            this.c = null;
        }
        acip acipVar2 = this.d;
        if (awrc.c(acipVar2 != null ? acipVar2.au() : null, str)) {
            this.d = null;
        }
    }

    public final void e(acip acipVar) {
        this.c = acipVar != null ? b(acipVar) : null;
    }

    public final void f(acip acipVar) {
        this.d = acipVar != null ? b(acipVar) : null;
    }

    public final boolean g(String str) {
        str.getClass();
        acip acipVar = this.c;
        return awrc.c(acipVar != null ? acipVar.au() : null, str);
    }

    public final boolean h(String str) {
        str.getClass();
        return this.a.containsKey(str);
    }
}
