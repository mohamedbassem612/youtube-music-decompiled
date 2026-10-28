package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class edl {
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final axfd e;

    protected edl(Context context, axfd axfdVar) {
        this.e = axfdVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == null || !awrc.c(obj2, obj)) {
                this.d = obj;
                this.e.d.execute(new dhr((Object) atqq.ap(this.c), (Object) this, 8, (byte[]) null));
            }
        }
    }
}
