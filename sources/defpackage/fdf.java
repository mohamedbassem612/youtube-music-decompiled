package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import com.bumptech.glide.manager.LifecycleLifecycle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdf implements Handler.Callback {
    private static final fde a = new fdd(0);
    private volatile esq b;
    private final fde c;
    private final fcx d;
    private final pj e;

    public fdf(fde fdeVar) {
        new afv();
        fdeVar = fdeVar == null ? a : fdeVar;
        this.c = fdeVar;
        this.e = new pj(fdeVar);
        this.d = (fax.b && fax.a) ? new fcw() : new fcu();
    }

    private static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [fde, java.lang.Object] */
    public final esq a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = ffs.a;
        if (a.x() && !(context instanceof Application)) {
            if (context instanceof cf) {
                cf cfVar = (cf) context;
                if (!a.x()) {
                    return a(cfVar.getApplicationContext());
                }
                if (cfVar.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.d.a(cfVar);
                Activity activityB = b(cfVar);
                boolean z = true;
                if (activityB != null && activityB.isFinishing()) {
                    z = false;
                }
                erj erjVarB = erj.b(cfVar.getApplicationContext());
                pj pjVar = this.e;
                boc lifecycle = cfVar.getLifecycle();
                cfVar.getSupportFragmentManager();
                ffs.g();
                ffs.g();
                ?? r3 = pjVar.a;
                esq esqVar = (esq) r3.get(lifecycle);
                if (esqVar != null) {
                    return esqVar;
                }
                LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
                esq esqVarA = pjVar.b.a(erjVarB, lifecycleLifecycle, new fdb(), cfVar);
                r3.put(lifecycle, esqVarA);
                lifecycleLifecycle.a(new fda(pjVar, lifecycle));
                if (z) {
                    esqVarA.l();
                }
                return esqVarA;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.c.a(erj.b(context.getApplicationContext()), new fcq(), new fdb(), context.getApplicationContext());
                }
            }
        }
        return this.b;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
