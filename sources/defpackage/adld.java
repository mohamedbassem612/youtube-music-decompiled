package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adld implements adlr {
    public adlr a;
    public final xbl c;
    private Object e;
    public final ArrayList b = new ArrayList();
    public final vwt d = new vwt((char[]) null, (byte[]) null);

    public adld(adlr adlrVar) {
        this.a = adlrVar;
        xbl xblVar = new xbl(this, 4);
        this.c = xblVar;
        this.a.h(xblVar);
    }

    @Override // defpackage.adkz
    public final int a() {
        return this.a.a() + (this.e != null ? 1 : 0);
    }

    @Override // defpackage.adlr
    public final void add(int i, Object obj) {
        obj.getClass();
        if (i < 0 || i > this.a.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a.add(i, obj);
    }

    @Override // defpackage.adlr
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        if (i < 0 || i > this.a.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return this.a.addAll(i, collection);
    }

    @Override // defpackage.adkz
    public final long c(int i) {
        if (this.e == null || i != this.a.a()) {
            return this.a.c(i);
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.adlr
    public final void clear() {
        this.a.clear();
        m(null);
    }

    @Override // defpackage.adkz
    public final boolean contains(Object obj) {
        obj.getClass();
        Object obj2 = this.e;
        return (obj2 != null && awrc.c(obj, obj2)) || this.a.contains(obj);
    }

    @Override // defpackage.adkz
    public final Object d(int i) {
        Object obj = this.e;
        if (obj != null && i == this.a.a()) {
            return obj;
        }
        Object objD = this.a.d(i);
        objD.getClass();
        return objD;
    }

    @Override // defpackage.adkz
    public final void e(adlz adlzVar) {
        this.b.add(adlzVar);
        this.a.e(adlzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (awrc.c(getClass(), obj != null ? obj.getClass() : null)) {
            obj.getClass();
            adld adldVar = (adld) obj;
            if (awrc.c(this.a, adldVar.a) && awrc.c(this.e, adldVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adkz
    public final void f(adly adlyVar, int i) {
        if (this.e == null || i != this.a.a()) {
            this.a.f(adlyVar, i);
            return;
        }
        Iterator it = this.b.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ((adlz) next).a(adlyVar, this, i);
        }
    }

    @Override // defpackage.adkz
    public final void h(adky adkyVar) {
        adkyVar.getClass();
        this.d.M(adkyVar);
    }

    @Override // defpackage.adlr
    public final void hH(Collection collection) {
        this.a.hH(collection);
        Object obj = this.e;
        if (obj != null) {
            collection.add(obj);
        }
    }

    @Override // defpackage.adkz
    /* JADX INFO: renamed from: hI */
    public final void n(adky adkyVar) {
        adkyVar.getClass();
        this.d.N(adkyVar);
    }

    @Override // defpackage.adlr
    public final boolean hJ(String str, akya akyaVar) {
        str.getClass();
        akyaVar.getClass();
        return this.a.hJ(str, akyaVar);
    }

    @Override // defpackage.adlr
    public final void hL(int i, int i2) {
        if (this.e == null || i + i2 != this.a.a() + 1) {
            this.a.hL(i, i2);
            return;
        }
        m(null);
        if (i2 > 1) {
            this.a.hL(i, i2 - 1);
        }
    }

    @Override // defpackage.adlr
    public final void hM(int i, Object obj) {
        obj.getClass();
        if (this.e == null || i != this.a.a()) {
            this.a.hM(i, obj);
        } else {
            m(obj);
        }
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // defpackage.adkz
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.e == null;
    }

    @Override // defpackage.adlr
    public final void j(int i, int i2) {
        this.a.j(i, i2);
    }

    @Override // defpackage.adlr
    public final void k(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        Object obj3 = this.e;
        if (obj3 == null || !awrc.c(obj, obj3)) {
            this.a.k(obj, obj2);
        } else {
            m(obj2);
        }
    }

    @Override // defpackage.adlr
    public final void l(Collection collection) {
        this.a.l(collection);
        m(null);
    }

    public final void m(Object obj) {
        if (awrc.c(this.e, obj)) {
            return;
        }
        Object obj2 = this.e;
        this.e = obj;
        int iA = this.a.a();
        if (obj2 == null) {
            this.d.I(iA);
            return;
        }
        vwt vwtVar = this.d;
        if (obj == null) {
            vwtVar.L(iA, 1);
        } else {
            vwtVar.J(iA, 1);
        }
    }

    @Override // defpackage.adlr
    public final Object remove(int i) {
        if (this.e == null || i != this.a.a()) {
            return this.a.remove(i);
        }
        Object obj = this.e;
        m(null);
        return obj;
    }

    @Override // defpackage.adlr
    public final boolean remove(Object obj) {
        obj.getClass();
        Object obj2 = this.e;
        if (obj2 != null && awrc.c(obj, obj2)) {
            m(null);
            return true;
        }
        return this.a.remove(obj);
    }

    @Override // defpackage.adlr
    public final boolean add(Object obj) {
        obj.getClass();
        return this.a.add(obj);
    }
}
