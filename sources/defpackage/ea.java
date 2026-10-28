package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ea {
    public final cc a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final List g;
    public int h;
    public int i;
    private final List k;
    private final List j = new ArrayList();
    public boolean f = true;

    public ea(int i, int i2, cc ccVar) {
        this.h = i;
        this.i = i2;
        this.a = ccVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (dd.aa(2)) {
            toString();
        }
        this.c = true;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(dy dyVar) {
        this.k.add(dyVar);
    }

    public final void e(ViewGroup viewGroup) {
        this.e = false;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.k.isEmpty()) {
            a();
            return;
        }
        for (dy dyVar : atqq.ap(this.g)) {
            if (!dyVar.j) {
                dyVar.a(viewGroup);
            }
            dyVar.j = true;
        }
    }

    public final void f(dy dyVar) {
        List list = this.k;
        if (list.remove(dyVar) && list.isEmpty()) {
            a();
        }
    }

    public final void g() {
        this.f = false;
    }

    public final void h(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.h == 1) {
                if (dd.aa(2)) {
                    cc ccVar = this.a;
                    int i4 = this.i;
                    Objects.toString(ccVar);
                    dl.b(i4);
                }
                this.h = 2;
                this.i = 2;
                this.f = true;
                return;
            }
            return;
        }
        if (i3 != 2) {
            int i5 = this.h;
            if (i5 != 1) {
                if (dd.aa(2)) {
                    Objects.toString(this.a);
                    dl.f(i5);
                    dl.f(i);
                }
                this.h = i;
                return;
            }
            return;
        }
        if (dd.aa(2)) {
            cc ccVar2 = this.a;
            int i6 = this.h;
            int i7 = this.i;
            Objects.toString(ccVar2);
            dl.f(i6);
            dl.b(i7);
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) dl.f(this.h)) + " lifecycleImpact = " + ((Object) dl.b(this.i)) + " fragment = " + this.a + '}';
    }
}
