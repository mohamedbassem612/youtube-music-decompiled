package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;
import android.os.Process;
import android.os.StrictMode;
import internal.J.N;
import j$.util.Objects;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afii implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public afii(afvl afvlVar, Runnable runnable, int i) {
        this.$cid = i;
        this.b = afvlVar;
        this.a = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v12, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.$cid) {
            case 0:
                this.a.execute(this.b);
                return;
            case 1:
                Object obj = this.a;
                Object obj2 = this.b;
                try {
                    Executor executor = ((aesx) obj).c;
                    final aesx aesxVar = (aesx) obj;
                    ((PowerManager) obj2).addThermalStatusListener(executor, new PowerManager$OnThermalStatusChangedListener() { // from class: aesw
                        public final void onThermalStatusChanged(int i) {
                            aesx aesxVar2 = aesxVar;
                            synchronized (aesxVar2.f) {
                                if (aesxVar2.g) {
                                    long jB = aesxVar2.b.b();
                                    ajdp ajdpVarA = aesxVar2.a(aesxVar2.a, aesxVar2.h == null ? 2 : 3);
                                    ajdp ajdpVar = aesxVar2.h;
                                    if (ajdpVar != null) {
                                        aihf aihfVarCreateBuilder = aqih.a.createBuilder();
                                        aihf aihfVarCreateBuilder2 = ajdo.a.createBuilder();
                                        aihfVarCreateBuilder2.getClass();
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        ajdo ajdoVar = (ajdo) aihfVarCreateBuilder2.instance;
                                        ajdoVar.d = ajdpVar;
                                        ajdoVar.b |= 2;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        ajdo ajdoVar2 = (ajdo) aihfVarCreateBuilder2.instance;
                                        ajdoVar2.e = ajdpVarA;
                                        ajdoVar2.b |= 4;
                                        long j = jB - aesxVar2.i;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        ajdo ajdoVar3 = (ajdo) aihfVarCreateBuilder2.instance;
                                        ajdoVar3.b |= 1;
                                        ajdoVar3.c = j;
                                        aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                                        aihnVarBuild.getClass();
                                        aihfVarCreateBuilder.copyOnWrite();
                                        aqih aqihVar = (aqih) aihfVarCreateBuilder.instance;
                                        aqihVar.l = (ajdo) aihnVarBuild;
                                        aqihVar.b |= 2097152;
                                        aihfVarCreateBuilder.getClass();
                                        awmd awmdVar = aesxVar2.d;
                                        ((aepv) awmdVar.io()).g(aihfVarCreateBuilder);
                                        ((aepv) awmdVar.io()).f(aihfVarCreateBuilder);
                                        aihf aihfVarCreateBuilder3 = aqig.a.createBuilder();
                                        aihfVarCreateBuilder3.copyOnWrite();
                                        aqig aqigVar = (aqig) aihfVarCreateBuilder3.instance;
                                        aqih aqihVar2 = (aqih) aihfVarCreateBuilder.build();
                                        aqihVar2.getClass();
                                        aqigVar.c = aqihVar2;
                                        aqigVar.b |= 1;
                                        Object objIo = aesxVar2.e.io();
                                        objIo.getClass();
                                        xeu xeuVar = (xeu) objIo;
                                        if (xeuVar.b) {
                                            xff xffVarA = xeuVar.a(aihfVarCreateBuilder3, alot.SYSTEM_HEALTH_CAPTURED);
                                            ztf ztfVar = xffVarA.k.e;
                                            xffVarA.l = ztfVar.a();
                                            ztfVar.k(xffVarA);
                                        } else {
                                            alos alosVar = (alos) alou.a.createBuilder();
                                            alosVar.copyOnWrite();
                                            alou alouVar = (alou) alosVar.instance;
                                            aqig aqigVar2 = (aqig) aihfVarCreateBuilder3.build();
                                            aqigVar2.getClass();
                                            alouVar.d = aqigVar2;
                                            alouVar.c = 3;
                                            aihn aihnVarBuild2 = alosVar.build();
                                            aihnVarBuild2.getClass();
                                            xeuVar.b((alou) aihnVarBuild2);
                                        }
                                    }
                                    aesxVar2.h = ajdpVarA;
                                    aesxVar2.i = jB;
                                }
                            }
                        }
                    });
                    return;
                } catch (RuntimeException unused) {
                    return;
                }
            case 2:
                Object obj3 = ((abhh) this.a).b;
                String strA = afiz.a((affd) this.b);
                agqr it = ((auor) obj3).h().iterator();
                while (it.hasNext()) {
                    File file = new File((File) it.next(), strA);
                    if (file.exists() && !file.setWritable(true, true)) {
                        throw new RuntimeException("Could not make data dir writable.");
                    }
                }
                return;
            case 3:
                this.a.cancel(true);
                ?? r10 = this.b;
                if (r10.isCancelled()) {
                    return;
                }
                try {
                    ahno.R(r10.isDone(), "Future was expected to be done: %s", r10);
                    a.i(r10);
                    return;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    int i = afwq.a;
                    WeakHashMap weakHashMap = aftt.a;
                    synchronized (weakHashMap) {
                        weakHashMap.put(cause, Boolean.TRUE);
                        throw new afwq(cause, afwq.g(((afvh) afty.d.get()).c, null));
                    }
                }
            case 4:
                if (this.b.isCancelled()) {
                    this.a.cancel(true);
                    return;
                }
                return;
            case 5:
                Object obj4 = this.a;
                Object obj5 = this.b;
                try {
                    ServiceInfo serviceInfo = ((aflr) obj5).e.getServiceInfo(new ComponentName(((aflr) obj5).b, "androidx.work.impl.background.systemjob.SystemJobService"), 262144);
                    boolean zEquals = Objects.equals(serviceInfo.processName, obj4);
                    String str = serviceInfo.processName;
                    if (zEquals || ((aflr) obj5).f - 1 != 1) {
                        return;
                    }
                    ((agrc) ((agrc) aflr.a.b()).k("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 118, "DefaultProcessValidator.java")).B("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", obj4, serviceInfo.processName);
                    return;
                } catch (PackageManager.NameNotFoundException e2) {
                    ((agrc) ((agrc) ((agrc) aflr.a.c()).j(e2)).k("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'd', "DefaultProcessValidator.java")).t("The WorkManager SystemJobService could not be found. If you are trying to disable WorkManager, make sure not to initialize it.");
                    return;
                } catch (RuntimeException e3) {
                    ((agrc) ((agrc) ((agrc) aflr.a.c()).j(e3)).k("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'j', "DefaultProcessValidator.java")).t("Failed to look up WorkManager manifest process");
                    return;
                }
            case 6:
                this.a.run();
                ThreadLocal threadLocal = ((afmc) this.b).a;
                Throwable th = (Throwable) threadLocal.get();
                threadLocal.remove();
                if (th != null) {
                    throw th;
                }
                return;
            case 7:
                afvh afvhVar = (afvh) afty.d.get();
                afvl afvlVar = afvhVar.d;
                afvhVar.d = this.b;
                try {
                    this.a.run();
                    afvl afvlVar2 = afvhVar.d;
                    afvhVar.d = afvlVar;
                    return;
                } catch (Throwable th2) {
                    try {
                        aftt.a(th2);
                        throw th2;
                    } catch (Throwable th3) {
                        afvl afvlVar3 = afvhVar.d;
                        afvhVar.d = afvlVar;
                        throw th3;
                    }
                }
            case 8:
                ahpg ahpgVar = (ahpg) this.b;
                Process.setThreadPriority(ahpgVar.a);
                StrictMode.ThreadPolicy threadPolicy = ahpgVar.b;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                this.a.run();
                return;
            case 9:
                String str2 = CronetUploadDataStream.a;
                new axjt("CronetUploadDataStream#postTaskToExecutor " + ((String) this.a) + " running callback", 0);
                this.b.run();
                return;
            case 10:
                new axjt("CronetUrlRequest#postTaskToExecutor " + ((String) this.a) + " running callback", 0);
                this.b.run();
                return;
            default:
                Object obj6 = this.a;
                synchronized (((CronetUrlRequestContext) obj6).b) {
                    new axjt("CronetUrlRequestContext#CronetUrlRequestContext initializing request context", 0);
                    N.M6Dz0nZ5(((CronetUrlRequestContext) obj6).c, obj6);
                }
                Object obj7 = this.b;
                if (obj7 != null) {
                    axnp axnpVar = (axnp) obj7;
                    Object obj8 = axnpVar.c;
                    int iA = axnpVar.a();
                    synchronized (obj8) {
                        ((axng) obj8).c = iA;
                        ((axnp) obj7).b();
                        break;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ afii(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ afii(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public afii(CronetUrlRequestContext cronetUrlRequestContext, axnp axnpVar, int i) {
        this.$cid = i;
        this.b = axnpVar;
        this.a = cronetUrlRequestContext;
    }
}
