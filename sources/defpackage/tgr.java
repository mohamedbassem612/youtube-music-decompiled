package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tgr {
    public int a;
    public final Object b;
    public final Object c;

    public tgr(kmm kmmVar) {
        this.b = new ffx(new axt(150), new evt(this, 1), fga.a);
        this.c = kmmVar;
    }

    public static final long o(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void a(tgq tgqVar) {
        this.c.add(tgqVar);
    }

    public final synchronized void b(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tgv] */
    public final boolean c() {
        return this.a == 0 || this.b.a() < ((long) this.a);
    }

    public final void d(int i) {
        synchronized (this.b) {
            ((PriorityQueue) this.c).add(Integer.valueOf(i));
            this.a = Math.max(this.a, i);
        }
    }

    public final void e(int i) {
        Object obj = this.b;
        synchronized (obj) {
            while (this.a != i) {
                obj.wait();
            }
        }
    }

    public final void f(int i) {
        synchronized (this.b) {
            int i2 = this.a;
            if (i2 != i) {
                throw new bti(i, i2);
            }
        }
    }

    public final void g(int i) {
        int iIntValue;
        Object obj = this.b;
        synchronized (obj) {
            Object obj2 = this.c;
            ((PriorityQueue) obj2).remove(Integer.valueOf(i));
            if (((PriorityQueue) obj2).isEmpty()) {
                iIntValue = Integer.MIN_VALUE;
            } else {
                Integer num = (Integer) ((PriorityQueue) obj2).peek();
                int i2 = bwp.a;
                iIntValue = num.intValue();
            }
            this.a = iIntValue;
            obj.notifyAll();
        }
    }

    public final nu h(int i) {
        SparseArray sparseArray = (SparseArray) this.b;
        nu nuVar = (nu) sparseArray.get(i);
        if (nuVar != null) {
            return nuVar;
        }
        nu nuVar2 = new nu();
        sparseArray.put(i, nuVar2);
        return nuVar2;
    }

    public final oh i(int i) {
        nu nuVar = (nu) ((SparseArray) this.b).get(i);
        if (nuVar != null) {
            ArrayList arrayList = nuVar.a;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                    }
                } while (((oh) arrayList.get(size)).r());
                return (oh) arrayList.remove(size);
            }
        }
        return null;
    }

    public final void j() {
        this.a++;
    }

    public final void k() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((nu) sparseArray.valueAt(i)).a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                azx.d(((oh) arrayList.get(i2)).a);
            }
            arrayList.clear();
            i++;
        }
    }

    public final void l() {
        this.a--;
    }

    public final void m(oh ohVar) {
        int i = ohVar.f;
        ArrayList arrayList = h(i).a;
        if (((nu) ((SparseArray) this.b).get(i)).b <= arrayList.size()) {
            azx.d(ohVar.a);
            return;
        }
        int i2 = RecyclerView.ad;
        ohVar.l();
        arrayList.add(ohVar);
    }

    public final void n(int i, int i2) {
        nu nuVarH = h(i);
        nuVarH.b = i2;
        ArrayList arrayList = nuVarH.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public tgr() {
        this.b = new Object();
        this.c = new PriorityQueue(Collections.reverseOrder());
        this.a = Integer.MIN_VALUE;
    }

    public tgr(byte[] bArr) {
        this.b = new SparseArray();
        this.a = 0;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }

    public tgr(tgv tgvVar) {
        this.a = 0;
        this.c = new CopyOnWriteArraySet();
        this.b = tgvVar;
    }
}
