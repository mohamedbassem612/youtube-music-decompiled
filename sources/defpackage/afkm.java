package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afkm extends bpi {
    public final Executor a;
    public final Set c;
    private final Context f;
    public final afkh b = new afkh("FuturesMixinRF");
    public boolean e = false;
    public final int d = Process.myPid();

    /* JADX WARN: Code duplicated, block: B:11:0x005e  */
    public afkm(boy boyVar, Context context, Executor executor) {
        agev agfaVar;
        int iIntValue;
        Throwable illegalStateException;
        ActivityManager activityManager;
        this.a = executor;
        this.f = context;
        Bundle bundle = (Bundle) boyVar.a("future_saved_state");
        if (bundle != null) {
            int i = bundle.getInt("last_process_id");
            if (Build.VERSION.SDK_INT < 30 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
                agfaVar = agdf.a;
            } else {
                List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), i, 1);
                if (historicalProcessExitReasons.isEmpty()) {
                    agfaVar = agdf.a;
                } else {
                    agfaVar = new agfa(Integer.valueOf(aaj$$ExternalSyntheticApiModelOutline0.m(historicalProcessExitReasons.get(0)).getReason()));
                }
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("future_wrappers");
            this.c = new HashSet(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                afko afkoVar = (afko) parcelable;
                if (afkoVar.c.g() && (iIntValue = ((Integer) afkoVar.c.c()).intValue()) != 1) {
                    if (iIntValue == 2) {
                        StringBuilder sb = new StringBuilder("ParcelableFuture was Parceled by a lifecycle change before it completed.");
                        if (agfaVar.g()) {
                            sb.append(" process exit reason code: ");
                            sb.append(agfaVar.c());
                        }
                        illegalStateException = new afkp(sb.toString(), agfaVar);
                    } else {
                        illegalStateException = new IllegalStateException(a.bR(iIntValue, "ParcelableFuture read in unexpected value for hasResult: "));
                    }
                    afkoVar.b(illegalStateException);
                }
                this.c.add(afkoVar);
            }
        } else {
            this.c = new HashSet(1);
        }
        this.b.d(bundle);
        boyVar.b("future_saved_state", new cn(this, 7));
    }

    public static void a(afkj afkjVar, afko afkoVar) {
        afuu afuuVarD = afwt.d(121, "onPending FuturesMixin", afux.a, true);
        try {
            qpj.c();
            afjw.a++;
            afjv afjvVar = new afjv(0);
            try {
                afkjVar.b(afkoVar.d);
                afjvVar.close();
                afuuVarD.close();
            } catch (Throwable th) {
                try {
                    afjvVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                afuuVarD.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    final void b(ListenableFuture listenableFuture, Object obj, afkj afkjVar) {
        qpj.c();
        afty.r(false);
        afko afkoVar = new afko(this.b.a(afkjVar), obj, listenableFuture);
        this.c.add(afkoVar);
        if (this.e) {
            afkoVar.c(this);
            if (listenableFuture.isDone()) {
                return;
            }
            a(afkjVar, afkoVar);
        }
    }

    public final void c(afkj afkjVar) {
        this.b.c(afkjVar);
    }
}
