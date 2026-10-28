package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kli {
    public static final Executor a = new vp(2);
    public static final Pattern b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int h;
    private static PendingIntent i;
    public final Context d;
    public final kld e;
    public Messenger f;
    public kku g;
    private final ScheduledExecutorService j;
    public final aha c = new aha(0);
    private final Messenger k = new Messenger(new klh(this, Looper.getMainLooper()));

    public kli(Context context) {
        this.d = context;
        this.e = new kld(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ktb("fcm-rpc-timeout-executor", 0));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized String e() {
        int i2;
        i2 = h;
        h = i2 + 1;
        return Integer.toString(i2);
    }

    private static synchronized void f(Context context, Intent intent) {
        PendingIntent pendingIntentB = i;
        if (pendingIntentB == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            pendingIntentB = kyg.b(context, intent2, kyg.a);
            i = pendingIntentB;
        }
        intent.putExtra("app", pendingIntentB);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    public final lpa a(Bundle bundle) {
        int iB;
        Context context;
        String strE = e();
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        aha ahaVar = this.c;
        synchronized (ahaVar) {
            ahaVar.put(strE, kjcVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.e.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.d, intent);
        intent.putExtra("kid", "|ID|" + strE + '|');
        intent.putExtra("google.messenger", this.k);
        if (this.f == null && this.g == null) {
            iB = this.e.b();
            context = this.d;
            if (iB == 2) {
                rpi.D(context, intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                iB = this.e.b();
                context = this.d;
                if (iB == 2) {
                    rpi.D(context, intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.j.schedule(new kcx(kjcVar, 11), 30L, TimeUnit.SECONDS);
        lpa lpaVar = (lpa) kjcVar.a;
        lpaVar.l(a, new lpg(this, strE, scheduledFutureSchedule, 1));
        return lpaVar;
    }

    public final lpa b(Bundle bundle) {
        kld kldVar = this.e;
        if (kldVar.a() < 12000000) {
            return kldVar.b() != 0 ? a(bundle).b(a, new kji(this, bundle, 2)) : mda.l(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return klc.a(this.d).c(1, bundle).a(a, new klg(1));
    }

    public final void c(String str, Bundle bundle) {
        aha ahaVar = this.c;
        synchronized (ahaVar) {
            kjc kjcVar = (kjc) ahaVar.remove(str);
            if (kjcVar == null) {
                Log.w("Rpc", a.ce(str, "Missing callback for "));
            } else {
                kjcVar.x(bundle);
            }
        }
    }
}
