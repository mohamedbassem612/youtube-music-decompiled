package defpackage;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zut implements zus {
    private final mbc a;
    private final awmd b;
    private final twh c;
    private long d;
    public final ReentrantLock r = new ReentrantLock();

    public zut(mbc mbcVar, awmd awmdVar, twh twhVar) {
        this.a = mbcVar;
        this.b = awmdVar;
        this.c = twhVar;
        long jB = mbcVar.b();
        long epochMilli = mbcVar.f().toEpochMilli();
        if (epochMilli > 0) {
            this.d = epochMilli - jB;
        }
    }

    @Override // defpackage.zus
    public final long A() {
        long jC = this.a.c();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return w(jC / 1000000);
    }

    @Override // defpackage.zus
    public final long B(long j) {
        long epochMilli = this.a.f().toEpochMilli() - j;
        long j2 = epochMilli - this.d;
        if (Math.abs(j2) < q) {
            return 0L;
        }
        this.d = epochMilli;
        return j2;
    }

    @Override // defpackage.zus
    public final twh C() {
        return this.c;
    }

    @Override // defpackage.zus
    public final File D() {
        zrs zrsVarF = F();
        int i = zur.a;
        try {
            return zrsVarF.i();
        } catch (Exception e) {
            throw new agfz("No DES persist dir", e);
        }
    }

    @Override // defpackage.zus
    public final boolean E() {
        return this.r.isLocked();
    }

    @Override // defpackage.zus
    public final zrs F() {
        return (zrs) this.b.io();
    }

    @Override // defpackage.zus
    public final aunz G() {
        this.r.lock();
        return new aunz(this, 1);
    }

    @Override // defpackage.zus
    public final long a() {
        return this.a.b();
    }

    @Override // defpackage.zus
    public final long w(long j) {
        return j + this.d;
    }

    @Override // defpackage.zus
    public final long x(long j) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return (z() - j) / 1000;
    }

    @Override // defpackage.zus
    public final long y(long j) {
        return j - this.d;
    }

    @Override // defpackage.zus
    public final long z() {
        return this.a.c();
    }
}
