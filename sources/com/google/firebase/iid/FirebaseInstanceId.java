package com.google.firebase.iid;

import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.a;
import defpackage.afts;
import defpackage.ahnr;
import defpackage.ahpu;
import defpackage.ahrn;
import defpackage.ahrs;
import defpackage.ahrw;
import defpackage.ahud;
import defpackage.jij;
import defpackage.kli;
import defpackage.kro;
import defpackage.loo;
import defpackage.lot;
import defpackage.lpa;
import defpackage.lpf;
import defpackage.mda;
import defpackage.vp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FirebaseInstanceId {
    public static jij g;
    private static final Pattern h;
    public final Executor a;
    public final ahnr b;
    public final ahrn c;
    public final List d = new ArrayList();
    public final afts e;
    public final ahpu f;
    private final ahrw i;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        h = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    public FirebaseInstanceId(ahnr ahnrVar, afts aftsVar, Executor executor, Executor executor2, ahrs ahrsVar, ahrs ahrsVar2, ahrw ahrwVar) {
        if (a.g(ahnrVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            if (g == null) {
                g = new jij(ahnrVar.a(), (byte[]) null);
            }
        }
        this.b = ahnrVar;
        this.e = aftsVar;
        this.c = new ahrn(ahnrVar, aftsVar, new kli(ahnrVar.a()), ahrsVar, ahrsVar2, ahrwVar);
        this.a = executor2;
        this.f = new ahpu(executor);
        this.i = ahrwVar;
    }

    public static String e(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public static void f(ahnr ahnrVar) {
        kro.j(ahnrVar.e().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        kro.j(ahnrVar.e().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        kro.j(ahnrVar.e().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        kro.d(ahnrVar.e().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        kro.d(h.matcher(ahnrVar.e().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static FirebaseInstanceId getInstance(ahnr ahnrVar) {
        f(ahnrVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) ahnrVar.f(FirebaseInstanceId.class);
        if (firebaseInstanceId != null) {
            return firebaseInstanceId;
        }
        throw new NullPointerException("Firebase Instance ID component is not present");
    }

    public final Object a(lpa lpaVar) throws IOException {
        try {
            return mda.o(lpaVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    g();
                }
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e);
        }
    }

    public final String b() {
        try {
            g.C(this.b.h());
            lpa lpaVarA = this.i.a();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            lpaVarA.l(new vp(9), new lot() { // from class: ahrk
                @Override // defpackage.lot
                public final void a(lpa lpaVar) {
                    jij jijVar = FirebaseInstanceId.g;
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (lpaVarA.j()) {
                return (String) lpaVarA.f();
            }
            if (((lpf) lpaVarA).c) {
                throw new CancellationException("Task is already canceled");
            }
            if (lpaVarA.i()) {
                throw new IllegalStateException(lpaVarA.e());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String c() {
        ahnr ahnrVar = this.b;
        return "[DEFAULT]".equals(ahnrVar.g()) ? "" : ahnrVar.h();
    }

    @Deprecated
    public final String d(final String str, String str2) throws IOException {
        f(this.b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        final String strE = e(str2);
        lpf lpfVar = new lpf();
        lpfVar.t(null);
        return (String) ((ahud) a(lpfVar.b(this.a, new loo() { // from class: ahrj
            @Override // defpackage.loo
            public final Object a(lpa lpaVar) {
                FirebaseInstanceId firebaseInstanceId = this.a;
                String strB = firebaseInstanceId.b();
                jij jijVar = FirebaseInstanceId.g;
                String strC = firebaseInstanceId.c();
                String str3 = str;
                String str4 = strE;
                ahrq ahrqVarX = jijVar.x(strC, str3, str4);
                if (ahrqVarX != null) {
                    afts aftsVar = firebaseInstanceId.e;
                    long j = ahrqVarX.d;
                    String strK = aftsVar.k();
                    if (System.currentTimeMillis() <= j + ahrq.a && strK.equals(ahrqVarX.c)) {
                        ahud ahudVar = new ahud(ahrqVarX.b, (byte[]) null);
                        lpf lpfVar2 = new lpf();
                        lpfVar2.t(ahudVar);
                        return lpfVar2;
                    }
                }
                return firebaseInstanceId.f.d(str3, str4, new ahrl(firebaseInstanceId, strB, str3, str4, ahrqVarX));
            }
        }))).b;
    }

    final synchronized void g() {
        g.y();
    }
}
