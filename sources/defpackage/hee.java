package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hee {
    public final Object a;
    public Object b;

    public hee(klu kluVar) {
        this.a = new SparseIntArray();
        if (kluVar == null) {
            throw new NullPointerException("null reference");
        }
        this.b = kluVar;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public final void a(Object obj) {
        Object obj2 = this.b;
        if (obj2 != obj) {
            if (obj2 == null || !obj2.equals(obj)) {
                this.b = obj;
                for (hed hedVar : this.a) {
                    Set set = (Set) hedVar.c.get(this);
                    if (set != null) {
                        for (fgy fgyVar : (fgy[]) set.toArray(new fgy[set.size()])) {
                            Object obj3 = hedVar.b.get(fgyVar);
                            if (obj3 != null) {
                                if (hed.c(fgyVar, obj3)) {
                                    SparseArray sparseArrayI = fgyVar.i();
                                    for (int i = 0; i < sparseArrayI.size(); i++) {
                                        if (sparseArrayI.valueAt(i) == this) {
                                            hed.g(sparseArrayI.keyAt(i), this, (View) obj3);
                                        }
                                    }
                                }
                                hee[] heeVarArrAA = fgyVar.aA();
                                for (int i2 = 0; i2 < heeVarArrAA.length; i2 = 1) {
                                    if (this == heeVarArrAA[0]) {
                                        fgyVar.ay(obj3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        Object obj = this.a;
        synchronized (obj) {
            ((SparseIntArray) obj).clear();
        }
    }

    public final int c(int i) {
        int i2;
        Object obj = this.a;
        synchronized (obj) {
            i2 = ((SparseIntArray) obj).get(i, -1);
        }
        return i2;
    }

    public final dij d() {
        if (this.b == null) {
            this.b = dij.b((Context) this.a);
        }
        return (dij) this.b;
    }

    public final void e(azs azsVar) {
        dij dijVarD = d();
        if (dijVarD != null) {
            dijVarD.q(azsVar);
        }
    }

    public final void f(did didVar, azs azsVar) {
        d().p(didVar, azsVar, 4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    public final void g(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
        ((IntersectionEngine) this.a.io()).onSizeChange(str, rect, rect2, rect3, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final boolean h() {
        ?? r0 = this.b;
        return (r0 == 0 || r0.isEmpty()) ? false : true;
    }

    public hee(Object obj) {
        this.a = new CopyOnWriteArraySet();
        this.b = obj;
    }

    public hee(Object obj, byte[] bArr) {
        this.a = obj;
    }
}
