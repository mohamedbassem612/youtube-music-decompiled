package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yqe implements Runnable {
    public final zjr a;
    private final yqf b;
    private final boolean c;
    private final int d;
    private int e;
    private final tfq f;

    public yqe(yqf yqfVar, tfq tfqVar, boolean z, int i, zjr zjrVar) {
        zkf.d(yqfVar);
        this.b = yqfVar;
        zkf.d(tfqVar);
        this.f = tfqVar;
        this.e = 1;
        this.c = z;
        this.d = i;
        this.a = zjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = yqf.m;
        yqf yqfVar = this.b;
        if (yqfVar.e > 0) {
            yqfVar.h();
        }
        synchronized (yqfVar) {
            if (!yqfVar.j) {
                yqfVar.w = false;
                return;
            }
            int iA = this.f.a();
            if (iA != this.e) {
                this.e = iA;
                yqf yqfVar2 = this.b;
                ArrayList arrayList = yqfVar2.h;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    yqd yqdVar = (yqd) arrayList.get(i3);
                    yqdVar.c = 0L;
                    yqdVar.d = yqdVar.f.c.b();
                    if (this.c) {
                        yqdVar.f();
                    }
                }
                yqfVar2.l.u();
            }
            long jMin = 1000;
            if (this.c && (i = this.d) > 0) {
                yqf yqfVar3 = this.b;
                ArrayList arrayList2 = yqfVar3.h;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    yqd yqdVar2 = (yqd) arrayList2.get(i4);
                    if (yqfVar3.c.b() - yqdVar2.b >= ((long) i) * 1000) {
                        yqdVar2.f();
                    }
                }
            }
            yqf yqfVar4 = this.b;
            if (!yqfVar4.i.contains(Integer.valueOf(iA)) || yqfVar4.k.c()) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = yqfVar4.h;
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    yqd yqdVar3 = (yqd) arrayList4.get(i5);
                    long j = yqdVar3.d;
                    mbc mbcVar = yqfVar4.c;
                    if (iA != 2 && j - 3000 <= mbcVar.b()) {
                        arrayList3.add(yqfVar4.d.submit(afwl.i(new xoy(this, yqdVar3, 13, null))));
                    }
                }
                int size4 = arrayList3.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    try {
                        ((Future) arrayList3.get(i6)).get();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        zvp.a(zvn.a, zvm.i, "InterruptedException when attempting to open Bandaid connection.");
                    } catch (ExecutionException unused2) {
                        zvp.a(zvn.a, zvm.i, "ExecutionException when attempting to open Bandaid connection.");
                    }
                }
                jMin = 5000;
                if (this.e != 2) {
                    yqf yqfVar5 = this.b;
                    ArrayList arrayList5 = yqfVar5.h;
                    int size5 = arrayList5.size();
                    long jMin2 = Long.MAX_VALUE;
                    for (int i7 = 0; i7 < size5; i7++) {
                        jMin2 = Math.min(jMin2, ((yqd) arrayList5.get(i7)).d);
                    }
                    jMin = Math.min(jMin2 - yqfVar5.c.b(), 5000L);
                }
            }
            yqf yqfVar6 = this.b;
            synchronized (yqfVar6) {
                if (yqfVar6.j) {
                    yqfVar6.d.schedule(this, jMin, TimeUnit.MILLISECONDS);
                } else {
                    yqfVar6.w = false;
                }
            }
        }
    }
}
