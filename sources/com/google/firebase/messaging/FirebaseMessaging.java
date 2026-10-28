package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.acem;
import defpackage.ahno;
import defpackage.ahnr;
import defpackage.ahoa;
import defpackage.ahpm;
import defpackage.ahpu;
import defpackage.ahqy;
import defpackage.ahrr;
import defpackage.ahrs;
import defpackage.ahrw;
import defpackage.ahst;
import defpackage.ahsu;
import defpackage.ahsw;
import defpackage.ahsx;
import defpackage.ahta;
import defpackage.ahtd;
import defpackage.ahtf;
import defpackage.ahtk;
import defpackage.ahtm;
import defpackage.ahtp;
import defpackage.ahtq;
import defpackage.ahud;
import defpackage.ahvk;
import defpackage.avgj;
import defpackage.axfd;
import defpackage.cte;
import defpackage.hhb;
import defpackage.klc;
import defpackage.klg;
import defpackage.kli;
import defpackage.kro;
import defpackage.ktb;
import defpackage.lpa;
import defpackage.mda;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {
    public static ahrs a;
    static ScheduledExecutorService b;
    private static final long j;
    private static ahud p;
    public final ahnr c;
    public final Context d;
    public final ahtd e;
    public final Executor f;
    public final lpa g;
    public final ahtf h;
    public final axfd i;
    private final ahta k;
    private final Executor l;
    private final ahrw m;
    private boolean n = false;
    private final Application.ActivityLifecycleCallbacks o;
    private final ahpu q;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        j = 28800L;
        a = new ahpm(5);
    }

    public FirebaseMessaging(ahnr ahnrVar, ahrr ahrrVar, ahrs ahrsVar, ahqy ahqyVar, ahtf ahtfVar, ahtd ahtdVar, ahrw ahrwVar, Executor executor, Executor executor2, Executor executor3) {
        int i = 0;
        a = ahrsVar;
        this.c = ahnrVar;
        this.k = new ahta(this, ahqyVar);
        Context contextA = ahnrVar.a();
        this.d = contextA;
        ahsu ahsuVar = new ahsu();
        this.o = ahsuVar;
        this.h = ahtfVar;
        this.e = ahtdVar;
        this.m = ahrwVar;
        axfd axfdVar = new axfd(contextA, ahnrVar, ahrwVar, ahtdVar, ahtfVar);
        this.i = axfdVar;
        byte[] bArr = null;
        this.q = new ahpu(executor, (byte[]) null);
        this.l = executor2;
        this.f = executor3;
        Context contextA2 = ahnrVar.a();
        if (contextA2 instanceof Application) {
            ((Application) contextA2).registerActivityLifecycleCallbacks(ahsuVar);
        } else {
            Log.w("FirebaseMessaging", a.cs(contextA2, "Context ", " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result."));
        }
        if (ahrrVar != null && !axfdVar.g()) {
            ahrrVar.a(new hhb(this, bArr));
        }
        if (axfdVar.g()) {
            ahrwVar.m(new avgj(this, bArr));
        }
        executor2.execute(new acem(this, 20));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ktb("Firebase-Messaging-Topics-Io", 0));
        int i2 = ahtq.d;
        lpa lpaVarK = mda.k(scheduledThreadPoolExecutor, new ahtp(contextA, scheduledThreadPoolExecutor, ahtfVar, ahnrVar, this, ahrwVar, 0));
        this.g = lpaVarK;
        lpaVarK.n(executor2, new ahsw(this, i));
        executor2.execute(new ahvk(this, 1));
    }

    public static synchronized FirebaseMessaging a() {
        return getInstance(ahnr.b());
    }

    @Deprecated
    static synchronized FirebaseMessaging getInstance(ahnr ahnrVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) ahnrVar.f(FirebaseMessaging.class);
        kro.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static final void m(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new ktb("TAG", 0));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public static synchronized ahud o(Context context) {
        ahud ahudVar;
        ahudVar = p;
        if (ahudVar == null) {
            ahudVar = new ahud(context);
            p = ahudVar;
        }
        return ahudVar;
    }

    public final ahtk b() {
        return o(this.d).b(c(), a.g(this.c));
    }

    public final String c() {
        ahnr ahnrVar = this.c;
        return "[DEFAULT]".equals(ahnrVar.g()) ? "" : ahnrVar.h();
    }

    public final void d() {
        kli kliVar = this.e.c;
        (kliVar.e.a() >= 241100000 ? klc.a(kliVar.d).c(5, Bundle.EMPTY).a(kli.a, new klg(0)) : mda.l(new IOException("SERVICE_NOT_AVAILABLE"))).n(this.l, new ahsw(this, 2));
    }

    public final synchronized void e(boolean z) {
        this.n = z;
    }

    public final synchronized void f() {
        if (!this.n) {
            h(0L);
        }
    }

    public final void g() {
        if (k(b())) {
            f();
        }
    }

    public final synchronized void h(long j2) {
        m(new ahtm(this, Math.min(Math.max(30L, j2 << 1), j)), j2);
        this.n = true;
    }

    public final boolean i() {
        return this.k.b();
    }

    public final boolean j() {
        Context context = this.d;
        ahno.e(context);
        if (!a.aL()) {
            return false;
        }
        if (!ahno.f(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package ".concat(String.valueOf(context.getPackageName())));
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return this.c.f(ahoa.class) != null || (ahno.k() && a != null);
        }
        return false;
    }

    final boolean k(ahtk ahtkVar) {
        String str;
        if (ahtkVar == null) {
            return true;
        }
        ahtf ahtfVar = this.h;
        long j2 = ahtkVar.d;
        String strC = ahtfVar.c();
        if (System.currentTimeMillis() > j2 + ahtk.a || !strC.equals(ahtkVar.c)) {
            return true;
        }
        if (this.i.g()) {
            try {
                str = (String) mda.n(this.m.a());
            } catch (InterruptedException | ExecutionException unused) {
                str = null;
            }
            if (!ahtkVar.b.equalsIgnoreCase(str)) {
                return true;
            }
        } else if (ahtkVar.b.length() <= 22) {
            return true;
        }
        return false;
    }

    public final String l() throws IOException {
        ahtk ahtkVarB = b();
        if (!k(ahtkVarB)) {
            return ahtkVarB.b;
        }
        ahnr ahnrVar = this.c;
        ahpu ahpuVar = this.q;
        String strG = a.g(ahnrVar);
        try {
            return (String) mda.n(ahpuVar.g(strG, new ahsx(this, strG, ahtkVarB)));
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException("FCM Registration failed!", e);
        }
    }

    public final void n(String str) {
        if ("[DEFAULT]".equals(this.c.g())) {
            boolean zG = this.i.g();
            Intent intent = new Intent();
            intent.putExtra("token", str);
            if (zG) {
                intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
            } else {
                intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
            }
            ahst.b(intent, this.d, new cte(15));
        }
    }
}
