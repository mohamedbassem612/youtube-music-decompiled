package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afmb implements aupn {
    public static awut b(awou awouVar) {
        awouVar.getClass();
        return new axcw(awouVar, 1);
    }

    public static awut c(awou awouVar) {
        awouVar.getClass();
        return new axcw(awouVar, 1);
    }

    public static awut d(awou awouVar) {
        awouVar.getClass();
        return new axcw(awouVar, 1);
    }

    public static void e(Activity activity) {
        if (activity == null) {
            throw new IllegalStateException("Attempted use of the activity when it is null");
        }
    }

    public static agtz f(Context context, Object obj, kje kjeVar, Executor executor, aunn aunnVar, aunn aunnVar2) {
        aunnVar.getClass();
        ahvr ahvrVar = new ahvr(context, new glj(aunnVar, 17));
        kjeVar.getClass();
        ahvrVar.d = kjeVar;
        Boolean.FALSE.booleanValue();
        ahvrVar.j = (afqs) obj;
        aunnVar2.getClass();
        ahvrVar.f = new glj(aunnVar2, 18);
        ahvrVar.e = executor;
        ahvrVar.h = ahvr.g;
        Context context2 = ahvrVar.b;
        kje ahvsVar = ahvrVar.d;
        if (ahvsVar == null) {
            ahvsVar = new ahvs();
        }
        kje kjeVar2 = ahvsVar;
        qjk qjkVar = ahvr.a;
        Executor executorDirectExecutor = ahvrVar.e;
        if (executorDirectExecutor == null) {
            executorDirectExecutor = MoreExecutors.directExecutor();
        }
        Executor executor2 = executorDirectExecutor;
        awmd awmdVar = ahvrVar.c;
        ahno ahnoVar = ahvrVar.j;
        if (ahnoVar == null) {
            ahnoVar = ahvr.i;
        }
        ahno ahnoVar2 = ahnoVar;
        awmd aenpVar = ahvrVar.f;
        if (aenpVar == null) {
            aenpVar = new aenp(ahvrVar, 4);
        }
        return new ahvt(context2, kjeVar2, qjkVar, executor2, awmdVar, ahnoVar2, aenpVar, ahvrVar.h);
    }

    public static void g(Activity activity) {
        if (activity == null) {
            throw new IllegalStateException("Attempted use of the activity when it is null");
        }
    }

    public static cf h(Activity activity) {
        try {
            cf cfVar = (cf) activity;
            cfVar.getClass();
            return cfVar;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
        }
    }

    public static afrm i(boolean z, awmd awmdVar, awmd awmdVar2, omr omrVar, String str, aflz aflzVar) {
        if (aflzVar.equals(aflz.b)) {
            Boolean.FALSE.booleanValue();
            if (!omrVar.l().equals(str)) {
                ((agrc) ((agrc) afrz.a.b()).k("com/google/apps/tiktok/sync/impl/SyncModule", "provideSyncManager", 114, "SyncModule.java")).t("The ProcessInit main process must be the same as the default work process, otherwise Synclets will not run. See go/tiktok-sync/multiprocess#sync-process-check");
            }
        } else {
            Boolean.FALSE.booleanValue();
        }
        if (true != z) {
            awmdVar = awmdVar2;
        }
        afrm afrmVar = (afrm) awmdVar.io();
        afrmVar.getClass();
        return afrmVar;
    }

    public static Application j(ahud ahudVar) {
        Application applicationAJ = a.aJ((Context) ahudVar.b);
        applicationAJ.getClass();
        return applicationAJ;
    }

    public static awou k(ahud ahudVar, ahey aheyVar) {
        aheyVar.getClass();
        awou awouVarW = ahudVar.W(aheyVar);
        awouVarW.getClass();
        return awouVarW;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        throw null;
    }
}
