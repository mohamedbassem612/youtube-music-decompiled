package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efz {
    public static final /* synthetic */ int a = 0;

    static {
        dzf.a("WorkForegroundRunnable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static final Object a(Context context, ees eesVar, dze dzeVar, dyw dywVar, axfd axfdVar, awoq awoqVar) throws Throwable {
        efy efyVar;
        if (awoqVar instanceof efy) {
            efyVar = (efy) awoqVar;
            int i = efyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                efyVar.b = i - Integer.MIN_VALUE;
            } else {
                efyVar = new efy(awoqVar);
            }
        } else {
            efyVar = new efy(awoqVar);
        }
        Object obj = efyVar.a;
        awox awoxVar = awox.a;
        int i2 = efyVar.b;
        if (i2 == 0) {
            atqp.j(obj);
            if (eesVar.r && Build.VERSION.SDK_INT < 31) {
                ?? r0 = axfdVar.d;
                r0.getClass();
                awuq awuqVarF = awuw.f(r0);
                egh eghVar = new egh(dzeVar, eesVar, dywVar, context, (awoq) null, 1);
                efyVar.b = 1;
                if (awro.p(awuqVarF, eghVar, efyVar) == awoxVar) {
                    return awoxVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }
}
