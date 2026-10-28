package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class see extends sdx {
    private final tqj g;
    private final mbc h;
    private final long i;
    private final awmd j;
    private final ReentrantLock k;
    private final ReentrantLock l;
    private sed m;
    private final abxu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public see(Context context, String str, ajbd ajbdVar, vwt vwtVar, boolean z, tqj tqjVar, abxu abxuVar, awmd awmdVar, mbc mbcVar, long j, awmd awmdVar2) {
        super(context, str, ajbdVar, vwtVar, z, tqjVar, abxuVar, awmdVar);
        context.getClass();
        str.getClass();
        vwtVar.getClass();
        tqjVar.getClass();
        abxuVar.getClass();
        awmdVar.getClass();
        this.g = tqjVar;
        this.n = abxuVar;
        this.h = mbcVar;
        this.i = j;
        this.j = awmdVar2;
        this.k = new ReentrantLock();
        this.l = new ReentrantLock();
    }

    @Override // defpackage.sdx, defpackage.sds
    public final ListenableFuture a(boolean z) {
        ListenableFuture aherVar;
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            sed sedVar = this.m;
            if (sedVar == null || !m(sedVar)) {
                reentrantLock.unlock();
                ReentrantLock reentrantLock2 = this.l;
                reentrantLock2.lock();
                try {
                    ReentrantLock reentrantLock3 = this.k;
                    reentrantLock3.lock();
                    try {
                        sed sedVar2 = this.m;
                        if (sedVar2 == null || !m(sedVar2)) {
                            reentrantLock3.unlock();
                            l();
                            sed sedVar3 = this.m;
                            aherVar = sedVar3 != null ? sedVar3.d : new aher(Optional.empty());
                        } else {
                            aherVar = sedVar2.d;
                            reentrantLock3.unlock();
                        }
                        reentrantLock2.unlock();
                    } catch (Throwable th) {
                        reentrantLock3.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            } else {
                aherVar = sedVar.d;
                reentrantLock.unlock();
            }
            return aherVar;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // defpackage.sdx, defpackage.sds
    public final ListenableFuture b() {
        ListenableFuture listenableFutureO = ahng.o(ahno.ap(new qoh(this, 16), (Executor) this.n.t().c));
        listenableFutureO.getClass();
        return listenableFutureO;
    }

    @Override // defpackage.sdx, defpackage.sds
    public final String d() {
        String strL;
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            sed sedVar = this.m;
            if (sedVar == null || !m(sedVar)) {
                reentrantLock.unlock();
                ReentrantLock reentrantLock2 = this.l;
                reentrantLock2.lock();
                try {
                    ReentrantLock reentrantLock3 = this.k;
                    reentrantLock3.lock();
                    try {
                        sed sedVar2 = this.m;
                        if (sedVar2 == null || !m(sedVar2)) {
                            reentrantLock3.unlock();
                            strL = l();
                        } else {
                            strL = sedVar2.c;
                            reentrantLock3.unlock();
                        }
                        reentrantLock2.unlock();
                    } catch (Throwable th) {
                        reentrantLock3.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            } else {
                strL = sedVar.c;
                reentrantLock.unlock();
            }
            return strL;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final String k() {
        zwa zwaVarE = ((zwb) this.j.io()).e();
        if (zwaVarE != null) {
            return zwaVarE.k();
        }
        return null;
    }

    public final String l() {
        int i = tqr.a;
        ListenableFuture listenableFutureA = super.a(this.g.k(1073808297));
        ReentrantLock reentrantLock = this.k;
        String strH = h();
        String strK = k();
        reentrantLock.lock();
        try {
            listenableFutureA.getClass();
            long epochMilli = this.h.f().toEpochMilli();
            if (TextUtils.isEmpty(strH) || epochMilli <= 0) {
                this.m = null;
            } else {
                this.m = new sed(epochMilli, strK, strH, listenableFutureA);
            }
            return strH;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean m(sed sedVar) {
        if (!j(sedVar.c)) {
            long j = this.i;
            long j2 = sedVar.a;
            long epochMilli = this.h.f().toEpochMilli();
            if (j2 <= epochMilli && epochMilli < j2 + j && TextUtils.equals(sedVar.b, k())) {
                return true;
            }
        }
        return false;
    }
}
