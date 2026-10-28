package defpackage;

import android.app.Application;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tdd {
    public final tdc a;

    public tdd(tqj tqjVar) {
        this.a = new tdc(MoreExecutors.directExecutor(), tqjVar);
    }

    public final void a(tcu tcuVar) {
        this.a.a.add(new vwt(tcuVar));
    }

    public final void b(Application application) {
        tdc tdcVar = this.a;
        application.registerActivityLifecycleCallbacks(tdcVar);
        application.registerComponentCallbacks(tdcVar);
    }

    public final void c(Application application) {
        tdc tdcVar = this.a;
        application.unregisterActivityLifecycleCallbacks(tdcVar);
        application.unregisterComponentCallbacks(tdcVar);
    }

    public final void d(tcu tcuVar) {
        tdc tdcVar = this.a;
        tdc.b(tdcVar.a, tcuVar);
        tdcVar.a(new sxk(tdcVar, tcuVar, 3, null));
    }

    public tdd(Executor executor, tqj tqjVar) {
        this.a = new tdc(executor, tqjVar);
    }
}
