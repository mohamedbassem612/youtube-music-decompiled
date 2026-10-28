package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oml {
    private static oml c;
    public final Object a;
    public final Object b;

    public oml(Application application) {
        ogd ogdVar = new ogd();
        this.a = ogdVar;
        this.b = new WeakReference(application);
        if (ogdVar.b == null) {
            ogdVar.b = (DisplayManager) application.getApplicationContext().getSystemService("display");
            ogdVar.b.registerDisplayListener(ogdVar, null);
        }
    }

    public static oml c(ldr ldrVar) {
        oml omlVar = c;
        if (omlVar != null) {
            return omlVar;
        }
        oml omlVar2 = new oml(ldrVar.a);
        c = omlVar2;
        return omlVar2;
    }

    private static final axhf n(final int i, boolean z, agev agevVar) {
        agev agevVarA;
        aihf aihfVarCreateBuilder = axhf.a.createBuilder();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        aihfVarCreateBuilder.copyOnWrite();
        axhf axhfVar = (axhf) aihfVarCreateBuilder.instance;
        axhfVar.b |= 1;
        axhfVar.c = elapsedCpuTime;
        aihfVarCreateBuilder.copyOnWrite();
        axhf axhfVar2 = (axhf) aihfVarCreateBuilder.instance;
        axhfVar2.b |= 2;
        axhfVar2.d = z;
        int iActiveCount = Thread.activeCount();
        aihfVarCreateBuilder.copyOnWrite();
        axhf axhfVar3 = (axhf) aihfVarCreateBuilder.instance;
        axhfVar3.b |= 4;
        axhfVar3.e = iActiveCount;
        String str = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(i));
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                try {
                    agevVarA = agev.h(randomAccessFile.readLine()).a(new one(9));
                    randomAccessFile.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    if (agevVarA.g()) {
                        int iIntValue = ((Integer) agevVarA.c()).intValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        axhf axhfVar4 = (axhf) aihfVarCreateBuilder.instance;
                        axhfVar4.b |= 16;
                        axhfVar4.g = iIntValue;
                    }
                    if (agevVar.g()) {
                        qem qemVar = (qem) agevVar.c();
                        agev agevVar2 = !qemVar.a ? agdf.a : (agev) aguu.H(qemVar.a(), new agex() { // from class: qek
                            @Override // defpackage.agex
                            public final boolean a(Object obj) {
                                return ((ActivityManager.RunningAppProcessInfo) obj).pid == i;
                            }
                        }).a(new one(5)).e(agdf.a);
                        if (agevVar2.g()) {
                            String strFlattenToString = ((ComponentName) agevVar2.c()).flattenToString();
                            aihfVarCreateBuilder.copyOnWrite();
                            axhf axhfVar5 = (axhf) aihfVarCreateBuilder.instance;
                            strFlattenToString.getClass();
                            axhfVar5.b |= 32;
                            axhfVar5.h = strFlattenToString;
                        }
                    }
                    return (axhf) aihfVarCreateBuilder.build();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                agevVarA = agdf.a;
            }
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th3;
        }
    }

    public final Application a() {
        return (Application) ((WeakReference) this.b).get();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, krw] */
    public final synchronized void b(int i, long j, long j2, int i2) {
        Object obj = this.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((AtomicLong) obj).get() == -1 || jElapsedRealtime - ((AtomicLong) obj).get() > 1800000) {
            this.a.a(new krv(0, Arrays.asList(new krj(36301, i, 0, j, j2, null, null, 0, i2)))).p(new lcw(this, jElapsedRealtime, 0));
        }
    }

    public final axhf d() {
        Object obj = this.a;
        int iMyPid = Process.myPid();
        qem qemVarF = qel.f((Context) obj);
        return n(iMyPid, ((ayq) this.b).af(new ope(qemVarF, 12)), agev.h(qemVarF));
    }

    public final axhf e(int i, agfr agfrVar) {
        return n(i, ((ayq) this.b).af(agfrVar), agev.h((qem) agfrVar.io()));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [aunn, java.lang.Object] */
    public final pve f(plv plvVar) {
        plvVar.getClass();
        if (plvVar.a()) {
            Object objIo = this.b.io();
            objIo.getClass();
            return (pve) objIo;
        }
        if (!plvVar.b()) {
            throw new IllegalStateException("Unsupported targetType for GnpAccountStorageProviderImpl");
        }
        Object objIo2 = this.a.io();
        objIo2.getClass();
        return (pve) objIo2;
    }

    @Deprecated
    public final void g(tcu tcuVar) {
        ((tdd) this.b).a(tcuVar);
    }

    public final void h(tcu tcuVar) {
        ((tdd) this.b).d(tcuVar);
    }

    public final int i() {
        return ((tdd) this.b).a.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    public final agcl j() {
        agev agevVar = (agev) this.b.io();
        agevVar.getClass();
        rnj rnjVar = (rnj) this.a.io();
        rnjVar.getClass();
        return new agcl(agevVar, rnjVar);
    }

    public final void k(sko skoVar, long j, String str) {
        if (skoVar != null) {
            agev agevVar = skoVar.m;
            if (agevVar.g()) {
                aihf aihfVarCreateBuilder = aizz.a.createBuilder();
                aigj aigjVar = ((aiua) agevVar.c()).c;
                aihfVarCreateBuilder.copyOnWrite();
                aizz aizzVar = (aizz) aihfVarCreateBuilder.instance;
                aigjVar.getClass();
                aizzVar.b |= 1;
                aizzVar.c = aigjVar;
                if (taq.af((vyo) this.b)) {
                    aihfVarCreateBuilder.copyOnWrite();
                    aizz aizzVar2 = (aizz) aihfVarCreateBuilder.instance;
                    aizzVar2.b |= 4;
                    aizzVar2.d = str;
                }
                xeu xeuVar = (xeu) this.a;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.ADS_SEEN_CLIENT_LOGGING);
                    xffVarA.h = j;
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                    return;
                }
                alos alosVar = (alos) alou.a.createBuilder();
                alosVar.copyOnWrite();
                alou alouVar = (alou) alosVar.instance;
                aizz aizzVar3 = (aizz) aihfVarCreateBuilder.build();
                aizzVar3.getClass();
                alouVar.d = aizzVar3;
                alouVar.c = 517;
                xeuVar.d((alou) alosVar.build(), xel.c(j));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void l(String str, Throwable th, int i) {
        int i2;
        boolean z = th instanceof afgc;
        int i3 = 3;
        if (z) {
            zvp.b(zvn.b, zvm.z, a.bT(str, "[Clockwork][", "] onAccountError()"), th);
            Object obj = this.a;
            ((syn) obj).b.execute(new rir(obj, i, i3));
        }
        Object obj2 = this.a;
        if (th instanceof affy) {
            i2 = 7;
        } else if (th instanceof afga) {
            i2 = 4;
        } else if (th instanceof afgd) {
            i2 = 3;
        } else if (th instanceof afge) {
            i2 = 5;
        } else {
            i2 = z ? 6 : 1;
        }
        ((syn) obj2).k(i, 3, i2);
    }

    public final void m(String str, Throwable th, affh affhVar, int i) {
        boolean z = true;
        boolean z2 = false;
        if ((th instanceof afga) && (th.getCause() instanceof rra)) {
            ((syn) this.a).k(i, 3, 8);
            affhVar.b(agke.q(rqz.class));
            z2 = true;
        }
        if (th instanceof affy) {
            ((syn) this.a).k(i, 3, 9);
            affhVar.b(agke.q(rqz.class));
        } else {
            z = z2;
        }
        l(str, th, i);
        if (z) {
            return;
        }
        ((Optional) this.b).isPresent();
    }

    public oml(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public oml() {
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
    }

    private oml(Context context) {
        this.b = new AtomicLong(-1L);
        this.a = new ksl(context, new krx("measurement:api"));
    }

    public oml(Context context, byte[] bArr) {
        this.b = new qet();
        this.a = context;
    }

    public oml(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public oml(awmd awmdVar, awmd awmdVar2) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
    }

    public oml(Context context, ahey aheyVar, tqj tqjVar) {
        mbr mbrVar = new mbr(new mbz(new ahfg(aheyVar), aheyVar), aheyVar);
        this.a = mbrVar;
        tdd tddVar = new tdd(mbrVar, tqjVar);
        this.b = tddVar;
        tddVar.b((Application) context);
    }

    public oml(agev agevVar, agfr agfrVar) {
        this.a = agevVar;
        this.b = aguu.al(agfrVar);
    }

    public oml(aunn aunnVar, aunn aunnVar2, aunn aunnVar3) {
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        this.a = aunnVar;
        this.b = aunnVar2;
    }
}
