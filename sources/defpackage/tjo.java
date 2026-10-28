package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tjo {
    public static final tjo a = new tjo();

    public static final toe b(Throwable th) {
        toe toeVar = th instanceof toe ? (toe) th : null;
        return toeVar == null ? new toe(th) : toeVar;
    }

    public static final tmr c(tmo tmoVar, tns tnsVar, String str) {
        tnsVar.getClass();
        str.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (tnsVar.I()) {
            tmoVar.g(str, true);
            return null;
        }
        if (tnsVar.G()) {
            return tmoVar.d(str);
        }
        return null;
    }

    public static final tnx d(Object obj, tmt tmtVar, tmo tmoVar, String str) {
        str.getClass();
        return tmtVar.j == null ? new tml(new tnw(obj, tmtVar, null, true)) : new tml(new tnw(obj, tmtVar, new tmx(tmoVar, str), true));
    }

    public static final tnx e(tnx tnxVar, ainp ainpVar, tmt tmtVar, boolean z, tmo tmoVar, String str) {
        tnxVar.getClass();
        str.getClass();
        if (!tnxVar.h() || ainpVar == null) {
            return tnxVar;
        }
        return (!z || tmtVar == null) ? tnx.g(tnxVar.c().a, tmtVar, new tnb(ainpVar)) : tnx.g(tnxVar.c().a, tmtVar, new tmx(tmoVar, str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [awox] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [tnq] */
    /* JADX WARN: Type inference failed for: r9v1, types: [tmo] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final Object a(Executor executor, tns tnsVar, tnm tnmVar, boolean z, tmo tmoVar, awoq awoqVar) {
        tjn tjnVar;
        ?? r9;
        Object obj;
        if (awoqVar instanceof tjn) {
            tjnVar = (tjn) awoqVar;
            int i = tjnVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjnVar.e = i - Integer.MIN_VALUE;
            } else {
                tjnVar = new tjn(this, awoqVar);
            }
        } else {
            tjnVar = new tjn(this, awoqVar);
        }
        Object objAd = tjnVar.c;
        ?? r10 = awox.a;
        int i2 = tjnVar.e;
        if (i2 == 0) {
            atqp.j(objAd);
            ListenableFuture listenableFutureK = tnsVar.k(executor, tnmVar, z);
            tjnVar.a = tnsVar;
            tjnVar.b = tmoVar;
            tjnVar.e = 1;
            objAd = awrc.ad(listenableFutureK, tjnVar);
            if (objAd != r10) {
            }
            obj = tnsVar;
            r9 = tmoVar;
            return r10;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = tjnVar.b;
        Object obj3 = tjnVar.a;
        atqp.j(objAd);
        obj = obj3;
        r9 = obj2;
        obj = tnsVar;
        r9 = tmoVar;
        objAd.getClass();
        r10 = (tnq) objAd;
        if (obj instanceof toa) {
        }
        for (tne tneVar : r10.b) {
            r9.h(tneVar.c, tmr.b(tneVar.b, new rzt(tneVar, 6)));
        }
        obj = tnsVar;
        r9 = tmoVar;
        return r10;
    }
}
