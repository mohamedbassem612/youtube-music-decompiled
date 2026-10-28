package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ike implements adkz {
    private final tbk a;
    private final Set b = new HashSet();

    public ike(tbk tbkVar) {
        this.a = tbkVar;
    }

    @Override // defpackage.adkz
    public final int a() {
        return this.a.size();
    }

    public final int b(Object obj) {
        return this.a.indexOf(obj);
    }

    @Override // defpackage.adkz
    public final long c(int i) {
        return 0L;
    }

    @Override // defpackage.adkz
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.adkz
    public final Object d(int i) {
        return this.a.get(i);
    }

    public final void g(int i, int i2) {
        this.a.j(i, i2);
    }

    @Override // defpackage.adkz
    public final void h(adky adkyVar) {
        this.a.hK(adkyVar);
        this.b.add(adkyVar);
    }

    @Override // defpackage.adkz
    /* JADX INFO: renamed from: hI */
    public final void n(adky adkyVar) {
        this.a.n(adkyVar);
        this.b.remove(adkyVar);
    }

    public final void i() {
        Set set = this.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.a.n((tbj) it.next());
        }
        set.clear();
    }

    @Override // defpackage.adkz
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.adkz
    public final void e(adlz adlzVar) {
    }

    @Override // defpackage.adkz
    public final void f(adly adlyVar, int i) {
    }
}
