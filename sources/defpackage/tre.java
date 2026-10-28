package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.MessageQueue;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tre implements MessageQueue.IdleHandler, ComponentCallbacks2 {
    public final awmd a;
    public final awmd b;
    public final tqj c;
    public final trd d;
    public final awli e;
    public final awmd f;
    public final trf g;
    public volatile trd h;
    public final zhk i;
    private final awmd j;

    public tre(tyv tyvVar, trf trfVar, mbc mbcVar, tqj tqjVar, awmd awmdVar, zhk zhkVar, awmd awmdVar2, awmd awmdVar3, Context context, awmd awmdVar4) {
        this.b = awmdVar;
        this.j = awmdVar2;
        this.a = awmdVar3;
        this.c = tqjVar;
        if (context instanceof Application) {
        }
        this.g = trfVar;
        this.f = awmdVar4;
        awli awliVar = new awli();
        this.e = awliVar;
        trfVar.getClass();
        tpc tpcVar = new tpc(trfVar, 2);
        int[] iArr = tyvVar.a;
        int i = tqr.a;
        int iA = tqjVar.a(393223);
        int iA2 = tqjVar.a(589837);
        int iA3 = tqjVar.a(1048605);
        int length = iArr.length;
        int i2 = length > 2 ? iArr[2] : 0;
        int i3 = tqjVar.m() ? 4 : (length < 2 || iA == 0) ? 2 : (iA2 == iArr[1] && iA == iArr[0] && iA3 == i2) ? 1 : 3;
        if (i3 != 1 && length >= 2) {
            tqh tqhVarD = tqjVar.d(3);
            tqhVarD.b(393223, iArr[0]);
            tqhVarD.b(589837, iArr[1]);
            tqhVarD.b(1048605, i2);
            tqhVarD.a();
        }
        trd trdVar = new trd(tpcVar, mbcVar, i3, tqjVar);
        this.d = trdVar;
        this.h = trdVar;
        this.i = zhkVar;
        awliVar.kk(trdVar);
        if (tqjVar.k(1073830237)) {
            ListenableFuture listenableFutureC = ((ahgb) awmdVar4.io()).C();
            listenableFutureC.addListener(new ahei(listenableFutureC, new ryh(this, 2)), (Executor) awmdVar3.io());
        }
    }

    public final int a(int i) {
        return this.h.a(i);
    }

    public final trd b() {
        return this.d;
    }

    public final void c(int i) {
        this.h.p(i);
    }

    public final void d() {
        int i = tqr.a;
        if (this.c.k(1073808312)) {
            taq.d();
        }
    }

    public final void e() {
        ((tqv) this.b.io()).b(130, 0, new snm(6));
    }

    public final void f() {
        int i = trd.x;
        g(88, 1);
    }

    public final boolean g(int i, int i2) {
        return this.h.o(i, i2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        trd trdVar = this.h;
        if (trdVar.b() == 0) {
            trdVar.e = true;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            d();
            f();
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        int i = tqr.a;
        ((ScheduledExecutorService) (this.c.k(1073808312) ? this.a : this.j).io()).schedule(new szq(this, 9), 2L, TimeUnit.SECONDS);
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
