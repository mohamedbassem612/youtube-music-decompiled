package defpackage;

import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class trh {
    public long a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    mbc g;
    trg h;
    public final int i;
    public final int j;
    public Throwable k;
    public final AtomicReference l;
    public trh m;
    private final String n;
    private trh o;

    public trh(String str, mbc mbcVar, int i) {
        this.h = null;
        this.l = new AtomicReference();
        this.i = -1;
        this.n = str;
        this.g = mbcVar;
        this.j = i;
    }

    public final synchronized trg a() {
        return this.h;
    }

    public final agev b() {
        trg trgVarA = a();
        if (trgVarA == null) {
            return agdf.a;
        }
        return agev.i(Long.valueOf(Duration.of(trgVarA.a - this.a, ChronoUnit.MICROS).toMillis()));
    }

    public final String c() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        int i = this.i;
        return i != -1 ? String.valueOf(i) : "null";
    }

    public final Queue d() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (trh trhVar = (trh) this.l.get(); trhVar != null; trhVar = trhVar.m) {
            arrayDeque.addFirst(trhVar);
        }
        return arrayDeque;
    }

    public final synchronized void e(trh trhVar) {
        AtomicReference atomicReference;
        trh trhVar2;
        do {
            atomicReference = this.l;
            trhVar2 = (trh) atomicReference.get();
            trhVar.m = trhVar2;
        } while (!a.av(atomicReference, trhVar2, trhVar));
    }

    public final synchronized void f(trh trhVar) {
        int i = this.j;
        if (trj.e(i) && this.g != null && this.a == 0) {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long jC = this.g.c();
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            this.a = jC / 1000;
            if (trhVar == null) {
                trhVar = tri.a;
                if (i == 32) {
                    trj.c(null);
                } else {
                    trh trhVarA = trj.a();
                    if (trhVarA != null) {
                        trhVar = trhVarA;
                    }
                }
            }
            if (trhVar != null) {
                trhVar.e(this);
            }
            if (i != 32) {
                this.b = Thread.currentThread().getId();
                this.c = Thread.currentThread().getPriority();
                this.o = trj.a();
                trj.c(this);
            }
        }
    }

    public final synchronized void g() {
        mbc mbcVar = this.g;
        if (mbcVar != null && this.h == null) {
            this.h = new trg(mbcVar);
            if (this.j != 32) {
                trj.c(this.o);
            }
        }
    }

    public trh(int i, mbc mbcVar, int i2) {
        this.h = null;
        this.l = new AtomicReference();
        this.i = i;
        this.n = null;
        this.g = mbcVar;
        this.j = i2;
    }
}
