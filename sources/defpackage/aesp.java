package defpackage;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aesp {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public aesp(tre treVar, ahbw ahbwVar) {
        treVar.getClass();
        ahbwVar.getClass();
        this.f = treVar;
        this.a = new AtomicReference(tqt.a);
        this.d = new AtomicReference(null);
        this.c = new AtomicReference(null);
        this.b = new AtomicBoolean(false);
        new AtomicReference(null);
        new AtomicReference(null);
        this.h = new AtomicInteger(0);
        this.e = new AtomicReference(null);
        this.g = new AtomicInteger(0);
        this.i = new AtomicInteger(0);
        int i = 13;
        int i2 = 14;
        treVar.e.X(new hby(new bfu(i), 12)).af(new rtn(new rri(this, 2), i2));
        treVar.e.X(new hby(new bfu(i2), i)).af(new rtn(new rri(this, 3), 15));
    }

    private final void x(boolean z) {
        Object obj = ((heg) this.i).a;
        ibv ibvVar = ibv.LOOP_DISABLED;
        if ((!((ibv) obj).equals(ibvVar)) != z) {
            if (z) {
                ibvVar = ibv.LOOP_OFF;
            }
            t(ibvVar, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    private final boolean y() {
        ?? r1;
        return (((ycp) this.b).e == null || w()) && ((r1 = this.d) == 0 || !gzj.ah((abvk) r1.io()));
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r1v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [awmd, java.lang.Object] */
    public final void a(ApplicationExitInfo applicationExitInfo) {
        int i;
        int i2;
        aqih aqihVar = aqih.a;
        aihf aihfVarCreateBuilder = aqihVar.createBuilder();
        byte[] processStateSummary = applicationExitInfo.getProcessStateSummary();
        if (processStateSummary != null) {
            try {
                aihfVarCreateBuilder = ((aqih) aihn.parseFrom(aqihVar, processStateSummary, ExtensionRegistryLite.getGeneratedRegistry())).toBuilder();
            } catch (aiik unused) {
                aihfVarCreateBuilder = aqih.a.createBuilder();
            }
        }
        aihf aihfVarCreateBuilder2 = aqia.a.createBuilder();
        switch (applicationExitInfo.getReason()) {
            case 0:
            default:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
            case 10:
                i = 11;
                break;
            case 11:
                i = 12;
                break;
            case 12:
                i = 13;
                break;
            case 13:
                i = 14;
                break;
            case 14:
                i = 15;
                break;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        aqia aqiaVar = (aqia) aihfVarCreateBuilder2.instance;
        aqiaVar.c = i - 1;
        aqiaVar.b |= 1;
        int status = applicationExitInfo.getStatus();
        aihfVarCreateBuilder2.copyOnWrite();
        aqia aqiaVar2 = (aqia) aihfVarCreateBuilder2.instance;
        aqiaVar2.b |= 2;
        aqiaVar2.d = status;
        int importance = applicationExitInfo.getImportance();
        aihfVarCreateBuilder2.copyOnWrite();
        aqia aqiaVar3 = (aqia) aihfVarCreateBuilder2.instance;
        aqiaVar3.b |= 4;
        aqiaVar3.e = importance;
        String description = applicationExitInfo.getDescription();
        if (((vxz) this.i).l(189, 45692637L, false)) {
            long timestamp = applicationExitInfo.getTimestamp();
            aihfVarCreateBuilder2.copyOnWrite();
            aqia aqiaVar4 = (aqia) aihfVarCreateBuilder2.instance;
            aqiaVar4.b |= 16;
            aqiaVar4.g = timestamp;
        }
        if (description != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            aqia aqiaVar5 = (aqia) aihfVarCreateBuilder2.instance;
            aqiaVar5.b |= 8;
            aqiaVar5.f = description;
        }
        aihfVarCreateBuilder.copyOnWrite();
        aqih aqihVar2 = (aqih) aihfVarCreateBuilder.instance;
        aqia aqiaVar6 = (aqia) aihfVarCreateBuilder2.build();
        aqiaVar6.getClass();
        aqihVar2.k = aqiaVar6;
        aqihVar2.b |= 262144;
        aihf aihfVarCreateBuilder3 = aqig.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        aqig aqigVar = (aqig) aihfVarCreateBuilder3.instance;
        aqih aqihVar3 = (aqih) aihfVarCreateBuilder.build();
        aqihVar3.getClass();
        aqigVar.c = aqihVar3;
        aqigVar.b |= 1;
        xeu xeuVar = (xeu) this.b.io();
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
            xeuVar.b((alou) alosVar.build());
        }
        ?? r0 = this.g;
        int i3 = tqr.a;
        if (r0.k(1073830141)) {
            int importance2 = applicationExitInfo.getImportance();
            int reason = applicationExitInfo.getReason();
            if (reason == 3) {
                i2 = importance2 <= 100 ? 20 : 21;
            } else if (reason != 6) {
                i2 = 2;
            } else {
                i2 = importance2 <= 100 ? 18 : 19;
            }
            if (i2 != 2) {
                ((xkn) this.f.io()).a(i2);
            }
        }
        ((awli) this.h).kk(applicationExitInfo);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [adkz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [awmd, java.lang.Object] */
    public final void b() {
        int iAS;
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ?? r3 = this.d;
            if (i >= r3.a()) {
                Collection.EL.removeIf(this.h.entrySet(), new hkn(hashSet, 17));
                return;
            }
            Object objD = r3.d(i);
            if (objD instanceof acxm) {
                akro akroVar = ((acxm) objD).a.c;
                if (akroVar == null) {
                    akroVar = akro.a;
                }
                aihl aihlVar = apku.b;
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                akroVar.c(aihlVarCheckIsLite);
                Pair pairCreate = null;
                if (akroVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    akroVar.c(aihlVarCheckIsLite2);
                    Object objK = akroVar.j.k(aihlVarCheckIsLite2.d);
                    apku apkuVar = (apku) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                    if ((apkuVar.c & 4) != 0 && !apkuVar.f.isEmpty() && ((iAS = a.aS(apkuVar.d)) == 0 || iAS != 3)) {
                        String str = apkuVar.f;
                        amjx amjxVar = apkuVar.e;
                        if (amjxVar == null) {
                            amjxVar = amjx.a;
                        }
                        pairCreate = Pair.create(str, amjxVar);
                    }
                }
                if (pairCreate != null) {
                    hashSet.add(objD);
                    ?? r4 = this.h;
                    if (!r4.containsKey(objD)) {
                        Object obj = this.b;
                        Object obj2 = this.c;
                        Object obj3 = this.e;
                        amjx amjxVar2 = (amjx) pairCreate.second;
                        Object obj4 = this.f;
                        Object obj5 = this.a;
                        Object obj6 = this.g;
                        Optional optionalOf = Optional.of(obj4);
                        Optional optionalEmpty = Optional.empty();
                        Optional optionalEmpty2 = Optional.empty();
                        Optional optionalOfNullable = Optional.ofNullable(obj5);
                        Optional optionalOfNullable2 = Optional.ofNullable(obj6);
                        String str2 = (String) pairCreate.first;
                        abxv abxvVar = (abxv) obj;
                        Context context = (Context) abxvVar.c.io();
                        context.getClass();
                        avmb avmbVar = (avmb) abxvVar.a.io();
                        avmbVar.getClass();
                        ?? Io = abxvVar.b.io();
                        Io.getClass();
                        Executor executor = (Executor) abxvVar.d.io();
                        executor.getClass();
                        amjxVar2.getClass();
                        str2.getClass();
                        r4.put(objD, new aecj(context, avmbVar, Io, executor, (vwt) obj2, (View) obj3, amjxVar2, optionalOf, optionalEmpty, optionalEmpty2, optionalOfNullable, optionalOfNullable2, str2));
                    }
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [bec, java.lang.Object] */
    public final Object c(awoq awoqVar) throws Throwable {
        vzc vzcVar;
        if (awoqVar instanceof vzc) {
            vzcVar = (vzc) awoqVar;
            int i = vzcVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzcVar.b = i - Integer.MIN_VALUE;
            } else {
                vzcVar = new vzc(this, awoqVar);
            }
        } else {
            vzcVar = new vzc(this, awoqVar);
        }
        Object objO = vzcVar.a;
        awox awoxVar = awox.a;
        int i2 = vzcVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(objO);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objO);
            }
            ((vza) this.g).c();
            return awmy.a;
        }
        atqp.j(objO);
        Object obj = this.c;
        vzcVar.b = 1;
        objO = awqx.o(((wjr) obj).a.b(), vzcVar);
        if (objO == awoxVar) {
            return awoxVar;
        }
        Object obj2 = this.g;
        vzf vzfVar = (vzf) objO;
        aiqj aiqjVar = vzfVar.c;
        if (aiqjVar == null) {
            aiqjVar = aiqj.a;
        }
        aiqjVar.getClass();
        String str = vzfVar.d;
        str.getClass();
        vzcVar.b = 2;
        if (((vza) obj2).b(aiqjVar, str, vzcVar) == awoxVar) {
            return awoxVar;
        }
        ((vza) this.g).c();
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [bec, java.lang.Object] */
    public final Object d(awoq awoqVar) throws Throwable {
        vzd vzdVar;
        if (awoqVar instanceof vzd) {
            vzdVar = (vzd) awoqVar;
            int i = vzdVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzdVar.b = i - Integer.MIN_VALUE;
            } else {
                vzdVar = new vzd(this, awoqVar);
            }
        } else {
            vzdVar = new vzd(this, awoqVar);
        }
        Object objO = vzdVar.a;
        awox awoxVar = awox.a;
        int i2 = vzdVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(objO);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objO);
            }
            ((vza) this.i).c();
            return awmy.a;
        }
        atqp.j(objO);
        Object obj = this.c;
        vzdVar.b = 1;
        objO = awqx.o(((wjr) obj).b.b(), vzdVar);
        if (objO == awoxVar) {
            return awoxVar;
        }
        Object obj2 = this.i;
        vzg vzgVar = (vzg) objO;
        aiqx aiqxVar = vzgVar.c;
        if (aiqxVar == null) {
            aiqxVar = aiqx.a;
        }
        aiqxVar.getClass();
        String str = vzgVar.d;
        str.getClass();
        vzdVar.b = 2;
        if (((vza) obj2).b(aiqxVar, str, vzdVar) == awoxVar) {
            return awoxVar;
        }
        ((vza) this.i).c();
        return awmy.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awut, java.lang.Object] */
    public final void e(aiqi aiqiVar) {
        aiqiVar.getClass();
        awro.t(this.e, null, 0, new vzb(this, aiqiVar, null), 3);
    }

    public final void f(alei aleiVar) {
        aleiVar.getClass();
        aihf aihfVarCreateBuilder = aiqi.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aigj aigjVar = aleiVar.f == 8 ? (aigj) aleiVar.g : aigj.d;
        aigjVar.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        aiqi aiqiVar = (aiqi) aihfVarCreateBuilder.instance;
        aiqiVar.c = 1;
        aiqiVar.d = aigjVar;
        String str = aleiVar.m;
        str.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        aiqi aiqiVar2 = (aiqi) aihfVarCreateBuilder.instance;
        aiqiVar2.b |= 1;
        aiqiVar2.g = str;
        aigj aigjVar2 = aleiVar.h == 10 ? (aigj) aleiVar.i : aigj.d;
        aigjVar2.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        aiqi aiqiVar3 = (aiqi) aihfVarCreateBuilder.instance;
        aiqiVar3.e = 3;
        aiqiVar3.f = aigjVar2;
        String str2 = aleiVar.n;
        str2.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        aiqi aiqiVar4 = (aiqi) aihfVarCreateBuilder.instance;
        aiqiVar4.b |= 2;
        aiqiVar4.h = str2;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        e((aiqi) aihnVarBuild);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aunn, java.lang.Object] */
    public final void g() {
        abxv abxvVar = (abxv) this.h.io();
        zwa zwaVarHw = ((zwh) this.d.io()).hw();
        zwaVarHw.getClass();
        String str = ((vza) this.i).a;
        String str2 = ((vza) this.g).a;
        Object obj = ((AtomicReference) this.a).get();
        obj.getClass();
        str.getClass();
        str2.getClass();
        abxvVar.c.put(zwaVarHw, new vyv(str, str2, (String) obj));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [awut, java.lang.Object] */
    public final void h() {
        if (!((AtomicBoolean) this.f).compareAndSet(false, true)) {
            ListenableFuture listenableFuture = aher.a;
            return;
        }
        awrc.ag(this.e, awov.a, new dnf(this, (awoq) null, 4));
    }

    public final int i() {
        return ((AtomicInteger) this.g).get();
    }

    public final int j() {
        return ((AtomicInteger) this.i).get();
    }

    public final int k() {
        return ((AtomicInteger) this.h).get();
    }

    public final tqt l() {
        Object obj = this.h;
        tqt tqtVar = tqt.a;
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (atomicInteger.get() == 1) {
            Object obj2 = ((AtomicReference) this.a).get();
            obj2.getClass();
            tqtVar = (tqt) obj2;
        }
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        atomicInteger.get();
        Object obj6 = ((AtomicReference) obj3).get();
        Object obj7 = ((AtomicReference) obj4).get();
        ((AtomicBoolean) obj5).get();
        Objects.toString(tqtVar);
        Objects.toString(obj6);
        Objects.toString(obj7);
        return tqtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, oii] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture m(String str, final oiw oiwVar, final int i, final long j, final String str2, final Uri uri, final String str3, final long j2, final oir oirVar, omw omwVar, final int i2, final List list, final aifv aifvVar) {
        ahcy ahcyVar = new ahcy() { // from class: omv
            /* JADX WARN: Type inference failed for: r0v7, types: [agfr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, onc] */
            /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, oii] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, oii] */
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj) {
                long jV;
                float fMin;
                int iAS;
                Uri uri2 = uri;
                aesp aespVar = this.l;
                String str4 = str3;
                if (str4.startsWith("http")) {
                    aespVar.b.s();
                    if (!str4.startsWith("https")) {
                        onb.d("%s: File url = %s is not secure", "MddFileDownloader", str4);
                        acb acbVarA = oig.a();
                        acbVarA.b = oif.INSECURE_URL_ERROR;
                        return ahng.m(acbVarA.a());
                    }
                }
                try {
                    jV = ((ayq) aespVar.h).V(uri2);
                } catch (IOException unused) {
                    jV = 0;
                }
                try {
                    Object obj2 = aespVar.f;
                    long j3 = j2 - jV;
                    ?? r6 = aespVar.b;
                    r6.m();
                    boolean zG = nsp.g(str4, new agqj("inlinefile"));
                    oir oirVar2 = oirVar;
                    if (!zG || j3 != 0) {
                        StatFs statFs = new StatFs(((Context) obj2).getFilesDir().getAbsolutePath());
                        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                        long availableBlocks = (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) - j3;
                        r6.n();
                        float f = blockCount * 0.1f;
                        r6.g();
                        double dMin = Math.min(f, 5.24288E8f);
                        if (oirVar2 != null) {
                            int iAS2 = a.aS(oirVar2.c);
                            if (iAS2 == 0) {
                                iAS2 = 1;
                            }
                            int i3 = iAS2 - 1;
                            if (i3 == 1) {
                                r6.n();
                                fMin = Math.min(f, r6.a());
                            } else if (i3 == 2) {
                                r6.n();
                                r6.h();
                                fMin = Math.min(f, 2097152.0f);
                            }
                            dMin = fMin;
                        }
                        if (availableBlocks <= dMin) {
                            acb acbVarA2 = oig.a();
                            acbVarA2.b = oif.LOW_DISK_ERROR;
                            throw acbVarA2.a();
                        }
                    }
                    String str5 = str2;
                    long j4 = j;
                    int i4 = i;
                    oiw oiwVar2 = oiwVar;
                    r6.B();
                    Object obj3 = aespVar.i;
                    ?? r10 = aespVar.g;
                    aihf aihfVarCreateBuilder = oit.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    oit oitVar = (oit) aihfVarCreateBuilder.instance;
                    oiwVar2.getClass();
                    oitVar.c = oiwVar2;
                    oitVar.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    oit oitVar2 = (oit) aihfVarCreateBuilder.instance;
                    oitVar2.b |= 2;
                    oitVar2.d = j4;
                    aihfVarCreateBuilder.copyOnWrite();
                    oit oitVar3 = (oit) aihfVarCreateBuilder.instance;
                    str5.getClass();
                    oitVar3.b |= 4;
                    oitVar3.e = str5;
                    aihfVarCreateBuilder.copyOnWrite();
                    oit oitVar4 = (oit) aihfVarCreateBuilder.instance;
                    oitVar4.b |= 8;
                    oitVar4.f = i4;
                    oit oitVar5 = (oit) aihfVarCreateBuilder.build();
                    synchronized (((ooh) obj3).b) {
                        HashMap map = ((ooh) obj3).c;
                        if (!map.containsKey(oitVar5)) {
                            map.put(oitVar5, new qqo(new oog(((ooh) obj3).a, r10, oitVar5), new oof(((ooh) obj3).e, 0), 10L, TimeUnit.SECONDS));
                        }
                        ((ooh) obj3).d.put(uri2, (qqo) map.get(oitVar5));
                    }
                    agev agevVar = (agev) aespVar.a;
                    if (agevVar.g()) {
                        ooe ooeVar = (ooe) agevVar.c();
                        String str6 = oiwVar2.c;
                        synchronized (ooe.class) {
                            ooeVar.b.put(uri2, str6);
                        }
                    }
                    ojw ojwVarA = ojx.a();
                    ojwVarA.e(uri2);
                    ojwVarA.g(str4);
                    if (oirVar2 == null || (iAS = a.aS(oirVar2.d)) == 0 || iAS != 2) {
                        ojwVarA.c(ojv.b);
                    } else {
                        ojwVarA.c(ojv.c);
                    }
                    int i5 = i2;
                    if (i5 > 0) {
                        ojwVarA.f(i5);
                    }
                    List<ois> list2 = list;
                    agjz agjzVar = new agjz(4);
                    for (ois oisVar : list2) {
                        agjzVar.h(Pair.create(oisVar.b, oisVar.c));
                    }
                    aifv aifvVar2 = aifvVar;
                    ojwVarA.d(agjzVar.g());
                    ojwVarA.b(aifvVar2);
                    return ((xsc) aespVar.e.io()).ai(ojwVarA.a());
                } catch (oig e) {
                    onb.d("%s: Not enough space to download file %s", "MddFileDownloader", str4);
                    return ahng.m(e);
                }
            }
        };
        ahev ahevVar = new ahev(new fxv(6));
        ooi ooiVarD = ooi.d(ahevVar);
        ?? r4 = this.d;
        ooi ooiVarC = ooiVarD.f(ahcyVar, r4).f(new ols(omwVar, uri, 9), r4).c(Exception.class, new ols(this, omwVar, 10), r4);
        this.b.w();
        return ooi.d(ahno.ap(new ium(this, uri, ooiVarC, 10, (char[]) null), r4)).f(new iaj(this, ooiVarC, ahevVar, uri, 20), r4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oii] */
    public final ListenableFuture n(Uri uri) {
        this.b.w();
        return ahng.n(agev.h((ListenableFuture) ((HashMap) this.c).get(uri)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oii] */
    public final ListenableFuture o(Uri uri) {
        this.b.w();
        ListenableFuture listenableFuture = (ListenableFuture) ((HashMap) this.c).remove(uri);
        return listenableFuture == null ? aher.a : listenableFuture;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void p(Uri uri) {
        ahno.as(n(uri), new ols(this, uri, 8), this.d);
    }

    public final ibv q() {
        return (ibv) ((heg) this.i).a;
    }

    public final ibv r() {
        ibv ibvVar = ibv.LOOP_OFF;
        int iOrdinal = ((ibv) ((heg) this.i).a).ordinal();
        if (iOrdinal == 0) {
            return ((icj) this.f).G() ? ibv.LOOP_ONE : ibv.LOOP_ALL;
        }
        if (iOrdinal != 1) {
            return iOrdinal != 3 ? ibv.LOOP_OFF : ibv.LOOP_DISABLED;
        }
        return ((icj) this.f).G() ? ibv.LOOP_OFF : ibv.LOOP_ONE;
    }

    public final avlh s() {
        return ((avlh) this.g).P().p();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [awmd, java.lang.Object] */
    public final void t(ibv ibvVar, boolean z) {
        yco ycoVar;
        String str;
        heg hegVar = (heg) this.i;
        if (((ibv) hegVar.a).equals(ibvVar)) {
            return;
        }
        hegVar.a = ibvVar;
        ((awku) this.g).kk(hegVar.a);
        ((abvk) this.d.io()).B();
        jko jkoVarEdit = ((jkp) this.a).edit();
        jkoVarEdit.b(gzj.LOOP_MODE, ((ibv) hegVar.a).g);
        jkoVarEdit.apply();
        if (z && w() && (ycoVar = ((ycp) this.b).e) != null && ycoVar.b() == 1) {
            int iOrdinal = ibvVar.ordinal();
            if (iOrdinal != 1) {
                str = iOrdinal != 2 ? "LOOP_MODE_OFF" : "LOOP_MODE_ONE";
            } else {
                str = "LOOP_MODE_ALL";
            }
            ycoVar.ab(str);
        }
    }

    public final void u() {
        if (((ibv) ((heg) this.i).a).equals(ibv.LOOP_DISABLED)) {
            return;
        }
        t(r(), true);
    }

    public final void v() {
        x(y());
    }

    public final boolean w() {
        yco ycoVar = ((ycp) this.b).e;
        return ycoVar != null && ycoVar.b() == 1 && ycoVar.at("mlm");
    }

    public aesp(icj icjVar, awmd awmdVar, jkp jkpVar, heg hegVar, ycp ycpVar, abvn abvnVar, avmb avmbVar) {
        ibw ibwVar = new ibw(this);
        this.e = ibwVar;
        this.h = new ibx(this);
        this.f = icjVar;
        this.d = awmdVar;
        this.a = jkpVar;
        this.i = hegVar;
        this.b = ycpVar;
        this.c = abvnVar;
        Object obj = hegVar.a;
        int i = awku.k;
        obj.getClass();
        this.g = new awku(obj);
        ycpVar.a(ibwVar);
        int i2 = 10;
        icjVar.e().L(avmbVar).al(new hxi(this, 13), new hyx(i2));
        abvnVar.P().L(avmbVar).al(new hxi(this, 14), new hyx(i2));
        Object obj2 = hegVar.a;
        if (!y()) {
            x(false);
            return;
        }
        if (((ibv) obj2).equals(ibv.LOOP_DISABLED)) {
            t(ibv.LOOP_OFF, true);
        }
    }

    public aesp(Context context, agfr agfrVar, ayq ayqVar, ooh oohVar, agev agevVar, onc oncVar, Executor executor, oii oiiVar) {
        this.c = new HashMap();
        this.f = context;
        this.e = agfrVar;
        this.h = ayqVar;
        this.i = oohVar;
        this.a = agevVar;
        this.g = oncVar;
        this.d = executor;
        this.b = oiiVar;
        new syn(executor, new ons());
    }

    public aesp(bth bthVar, cch cchVar, bvd bvdVar, int i, int i2, int i3, int i4) {
        this.h = bthVar;
        this.d = cchVar;
        this.i = new btl();
        this.f = bvdVar.d(((ccm) bthVar).h, new bwd(this, 0));
        this.a = new bwf(this, i);
        this.b = new bwg(this, i2);
        this.c = new bwh(this, i3);
        this.g = new bwi(this, i4);
        bwe bweVar = new bwe(this);
        this.e = bweVar;
        bthVar.y(bweVar);
    }

    public aesp(wjr wjrVar, mbc mbcVar, awut awutVar, aunn aunnVar, aunn aunnVar2) {
        mbcVar.getClass();
        awutVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        this.c = wjrVar;
        this.e = awutVar;
        this.h = aunnVar;
        this.d = aunnVar2;
        this.b = new axfi(false);
        this.f = new AtomicBoolean(false);
        this.a = new AtomicReference("");
        bfu bfuVar = new bfu(16);
        bfu bfuVar2 = new bfu(17);
        aiqx aiqxVar = aiqx.a;
        aiqxVar.getClass();
        this.i = new vza(bfuVar, bfuVar2, aiqxVar, new bfu(18), false);
        bfu bfuVar3 = new bfu(19);
        bfu bfuVar4 = new bfu(20);
        aiqj aiqjVar = aiqj.a;
        aiqjVar.getClass();
        this.g = new vza(bfuVar3, bfuVar4, aiqjVar, new xzn(1), true);
    }

    public aesp(Context context, ahex ahexVar, xwo xwoVar, awmd awmdVar, xwj xwjVar, xwm xwmVar, xwq xwqVar, vxz vxzVar) {
        this.e = new HashMap();
        this.c = context.getResources();
        this.a = ahexVar;
        this.d = xwoVar;
        this.b = awmdVar;
        this.i = xwjVar;
        this.h = xwmVar;
        this.f = xwqVar;
        this.g = vxzVar;
    }

    public aesp(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9) {
        awmdVar.getClass();
        this.e = awmdVar;
        awmdVar2.getClass();
        this.h = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.f = awmdVar5;
        awmdVar6.getClass();
        this.b = awmdVar6;
        awmdVar7.getClass();
        this.g = awmdVar7;
        awmdVar8.getClass();
        this.i = awmdVar8;
        awmdVar9.getClass();
        this.d = awmdVar9;
    }

    public aesp(abxv abxvVar, ci ciVar, vwt vwtVar, View view, adkz adkzVar, mav mavVar, max maxVar) {
        this.h = new HashMap();
        this.b = abxvVar;
        this.c = vwtVar;
        this.f = ciVar;
        this.e = view;
        this.d = adkzVar;
        aecd aecdVar = new aecd(this);
        this.i = aecdVar;
        adkzVar.h(aecdVar);
        this.a = mavVar;
        this.g = maxVar;
    }

    public aesp(Context context, vxz vxzVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, avmb avmbVar, awmd awmdVar4, tqj tqjVar) {
        this.a = context;
        this.b = awmdVar;
        this.i = vxzVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = avmbVar;
        this.f = awmdVar4;
        this.g = tqjVar;
        this.h = new awli();
    }
}
