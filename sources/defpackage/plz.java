package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import internal.org.jni_zero.JniZero;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class plz extends BroadcastReceiver {
    private static final agsn a = agsn.h("GnpSdk");
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public abstract pma a(Context context);

    public abstract pmb b(Context context);

    public abstract String c();

    public final void d(Intent intent, pma pmaVar, plb plbVar, long j, pnw pnwVar) {
        intent.getAction();
        try {
            int threadPriority = Process.getThreadPriority(0);
            try {
                Process.setThreadPriority(pmaVar.a(intent));
                awou awouVarDJ = pnwVar.dJ();
                awouVarDJ.getClass();
                awqx.l(awouVarDJ, new ply(pmaVar, intent, plbVar, j, (awoq) null, 0));
                Process.setThreadPriority(threadPriority);
                intent.getAction();
            } catch (Throwable th) {
                Process.setThreadPriority(threadPriority);
                throw th;
            }
        } catch (Exception e) {
            try {
                pny pnyVarI = pnwVar.I();
                pnz pnzVarA = pnwVar.es().a(e);
                ((poc) pnzVarA).s = c();
                pnyVarI.a(pnzVarA);
            } catch (Exception unused) {
            }
            ((agsj) ((agsj) a.c()).j(e)).w("Failed to handle async action [%s] in Coroutine Scope.", intent.getAction());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        plz plzVar;
        context.getClass();
        if (intent == null) {
            ((agsj) ((agsj) a.b()).j(new IllegalArgumentException())).t("Null Intent received.");
            return;
        }
        long micros = TimeUnit.MILLISECONDS.toMicros(Instant.now().toEpochMilli());
        plb plbVarB = plb.b((intent.getFlags() & 268435456) > 0 ? 8500L : 58500L);
        intent.getAction();
        context.getApplicationContext().getPackageName();
        try {
            pnw pnwVarA = pnv.a(context);
            pnwVarA.getClass();
            pnwVarA.N().a(context);
            plg plgVar = new plg(0);
            try {
                if (b(context).a(intent)) {
                    intent.getAction();
                    pni pniVarG = pnwVarA.G();
                    pma pmaVarA = a(context);
                    if (qnl.ab(context)) {
                        plzVar = this;
                        awrm awrmVar = new awrm();
                        awrmVar.a = plbVarB;
                        if (b.compareAndSet(false, true)) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
                            if (jElapsedRealtime <= auug.a.io().a()) {
                                awrmVar.a = plbVarB.d(jElapsedRealtime);
                            }
                        }
                        pniVarG.b(plzVar.goAsync(), plzVar.isOrderedBroadcast(), new xiq(intent, plzVar, pmaVarA, awrmVar, micros, pnwVarA, 1), (plb) awrmVar.a);
                    } else {
                        plzVar = this;
                        pniVarG.c(new lel(intent, plzVar, pmaVarA, micros, pnwVarA, 5));
                    }
                } else {
                    intent.getAction();
                    plzVar = this;
                }
                JniZero.l(plgVar, null);
                if (plzVar.isOrderedBroadcast()) {
                    plzVar.setResultCode(-1);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    JniZero.l(plgVar, th);
                    throw th2;
                }
            }
        } catch (RuntimeException e) {
            ((agsj) ((agsj) a.c()).j(e)).t("BroadcastReceiver stopped");
        }
    }
}
