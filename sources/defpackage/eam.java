package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eam implements eds {
    public static final String a = dzf.a("Processor");
    public final Context c;
    public final dyl d;
    public final WorkDatabase e;
    public final axfd m;
    public final Map g = new HashMap();
    public final Map f = new HashMap();
    public final Set i = new HashSet();
    public final List j = new ArrayList();
    public final List k = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object l = new Object();
    public final Map h = new HashMap();

    public eam(Context context, dyl dylVar, axfd axfdVar, WorkDatabase workDatabase) {
        this.c = context;
        this.d = dylVar;
        this.m = axfdVar;
        this.e = workDatabase;
    }

    public static void g(eby ebyVar, int i) {
        if (ebyVar == null) {
            dzf.b();
            return;
        }
        ebyVar.j.p(new ebo(i));
        dzf.b();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [egd, java.lang.Object] */
    public final eby a(String str) {
        byte[] bArr;
        Map map = this.f;
        eby ebyVar = (eby) map.remove(str);
        boolean z = ebyVar != null;
        if (!z) {
            ebyVar = (eby) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.l) {
                bArr = null;
                if (map.isEmpty()) {
                    Context context = this.c;
                    int i = edu.k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (Throwable th) {
                        dzf.b();
                        Log.e(a, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(this.k);
            eek eekVarA = ebyVar.a();
            this.m.a.execute(new dhr((Object) arrayList, (Object) eekVarA, 5, bArr));
        }
        return ebyVar;
    }

    public final eby b(String str) {
        eby ebyVar = (eby) this.f.get(str);
        return ebyVar == null ? (eby) this.g.get(str) : ebyVar;
    }

    public final void c(eaa eaaVar) {
        synchronized (this.l) {
            this.j.add(eaaVar);
        }
    }

    public final void d(eaa eaaVar) {
        synchronized (this.l) {
            this.j.remove(eaaVar);
        }
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.l) {
            z = b(str) != null;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(eek eekVar) {
        this.m.d.execute(new dhr(this, eekVar, 6));
    }
}
