package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class agkh {
    Object[] a;
    public int b;
    axlj c;

    public agkh(int i) {
        this.a = new Object[i << 1];
        this.b = 0;
    }

    private void a(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i << 1;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, agjv.f(length, i2));
        }
    }

    public agkj b() {
        return d(true);
    }

    public final agkj d(boolean z) {
        axlj axljVar;
        axlj axljVar2;
        if (z && (axljVar2 = this.c) != null) {
            throw axljVar2.d();
        }
        agpn agpnVarA = agpn.a(this.b, this.a, this);
        if (!z || (axljVar = this.c) == null) {
            return agpnVarA;
        }
        throw axljVar.d();
    }

    public void e(Object obj, Object obj2) {
        a(this.b + 1);
        aguu.af(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i << 1;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final void f(Map.Entry entry) {
        e(entry.getKey(), entry.getValue());
    }

    public final void g(agkh agkhVar) {
        agkhVar.getClass();
        a(this.b + agkhVar.b);
        System.arraycopy(agkhVar.a, 0, this.a, this.b << 1, agkhVar.b << 1);
        this.b += agkhVar.b;
    }

    public final void h(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f((Map.Entry) it.next());
        }
    }

    public final void i(Map map) {
        h(map.entrySet());
    }

    public agkh() {
        throw null;
    }
}
