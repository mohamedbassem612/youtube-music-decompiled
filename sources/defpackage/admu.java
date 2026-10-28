package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class admu extends tbm implements adlr {
    private final adkr a;

    public admu() {
        super(new ArrayList(), new vwt((char[]) null, (byte[]) null));
        this.a = new adkr();
    }

    @Override // defpackage.adkz
    public final int a() {
        return size();
    }

    @Override // defpackage.tbm, java.util.AbstractList, java.util.List, defpackage.tbk
    public final void add(int i, Object obj) {
        taq.d();
        super.add(i, obj);
    }

    @Override // defpackage.tbm, java.util.AbstractList, java.util.List, defpackage.tbk
    public final boolean addAll(int i, Collection collection) {
        taq.d();
        return super.addAll(i, collection);
    }

    @Override // defpackage.adkz
    public long c(int i) {
        return i;
    }

    @Override // defpackage.tbm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, defpackage.tbk
    public void clear() {
        taq.d();
        super.clear();
    }

    @Override // defpackage.adkz
    public final Object d(int i) {
        return get(i);
    }

    @Override // defpackage.adkz
    public final void e(adlz adlzVar) {
        this.a.b(adlzVar);
    }

    @Override // defpackage.adkz
    public final void f(adly adlyVar, int i) {
        this.a.a(adlyVar, this, i);
    }

    @Override // defpackage.adkz
    public /* bridge */ /* synthetic */ void h(adky adkyVar) {
        super.hK(adkyVar);
    }

    @Override // defpackage.adlr
    public final void hH(Collection collection) {
        collection.addAll(this.e);
    }

    @Override // defpackage.tbm, defpackage.tbk
    /* JADX INFO: renamed from: hI, reason: merged with bridge method [inline-methods] */
    public final void n(adky adkyVar) {
        super.n(adkyVar);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            acxm.c(it.next());
        }
    }

    @Override // defpackage.adlr
    public final /* synthetic */ boolean hJ(String str, akya akyaVar) {
        str.getClass();
        akyaVar.getClass();
        return false;
    }

    @Override // defpackage.adlr
    public final void hL(int i, int i2) {
        taq.d();
        nsj.o(i, size() - 1);
        nsj.o(i + i2, size());
        for (int i3 = 0; i3 < i2; i3++) {
            this.e.remove(i);
        }
        this.f.L(i, i2);
    }

    @Override // defpackage.adlr
    public final void hM(int i, Object obj) {
        taq.d();
        if (i >= size()) {
            throw new IllegalArgumentException();
        }
        obj.getClass();
        this.e.set(i, obj);
        this.f.J(i, 1);
    }

    @Override // defpackage.tbm, defpackage.tbk
    public final void j(int i, int i2) {
        taq.d();
        super.j(i, i2);
    }

    @Override // defpackage.adlr
    public final void k(Object obj, Object obj2) {
        taq.d();
        obj.getClass();
        obj2.getClass();
        int iIndexOf = this.e.indexOf(obj);
        if (iIndexOf >= 0) {
            hM(iIndexOf, obj2);
        }
    }

    @Override // defpackage.adlr
    public final void l(Collection collection) {
        taq.d();
        List list = this.e;
        list.clear();
        list.addAll(collection);
        m();
    }

    public final void m() {
        this.f.O();
    }

    public final void o(agex agexVar) {
        taq.d();
        List list = this.e;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (agexVar.a(list.get(size))) {
                list.remove(size);
                this.f.L(size, 1);
            }
        }
    }

    @Override // defpackage.tbm, java.util.AbstractList, java.util.List, defpackage.tbk
    public final Object remove(int i) {
        taq.d();
        return super.remove(i);
    }
}
