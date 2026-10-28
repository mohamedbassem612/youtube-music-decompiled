package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gjs extends afot implements dyk {
    public long a;
    awmd b;
    aunn c;
    aunn d;
    awmd e;
    Executor f;
    Executor g;
    tws h;
    wll i;
    tqj j;
    awmd k;
    awmd l;
    public awmd m;
    private boolean p;
    private boolean q;

    @Override // defpackage.dyk
    public final dyl a() {
        return (dyl) this.b.io();
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ksp.a = new ege(new Handler(kqy.a().getLooper()), 3);
        synchronized (kqy.a) {
            kqy kqyVar = kqy.i;
            if (kqyVar != null && !kqy.c) {
                Looper looper = kqy.a().getLooper();
                synchronized (kqyVar.d) {
                    try {
                        kqyVar.f = new afkg(looper, kqyVar.j);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            kqy.c = true;
        }
    }

    protected abstract void d();

    protected abstract void e();

    final void f() {
        super.onCreate();
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0186  */
    public final void g() {
        byte b;
        awmd awmdVar;
        if (this.p) {
            return;
        }
        int i = 1;
        this.p = true;
        twu.a = twu.a("YouTubeMusic", false);
        if (!this.q) {
            this.q = true;
            d();
            this.f.execute(afwl.i(new syd(this.h, 11)));
            ((tqo) this.d.io()).d(this.g);
            wll wllVar = this.i;
            Executor executor = this.g;
            tqo tqoVar = (tqo) this.d.io();
            int i2 = 4;
            byte[] bArr = null;
            if (wllVar.n()) {
                if (wllVar.o() && yno.es(wllVar.c)) {
                    try {
                        tym.n(wllVar.f("cg.pb"), new aesu(1));
                        tym.n(wllVar.f("cg.pb.new"), new aesu(1));
                    } catch (Exception e) {
                        wll.h("Failed to delete config file", e);
                    }
                    yno.er((SharedPreferences) wllVar.a.io(), wllVar.c, false, true);
                }
                if (tqoVar.e() || !tqoVar.f()) {
                    try {
                        File fileF = wllVar.f("cg.pb");
                        if (!tym.o(fileF, null)) {
                            fileF = wllVar.f("cg.pb.new");
                        }
                        wlh wlhVar = new wlh(fileF);
                        while (true) {
                            int i3 = wlhVar.b;
                            byte[] bArr2 = wlhVar.a;
                            if (i3 >= bArr2.length - 1) {
                                break;
                            }
                            if (wlhVar.c <= 0) {
                                b = wlhVar.d;
                                wlhVar.d = (byte) (b + 1);
                            } else {
                                wlhVar.b = i3 + 1;
                                b = bArr2[i3];
                            }
                            if (b >= 0) {
                                wli[] wliVarArr = wllVar.e;
                                int length = wliVarArr.length;
                                if (b < 3) {
                                    wli wliVar = wliVarArr[b];
                                    ExtensionRegistryLite extensionRegistryLiteB = wllVar.b(16);
                                    ajlm ajlmVar = (ajlm) wlhVar.a(ajlm.a, ExtensionRegistryLite.a);
                                    if (ajlmVar != null) {
                                        wliVar.a = ajlmVar.d;
                                        MessageLite messageLiteA = wlhVar.a(wliVar.g, extensionRegistryLiteB);
                                        if (messageLiteA != null) {
                                            long j = ajlmVar.c;
                                            wliVar.c = j;
                                            wliVar.b = j;
                                            wliVar.f = (aihn) messageLiteA;
                                            if (b == 1 && tqoVar.e() && tqoVar.f()) {
                                                wllVar.j(tqoVar);
                                                break;
                                            }
                                            wliVar.c();
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            wll.h("Bin ? type", null);
                        }
                    } catch (FileNotFoundException unused) {
                    } catch (Throwable th) {
                        wll.h("Bin restore fail", th);
                    }
                } else {
                    wllVar.j(tqoVar);
                }
                wli[] wliVarArr2 = wllVar.e;
                int length2 = wliVarArr2.length;
                for (int i4 = 0; i4 < 3; i4++) {
                    wliVarArr2[i4].c();
                }
                if ((wllVar.i & 4) != 0 && (awmdVar = wllVar.d) != null) {
                    wllVar.i((tbt) awmdVar.io());
                }
                if (wllVar.p()) {
                    wllVar.m();
                }
                ayq ayqVar = wllVar.k;
                if (ayqVar != null) {
                    ayqVar.K((ajvu) wllVar.g.f, (alik) wllVar.f.f);
                }
            } else {
                tqj tqjVar = wllVar.c;
                if (tqjVar != null) {
                    int i5 = tqr.a;
                    if (tqjVar.k(1073814398)) {
                        executor.execute(afwl.i(new uqd(wllVar, tqoVar, 19, bArr)));
                        executor.execute(afwl.i(new uqd(wllVar, tqoVar, 20, bArr)));
                    } else {
                        executor.execute(afwl.i(new wdd(wllVar, tqoVar, i2, bArr)));
                    }
                } else {
                    executor.execute(afwl.i(new wdd(wllVar, tqoVar, i2, bArr)));
                }
            }
            tqj tqjVar2 = this.j;
            int i6 = tqr.a;
            if (tqjVar2.k(1073840070)) {
                ListenableFuture listenableFutureN = ((syn) this.l.io()).n(((zwb) this.k.io()).e());
                listenableFutureN.addListener(new ahei(listenableFutureN, new afwj(afty.c(false), new taa(new hvf(this, i), null, taf.b), 0)), MoreExecutors.directExecutor());
            }
            e();
        }
        ((glb) this.c.io()).a();
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        ((glb) this.c.io()).b();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        ((glb) this.c.io()).b();
    }

    @Override // defpackage.afot, android.app.Application
    public final void onCreate() {
        String strW;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        this.a = SystemClock.elapsedRealtime();
        qih qihVar = qih.a;
        if (qpj.h(Thread.currentThread()) && qihVar.c == null) {
            qihVar.c = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
            qpj.a().post(new mbo(qihVar, 7));
            registerActivityLifecycleCallbacks(new qig(qihVar, this));
        }
        if ((Build.VERSION.SDK_INT < 28 || (strW = Application.getProcessName()) == null) && (strW = tym.w(Process.myPid())) == null) {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strW = null;
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        strW = next.processName;
                        break;
                    }
                }
            } else {
                strW = null;
                break;
            }
            if (strW == null) {
                strW = null;
            }
        }
        if (strW == null || getPackageName().equals(strW)) {
            g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [awmd, java.lang.Object] */
    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        agrx agrxVar = agso.a;
        awmd awmdVar = this.e;
        if (awmdVar != null) {
            ahgb ahgbVar = (ahgb) awmdVar.io();
            ((ScheduledExecutorService) ahgbVar.c.io()).submit(afwl.i(new awu(ahgbVar, i, 8)));
        }
    }
}
