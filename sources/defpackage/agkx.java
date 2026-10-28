package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class agkx extends agju {
    Object[] d;
    private int e;

    public agkx(int i) {
        super(i);
        this.d = new Object[agkz.f(i)];
    }

    public agkz g() {
        agkz agkzVarJ;
        int i = this.b;
        if (i == 0) {
            return agpr.a;
        }
        if (i == 1) {
            Object obj = this.a[0];
            obj.getClass();
            return new agqj(obj);
        }
        if (this.d == null || agkz.f(i) != this.d.length) {
            agkzVarJ = agkz.j(this.b, this.a);
            this.b = agkzVarJ.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            if (agkz.v(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.e;
            Object[] objArr = this.d;
            agkzVarJ = new agpr(objArrCopyOf, i3, objArr, objArr.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return agkzVarJ;
    }

    @Override // defpackage.agju, defpackage.agjv
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int iF = agkz.f(this.b);
            Object[] objArr = this.d;
            int length = objArr.length;
            if (iF <= length) {
                objArr.getClass();
                int iHashCode = obj.hashCode();
                int iW = aguu.W(iHashCode);
                while (true) {
                    Object[] objArr2 = this.d;
                    int i = iW & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.e += iHashCode;
                        super.b(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iW = i + 1;
                    }
                }
            }
        }
        this.d = null;
        super.b(obj);
    }

    public final void i(Object... objArr) {
        if (this.d == null) {
            super.d(objArr);
            return;
        }
        for (Object obj : objArr) {
            c(obj);
        }
    }

    public final void j(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            super.e(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void k(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void l(agkx agkxVar) {
        if (this.d == null) {
            a(agkxVar.a, agkxVar.b);
            return;
        }
        for (int i = 0; i < agkxVar.b; i++) {
            Object obj = agkxVar.a[i];
            obj.getClass();
            c(obj);
        }
    }

    public agkx() {
        super(4);
    }
}
