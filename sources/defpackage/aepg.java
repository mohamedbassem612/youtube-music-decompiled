package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aepg extends sye {
    private final aetb c;
    private final tqj d;
    private final awmd e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final awmd i;
    private final awmd j;
    private final awmd k;
    private final awmd l;
    private final awmd m;
    private final vxz o;
    private final aerj p;
    private int n = 0;
    public final agkh a = new agkh(4);
    public final agkh b = new agkh(4);

    public aepg(aetb aetbVar, aerj aerjVar, tqj tqjVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, vxz vxzVar, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9) {
        this.c = aetbVar;
        this.p = aerjVar;
        this.d = tqjVar;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.g = awmdVar3;
        this.h = awmdVar4;
        this.i = awmdVar5;
        this.j = awmdVar6;
        this.o = vxzVar;
        this.k = awmdVar7;
        this.l = awmdVar8;
        this.m = awmdVar9;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    private final void k() {
        aqiz aqizVarIo = this.c.io();
        if (aqizVarIo.c) {
            aera aeraVar = (aera) this.h.io();
            agqr it = this.a.d(true).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                aesy aesyVar = (aesy) ((awmd) entry.getValue()).io();
                aeod aeodVar = (aeod) aeraVar.f.io();
                synchronized (aeodVar.b) {
                    aeodVar.a.put(str, aesyVar);
                }
            }
            agqr it2 = this.b.d(true).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                String str2 = (String) entry2.getKey();
                aepp aeppVar = (aepp) ((awmd) entry2.getValue()).io();
                aerb aerbVar = (aerb) aeraVar.e.io();
                synchronized (aerbVar.a) {
                    aerbVar.e.put(str2, aeppVar);
                }
            }
            aeraVar.b(aqizVarIo);
        }
    }

    @Override // defpackage.sye
    public final void c() {
        int i = tqr.a;
        tqj tqjVar = this.d;
        if (!tqjVar.k(1073815108)) {
            k();
        }
        if (((trl) ((aess) this.p.f).e).a == 0) {
            aese aeseVar = (aese) this.f.io();
            if (aeseVar.a > 0) {
                aeseVar.g.start();
            }
        }
        zti.a = tqjVar.k(1073828581);
        twg.a = tqjVar.k(1073828581);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, tqj] */
    @Override // defpackage.sye
    public final void d() {
        int i = tqr.a;
        if (this.d.k(1073815108)) {
            k();
        }
        aerj aerjVar = this.p;
        int i2 = ((trl) ((aess) aerjVar.f).e).a;
        int i3 = 3;
        byte[] bArr = null;
        int i4 = 1;
        if (i2 == 3) {
            ((tqv) aerjVar.e().e.f).b(267, 1, null);
        } else if (i2 == 2) {
            aesk aeskVarD = aerjVar.d();
            int i5 = aerx.a;
            aesj aesjVar = new aesj(aeskVarD.j);
            aeskVarD.f.set(aesjVar);
            aess aessVar = aeskVarD.h;
            Application application = (Application) aessVar.c;
            application.registerActivityLifecycleCallbacks(aesjVar);
            application.registerComponentCallbacks(aesjVar);
            ((tqv) aessVar.f).b(267, 1, null);
        } else if (i2 == 1) {
            aesh aeshVarC = aerjVar.c();
            ((AtomicReference) aeshVarC.d).set((aery) this.g.io());
            ((tqv) ((aess) aeshVarC.e).f).b(267, 1, null);
        }
        abhh abhhVar = (abhh) aerjVar.g.io();
        aerl aerlVarR = ((jij) abhhVar.a.io()).R(akmm.SPAN_ID_ANDROID_MAIN_COLD_HOME_START);
        if (aerlVarR.e) {
            ahub ahubVar = (ahub) abhhVar.b.io();
            aerlVarR.c();
            avlr avlrVarK = ((trd) ahubVar.a.io()).a.K(new adhc(5)).B(new adhb(i3)).K(new adhc(6));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            avlr avlrVarZ = avlr.z();
            avmb avmbVar = awlg.b;
            avnn avnnVar = atqp.g;
            timeUnit.getClass();
            avmbVar.getClass();
            awfn awfnVar = new awfn(avlrVarK, timeUnit, avmbVar, avlrVarZ);
            avnn avnnVar2 = atqp.l;
            awfnVar.an(Boolean.FALSE).D(new acym(aerlVarR, 12), new acym(aerlVarR, 13));
        }
        if (this.n != 2) {
            this.n = 1;
            j();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            final aesp aespVar = (aesp) this.i.io();
            vxz vxzVar = (vxz) aespVar.i;
            if (vxzVar.l(72, 45411634L, false) && Build.VERSION.SDK_INT >= 30) {
                Context context = (Context) aespVar.a;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, Math.max(1, (int) vxzVar.c(92, 45833623L, 0L)));
                    if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                        if (!vxzVar.l(291, 45833622L, false)) {
                            int size = historicalProcessExitReasons.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    break;
                                } else {
                                    aespVar.a(aaj$$ExternalSyntheticApiModelOutline0.m(historicalProcessExitReasons.get(size)));
                                }
                            }
                        } else {
                            ?? r3 = aespVar.g;
                            long jC = r3.c(4217728);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = historicalProcessExitReasons.iterator();
                            long jMax = jC;
                            while (it.hasNext()) {
                                ApplicationExitInfo applicationExitInfoM = aaj$$ExternalSyntheticApiModelOutline0.m(it.next());
                                if (applicationExitInfoM.getTimestamp() > jC) {
                                    arrayList.add(applicationExitInfoM);
                                    jMax = Math.max(jMax, applicationExitInfoM.getTimestamp());
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                tqh tqhVarD = r3.d(1);
                                tqhVarD.b(4217728, jMax);
                                tqhVarD.a();
                                Collections.sort(arrayList, new rit(17));
                                int size2 = arrayList.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    aespVar.a(aaj$$ExternalSyntheticApiModelOutline0.m(arrayList.get(i6)));
                                }
                            }
                        }
                    }
                }
                ((avlr) ((ahud) aespVar.d.io()).b).B(new xib(7)).O((avmb) aespVar.e).af(new avni() { // from class: aeso
                    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
                    @Override // defpackage.avni
                    public final void a(Object obj) {
                        aihf aihfVarCreateBuilder = aqie.a.createBuilder();
                        aesp aespVar2 = aespVar;
                        ?? r0 = aespVar2.c;
                        ((aepv) r0.io()).e(aihfVarCreateBuilder);
                        ((aepv) r0.io()).d(aihfVarCreateBuilder);
                        aihf aihfVarCreateBuilder2 = aqih.a.createBuilder();
                        aihfVarCreateBuilder2.copyOnWrite();
                        aqih aqihVar = (aqih) aihfVarCreateBuilder2.instance;
                        aqie aqieVar = (aqie) aihfVarCreateBuilder.build();
                        aqieVar.getClass();
                        aqihVar.e = aqieVar;
                        aqihVar.b |= 4;
                        aqih aqihVar2 = (aqih) aihfVarCreateBuilder2.build();
                        ActivityManager activityManager2 = (ActivityManager) ((Context) aespVar2.a).getSystemService("activity");
                        if (activityManager2 != null) {
                            byte[] byteArray = aqihVar2.toByteArray();
                            if (byteArray.length > 128) {
                                byteArray = new byte[0];
                            }
                            activityManager2.setProcessStateSummary(byteArray);
                        }
                    }
                });
            }
        }
        if (this.o.l(233, 45778816L, true)) {
            aesx aesxVar = (aesx) this.k.io();
            synchronized (aesxVar.f) {
                boolean zL = aesxVar.l.l(233, 45778816L, true);
                aesxVar.g = zL;
                if (zL && !aesxVar.j) {
                    aesxVar.j = true;
                    PowerManager powerManager = aesxVar.k;
                    if (powerManager != null && Build.VERSION.SDK_INT >= 29) {
                        aesxVar.c.execute(new afii(powerManager, aesxVar, i4, bArr));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0170  */
    /* JADX WARN: Code duplicated, block: B:33:0x017e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0219  */
    /* JADX WARN: Code duplicated, block: B:67:0x022b  */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v25, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r7v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [awmd, java.lang.Object] */
    @Override // defpackage.sye
    public final void e() {
        aerj aerjVar;
        ?? r6;
        Object obj;
        ?? r7;
        ?? r8;
        ?? r0;
        List<File> listR;
        aihf aihfVarCreateBuilder;
        FileInputStream fileInputStream;
        aihf aihfVarCreateBuilder2;
        FileInputStream fileInputStream2;
        aihf aihfVarCreateBuilder3;
        aerj aerjVar2 = this.p;
        trl trlVar = (trl) ((aess) aerjVar2.f).e;
        int i = trlVar.a;
        if (i == 2) {
            aesb.b(aerjVar2.d().h, this.e);
        } else if (i == 1) {
            aesb.b((aess) aerjVar2.c().e, this.e);
        } else if (i == 3) {
            aesc aescVar = aerjVar2.e().c;
            int i2 = aerx.a;
            for (File file : aewo.l(aescVar.a)) {
                aihf aihfVarN = aewo.n(file);
                if (aihfVarN != null && !((ajeb) aihfVarN.instance).c) {
                    xeu xeuVar = (xeu) aescVar.c.io();
                    if (xeuVar.b) {
                        ajeb ajebVar = (ajeb) aihfVarN.build();
                        alos alosVar = (alos) alou.a.createBuilder();
                        alosVar.copyOnWrite();
                        alou alouVar = (alou) alosVar.instance;
                        ajebVar.getClass();
                        alouVar.d = ajebVar;
                        alouVar.c = 161;
                        if (((ztn) aescVar.g.io()).a()) {
                            long j = ajebVar.l;
                            alosVar.copyOnWrite();
                            alou alouVar2 = (alou) alosVar.instance;
                            alouVar2.b |= 1;
                            alouVar2.e = j;
                        }
                        xff xffVarA = xeuVar.a(ajebVar, alot.ANR_DETECTION);
                        xffVarA.h = ajebVar.l;
                        ztf ztfVar = xffVarA.k.e;
                        xffVarA.l = ztfVar.a();
                        ztfVar.k(xffVarA);
                        ((ahtv) aescVar.f.io()).e((alou) alosVar.build());
                    } else if (((ztn) aescVar.g.io()).a()) {
                        alos alosVar2 = (alos) alou.a.createBuilder();
                        alosVar2.copyOnWrite();
                        alou alouVar3 = (alou) alosVar2.instance;
                        ajeb ajebVar2 = (ajeb) aihfVarN.build();
                        ajebVar2.getClass();
                        alouVar3.d = ajebVar2;
                        alouVar3.c = 161;
                        long j2 = ((ajeb) aihfVarN.instance).l;
                        alosVar2.copyOnWrite();
                        alou alouVar4 = (alou) alosVar2.instance;
                        alouVar4.b |= 1;
                        alouVar4.e = j2;
                        alou alouVar5 = (alou) alosVar2.build();
                        xeuVar.b(alouVar5);
                        ((ahtv) aescVar.f.io()).e(alouVar5);
                    } else {
                        alos alosVar3 = (alos) alou.a.createBuilder();
                        alosVar3.copyOnWrite();
                        alou alouVar6 = (alou) alosVar3.instance;
                        ajeb ajebVar3 = (ajeb) aihfVarN.build();
                        ajebVar3.getClass();
                        alouVar6.d = ajebVar3;
                        alouVar6.c = 161;
                        alou alouVar7 = (alou) alosVar3.build();
                        xeuVar.c(alouVar7, ((ajeb) aihfVarN.instance).l);
                        ((ahtv) aescVar.f.io()).e(alouVar7);
                    }
                }
                afba.S(file);
            }
        }
        byte[] bArr = null;
        if (trlVar.b != 0) {
            tqj tqjVar = this.d;
            int i3 = tqr.a;
            if (tqjVar.k(1073808373)) {
                aerjVar = (aerj) this.j.io();
                if (aerjVar.a()) {
                    r6 = aerjVar.a;
                    int i4 = tqr.a;
                    if ((r6.k(1073808363) && ((trl) ((aess) aerjVar.c).e).b == 0 && r6.k(1073808367)) || r6.k(1073808373)) {
                        obj = aerjVar.c;
                        r7 = aerjVar.d;
                        r8 = aerjVar.e;
                        r0 = aerjVar.f;
                        if (r6.k(1073808374)) {
                            listR = afba.R((aess) obj, aesv.JAVA_CRASH, true);
                        } else {
                            listR = afba.R((aess) obj, aesv.JAVA_CRASH, false);
                        }
                        for (File file2 : listR) {
                            try {
                                fileInputStream2 = new FileInputStream(file2);
                                try {
                                    aihfVarCreateBuilder2 = ajej.a.createBuilder();
                                    aihfVarCreateBuilder2.m57mergeFrom((InputStream) fileInputStream2, ExtensionRegistryLite.getGeneratedRegistry());
                                    fileInputStream2.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Exception e) {
                                afba.T(String.format("JavaCrashJournalV2 !readToBuilder '%s'", file2), e);
                                aihfVarCreateBuilder2 = null;
                            }
                            aerj.b(aihfVarCreateBuilder2, r7, r8, r6, r0);
                            afba.S(file2);
                        }
                        if (r6.k(1073808375)) {
                            for (File file3 : afba.R((aess) obj, aesv.NATIVE_CRASH, false)) {
                                try {
                                    fileInputStream = new FileInputStream(file3);
                                    try {
                                        aihfVarCreateBuilder = ajej.a.createBuilder();
                                        aihfVarCreateBuilder.m57mergeFrom((InputStream) fileInputStream, ExtensionRegistryLite.getGeneratedRegistry());
                                        fileInputStream.close();
                                    } catch (Throwable th3) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                } catch (Exception e2) {
                                    afba.T(String.format("NativeCrash !readToBuilder '%s'", file3), e2);
                                    aihfVarCreateBuilder = null;
                                }
                                aerj.b(aihfVarCreateBuilder, r7, r8, r6, r0);
                                afba.S(file3);
                            }
                        }
                    }
                }
            }
        } else {
            aerjVar = (aerj) this.j.io();
            if (aerjVar.a()) {
                r6 = aerjVar.a;
                int i5 = tqr.a;
                if (r6.k(1073808363)) {
                    obj = aerjVar.c;
                    r7 = aerjVar.d;
                    r8 = aerjVar.e;
                    r0 = aerjVar.f;
                    if (r6.k(1073808374)) {
                        listR = afba.R((aess) obj, aesv.JAVA_CRASH, true);
                    } else {
                        listR = afba.R((aess) obj, aesv.JAVA_CRASH, false);
                    }
                    while (r9.hasNext()) {
                        fileInputStream2 = new FileInputStream(file2);
                        aihfVarCreateBuilder2 = ajej.a.createBuilder();
                        aihfVarCreateBuilder2.m57mergeFrom((InputStream) fileInputStream2, ExtensionRegistryLite.getGeneratedRegistry());
                        fileInputStream2.close();
                        aerj.b(aihfVarCreateBuilder2, r7, r8, r6, r0);
                        afba.S(file2);
                    }
                    if (r6.k(1073808375)) {
                        while (r2.hasNext()) {
                            fileInputStream = new FileInputStream(file3);
                            aihfVarCreateBuilder = ajej.a.createBuilder();
                            aihfVarCreateBuilder.m57mergeFrom((InputStream) fileInputStream, ExtensionRegistryLite.getGeneratedRegistry());
                            fileInputStream.close();
                            aerj.b(aihfVarCreateBuilder, r7, r8, r6, r0);
                            afba.S(file3);
                        }
                    }
                } else {
                    obj = aerjVar.c;
                    r7 = aerjVar.d;
                    r8 = aerjVar.e;
                    r0 = aerjVar.f;
                    if (r6.k(1073808374)) {
                        listR = afba.R((aess) obj, aesv.JAVA_CRASH, true);
                    } else {
                        listR = afba.R((aess) obj, aesv.JAVA_CRASH, false);
                    }
                    while (r9.hasNext()) {
                        fileInputStream2 = new FileInputStream(file2);
                        aihfVarCreateBuilder2 = ajej.a.createBuilder();
                        aihfVarCreateBuilder2.m57mergeFrom((InputStream) fileInputStream2, ExtensionRegistryLite.getGeneratedRegistry());
                        fileInputStream2.close();
                        aerj.b(aihfVarCreateBuilder2, r7, r8, r6, r0);
                        afba.S(file2);
                    }
                    if (r6.k(1073808375)) {
                        while (r2.hasNext()) {
                            fileInputStream = new FileInputStream(file3);
                            aihfVarCreateBuilder = ajej.a.createBuilder();
                            aihfVarCreateBuilder.m57mergeFrom((InputStream) fileInputStream, ExtensionRegistryLite.getGeneratedRegistry());
                            fileInputStream.close();
                            aerj.b(aihfVarCreateBuilder, r7, r8, r6, r0);
                            afba.S(file3);
                        }
                    }
                }
            }
        }
        if (trlVar.c) {
            aciz acizVar = (aciz) this.p.e.io();
            awmd awmdVar = this.e;
            for (File file4 : afba.R((aess) acizVar.a, aesv.BACKGROUND_THREAD_UNCAUGHT_EXCEPTION, false)) {
                try {
                    FileInputStream fileInputStream3 = new FileInputStream(file4);
                    try {
                        aihfVarCreateBuilder3 = ajej.a.createBuilder();
                        aihfVarCreateBuilder3.m57mergeFrom((InputStream) fileInputStream3, ExtensionRegistryLite.getGeneratedRegistry());
                        fileInputStream3.close();
                    } catch (Throwable th5) {
                        try {
                            fileInputStream3.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Exception e3) {
                    afba.T(String.format("BackgroundThreadUncaughtExceptionJournalV2 !readToBuilder '%s'", file4), e3);
                    aihfVarCreateBuilder3 = null;
                }
                if (aihfVarCreateBuilder3 != null) {
                    aqih aqihVar = ((ajej) aihfVarCreateBuilder3.instance).e;
                    if (aqihVar == null) {
                        aqihVar = aqih.a;
                    }
                    aqib aqibVar = aqihVar.g;
                    if (aqibVar == null) {
                        aqibVar = aqib.a;
                    }
                    long j3 = aqibVar.e;
                    xeu xeuVar2 = (xeu) awmdVar.io();
                    if (xeuVar2.b) {
                        xff xffVarA2 = xeuVar2.a(aihfVarCreateBuilder3, alot.APP_CRASHED);
                        xffVarA2.h = j3;
                        ztf ztfVar2 = xffVarA2.k.e;
                        xffVarA2.l = ztfVar2.a();
                        ztfVar2.k(xffVarA2);
                    } else {
                        alos alosVar4 = (alos) alou.a.createBuilder();
                        alosVar4.copyOnWrite();
                        alou alouVar8 = (alou) alosVar4.instance;
                        ajej ajejVar = (ajej) aihfVarCreateBuilder3.build();
                        ajejVar.getClass();
                        alouVar8.d = ajejVar;
                        alouVar8.c = 20;
                        xeuVar2.c((alou) alosVar4.build(), j3);
                    }
                }
                afba.S(file4);
            }
        }
        if (this.o.l(309, 45845789L, false)) {
            aerq aerqVar = (aerq) this.l.io();
            if (((vxz) aerqVar.f).l(309, 45845789L, false)) {
                twu.d("ProfilingMgrTelemetry", 4, "start() called, sdkInt=" + Build.VERSION.SDK_INT, null);
                if (Build.VERSION.SDK_INT < 36) {
                    twu.d("ProfilingMgrTelemetry", 4, "ProfilingManager requires API 36+, skipping registration on API " + Build.VERSION.SDK_INT, null);
                    return;
                }
                synchronized (aerqVar.b) {
                    if (aerqVar.c) {
                        return;
                    }
                    aerqVar.c = true;
                    aerqVar.d.execute(new aemk(aerqVar, 6, bArr));
                }
            }
        }
    }

    public final void j() {
        int i = tqr.a;
        boolean zK = this.d.k(1073830161);
        int i2 = this.n;
        if (i2 != 2) {
            if (i2 == 0) {
                if (!zK) {
                    return;
                } else {
                    zK = true;
                }
            }
            this.n = 2;
            if (zK) {
                this.m.io();
            }
        }
    }
}
