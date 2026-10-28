package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.media.session.MediaButtonReceiver;
import app.rive.RiveLog;
import app.rive.runtime.kotlin.core.Rive;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gkx implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gkx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, rrh] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r11v107, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v28, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v38, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v43, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v58, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v63, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v68, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v71, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v94, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [awmd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        aihf aihfVar;
        ListenableFuture listenableFutureA;
        switch (this.$cid) {
            case 0:
                glb glbVar = (glb) this.a;
                ((tbt) glbVar.c.io()).f(glbVar.f.io());
                return;
            case 1:
                gev gevVar = (gev) this.a;
                anim animVar = ((vxu) gevVar.a.io()).c().n;
                if (animVar == null) {
                    animVar = anim.a;
                }
                if (animVar.m) {
                    ((rrp) gevVar.b.io()).h();
                    return;
                }
                return;
            case 2:
                Object obj = this.a;
                if (awk.b()) {
                    ((hed) ((jij) obj).a).i();
                } else {
                    Object obj2 = ((jij) obj).a;
                    ((hed) obj2).j(new hol(obj2, 14));
                }
                jij jijVar = (jij) obj;
                if (((vxz) jijVar.c).l(27, 45660317L, false)) {
                    ((hed) jijVar.b).i();
                    return;
                }
                return;
            case 3:
                Object obj3 = this.a;
                jan janVar = (jan) obj3;
                if (((jnm) janVar.a.io()).C()) {
                    ListenableFuture aherVar = ((aaqg) janVar.f.io()).o(((aanb) janVar.g.io()).d()) > 0 ? new aher(Boolean.FALSE) : ((hnq) janVar.c.io()).g() ? new aher(Boolean.TRUE) : afxd.f(((syn) janVar.h.io()).n(((zwb) janVar.e.io()).e())).h(new hba(obj3, 1), MoreExecutors.directExecutor());
                    hfb hfbVar = new hfb(obj3, 1);
                    Executor executorDirectExecutor = MoreExecutors.directExecutor();
                    long j = afwl.a;
                    aherVar.addListener(new ahei(aherVar, new afwj(afty.c(false), hfbVar, 0)), executorDirectExecutor);
                    return;
                }
                return;
            case 4:
                gev gevVar2 = (gev) this.a;
                txz.c((Context) gevVar2.a.io(), (Executor) gevVar2.b.io(), MediaButtonReceiver.class, 1);
                return;
            case 5:
                ((hgh) ((gli) this.a).r.io()).a();
                return;
            case 6:
                return;
            case 7:
                ((hgc) ((gli) this.a).s.io()).a();
                return;
            case 8:
                aerj aerjVar = (aerj) this.a;
                ?? r0 = aerjVar.e;
                aack aackVar = (aack) r0.io();
                if (!((tfq) aackVar.e.io()).i()) {
                    ((aanb) aackVar.c.io()).e();
                    aackVar.a = true;
                }
                aany aanyVar = (aany) aackVar.b.io();
                if (!aanyVar.j) {
                    aanyVar.f.f(aanyVar);
                    ScheduledExecutorService scheduledExecutorService = aanyVar.g;
                    avmb avmbVar = awlg.a;
                    awir awirVar = new awir(scheduledExecutorService);
                    avvi avviVar = new avvi((avlh) aanyVar.d.io());
                    avnn avnnVar = atqp.j;
                    avviVar.p().L(awirVar).ak(new xwu(aanyVar, 17));
                    ((avlh) aanyVar.e.io()).P().p().L(awirVar).ak(new xwu(aanyVar, 18));
                    aanyVar.j = true;
                }
                aaop aaopVar = (aaop) aackVar.d.io();
                new avmm().c(aaopVar.d.p().W(new vvb(new wvk(14), 8)).ak(new xwu(aaopVar, 19)));
                ((hno) aerjVar.d.io()).a();
                how howVar = (how) aerjVar.b.io();
                ((tbt) howVar.g.io()).f(howVar);
                howVar.a();
                howVar.h.kn();
                hqg hqgVar = (hqg) aerjVar.f.io();
                ((tbt) hqgVar.d.io()).f(hqgVar);
                hqgVar.l();
                aack aackVar2 = (aack) r0.io();
                if (!aackVar2.a) {
                    ((aanb) aackVar2.c.io()).e();
                }
                aany aanyVar2 = (aany) aackVar2.b.io();
                aanyVar2.e();
                aann aannVar = (aann) aanyVar2.b.io();
                aannVar.j.submit(afwl.i(new yas(aannVar, 13, null)));
                aannVar.d();
                aannVar.k.f(aannVar);
                return;
            case 9:
                ((isi) ((gli) this.a).x.io()).f();
                return;
            case 10:
                if (Build.VERSION.SDK_INT >= 33) {
                    dov dovVar = (dov) this.a;
                    ?? r1 = dovVar.a;
                    if (avg.c((Context) r1.io(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                        dovVar.t("android.permission.ACCESS_BACKGROUND_LOCATION");
                    }
                    if (avg.c((Context) r1.io(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        dovVar.t("android.permission.ACCESS_COARSE_LOCATION");
                    }
                    if (avg.c((Context) r1.io(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        dovVar.t("android.permission.ACCESS_FINE_LOCATION");
                    }
                    if (avg.c((Context) r1.io(), "android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        dovVar.t("android.permission.ACCESS_MEDIA_LOCATION");
                        return;
                    }
                    return;
                }
                return;
            case 11:
                jnj jnjVar = (jnj) this.a;
                ((aepg) jnjVar.b.io()).i();
                abxv abxvVar = (abxv) jnjVar.d.io();
                if (abxvVar.H()) {
                    File fileE = abxvVar.E();
                    if (!fileE.exists() || (fileArrListFiles = fileE.listFiles()) == null || (fileArrListFiles.length) == 0) {
                        return;
                    }
                    for (File file : fileArrListFiles) {
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                            try {
                                byte[] bArr = new byte[(int) file.length()];
                                dataInputStream.readFully(bArr);
                                aihfVar = (aihf) aqig.a.createBuilder().mergeFrom(bArr, ExtensionRegistryLite.getGeneratedRegistry());
                                try {
                                    dataInputStream.close();
                                } catch (IOException e) {
                                    e = e;
                                    abxv.G("Unable to parse background task dumps.", e);
                                }
                            } catch (Throwable th) {
                                try {
                                    dataInputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            aihfVar = null;
                        }
                        if (!file.delete() || aihfVar == null) {
                            abxv.G("Unable to delete background task dumps.", null);
                        } else {
                            xeu xeuVar = (xeu) abxvVar.c.io();
                            if (xeuVar.b) {
                                xff xffVarA = xeuVar.a(aihfVar, alot.SYSTEM_HEALTH_CAPTURED);
                                ztf ztfVar = xffVarA.k.e;
                                xffVarA.l = ztfVar.a();
                                ztfVar.k(xffVarA);
                            } else {
                                alos alosVar = (alos) alou.a.createBuilder();
                                alosVar.copyOnWrite();
                                alou alouVar = (alou) alosVar.instance;
                                aqig aqigVar = (aqig) aihfVar.build();
                                aqigVar.getClass();
                                alouVar.d = aqigVar;
                                alouVar.c = 3;
                                xeuVar.b((alou) alosVar.build());
                            }
                        }
                        break;
                    }
                    return;
                }
                return;
            case 12:
                zpw zpwVar = (zpw) this.a;
                ((xds) zpwVar.l.io()).b();
                ((zrn) zpwVar.i.io()).b();
                return;
            case 13:
                rrq rrqVar = (rrq) ((dov) this.a).a.io();
                ?? r2 = rrqVar.b;
                ListenableFuture listenableFutureA2 = r2.a();
                ListenableFuture listenableFutureB = r2.b();
                if (((xeu) rrqVar.c).b) {
                    ahek ahekVar = new ahek(false, agke.p(new ListenableFuture[]{listenableFutureA2, listenableFutureB}));
                    ium iumVar = new ium((Object) rrqVar, (Object) listenableFutureA2, (Object) listenableFutureB, 15);
                    long j2 = afwl.a;
                    listenableFutureA = ahekVar.a(new ahcz(afty.c(false), iumVar, 1), MoreExecutors.directExecutor());
                } else {
                    ahek ahekVar2 = new ahek(false, agke.p(new ListenableFuture[]{listenableFutureA2, listenableFutureB}));
                    iqb iqbVar = new iqb(rrqVar, listenableFutureA2, listenableFutureB, 8);
                    long j3 = afwl.a;
                    listenableFutureA = ahekVar2.a(new ahcz(afty.c(false), iqbVar, 1), rrqVar.f);
                }
                rro rroVar = new rro(1);
                Executor executor = taf.a;
                listenableFutureA.addListener(new ahei(listenableFutureA, new afwj(afty.c(false), new taa(rroVar, null, taf.b), 0)), MoreExecutors.directExecutor());
                return;
            case 14:
                ((iee) ((gli) this.a).y.io()).a();
                return;
            case 15:
                taq.c();
                Object obj4 = this.a;
                glh glhVar = (glh) obj4;
                if (((tfq) glhVar.a.io()).i()) {
                    glhVar.a();
                    return;
                } else {
                    glhVar.b.x(new gkq(2)).az().L(glhVar.c).al(new gks(obj4, 2), new glg(0));
                    return;
                }
            case 16:
                ((abib) ((gli) this.a).A.io()).a();
                return;
            case 17:
                ((gli) this.a).z.io();
                return;
            case 18:
                ((xds) ((zpw) this.a).l.io()).h();
                return;
            case 19:
                ((jij) ((gli) this.a).u.io()).l();
                return;
            default:
                gev gevVar3 = (gev) ((glb) this.a).g.io();
                ?? r3 = gevVar3.a;
                int i = tqr.a;
                if (r3.k(1073830337)) {
                    ahxh.a("rive-android", new String[0]);
                    if (((adom) gevVar3.b.io()).b.compareAndSet(false, true)) {
                        RiveLog.INSTANCE.setLogger(new RiveLog.LogcatLogger());
                        Rive.initializeCppEnvironment();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
