package defpackage;

import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mj implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new asx(1);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final oh b(RecyclerView recyclerView, int i, long j) {
        int iB = recyclerView.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            oh ohVarK = RecyclerView.k(recyclerView.h.e(i2));
            if (ohVarK.c == i && !ohVarK.t()) {
                return null;
            }
        }
        nv nvVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                awt.a();
            } finally {
                recyclerView.U(false);
            }
        }
        recyclerView.T();
        oh ohVarO = nvVar.o(i, j);
        if (ohVarO != null) {
            if (!ohVarO.s() || ohVarO.t()) {
                nvVar.b(ohVarO, false);
            } else {
                nvVar.i(ohVarO.a);
            }
        }
        return ohVarO;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.q && this.d == 0) {
            this.d = System.nanoTime();
            recyclerView.post(this);
        }
        mh mhVar = recyclerView.N;
        mhVar.a = i;
        mhVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        mi miVar;
        RecyclerView recyclerView;
        WeakReference weakReference;
        RecyclerView recyclerView2;
        mi miVar2;
        long j = 0;
        try {
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                try {
                    int size = arrayList.size();
                    int i = 0;
                    long jMax = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            jMax = Math.max(recyclerView3.getDrawingTime(), jMax);
                        }
                    }
                    if (jMax != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(jMax) + this.e;
                        int size2 = arrayList.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size2; i4++) {
                            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
                            if (recyclerView4.getWindowVisibility() == 0) {
                                recyclerView4.N.c(recyclerView4, false);
                                i3 += recyclerView4.N.d;
                            }
                        }
                        ArrayList arrayList2 = this.f;
                        arrayList2.ensureCapacity(i3);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            boolean z = true;
                            if (i5 >= size2) {
                                break;
                            }
                            RecyclerView recyclerView5 = (RecyclerView) arrayList.get(i5);
                            if (recyclerView5.getWindowVisibility() == 0) {
                                mh mhVar = recyclerView5.N;
                                int iAbs = Math.abs(mhVar.a) + Math.abs(mhVar.b);
                                int i7 = i;
                                while (i7 < (mhVar.d << (z ? 1 : 0))) {
                                    if (i6 >= arrayList2.size()) {
                                        miVar2 = new mi();
                                        arrayList2.add(miVar2);
                                    } else {
                                        miVar2 = (mi) arrayList2.get(i6);
                                    }
                                    int[] iArr = mhVar.c;
                                    int i8 = iArr[i7 + 1];
                                    if (i8 > iAbs) {
                                        z = false;
                                    }
                                    miVar2.a = z;
                                    miVar2.b = iAbs;
                                    miVar2.c = i8;
                                    miVar2.d = recyclerView5;
                                    miVar2.e = iArr[i7];
                                    i6++;
                                    i7 += 2;
                                    z = true;
                                }
                            }
                            i5++;
                            i = 0;
                        }
                        Collections.sort(arrayList2, b);
                        for (int i9 = 0; i9 < arrayList2.size() && (recyclerView = (miVar = (mi) arrayList2.get(i9)).d) != null; i9++) {
                            oh ohVarB = b(recyclerView, miVar.e, true != miVar.a ? nanos : Long.MAX_VALUE);
                            if (ohVarB != null && (weakReference = ohVarB.b) != null && ohVarB.s() && !ohVarB.t() && (recyclerView2 = (RecyclerView) weakReference.get()) != null) {
                                if (recyclerView2.y && recyclerView2.h.b() != 0) {
                                    recyclerView2.X();
                                }
                                mh mhVar2 = recyclerView2.N;
                                mhVar2.c(recyclerView2, true);
                                if (mhVar2.d != 0) {
                                    oe oeVar = recyclerView2.O;
                                    nh nhVar = recyclerView2.m;
                                    oeVar.d = 1;
                                    oeVar.e = nhVar.a();
                                    oeVar.g = false;
                                    oeVar.h = false;
                                    oeVar.i = false;
                                    for (int i10 = 0; i10 < (mhVar2.d << 1); i10 += 2) {
                                        b(recyclerView2, mhVar2.c[i10], nanos);
                                    }
                                }
                            }
                            miVar.a = false;
                            miVar.b = 0;
                            miVar.c = 0;
                            miVar.d = null;
                            miVar.e = 0;
                        }
                        j = 0;
                    }
                } catch (Throwable th) {
                    th = th;
                    j = 0;
                    this.d = j;
                    throw th;
                }
            }
            this.d = j;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
