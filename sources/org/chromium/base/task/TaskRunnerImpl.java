package org.chromium.base.task;

import defpackage.avgv;
import defpackage.axjy;
import defpackage.axjz;
import defpackage.axka;
import internal.J.N;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class TaskRunnerImpl implements axjy {
    public static final ReferenceQueue a = new ReferenceQueue();
    private static final Object h = new Object();
    private static final Runnable[] i = new Runnable[50];
    private static int j = 50;
    private static final Map k = new HashMap();
    private static final Set l = new HashSet();
    protected final int b;
    public final String c;
    public volatile long d;
    protected final Runnable e;
    public final Object f;
    public Queue g;
    private final int m;
    private boolean n;
    private List o;

    protected TaskRunnerImpl(int i2, String str, int i3) {
        this.e = new avgv(this, 17, null);
        this.f = new Object();
        this.b = i2;
        this.c = str.concat(".PreNativeTask.run");
        this.m = i3;
    }

    public static void e(long j2, Runnable runnable) {
        int i2;
        synchronized (h) {
            i2 = 0;
            while (true) {
                Runnable[] runnableArr = i;
                int length = runnableArr.length;
                if (i2 >= 50) {
                    i2 = j;
                    j = i2 + 1;
                    k.put(Integer.valueOf(i2), runnable);
                    break;
                } else {
                    if (runnableArr[i2] == null) {
                        runnableArr[i2] = runnable;
                        break;
                    }
                    i2++;
                }
            }
        }
        N.MGnQU$47(j2, 0L, i2);
    }

    private static void f() {
        while (true) {
            axka axkaVar = (axka) a.poll();
            if (axkaVar == null) {
                return;
            }
            N.MERCiIV8(axkaVar.a);
            Set set = l;
            synchronized (set) {
                set.remove(axkaVar);
            }
        }
    }

    static void runTask(int i2) {
        Runnable runnable;
        synchronized (h) {
            Runnable[] runnableArr = i;
            int length = runnableArr.length;
            if (i2 < 50) {
                runnable = runnableArr[i2];
                runnableArr[i2] = null;
            } else {
                runnable = (Runnable) k.remove(Integer.valueOf(i2));
            }
        }
        runnable.run();
    }

    @Override // defpackage.axjx
    public final void a(Runnable runnable) {
        b(runnable);
    }

    @Override // defpackage.axjy
    public final void b(Runnable runnable) {
        Object obj = PostTask.a;
        if (this.d != 0) {
            e(this.d, runnable);
            return;
        }
        synchronized (this.f) {
            if (!this.n) {
                this.n = true;
                synchronized (PostTask.a) {
                    try {
                        List list = PostTask.b;
                        if (list == null) {
                            c();
                        } else {
                            list.add(this);
                            this.g = new ArrayDeque();
                            this.o = new ArrayList();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.d != 0) {
                e(this.d, runnable);
                return;
            }
            this.g.add(new axjz(runnable));
            d();
        }
    }

    final void c() {
        long jM5_IQXaH = N.M5_IQXaH(this.m, this.b);
        synchronized (this.f) {
            Queue queue = this.g;
            if (queue != null) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    ((axjz) it.next()).a(jM5_IQXaH);
                }
                this.g = null;
            }
            List list = this.o;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((axjz) it2.next()).a(jM5_IQXaH);
                }
                this.o = null;
            }
            this.d = jM5_IQXaH;
        }
        Set set = l;
        synchronized (set) {
            set.add(new axka(this));
        }
        f();
    }

    protected void d() {
        Executor executor = PostTask.d;
        PostTask.c.execute(this.e);
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        a(runnable);
    }

    public TaskRunnerImpl(int i2) {
        this(i2, "TaskRunnerImpl", 0);
        f();
    }
}
