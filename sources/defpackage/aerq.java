package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aerq {
    public final Context a;
    public final Object b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public aerq(Context context, Executor executor, vxz vxzVar, aerv aervVar) {
        context.getClass();
        executor.getClass();
        vxzVar.getClass();
        aervVar.getClass();
        this.a = context;
        this.d = executor;
        this.f = vxzVar;
        this.e = aervVar;
        this.b = new Object();
    }

    public aerq(Context context, eom eomVar, eod eodVar) {
        agpr agprVar = agpr.a;
        this.a = context;
        this.d = eomVar;
        this.b = eodVar;
        this.f = new ens(this, true);
        this.e = new ens(this, false);
    }
}
