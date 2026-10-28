package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import internal.org.jni_zero.JniZero;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwl {
    public static long a = ((long) Math.abs(new Random().nextInt())) << 30;
    public static final HashMap b = new HashMap();
    public static final Object c = new Object();
    public static afvn d;

    public static final agek a(agek agekVar) {
        return new afwi(afty.c(false), agekVar);
    }

    public static final agfr b(agfr agfrVar) {
        return new cmw(afty.c(false), agfrVar, 18, null);
    }

    public static final ahcx c(ahcx ahcxVar) {
        return new afwh(afty.c(false), ahcxVar, 0);
    }

    public static final ahcy d(ahcy ahcyVar) {
        return new ahdb(afty.c(false), ahcyVar, 1);
    }

    public static final ahdd e(ahdd ahddVar) {
        return new afwf(afty.c(false), ahddVar);
    }

    public static final ahdf f(ahdf ahdfVar) {
        return new wdt(afty.c(false), ahdfVar, 2);
    }

    public static final aheh g(aheh ahehVar) {
        return new afwj(afty.c(false), ahehVar, 0);
    }

    public static final Runnable h(Runnable runnable) {
        return new afii(n(), runnable, 7);
    }

    public static final Runnable i(Runnable runnable) {
        runnable.getClass();
        return new afwk(new awrm(), afty.c(false), runnable);
    }

    public static final Callable j(Callable callable) {
        callable.getClass();
        return new ahcz(afty.c(false), callable, 1);
    }

    public static final Callable k(Callable callable) {
        return new ahdg(n(), callable, 1);
    }

    public static final void l(Intent intent) {
        intent.getClass();
        if (afva.a != 1 && !intent.hasExtra("tracing_intent_id")) {
            throw new IllegalStateException("Was supposed to propagate trace for startActivity - did you forget to propagate it? See http://go/tiktok-conformance-violations/TRACE_PROPAGATION_FOR_START_ACTIVITY for more details.");
        }
    }

    public static final void m(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent);
        afwg afwgVarO = o(intent2);
        try {
            context.startActivity(intent2);
            JniZero.l(afwgVarO, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(afwgVarO, th);
                throw th2;
            }
        }
    }

    public static final afvl n() {
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVar = afvhVar.c;
        if (afvlVar != null && !awrc.c(afvlVar, afur.a)) {
            afvl afvlVar2 = afvhVar.c;
            afvlVar2.getClass();
            return afvlVar2;
        }
        afvl afvlVar3 = afvhVar.d;
        if (afvlVar3 != null) {
            return afvlVar3;
        }
        throw new IllegalStateException("This is not reachable if guarded by shouldPropagateExecutorTrace.");
    }

    public static final afwg o(Intent intent) {
        long j;
        afvl afvlVarC = afty.c(false);
        afvl afvlVarB = afty.b();
        if (afvlVarB != null) {
            afuy afuyVar = aftg.a;
            aguu aguuVar = aftg.c;
            if (!afvlVarB.k(aguuVar).b()) {
                synchronized (afvlVarB) {
                    if (!afvlVarB.k(aguuVar).b()) {
                        afvlVarB.t(aguuVar, Boolean.TRUE);
                    }
                }
            }
        }
        HashMap map = b;
        synchronized (map) {
            j = a;
            a = 1 + j;
        }
        intent.putExtra("tracing_intent_id", j);
        return new afwg(j);
    }

    public static final boolean p() {
        afvh afvhVar = (afvh) afty.d.get();
        afvl afvlVar = afvhVar.c;
        return ((afvlVar == null || awrc.c(afvlVar, afur.a)) && afvhVar.d == null) ? false : true;
    }

    public static final afvl q(Intent intent) {
        afvl afvlVar;
        try {
            if (intent.hasExtra("tracing_intent_id")) {
                long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
                HashMap map = b;
                synchronized (map) {
                    afvlVar = (afvl) map.remove(Long.valueOf(longExtra));
                }
                return afvlVar;
            }
        } catch (BadParcelableException unused) {
        }
        return null;
    }
}
