package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tsg {
    public final Context a;
    public final awmd b;
    public final Executor c;
    public final tsj d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public volatile avax f;
    public final tsk g;

    public tsg(Context context, awmd awmdVar, Executor executor, tsk tskVar, tsj tsjVar) {
        this.a = context;
        this.b = awmdVar;
        this.c = executor;
        this.g = tskVar;
        this.d = tsjVar;
    }

    public final void a() {
        avax avaxVar;
        if (!this.e.compareAndSet(false, true) || (avaxVar = this.f) == null) {
            return;
        }
        avaxVar.e();
    }
}
