package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.system.Os;
import app.rive.semantics.SemanticState;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.blocks.runtime.JavaRuntime;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.ClientErrorLoggerAdapter;
import com.google.android.libraries.elements.interfaces.DirectUpdateDataRelay;
import com.google.android.libraries.elements.interfaces.ExecutorRegistry;
import com.google.android.libraries.notifications.platform.entrypoints.job.GnpWorker;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import com.google.android.libraries.youtube.media.interfaces.MetadataStore;
import com.google.android.libraries.youtube.media.player.exo2.platypus.EnvoyNetFetchProvider;
import com.google.android.libraries.youtube.media.player.exo2.platypus.ExecutorImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.MetadataStoreImpl;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackNetFetchFactory;
import com.google.android.libraries.youtube.media.player.exo2.platypus.SharedBandwidthSampleTrackerWrapper;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;
import com.google.apps.tiktok.concurrent.AndroidFuturesService;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ghs implements aupr {
    public final ght a;
    private final int b;

    public ghs(ght ghtVar, int i) {
        this.a = ghtVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v143, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [afsc, java.lang.Object] */
    private final Object b() {
        Object qglVar;
        Object tahVar;
        int i = this.b;
        int i2 = 2;
        byte[] bArr = null;
        boolean z = false;
        int i3 = 1;
        switch (i) {
            case 0:
                ght ghtVar = this.a;
                return ahno.aG((afwd) ghtVar.vh.io(), ghtVar.gq(), agpr.a);
            case 1:
                ght ghtVar2 = this.a;
                Object objIo = ghtVar2.k.io();
                mbc mbcVar = (mbc) ghtVar2.l.io();
                aupr auprVar = ghtVar2.z;
                aupr auprVar2 = ghtVar2.vi;
                aftz aftzVar = aftz.a;
                aftzVar.getClass();
                agkj agkjVar = agpn.b;
                return new afwd((afuk) objIo, mbcVar, auprVar, auprVar2, aftzVar, agkjVar, agkjVar);
            case 2:
                return new afuk((ExecutorService) this.a.j.io());
            case 3:
                ght ghtVar3 = this.a;
                return new mbs(ghtVar3.bJ(), ghtVar3.i);
            case 4:
                ght ghtVar4 = this.a;
                ThreadFactory threadFactory = (ThreadFactory) ghtVar4.c.io();
                ahey aheyVar = (ahey) ghtVar4.d.io();
                ghtVar4.u();
                zhk zhkVar = (zhk) ghtVar4.f.io();
                zhkVar.getClass();
                agfa agfaVar = new agfa(zhkVar);
                return ksy.aM(threadFactory, aheyVar, agfaVar);
            case 5:
                return new mcs(11);
            case 6:
                mbg mbgVar = new mbg(ksy.aK("Scheduler", new qkf(i3)));
                mbgVar.setRemoveOnCancelPolicy(true);
                ahey aheyVarB = MoreExecutors.b(mbgVar);
                aheyVarB.getClass();
                return aheyVarB;
            case 7:
                return new HashSet();
            case 8:
                return new zhk();
            case 9:
                mcp mcpVarAJ = ksy.aJ(agpn.b);
                mcpVarAJ.getClass();
                return mcpVarAJ;
            case 10:
                return new tyq(1);
            case 11:
                ght ghtVar5 = this.a;
                return new mbs(ghtVar5.bK(), ghtVar5.i);
            case 12:
                ght ghtVar6 = this.a;
                ThreadFactory threadFactory2 = (ThreadFactory) ghtVar6.m.io();
                ahey aheyVar2 = (ahey) ghtVar6.d.io();
                int iMax = Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
                Object objCC = ghtVar6.cC();
                ghtVar6.u();
                zhk zhkVar2 = (zhk) ghtVar6.f.io();
                zhkVar2.getClass();
                agfa agfaVar2 = new agfa(zhkVar2);
                agfa agfaVar3 = new agfa(Boolean.valueOf(ghtVar6.ep()));
                kjc kjcVar = (kjc) ghtVar6.r.io();
                ghtVar6.v();
                return idj.r(threadFactory2, aheyVar2, iMax, objCC, agfaVar2, agfaVar3, kjcVar);
            case 13:
                return new mcs(0);
            case 14:
                ght ghtVar7 = this.a;
                aupr auprVar3 = ghtVar7.x;
                Optional optionalEmpty = Optional.empty();
                sxd sxdVar = new sxd(auprVar3, (Context) ghtVar7.v.io());
                optionalEmpty.isPresent();
                tqf tqfVarG = ((hhb) sxdVar.a.io()).g(new File(sxdVar.b.getFilesDir(), tqg.a()));
                tqi.a = tqfVarG;
                return tqfVarG;
            case 15:
                return new hhb(this);
            case 16:
                return new zro();
            case 17:
                ahey aheyVar3 = (ahey) this.a.t.io();
                aheyVar3.getClass();
                return aheyVar3;
            case 18:
                ght ghtVar8 = this.a;
                return new mbs(ghtVar8.bL(), ghtVar8.i);
            case 19:
                ght ghtVar9 = this.a;
                ThreadFactory threadFactory3 = (ThreadFactory) ghtVar9.p.io();
                ahey aheyVar4 = (ahey) ghtVar9.d.io();
                int iC = ghtVar9.c();
                mdj mdjVar = mdj.a;
                mdj mdjVar2 = (mdj) new agfa(mdjVar).e(mdjVar);
                Object objCC2 = ghtVar9.cC();
                ghtVar9.u();
                zhk zhkVar3 = (zhk) ghtVar9.f.io();
                zhkVar3.getClass();
                agfa agfaVar4 = new agfa(zhkVar3);
                agfa agfaVar5 = new agfa(Boolean.valueOf(ghtVar9.ep()));
                kjc kjcVar2 = (kjc) ghtVar9.r.io();
                return idj.q(threadFactory3, aheyVar4, iC, mdjVar2, objCC2, agfaVar4, agfaVar5, kjcVar2);
            case 20:
                return new mcs(10);
            case 21:
                return new kjc((char[]) null);
            case 22:
                tqv tqvVar = new tqv((Context) this.a.v.io());
                tqvVar.a();
                return tqvVar;
            case 23:
                return this.a.Gx.b;
            case 24:
                return this.a.bI();
            case 25:
                ght ghtVar10 = this.a;
                axfd axfdVarGW = ghtVar10.gW();
                aunn aunnVarB = aupm.b(ghtVar10.vd);
                ght.ey();
                Executor executor = (Executor) ghtVar10.uT.io();
                aupr auprVar4 = ghtVar10.vf;
                agpr agprVar = agpr.a;
                qglVar = new qgl(axfdVarGW, aunnVarB, executor, auprVar4);
                return qglVar;
            case 26:
                return new qfe(aupm.b(this.a.uA));
            case 27:
                return new agqj(this.a.Q());
            case 28:
                ght ghtVar11 = this.a;
                return new aepr((tbt) ghtVar11.I.io(), (aetb) ghtVar11.uw.io());
            case 29:
                ght ghtVar12 = this.a;
                return new tbt((Executor) ghtVar12.B.io(), (mbc) ghtVar12.l.io(), Optional.of(ghtVar12.pA));
            case 30:
                return new mcg((mbc) this.a.l.io(), new Handler(Looper.getMainLooper()));
            case 31:
                ght ghtVar13 = this.a;
                tag tagVar = (tag) ghtVar13.bO.io();
                tqj tqjVar = (tqj) ghtVar13.q.io();
                spa spaVar = new spa(new ege(tagVar, 6, null));
                int i4 = tqr.a;
                if (tqjVar.k(1073814494) || tqjVar.k(1073814495)) {
                    spaVar.d();
                }
                return spaVar.c();
            case 32:
                ght ghtVar14 = this.a;
                tqj tqjVar2 = (tqj) ghtVar14.q.io();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar14.u.io();
                Executor executor2 = (Executor) ghtVar14.u.io();
                aupr auprVar5 = ghtVar14.uu;
                tahVar = new tah(tqjVar2, scheduledExecutorService, executor2, auprVar5, auprVar5);
                return tahVar;
            case 33:
                ght ghtVar15 = this.a;
                Set setDB = ghtVar15.dB();
                agfa agfaVar6 = new agfa(ghtVar15.dH());
                tqj tqjVar3 = (tqj) ghtVar15.q.io();
                int i5 = tqr.a;
                int iA = tqjVar3.a(1073946198);
                if (iA == 1) {
                    i2 = 1;
                } else if (iA == 4) {
                    i2 = 4;
                }
                ahey aheyVarJ = taq.J(i2, taq.I(tqjVar3), "logging", setDB, agfaVar6);
                aheyVarJ.getClass();
                return aheyVarJ;
            case 34:
                ght ghtVar16 = this.a;
                aupr auprVar6 = ghtVar16.C;
                agfa agfaVar7 = new agfa(ghtVar16.bb());
                auprVar6.getClass();
                szo szoVar = new szo((szy) agfaVar7.d(new qhs(auprVar6, 15)));
                Logger.getLogger(new ahfg(new vp(3)).getClass().getName()).addHandler(szoVar);
                return szoVar;
            case 35:
                return new szr((Executor) this.a.B.io());
            case 36:
                return new szt();
            case 37:
                ght ghtVar17 = this.a;
                return new aciz((aess) ghtVar17.E.io(), ghtVar17.uq, (char[]) null);
            case 38:
                ght ghtVar18 = this.a;
                tahVar = new aess((Context) ghtVar18.v.io(), (mbc) ghtVar18.l.io(), (ScheduledExecutorService) ghtVar18.u.io(), (tqv) ghtVar18.w.io(), (trl) ghtVar18.D.io());
                return tahVar;
            case 39:
                return new trl((tqj) this.a.q.io());
            case 40:
                ght ghtVar19 = this.a;
                return new aesq((aess) ghtVar19.E.io(), ghtVar19.up);
            case 41:
                ght ghtVar20 = this.a;
                Context context = (Context) ghtVar20.v.io();
                tfq tfqVar = (tfq) ghtVar20.cd.io();
                Optional optionalOf = Optional.of((vca) ghtVar20.fP.io());
                aepy aepyVar = (aepy) ghtVar20.uk.io();
                aepx aepxVar = (aepx) ghtVar20.ul.io();
                vxz vxzVar = (vxz) ghtVar20.um.io();
                ahnz ahnzVar = (ahnz) ghtVar20.uo.io();
                Optional optionalEmpty2 = Optional.empty();
                ghtVar20.fo();
                tahVar = new aepv(context, tfqVar, optionalOf, aepyVar, aepxVar, vxzVar, ahnzVar, optionalEmpty2, (tqj) ghtVar20.q.io(), (mbc) ghtVar20.l.io());
                return tahVar;
            case 42:
                ght ghtVar21 = this.a;
                tahVar = new tfq((tof) ghtVar21.H.io(), ghtVar21.k(), ghtVar21.N, (tfi) ghtVar21.ui.io(), (ScheduledExecutorService) ghtVar21.u.io(), (avmb) ghtVar21.dC.io());
                return tahVar;
            case 43:
                ght ghtVar22 = this.a;
                ConnectivityManager connectivityManagerK = ghtVar22.k();
                WifiManager wifiManager = (WifiManager) ((Context) ghtVar22.v.io()).getSystemService("wifi");
                wifiManager.getClass();
                return new tof(connectivityManagerK, wifiManager, (wmy) ghtVar22.G.io());
            case 44:
                ght ghtVar23 = this.a;
                return new wmy((Context) ghtVar23.v.io(), ghtVar23.F, (tqj) ghtVar23.q.io());
            case 45:
                ght ghtVar24 = this.a;
                return new oml((Context) ghtVar24.v.io(), (ahey) ghtVar24.u.io(), (tqj) ghtVar24.q.io());
            case 46:
                ght ghtVar25 = this.a;
                return new tfm(ghtVar25.I, (tfi) ghtVar25.ui.io());
            case 47:
                ght ghtVar26 = this.a;
                return new tfi((Context) ghtVar26.v.io(), (tao) ghtVar26.aq.io(), (Handler) ghtVar26.cY.io());
            case 48:
                tao taoVar = (tao) this.a.uh.io();
                return taoVar == null ? tao.a : taoVar;
            case 49:
                ght ghtVar27 = this.a;
                return new vxv(ghtVar27.at, ghtVar27.av);
            case 50:
                vxu vxuVar = (vxu) ((omn) this.a.au.io()).a.io();
                vxuVar.getClass();
                return vxuVar;
            case 51:
                ght ghtVar28 = this.a;
                tahVar = new omn(ghtVar28.J, (mbc) ghtVar28.l.io(), ghtVar28.I, (tqj) ghtVar28.q.io(), (ayq) ghtVar28.R.io(), ghtVar28.S, ghtVar28.qt, ghtVar28.bd);
                return tahVar;
            case 52:
                Context context2 = (Context) this.a.v.io();
                String str = (String) Optional.empty().orElse("youtube");
                str.getClass();
                SharedPreferences sharedPreferences = context2.getSharedPreferences(str, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 53:
                ght ghtVar29 = this.a;
                return new ayq((tqj) ghtVar29.q.io(), Optional.empty(), (tre) ghtVar29.Q.io());
            case 54:
                ght ghtVar30 = this.a;
                tahVar = new tre((tyv) ghtVar30.L.io(), (trf) ghtVar30.M.io(), (mbc) ghtVar30.l.io(), (tqj) ghtVar30.q.io(), ghtVar30.w, (zhk) ghtVar30.f.io(), ghtVar30.u, ghtVar30.A, (Context) ghtVar30.v.io(), ghtVar30.P);
                return tahVar;
            case 55:
                PackageInfo packageInfo = (PackageInfo) this.a.K.io();
                Optional optionalEmpty3 = Optional.empty();
                optionalEmpty3.isPresent();
                return new tyv((String) optionalEmpty3.orElse(packageInfo.versionName));
            case 56:
                Context context3 = (Context) this.a.v.io();
                try {
                    PackageInfo packageInfo2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
                    packageInfo2.getClass();
                    return packageInfo2;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new agfz("No PackageInfo for ".concat(String.valueOf(context3.getPackageName())), e);
                }
            case 57:
                return new trf((mbc) this.a.l.io());
            case 58:
                return ((avlh) ((tfm) this.a.N.io()).c).P().p();
            case 59:
                ght ghtVar31 = this.a;
                return new ahgb((Context) ghtVar31.v.io(), (tqj) ghtVar31.q.io(), (Executor) ghtVar31.u.io());
            case 60:
                return new dov((Context) this.a.v.io(), Optional.empty());
            case 61:
                ght ghtVar32 = this.a;
                return new hed((Context) ghtVar32.v.io(), (awmd) ghtVar32.cs, (awut) ghtVar32.bo.io());
            case 62:
                ght ghtVar33 = this.a;
                tahVar = new syn(ghtVar33.z, ghtVar33.ac, ghtVar33.ad, ghtVar33.tG, (tqj) ghtVar33.q.io());
                return tahVar;
            case 63:
                ght ghtVar34 = this.a;
                abhh abhhVar = (abhh) ghtVar34.am.io();
                ghtVar34.bf();
                ghtVar34.gi();
                aupr auprVar7 = ghtVar34.ug;
                return new afhp(abhhVar, auprVar7);
            case 64:
                ght ghtVar35 = this.a;
                return new abhh(ghtVar35.cd(), ghtVar35.ce(), (char[]) null);
            case 65:
                ght ghtVar36 = this.a;
                return ghtVar36.fZ().l(ghtVar36.bj(), (ayq) ghtVar36.Y.io());
            case 66:
                ght ghtVar37 = this.a;
                return new afik((dxu) ghtVar37.V.io(), (Executor) ghtVar37.U.io(), z ? 1 : 0);
            case 67:
                return new dxu((Executor) this.a.U.io());
            case 68:
                ght ghtVar38 = this.a;
                Executor executor3 = ((Boolean) new agfa(Boolean.TRUE).e(Boolean.FALSE)).booleanValue() ? (Executor) ghtVar38.T.io() : (Executor) ghtVar38.t.io();
                executor3.getClass();
                return executor3;
            case 69:
                ght ghtVar39 = this.a;
                return new mbs(ghtVar39.bJ(), ghtVar39.i);
            case 70:
                ght ghtVar40 = this.a;
                return ghtVar40.fZ().l(ghtVar40.bk(), (ayq) ghtVar40.Y.io());
            case 71:
                return new auor((Context) this.a.v.io());
            case 72:
                Context context4 = (Context) this.a.v.io();
                mef.g();
                return new ayq(agke.r(new qpp(new afwv(context4)), new qpt()));
            case 73:
                return new agqj(new hhb(this.a.gt(), bArr));
            case 74:
                return this.a.bD();
            case 75:
                ght ghtVar41 = this.a;
                return new axqr((afho) ghtVar41.ac.io(), (qrx) ghtVar41.aa.io());
            case 76:
                if (this.a.fM().m()) {
                    z = true;
                } else {
                    Boolean.FALSE.booleanValue();
                }
                return Boolean.valueOf(z);
            case 77:
                ght ghtVar42 = this.a;
                mbc mbcVar2 = (mbc) ghtVar42.l.io();
                Context context5 = (Context) ghtVar42.v.io();
                ahey aheyVar5 = (ahey) ghtVar42.t.io();
                ahex ahexVar = (ahex) ghtVar42.z.io();
                omr omrVarFM = ghtVar42.fM();
                afjn afjnVar = (afjn) ghtVar42.al.io();
                abhh abhhVar2 = (abhh) ghtVar42.am.io();
                abhhVar2.getClass();
                tahVar = new afry(mbcVar2, context5, aheyVar5, ahexVar, omrVarFM, afjnVar, new agfa(abhhVar2), (afrr) ghtVar42.an.io(), ghtVar42.cP(), agpn.b, agkj.l(afrd.a, ghtVar42.tQ, afrd.c, ghtVar42.tR, afrd.b, ghtVar42.tS), ghtVar42.ev(), ghtVar42.cD());
                return tahVar;
            case 78:
                ght ghtVar43 = this.a;
                Context context6 = (Context) ghtVar43.v.io();
                PowerManager powerManagerL = ghtVar43.l();
                ahey aheyVar6 = (ahey) ghtVar43.A.io();
                Map mapCZ = ghtVar43.cZ();
                Map mapCY = ghtVar43.cY();
                ghtVar43.gC();
                tahVar = new afjn(context6, powerManagerL, aheyVar6, mapCZ, mapCY, (ahey) ghtVar43.t.io(), (ahey) ghtVar43.T.io(), ghtVar43.fM());
                return tahVar;
            case 79:
                return new afjo();
            case 80:
                return AndroidFuturesService.class;
            case 81:
                return InternalForegroundService.class;
            case 82:
                return new jij((hhb) this.a.aj.io());
            case 83:
                return new hhb(this);
            case 84:
                return new afjq();
            case 85:
                ght ghtVar44 = this.a;
                qglVar = new afrr((Context) ghtVar44.v.io(), (ahex) ghtVar44.t.io(), ghtVar44.fM(), (mbc) ghtVar44.l.io());
                return qglVar;
            case 86:
                Optional optionalEmpty4 = Optional.empty();
                afrg afrgVar = afrg.a;
                optionalEmpty4.isPresent();
                return afrgVar;
            case 87:
                aupr auprVar8 = this.a.tO;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                TimeUnit timeUnit2 = TimeUnit.MINUTES;
                ArrayList<afrc> arrayList = new ArrayList();
                TimeUnit timeUnit3 = TimeUnit.DAYS;
                TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
                afrd afrdVar = afrd.a;
                TimeUnit timeUnit5 = TimeUnit.DAYS;
                TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
                arrayList.add(new afrc(afrdVar, 345600000L));
                ahno.P(true, "You must specify a minimum sync interval for all syncs.");
                agkh agkhVar = new agkh(4);
                for (afrc afrcVar : arrayList) {
                    agkhVar.e(afrcVar.a, afrcVar);
                }
                afrb afrbVar = new afrb(259200000L, 180000L, agkhVar.d(true));
                ahno.P(auprVar8 != null, "Every SyncletBinding must have a non-null Synclet.");
                return new afrg(true, afrbVar, auprVar8);
            case 88:
                ght ghtVar45 = this.a;
                tahVar = new afja((mbc) ghtVar45.l.io(), (abhh) ghtVar45.am.io(), (afid) ghtVar45.tF.io(), ghtVar45.bf(), (ahex) ghtVar45.z.io(), (ahex) ghtVar45.t.io(), ghtVar45.gw(), (auor) ghtVar45.tN.io());
                return tahVar;
            case 89:
                ght ghtVar46 = this.a;
                tahVar = new afid(ghtVar46.tJ, (abhh) ghtVar46.am.io(), (qrx) ghtVar46.tK.io(), (mbc) ghtVar46.l.io(), ghtVar46.tL, ghtVar46.e(), (Executor) ghtVar46.z.io());
                return tahVar;
            case 90:
                ght ghtVar47 = this.a;
                return new abhh((awmd) ghtVar47.tI, (Executor) ghtVar47.t.io());
            case 91:
                return agkz.n(this.a.dj());
            case 92:
                ght ghtVar48 = this.a;
                SharedPreferences sharedPreferences2 = (SharedPreferences) ghtVar48.J.io();
                aupr auprVar9 = ghtVar48.ap;
                tqj tqjVar4 = (tqj) ghtVar48.q.io();
                aupr auprVar10 = ghtVar48.ft;
                aupr auprVar11 = ghtVar48.tG;
                rmc rmcVar = (rmc) ghtVar48.tH.io();
                aupr auprVar12 = ghtVar48.u;
                int i6 = tqr.a;
                rmd rmjVar = tqjVar4.k(1073811005) ? new rmj(sharedPreferences2, auprVar9, tqjVar4, auprVar11, rmcVar, auprVar10, auprVar12) : new rmo(sharedPreferences2, auprVar9, tqjVar4, auprVar11, rmcVar, auprVar10, auprVar12);
                rmjVar.b();
                return rmjVar;
            case 93:
                ght ghtVar49 = this.a;
                Context context7 = (Context) ghtVar49.v.io();
                ahex ahexVar2 = (ahex) ghtVar49.u.io();
                bgt bgtVar = new bgt(new bgd(atop.a, ExtensionRegistryLite.getGeneratedRegistry()), new iqb(context7, 7));
                bgtVar.a = new bgr(new bfu(12));
                bgtVar.a(ahexVar2);
                return new omj(bgtVar.b());
            case 94:
                return new dov((xeu) this.a.aZ.io(), (byte[]) null);
            case 95:
                ght ghtVar50 = this.a;
                aupr auprVar13 = ghtVar50.tA;
                aupr auprVar14 = ghtVar50.tC;
                if (true != ((ztn) ghtVar50.ck.io()).a()) {
                    auprVar13 = auprVar14;
                }
                xeu xeuVar = (xeu) auprVar13.io();
                xeuVar.getClass();
                return xeuVar;
            case 96:
                return ((hhb) this.a.tz.io()).d();
            case 97:
                return new hhb(this);
            case 98:
                ght ghtVar51 = this.a;
                aupr auprVar15 = ghtVar51.as;
                tqj tqjVar5 = (tqj) ghtVar51.q.io();
                int i7 = tqr.a;
                if (true == tqjVar5.t(512L)) {
                    auprVar15 = ghtVar51.cg;
                }
                zus zusVar = (zus) auprVar15.io();
                zusVar.getClass();
                return zusVar;
            case 99:
                ght ghtVar52 = this.a;
                return new zut((mbc) ghtVar52.l.io(), ghtVar52.ar, (twh) ghtVar52.o.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        Object zrsVar;
        Object ztdVar;
        int i = this.b;
        int i2 = 2;
        switch (i) {
            case 100:
                ght ghtVar = this.a;
                zrsVar = new zrs((tao) ghtVar.aq.io(), (dov) ghtVar.S.io(), (tqj) ghtVar.q.io());
                return zrsVar;
            case 101:
                ght ghtVar2 = this.a;
                return zik.aR(ghtVar2.ty, ghtVar2.tx, ghtVar2.cc, ghtVar2.jG, ghtVar2.bw, (zwb) ghtVar2.bd.io(), (tbt) ghtVar2.I.io(), (tqv) ghtVar2.w.io(), ghtVar2.as, (mbc) ghtVar2.l.io(), ghtVar2.ar, (twh) ghtVar2.o.io(), (abxu) ghtVar2.dG.io(), (tqj) ghtVar2.q.io());
            case 102:
                ght ghtVar3 = this.a;
                return new ztm((ztd) ghtVar3.tx.io(), (zua) ghtVar3.tw.io(), (zvb) ghtVar3.qC.io(), (zus) ghtVar3.cj.io());
            case 103:
                ght ghtVar4 = this.a;
                ztdVar = new ztd((zua) ghtVar4.tw.io(), (zus) ghtVar4.cj.io());
                return ztdVar;
            case 104:
                return new zua((Set) this.a.ch.io());
            case 105:
                return this.a.bE();
            case 106:
                ght ghtVar5 = this.a;
                return zrp.h((tqj) ghtVar5.q.io(), ghtVar5.qT);
            case 107:
                ght ghtVar6 = this.a;
                return new zxn((tgg) ghtVar6.bv.io(), (mbc) ghtVar6.l.io(), (zrw) ghtVar6.bu.io(), (zwb) ghtVar6.bd.io(), (Set) ghtVar6.pS.io(), (vxz) ghtVar6.aL.io(), (vxz) ghtVar6.ba.io(), (Executor) ghtVar6.B.io());
            case 108:
                ght ghtVar7 = this.a;
                return zrp.e((tqj) ghtVar7.q.io(), aupm.b(ghtVar7.be), aupm.b(ghtVar7.bp));
            case 109:
                ght ghtVar8 = this.a;
                return zrp.g((tgm) ghtVar8.bf.io(), (tgl) ghtVar8.bk.io(), (ExecutorService) ghtVar8.u.io(), (ExecutorService) ghtVar8.z.io(), (Executor) ghtVar8.B.io());
            case 110:
                ght ghtVar9 = this.a;
                return zrp.p(ghtVar9.gI(), (tgm) ghtVar9.rk.io());
            case 111:
                ght ghtVar10 = this.a;
                ztdVar = new abfv((awmd) ghtVar10.u, (awmd) ghtVar10.aw, (byte[]) null);
                return ztdVar;
            case 112:
                ght ghtVar11 = this.a;
                vxu vxuVar = (vxu) ghtVar11.at.io();
                vyo vyoVar = (vyo) ghtVar11.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "ClientInfraClientConfig");
            case 113:
                return vyr.q((omn) this.a.au.io());
            case 114:
                return Optional.of(this.a.cy());
            case 115:
                return new elr(this.a.ay, (byte[]) null, (byte[]) null);
            case 116:
                return new SecureRandom();
            case 117:
                ght ghtVar12 = this.a;
                return new tky((mbc) ghtVar12.l.io(), ghtVar12.aI, ghtVar12.aP, (ajcb) ghtVar12.aQ.io(), (tao) ghtVar12.aq.io(), (tqj) ghtVar12.q.io(), (ScheduledExecutorService) ghtVar12.u.io(), (tfx) ghtVar12.hh.io(), ghtVar12.dE(), ghtVar12.re, ghtVar12.Y(), (hhb) ghtVar12.rg.io(), ghtVar12.rh, Optional.of(aupm.b(ghtVar12.ri)), Optional.empty(), (vxz) ghtVar12.aL.io());
            case 118:
                ght ghtVar13 = this.a;
                return sxh.l((thm) ghtVar13.aD.io(), (Context) ghtVar13.v.io(), ghtVar13.aG, (File) ghtVar13.aH.io(), ghtVar13.aK, (vxz) ghtVar13.aL.io(), aupm.b(ghtVar13.aN));
            case 119:
                ght ghtVar14 = this.a;
                return new thn((tao) ghtVar14.aq.io(), (tqj) ghtVar14.q.io(), (Context) ghtVar14.v.io(), (ExecutorService) ghtVar14.u.io(), (ExecutorService) ghtVar14.aC.io());
            case 120:
                ght ghtVar15 = this.a;
                return sxh.u(ghtVar15.dB(), (Context) ghtVar15.v.io(), (tqj) ghtVar15.q.io(), (ahey) ghtVar15.z.io(), (kjc) ghtVar15.r.io(), ghtVar15.ep(), agev.i(ghtVar15.dG()));
            case 121:
                return taq.D((tqj) this.a.q.io());
            case 122:
                ght ghtVar16 = this.a;
                return sxh.o((tqj) ghtVar16.q.io(), ghtVar16.aE, ghtVar16.aF);
            case 123:
                return new thk((tao) this.a.aq.io(), 0);
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                ght ghtVar17 = this.a;
                zrsVar = new thk((tqj) ghtVar17.q.io(), (tre) ghtVar17.Q.io(), ghtVar17.aE, 1);
                return zrsVar;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                ght ghtVar18 = this.a;
                return pox.t((Context) ghtVar18.v.io(), Optional.empty(), ghtVar18.cq());
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                ght ghtVar19 = this.a;
                zrsVar = new toj((Executor) ghtVar19.u.io(), ghtVar19.aJ, ghtVar19.eR());
                return zrsVar;
            case 127:
                return rsb.g((CronetEngine) this.a.aI.io());
            case SemanticState.Focused /* 128 */:
                ght ghtVar20 = this.a;
                vxu vxuVar2 = (vxu) ghtVar20.at.io();
                vyo vyoVar2 = (vyo) ghtVar20.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "MobileFrameworksClientConfig");
            case 129:
                ght ghtVar21 = this.a;
                return new zww((Executor) ghtVar21.u.io(), (xsc) ghtVar21.aM.io());
            case 130:
                return new xsc(aupt.a);
            case 131:
                return new tkt((String) this.a.aO.io());
            case 132:
                return sxh.j((Context) this.a.v.io());
            case 133:
                ght ghtVar22 = this.a;
                return sxh.k((tao) ghtVar22.aq.io(), (tqj) ghtVar22.q.io());
            case 134:
                ght ghtVar23 = this.a;
                return adib.h((tao) ghtVar23.aq.io(), (tqj) ghtVar23.q.io(), ghtVar23.rd);
            case 135:
                ght ghtVar24 = this.a;
                return new aepo(ghtVar24.rb, ghtVar24.aq, ghtVar24.rc, (mbc) ghtVar24.l.io(), (vxz) ghtVar24.aw.io(), ghtVar24.qw, (tqj) ghtVar24.q.io());
            case 136:
                return zik.cb(this.a.an());
            case 137:
                ght ghtVar25 = this.a;
                ztdVar = new dov(ghtVar25.ay, (tqj) ghtVar25.q.io());
                return ztdVar;
            case 138:
                ght ghtVar26 = this.a;
                ztdVar = new txp((dov) ghtVar26.aR.io(), (tqj) ghtVar26.q.io());
                return ztdVar;
            case 139:
                ght ghtVar27 = this.a;
                return xer.c((Context) ghtVar27.v.io(), (tbt) ghtVar27.I.io(), (vxu) ghtVar27.at.io(), ghtVar27.aV, ghtVar27.bb, ghtVar27.qY, (vyo) ghtVar27.av.io(), ghtVar27.eX, (tqj) ghtVar27.q.io(), ghtVar27.qZ.io(), (vxz) ghtVar27.ra.io());
            case 140:
                ght ghtVar28 = this.a;
                return xer.d((tqj) ghtVar28.q.io(), (xhk) ghtVar28.aT.io(), (xhk) ghtVar28.aU.io());
            case 141:
                return new xhq();
            case 142:
                ght ghtVar29 = this.a;
                return new xht((mbc) ghtVar29.l.io(), (tqj) ghtVar29.q.io(), aupm.b(ghtVar29.aT));
            case 143:
                ght ghtVar30 = this.a;
                zrv zrvVar = (zrv) ghtVar30.aX.io();
                return new xhf(zrvVar, (SharedPreferences) ghtVar30.J.io(), (tpq) ghtVar30.aY.io(), (xeu) ghtVar30.aZ.io(), (vyo) ghtVar30.av.io(), (vxz) ghtVar30.ba.io());
            case 144:
                return ((isi) this.a.aW.io()).b;
            case 145:
                return gzj.aD();
            case 146:
                ght ghtVar31 = this.a;
                return zik.ca((Context) ghtVar31.v.io(), ght.eF(), (ahex) ghtVar31.u.io());
            case 147:
                ght ghtVar32 = this.a;
                vxu vxuVar3 = (vxu) ghtVar32.at.io();
                vyo vyoVar3 = (vyo) ghtVar32.av.io();
                ght.fp();
                return new vxz(vxuVar3, vyoVar3, "ClientInfraClientShared");
            case 148:
                ght ghtVar33 = this.a;
                return new xfn(ghtVar33.g(), (ScheduledExecutorService) ghtVar33.u.io(), (tun) ghtVar33.bc.io(), ghtVar33.hY, ghtVar33.qV, (mbc) ghtVar33.l.io(), (vyo) ghtVar33.av.io(), (tbt) ghtVar33.I.io(), ghtVar33.bO, (zwb) ghtVar33.bd.io(), ghtVar33.aY, (vxz) ghtVar33.ce.io(), (txp) ghtVar33.aS.io(), (ci) ghtVar33.bw.io(), ghtVar33.dO, (tqj) ghtVar33.q.io(), ghtVar33.qW, ghtVar33.aZ, (xfo) ghtVar33.qX.io(), (trf) ghtVar33.M.io(), ghtVar33.ij, ghtVar33.F, (ztn) ghtVar33.ck.io());
            case 149:
                ght ghtVar34 = this.a;
                return new tun((mbc) ghtVar34.l.io(), (tqj) ghtVar34.q.io(), (Executor) ghtVar34.u.io());
            case 150:
                ght ghtVar35 = this.a;
                return ghtVar35.fw().b((Set) ghtVar35.pC.io());
            case 151:
                ght ghtVar36 = this.a;
                return zrp.c((tqj) ghtVar36.q.io(), aupm.b(ghtVar36.be), aupm.b(ghtVar36.bp));
            case 152:
                ght ghtVar37 = this.a;
                return zrp.f((tgm) ghtVar37.bf.io(), (tgl) ghtVar37.bk.io(), (ExecutorService) ghtVar37.u.io(), (awut) ghtVar37.bm.io(), (ExecutorService) ghtVar37.z.io(), (awut) ghtVar37.bo.io(), (Executor) ghtVar37.B.io());
            case 153:
                ght ghtVar38 = this.a;
                mbc mbcVar = (mbc) ghtVar38.l.io();
                tfu tfuVar = tfu.a;
                tfuVar.getClass();
                return gly.h(mbcVar, tfuVar, (zry) ghtVar38.bj.io());
            case 154:
                ght ghtVar39 = this.a;
                return zrp.b(ghtVar39.bi);
            case 155:
                return new zzg();
            case 156:
                ght ghtVar40 = this.a;
                return yno.ae((Context) ghtVar40.v.io(), ghtVar40.bh);
            case 157:
                ght ghtVar41 = this.a;
                return tym.aM((Executor) ghtVar41.u.io(), Optional.of((Executor) ghtVar41.T.io()), Optional.of((tqj) ghtVar41.q.io()), (ayq) ghtVar41.bg.io());
            case 158:
                ght ghtVar42 = this.a;
                return tym.aL((Context) ghtVar42.v.io(), Optional.of((tqj) ghtVar42.q.io()));
            case 159:
                return adib.q((awou) this.a.bl.io());
            case 160:
                ght ghtVar43 = this.a;
                return adib.t(ghtVar43.gz(), (ahey) ghtVar43.t.io());
            case 161:
                return afmb.b((awou) this.a.bn.io());
            case 162:
                ght ghtVar44 = this.a;
                ahud ahudVarGz = ghtVar44.gz();
                ahey aheyVar = (ahey) ghtVar44.z.io();
                aheyVar.getClass();
                awou awouVarW = ahudVarGz.W(aheyVar);
                awouVarW.getClass();
                return awouVarW;
            case 163:
                ght ghtVar45 = this.a;
                return new zxc((tbb) ghtVar45.bt.io(), (Executor) ghtVar45.u.io(), (zrw) ghtVar45.bu.io(), (mbc) ghtVar45.l.io(), (tgg) ghtVar45.bv.io(), (zwb) ghtVar45.bd.io(), (Set) ghtVar45.pC.io(), (vxz) ghtVar45.aw.io(), (vxz) ghtVar45.aL.io(), (vxz) ghtVar45.ba.io());
            case 164:
                return new zrm((taw) this.a.bs.io());
            case 165:
                ght ghtVar46 = this.a;
                return zik.aL((Context) ghtVar46.v.io(), (String) ghtVar46.br.io(), (vxz) ghtVar46.aw.io());
            case 166:
                return "keyValueByteStores";
            case 167:
                return new zsb((tao) this.a.aq.io());
            case 168:
                return agkz.n(this.a.di());
            case 169:
                return new ci(this.a.fO(), (byte[]) null);
            case 170:
                return new wnb((tqj) this.a.q.io());
            case 171:
                ght ghtVar47 = this.a;
                ztdVar = new zxx((Context) ghtVar47.v.io(), (vyt) ghtVar47.bE.io(), 2, (char[]) null);
                return ztdVar;
            case 172:
                ght ghtVar48 = this.a;
                Context context = (Context) ghtVar48.v.io();
                aupr auprVar = ghtVar48.bC;
                aupr auprVar2 = ghtVar48.bi;
                ghtVar48.fi();
                return new vyt(context, auprVar, auprVar2, ghtVar48.A, (mbc) ghtVar48.l.io());
            case 173:
                ght ghtVar49 = this.a;
                zrsVar = new hed((awmd) ghtVar49.by, (awmd) ghtVar49.bB, (tqj) ghtVar49.q.io());
                return zrsVar;
            case 174:
                ght ghtVar50 = this.a;
                Context context2 = (Context) ghtVar50.v.io();
                String str = (String) Optional.empty().orElse("youtube");
                str.getClass();
                return vyr.s(context2, str, (ahex) ghtVar50.u.io(), (rrq) ghtVar50.bh.io());
            case 175:
                ght ghtVar51 = this.a;
                return ((ayq) ghtVar51.bA.io()).Q(ghtVar51.bz);
            case 176:
                ght ghtVar52 = this.a;
                Context context3 = (Context) ghtVar52.v.io();
                String str2 = (String) Optional.empty().orElse("youtube");
                str2.getClass();
                return vyr.r(context3, str2, (ahex) ghtVar52.u.io(), (rrq) ghtVar52.bh.io());
            case 177:
                ght ghtVar53 = this.a;
                Executor executor = (Executor) ghtVar53.u.io();
                dov dovVarAA = dov.aA();
                dovVarAA.getClass();
                zrsVar = new ayq(executor, dovVarAA, ghtVar53.cG());
                return zrsVar;
            case 178:
                return ((isi) this.a.aW.io()).a;
            case 179:
                ght ghtVar54 = this.a;
                return new rju(new rjv((rly) ghtVar54.cm.io(), (aerv) ghtVar54.bN.io(), (tqj) ghtVar54.q.io()), i2);
            case 180:
                rly rlyVar = (rly) this.a.qN.io();
                rlyVar.getClass();
                return rlyVar;
            case 181:
                ght ghtVar55 = this.a;
                return new rma((omj) ghtVar55.bG.io(), (Context) ghtVar55.v.io(), ghtVar55.gD(), (rre) ghtVar55.bL.io(), (tqj) ghtVar55.q.io(), (aerv) ghtVar55.bN.io(), (mbc) ghtVar55.l.io(), (hxh) ghtVar55.qM.io());
            case 182:
                return new omj((tbt) this.a.I.io());
            case 183:
                ght ghtVar56 = this.a;
                return new rre(ghtVar56.f(), (omj) ghtVar56.bI.io(), (Set) ghtVar56.bK.io(), (Context) ghtVar56.v.io(), (tqj) ghtVar56.q.io());
            case 184:
                omj omjVar = (omj) this.a.bH.io();
                omjVar.getClass();
                return omjVar;
            case 185:
                return new omj(this.a.gD());
            case 186:
                Set setA = ((rjt) this.a.bJ.io()).a();
                setA.getClass();
                return setA;
            case 187:
                return new gdv();
            case 188:
                ght ghtVar57 = this.a;
                return adib.j(ghtVar57.ba(), ghtVar57.u);
            case 189:
                ght ghtVar58 = this.a;
                vxu vxuVar4 = (vxu) ghtVar58.at.io();
                vyo vyoVar4 = (vyo) ghtVar58.av.io();
                ght.fp();
                return new vxz(vxuVar4, vyoVar4, "AccountClient");
            case 190:
                return new hxh(this);
            case 191:
                ght ghtVar59 = this.a;
                return vyr.o(ghtVar59.qK, ghtVar59.qL, (tqj) ghtVar59.q.io());
            case 192:
                ght ghtVar60 = this.a;
                return new xef(ghtVar60.eX, (vyo) ghtVar60.av.io(), (Context) ghtVar60.v.io(), (Executor) ghtVar60.bP.io(), ghtVar60.eW, (vxz) ghtVar60.dS.io());
            case 193:
                ght ghtVar61 = this.a;
                ztdVar = new wjr(ghtVar61.bQ, ghtVar61.qJ);
                return ztdVar;
            case 194:
                ght ghtVar62 = this.a;
                zrsVar = new xic((vyo) ghtVar62.av.io(), (mbc) ghtVar62.l.io(), (Executor) ghtVar62.bP.io());
                return zrsVar;
            case 195:
                return new xig((tag) this.a.bO.io());
            case 196:
                ght ghtVar63 = this.a;
                return new aebc(ghtVar63.cl, (xet) ghtVar63.qH.io(), ghtVar63.bQ, ghtVar63.gV(), (tqj) ghtVar63.q.io(), ghtVar63.qI);
            case 197:
                ght ghtVar64 = this.a;
                return xer.p(ghtVar64.cf, ghtVar64.cg, (ztn) ghtVar64.ck.io());
            case 198:
                ght ghtVar65 = this.a;
                zrs zrsVar2 = (zrs) ghtVar65.ar.io();
                ztk ztkVar = (ztk) ghtVar65.bT.io();
                abwk abwkVar = (abwk) ghtVar65.bV.io();
                zwb zwbVar = (zwb) ghtVar65.bd.io();
                tbt tbtVar = (tbt) ghtVar65.I.io();
                ci ciVar = (ci) ghtVar65.bw.io();
                Executor executor2 = (Executor) ghtVar65.u.io();
                mbc mbcVar2 = (mbc) ghtVar65.l.io();
                tfq tfqVar = (tfq) ghtVar65.cd.io();
                aupr auprVar3 = ghtVar65.ba;
                return new zst(zrsVar2, ztkVar, abwkVar, zwbVar, tbtVar, ciVar, executor2, ghtVar65.cc, mbcVar2, tfqVar, auprVar3, ghtVar65.aw, ghtVar65.ce);
            case 199:
                ght ghtVar66 = this.a;
                return new ztk(ghtVar66.ar, (mbc) ghtVar66.l.io(), ghtVar66.aB(), (tag) ghtVar66.bO.io(), (vxz) ghtVar66.ba.io(), (vxz) ghtVar66.aw.io(), (tqj) ghtVar66.q.io());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object d() {
        Object aazoVar;
        Object aakoVar;
        Object aazoVar2;
        Object aatmVar;
        int i = this.b;
        switch (i) {
            case 1000:
                ght ghtVar = this.a;
                return zik.bb((Executor) ghtVar.u.io(), (Executor) ghtVar.T.io(), (aauk) ghtVar.iL.io());
            case 1001:
                ght ghtVar2 = this.a;
                mbc mbcVar = (mbc) ghtVar2.l.io();
                txp txpVar = (txp) ghtVar2.aS.io();
                wjb wjbVar = (wjb) ghtVar2.gQ.io();
                aatr aatrVar = (aatr) ghtVar2.sk.io();
                dov dovVar = (dov) ghtVar2.gY.io();
                SharedPreferences sharedPreferences = (SharedPreferences) ghtVar2.J.io();
                zgy zgyVar = (zgy) ghtVar2.hQ.io();
                zgy zgyVar2 = (zgy) ghtVar2.it.io();
                abxv abxvVar = (abxv) ghtVar2.iK.io();
                aatmVar = new aatm(mbcVar, txpVar, wjbVar, aatrVar, dovVar, sharedPreferences, zgyVar, zgyVar2, abxvVar, (zgm) ghtVar2.il.io(), (aauk) ghtVar2.iL.io(), ghtVar2.au(), (aazo) ghtVar2.sl.io(), (zjr) ghtVar2.gI.io(), ghtVar2.hO);
                return aatmVar;
            case 1002:
                ght ghtVar3 = this.a;
                Context context = (Context) ghtVar3.v.io();
                mbc mbcVar2 = (mbc) ghtVar3.l.io();
                abqq abqqVar = (abqq) ghtVar3.sg.io();
                vxu vxuVar = (vxu) ghtVar3.at.io();
                aatmVar = new aatr(context, mbcVar2, abqqVar, vxuVar, (wuo) ghtVar3.lG.io(), (wup) ghtVar3.ls.io(), (aaek) ghtVar3.iE.io(), (aazo) ghtVar3.sc.io(), ghtVar3.sf, (wco) ghtVar3.jy.io(), ghtVar3.sh, (vxz) ghtVar3.cN.io());
                return aatmVar;
            case 1003:
                ght ghtVar4 = this.a;
                mbc mbcVar3 = (mbc) ghtVar4.l.io();
                zwb zwbVar = (zwb) ghtVar4.bd.io();
                aupr auprVar = ghtVar4.ke;
                aupr auprVar2 = ghtVar4.gN;
                aupr auprVar3 = ghtVar4.kf;
                abpt abptVarAM = ghtVar4.aM();
                abrf abrfVar = (abrf) ghtVar4.sa.io();
                aupr auprVar4 = ghtVar4.sc;
                aupr auprVar5 = ghtVar4.se;
                aupr auprVar6 = ghtVar4.sf;
                aatmVar = new abqq(mbcVar3, zwbVar, auprVar, auprVar2, auprVar3, abptVarAM, abrfVar, auprVar4, auprVar5, auprVar6);
                return aatmVar;
            case 1004:
                ght ghtVar5 = this.a;
                abio abioVar = new abio((abmt) ghtVar5.cT.io(), aupm.b(ghtVar5.hO));
                ghtVar5.eB(abioVar);
                aazoVar2 = abioVar;
                return aazoVar2;
            case 1005:
                ght ghtVar6 = this.a;
                aazo aazoVar3 = (aazo) ghtVar6.sb.io();
                aazoVar3.getClass();
                return aazoVar3;
            case 1006:
                ght ghtVar7 = this.a;
                aazoVar = new aazo(ghtVar7.ia, (vxz) ghtVar7.cN.io());
                return aazoVar;
            case 1007:
                ght ghtVar8 = this.a;
                mbc mbcVar4 = (mbc) ghtVar8.l.io();
                return zyk.b((tft) ghtVar8.sd.io(), (Executor) ghtVar8.u.io(), mbcVar4, ghtVar8.W());
            case 1008:
                return ((ayq) this.a.dc.io()).N(sxh.f());
            case 1009:
                ght ghtVar9 = this.a;
                return ghtVar9.fY().e((aaqc) ghtVar9.iA.io());
            case 1010:
                ght ghtVar10 = this.a;
                aatmVar = new aehs((mbc) ghtVar10.l.io(), (aauk) ghtVar10.iL.io(), ghtVar10.ir, (wco) ghtVar10.jy.io(), ghtVar10.iG, (zwb) ghtVar10.bd.io(), ghtVar10.gQ, (aaul) ghtVar10.si.io(), (tqj) ghtVar10.q.io());
                return aatmVar;
            case 1011:
                aatmVar = new aaul((mbc) this.a.l.io());
                return aatmVar;
            case 1012:
                ght ghtVar11 = this.a;
                aazoVar2 = new aazo((wjb) ghtVar11.gQ.io(), (wjr) ghtVar11.jC.io(), null);
                return aazoVar2;
            case 1013:
                aatmVar = new aatk((aatr) this.a.sk.io());
                return aatmVar;
            case 1014:
                return new rnj((char[]) null, (byte[]) null);
            case 1015:
                ght ghtVar12 = this.a;
                hfn hfnVarFI = ghtVar12.fI();
                tbt tbtVar = (tbt) ghtVar12.I.io();
                return new hwz(hfnVarFI, (Object) tbtVar);
            case 1016:
                ght ghtVar13 = this.a;
                Context context2 = (Context) ghtVar13.v.io();
                mbc mbcVar5 = (mbc) ghtVar13.l.io();
                hnq hnqVar = (hnq) ghtVar13.ct.io();
                hlp hlpVar = (hlp) ghtVar13.iR.io();
                SharedPreferences sharedPreferences2 = (SharedPreferences) ghtVar13.J.io();
                twf twfVar = (twf) ghtVar13.hZ.io();
                tfq tfqVar = (tfq) ghtVar13.cd.io();
                jkg jkgVar = (jkg) ghtVar13.st.io();
                aatmVar = new hsn(context2, mbcVar5, hnqVar, hlpVar, sharedPreferences2, twfVar, tfqVar, jkgVar, (hfn) ghtVar13.su.io(), (abxv) ghtVar13.iK.io(), (hlz) ghtVar13.lS.io(), (hpb) ghtVar13.mC.io(), (hpk) ghtVar13.nr.io(), (huh) ghtVar13.sw.io(), (huf) ghtVar13.sx.io(), (aany) ghtVar13.sh.io(), (aacm) ghtVar13.sz.io(), aupm.b(ghtVar13.kB), (xow) ghtVar13.sA.io(), (hpy) ghtVar13.md.io(), (zwb) ghtVar13.bd.io(), (syn) ghtVar13.cs.io(), (hsz) ghtVar13.sy.io(), (Executor) ghtVar13.z.io());
                return aatmVar;
            case 1017:
                aatmVar = new jkg(this.a.g());
                return aatmVar;
            case 1018:
                return new hfn((byte[]) null);
            case 1019:
                ght ghtVar14 = this.a;
                aany aanyVar = (aany) ghtVar14.sh.io();
                aazoVar2 = new huh(aanyVar, (Integer) ghtVar14.sv.io(), (vxz) ghtVar14.cN.io());
                return aazoVar2;
            case 1020:
                return 24;
            case 1021:
                ght ghtVar15 = this.a;
                aatmVar = new hob((mbc) ghtVar15.l.io(), (syn) ghtVar15.cc.io(), (aaqg) ghtVar15.iR.io(), (zwb) ghtVar15.bd.io(), ghtVar15.fH(), (hsz) ghtVar15.sy.io(), (vxz) ghtVar15.cu.io(), (vxz) ghtVar15.et.io(), (avmb) ghtVar15.dE.io());
                return aatmVar;
            case 1022:
                ght ghtVar16 = this.a;
                aatmVar = new hsz((Context) ghtVar16.v.io(), (Executor) ghtVar16.z.io(), (zwb) ghtVar16.bd.io(), (syn) ghtVar16.cs.io(), (mbc) ghtVar16.l.io());
                return aatmVar;
            case 1023:
                ght ghtVar17 = this.a;
                aatmVar = new xow((wlp) ghtVar17.kE.io(), (abxv) ghtVar17.gK.io(), (zwb) ghtVar17.bd.io(), ghtVar17.mq, ghtVar17.mr, (vxz) ghtVar17.aw.io(), (tqj) ghtVar17.q.io());
                return aatmVar;
            case SemanticState.ReadOnly /* 1024 */:
                ght ghtVar18 = this.a;
                aatmVar = new hsd((ikg) ghtVar18.sD.io(), (hsq) ghtVar18.sE.io(), (hsr) ghtVar18.sF.io(), (hsu) ghtVar18.sG.io(), (tbt) ghtVar18.I.io(), (huy) ghtVar18.sI.io(), (aari) ghtVar18.sK.io(), (huz) ghtVar18.sL.io(), (Integer) ghtVar18.sv.io(), (hpy) ghtVar18.md.io(), (wbz) ghtVar18.es.io(), ghtVar18.fH(), (Executor) ghtVar18.z.io(), (Executor) ghtVar18.u.io(), (hpb) ghtVar18.mC.io(), (ahbw) ghtVar18.cx.io(), (syn) ghtVar18.cs.io(), (Context) ghtVar18.v.io(), (vxz) ghtVar18.et.io(), (avmb) ghtVar18.dE.io());
                return aatmVar;
            case 1025:
                ght ghtVar19 = this.a;
                aazoVar = new ikg((awmd) ghtVar19.iG, (awmd) ghtVar19.iR, (awmd) ghtVar19.rq, (awmd) ghtVar19.rr, aupm.b(ghtVar19.md), (jnm) ghtVar19.lQ.io(), ghtVar19.fI(), (hlz) ghtVar19.lS.io(), (Executor) ghtVar19.z.io(), (Executor) ghtVar19.u.io(), (tbt) ghtVar19.I.io(), (Integer) 28, (vxz) ghtVar19.et.io(), (ahbw) ghtVar19.cx.io());
                return aazoVar;
            case 1026:
                ght ghtVar20 = this.a;
                Context context3 = (Context) ghtVar20.v.io();
                ikg ikgVar = (ikg) ghtVar20.sD.io();
                abfv abfvVar = (abfv) ghtVar20.iD.io();
                mbc mbcVar6 = (mbc) ghtVar20.l.io();
                Executor executor = (Executor) ghtVar20.u.io();
                aatmVar = new hsq(context3, ikgVar, abfvVar, mbcVar6, executor, (aaqg) ghtVar20.iR.io(), (tbt) ghtVar20.I.io(), (vxz) ghtVar20.et.io());
                return aatmVar;
            case 1027:
                aatmVar = new hsr((ikg) this.a.sD.io());
                return aatmVar;
            case 1028:
                ght ghtVar21 = this.a;
                aazoVar = new hsu((ikg) ghtVar21.sD.io(), (vxz) ghtVar21.et.io());
                return aazoVar;
            case 1029:
                ght ghtVar22 = this.a;
                aatmVar = new huy((abfv) ghtVar22.rq.io(), (abxv) ghtVar22.iK.io(), (twf) ghtVar22.hZ.io(), (hpy) ghtVar22.md.io(), (hpb) ghtVar22.mC.io(), (Executor) ghtVar22.z.io());
                return aatmVar;
            case 1030:
                ght ghtVar23 = this.a;
                return zrp.m((aaek) ghtVar23.iE.io(), (syn) ghtVar23.cc.io(), (aaqg) ghtVar23.iR.io(), (aauk) ghtVar23.iL.io(), aupm.b(ghtVar23.sJ));
            case 1031:
                ght ghtVar24 = this.a;
                aazoVar = new aacz((syn) ghtVar24.cc.io(), (aaqg) ghtVar24.iR.io());
                return aazoVar;
            case 1032:
                ght ghtVar25 = this.a;
                jkg jkgVar2 = (jkg) ghtVar25.st.io();
                twf twfVar2 = (twf) ghtVar25.hZ.io();
                aatmVar = new huz(jkgVar2, twfVar2, (abxv) ghtVar25.iK.io(), (abvk) ghtVar25.kB.io(), (tfq) ghtVar25.cd.io(), (aaqg) ghtVar25.iR.io(), (hnq) ghtVar25.ct.io(), (aanb) ghtVar25.iG.io(), (abfv) ghtVar25.iP.io());
                return aatmVar;
            case 1033:
                ght ghtVar26 = this.a;
                aatmVar = new aakm((aake) ghtVar26.sT.io(), (aakw) ghtVar26.sV.io(), (wco) ghtVar26.jy.io(), (aanb) ghtVar26.iG.io(), (vxz) ghtVar26.cN.io());
                return aatmVar;
            case 1034:
                ght ghtVar27 = this.a;
                aatmVar = new aake(ghtVar27.sg, ghtVar27.gQ, ghtVar27.iG, ghtVar27.sN, (mbc) ghtVar27.l.io(), (tbt) ghtVar27.I.io(), (wco) ghtVar27.jy.io(), (aauk) ghtVar27.iL.io());
                return aatmVar;
            case 1035:
                ght ghtVar28 = this.a;
                aatmVar = new aapo(ghtVar28.sS);
                return aatmVar;
            case 1036:
                ght ghtVar29 = this.a;
                aatmVar = new aapp((aaps) ghtVar29.sO.io(), (aapz) ghtVar29.sP.io(), (mbc) ghtVar29.l.io(), (SharedPreferences) ghtVar29.J.io(), (vyo) ghtVar29.av.io(), (aaei) ghtVar29.sR.io(), (tbt) ghtVar29.I.io(), (vxz) ghtVar29.cN.io());
                return aatmVar;
            case 1037:
                ght ghtVar30 = this.a;
                aatmVar = new aaco(ghtVar30.iG, (ScheduledExecutorService) ghtVar30.u.io(), ghtVar30.sN, (syn) ghtVar30.cc.io(), (aaqg) ghtVar30.iR.io(), (tbt) ghtVar30.I.io(), (aany) ghtVar30.sh.io(), agev.i(28), (mbc) ghtVar30.l.io(), (aauk) ghtVar30.iL.io(), (vxz) ghtVar30.cN.io());
                return aatmVar;
            case 1038:
                ght ghtVar31 = this.a;
                aatmVar = new aapz((Context) ghtVar31.v.io(), (wlp) ghtVar31.kE.io(), (abxv) ghtVar31.gK.io(), (zwb) ghtVar31.bd.io(), ghtVar31.mq, ghtVar31.mr, (vxz) ghtVar31.aw.io(), (tqj) ghtVar31.q.io());
                return aatmVar;
            case 1039:
                aatmVar = new aaeh((tws) this.a.sQ.io());
                return aatmVar;
            case 1040:
                aatmVar = new tws((Context) this.a.v.io());
                return aatmVar;
            case 1041:
                ght ghtVar32 = this.a;
                aatmVar = new aapq((aaps) ghtVar32.sO.io(), (aapz) ghtVar32.sP.io(), (mbc) ghtVar32.l.io(), (SharedPreferences) ghtVar32.J.io(), (vyo) ghtVar32.av.io(), (aaei) ghtVar32.sR.io(), (tbt) ghtVar32.I.io(), (vxz) ghtVar32.cN.io());
                return aatmVar;
            case 1042:
                ght ghtVar33 = this.a;
                aatmVar = new aakw((aanb) ghtVar33.iG.io(), (ScheduledExecutorService) ghtVar33.u.io(), (wco) ghtVar33.jy.io(), ghtVar33.sU, ghtVar33.kf, ghtVar33.sa, (vxz) ghtVar33.cN.io());
                return aatmVar;
            case 1043:
                ght ghtVar34 = this.a;
                aatmVar = new aaqf((wlp) ghtVar34.kE.io(), (abxv) ghtVar34.gK.io(), (zwb) ghtVar34.bd.io(), ghtVar34.mq, ghtVar34.mr, (vxz) ghtVar34.aw.io(), (tqj) ghtVar34.q.io());
                return aatmVar;
            case 1044:
                ght ghtVar35 = this.a;
                aakoVar = new aako((aakg) ghtVar35.sX.io(), (aakz) ghtVar35.ta.io(), (aanb) ghtVar35.iG.io(), (wco) ghtVar35.jy.io());
                return aakoVar;
            case 1045:
                ght ghtVar36 = this.a;
                aatmVar = new aakg((aaqg) ghtVar36.iR.io(), (aanb) ghtVar36.iG.io(), (abxu) ghtVar36.dG.io(), (tbt) ghtVar36.I.io(), (aart) ghtVar36.rG.io(), (ci) ghtVar36.rv.io(), (vxz) ghtVar36.cN.io(), (aauk) ghtVar36.iL.io());
                return aatmVar;
            case 1046:
                ght ghtVar37 = this.a;
                wco wcoVar = (wco) ghtVar37.jy.io();
                Object objCE = ghtVar37.cE();
                txp txpVar2 = (txp) ghtVar37.aS.io();
                aupr auprVar7 = ghtVar37.iT;
                ci ciVar = (ci) ghtVar37.rv.io();
                abxu abxuVar = (abxu) ghtVar37.dG.io();
                aatmVar = new aakz(wcoVar, (abxv) objCE, txpVar2, auprVar7, ciVar, abxuVar, (aauk) ghtVar37.iL.io());
                return aatmVar;
            case 1047:
                ght ghtVar38 = this.a;
                aakr aakrVar = new aakr((wco) ghtVar38.jy.io(), (zwb) ghtVar38.bd.io(), (Executor) ghtVar38.u.io(), (aanb) ghtVar38.iG.io(), (tbt) ghtVar38.I.io());
                aakrVar.a();
                aatmVar = aakrVar;
                return aatmVar;
            case 1048:
                ght ghtVar39 = this.a;
                aala aalaVar = new aala((wco) ghtVar39.jy.io(), (zwb) ghtVar39.bd.io(), (Executor) ghtVar39.u.io(), (tbt) ghtVar39.I.io(), (ci) ghtVar39.rv.io());
                aalaVar.a();
                aatmVar = aalaVar;
                return aatmVar;
            case 1049:
                ght ghtVar40 = this.a;
                aatmVar = new aakh((aanb) ghtVar40.iG.io(), (ahex) ghtVar40.u.io(), (ScheduledExecutorService) ghtVar40.u.io(), (tbt) ghtVar40.I.io(), (aauk) ghtVar40.iL.io());
                return aatmVar;
            case 1050:
                ght ghtVar41 = this.a;
                aupr auprVar8 = ghtVar41.iG;
                wco wcoVar2 = (wco) ghtVar41.jy.io();
                aakoVar = new aakk(auprVar8, wcoVar2, (Executor) ghtVar41.u.io(), (abfv) ghtVar41.tg.io());
                return aakoVar;
            case 1051:
                ght ghtVar42 = this.a;
                aakl aaklVar = new aakl(ghtVar42.iG, (wco) ghtVar42.jy.io(), (zwb) ghtVar42.bd.io(), (tbt) ghtVar42.I.io(), (Executor) ghtVar42.u.io(), (aakq) ghtVar42.te.io(), (aauk) ghtVar42.iL.io());
                aaklVar.a();
                aatmVar = aaklVar;
                return aatmVar;
            case 1052:
                ght ghtVar43 = this.a;
                aakq aakqVar = new aakq((wco) ghtVar43.jy.io(), (zwb) ghtVar43.bd.io(), (tbt) ghtVar43.I.io(), (Executor) ghtVar43.u.io(), (abxv) ghtVar43.jn.io(), (rrh) ghtVar43.gh.io(), ghtVar43.en(), ghtVar43.eo(), (aifk) ghtVar43.td.io());
                aakqVar.d();
                aatmVar = aakqVar;
                return aatmVar;
            case 1053:
                return new aifk();
            case 1054:
                ght ghtVar44 = this.a;
                aazoVar2 = new abfv((adhv) ghtVar44.rB.io(), (ScheduledExecutorService) ghtVar44.u.io(), (byte[]) null);
                return aazoVar2;
            case 1055:
                ght ghtVar45 = this.a;
                aatmVar = new aaog((abxu) ghtVar45.dG.io(), ghtVar45.by(), (aany) ghtVar45.sh.io(), (aanw) ghtVar45.ti.io(), ghtVar45.dO, (mbc) ghtVar45.l.io(), (aauk) ghtVar45.iL.io());
                return aatmVar;
            case 1056:
                ght ghtVar46 = this.a;
                aatmVar = new aann(ghtVar46.jy, ghtVar46.jo, (mbc) ghtVar46.l.io(), ghtVar46.sh, (syn) ghtVar46.cc.io(), (zwb) ghtVar46.bd.io(), (ExecutorService) ghtVar46.u.io(), (tbt) ghtVar46.I.io(), ghtVar46.iO, (dov) ghtVar46.aR.io(), (aauk) ghtVar46.iL.io());
                return aatmVar;
            case 1057:
                return ((aatc) this.a.sp.io()).d();
            case 1058:
                ght ghtVar47 = this.a;
                aatmVar = new afip(ghtVar47.cd, ghtVar47.iS, ghtVar47.ti, ghtVar47.jy, ghtVar47.tm, ghtVar47.dO, ghtVar47.iT, ghtVar47.iL, (byte[]) null, (byte[]) null);
                return aatmVar;
            case 1059:
                aatmVar = new ahfg((Executor) this.a.T.io());
                return aatmVar;
            case 1060:
                return gly.k();
            case 1061:
                return gly.j();
            case 1062:
                ght ghtVar48 = this.a;
                aazoVar2 = new hfp((hpy) ghtVar48.md.io(), (wco) ghtVar48.jy.io(), (Executor) ghtVar48.u.io());
                return aazoVar2;
            case 1063:
                ght ghtVar49 = this.a;
                aakoVar = new abzq((zwb) ghtVar49.bd.io(), ghtVar49.nP, ghtVar49.tv, (vxu) ghtVar49.at.io());
                return aakoVar;
            case 1064:
                ght ghtVar50 = this.a;
                aatmVar = new abzo(ghtVar50.hY, ghtVar50.u, ghtVar50.v, ghtVar50.nR, ghtVar50.bd, ghtVar50.bw, ghtVar50.cd, ghtVar50.cl, ghtVar50.at, ghtVar50.tt, ghtVar50.tu);
                return aatmVar;
            case 1065:
                ght ghtVar51 = this.a;
                aakoVar = new acqf((Context) ghtVar51.v.io(), (zwb) ghtVar51.bd.io(), (syn) ghtVar51.cs.io(), (Executor) ghtVar51.u.io());
                return aakoVar;
            case 1066:
                return ((qcb) this.a.tB.io()).E();
            case 1067:
                aatmVar = new qcb(this);
                return aatmVar;
            case 1068:
                ght ghtVar52 = this.a;
                aatmVar = new axfd((afgj) ghtVar52.tE.io(), (abhh) ghtVar52.am.io(), (afid) ghtVar52.tF.io(), (ahex) ghtVar52.z.io(), (Executor) ghtVar52.B.io());
                return aatmVar;
            case 1069:
                ght ghtVar53 = this.a;
                aazoVar2 = new afgj((affw) ghtVar53.cf(), agev.i(ghtVar53.tD), (ahey) ghtVar53.A.io());
                return aazoVar2;
            case 1070:
                return pox.o(this.a.R());
            case 1071:
                ght ghtVar54 = this.a;
                aazoVar2 = new rmc((Context) ghtVar54.v.io(), (Executor) ghtVar54.u.io(), ghtVar54.ft);
                return aazoVar2;
            case 1072:
                ght ghtVar55 = this.a;
                return ghtVar55.fZ().l(ght.ew(), (ayq) ghtVar55.Y.io());
            case 1073:
                ght ghtVar56 = this.a;
                return agkz.q(ghtVar56.bd(), ghtVar56.be());
            case 1074:
                ght ghtVar57 = this.a;
                return adib.p((Context) ghtVar57.v.io(), ghtVar57.i());
            case 1075:
                return new auor();
            case 1076:
                aatmVar = new afri((Context) this.a.v.io(), 1);
                return aatmVar;
            case 1077:
                ght ghtVar58 = this.a;
                aazoVar = new afri((Context) ghtVar58.v.io(), ghtVar58.k(), 0);
                return aazoVar;
            case 1078:
                ght ghtVar59 = this.a;
                aazoVar2 = new afri((Context) ghtVar59.v.io(), ghtVar59.k(), 2, null);
                return aazoVar2;
            case 1079:
                return agkz.n(ght.eE());
            case 1080:
                ght ghtVar60 = this.a;
                return new ahub((byte[]) null, (char[]) null);
            case 1081:
                aatmVar = new aciz((Context) this.a.v.io());
                return aatmVar;
            case 1082:
                ght ghtVar61 = this.a;
                aatmVar = new ahrn((Context) ghtVar61.v.io(), (aflp) ghtVar61.tY.io(), agkj.j(afsi.class, "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker"), (Executor) ghtVar61.z.io(), agev.i(agkj.i()), ghtVar61.gK());
                return aatmVar;
            case 1083:
                ght ghtVar62 = this.a;
                agev.i((aflg) ghtVar62.tV.io());
                return adib.m(ghtVar62.tX);
            case 1084:
                return taq.M((Context) this.a.v.io());
            case 1085:
                ght ghtVar63 = this.a;
                egp egpVar = (egp) ghtVar63.tW.io();
                return new aflo(egpVar);
            case 1086:
                ght ghtVar64 = this.a;
                return aguu.aA((Context) ghtVar64.v.io());
            case 1087:
                aatmVar = new aflq((dzt) this.a.bW.io());
                return aatmVar;
            case 1088:
                return agkz.n(ght.eD());
            case 1089:
                ght ghtVar65 = this.a;
                return new aext((byte[]) null);
            case 1090:
                return new SecureRandom();
            case 1091:
                return this.a.bC();
            case 1092:
                ght ghtVar66 = this.a;
                return agkz.q(ghtVar66.bc(), ghtVar66.bg());
            case 1093:
                ght ghtVar67 = this.a;
                aazoVar2 = new abhh((abhh) ghtVar67.am.io(), (afid) ghtVar67.tF.io(), (byte[]) null);
                return aazoVar2;
            case 1094:
                ght ghtVar68 = this.a;
                aazoVar2 = new aepy((tqj) ghtVar68.q.io(), ghtVar68.uj, (vxz) ghtVar68.ca.io());
                return aazoVar2;
            case 1095:
                return new ahud((byte[]) null, (char[]) null);
            case 1096:
                ght ghtVar69 = this.a;
                aazoVar2 = new aepx(ghtVar69.uj, (vxz) ghtVar69.ca.io(), (zvl) ghtVar69.dO.io());
                return aazoVar2;
            case 1097:
                ght ghtVar70 = this.a;
                vxu vxuVar2 = (vxu) ghtVar70.at.io();
                vyo vyoVar = (vyo) ghtVar70.av.io();
                ght.fp();
                aatmVar = new vxz(vxuVar2, vyoVar, "PostsCreatorClient");
                return aatmVar;
            case 1098:
                return new adul();
            case 1099:
                return new ahnz();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0467  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final Object e() {
        Object mcsVar;
        Object qchVar;
        ahey aheyVarB;
        Object kjcVar;
        int iA;
        Object qepVar;
        int i = this.b;
        int i2 = 3;
        int i3 = 2;
        boolean z = false;
        boolean zK = true;
        char c = 1;
        char c2 = 1;
        switch (i) {
            case 1100:
                mcsVar = new mcs(taq.I((tqj) this.a.q.io()));
                return mcsVar;
            case 1101:
                ght ghtVar = this.a;
                mcsVar = new aetb((tao) ghtVar.aq.io());
                return mcsVar;
            case 1102:
                ght ghtVar2 = this.a;
                mcsVar = new aerk((tqj) ghtVar2.q.io(), ghtVar2.aZ, ghtVar2.up, ghtVar2.uy, (Context) ghtVar2.v.io(), (aess) ghtVar2.E.io());
                return mcsVar;
            case 1103:
                mcsVar = new aeta((tqj) this.a.q.io());
                return mcsVar;
            case 1104:
                ght ghtVar3 = this.a;
                Context context = (Context) ghtVar3.v.io();
                agev agevVar = (agev) ghtVar3.uC.io();
                String str = (String) ghtVar3.uE.io();
                aupr auprVar = ghtVar3.uF;
                xsc xscVarHg = ghtVar3.hg();
                agdf agdfVar = agdf.a;
                mcsVar = new qfi(context, agevVar, str, auprVar, xscVarHg, agdfVar, agdfVar, agdfVar);
                return mcsVar;
            case 1105:
                return agdf.a;
            case 1106:
                return ((aero) this.a.uD.io()).b;
            case 1107:
                Context context2 = (Context) this.a.v.io();
                PackageManager packageManager = context2.getPackageManager();
                String packageName = context2.getPackageName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    mcsVar = new aero(packageInfo.versionName, packageInfo.versionCode);
                    return mcsVar;
                } catch (PackageManager.NameNotFoundException e) {
                    ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/metrics/core/PrimesCoreMetricDaggerModule", "provideVersionNameAndCode", '\\', "PrimesCoreMetricDaggerModule.java")).w("Failed to get PackageInfo for: %s", packageName);
                    return new aero((String) null, 0);
                }
            case 1108:
                return Boolean.valueOf(auxo.a.io().f((Context) this.a.v.io()));
            case 1109:
                return Boolean.valueOf(auxr.a.io().c((Context) this.a.v.io()));
            case 1110:
                return Boolean.valueOf(auxr.a.io().b((Context) this.a.v.io()));
            case 1111:
                return Boolean.valueOf(auxr.a.io().d((Context) this.a.v.io()));
            case 1112:
                return new qcs();
            case 1113:
                ght ghtVar4 = this.a;
                mcsVar = new rrq(ghtVar4.v, ghtVar4.uT, ghtVar4.uY, ghtVar4.uZ, ghtVar4.va, ghtVar4.vb);
                return mcsVar;
            case 1114:
                ght ghtVar5 = this.a;
                Executor executor = ((qcr) ghtVar5.uL.io()).d ? (Executor) ghtVar5.uS.io() : (Executor) ghtVar5.uM.io();
                executor.getClass();
                return executor;
            case 1115:
                ght ghtVar6 = this.a;
                qchVar = new qch((ahey) ghtVar6.uM.io(), (kjc) ghtVar6.uQ.io(), ghtVar6.uR);
                return qchVar;
            case 1116:
                qcr qcrVar = (qcr) this.a.uL.io();
                ahey aheyVar = qcrVar.a;
                if (aheyVar == null) {
                    int i4 = qcrVar.c;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i4, new qcp(qcrVar.b), new qco());
                    scheduledThreadPoolExecutor.setMaximumPoolSize(i4);
                    aheyVarB = MoreExecutors.b(scheduledThreadPoolExecutor);
                } else {
                    aheyVarB = aheyVar;
                }
                aheyVarB.getClass();
                return aheyVarB;
            case 1117:
                return (qcr) new agfa(this.a.P()).e(qcr.a().e());
            case 1118:
                ght ghtVar7 = this.a;
                ahey aheyVar2 = (ahey) ghtVar7.t.io();
                tqj tqjVar = (tqj) ghtVar7.q.io();
                int i5 = tqr.a;
                return szv.l(aheyVar2, tqjVar.k(1073815429));
            case 1119:
                ght ghtVar8 = this.a;
                kjcVar = new kjc((Context) ghtVar8.v.io(), (qeg) ghtVar8.uP.io());
                return kjcVar;
            case 1120:
                mcsVar = new qeg((qef) this.a.uO.io());
                return mcsVar;
            case 1121:
                mcsVar = new qef((qfe) this.a.uN.io());
                return mcsVar;
            case 1122:
                mcsVar = new qfe((Context) this.a.v.io());
                return mcsVar;
            case 1123:
                mcsVar = new agfa(Boolean.valueOf(this.a.ee()));
                return mcsVar;
            case 1124:
                ght ghtVar9 = this.a;
                Random random = (Random) ghtVar9.uV.io();
                qiv qivVar = (qiv) ghtVar9.uW.io();
                ahbw ahbwVar = (ahbw) ghtVar9.uX.io();
                random.getClass();
                qchVar = new qjk(random, qivVar, ahbwVar);
                return qchVar;
            case 1125:
                mcsVar = new Random(((mbc) this.a.uU.io()).b());
                return mcsVar;
            case 1126:
                mbc mbcVar = (mbc) this.a.l.io();
                mbcVar.getClass();
                return (mbc) new agfa(mbcVar).e(new tyq(1));
            case 1127:
                Random random2 = (Random) this.a.uV.io();
                random2.getClass();
                mcsVar = new qiv(random2);
                return mcsVar;
            case 1128:
                final mbc mbcVar2 = (mbc) this.a.uU.io();
                mcsVar = new ahbw() { // from class: qix
                    @Override // defpackage.ahbw
                    public final Instant a() {
                        return Instant.ofEpochMilli(mbcVar2.b());
                    }
                };
                return mcsVar;
            case 1129:
                return Boolean.TRUE;
            case 1130:
                ght ghtVar10 = this.a;
                kjcVar = new ahek((mbc) ghtVar10.uU.io(), (agev) ((aupo) ghtVar10.va).b);
                return kjcVar;
            case 1131:
                return new gfy(6).io();
            case 1132:
                mcsVar = new tld((kjc) this.a.uQ.io());
                return mcsVar;
            case 1133:
                Looper looper = (Looper) this.a.fN.io();
                looper.getClass();
                mcsVar = new Handler((Looper) new agfa(looper).a);
                return mcsVar;
            case 1134:
                return new nrd();
            case 1135:
                return new ahno();
            case 1136:
                return this.a.bB();
            case 1137:
                tqj tqjVar2 = (tqj) this.a.q.io();
                vzq vzqVarD = qis.d();
                int i6 = tqr.a;
                if (!tqjVar2.k(1073815129) || (iA = tqjVar2.a(1074011787)) == 0 || (iA != 1 && ThreadLocalRandom.current().nextInt(iA) != 0)) {
                    i2 = 2;
                }
                vzqVarD.a = i2;
                return vzqVarD.b();
            case 1138:
                return auyg.a.io().b((Context) this.a.v.io());
            case 1139:
                return new afqv(new agfa(mcj.a), c == true ? 1 : 0);
            case 1140:
                mcsVar = new afqv(agpr.a, i3);
                return mcsVar;
            case 1141:
                this.a.gn();
                return new qfj();
            case 1142:
                return this.a.bG();
            case 1143:
                ght ghtVar11 = this.a;
                mcsVar = new qgg(ghtVar11.gW(), (Context) ghtVar11.v.io(), (Executor) ghtVar11.uT.io(), (qge) ghtVar11.ch(), ghtVar11.vD, aupm.b(ghtVar11.vE), (qdc) ghtVar11.vG.io(), (rrq) ghtVar11.vM.io(), ghtVar11.vN, ghtVar11.vO, ghtVar11.vP);
                return mcsVar;
            case 1144:
                return Boolean.valueOf(auxi.a.io().a((Context) this.a.v.io()));
            case 1145:
                return Boolean.valueOf(auxi.a.io().c((Context) this.a.v.io()));
            case 1146:
                return Integer.valueOf(((aero) this.a.uD.io()).a);
            case 1147:
                Context context3 = (Context) this.a.v.io();
                int i7 = klu.c;
                return Integer.valueOf(kml.a(context3));
            case 1148:
                return Boolean.valueOf(auwt.a.io().h((Context) this.a.v.io()));
            case 1149:
                return Long.valueOf(auwt.a.io().c((Context) this.a.v.io()));
            case 1150:
                return Long.valueOf(auwt.a.io().d((Context) this.a.v.io()));
            case 1151:
                return Boolean.valueOf(auwt.a.io().j((Context) this.a.v.io()));
            case 1152:
                return Long.valueOf(auwt.a.io().a((Context) this.a.v.io()));
            case 1153:
                return Long.valueOf(auwt.a.io().b((Context) this.a.v.io()));
            case 1154:
                return Long.valueOf(auyj.a.io().d((Context) this.a.v.io()));
            case 1155:
                return Long.valueOf(auyj.a.io().b((Context) this.a.v.io()));
            case 1156:
                return Boolean.valueOf(auwt.a.io().i((Context) this.a.v.io()));
            case 1157:
                return Long.valueOf(auwt.a.io().e((Context) this.a.v.io()));
            case 1158:
                Object objIo = new pwe((Context) this.a.v.io(), 18).io();
                objIo.getClass();
                return objIo;
            case 1159:
                return new gfy(7).io();
            case 1160:
                ght ghtVar12 = this.a;
                mcsVar = new qdc((Executor) ghtVar12.uT.io(), ghtVar12.dt(), (qcz) ghtVar12.cs(), (mbc) ghtVar12.uU.io(), ghtVar12.vF);
                return mcsVar;
            case 1161:
                return Boolean.valueOf(auxi.a.io().d((Context) this.a.v.io()));
            case 1162:
                ght ghtVar13 = this.a;
                kjcVar = new rrq((oml) ghtVar13.vI.io(), (ahey) ghtVar13.uM.io(), (Random) ghtVar13.uV.io(), ghtVar13.vJ, ghtVar13.vK, ghtVar13.vL);
                return kjcVar;
            case 1163:
                ght ghtVar14 = this.a;
                qdc qdcVar = (qdc) ghtVar14.vG.io();
                kjcVar = new oml(qdcVar, ghtVar14.vH);
                return kjcVar;
            case 1164:
                return Boolean.valueOf(auyj.a.io().i((Context) this.a.v.io()));
            case 1165:
                return Long.valueOf(auyj.a.io().c((Context) this.a.v.io()));
            case 1166:
                return Long.valueOf(auyj.a.io().a((Context) this.a.v.io()));
            case 1167:
                return Boolean.valueOf(auyj.a.io().g((Context) this.a.v.io()));
            case 1168:
                return Boolean.valueOf(auyj.a.io().h((Context) this.a.v.io()));
            case 1169:
                return Long.valueOf(auyj.a.io().e((Context) this.a.v.io()));
            case 1170:
                return Long.valueOf(auyj.a.io().f((Context) this.a.v.io()));
            case 1171:
                return Boolean.valueOf(auwt.a.io().g((Context) this.a.v.io()));
            case 1172:
                return auwt.a.io().f((Context) this.a.v.io());
            case 1173:
                return Boolean.valueOf(auxi.a.io().b((Context) this.a.v.io()));
            case 1174:
                ght ghtVar15 = this.a;
                aetb aetbVar = (aetb) ghtVar15.uw.io();
                Object[] objArr = ((double) ThreadLocalRandom.current().nextFloat()) <= ((vxz) ghtVar15.ca.io()).a(4, 45716739L, 0.0d);
                son sonVarE = qeq.e();
                if (objArr != false) {
                    aqiy aqiyVar = aetbVar.io().e;
                    if (aqiyVar == null) {
                        aqiyVar = aqiy.a;
                    }
                    i2 = aqiyVar.m ? 3 : 2;
                }
                sonVarE.a = i2;
                if (objArr != false) {
                    aqiy aqiyVar2 = aetbVar.io().e;
                    if (aqiyVar2 == null) {
                        aqiyVar2 = aqiy.a;
                    }
                    if (aqiyVar2.m) {
                        z = true;
                    }
                }
                sonVarE.f(z);
                return sonVarE.e();
            case 1175:
                ght ghtVar16 = this.a;
                mcsVar = new qes(ghtVar16.gW(), (Context) ghtVar16.v.io(), (kjc) ghtVar16.uQ.io(), (qeb) ghtVar16.vV.io(), (ahey) ghtVar16.uM.io(), aupm.b(ghtVar16.vW), new kjc(new qiu((Context) ghtVar16.v.io(), ghtVar16.vD)), ghtVar16.vX, ghtVar16.vY, (Executor) ghtVar16.uT.io());
                return mcsVar;
            case 1176:
                ght ghtVar17 = this.a;
                return new qeb((kjc) ghtVar17.uQ.io(), (qej) ghtVar17.vS.io(), ghtVar17.vT, ghtVar17.vU);
            case 1177:
                mcsVar = new qej((Context) this.a.v.io());
                return mcsVar;
            case 1178:
                tqj tqjVar3 = (tqj) this.a.q.io();
                int i8 = tqr.a;
                Boolean bool = (Boolean) new agfa(Boolean.valueOf(tqjVar3.k(1073808377))).e(Boolean.FALSE);
                bool.booleanValue();
                return bool;
            case 1179:
                tqj tqjVar4 = (tqj) this.a.q.io();
                int i9 = tqr.a;
                Boolean bool2 = (Boolean) new agfa(Boolean.valueOf(tqjVar4.k(1073808377))).e(Boolean.FALSE);
                bool2.booleanValue();
                return bool2;
            case 1180:
                aupr auprVar2 = this.a.vR;
                auprVar2.getClass();
                qeq qeqVar = (qeq) ((qen) ((awmd) new agfa(auprVar2).e(new wjy(c2 == true ? 1 : 0))).io());
                qeqVar.getClass();
                return qeqVar;
            case 1181:
                ght ghtVar18 = this.a;
                qepVar = new qep((String) ghtVar18.uE.io(), new oml((Context) ghtVar18.v.io(), (byte[]) null), (mbc) ghtVar18.uU.io(), ghtVar18.vW, (Context) ghtVar18.v.io());
                return qepVar;
            case 1182:
                return auww.a.io().a((Context) this.a.v.io());
            case 1183:
                vxz vxzVarFe = this.a.fe();
                qgu qguVarD = qgv.d();
                qguVarD.c = true != vxzVarFe.l(0, 45369961L, false) ? 2 : 3;
                qguVarD.b(true);
                return qguVarD.a();
            case 1184:
                ght ghtVar19 = this.a;
                axfd axfdVarGW = ghtVar19.gW();
                Context context4 = (Context) ghtVar19.v.io();
                kjc kjcVar2 = (kjc) ghtVar19.uQ.io();
                aunn aunnVarB = aupm.b(ghtVar19.wb);
                Object objIo2 = ghtVar19.we.io();
                aupr auprVar3 = ghtVar19.wf;
                aupr auprVar4 = ghtVar19.wg;
                Executor executor2 = (Executor) ghtVar19.uT.io();
                aupr auprVar5 = ghtVar19.ve;
                auprVar5.getClass();
                omm ommVar = new omm((awmd) new aups(auprVar5), (awmd) ghtVar19.uM);
                aupr auprVar6 = ghtVar19.wh;
                ghtVar19.fl();
                Object objCu = ghtVar19.cu();
                aeri aeriVar = (aeri) ghtVar19.wl.io();
                aeriVar.getClass();
                mcsVar = new qgr(axfdVarGW, context4, kjcVar2, aunnVarB, (qgo) objIo2, auprVar3, auprVar4, executor2, ommVar, auprVar6, (qgz) objCu, new agfa(aeriVar));
                return mcsVar;
            case 1185:
                aupr auprVar7 = this.a.wa;
                auprVar7.getClass();
                qgv qgvVar = (qgv) ((qen) ((awmd) new agfa(auprVar7).e(new gfy(8))).io());
                qgvVar.getClass();
                return qgvVar;
            case 1186:
                ght ghtVar20 = this.a;
                aunn aunnVarB2 = aupm.b(ghtVar20.wc);
                aupr auprVar8 = ghtVar20.wd;
                auprVar8.getClass();
                kjcVar = new qgo(aunnVarB2, new agfa(auprVar8), (Executor) ghtVar20.uT.io());
                return kjcVar;
            case 1187:
                return Boolean.valueOf(this.a.fe().l(1, 45369996L, false));
            case 1188:
                mcsVar = new qgs((mbc) this.a.uU.io());
                return mcsVar;
            case 1189:
                return auxl.a.io().b((Context) this.a.v.io());
            case 1190:
                return Boolean.valueOf(auxl.a.io().c((Context) this.a.v.io()));
            case 1191:
                return auxl.a.io().a((Context) this.a.v.io());
            case 1192:
                mcsVar = new qfl((agfx) this.a.wj.io());
                return mcsVar;
            case 1193:
                mcsVar = new qcn((mbc) this.a.uU.io());
                return mcsVar;
            case 1194:
                mcsVar = new aeri((tqj) this.a.q.io());
                return mcsVar;
            case 1195:
                ght ghtVar21 = this.a;
                tqj tqjVar5 = (tqj) ghtVar21.q.io();
                trl trlVar = (trl) ghtVar21.D.io();
                aetb aetbVar2 = (aetb) ghtVar21.uw.io();
                int i10 = tqr.a;
                if (tqjVar5.k(1073808373)) {
                    qfp qfpVarD = qfq.d();
                    qfpVarD.c = 3;
                    return qfpVarD.a();
                }
                if (tqjVar5.k(1073808360)) {
                    if (tqjVar5.k(1073808363) && trlVar.b == 0) {
                        qfp qfpVarD2 = qfq.d();
                        qfpVarD2.c = 3;
                        return qfpVarD2.a();
                    }
                    qfp qfpVarD3 = qfq.d();
                    qfpVarD3.c = 2;
                    return qfpVarD3.a();
                }
                aqiz aqizVarB = aetbVar2.io();
                aqip aqipVar = aqizVarB.l;
                if (aqipVar == null) {
                    aqipVar = aqip.a;
                }
                if (aqipVar.b == 0) {
                    aqiy aqiyVar3 = aqizVarB.e;
                    if (aqiyVar3 == null) {
                        aqiyVar3 = aqiy.a;
                    }
                    if (aqiyVar3.c) {
                        qfp qfpVarD4 = qfq.d();
                        qfpVarD4.c = 3;
                        aqiy aqiyVar4 = aqizVarB.e;
                        if (aqiyVar4 == null) {
                            aqiyVar4 = aqiy.a;
                        }
                        qfpVarD4.b(aqiyVar4.d);
                        return qfpVarD4.a();
                    }
                }
                qfp qfpVarD5 = qfq.d();
                qfpVarD5.c = 2;
                return qfpVarD5.a();
            case 1196:
                ght ghtVar22 = this.a;
                axfd axfdVarGW2 = ghtVar22.gW();
                Executor executor3 = (Executor) ghtVar22.uT.io();
                aunn aunnVarB3 = aupm.b(ghtVar22.wn);
                aupr auprVar9 = ghtVar22.wr;
                auprVar9.getClass();
                qepVar = new qfy(axfdVarGW2, executor3, aunnVarB3, new agfa(auprVar9), (kjc) ghtVar22.uQ.io(), (qeb) ghtVar22.vV.io(), ghtVar22.go(), ghtVar22.ws, ghtVar22.wt, ghtVar22.wu, (aerj) ghtVar22.cl(), (qiu) ghtVar22.cm(), ghtVar22.ww, ghtVar22.wx, new kjc(ghtVar22.wy, (byte[]) null));
                return qepVar;
            case 1197:
                aupr auprVar10 = this.a.wm;
                auprVar10.getClass();
                qfq qfqVar = (qfq) ((qen) ((awmd) new agfa(auprVar10).e(new gfy(14))).io());
                qfqVar.getClass();
                return qfqVar;
            case 1198:
                ght ghtVar23 = this.a;
                aupr auprVar11 = ghtVar23.wo;
                auprVar11.getClass();
                qchVar = new NativeCrashHandlerImpl(new agfa(auprVar11), ghtVar23.wp, ghtVar23.wq);
                return qchVar;
            case 1199:
                ght ghtVar24 = this.a;
                tqj tqjVar6 = (tqj) ghtVar24.q.io();
                aetb aetbVar3 = (aetb) ghtVar24.uw.io();
                int i11 = tqr.a;
                if (!tqjVar6.k(1073808373)) {
                    if (tqjVar6.k(1073808360)) {
                        zK = tqjVar6.k(1073808365);
                    } else {
                        aqiy aqiyVar5 = aetbVar3.io().e;
                        if (aqiyVar5 == null) {
                            aqiyVar5 = aqiy.a;
                        }
                        zK = aqiyVar5.q;
                    }
                }
                return Boolean.valueOf(zK);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r14v275, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v277, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v279, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v281, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v283, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v285, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v287, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v289, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v291, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v293, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v295, types: [awmd, java.lang.Object] */
    private final Object f() {
        Object omlVar;
        Object qirVar;
        Object wacVar;
        Object xscVar;
        int i = this.b;
        final int i2 = 0;
        final int i3 = 1;
        int i4 = 3;
        switch (i) {
            case 1200:
                return Boolean.valueOf(auxc.a.io().g((Context) this.a.v.io()));
            case 1201:
                return Boolean.valueOf(auxc.a.io().f((Context) this.a.v.io()));
            case 1202:
                return auxc.a.io().c((Context) this.a.v.io());
            case 1203:
                return auxc.a.io().d((Context) this.a.v.io());
            case 1204:
                return auxc.a.io().b((Context) this.a.v.io());
            case 1205:
                ght ghtVar = this.a;
                omlVar = new oml(new ayq((Context) ghtVar.v.io(), (qeb) ghtVar.vV.io(), ghtVar.vT, (byte[]) null), (Context) ghtVar.v.io());
                return omlVar;
            case 1206:
                return Boolean.valueOf(auxc.a.io().e((Context) this.a.v.io()));
            case 1207:
                return Long.valueOf(auxc.a.io().a((Context) this.a.v.io()));
            case 1208:
                return Boolean.valueOf(auxr.a.io().a((Context) this.a.v.io()));
            case 1209:
                ght ghtVar2 = this.a;
                aetb aetbVar = (aetb) ghtVar2.uw.io();
                aupr auprVar = ghtVar2.wA;
                aqiz aqizVarB = aetbVar.io();
                aqiy aqiyVar = aqizVarB.e;
                if (aqiyVar == null) {
                    aqiyVar = aqiy.a;
                }
                if (aqiyVar.g) {
                    aqiy aqiyVar2 = aqizVarB.e;
                    int i5 = (aqiyVar2 == null ? aqiy.a : aqiyVar2).h;
                    if (aqiyVar2 == null) {
                        aqiyVar2 = aqiy.a;
                    }
                    return afba.X(i5, aqiyVar2.i ? (qic) auprVar.io() : null);
                }
                aqiy aqiyVar3 = aqizVarB.e;
                if (!(aqiyVar3 == null ? aqiy.a : aqiyVar3).o) {
                    xlf xlfVarD = qhx.d();
                    xlfVarD.a = 2;
                    return xlfVarD.d();
                }
                int i6 = (aqiyVar3 == null ? aqiy.a : aqiyVar3).p;
                if (aqiyVar3 == null) {
                    aqiyVar3 = aqiy.a;
                }
                return afba.X(i6, aqiyVar3.i ? (qic) auprVar.io() : null);
            case 1210:
                return new aepu();
            case 1211:
                ght ghtVar3 = this.a;
                omlVar = new qib(ghtVar3.gW(), (Context) ghtVar3.v.io(), (qeb) ghtVar3.vV.io(), (ahey) ghtVar3.uM.io(), aupm.b(ghtVar3.wC), aupm.b(ghtVar3.wD), ghtVar3.wE, (Executor) ghtVar3.uT.io(), (oml) ghtVar3.wv.io());
                return omlVar;
            case 1212:
                aupr auprVar2 = this.a.wB;
                auprVar2.getClass();
                qhx qhxVar = (qhx) ((qen) ((awmd) new agfa(auprVar2).e(new gfy(11))).io());
                qhxVar.getClass();
                return qhxVar;
            case 1213:
                omlVar = new qhz(this.a.wC);
                return omlVar;
            case 1214:
                return Boolean.valueOf(auxu.a.io().b((Context) this.a.v.io()));
            case 1215:
                return auxu.a.io().a((Context) this.a.v.io());
            case 1216:
                ght ghtVar4 = this.a;
                axfd axfdVarGW = ghtVar4.gW();
                Context context = (Context) ghtVar4.v.io();
                ahey aheyVar = (ahey) ghtVar4.uM.io();
                aunn aunnVarB = aupm.b(ghtVar4.wG);
                aupr auprVar3 = ghtVar4.wH;
                omlVar = new qfn(axfdVarGW, context, aheyVar, aunnVarB, auprVar3, ghtVar4.wI);
                return omlVar;
            case 1217:
                return new gfy(15).io();
            case 1218:
                return auwz.a.io().a((Context) this.a.v.io());
            case 1219:
                ght ghtVar5 = this.a;
                omlVar = new qfo((Context) ghtVar5.v.io());
                return omlVar;
            case 1220:
                ght ghtVar6 = this.a;
                omlVar = new qio(ghtVar6.gW(), (Context) ghtVar6.v.io(), (qeb) ghtVar6.vV.io(), (Executor) ghtVar6.uT.io(), aupm.b(ghtVar6.wK), new qja((Context) ghtVar6.v.io(), (mbc) ghtVar6.uU.io(), ghtVar6.vD), ghtVar6.wL);
                return omlVar;
            case 1221:
                aupr auprVar4 = this.a.wJ;
                auprVar4.getClass();
                qim qimVar = (qim) ((qen) ((awmd) new agfa(auprVar4).e(new gfy(10))).io());
                qimVar.getClass();
                return qimVar;
            case 1222:
                aetb aetbVar2 = (aetb) this.a.uw.io();
                qil qilVarD = qim.d();
                aqiy aqiyVar4 = aetbVar2.io().e;
                if (aqiyVar4 == null) {
                    aqiyVar4 = aqiy.a;
                }
                qilVarD.c = true == aqiyVar4.e ? 3 : 2;
                return qilVarD.a();
            case 1223:
                return auya.a.io().a((Context) this.a.v.io());
            case 1224:
                aetb aetbVar3 = (aetb) this.a.uw.io();
                qip qipVarD = qiq.d();
                aqiy aqiyVar5 = aetbVar3.io().e;
                if (aqiyVar5 == null) {
                    aqiyVar5 = aqiy.a;
                }
                qipVarD.e = true == aqiyVar5.n ? 3 : 2;
                return qipVarD.a();
            case 1225:
                ght ghtVar7 = this.a;
                axfd axfdVarGW2 = ghtVar7.gW();
                qirVar = new qir(axfdVarGW2, aupm.b(ghtVar7.wO), ghtVar7.wP, ghtVar7.go());
                return qirVar;
            case 1226:
                aupr auprVar5 = this.a.wN;
                auprVar5.getClass();
                qiq qiqVar = (qiq) ((qen) ((awmd) new agfa(auprVar5).e(new gfy(12))).io());
                qiqVar.getClass();
                return qiqVar;
            case 1227:
                return auyd.a.io().a((Context) this.a.v.io());
            case 1228:
                return Boolean.valueOf(auyd.a.io().b((Context) this.a.v.io()));
            case 1229:
                ght ghtVar8 = this.a;
                omlVar = new qit(ghtVar8.gW(), (ahey) ghtVar8.uM.io(), aupm.b(ghtVar8.wR), ghtVar8.vl, ghtVar8.wS);
                return omlVar;
            case 1230:
                aupr auprVar6 = this.a.vk;
                auprVar6.getClass();
                qis qisVar = (qis) ((qen) ((awmd) new agfa(auprVar6).e(new gfy(13))).io());
                qisVar.getClass();
                return qisVar;
            case 1231:
                return auyg.a.io().a((Context) this.a.v.io());
            case 1232:
                return Boolean.valueOf(auyg.a.io().c((Context) this.a.v.io()));
            case 1233:
                ght ghtVar9 = this.a;
                axfd axfdVarGW3 = ghtVar9.gW();
                omlVar = new qhr(axfdVarGW3, (qhm) ghtVar9.wX.io(), (ahey) ghtVar9.uM.io(), aupm.b(ghtVar9.wV), (qhw) ghtVar9.xa.io(), (qcs) ghtVar9.uJ.io(), ghtVar9.xb, (Executor) ghtVar9.uT.io());
                return omlVar;
            case 1234:
                ght ghtVar10 = this.a;
                qeb qebVar = (qeb) ghtVar10.vV.io();
                ahey aheyVar2 = (ahey) ghtVar10.uM.io();
                Executor executor = (Executor) ghtVar10.uT.io();
                aunn aunnVarB2 = aupm.b(ghtVar10.wV);
                aunn aunnVarB3 = aupm.b(ghtVar10.wW);
                omlVar = new qhm(qebVar, aheyVar2, executor, aunnVarB2, aunnVarB3);
                return omlVar;
            case 1235:
                aupr auprVar7 = this.a.wU;
                auprVar7.getClass();
                qhh qhhVar = (qhh) ((awmd) new agfa(auprVar7).e(new gfy(16))).io();
                qhhVar.getClass();
                return qhhVar;
            case 1236:
                aetb aetbVar4 = (aetb) this.a.uw.io();
                aqiw aqiwVar = aetbVar4.io().j;
                if (aqiwVar == null) {
                    aqiwVar = aqiw.a;
                }
                if (!aqiwVar.c) {
                    return qhh.d().a();
                }
                qhg qhgVarD = qhh.d();
                aqiy aqiyVar6 = aetbVar4.io().e;
                if (aqiyVar6 == null) {
                    aqiyVar6 = aqiy.a;
                }
                qhgVarD.e = true == aqiyVar6.f ? 3 : 2;
                return qhgVarD.a();
            case 1237:
                return Long.valueOf(auxo.a.io().b((Context) this.a.v.io()));
            case 1238:
                return Long.valueOf(auxo.a.io().a((Context) this.a.v.io()));
            case 1239:
                ght ghtVar11 = this.a;
                omlVar = new qhw(ghtVar11.wV, (Context) ghtVar11.v.io(), ghtVar11.uF, ghtVar11.wY, ghtVar11.wZ, (oml) ghtVar11.wv.io());
                return omlVar;
            case 1240:
                return Boolean.valueOf(auxo.a.io().d((Context) this.a.v.io()));
            case 1241:
                return Boolean.valueOf(auxo.a.io().e((Context) this.a.v.io()));
            case 1242:
                return auxo.a.io().c((Context) this.a.v.io());
            case 1243:
                ght ghtVar12 = this.a;
                omlVar = new qii(ghtVar12.gW(), (ahey) ghtVar12.uM.io(), (Executor) ghtVar12.uT.io(), aupm.b(ghtVar12.xd), ghtVar12.xe);
                return omlVar;
            case 1244:
                agdf agdfVar = agdf.a;
                omlVar = new qid(agdfVar, agdfVar);
                return omlVar;
            case 1245:
                return auxx.a.io().c((Context) this.a.v.io());
            case 1246:
                return Boolean.valueOf(auxx.a.io().d((Context) this.a.v.io()));
            case 1247:
                return Long.valueOf(auxx.a.io().b((Context) this.a.v.io()));
            case 1248:
                return Long.valueOf(auxx.a.io().a((Context) this.a.v.io()));
            case 1249:
                ght ghtVar13 = this.a;
                final Context context2 = (Context) ghtVar13.v.io();
                final aupr auprVar8 = ghtVar13.xm;
                final Set setDc = ghtVar13.dc();
                final agfa agfaVar = new agfa(ghtVar13.bl());
                final omr omrVarFM = ghtVar13.fM();
                final agdf agdfVar2 = agdf.a;
                omlVar = new qnt() { // from class: qnp
                    /* JADX WARN: Type inference failed for: r6v2, types: [agek, java.lang.Object] */
                    @Override // defpackage.qnt
                    public final void a() {
                        Set set = setDc;
                        omr omrVar = omrVarFM;
                        if (set.isEmpty() && !omrVar.m()) {
                            Boolean.FALSE.booleanValue();
                            return;
                        }
                        awmd awmdVar = auprVar8;
                        agev agevVar = agfaVar;
                        Application application = (Application) context2;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((agfa) agevVar).a.apply(new qnq(application, agevVar, set, omrVar, awmdVar)));
                    }
                };
                return omlVar;
            case 1250:
                return agkz.n(this.a.dd());
            case 1251:
                omlVar = new mbw(this.a.dl());
                return omlVar;
            case 1252:
                omlVar = new afqv((Context) this.a.v.io(), i2);
                return omlVar;
            case 1253:
                omlVar = new afqv(agpr.a, i4);
                return omlVar;
            case 1254:
                final afhw afhwVarBf = this.a.bf();
                omlVar = new afne() { // from class: afqu
                    @Override // defpackage.afne
                    public final ListenableFuture a() {
                        int i7 = i3;
                        Object obj = afhwVarBf;
                        if (i7 != 0) {
                            afjn.d(115, ((afhw) obj).a(), "Failed account invalidation.", new Object[0]);
                            return aher.a;
                        }
                        try {
                            PackageInfo packageInfo = ((Context) obj).getPackageManager().getPackageInfo(((Context) obj).getPackageName(), 0);
                            if (packageInfo.applicationInfo.targetSdkVersion < 24) {
                                try {
                                    Os.chmod(packageInfo.applicationInfo.dataDir, 448);
                                } catch (Exception e) {
                                    throw new IOException(e);
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | IOException unused) {
                        }
                        return aher.a;
                    }
                };
                return omlVar;
            case 1255:
                final Context context3 = (Context) this.a.v.io();
                omlVar = new afne() { // from class: afqu
                    @Override // defpackage.afne
                    public final ListenableFuture a() {
                        int i7 = i2;
                        Object obj = context3;
                        if (i7 != 0) {
                            afjn.d(115, ((afhw) obj).a(), "Failed account invalidation.", new Object[0]);
                            return aher.a;
                        }
                        try {
                            PackageInfo packageInfo = ((Context) obj).getPackageManager().getPackageInfo(((Context) obj).getPackageName(), 0);
                            if (packageInfo.applicationInfo.targetSdkVersion < 24) {
                                try {
                                    Os.chmod(packageInfo.applicationInfo.dataDir, 448);
                                } catch (Exception e) {
                                    throw new IOException(e);
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | IOException unused) {
                        }
                        return aher.a;
                    }
                };
                return omlVar;
            case 1256:
                return new afrl();
            case 1257:
                ght ghtVar14 = this.a;
                wacVar = new wac(ghtVar14.fA, (ahex) ghtVar14.u.io());
                return wacVar;
            case 1258:
                ght ghtVar15 = this.a;
                omn omnVarFS = ghtVar15.fS();
                hld hldVar = (hld) ghtVar15.fZ.io();
                hldVar.getClass();
                aaas aaasVar = (aaas) omnVarFS.e.io();
                aaasVar.getClass();
                aapw aapwVar = (aapw) omnVarFS.a.io();
                aapwVar.getClass();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) omnVarFS.i.io();
                scheduledExecutorService.getClass();
                wjr wjrVar = (wjr) omnVarFS.g.io();
                wjrVar.getClass();
                Context context4 = (Context) omnVarFS.k.io();
                context4.getClass();
                vyo vyoVar = (vyo) omnVarFS.j.io();
                vyoVar.getClass();
                mbc mbcVar = (mbc) omnVarFS.c.io();
                mbcVar.getClass();
                tfq tfqVar = (tfq) omnVarFS.h.io();
                tfqVar.getClass();
                abxv abxvVar = (abxv) omnVarFS.d.io();
                abxvVar.getClass();
                ci ciVar = (ci) omnVarFS.b.io();
                ciVar.getClass();
                afft afftVar = (afft) omnVarFS.f.io();
                afftVar.getClass();
                wacVar = new aabx(aaasVar, aapwVar, scheduledExecutorService, wjrVar, hldVar, context4, vyoVar, mbcVar, tfqVar, abxvVar, ciVar, afftVar);
                return wacVar;
            case 1259:
                ght ghtVar16 = this.a;
                qirVar = new aapw((wlp) ghtVar16.kE.io(), (abxv) ghtVar16.gK.io(), (zwb) ghtVar16.bd.io(), (tgg) ghtVar16.ms.io());
                return qirVar;
            case 1260:
                ght ghtVar17 = this.a;
                omlVar = new abxv((awmd) ghtVar17.fY, (awmd) ghtVar17.v, (awmd) ghtVar17.l, (awmd) ghtVar17.av, (byte[]) null, (byte[]) null);
                return omlVar;
            case 1261:
                omlVar = new ci((Object) this.a.bN, (byte[]) null);
                return omlVar;
            case 1262:
                return new afft(null);
            case 1263:
                ght ghtVar18 = this.a;
                xscVar = new xsc((awmd) ghtVar18.l, (awmd) ghtVar18.xB, (awmd) ghtVar18.xC, (char[]) null);
                return xscVar;
            case 1264:
                ght ghtVar19 = this.a;
                omlVar = new elr((vxu) ghtVar19.at.io(), ghtVar19.xz, ghtVar19.xA);
                return omlVar;
            case 1265:
                ght ghtVar20 = this.a;
                return new aaaf();
            case 1266:
                return new aaag();
            case 1267:
                FirebaseMessaging firebaseMessagingA = FirebaseMessaging.a();
                firebaseMessagingA.getClass();
                return firebaseMessagingA;
            case 1268:
                return new elr((char[]) null);
            case 1269:
                return gzj.i((Context) this.a.v.io());
            case 1270:
                return ((aaae) this.a.xF.io()).b;
            case 1271:
                ght ghtVar21 = this.a;
                omlVar = new sxn((Context) ghtVar21.v.io(), Optional.of(Boolean.TRUE), ghtVar21.aZ, ghtVar21.xJ, (tqj) ghtVar21.q.io(), (ScheduledExecutorService) ghtVar21.u.io(), aupm.b(ghtVar21.xK), aupm.b(ghtVar21.xL));
                return omlVar;
            case 1272:
                ght ghtVar22 = this.a;
                xscVar = new sxj((vyo) ghtVar22.av.io(), Optional.of((Map) ghtVar22.xH.io()), Optional.of((Map) ghtVar22.xI.io()));
                return xscVar;
            case 1273:
                return gzi.b();
            case 1274:
                return gzi.a();
            case 1275:
                agkz agkzVar = gzi.b;
                agkzVar.getClass();
                return Optional.of(agkzVar);
            case 1276:
                agkz agkzVar2 = gzi.c;
                agkzVar2.getClass();
                return Optional.of(agkzVar2);
            case 1277:
                ght ghtVar23 = this.a;
                omlVar = new aaak((xeu) ghtVar23.aZ.io(), (abte) ghtVar23.iS.io(), (vyo) ghtVar23.av.io(), (vxu) ghtVar23.at.io());
                return omlVar;
            case 1278:
                ght ghtVar24 = this.a;
                vxa vxaVarAe = ghtVar24.ae();
                agkj agkjVarN = agkj.n(amla.class, ghtVar24.xS, akyo.class, ghtVar24.xV, ajth.class, ghtVar24.xY, apdc.class, ghtVar24.ya, anlw.class, ghtVar24.yb);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new vwz(agkjVarN));
                return new vwy(vxaVarAe, agke.n(arrayList));
            case 1279:
                ght ghtVar25 = this.a;
                qcb qcbVar = (qcb) ghtVar25.xO.io();
                qcb qcbVar2 = (qcb) ghtVar25.xQ.io();
                vxe vxeVar = (vxe) ghtVar25.xR.io();
                qcbVar2.getClass();
                vxeVar.getClass();
                return qcbVar.N(Optional.empty(), qcbVar2.M(vxeVar));
            case 1280:
                omlVar = new qcb(this);
                return omlVar;
            case 1281:
                omlVar = new qcb(this);
                return omlVar;
            case 1282:
                omlVar = new jlh((Context) this.a.v.io());
                return omlVar;
            case 1283:
                ght ghtVar26 = this.a;
                return ((qcb) ghtVar26.xU.io()).D(ghtVar26.xR, Optional.empty());
            case 1284:
                omlVar = new qcb(this);
                return omlVar;
            case 1285:
                ght ghtVar27 = this.a;
                omlVar = new aapw((wlp) ghtVar27.kE.io(), (abxv) ghtVar27.gK.io(), (zwb) ghtVar27.bd.io(), (tgg) ghtVar27.rn.io(), (byte[]) null);
                return omlVar;
            case 1286:
                ght ghtVar28 = this.a;
                return ((qcb) ghtVar28.xX.io()).C(ghtVar28.xR);
            case 1287:
                omlVar = new qcb(this);
                return omlVar;
            case 1288:
                ght ghtVar29 = this.a;
                omlVar = new woh((zwb) ghtVar29.bd.io(), (tmo) ghtVar29.pU.io(), (mbc) ghtVar29.l.io(), (Executor) ghtVar29.u.io(), ghtVar29.ac(), (wjr) ghtVar29.jC.io(), (vxz) ghtVar29.aL.io());
                return omlVar;
            case 1289:
                ght ghtVar30 = this.a;
                xscVar = new wrk((wva) ghtVar30.xZ.io(), ghtVar30.xR, (Executor) ghtVar30.B.io());
                return xscVar;
            case 1290:
                ght ghtVar31 = this.a;
                omlVar = new wva((wlp) ghtVar31.kE.io(), (abxv) ghtVar31.gK.io(), (zwb) ghtVar31.bd.io(), (tgg) ghtVar31.ms.io());
                return omlVar;
            case 1291:
                ght ghtVar32 = this.a;
                omlVar = new gus(aupm.b(ghtVar32.mA), aupm.b(ghtVar32.J), (tqj) ghtVar32.q.io());
                return omlVar;
            case 1292:
                return new elr((byte[]) null, (byte[]) null);
            case 1293:
                omlVar = new elr(this.a.fE(), (byte[]) null);
                return omlVar;
            case 1294:
                ght ghtVar33 = this.a;
                omlVar = new wud((abxv) ghtVar33.gK.io(), (tgg) ghtVar33.qg.io(), (zwb) ghtVar33.bd.io(), (vxu) ghtVar33.at.io(), (wlp) ghtVar33.kE.io());
                return omlVar;
            case 1295:
                ahex ahexVar = (ahex) this.a.yg.io();
                ahexVar.getClass();
                omlVar = new awvw(ahexVar);
                return omlVar;
            case 1296:
                ght ghtVar34 = this.a;
                aupr auprVar9 = ghtVar34.z;
                auprVar9.getClass();
                agfa agfaVar2 = new agfa(auprVar9);
                ahey aheyVar3 = (ahey) ghtVar34.yf.io();
                int i7 = pof.a;
                aheyVar3.getClass();
                omlVar = (ahey) ((awmd) agfaVar2.a).io();
                if (omlVar == null) {
                    return aheyVar3;
                }
                return omlVar;
            case 1297:
                aupr auprVar10 = this.a.u;
                auprVar10.getClass();
                agfa agfaVar3 = new agfa(auprVar10);
                int i8 = pof.a;
                ahey aheyVar4 = (ahey) ((awmd) agfaVar3.a).io();
                if (aheyVar4 != null) {
                    return aheyVar4;
                }
                ahfi ahfiVar = new ahfi();
                ahfiVar.c("gnp-background-thread-%d");
                wacVar = new plo(MoreExecutors.a(Executors.newFixedThreadPool(4, ahfi.a(ahfiVar))), MoreExecutors.b(Executors.newSingleThreadScheduledExecutor()));
                return wacVar;
            case 1298:
                ght ghtVar35 = this.a;
                omlVar = new pic((Context) ghtVar35.v.io(), (pls) ghtVar35.yi.io(), (pbk) ghtVar35.yk.io(), (piy) ghtVar35.yl.io(), (pgy) ghtVar35.yn.io(), (pav) ghtVar35.yG.io(), ghtVar35.yj, (mbc) ghtVar35.l.io(), (pha) ghtVar35.yT.io(), ghtVar35.D(), new pco(agdf.a), (awou) ghtVar35.yh.io(), (awou) ghtVar35.yu.io());
                return omlVar;
            case 1299:
                return gzj.ay();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        Object pidVar;
        Object omjVar;
        int i = this.b;
        switch (i) {
            case 1300:
                ght ghtVar = this.a;
                return new pbl((Context) ghtVar.v.io(), (pls) ghtVar.yi.io(), ghtVar.yj);
            case 1301:
                ght ghtVar2 = this.a;
                return pox.i((Context) ghtVar2.v.io(), (ahey) ghtVar2.yf.io());
            case 1302:
                ght ghtVar3 = this.a;
                return new piy((Context) ghtVar3.v.io(), (pls) ghtVar3.yi.io(), new nwo(), ghtVar3.B());
            case 1303:
                ght ghtVar4 = this.a;
                pidVar = new pid((Context) ghtVar4.v.io(), (pls) ghtVar4.yi.io());
                return pidVar;
            case 1304:
                ght ghtVar5 = this.a;
                return new pay((Context) ghtVar5.v.io(), (pls) ghtVar5.yi.io(), ghtVar5.eG(), (mbc) ghtVar5.l.io(), (pun) ghtVar5.yB.io(), (pds) ghtVar5.yK.io(), (kjc) ghtVar5.yL.io(), (pgy) ghtVar5.yn.io(), (pxh) ghtVar5.yo.io(), (Random) ghtVar5.yM.io(), ghtVar5.dM());
            case 1305:
                return new pxi();
            case 1306:
                ght ghtVar6 = this.a;
                return new pvc((Context) ghtVar6.v.io(), (pls) ghtVar6.yi.io(), (pqg) ghtVar6.yr.io(), (pum) ghtVar6.yA.io());
            case 1307:
                ght ghtVar7 = this.a;
                Context context = (Context) ghtVar7.v.io();
                pls plsVar = (pls) ghtVar7.yi.io();
                qnl qnlVar = (qnl) ghtVar7.yq.io();
                ghtVar7.he();
                return new pqj(context, plsVar, qnlVar);
            case 1308:
                return new qnl();
            case 1309:
                ght ghtVar8 = this.a;
                return new puz((pls) ghtVar8.yi.io(), agev.i(ghtVar8.fs()), (omm) ghtVar8.yy.io(), ghtVar8.yz);
            case 1310:
                ght ghtVar9 = this.a;
                rre rreVar = (rre) ghtVar9.bL.io();
                ghtVar9.gD();
                omjVar = new omj(rreVar);
                return omjVar;
            case 1311:
                ght ghtVar10 = this.a;
                return pox.u(aupm.b(ghtVar10.yx), (awou) ghtVar10.yu.io());
            case 1312:
                ght ghtVar11 = this.a;
                Context context2 = (Context) ghtVar11.v.io();
                awut awutVarDM = ghtVar11.dM();
                SharedPreferences sharedPreferences = (SharedPreferences) ghtVar11.yv.io();
                pxh pxhVar = (pxh) ghtVar11.yo.io();
                pfz pfzVarE = ghtVar11.E();
                ghtVar11.he();
                return pox.f(context2, awutVarDM, sharedPreferences, pxhVar, pfzVarE);
            case 1313:
                return nyr.l((ahex) this.a.yt.io());
            case 1314:
                return nyr.j(agev.i(this.a.T));
            case 1315:
                ght ghtVar12 = this.a;
                Context context3 = (Context) ghtVar12.v.io();
                ghtVar12.he();
                return pox.e(context3);
            case 1316:
                return nyr.k((ahex) this.a.yf.io());
            case 1317:
                ght ghtVar13 = this.a;
                return Boolean.valueOf(qnl.at((Context) ghtVar13.v.io(), (pxh) ghtVar13.yo.io(), (pls) ghtVar13.yi.io()));
            case 1318:
                ght ghtVar14 = this.a;
                return new peo((Context) ghtVar14.v.io(), (pls) ghtVar14.yi.io(), (pgy) ghtVar14.yn.io(), ghtVar14.L(), agev.i(ghtVar14.fs()), (omm) ghtVar14.yy.io(), (pwf) ghtVar14.yj.io(), ghtVar14.gX());
            case 1319:
                return agkz.n(pox.j());
            case 1320:
                return agkz.u(nyr.f(), nyr.e(), nyr.d(), nyr.g(), pox.c(), pox.b(), nyr.i(), pox.k(), pox.l());
            case 1321:
                ght ghtVar15 = this.a;
                return pox.h(aupm.b(ghtVar15.yE), (awou) ghtVar15.yu.io());
            case 1322:
                ght ghtVar16 = this.a;
                Context context4 = (Context) ghtVar16.v.io();
                awou awouVar = (awou) ghtVar16.yu.io();
                pfz pfzVarE2 = ghtVar16.E();
                ghtVar16.he();
                return pox.g(context4, awouVar, pfzVarE2);
            case 1323:
                ght ghtVar17 = this.a;
                pidVar = new omm((pfv) ghtVar17.yH.io(), (ahex) ghtVar17.yf.io(), null);
                return pidVar;
            case 1324:
                ght ghtVar18 = this.a;
                Context context5 = (Context) ghtVar18.v.io();
                aunn aunnVarB = aupm.b(ghtVar18.yG);
                mbc mbcVar = (mbc) ghtVar18.l.io();
                ghtVar18.he();
                return new pfv(context5, aunnVarB, mbcVar);
            case 1325:
                return new kjc((Context) this.a.v.io(), (char[]) null);
            case 1326:
                return nyr.h((mbc) this.a.l.io());
            case 1327:
                ght ghtVar19 = this.a;
                return new pit((Context) ghtVar19.v.io(), (pls) ghtVar19.yi.io(), aupm.b(ghtVar19.yQ), aupm.b(ghtVar19.yP), (pav) ghtVar19.yG.io(), aupm.b(ghtVar19.yj), (awou) ghtVar19.yw.io(), aupm.b(ghtVar19.yR));
            case 1328:
                ght ghtVar20 = this.a;
                return new pxg((Context) ghtVar20.v.io(), (pxd) ghtVar20.yP.io(), (awou) ghtVar20.yu.io());
            case 1329:
                ght ghtVar21 = this.a;
                return new zzx((adhv) ghtVar21.rB.io(), (qcb) ghtVar21.yO.io(), (Executor) ghtVar21.t.io(), ghtVar21.eT(), ghtVar21.aF(), (vxz) ghtVar21.ca.io());
            case 1330:
                return new qcb(this);
            case 1331:
                return agkj.k("media_gen_image_cache", rsb.h(), "chime_media_cache", xwg.i());
            case 1332:
                return new ijt((aifk) this.a.td.io());
            case 1333:
                return new pco(agdf.b());
            case 1334:
                ght ghtVar22 = this.a;
                Context context6 = (Context) ghtVar22.v.io();
                ghtVar22.he();
                omjVar = new pzd(context6);
                return omjVar;
            case 1335:
                ght ghtVar23 = this.a;
                return new pzk((pha) ghtVar23.yT.io(), (Context) ghtVar23.v.io(), (pls) ghtVar23.yi.io(), (pav) ghtVar23.yG.io());
            case 1336:
                ght ghtVar24 = this.a;
                return new tld((Context) ghtVar24.v.io(), (pls) ghtVar24.yi.io());
            case 1337:
                return new pco(agev.i(this.a.cF()));
            case 1338:
                ght ghtVar25 = this.a;
                return qnl.bQ((tld) ghtVar25.zc.io(), ghtVar25.hb());
            case 1339:
                ght ghtVar26 = this.a;
                Context context7 = (Context) ghtVar26.v.io();
                awou awouVar2 = (awou) ghtVar26.yw.io();
                ghtVar26.he();
                return iqf.t(context7, awouVar2);
            case 1340:
                ght ghtVar27 = this.a;
                return new qbm((Context) ghtVar27.v.io(), (pls) ghtVar27.yi.io(), ghtVar27.gA(), (pwf) ghtVar27.yj.io(), (mbc) ghtVar27.l.io());
            case 1341:
                ght ghtVar28 = this.a;
                return new pqe((Context) ghtVar28.v.io(), (awou) ghtVar28.yh.io(), ghtVar28.K(), (pls) ghtVar28.yi.io());
            case 1342:
                return GnpWorker.class;
            case 1343:
                ght ghtVar29 = this.a;
                Context context8 = (Context) ghtVar29.v.io();
                ghtVar29.he();
                omjVar = new pfp(context8);
                return omjVar;
            case 1344:
                ght ghtVar30 = this.a;
                return new peg((pdu) ghtVar30.zi.io(), (kjc) ghtVar30.zo.io(), (isi) ghtVar30.zp.io(), (qnl) ghtVar30.zq.io(), (isi) ghtVar30.zr.io(), (qnl) ghtVar30.zs.io(), (isi) ghtVar30.zt.io(), (omr) ghtVar30.zu.io(), (pep) ghtVar30.zw.io(), (qnl) ghtVar30.zx.io(), (qnl) ghtVar30.zy.io(), (pav) ghtVar30.yG.io(), ghtVar30.zz);
            case 1345:
                ght ghtVar31 = this.a;
                return new pdu((pls) ghtVar31.yi.io(), (pun) ghtVar31.yB.io(), (mbc) ghtVar31.l.io());
            case 1346:
                ght ghtVar32 = this.a;
                return new kjc(ghtVar32.O(), (awou) ghtVar32.yu.io());
            case 1347:
                return this.a.J();
            case 1348:
                return pox.v((Context) this.a.v.io());
            case 1349:
                return new jzb((Context) this.a.v.io());
            case 1350:
                return pox.d();
            case 1351:
                return new agqj(psq.b());
            case 1352:
                ght ghtVar33 = this.a;
                return new isi((pls) ghtVar33.yi.io(), (pds) ghtVar33.yK.io(), (pun) ghtVar33.yB.io(), (byte[]) null);
            case 1353:
                ght ghtVar34 = this.a;
                return new qnl((pls) ghtVar34.yi.io(), (pds) ghtVar34.yK.io(), (pun) ghtVar34.yB.io());
            case 1354:
                ght ghtVar35 = this.a;
                return new isi((pls) ghtVar35.yi.io(), (pds) ghtVar35.yK.io(), (pun) ghtVar35.yB.io());
            case 1355:
                ght ghtVar36 = this.a;
                return new qnl((pls) ghtVar36.yi.io(), (pun) ghtVar36.yB.io(), (byte[]) null);
            case 1356:
                ght ghtVar37 = this.a;
                return new isi((pls) ghtVar37.yi.io(), (pqg) ghtVar37.yr.io(), (pun) ghtVar37.yB.io());
            case 1357:
                ght ghtVar38 = this.a;
                return new omr((pls) ghtVar38.yi.io(), (pun) ghtVar38.yB.io());
            case 1358:
                ght ghtVar39 = this.a;
                return new pep((pls) ghtVar39.yi.io(), (pqg) ghtVar39.yr.io(), (pds) ghtVar39.yK.io(), (pun) ghtVar39.yB.io(), (pum) ghtVar39.yA.io(), (pav) ghtVar39.yG.io(), (agev) ghtVar39.zv.io(), (Context) ghtVar39.v.io(), (pwf) ghtVar39.yj.io(), (omm) ghtVar39.yy.io(), (awou) ghtVar39.yu.io());
            case 1359:
                ght ghtVar40 = this.a;
                return new qnl((pls) ghtVar40.yi.io(), (pun) ghtVar40.yB.io(), (char[]) null);
            case 1360:
                ght ghtVar41 = this.a;
                return new qnl((pls) ghtVar41.yi.io(), (pun) ghtVar41.yB.io());
            case 1361:
                ght ghtVar42 = this.a;
                pidVar = new tld((pfv) ghtVar42.yH.io(), (mbc) ghtVar42.l.io());
                return pidVar;
            case 1362:
                return iqf.u((qcb) this.a.zF.io());
            case 1363:
                return new qcb(this);
            case 1364:
                ght ghtVar43 = this.a;
                Context context9 = (Context) ghtVar43.v.io();
                awou awouVar3 = (awou) ghtVar43.yu.io();
                pfz pfzVarE3 = ghtVar43.E();
                ghtVar43.he();
                return psq.e(context9, awouVar3, pfzVarE3);
            case 1365:
                return new qap((pve) this.a.yF.io());
            case 1366:
                return new ijt((Context) this.a.v.io(), (byte[]) null);
            case 1367:
                return new axfi(false);
            case 1368:
                return new pco(agdf.b());
            case 1369:
                return new pco(agdf.b());
            case 1370:
                ght ghtVar44 = this.a;
                return new pbz((pve) ghtVar44.yF.io(), (tld) ghtVar44.zD.io(), (tld) ghtVar44.zd.io(), (tld) ghtVar44.zN.io(), ghtVar44.M(), (pav) ghtVar44.yG.io(), (Set) aupt.b().io(), (awou) ghtVar44.yu.io());
            case 1371:
                ght ghtVar45 = this.a;
                return psq.v((tld) ghtVar45.zM.io(), ghtVar45.gY());
            case 1372:
                ght ghtVar46 = this.a;
                Context context10 = (Context) ghtVar46.v.io();
                awou awouVar4 = (awou) ghtVar46.yw.io();
                pfz pfzVarE4 = ghtVar46.E();
                ghtVar46.he();
                return psq.u(context10, awouVar4, pfzVarE4);
            case 1373:
                ght ghtVar47 = this.a;
                return vql.k((tqj) ghtVar47.q.io(), aupm.b(ghtVar47.mq), aupm.b(ghtVar47.mr));
            case 1374:
                ght ghtVar48 = this.a;
                aupr auprVar = ghtVar48.bd;
                aunn aunnVarB2 = aupm.b(auprVar);
                aunn aunnVarB3 = aupm.b(auprVar);
                aunn aunnVarB4 = aupm.b(ghtVar48.zR);
                aunn aunnVarB5 = aupm.b(ghtVar48.ap);
                Executor executor = (Executor) ghtVar48.B.io();
                Executor executor2 = (Executor) ghtVar48.u.io();
                aupr auprVar2 = ghtVar48.ft;
                mbc mbcVar2 = (mbc) ghtVar48.l.io();
                tbt tbtVar = (tbt) ghtVar48.I.io();
                aupr auprVar3 = ghtVar48.cx;
                aupr auprVar4 = ghtVar48.bC;
                ahbw ahbwVar = (ahbw) auprVar3.io();
                ci ciVar = (ci) ghtVar48.bw.io();
                return new rqa(aunnVarB2, aunnVarB3, aunnVarB4, aunnVarB5, executor, executor2, auprVar2, mbcVar2, tbtVar, auprVar4, ahbwVar, ciVar, (tfq) ghtVar48.cd.io(), (vxu) ghtVar48.at.io());
            case 1375:
                ght ghtVar49 = this.a;
                return new wnw((wlp) ghtVar49.kE.io(), ghtVar49.gu(), (tgg) ghtVar49.zQ.io(), (vxu) ghtVar49.at.io(), (Executor) ghtVar49.z.io());
            case 1376:
                ght ghtVar50 = this.a;
                return zrp.d((tqj) ghtVar50.q.io(), aupm.b(ghtVar50.be), aupm.b(ghtVar50.bp));
            case 1377:
                ght ghtVar51 = this.a;
                return new aesp((tre) ghtVar51.Q.io(), (ahbw) ghtVar51.cx.io());
            case 1378:
                ght ghtVar52 = this.a;
                return vql.n((vvn) ghtVar52.fL.io(), (tgm) ghtVar52.bf.io(), (tmo) ghtVar52.gS.io(), (Optional) ghtVar52.gR.io(), (tgl) ghtVar52.bk.io(), (ExecutorService) ghtVar52.z.io(), (ExecutorService) ghtVar52.u.io());
            case 1379:
                ght ghtVar53 = this.a;
                return vkz.f((tqj) ghtVar53.q.io(), aupm.b(ghtVar53.mq), aupm.b(ghtVar53.mr));
            case 1380:
                return geh.s((abvn) this.a.cH.io());
            case 1381:
                return new hfn();
            case 1382:
                ght ghtVar54 = this.a;
                pidVar = new hef(ghtVar54.v.io(), (awmd) ghtVar54.zY);
                return pidVar;
            case 1383:
                return aaux.b((aceo) this.a.pg.io());
            case 1384:
                ght ghtVar55 = this.a;
                return new ire((Context) ghtVar55.v.io(), (Executor) ghtVar55.z.io(), (zwb) ghtVar55.bd.io(), (syn) ghtVar55.cs.io());
            case 1385:
                ght ghtVar56 = this.a;
                return new hzp((tbt) ghtVar56.I.io(), (wqm) ghtVar56.ro.io(), (abvc) ghtVar56.kC.io(), (abvn) ghtVar56.cH.io(), (Executor) ghtVar56.B.io(), (avmb) ghtVar56.dA.io(), (avmb) ghtVar56.dE.io(), (hzi) ghtVar56.nw.io(), (zwb) ghtVar56.bd.io(), (wbz) ghtVar56.es.io(), (vxe) ghtVar56.xR.io(), (jlh) ghtVar56.xP.io(), (vxz) ghtVar56.ga.io(), (vxz) ghtVar56.cu.io(), (awkv) ghtVar56.to.io());
            case 1386:
                return gly.m((abea) this.a.kt.io());
            case 1387:
                return new izg();
            case 1388:
                return ((abvn) this.a.cH.io()).y();
            case 1389:
                ght ghtVar57 = this.a;
                return new igr((SharedPreferences) ghtVar57.J.io(), (tfq) ghtVar57.cd.io(), (zwb) ghtVar57.bd.io(), (abvk) ghtVar57.kB.io(), (abvn) ghtVar57.cH.io(), (tbt) ghtVar57.I.io(), (avlh) ghtVar57.gD.io(), ghtVar57.gZ(), (Executor) ghtVar57.B.io(), (ScheduledExecutorService) ghtVar57.z.io());
            case 1390:
                return ((awku) this.a.oz.io()).P();
            case 1391:
                return geh.u((abvn) this.a.cH.io());
            case 1392:
                ght ghtVar58 = this.a;
                return new rpw((Executor) ghtVar58.B.io(), aupm.b(ghtVar58.bd), (tbt) ghtVar58.I.io(), (SharedPreferences) ghtVar58.J.io(), ghtVar58.bC, (mbc) ghtVar58.l.io(), ghtVar58.ft);
            case 1393:
                ght ghtVar59 = this.a;
                pidVar = new hzt((acdq) ghtVar59.oh.io(), aupm.b(ghtVar59.Ah), 0);
                return pidVar;
            case 1394:
                ght ghtVar60 = this.a;
                return new hzt((acdq) ghtVar60.oh.io(), (acdo) ghtVar60.oZ.io(), 2);
            case 1395:
                ght ghtVar61 = this.a;
                pidVar = new hzt((acdq) ghtVar61.oh.io(), aupm.b(ghtVar61.Ah), 1);
                return pidVar;
            case 1396:
                ght ghtVar62 = this.a;
                return gly.p((hzt) ghtVar62.Aj.io(), (hzt) ghtVar62.Ak.io(), (hzt) ghtVar62.Al.io(), ghtVar62.r(), ghtVar62.q());
            case 1397:
                ght ghtVar63 = this.a;
                return aawb.al((Context) ghtVar63.v.io(), (acdq) ghtVar63.oh.io(), ghtVar63.gS(), (acdo) ghtVar63.oZ.io(), (abvn) ghtVar63.kp.io(), ghtVar63.aO(), (abrp) ghtVar63.Ap.io(), (mbc) ghtVar63.l.io(), ghtVar63.Ar, (List) ghtVar63.Am.io(), (abmt) ghtVar63.cT.io());
            case 1398:
                ght ghtVar64 = this.a;
                return new abrp(ghtVar64.An, (vxu) ghtVar64.at.io(), (abru) ghtVar64.Ao.io(), ghtVar64.pg, (abmt) ghtVar64.cT.io());
            case 1399:
                return new auy((Context) this.a.v.io());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object h() {
        Object abryVar;
        Object hghVar;
        Object intent;
        Object axfdVar;
        int i = this.b;
        int i2 = 4;
        int i3 = 9;
        int i4 = 8;
        switch (i) {
            case 1400:
                return new abru();
            case 1401:
                ght ghtVar = this.a;
                abryVar = new abry((xgn) ghtVar.kk.io(), (abvn) ghtVar.kp.io(), (avlh) ghtVar.Aq.io());
                return abryVar;
            case 1402:
                return new awkx().aI();
            case 1403:
                ght ghtVar2 = this.a;
                hghVar = new hgh(aupm.b(ghtVar2.mi), aupm.b(ghtVar2.pg), (avmb) ghtVar2.dA.io(), (ilx) ghtVar2.jI.io());
                return hghVar;
            case 1404:
                ght ghtVar3 = this.a;
                hghVar = new hgc(aupm.b(ghtVar3.ot), aupm.b(ghtVar3.pg), (avmb) ghtVar3.dA.io(), (ilx) ghtVar3.jI.io());
                return hghVar;
            case 1405:
                return new acgj();
            case 1406:
                ght ghtVar4 = this.a;
                axfdVar = new axfd((abjp) ghtVar4.mf.io(), (avlh) ghtVar4.Ag.io(), (avlh) ghtVar4.Aw.io(), (jnj) ghtVar4.mp.io(), (vxz) ghtVar4.km.io());
                return axfdVar;
            case 1407:
                return ((awku) this.a.nD.io()).P();
            case 1408:
                ght ghtVar5 = this.a;
                axfdVar = new qij((qeb) ghtVar5.vV.io(), ghtVar5.xf, ghtVar5.xg, ghtVar5.xh, ghtVar5.xi, aupm.b(ghtVar5.uC));
                return axfdVar;
            case 1409:
                axfdVar = new awku(Boolean.FALSE);
                return axfdVar;
            case 1410:
                intent = new Intent((Context) this.a.v.io(), (Class<?>) BackgroundPlayerService.class);
                return intent;
            case 1411:
                ght ghtVar6 = this.a;
                acal acalVar = new acal((ListenableFuture) ghtVar6.AA.io());
                ghtVar6.eA(acalVar);
                intent = acalVar;
                return intent;
            case 1412:
                ght ghtVar7 = this.a;
                Context context = (Context) ghtVar7.v.io();
                Executor executor = (Executor) ghtVar7.B.io();
                ahfo ahfoVar = new ahfo(new rru(context, 12));
                executor.execute(ahfoVar);
                axfdVar = ahfoVar;
                return axfdVar;
            case 1413:
                ght ghtVar8 = this.a;
                rqa rqaVar = (rqa) ghtVar8.zS.io();
                tbt tbtVar = (tbt) ghtVar8.I.io();
                zwb zwbVar = (zwb) ghtVar8.bd.io();
                tfq tfqVar = (tfq) ghtVar8.cd.io();
                axfdVar = new rlp(rqaVar, tbtVar, zwbVar, tfqVar, (rre) ghtVar8.bL.io(), (omj) ghtVar8.AD.io());
                return axfdVar;
            case 1414:
                return new gzj();
            case 1415:
                axfdVar = new omj((vxz) this.a.bM.io());
                return axfdVar;
            case 1416:
                axfdVar = new absl((tpq) this.a.AF.io());
                return axfdVar;
            case 1417:
                ght ghtVar9 = this.a;
                Context context2 = (Context) ghtVar9.v.io();
                aupr auprVar = ghtVar9.bh;
                aupr auprVar2 = ghtVar9.J;
                ahex ahexVar = (ahex) ghtVar9.u.io();
                rrq rrqVar = (rrq) auprVar.io();
                Pattern pattern = qpr.a;
                qpq qpqVar = new qpq(context2);
                qpqVar.c("player");
                qpqVar.d("playability_settings.pb");
                Uri uriA = qpqVar.a();
                tpr tprVar = new tpr(auprVar2, new idn(i4), new abhg(i3), new yns(i2), new wql(17), ahexVar);
                qrl qrlVarA = qrm.a();
                atpv atpvVar = atpv.a;
                qrlVarA.e(atpvVar);
                qrlVarA.f(uriA);
                qrlVarA.b(tprVar);
                axfdVar = new tpn(omj.U(rrqVar.c(qrlVarA.a())), atpvVar);
                return axfdVar;
            case 1418:
                ght ghtVar10 = this.a;
                axfdVar = new abpk((abmt) ghtVar10.cT.io(), (tqj) ghtVar10.q.io(), ghtVar10.eO);
                return axfdVar;
            case 1419:
                ght ghtVar11 = this.a;
                abryVar = new xsc(aupm.b(ghtVar11.dO), ghtVar11.gk(), (rtm) ghtVar11.AJ.io());
                return abryVar;
            case 1420:
                ght ghtVar12 = this.a;
                aupr auprVar3 = ghtVar12.dq;
                Executor executor2 = (Executor) ghtVar12.u.io();
                wuo wuoVar = (wuo) ghtVar12.lG.io();
                wup wupVar = (wup) ghtVar12.ls.io();
                axfdVar = new rtm(auprVar3, executor2, wuoVar, wupVar, (abmt) ghtVar12.cT.io());
                return axfdVar;
            case 1421:
                ght ghtVar13 = this.a;
                return new rmp();
            case 1422:
                ght ghtVar14 = this.a;
                axfdVar = new igf(ghtVar14.gQ, (zwb) ghtVar14.bd.io(), (ci) ghtVar14.bw.io());
                return axfdVar;
            case 1423:
                ght ghtVar15 = this.a;
                intent = new igh((hfn) ghtVar15.mQ.io(), (Executor) ghtVar15.z.io());
                return intent;
            case 1424:
                ght ghtVar16 = this.a;
                acfp acfpVar = new acfp(aupm.b(ghtVar16.iF), (wis) ghtVar16.hb.io(), (mbc) ghtVar16.l.io(), ghtVar16.bR(), (vxu) ghtVar16.at.io());
                avmm avmmVar = new avmm();
                if (abmt.cp(acfpVar.f)) {
                    avlh avlhVar = acfpVar.b;
                    int i5 = 6;
                    int i6 = 7;
                    avmmVar.c(avlhVar.p().W(new vvb(new abzr(i5), i6)).ak(new aceb(acfpVar, 5)));
                    avmmVar.c(avlhVar.p().W(new vvb(new abzr(i6), i4)).ak(new aceb(acfpVar, i5)));
                    avmmVar.c(avlhVar.p().W(new vvb(new abzr(i4), i4)).ak(new aceb(acfpVar, i6)));
                    avmmVar.c(avlhVar.p().W(new vvb(new abzr(i3), i4)).ak(new aawl(new aceb(acfpVar, i4), "PRC", 2)));
                    avmmVar.c(avlhVar.p().W(new vvb(new abzr(10), i4)).ak(new aawl(new aceb(acfpVar, i3), "PRC", 0)));
                }
                return acfpVar;
            case 1425:
                ght ghtVar17 = this.a;
                axfdVar = new aavk((vxz) ghtVar17.ca.io());
                return axfdVar;
            case 1426:
                ght ghtVar18 = this.a;
                axfdVar = new isi((tbt) ghtVar18.I.io(), ghtVar18.bU(), ghtVar18.ft(), ghtVar18.aQ(), ghtVar18.bS(), ghtVar18.bT(), (abmt) ghtVar18.cT.io(), (tqj) ghtVar18.q.io());
                return axfdVar;
            case 1427:
                return new rmp();
            case 1428:
                ght ghtVar19 = this.a;
                axfdVar = new isi(ghtVar19.iG, ghtVar19.l, ghtVar19.iD, (char[]) null, (byte[]) null);
                return axfdVar;
            case 1429:
                ght ghtVar20 = this.a;
                axfdVar = new aerj(ghtVar20.cx, ghtVar20.iR, ghtVar20.bd, ghtVar20.md, ghtVar20.sh, ghtVar20.z, ghtVar20.iL, (byte[]) null);
                return axfdVar;
            case 1430:
                return ((aesp) this.a.ot.io()).s();
            case 1431:
                ght ghtVar21 = this.a;
                return zik.aS((xit) ghtVar21.fa.io(), (abmt) ghtVar21.cT.io());
            case 1432:
                axfdVar = new achb(this.a.gB);
                return axfdVar;
            case 1433:
                ght ghtVar22 = this.a;
                return zik.aS((xit) ghtVar22.fa.io(), (abmt) ghtVar22.cT.io());
            case 1434:
                ght ghtVar23 = this.a;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar23.u.io();
                vxz vxzVar = (vxz) ghtVar23.ba.io();
                abryVar = new aczl(scheduledExecutorService, vxzVar, (tqj) ghtVar23.q.io());
                return abryVar;
            case 1435:
                return new yno((byte[]) null);
            case 1436:
                return new yno((char[]) null, (char[]) null);
            case 1437:
                axfdVar = new aerz(Optional.empty());
                return axfdVar;
            case 1438:
                ght ghtVar24 = this.a;
                axfdVar = new aavl((vxz) ghtVar24.ca.io());
                return axfdVar;
            case 1439:
                ght ghtVar25 = this.a;
                intent = new actv((hno) ghtVar25.jZ.io(), (acts) ghtVar25.Bc.io());
                return intent;
            case 1440:
                ght ghtVar26 = this.a;
                axfdVar = new acts((zvl) ghtVar26.dO.io(), (xeu) ghtVar26.aZ.io(), (ytv) ghtVar26.ia.io(), (abvn) ghtVar26.mW.io(), (aesp) ghtVar26.zT.io());
                return axfdVar;
            case 1441:
                ght ghtVar27 = this.a;
                axfdVar = new saf(ghtVar27.EL, ghtVar27.Dj);
                return axfdVar;
            case 1442:
                axfdVar = new gfx(this.a.EK);
                return axfdVar;
            case 1443:
                ght ghtVar28 = this.a;
                abryVar = new rwu(ghtVar28.Bg, ghtVar28.CM, ghtVar28.Co);
                return abryVar;
            case 1444:
                ght ghtVar29 = this.a;
                abryVar = new sbb((omj) ghtVar29.Be.io(), (rmp) ghtVar29.AI.io(), (oml) ghtVar29.Bf.io());
                return abryVar;
            case 1445:
                return new omj((char[]) null);
            case 1446:
                return new oml();
            case 1447:
                ght ghtVar30 = this.a;
                aupr auprVar4 = ghtVar30.gO;
                aupr auprVar5 = ghtVar30.Cd;
                aupr auprVar6 = ghtVar30.Ch;
                aupr auprVar7 = ghtVar30.Cj;
                aupr auprVar8 = ghtVar30.CS;
                aupr auprVar9 = ghtVar30.zW;
                aupr auprVar10 = ghtVar30.Cf;
                aupr auprVar11 = ghtVar30.CB;
                axfdVar = new rzz(auprVar4, auprVar5, ghtVar30.DV, auprVar6, auprVar7, auprVar8, auprVar9, auprVar10, auprVar11, ghtVar30.Df, (rmp) ghtVar30.AI.io(), (vyo) ghtVar30.av.io(), ghtVar30.aZ, ghtVar30.Bt, ghtVar30.DJ);
                return axfdVar;
            case 1448:
                axfdVar = new roq(this.a.Bh, (char[]) null);
                return axfdVar;
            case 1449:
                ght ghtVar31 = this.a;
                axfdVar = new rsk((srh) ghtVar31.EC.io(), ghtVar31.dz(), ghtVar31.dA(), ghtVar31.du(), ghtVar31.dv(), ghtVar31.dw(), ghtVar31.dy(), ghtVar31.dx(), ghtVar31.dp(), ghtVar31.dq(), (agke) ghtVar31.EI.io(), (agke) ghtVar31.EJ.io(), ghtVar31.ds(), (Context) ghtVar31.v.io(), (spv) ghtVar31.Bt.io(), (rmp) ghtVar31.AI.io(), (tld) ghtVar31.Bv.io(), (sae) ghtVar31.BZ.io(), ghtVar31.F, (tqj) ghtVar31.q.io(), (vyo) ghtVar31.av.io());
                return axfdVar;
            case 1450:
                ght ghtVar32 = this.a;
                axfdVar = new srh((tld) ghtVar32.CX.io(), (tld) ghtVar32.DO.io(), (rnj) ghtVar32.Ec.io(), (Map) ghtVar32.El.io(), (ryp) ghtVar32.Ev.io(), ghtVar32.fJ(), ghtVar32.I, (agkz) ghtVar32.EB.io(), (vyo) ghtVar32.av.io());
                return axfdVar;
            case 1451:
                ght ghtVar33 = this.a;
                axfdVar = new tld(ghtVar33.Bh, (agkj) ghtVar33.CW.io(), (char[]) null);
                return axfdVar;
            case 1452:
                ght ghtVar34 = this.a;
                return gzj.s(ghtVar34.CV, ghtVar34.Bg);
            case 1453:
                ght ghtVar35 = this.a;
                axfdVar = new sbd(ghtVar35.Bi, ghtVar35.I, ghtVar35.Bj, ghtVar35.av, (Executor) ghtVar35.B.io(), ghtVar35.CJ, ghtVar35.CU, (mbc) ghtVar35.l.io(), ghtVar35.Cl, (rmp) ghtVar35.AI.io(), ghtVar35.Co, ghtVar35.Cw, (Context) ghtVar35.v.io(), (abvn) ghtVar35.kp.io());
                return axfdVar;
            case 1454:
                return new acm();
            case 1455:
                axfdVar = new sbr(this.a.Bh);
                return axfdVar;
            case 1456:
                ght ghtVar36 = this.a;
                axfdVar = new sbj(ghtVar36.Bh, (sci) ghtVar36.Bl.io(), (rsr) ghtVar36.Co.io(), (vyo) ghtVar36.av.io(), ghtVar36.Bt);
                return axfdVar;
            case 1457:
                ght ghtVar37 = this.a;
                xgl xglVarFz = ghtVar37.fz();
                aupr auprVar12 = ghtVar37.Bk;
                abmt abmtVar = (abmt) ghtVar37.cT.io();
                return new sci(xglVarFz, auprVar12, abmtVar);
            case 1458:
                ght ghtVar38 = this.a;
                Context context3 = (Context) ghtVar38.v.io();
                awut awutVar = (awut) ghtVar38.bm.io();
                ghtVar38.fj();
                axfdVar = new aehn(context3, awutVar);
                return axfdVar;
            case 1459:
                ght ghtVar39 = this.a;
                rud rudVar = (rud) ghtVar39.BC.io();
                ryr ryrVar = (ryr) ghtVar39.BF.io();
                rys rysVar = (rys) ghtVar39.BH.io();
                rtm rtmVar = (rtm) ghtVar39.AJ.io();
                sbl sblVar = (sbl) ghtVar39.Cc.io();
                rzi rziVar = (rzi) ghtVar39.Cy.io();
                sbm sbmVar = (sbm) ghtVar39.CA.io();
                run runVar = (run) ghtVar39.CB.io();
                sbt sbtVar = (sbt) ghtVar39.CC.io();
                ruq ruqVar = (ruq) ghtVar39.BY.io();
                sbu sbuVar = (sbu) ghtVar39.CD.io();
                sbx sbxVar = (sbx) ghtVar39.CE.io();
                rza rzaVar = (rza) ghtVar39.BQ.io();
                rzc rzcVar = (rzc) ghtVar39.BS.io();
                rzb rzbVar = (rzb) ghtVar39.BR.io();
                sby sbyVar = (sby) ghtVar39.CF.io();
                sca scaVar = (sca) ghtVar39.CG.io();
                scc sccVar = (scc) ghtVar39.CH.io();
                scv scvVar = (scv) ghtVar39.CI.io();
                ruu ruuVar = (ruu) ghtVar39.Ck.io();
                sch schVar = (sch) ghtVar39.CK.io();
                sdb sdbVar = (sdb) ghtVar39.CL.io();
                rzz rzzVar = (rzz) ghtVar39.CM.io();
                rzv rzvVar = (rzv) ghtVar39.CN.io();
                rzu rzuVar = (rzu) ghtVar39.CO.io();
                rze rzeVar = (rze) ghtVar39.BW.io();
                rzn rznVarS = ghtVar39.S();
                sci sciVar = (sci) ghtVar39.Bl.io();
                sbp sbpVar = (sbp) ghtVar39.CT.io();
                avlh avlhVar2 = (avlh) ghtVar39.gB.io();
                avlh avlhVarBR = ghtVar39.bR();
                tun tunVar = (tun) ghtVar39.bc.io();
                abvn abvnVar = (abvn) ghtVar39.kp.io();
                vyo vyoVar = (vyo) ghtVar39.av.io();
                vxu vxuVar = (vxu) ghtVar39.at.io();
                abmt abmtVar2 = (abmt) ghtVar39.cT.io();
                axfdVar = new ruj(rudVar, ryrVar, rysVar, rtmVar, sblVar, rziVar, sbmVar, runVar, sbtVar, ruqVar, sbuVar, sbxVar, rzaVar, rzcVar, rzbVar, sbyVar, scaVar, sccVar, scvVar, ruuVar, schVar, sdbVar, rzzVar, rzvVar, rzuVar, rzeVar, rznVarS, sciVar, sbpVar, avlhVar2, avlhVarBR, tunVar, abvnVar, vyoVar, vxuVar, abmtVar2);
                return axfdVar;
            case 1460:
                axfdVar = new rud(this.a.gT());
                return axfdVar;
            case 1461:
                axfdVar = new ruk((oml) this.a.Bm.io());
                return axfdVar;
            case 1462:
                axfdVar = new oml(this.a.g());
                return axfdVar;
            case 1463:
                ght ghtVar40 = this.a;
                intent = new ofi((oml) ghtVar40.Bm.io(), ghtVar40.fx());
                return intent;
            case 1464:
                axfdVar = new ovo(this.a.at);
                return axfdVar;
            case 1465:
                ght ghtVar41 = this.a;
                aupr auprVar13 = ghtVar41.Bh;
                hghVar = new sbh(auprVar13, (tld) ghtVar41.Bv.io(), (sae) ghtVar41.BZ.io(), (spv) ghtVar41.Bt.io());
                return hghVar;
            case 1466:
                ght ghtVar42 = this.a;
                intent = new tld((Object) ghtVar42.Br, (Object) ghtVar42.Bu);
                return intent;
            case 1467:
                ght ghtVar43 = this.a;
                hghVar = new sny((zxj) ghtVar43.hY.io(), (zxj) ghtVar43.Bq.io(), (mbc) ghtVar43.l.io(), (ahey) ghtVar43.t.io());
                return hghVar;
            case 1468:
                return this.a.fw().b(agpr.a);
            case 1469:
                ght ghtVar44 = this.a;
                zwb zwbVar2 = (zwb) ghtVar44.bd.io();
                Executor executor3 = (Executor) ghtVar44.u.io();
                ahgb ahgbVarHf = ghtVar44.hf();
                spv spvVar = (spv) ghtVar44.Bt.io();
                axfdVar = new xte(zwbVar2, executor3, ahgbVarHf, spvVar, ghtVar44.ij, ghtVar44.av);
                return axfdVar;
            case 1470:
                return rmp.q((Context) this.a.v.io());
            case 1471:
                ght ghtVar45 = this.a;
                rsi rsiVar = (rsi) ghtVar45.dq.io();
                vyo vyoVar2 = (vyo) ghtVar45.av.io();
                mbc mbcVar = (mbc) ghtVar45.l.io();
                xeu xeuVar = (xeu) ghtVar45.aZ.io();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) ghtVar45.u.io();
                axfdVar = new spv(rsiVar, vyoVar2, mbcVar, xeuVar, scheduledExecutorService2, ghtVar45.gL(), (vxz) ghtVar45.ba.io(), ghtVar45.ge(), ghtVar45.Bh);
                return axfdVar;
            case 1472:
                ght ghtVar46 = this.a;
                ruq ruqVar2 = (ruq) ghtVar46.BY.io();
                Map map = (Map) ghtVar46.BX.io();
                vyo vyoVar3 = (vyo) ghtVar46.av.io();
                hghVar = new sad(ruqVar2, map, vyoVar3, (abmt) ghtVar46.cT.io());
                return hghVar;
            case 1473:
                ght ghtVar47 = this.a;
                aupr auprVar14 = ghtVar47.By;
                aupr auprVar15 = ghtVar47.BX;
                abmt abmtVar3 = (abmt) ghtVar47.cT.io();
                ghtVar47.eY();
                return new ruq(auprVar14, auprVar15, abmtVar3);
            case 1474:
                ght ghtVar48 = this.a;
                sgb sgbVar = (sgb) ghtVar48.Bw.io();
                sfx sfxVar = (sfx) ghtVar48.Bx.io();
                zzj zzjVar = new zzj(sgbVar);
                zzjVar.c(sfxVar);
                zzjVar.d(sfz.b);
                zzjVar.d(abze.b);
                intent = zzjVar;
                return intent;
            case 1475:
                ght ghtVar49 = this.a;
                axfdVar = new sgb((rsi) ghtVar49.dq.io(), (mbc) ghtVar49.l.io(), (tun) ghtVar49.bc.io(), (tfq) ghtVar49.cd.io(), ghtVar49.ha());
                return axfdVar;
            case 1476:
                axfdVar = new sfx((spr) this.a.dK.io());
                return axfdVar;
            case 1477:
                ght ghtVar50 = this.a;
                axfdVar = new ayq((rsi) ghtVar50.dq.io(), (mbc) ghtVar50.l.io(), (sel) ghtVar50.BA.io());
                return axfdVar;
            case 1478:
                ght ghtVar51 = this.a;
                Executor executor4 = (Executor) ghtVar51.z.io();
                Context context4 = (Context) ghtVar51.v.io();
                axfdVar = new sel(executor4, context4);
                return axfdVar;
            case 1479:
                return new taq();
            case 1480:
                return this.a.bx();
            case 1481:
                axfdVar = new ryw((rud) this.a.BC.io(), 1);
                return axfdVar;
            case 1482:
                return new ryq();
            case 1483:
                ght ghtVar52 = this.a;
                intent = new ryr((vyo) ghtVar52.av.io(), (abmt) ghtVar52.cT.io());
                return intent;
            case 1484:
                return new ryu(1);
            case 1485:
                return new rys();
            case 1486:
                return new ryv(1);
            case 1487:
                return new ryt();
            case 1488:
                return new ryu(0);
            case 1489:
                return new ryv(0);
            case 1490:
                return new ryv(2);
            case 1491:
                axfdVar = new ryw((rud) this.a.BC.io(), 0);
                return axfdVar;
            case 1492:
                return new ryv(3);
            case 1493:
                return new ryz();
            case 1494:
                return new rza();
            case 1495:
                return new rzb();
            case 1496:
                return new rzc();
            case 1497:
                return new rzd(1);
            case 1498:
                return new rzd(0);
            case 1499:
                return new ryv(4);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        Object sblVar;
        Object rziVar;
        Object aaokVar;
        Object sbtVar;
        int i = this.b;
        switch (i) {
            case 1500:
                return new rze();
            case 1501:
                ght ghtVar = this.a;
                sblVar = new sbl(ghtVar.Bh, (sci) ghtVar.Bl.io(), (vwt) ghtVar.Cb.io());
                return sblVar;
            case 1502:
                return new vwt((char[]) null, (byte[]) null, (byte[]) null);
            case 1503:
                ght ghtVar2 = this.a;
                rziVar = new rzi(ghtVar2.Cd, ghtVar2.Cf, ghtVar2.Cj, ghtVar2.av, ghtVar2.Ck, ghtVar2.Cl, ghtVar2.Cx, ghtVar2.Cu, (abmt) ghtVar2.cT.io(), (abfv) ghtVar2.Cv.io());
                return rziVar;
            case 1504:
                return new zdj(this.a.Ce);
            case 1505:
                return new tce((tbt) this.a.I.io(), (short[]) null);
            case 1506:
                ght ghtVar3 = this.a;
                aaokVar = new aaok((rsi) ghtVar3.dq.io(), (xsc) ghtVar3.Ch.io(), (nrj) ghtVar3.Ci.io(), (vyo) ghtVar3.av.io());
                return aaokVar;
            case 1507:
                ght ghtVar4 = this.a;
                return new xsc((rnj) ghtVar4.Cg.io());
            case 1508:
                return new rnj(this.a.aS);
            case 1509:
                return new nrj();
            case 1510:
                return new ruu();
            case 1511:
                ght ghtVar5 = this.a;
                aaokVar = new sdo((vyo) ghtVar5.av.io(), (Executor) ghtVar5.z.io(), (Executor) ghtVar5.B.io(), (acm) ghtVar5.Bi.io());
                return aaokVar;
            case 1512:
                ght ghtVar6 = this.a;
                return new rux((ahey) ghtVar6.T.io(), (rtl) ghtVar6.Ct.io(), (spn) ghtVar6.Cu.io(), (rsr) ghtVar6.Co.io(), (abfv) ghtVar6.Cv.io(), (aazw) ghtVar6.Cw.io(), (mbc) ghtVar6.l.io(), (rsi) ghtVar6.dq.io(), ghtVar6.Ck, (rmp) ghtVar6.AI.io());
            case 1513:
                ght ghtVar7 = this.a;
                return rmp.z(ghtVar7.lq, ghtVar7.Cm, ghtVar7.Cn, ghtVar7.Cq, Optional.of(ghtVar7.Cr), ghtVar7.hB, (achb) ghtVar7.AV.io(), (aaqf) ghtVar7.Cs.io(), ghtVar7.Ck, (vyo) ghtVar7.av.io(), (tbt) ghtVar7.I.io());
            case 1514:
                return new sqf(1);
            case 1515:
                return new sqf(0);
            case 1516:
                ght ghtVar8 = this.a;
                rziVar = new rsv((ruv) ghtVar8.Cp.io(), (vyo) ghtVar8.av.io());
                return rziVar;
            case 1517:
                ght ghtVar9 = this.a;
                rziVar = new ruv((rmp) ghtVar9.AI.io(), (rsr) ghtVar9.Co.io());
                return rziVar;
            case 1518:
                return acgz.h((abvn) this.a.mW.io());
            case 1519:
                ght ghtVar10 = this.a;
                return new aaqf((wlp) ghtVar10.kE.io(), (abxv) ghtVar10.gK.io(), (zwb) ghtVar10.bd.io(), (tgg) ghtVar10.zP.io(), (mbc) ghtVar10.l.io());
            case 1520:
                ght ghtVar11 = this.a;
                return new spm((ahey) ghtVar11.u.io(), (mbc) ghtVar11.l.io(), (xte) ghtVar11.Bu.io(), (ruq) ghtVar11.BY.io(), (sny) ghtVar11.Br.io());
            case 1521:
                return new abfv(this.a.de());
            case 1522:
                return gzj.e();
            case 1523:
                ght ghtVar12 = this.a;
                aupr auprVar = ghtVar12.Bh;
                aupr auprVar2 = ghtVar12.I;
                aupr auprVar3 = ghtVar12.Cz;
                aupr auprVar4 = ghtVar12.BC;
                return new sbm(auprVar, auprVar2, auprVar3, auprVar4, (sci) ghtVar12.Bl.io(), (vyo) ghtVar12.av.io(), (tun) ghtVar12.bc.io());
            case 1524:
                return new xsc((abmt) this.a.cT.io());
            case 1525:
                return new run((tbt) this.a.I.io());
            case 1526:
                ght ghtVar13 = this.a;
                aupr auprVar5 = ghtVar13.Bh;
                sbtVar = new sbt(auprVar5);
                return sbtVar;
            case 1527:
                ght ghtVar14 = this.a;
                rziVar = new sbu(ghtVar14.Bh, (sci) ghtVar14.Bl.io());
                return rziVar;
            case 1528:
                ght ghtVar15 = this.a;
                rziVar = new sbx(ghtVar15.Bh, (sci) ghtVar15.Bl.io());
                return rziVar;
            case 1529:
                ght ghtVar16 = this.a;
                rziVar = new sby(ghtVar16.Bh, (sci) ghtVar16.Bl.io());
                return rziVar;
            case 1530:
                ght ghtVar17 = this.a;
                aaokVar = new sca(ghtVar17.Bh, (tun) ghtVar17.bc.io(), ghtVar17.eu(), (ahey) ghtVar17.du.io());
                return aaokVar;
            case 1531:
                ght ghtVar18 = this.a;
                return new scc(ghtVar18.Bh, (sci) ghtVar18.Bl.io(), (tun) ghtVar18.bc.io(), ghtVar18.et(), ghtVar18.eu(), (vwt) ghtVar18.Cb.io(), (ahey) ghtVar18.du.io());
            case 1532:
                ght ghtVar19 = this.a;
                rziVar = new scv(ghtVar19.Bh, (rmp) ghtVar19.AI.io());
                return rziVar;
            case 1533:
                ght ghtVar20 = this.a;
                rziVar = new sch(ghtVar20.Bh, ghtVar20.CJ);
                return rziVar;
            case 1534:
                ght ghtVar21 = this.a;
                sblVar = new sdb(ghtVar21.Bh, (rmp) ghtVar21.AI.io(), ghtVar21.CJ);
                return sblVar;
            case 1535:
                ght ghtVar22 = this.a;
                aupr auprVar6 = ghtVar22.Cj;
                aupr auprVar7 = ghtVar22.Cd;
                return new rzv(auprVar6, auprVar7);
            case 1536:
                ght ghtVar23 = this.a;
                return new rzu(ghtVar23.Cj, ghtVar23.Cd, (rmp) ghtVar23.AI.io(), (vyo) ghtVar23.av.io(), (mbc) ghtVar23.l.io());
            case 1537:
                ght ghtVar24 = this.a;
                rnj rnjVar = (rnj) ghtVar24.Cg.io();
                return new aehs(rnjVar, ghtVar24.fX(), (xsc) ghtVar24.Ch.io(), ghtVar24.gL(), (rmp) ghtVar24.AI.io(), (nrj) ghtVar24.Ci.io(), (sdo) ghtVar24.CQ.io(), (vyo) ghtVar24.av.io(), (ayq) ghtVar24.CR.io());
            case 1538:
                return new sdk();
            case 1539:
                ght ghtVar25 = this.a;
                aaokVar = new sdo((mbc) ghtVar25.l.io(), (vyo) ghtVar25.av.io(), (wjr) ghtVar25.jC.io(), ghtVar25.gQ);
                return aaokVar;
            case 1540:
                ght ghtVar26 = this.a;
                vxz vxzVarEK = ghtVar26.eK();
                vxz vxzVarEZ = ghtVar26.eZ();
                ghtVar26.fh();
                sblVar = new ayq(vxzVarEK, vxzVarEZ, (vxz) ghtVar26.jQ.io());
                return sblVar;
            case 1541:
                ght ghtVar27 = this.a;
                aupr auprVar8 = ghtVar27.Bh;
                ahey aheyVar = (ahey) ghtVar27.du.io();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar27.t.io();
                sbtVar = new sbp(auprVar8, aheyVar, scheduledExecutorService);
                return sbtVar;
            case 1542:
                ght ghtVar28 = this.a;
                rziVar = new tld((abvk) ghtVar28.iF.io(), (vxz) ghtVar28.cM.io(), (short[]) null);
                return rziVar;
            case 1543:
                ght ghtVar29 = this.a;
                rziVar = new tld(ghtVar29.Bh, (agkj) ghtVar29.DN.io(), (char[]) null);
                return rziVar;
            case 1544:
                ght ghtVar30 = this.a;
                return gzj.r(ghtVar30.CY, ghtVar30.Dd, ghtVar30.Dr, ghtVar30.Dx, ghtVar30.Dy, ghtVar30.DK, ghtVar30.DM);
            case 1545:
                ght ghtVar31 = this.a;
                aaokVar = new rya(ghtVar31.Bh, (rmp) ghtVar31.AI.io(), (vyo) ghtVar31.av.io(), ghtVar31.et());
                return aaokVar;
            case 1546:
                ght ghtVar32 = this.a;
                return new rxz(ghtVar32.Bh, ghtVar32.Co, ghtVar32.Da, agev.i((wxh) ghtVar32.Db.io()), (tun) ghtVar32.bc.io(), (saq) ghtVar32.Dc.io(), (vyo) ghtVar32.av.io(), (ayq) ghtVar32.CR.io(), ghtVar32.et(), (rmp) ghtVar32.AI.io());
            case 1547:
                ght ghtVar33 = this.a;
                vxe vxeVar = (vxe) ghtVar33.CZ.io();
                sbtVar = new ruk(vxeVar);
                return sbtVar;
            case 1548:
                return new gun();
            case 1549:
                return new wxh((mbc) this.a.l.io());
            case 1550:
                return new sbv(this.a.Bh);
            case 1551:
                ght ghtVar34 = this.a;
                rsi rsiVar = (rsi) ghtVar34.dq.io();
                aupr auprVar9 = ghtVar34.Bh;
                aupr auprVar10 = ghtVar34.av;
                aupr auprVar11 = ghtVar34.at;
                aupr auprVar12 = ghtVar34.Co;
                aupr auprVar13 = ghtVar34.CU;
                rti rtiVarP = rmp.p();
                vwt vwtVar = (vwt) ghtVar34.Cb.io();
                abnc abncVarEt = ghtVar34.et();
                abvn abvnVar = (abvn) ghtVar34.kp.io();
                Executor executor = (Executor) ghtVar34.B.io();
                rmp rmpVar = (rmp) ghtVar34.AI.io();
                roq roqVar = (roq) ghtVar34.Dq.io();
                spv spvVar = (spv) ghtVar34.Bt.io();
                aupr auprVar14 = ghtVar34.Dl;
                aupr auprVar15 = ghtVar34.Dm;
                aupr auprVar16 = ghtVar34.Da;
                return new ryc(rsiVar, auprVar9, ghtVar34.Dc, ghtVar34.De, auprVar10, auprVar11, ghtVar34.Dj, ghtVar34.Df, auprVar12, auprVar13, auprVar14, auprVar15, auprVar16, ghtVar34.Dn, ghtVar34.Do, rtiVarP, vwtVar, abncVarEt, abvnVar, executor, rmpVar, roqVar, spvVar);
            case 1552:
                return new abuz(this.a.Bo);
            case 1553:
                ght ghtVar35 = this.a;
                return new spy((zzj) ghtVar35.By.io(), (dov) ghtVar35.Dg.io(), (vrn) ghtVar35.Dh.io(), (syn) ghtVar35.Di.io(), (abvn) ghtVar35.kp.io(), ghtVar35.bR());
            case 1554:
                return new dov((sgv) this.a.Df.io(), (byte[]) null);
            case 1555:
                return new sgv();
            case 1556:
                ght ghtVar36 = this.a;
                return new vrn(ghtVar36.et(), ghtVar36.ft(), (ruk) ghtVar36.Bn.io(), (ayq) ghtVar36.BB.io(), (zzj) ghtVar36.By.io(), (sgv) ghtVar36.Df.io(), (vxe) ghtVar36.CZ.io(), (vyo) ghtVar36.av.io(), ghtVar36.Ck, (abmt) ghtVar36.cT.io());
            case 1557:
                ght ghtVar37 = this.a;
                sny snyVar = (sny) ghtVar37.Br.io();
                zwb zwbVar = (zwb) ghtVar37.bd.io();
                Executor executor2 = (Executor) ghtVar37.u.io();
                zzj zzjVar = (zzj) ghtVar37.By.io();
                sbtVar = new syn(snyVar, zwbVar, executor2, zzjVar);
                return sbtVar;
            case 1558:
                ght ghtVar38 = this.a;
                aupr auprVar17 = ghtVar38.BT;
                aupr auprVar18 = ghtVar38.BU;
                tbt tbtVar = (tbt) ghtVar38.I.io();
                return new ruf(ghtVar38.De, ghtVar38.Da, auprVar17, auprVar18, ghtVar38.Dk, tbtVar, (vxz) ghtVar38.jQ.io(), (vyo) ghtVar38.av.io());
            case 1559:
                ght ghtVar39 = this.a;
                aupr auprVar19 = ghtVar39.Bh;
                sblVar = new scj(auprVar19, (vyo) ghtVar39.av.io(), (sci) ghtVar39.Bl.io());
                return sblVar;
            case 1560:
                return new rpi();
            case 1561:
                ght ghtVar40 = this.a;
                avlh avlhVar = (avlh) ghtVar40.gB.io();
                sbt sbtVar2 = (sbt) ghtVar40.CC.io();
                return new ruw(avlhVar, sbtVar2, (ryr) ghtVar40.BF.io(), ghtVar40.av, ghtVar40.Ck, (abmt) ghtVar40.cT.io());
            case 1562:
                ght ghtVar41 = this.a;
                return new rnj((byte[]) null);
            case 1563:
                return new ci((short[]) null, (char[]) null);
            case 1564:
                return new roq();
            case 1565:
                ght ghtVar42 = this.a;
                return new ryf(ghtVar42.Bh, ghtVar42.Df, ghtVar42.Co, ghtVar42.Dw, (Executor) ghtVar42.B.io(), (vyo) ghtVar42.av.io());
            case 1566:
                ght ghtVar43 = this.a;
                return new snv((Context) ghtVar43.v.io(), (acdw) ghtVar43.Dv.io(), (acdq) ghtVar43.Ds.io(), ghtVar43.bU(), (acdx) ghtVar43.Dt.io(), (abmt) ghtVar43.cT.io());
            case 1567:
                ght ghtVar44 = this.a;
                Context context = (Context) ghtVar44.v.io();
                aupr auprVar20 = ghtVar44.cT;
                return rsb.e(context, ghtVar44.Ds, ghtVar44.Dt, ghtVar44.rB, (abmt) auprVar20.io(), (Executor) ghtVar44.u.io(), (Executor) ghtVar44.B.io(), (acdw) ghtVar44.Du.io());
            case 1568:
                ght ghtVar45 = this.a;
                return rsb.d((acdq) ghtVar45.oh.io(), (abmt) ghtVar45.cT.io());
            case 1569:
                return zik.cG((ci) this.a.cG.io());
            case 1570:
                ght ghtVar46 = this.a;
                Context context2 = (Context) ghtVar46.v.io();
                aupr auprVar21 = ghtVar46.cT;
                return new acdw(context2, ghtVar46.oh, ghtVar46.Dt, ghtVar46.rB, (abmt) auprVar21.io(), (Executor) ghtVar46.u.io(), (Executor) ghtVar46.B.io());
            case 1571:
                ght ghtVar47 = this.a;
                aaokVar = new ryb(ghtVar47.Bh, ghtVar47.Dc, ghtVar47.Dj, ghtVar47.av);
                return aaokVar;
            case 1572:
                ght ghtVar48 = this.a;
                aupr auprVar22 = ghtVar48.av;
                aupr auprVar23 = ghtVar48.at;
                aupr auprVar24 = ghtVar48.Co;
                aupr auprVar25 = ghtVar48.Bi;
                aupr auprVar26 = ghtVar48.Bh;
                aupr auprVar27 = ghtVar48.I;
                Executor executor3 = (Executor) ghtVar48.z.io();
                Executor executor4 = (Executor) ghtVar48.B.io();
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ghtVar48.DC.io();
                rmp rmpVar2 = (rmp) ghtVar48.AI.io();
                aupr auprVar28 = ghtVar48.Cl;
                aupr auprVar29 = ghtVar48.CB;
                aupr auprVar30 = ghtVar48.DD;
                aupr auprVar31 = ghtVar48.Dz;
                aupr auprVar32 = ghtVar48.Dc;
                aupr auprVar33 = ghtVar48.cT;
                aupr auprVar34 = ghtVar48.Ck;
                aupr auprVar35 = ghtVar48.Bt;
                aupr auprVar36 = ghtVar48.Dl;
                return new ryg(auprVar22, auprVar23, ghtVar48.Da, auprVar24, auprVar25, auprVar31, ghtVar48.Dn, ghtVar48.DA, auprVar26, auprVar26, auprVar32, ghtVar48.DB, ghtVar48.Dj, auprVar27, executor3, executor4, copyOnWriteArrayList, rmpVar2, auprVar28, auprVar29, auprVar30, auprVar33, auprVar34, auprVar35, auprVar36, ghtVar48.DJ, ghtVar48.kp);
            case 1573:
                return new rus(this.a.lv);
            case 1574:
                ght ghtVar49 = this.a;
                rziVar = new tld(ghtVar49.lq, (mbc) ghtVar49.l.io(), (char[]) null);
                return rziVar;
            case 1575:
                ght ghtVar50 = this.a;
                aupr auprVar37 = ghtVar50.Bh;
                sblVar = new sce(auprVar37, ghtVar50.Dj, (sci) ghtVar50.Bl.io());
                return sblVar;
            case 1576:
                return new CopyOnWriteArrayList();
            case 1577:
                return new tce((tbt) this.a.I.io());
            case 1578:
                ght ghtVar51 = this.a;
                aaokVar = new rug(ghtVar51.DH, (abzo) ghtVar51.DI.io(), ghtVar51.Co, (vyo) ghtVar51.av.io());
                return aaokVar;
            case 1579:
                ght ghtVar52 = this.a;
                return new abii(ghtVar52.DE, ghtVar52.iF, (avlh) ghtVar52.gB.io(), ghtVar52.bR(), (zvl) ghtVar52.dO.io(), (Executor) ghtVar52.B.io(), ghtVar52.DF, ghtVar52.DG);
            case 1580:
                return new xsc((avlh) this.a.gB.io());
            case 1581:
                return xwg.v((ci) this.a.cG.io());
            case 1582:
                return zik.cH((ci) this.a.cG.io());
            case 1583:
                ght ghtVar53 = this.a;
                return new abzo((Context) ghtVar53.v.io(), ghtVar53.Cl, ghtVar53.Bi, ghtVar53.Co, ghtVar53.Cz, ghtVar53.Dl, (vyo) ghtVar53.av.io(), (vxu) ghtVar53.at.io(), (rmp) ghtVar53.AI.io(), (Executor) ghtVar53.B.io());
            case 1584:
                ght ghtVar54 = this.a;
                rziVar = new rxy(ghtVar54.Bh, ghtVar54.DL);
                return rziVar;
            case 1585:
                ght ghtVar55 = this.a;
                return new xte(ghtVar55.Cj, ghtVar55.Cd, ghtVar55.CO, ghtVar55.Cg, (vyo) ghtVar55.av.io(), ghtVar55.Ck);
            case 1586:
                return new rnj((agkj) this.a.Eb.io());
            case 1587:
                ght ghtVar56 = this.a;
                return gzj.q(ghtVar56.DP, ghtVar56.DQ, ghtVar56.DR, ghtVar56.DS, ghtVar56.DT, ghtVar56.DX, ghtVar56.Ea);
            case 1588:
                ght ghtVar57 = this.a;
                return new rwn(ghtVar57.Bh, ghtVar57.CS, (Executor) ghtVar57.u.io(), (Executor) ghtVar57.B.io(), (rmp) ghtVar57.AI.io(), (ayq) ghtVar57.CR.io(), (abmt) ghtVar57.cT.io(), 1);
            case 1589:
                ght ghtVar58 = this.a;
                return new rwn(ghtVar58.Bh, ghtVar58.CS, (vyo) ghtVar58.av.io(), (ayq) ghtVar58.CR.io(), (Executor) ghtVar58.u.io(), (Executor) ghtVar58.B.io(), (abmt) ghtVar58.cT.io(), 0);
            case 1590:
                ght ghtVar59 = this.a;
                aupr auprVar38 = ghtVar59.Bh;
                rnj rnjVar2 = (rnj) ghtVar59.Cg.io();
                return new rwo(auprVar38, rnjVar2, ghtVar59.CS, (mbc) ghtVar59.l.io(), (ayq) ghtVar59.CR.io());
            case 1591:
                ght ghtVar60 = this.a;
                aaokVar = new rwr(ghtVar60.Bh, ghtVar60.CS, (ayq) ghtVar60.CR.io(), 1);
                return aaokVar;
            case 1592:
                ght ghtVar61 = this.a;
                aaokVar = new rwr(ghtVar61.Bh, ghtVar61.CS, (ayq) ghtVar61.CR.io(), 0);
                return aaokVar;
            case 1593:
                ght ghtVar62 = this.a;
                return new rws(ghtVar62.dq, ghtVar62.Ct, ghtVar62.Cw, ghtVar62.Bh, ghtVar62.CS, ghtVar62.DV, ghtVar62.CC, ghtVar62.DW, ghtVar62.CN, ghtVar62.DL, ghtVar62.Cl, (mbc) ghtVar62.l.io(), ghtVar62.Cg, (ayq) ghtVar62.CR.io(), (Executor) ghtVar62.B.io(), (Executor) ghtVar62.aC.io(), (rmp) ghtVar62.AI.io());
            case 1594:
                ght ghtVar63 = this.a;
                mbc mbcVar = (mbc) ghtVar63.l.io();
                rnj rnjVar3 = (rnj) ghtVar63.Cg.io();
                rnj rnjVar4 = (rnj) ghtVar63.DU.io();
                aupr auprVar39 = ghtVar63.gQ;
                return new sdm(mbcVar, rnjVar3, rnjVar4, auprVar39, (vyo) ghtVar63.av.io());
            case 1595:
                return new rnj((wjr) this.a.jC.io());
            case 1596:
                ght ghtVar64 = this.a;
                return new tld((Object) ghtVar64.Cd, (Object) ghtVar64.Cj);
            case 1597:
                ght ghtVar65 = this.a;
                return new rwm(ghtVar65.dq, ghtVar65.Ct, ghtVar65.Cl, ghtVar65.Cw, ghtVar65.Bh, ghtVar65.CS, (mbc) ghtVar65.l.io(), ghtVar65.DY, ghtVar65.DZ, ghtVar65.av, ghtVar65.Cv, (Executor) ghtVar65.B.io(), (Executor) ghtVar65.aC.io(), (rmp) ghtVar65.AI.io(), (ayq) ghtVar65.CR.io());
            case 1598:
                ght ghtVar66 = this.a;
                rsk rskVar = (rsk) ghtVar66.Bh.io();
                spv spvVar2 = (spv) ghtVar66.Bt.io();
                sblVar = new sac(rskVar, ghtVar66.Da, spvVar2, null);
                return sblVar;
            case 1599:
                return new atzn((mbc) this.a.l.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        Object sbnVar;
        Object sbwVar;
        Object sbsVar;
        Object scqVar;
        int i = this.b;
        switch (i) {
            case 1600:
                ght ghtVar = this.a;
                return gzj.t(ghtVar.CJ, ghtVar.Ca, ghtVar.CA, ghtVar.Ed, ghtVar.Ef, ghtVar.Eg, ghtVar.CE, ghtVar.CF, ghtVar.CG, ghtVar.CH, ghtVar.Cc, ghtVar.CK, ghtVar.Bj, ghtVar.CC, ghtVar.CD, ghtVar.Dc, ghtVar.DB, ghtVar.Ei, ghtVar.Dk, ghtVar.Ej, ghtVar.CT, ghtVar.Ek);
            case 1601:
                ght ghtVar2 = this.a;
                aupr auprVar = ghtVar2.Bh;
                ahey aheyVar = (ahey) ghtVar2.du.io();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ghtVar2.t.io();
                sbnVar = new sbn(auprVar, aheyVar, scheduledExecutorService);
                return sbnVar;
            case 1602:
                return new sbq(this.a.Ee);
            case 1603:
                return new rul();
            case 1604:
                ght ghtVar3 = this.a;
                sbwVar = new sbw(ghtVar3.Bh, (rsr) ghtVar3.Co.io());
                return sbwVar;
            case 1605:
                return new scf(this.a.Eh);
            case 1606:
                return new ovo((rmp) this.a.AI.io());
            case 1607:
                ght ghtVar4 = this.a;
                aupr auprVar2 = ghtVar4.Bh;
                ahey aheyVar2 = (ahey) ghtVar4.du.io();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) ghtVar4.t.io();
                sbsVar = new sbs(auprVar2, aheyVar2, scheduledExecutorService2, (vyo) ghtVar4.av.io());
                return sbsVar;
            case 1608:
                return new sbg(this.a.Bf);
            case 1609:
                ght ghtVar5 = this.a;
                aupr auprVar3 = ghtVar5.Bh;
                Executor executor = (Executor) ghtVar5.B.io();
                spv spvVar = (spv) ghtVar5.Bt.io();
                aupr auprVar4 = ghtVar5.CU;
                mbc mbcVar = (mbc) ghtVar5.l.io();
                aupr auprVar5 = ghtVar5.av;
                aupr auprVar6 = ghtVar5.du;
                rsz rszVarO = rmp.o();
                rmp rmpVar = (rmp) ghtVar5.AI.io();
                abnc abncVarEt = ghtVar5.et();
                aupr auprVar7 = ghtVar5.Cz;
                aupr auprVar8 = ghtVar5.Co;
                tun tunVar = (tun) ghtVar5.bc.io();
                return new ryp(auprVar3, ghtVar5.Em, ghtVar5.En, executor, spvVar, auprVar4, ghtVar5.Er, mbcVar, auprVar5, auprVar6, rszVarO, rmpVar, abncVarEt, auprVar7, auprVar8, ghtVar5.Da, ghtVar5.Et, tunVar, ghtVar5.Cp, ghtVar5.Ct, ghtVar5.DY);
            case 1610:
                return new rmp();
            case 1611:
                return new auor((byte[]) null, (byte[]) null);
            case 1612:
                ght ghtVar6 = this.a;
                return new aawb((byte[]) null, (byte[]) null, (byte[]) null);
            case 1613:
                ght ghtVar7 = this.a;
                return new acma((vyo) ghtVar7.av.io());
            case 1614:
                ght ghtVar8 = this.a;
                mbc mbcVar2 = (mbc) ghtVar8.l.io();
                sbwVar = new acmb(mbcVar2, (vyo) ghtVar8.av.io());
                return sbwVar;
            case 1615:
                ght ghtVar9 = this.a;
                sbwVar = new scu(ghtVar9.Bh, (rmp) ghtVar9.AI.io());
                return sbwVar;
            case 1616:
                return new aavv(null, null);
            case 1617:
                return new nrk();
            case 1618:
                ght ghtVar10 = this.a;
                return new nrk();
            case 1619:
                return Optional.of((wxh) this.a.Db.io());
            case 1620:
                ght ghtVar11 = this.a;
                aupr auprVar9 = ghtVar11.CP;
                aupr auprVar10 = ghtVar11.BY;
                aupr auprVar11 = ghtVar11.Co;
                rmp rmpVar2 = (rmp) ghtVar11.AI.io();
                ghtVar11.eY();
                return new nrd(ghtVar11.Eu, auprVar9, auprVar10, auprVar11, rmpVar2);
            case 1621:
                return new nrl();
            case 1622:
                ght ghtVar12 = this.a;
                scqVar = new scq(ghtVar12.Bh, (rmp) ghtVar12.AI.io(), (ahey) ghtVar12.du.io());
                return scqVar;
            case 1623:
                ght ghtVar13 = this.a;
                sbsVar = new scx(ghtVar13.Bh, (auor) ghtVar13.En.io(), (rmp) ghtVar13.AI.io(), ghtVar13.eY());
                return sbsVar;
            case 1624:
                ght ghtVar14 = this.a;
                return new sct(ghtVar14.Bh, (rmp) ghtVar14.AI.io(), ghtVar14.I, (rsr) ghtVar14.Co.io(), ghtVar14.Cz, (vyo) ghtVar14.av.io());
            case 1625:
                ght ghtVar15 = this.a;
                scqVar = new scl(ghtVar15.Bh, (rtb) ghtVar15.Ee.io(), (rmp) ghtVar15.AI.io());
                return scqVar;
            case 1626:
                ght ghtVar16 = this.a;
                scqVar = new scz(ghtVar16.Bh, (ovo) ghtVar16.Eh.io(), (rmp) ghtVar16.AI.io());
                return scqVar;
            case 1627:
                return geg.f();
            case 1628:
                ght ghtVar17 = this.a;
                return rsb.c(ghtVar17.dg(), ghtVar17.dn());
            case 1629:
                ght ghtVar18 = this.a;
                return new gfz(ghtVar18.Cd, ghtVar18.Cj, (rtm) ghtVar18.AJ.io(), ghtVar18.DB, (agkz) ghtVar18.EB.io(), (vyo) ghtVar18.av.io());
            case 1630:
                ght ghtVar19 = this.a;
                aupr auprVar12 = ghtVar19.Cd;
                rtm rtmVar = (rtm) ghtVar19.AJ.io();
                aupr auprVar13 = ghtVar19.Cj;
                aupr auprVar14 = ghtVar19.CS;
                agkz agkzVar = (agkz) ghtVar19.EB.io();
                vyo vyoVar = (vyo) ghtVar19.av.io();
                vxu vxuVar = (vxu) ghtVar19.at.io();
                Executor executor2 = (Executor) ghtVar19.B.io();
                return new rzs(auprVar12, rtmVar, ghtVar19.DB, auprVar13, auprVar14, agkzVar, vyoVar, vxuVar, ghtVar19.EE, ghtVar19.EF, executor2);
            case 1631:
                ght ghtVar20 = this.a;
                sbsVar = new sdo(ghtVar20.Cj, ghtVar20.Cd, ghtVar20.CJ, (Executor) ghtVar20.B.io());
                return sbsVar;
            case 1632:
                ght ghtVar21 = this.a;
                sbsVar = new sac((rsk) ghtVar21.Bh.io(), ghtVar21.Da, (spv) ghtVar21.Bt.io(), (rmp) ghtVar21.AI.io());
                return sbsVar;
            case 1633:
                ght ghtVar22 = this.a;
                scqVar = new rzj(ghtVar22.Cd, ghtVar22.Cj, (agkz) ghtVar22.EB.io());
                return scqVar;
            case 1634:
                ght ghtVar23 = this.a;
                return rsb.b(ghtVar23.dh(), ghtVar23.m804do());
            case 1635:
                return new acfj();
            case 1636:
                ght ghtVar24 = this.a;
                sbsVar = new abag(ghtVar24.es, ghtVar24.bd, ghtVar24.EO, ghtVar24.jM);
                return sbsVar;
            case 1637:
                ght ghtVar25 = this.a;
                vxu vxuVar2 = (vxu) ghtVar25.at.io();
                vyo vyoVar2 = (vyo) ghtVar25.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "LithiumShared");
            case 1638:
                ght ghtVar26 = this.a;
                sbwVar = new ablr((abmt) ghtVar26.cT.io(), (ahbw) ghtVar26.cx.io());
                return sbwVar;
            case 1639:
                ght ghtVar27 = this.a;
                wbz wbzVar = (wbz) ghtVar27.es.io();
                zwb zwbVar = (zwb) ghtVar27.bd.io();
                sbnVar = new abfo(wbzVar, zwbVar);
                return sbnVar;
            case 1640:
                return new avbs(false, 1, (acer) this.a.ET.io(), 4);
            case 1641:
                return aawb.ah();
            case 1642:
                ght ghtVar28 = this.a;
                return gly.r((Context) ghtVar28.v.io(), (rrq) ghtVar28.bh.io());
            case 1643:
                return new aerz((adxj) this.a.Ad.io());
            case 1644:
                ght ghtVar29 = this.a;
                return new igk((avmb) ghtVar29.dE.io(), (avmb) ghtVar29.dA.io(), ghtVar29.kB, (abvc) ghtVar29.kC.io(), (hfn) ghtVar29.ow.io(), (ahbw) ghtVar29.cx.io(), (ycp) ghtVar29.kx.io(), (vxz) ghtVar29.km.io());
            case 1645:
                ght ghtVar30 = this.a;
                return new hgs((Context) ghtVar30.v.io(), (mbc) ghtVar30.l.io(), ghtVar30.zY, ghtVar30.kB, aupm.b(ghtVar30.FK), aupm.b(ghtVar30.FL), aupm.b(ghtVar30.Ga), aupm.b(ghtVar30.FD), aupm.b(ghtVar30.cy), aupm.b(ghtVar30.ou), aupm.b(ghtVar30.kk), aupm.b(ghtVar30.kt), aupm.b(ghtVar30.oh), aupm.b(ghtVar30.zZ), aupm.b(ghtVar30.pg), aupm.b(ghtVar30.At), aupm.b(ghtVar30.Au), aupm.b(ghtVar30.zX), aupm.b(ghtVar30.bd), aupm.b(ghtVar30.cs), aupm.b(ghtVar30.cw), aupm.b(ghtVar30.fa), aupm.b(ghtVar30.dA), aupm.b(ghtVar30.z), aupm.b(ghtVar30.cv), aupm.b(ghtVar30.cu), (hix) ghtVar30.Gb.io());
            case 1646:
                ght ghtVar31 = this.a;
                Context context = (Context) ghtVar31.v.io();
                aunn aunnVarB = aupm.b(ghtVar31.FD);
                abnc abncVarAK = ghtVar31.aK();
                aunn aunnVarB2 = aupm.b(ghtVar31.Ah);
                aupr auprVar15 = ghtVar31.kB;
                aupr auprVar16 = ghtVar31.kC;
                abvn abvnVar = (abvn) ghtVar31.cH.io();
                aunn aunnVarB3 = aupm.b(ghtVar31.Ae);
                Optional optionalOf = Optional.of((abvn) ghtVar31.mW.io());
                Optional optionalOf2 = Optional.of(aupm.b(ghtVar31.FE));
                aupr auprVar17 = ghtVar31.mf;
                aupr auprVar18 = ghtVar31.kx;
                jnm jnmVar = (jnm) ghtVar31.cF.io();
                hxd hxdVar = (hxd) ghtVar31.ov.io();
                xit xitVar = (xit) ghtVar31.fa.io();
                wqm wqmVar = (wqm) ghtVar31.Fa.io();
                hfy hfyVar = (hfy) ghtVar31.cy.io();
                tfq tfqVar = (tfq) ghtVar31.cd.io();
                hfn hfnVar = (hfn) ghtVar31.Fu.io();
                hwz hwzVarFL = ghtVar31.fL();
                zwb zwbVar2 = (zwb) ghtVar31.bd.io();
                hwv hwvVar = (hwv) ghtVar31.nW.io();
                aunn aunnVarB4 = aupm.b(ghtVar31.op);
                aunn aunnVarB5 = aupm.b(ghtVar31.FJ);
                aunn aunnVarB6 = aupm.b(ghtVar31.nE);
                ilx ilxVar = (ilx) ghtVar31.jI.io();
                acdq acdqVar = (acdq) ghtVar31.oh.io();
                tbt tbtVar = (tbt) ghtVar31.I.io();
                Handler handler = (Handler) ghtVar31.cY.io();
                Executor executor3 = (Executor) ghtVar31.B.io();
                avmb avmbVar = (avmb) ghtVar31.dA.io();
                Executor executor4 = (Executor) ghtVar31.z.io();
                vxz vxzVar = (vxz) ghtVar31.cu.io();
                return new hgy(context, aunnVarB, abncVarAK, aunnVarB2, auprVar15, auprVar16, abvnVar, aunnVarB3, optionalOf, optionalOf2, auprVar17, auprVar18, ghtVar31.FH, jnmVar, hxdVar, xitVar, wqmVar, hfyVar, tfqVar, hfnVar, hwzVarFL, zwbVar2, hwvVar, aunnVarB4, aunnVarB5, aunnVarB6, ilxVar, acdqVar, tbtVar, handler, executor3, avmbVar, executor4, vxzVar, (vxz) ghtVar31.cM.io());
            case 1647:
                ght ghtVar32 = this.a;
                return new hhr((qcb) ghtVar32.Fk.io(), aupm.b(ghtVar32.Ff), aupm.b(ghtVar32.Fd), aupm.b(ghtVar32.Fo), aupm.b(ghtVar32.FC), aupm.b(ghtVar32.FB), aupm.b(ghtVar32.Fe), aupm.b(ghtVar32.zZ), aupm.b(ghtVar32.cw), aupm.b(ghtVar32.cy), aupm.b(ghtVar32.cd), aupm.b(ghtVar32.ou), ghtVar32.gD, (vxz) ghtVar32.cv.io(), aupm.b(ghtVar32.mx), (Executor) ghtVar32.u.io(), (Executor) ghtVar32.z.io(), aupm.b(ghtVar32.dA));
            case 1648:
                return new qcb(this);
            case 1649:
                ght ghtVar33 = this.a;
                return new wqm((wlp) ghtVar33.kE.io(), (abxv) ghtVar33.gK.io(), (zwb) ghtVar33.bd.io(), (tgg) ghtVar33.EZ.io(), null);
            case 1650:
                ght ghtVar34 = this.a;
                return vql.j((tqj) ghtVar34.q.io(), aupm.b(ghtVar34.mq), aupm.b(ghtVar34.mr));
            case 1651:
                ght ghtVar35 = this.a;
                return new hie((Context) ghtVar35.v.io(), (mbc) ghtVar35.l.io(), aupm.b(ghtVar35.iR), aupm.b(ghtVar35.Fb), aupm.b(ghtVar35.Fc), aupm.b(ghtVar35.Fd), aupm.b(ghtVar35.Fe), aupm.b(ghtVar35.md), aupm.b(ghtVar35.mL), aupm.b(ghtVar35.mK), (Executor) ghtVar35.z.io(), aupm.b(ghtVar35.dE), (Executor) ghtVar35.u.io(), aupm.b(ghtVar35.dC));
            case 1652:
                ght ghtVar36 = this.a;
                Context context2 = (Context) ghtVar36.v.io();
                hps hpsVar = (hps) ghtVar36.md.io();
                hpb hpbVar = (hpb) ghtVar36.mC.io();
                return new jgc(context2, hpsVar, hpbVar, (Executor) ghtVar36.u.io(), (Executor) ghtVar36.z.io(), (hbf) ghtVar36.cz.io(), (vxz) ghtVar36.et.io(), (rmw) ghtVar36.bd.io());
            case 1653:
                ght ghtVar37 = this.a;
                scqVar = new isr((Context) ghtVar37.v.io(), (iup) ghtVar37.mP.io(), (Executor) ghtVar37.u.io());
                return scqVar;
            case 1654:
                ght ghtVar38 = this.a;
                Context context3 = (Context) ghtVar38.v.io();
                aunn aunnVarB7 = aupm.b(ghtVar38.cD);
                aunn aunnVarB8 = aupm.b(ghtVar38.md);
                aunn aunnVarB9 = aupm.b(ghtVar38.mP);
                aunn aunnVarB10 = aupm.b(ghtVar38.iR);
                aunn aunnVarB11 = aupm.b(ghtVar38.zZ);
                aunn aunnVarB12 = aupm.b(ghtVar38.cF);
                Executor executor5 = (Executor) ghtVar38.z.io();
                Executor executor6 = (Executor) ghtVar38.u.io();
                aunn aunnVarB13 = aupm.b(ghtVar38.Ad);
                return new hin(context3, aunnVarB7, aunnVarB8, aunnVarB9, aunnVarB10, aunnVarB11, aunnVarB12, executor5, executor6, aunnVarB13, (vxz) ghtVar38.cv.io());
            case 1655:
                return new isw();
            case 1656:
                return new xsc(aupm.b(this.a.fa));
            case 1657:
                ght ghtVar39 = this.a;
                return new hht(aupm.b(ghtVar39.Fh), aupm.b(ghtVar39.aZ));
            case 1658:
                return gzj.g(this.a.an());
            case 1659:
                aupr auprVar19 = this.a.A;
                return new elq(aupm.b(auprVar19), aupm.b(auprVar19));
            case 1660:
                ght ghtVar40 = this.a;
                return new hir(ghtVar40.o(), aupm.b(ghtVar40.Fn), aupm.b(ghtVar40.zZ), (Handler) ghtVar40.cY.io(), aupm.b(ghtVar40.cv));
            case 1661:
                ght ghtVar41 = this.a;
                scqVar = new hja((Executor) ghtVar41.u.io(), (qrx) ghtVar41.Fl.io(), (zwb) ghtVar41.bd.io());
                return scqVar;
            case 1662:
                ght ghtVar42 = this.a;
                return geg.p((Context) ghtVar42.v.io(), (rrq) ghtVar42.bh.io());
            case 1663:
                ght ghtVar43 = this.a;
                return new hip(ghtVar43.v, ghtVar43.l, aups.b(ghtVar43.Fd), aups.b(ghtVar43.Fb), aups.b(ghtVar43.Fi), aups.b(ghtVar43.Fm), aups.b(ghtVar43.Fe), aups.b(ghtVar43.cv), null);
            case 1664:
                ght ghtVar44 = this.a;
                return new hiv(aupm.b(ghtVar44.v), aupm.b(ghtVar44.Fo), aupm.b(ghtVar44.Fa), aupm.b(ghtVar44.Fq), aupm.b(ghtVar44.cy), aupm.b(ghtVar44.ou), aupm.b(ghtVar44.Fd), aupm.b(ghtVar44.Fe), aupm.b(ghtVar44.Fr), aupm.b(ghtVar44.Fs), aupm.b(ghtVar44.cF), aupm.b(ghtVar44.cE), aupm.b(ghtVar44.bd), ghtVar44.cY, aupm.b(ghtVar44.zZ), aupm.b(ghtVar44.FB), aupm.b(ghtVar44.Fm), aupm.b(ghtVar44.z), aupm.b(ghtVar44.u), aupm.b(ghtVar44.cv));
            case 1665:
                ght ghtVar45 = this.a;
                sbsVar = new kwq((wqm) ghtVar45.Fa.io(), (her) ghtVar45.Fp.io(), (hdr) ghtVar45.qa.io(), (Executor) ghtVar45.u.io());
                return sbsVar;
            case 1666:
                ght ghtVar46 = this.a;
                return new her((zwb) ghtVar46.bd.io(), (tmo) ghtVar46.pU.io(), (mbc) ghtVar46.l.io(), (Executor) ghtVar46.u.io(), ghtVar46.ac(), (wjr) ghtVar46.jC.io(), (vxz) ghtVar46.aL.io());
            case 1667:
                return new grj((byte[]) null, (byte[]) null);
            case 1668:
                return new awkx();
            case 1669:
                ght ghtVar47 = this.a;
                return new hia((Context) ghtVar47.v.io(), aupm.b(ghtVar47.Fo), aupm.b(ghtVar47.cy), aupm.b(ghtVar47.Fd), aupm.b(ghtVar47.Fb), aupm.b(ghtVar47.Fc), aupm.b(ghtVar47.Fu), aupm.b(ghtVar47.iR), aupm.b(ghtVar47.Fe), (avlh) ghtVar47.Fv.io(), aupm.b(ghtVar47.ou), aupm.b(ghtVar47.Fw), aupm.b(ghtVar47.md), aupm.b(ghtVar47.FA), aupm.b(ghtVar47.dA), aupm.b(ghtVar47.dE), (Executor) ghtVar47.z.io(), (Executor) ghtVar47.u.io(), aupm.b(ghtVar47.Ad), (vxz) ghtVar47.cu.io(), (vxz) ghtVar47.cv.io());
            case 1670:
                ght ghtVar48 = this.a;
                return new hfn((hpk) ghtVar48.nr.io());
            case 1671:
                return new zik((Executor) this.a.u.io());
            case 1672:
                return ((awkx) this.a.Fs.io()).N();
            case 1673:
                return new yu(null, null);
            case 1674:
                ght ghtVar49 = this.a;
                return new hvh((tfq) ghtVar49.cd.io(), (mbc) ghtVar49.l.io(), ghtVar49.iG, ghtVar49.Fz, (zwb) ghtVar49.bd.io(), (Context) ghtVar49.v.io(), (syn) ghtVar49.cs.io(), (Executor) ghtVar49.z.io(), (vxz) ghtVar49.cu.io());
            case 1675:
                ght ghtVar50 = this.a;
                return new aarj((avmb) ghtVar50.dC.io(), (Executor) ghtVar50.u.io(), (wbz) ghtVar50.es.io(), ghtVar50.iR, ghtVar50.Fx, ghtVar50.lZ, (zwb) ghtVar50.bd.io(), (aany) ghtVar50.sh.io(), (ahbw) ghtVar50.cx.io(), (vxz) ghtVar50.cN.io());
            case 1676:
                ght ghtVar51 = this.a;
                wlp wlpVar = (wlp) ghtVar51.kE.io();
                abxv abxvVar = (abxv) ghtVar51.gK.io();
                zwb zwbVar3 = (zwb) ghtVar51.bd.io();
                aupr auprVar20 = ghtVar51.mq;
                aupr auprVar21 = ghtVar51.mr;
                return new aaqf(wlpVar, abxvVar, zwbVar3, auprVar20, auprVar21, (vxz) ghtVar51.aw.io(), (tqj) ghtVar51.q.io(), null);
            case 1677:
                return iqf.b((abvn) this.a.mW.io());
            case 1678:
                return new abi((wtj) this.a.FG.io());
            case 1679:
                ght ghtVar52 = this.a;
                return new wtj((wlp) ghtVar52.kE.io(), (abxv) ghtVar52.gK.io(), (zwb) ghtVar52.bd.io(), (tgg) ghtVar52.qg.io(), (tbt) ghtVar52.I.io(), (hed) ghtVar52.bC.io(), (vxz) ghtVar52.aL.io(), aupm.b(ghtVar52.FF), (Executor) ghtVar52.B.io());
            case 1680:
                return new wte();
            case 1681:
                ght ghtVar53 = this.a;
                return iqf.c((zwb) ghtVar53.bd.io(), (sym) ghtVar53.FI.io());
            case 1682:
                ght ghtVar54 = this.a;
                return iqf.s((Context) ghtVar54.v.io(), (rrq) ghtVar54.bh.io(), (ayq) ghtVar54.bA.io());
            case 1683:
                ght ghtVar55 = this.a;
                return new hhd((tun) ghtVar55.bc.io(), (tbt) ghtVar55.I.io(), ghtVar55.kC, (abvn) ghtVar55.cH.io(), ghtVar55.ro, (zwb) ghtVar55.bd.io(), (Executor) ghtVar55.B.io(), (avmb) ghtVar55.dA.io(), (axfd) ghtVar55.lK.io(), (Context) ghtVar55.v.io(), (vxz) ghtVar55.ga.io(), (vxz) ghtVar55.cu.io(), (tfq) ghtVar55.cd.io(), (vxe) ghtVar55.xR.io(), (wbz) ghtVar55.es.io(), (jlh) ghtVar55.xP.io(), (awkv) ghtVar55.to.io());
            case 1684:
                ght ghtVar56 = this.a;
                return gly.l((tun) ghtVar56.bc.io(), (xgn) ghtVar56.Ac.io(), aupm.b(ghtVar56.oh), ghtVar56.FM.io(), ghtVar56.FN.io(), ghtVar56.FO.io(), ghtVar56.FP.io(), ghtVar56.FQ.io(), ghtVar56.FR.io(), ghtVar56.FS.io(), ghtVar56.FT.io(), ghtVar56.FW.io(), ghtVar56.FX.io(), ghtVar56.FY.io(), (ilx) ghtVar56.jI.io(), (avlh) ghtVar56.FZ.io(), aupm.b(ghtVar56.dE), aupm.b(ghtVar56.cv));
            case 1685:
                ght ghtVar57 = this.a;
                scqVar = new hjc((hhd) ghtVar57.FL.io(), (zwb) ghtVar57.bd.io(), (adxj) ghtVar57.Ad.io());
                return scqVar;
            case 1686:
                ght ghtVar58 = this.a;
                scqVar = new hjb((hhd) ghtVar58.FL.io(), (zwb) ghtVar58.bd.io(), (adxj) ghtVar58.Ad.io());
                return scqVar;
            case 1687:
                ght ghtVar59 = this.a;
                scqVar = new hjm((hhd) ghtVar59.FL.io(), (zwb) ghtVar59.bd.io(), (adxj) ghtVar59.Ad.io());
                return scqVar;
            case 1688:
                ght ghtVar60 = this.a;
                scqVar = new hjl((hhd) ghtVar60.FL.io(), (zwb) ghtVar60.bd.io(), (adxj) ghtVar60.Ad.io());
                return scqVar;
            case 1689:
                ght ghtVar61 = this.a;
                sbsVar = new hje(aupm.b(ghtVar61.oh), ghtVar61.ot, (abvn) ghtVar61.cH.io(), (avmb) ghtVar61.dA.io());
                return sbsVar;
            case 1690:
                ght ghtVar62 = this.a;
                return new hji(aupm.b(ghtVar62.oh), ghtVar62.mi, aupm.b(ghtVar62.pg), (abvn) ghtVar62.cH.io(), (avmb) ghtVar62.dA.io());
            case 1691:
                ght ghtVar63 = this.a;
                return new hjh((hgy) ghtVar63.FK.io(), (acdq) ghtVar63.oh.io(), (adxj) ghtVar63.Ad.io(), 1, null);
            case 1692:
                ght ghtVar64 = this.a;
                sbsVar = new hjh((hgy) ghtVar64.FK.io(), (acdq) ghtVar64.oh.io(), (adxj) ghtVar64.Ad.io(), 0);
                return sbsVar;
            case 1693:
                ght ghtVar65 = this.a;
                return new hjg(aupm.b(ghtVar65.oh), aupm.b(ghtVar65.EW), aupm.b(ghtVar65.FU), aupm.b(ghtVar65.iF), aupm.b(ghtVar65.FV), (abvn) ghtVar65.cH.io(), (vxz) ghtVar65.km.io());
            case 1694:
                ght ghtVar66 = this.a;
                sbsVar = new jij((qrx) ghtVar66.EV.io(), (kjc) ghtVar66.oa.io(), (Executor) ghtVar66.z.io(), (char[]) null);
                return sbsVar;
            case 1695:
                ght ghtVar67 = this.a;
                sbwVar = new ibs(aupm.b(ghtVar67.cH), aupm.b(ghtVar67.FU));
                return sbwVar;
            case 1696:
                ght ghtVar68 = this.a;
                scqVar = new hjj((hgy) ghtVar68.FK.io(), (acdq) ghtVar68.oh.io(), (adxj) ghtVar68.Ad.io());
                return scqVar;
            case 1697:
                ght ghtVar69 = this.a;
                scqVar = new hjk((hgy) ghtVar69.FK.io(), aupm.b(ghtVar69.oh), (adxj) ghtVar69.Ad.io());
                return scqVar;
            case 1698:
                return ((awku) this.a.Ay.io()).P();
            case 1699:
                ght ghtVar70 = this.a;
                return new hix(aupm.b(ghtVar70.cy), aupm.b(ghtVar70.aZ), (avlh) ghtVar70.gB.io(), (avmb) ghtVar70.dE.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        Object abwkVar;
        Object synVar;
        Object vxzVar;
        Object zxxVar;
        int i = this.b;
        switch (i) {
            case 200:
                ght ghtVar = this.a;
                return zik.aN((Context) ghtVar.v.io(), (String) ghtVar.bR.io(), (vxz) ghtVar.aw.io());
            case 201:
                return "com.google.android.libraries.youtube.net.delayedevents.DelayedEventStore";
            case 202:
                ght ghtVar2 = this.a;
                abwkVar = new abwk((tao) ghtVar2.aq.io(), (Context) ghtVar2.v.io(), geh.m(), (tpq) ghtVar2.bU.io());
                return abwkVar;
            case 203:
                ght ghtVar3 = this.a;
                return zik.aK((Context) ghtVar3.v.io(), (ahex) ghtVar3.u.io(), (rrq) ghtVar3.bh.io());
            case 204:
                return sxh.t(this.a.cb);
            case 205:
                ght ghtVar4 = this.a;
                synVar = new syn(ghtVar4.bW, (afft) ghtVar4.bZ.io(), (mbc) ghtVar4.l.io(), ghtVar4.ca);
                return synVar;
            case 206:
                return adib.n((Context) this.a.v.io());
            case 207:
                return new taq();
            case 208:
                return new afft();
            case 209:
                ght ghtVar5 = this.a;
                vxu vxuVar = (vxu) ghtVar5.at.io();
                vyo vyoVar = (vyo) ghtVar5.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar, vyoVar, "SystemHealthClientConfig");
                return vxzVar;
            case 210:
                ght ghtVar6 = this.a;
                vxu vxuVar2 = (vxu) ghtVar6.at.io();
                vyo vyoVar2 = (vyo) ghtVar6.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar2, vyoVar2, "LoggingClient");
                return vxzVar;
            case 211:
                ght ghtVar7 = this.a;
                vxzVar = new ztn(ghtVar7.cg, ghtVar7.cf, ghtVar7.ch, ghtVar7.ci, ghtVar7.cj, (tqj) ghtVar7.q.io(), (Context) ghtVar7.v.io(), Optional.of(Boolean.TRUE));
                return vxzVar;
            case 212:
                ght ghtVar8 = this.a;
                vxzVar = new zth((tag) ghtVar8.bO.io(), ghtVar8.cf, ghtVar8.bT, afmb.j(ghtVar8.Gx), (tqj) ghtVar8.q.io(), ghtVar8.F);
                return vxzVar;
            case 213:
                ght ghtVar9 = this.a;
                return xer.b(ghtVar9.qE, ghtVar9.qG, (ztn) ghtVar9.ck.io());
            case 214:
                ght ghtVar10 = this.a;
                vxzVar = new xfe((zwb) ghtVar10.bd.io(), ghtVar10.qA, ghtVar10.qB, ghtVar10.bc, (xfg) ghtVar10.qD.io(), (tqj) ghtVar10.q.io());
                return vxzVar;
            case 215:
                ght ghtVar11 = this.a;
                vxzVar = new wrg((wlp) ghtVar11.kE.io(), (abxv) ghtVar11.gK.io(), (tqj) ghtVar11.q.io(), ghtVar11.mq, ghtVar11.mr, (vxu) ghtVar11.at.io(), (Executor) ghtVar11.B.io(), (mbc) ghtVar11.l.io(), (vxz) ghtVar11.ce.io());
                return vxzVar;
            case ModuleDescriptor.MODULE_VERSION /* 216 */:
                return vql.t(this.a.fA());
            case 217:
                return rmp.g((rly) this.a.cm.io());
            case 218:
                return this.a.bF();
            case 219:
                vxzVar = new agqj(this.a.aC());
                return vxzVar;
            case 220:
                return vql.e((zxy) this.a.cp.io());
            case 221:
                ght ghtVar12 = this.a;
                zxxVar = new zxx((Context) ghtVar12.v.io(), (vyt) ghtVar12.bE.io(), 0);
                return zxxVar;
            case 222:
                ght ghtVar13 = this.a;
                return vql.d((tqj) ghtVar13.q.io(), ghtVar13.pQ);
            case 223:
                ght ghtVar14 = this.a;
                zxxVar = new wkq((Context) ghtVar14.v.io(), ghtVar14.bN());
                return zxxVar;
            case 224:
                ght ghtVar15 = this.a;
                Context context = (Context) ghtVar15.v.io();
                hdw hdwVar = (hdw) ghtVar15.pP.io();
                tqj tqjVar = (tqj) ghtVar15.q.io();
                return gzj.n(context, hdwVar, tqjVar);
            case 225:
                ght ghtVar16 = this.a;
                vxzVar = new hdw((Context) ghtVar16.v.io(), (SharedPreferences) ghtVar16.J.io(), aupm.b(ghtVar16.ct), aupm.b(ghtVar16.cy), aupm.b(ghtVar16.cF), aupm.b(ghtVar16.cu), (ahbw) ghtVar16.cx.io(), ghtVar16.aK(), ghtVar16.kx, aupm.b(ghtVar16.fM));
                return vxzVar;
            case 226:
                ght ghtVar17 = this.a;
                vxzVar = new hnq((SharedPreferences) ghtVar17.J.io(), (jkp) ghtVar17.cr.io(), (Context) ghtVar17.v.io(), (syn) ghtVar17.cs.io(), (zwb) ghtVar17.bd.io(), (Executor) ghtVar17.z.io());
                return vxzVar;
            case 227:
                ght ghtVar18 = this.a;
                vxzVar = new jkp((zwb) ghtVar18.bd.io(), (SharedPreferences) ghtVar18.J.io());
                return vxzVar;
            case 228:
                ght ghtVar19 = this.a;
                zxxVar = new hfy(aupm.b(ghtVar19.cw), (ahbw) ghtVar19.cx.io());
                return zxxVar;
            case 229:
                ght ghtVar20 = this.a;
                abwkVar = new hfx((Context) ghtVar20.v.io(), (vyo) ghtVar20.av.io(), (vxz) ghtVar20.cu.io(), (vxz) ghtVar20.cv.io());
                return abwkVar;
            case 230:
                ght ghtVar21 = this.a;
                vxu vxuVar3 = (vxu) ghtVar21.at.io();
                vyo vyoVar3 = (vyo) ghtVar21.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar3, vyoVar3, "MusicClientConfig");
                return vxzVar;
            case 231:
                ght ghtVar22 = this.a;
                vxu vxuVar4 = (vxu) ghtVar22.at.io();
                vyo vyoVar4 = (vyo) ghtVar22.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar4, vyoVar4, "MusicIntegrationsClientConfig");
                return vxzVar;
            case 232:
                return ahng.F();
            case 233:
                ght ghtVar23 = this.a;
                vxzVar = new jnm((zwb) ghtVar23.bd.io(), (axfd) ghtVar23.cE.io());
                return vxzVar;
            case 234:
                ght ghtVar24 = this.a;
                synVar = new axfd((SharedPreferences) ghtVar24.J.io(), (zwb) ghtVar24.bd.io(), (aduv) ghtVar24.cD.io());
                return synVar;
            case 235:
                ght ghtVar25 = this.a;
                Optional optionalOf = Optional.of((hbf) ghtVar25.cz.io());
                izg izgVar = new izg();
                vxzVar = new izf(optionalOf, izgVar);
                return vxzVar;
            case 236:
                vxzVar = new hbf((Context) this.a.v.io());
                return vxzVar;
            case 237:
                return adib.g(this.a.aY(), Optional.empty());
            case 238:
                ght ghtVar26 = this.a;
                vxu vxuVar5 = (vxu) ghtVar26.at.io();
                vyo vyoVar5 = (vyo) ghtVar26.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar5, vyoVar5, "UiSystemsClientGlobalConfig");
                return vxzVar;
            case 239:
                ght ghtVar27 = this.a;
                vxu vxuVar6 = (vxu) ghtVar27.at.io();
                vyo vyoVar6 = (vyo) ghtVar27.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar6, vyoVar6, "CrossPlatformCoreClientGlobalConfig");
                return vxzVar;
            case 240:
                return ((ci) this.a.cG.io()).ar();
            case 241:
                return new ci((abvm) new gim(this.a));
            case 242:
                ght ghtVar28 = this.a;
                vxzVar = new ycp(aupm.b(ghtVar28.oW), ghtVar28.bv(), aupm.b(ghtVar28.oY), aupm.b(ghtVar28.ki), aupm.b(ghtVar28.oZ), aupm.b(ghtVar28.pq), aupm.b(ghtVar28.pr), aupm.b(ghtVar28.lc), aupm.b(ghtVar28.ps), aupm.b(ghtVar28.pN), (xpf) ghtVar28.gp.io(), (yed) ghtVar28.ku.io(), aupm.b(ghtVar28.oM), agkz.p(), ghtVar28.ao(), (abte) ghtVar28.iS.io(), (xla) ghtVar28.de.io(), (wjr) ghtVar28.oF.io(), (xnp) ghtVar28.kW.io(), (tce) ghtVar28.pO.io(), (vxz) ghtVar28.dd.io(), (vyo) ghtVar28.av.io(), aupm.b(ghtVar28.pi));
                return vxzVar;
            case 243:
                ght ghtVar29 = this.a;
                vxzVar = new ahgb((xzx) ghtVar29.kw.io(), (yad) ghtVar29.oO.io(), (yaw) ghtVar29.oT.io(), (ybm) ghtVar29.oU.io(), (yce) ghtVar29.oV.io());
                return vxzVar;
            case 244:
                vxzVar = new ghq(this);
                return vxzVar;
            case 245:
                vxzVar = new qcb(this);
                return vxzVar;
            case 246:
                return sxh.b(this.a.cI, agdf.b());
            case 247:
                ght ghtVar30 = this.a;
                vxzVar = new tte((Context) ghtVar30.v.io(), (tfq) ghtVar30.cd.io(), (vxz) ghtVar30.ba.io());
                return vxzVar;
            case 248:
                ght ghtVar31 = this.a;
                synVar = new acda((Context) ghtVar31.v.io(), (abww) ghtVar31.cW.io(), (vxz) ghtVar31.cQ.io());
                return synVar;
            case 249:
                ght ghtVar32 = this.a;
                vxzVar = new abww(ghtVar32.cK, ghtVar32.cT, ghtVar32.cU, ghtVar32.u, (Executor) ghtVar32.z.io(), ghtVar32.bd, Optional.of(aupm.b(ghtVar32.cV)), (tqj) ghtVar32.q.io());
                return vxzVar;
            case 250:
                return zik.bo(this.a.Z());
            case 251:
                ght ghtVar33 = this.a;
                vxzVar = new abmt((vxu) ghtVar33.at.io(), (vyo) ghtVar33.av.io(), ghtVar33.eW(), (vxz) ghtVar33.cL.io(), ghtVar33.fa(), (vxz) ghtVar33.cM.io(), (vxz) ghtVar33.aw.io(), (vxz) ghtVar33.ba.io(), (vxz) ghtVar33.cN.io(), (vxz) ghtVar33.cO.io(), ghtVar33.ff(), (vxz) ghtVar33.cP.io(), (vxz) ghtVar33.cQ.io(), (vxz) ghtVar33.aL.io(), (tqj) ghtVar33.q.io(), (vxz) ghtVar33.ca.io(), (vxz) ghtVar33.cR.io(), (vxz) ghtVar33.cS.io(), ghtVar33.eL());
                return vxzVar;
            case 252:
                ght ghtVar34 = this.a;
                vxu vxuVar7 = (vxu) ghtVar34.at.io();
                vyo vyoVar7 = (vyo) ghtVar34.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar7, vyoVar7, "AndroidPlayerClientSharedConfig");
                return vxzVar;
            case 253:
                ght ghtVar35 = this.a;
                vxu vxuVar8 = (vxu) ghtVar35.at.io();
                vyo vyoVar8 = (vyo) ghtVar35.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar8, vyoVar8, "AndroidClientGlobalConfig");
                return vxzVar;
            case 254:
                ght ghtVar36 = this.a;
                vxu vxuVar9 = (vxu) ghtVar36.at.io();
                vyo vyoVar9 = (vyo) ghtVar36.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar9, vyoVar9, "OfflineClientConfig");
                return vxzVar;
            case 255:
                ght ghtVar37 = this.a;
                vxu vxuVar10 = (vxu) ghtVar37.at.io();
                vyo vyoVar10 = (vyo) ghtVar37.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar10, vyoVar10, "QueueClientGlobalConfig");
                return vxzVar;
            case SemanticState.Hidden /* 256 */:
                ght ghtVar38 = this.a;
                vxu vxuVar11 = (vxu) ghtVar38.at.io();
                vyo vyoVar11 = (vyo) ghtVar38.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar11, vyoVar11, "WatchUiClientGlobalConfig");
                return vxzVar;
            case 257:
                ght ghtVar39 = this.a;
                vxu vxuVar12 = (vxu) ghtVar39.at.io();
                vyo vyoVar12 = (vyo) ghtVar39.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar12, vyoVar12, "WatchPlayerClientGlobalConfig");
                return vxzVar;
            case 258:
                ght ghtVar40 = this.a;
                vxu vxuVar13 = (vxu) ghtVar40.at.io();
                vyo vyoVar13 = (vyo) ghtVar40.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar13, vyoVar13, "LithiumClient");
                return vxzVar;
            case 259:
                ght ghtVar41 = this.a;
                vxu vxuVar14 = (vxu) ghtVar41.at.io();
                vyo vyoVar14 = (vyo) ghtVar41.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar14, vyoVar14, "ShortsConsumptionClientGlobalConfig");
                return vxzVar;
            case 260:
                ght ghtVar42 = this.a;
                abwkVar = new xsc(ghtVar42.bd.io(), (Object) ghtVar42.gU(), ghtVar42.u.io(), (int[]) null);
                return abwkVar;
            case 261:
                ght ghtVar43 = this.a;
                vxzVar = new acqf((Context) ghtVar43.v.io(), ghtVar43.cs, ghtVar43.bd, (Executor) ghtVar43.z.io());
                return vxzVar;
            case 262:
                return taq.F((Context) this.a.v.io());
            case 263:
                ght ghtVar44 = this.a;
                vxzVar = new xwj((tft) ghtVar44.df.io(), (axfd) ghtVar44.di.io(), (xla) ghtVar44.de.io());
                return vxzVar;
            case 264:
                ght ghtVar45 = this.a;
                return zik.cA((ayq) ghtVar45.dc.io(), (xla) ghtVar45.de.io());
            case 265:
                ght ghtVar46 = this.a;
                vxzVar = new ayq(ghtVar46.aI, ghtVar46.cZ, (tao) ghtVar46.aq.io(), (vxz) ghtVar46.aL.io());
                return vxzVar;
            case 266:
                vxzVar = new thv((String) this.a.aO.io());
                return vxzVar;
            case 267:
                ght ghtVar47 = this.a;
                return xer.e((vxu) ghtVar47.at.io(), (vyo) ghtVar47.av.io(), ghtVar47.eI(), (vxz) ghtVar47.dd.io(), Optional.of(zik.bL()));
            case 268:
                ght ghtVar48 = this.a;
                vxu vxuVar15 = (vxu) ghtVar48.at.io();
                vyo vyoVar15 = (vyo) ghtVar48.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar15, vyoVar15, "CxClient");
                return vxzVar;
            case 269:
                ght ghtVar49 = this.a;
                ghtVar49.cM();
                vxzVar = new axfd(ghtVar49.dg, (Context) ghtVar49.v.io(), (xla) ghtVar49.de.io(), (vxz) ghtVar49.aL.io());
                return vxzVar;
            case 270:
                return vkz.m((SharedPreferences) this.a.J.io());
            case 271:
                return gzj.h();
            case 272:
                ght ghtVar50 = this.a;
                vxzVar = new xls((Context) ghtVar50.v.io(), (aczl) ghtVar50.dM.io(), ght.ex(), (mbc) ghtVar50.l.io(), aupm.b(ghtVar50.cd), (vxu) ghtVar50.at.io(), (vxz) ghtVar50.dd.io(), Optional.empty());
                return vxzVar;
            case 273:
                ght ghtVar51 = this.a;
                tft tftVar = (tft) ghtVar51.dl.io();
                tft tftVar2 = (tft) ghtVar51.dm.io();
                aupr auprVar = ghtVar51.dL;
                vxu vxuVar16 = (vxu) ghtVar51.at.io();
                vxz vxzVar2 = (vxz) ghtVar51.aL.io();
                vxz vxzVar3 = (vxz) ghtVar51.dd.io();
                vxzVar = new aczl(ghtVar51.dk, tftVar, tftVar2, auprVar, vxuVar16, vxzVar2, vxzVar3);
                return vxzVar;
            case 274:
                ght ghtVar52 = this.a;
                abwkVar = new ydv((zwb) ghtVar52.bd.io(), (zwn) ghtVar52.cn.io(), (mbc) ghtVar52.l.io(), (xla) ghtVar52.de.io());
                return abwkVar;
            case 275:
                ght ghtVar53 = this.a;
                return zik.cy((ayq) ghtVar53.dc.io(), (xla) ghtVar53.de.io());
            case 276:
                return zik.cu((ayq) this.a.dc.io());
            case 277:
                ght ghtVar54 = this.a;
                xla xlaVar = (xla) ghtVar54.de.io();
                vxz vxzVar4 = (vxz) ghtVar54.dd.io();
                Context context2 = (Context) ghtVar54.v.io();
                ghtVar54.cM();
                return xwg.b(xlaVar, vxzVar4, context2, (ListenableFuture) ghtVar54.f13do.io(), (xmr) ghtVar54.dh.io(), ghtVar54.dp, (String) ghtVar54.aO.io(), ghtVar54.dK);
            case 278:
                ght ghtVar55 = this.a;
                return vkz.n((SharedPreferences) ghtVar55.J.io(), (SecureRandom) ghtVar55.ay.io(), (vxu) ghtVar55.at.io(), ghtVar55.dn);
            case 279:
                ght ghtVar56 = this.a;
                return xwg.r((Context) ghtVar56.v.io(), ght.eF(), (ahex) ghtVar56.u.io(), (rrq) ghtVar56.bh.io());
            case 280:
                ght ghtVar57 = this.a;
                vxzVar = new wmr((Context) ghtVar57.v.io(), ghtVar57.X(), (tqj) ghtVar57.q.io());
                return vxzVar;
            case 281:
                ght ghtVar58 = this.a;
                sds sdsVar = (sds) ghtVar58.dI.io();
                tqj tqjVar2 = (tqj) ghtVar58.q.io();
                vxzVar = new sdr(sdsVar, tqjVar2);
                return vxzVar;
            case 282:
                ght ghtVar59 = this.a;
                return rmp.x((Context) ghtVar59.v.io(), ghtVar59.at, (rsi) ghtVar59.dq.io(), ghtVar59.dr, ghtVar59.ds, (mbc) ghtVar59.l.io(), ghtVar59.bd, (tqj) ghtVar59.q.io(), (abxu) ghtVar59.dG.io(), ghtVar59.dH);
            case 283:
                return gzj.k((Context) this.a.v.io());
            case 284:
                vxzVar = new vwt(this.a.v.io(), (byte[]) null);
                return vxzVar;
            case 285:
                vxzVar = new vwt((Context) this.a.v.io(), (byte[]) null);
                return vxzVar;
            case 286:
                ght ghtVar60 = this.a;
                vxzVar = new abxu(ghtVar60.dt, ghtVar60.dv, ghtVar60.dw, ghtVar60.dy, ghtVar60.dz, ghtVar60.dF, (char[]) null);
                return vxzVar;
            case 287:
                ght ghtVar61 = this.a;
                tqj tqjVar3 = (tqj) ghtVar61.q.io();
                vxzVar = new abxu(tqjVar3, (Executor) ghtVar61.B.io(), (Executor) ghtVar61.aC.io(), (Executor) ghtVar61.u.io(), (Executor) ghtVar61.T.io(), (Executor) ghtVar61.z.io());
                return vxzVar;
            case 288:
                ght ghtVar62 = this.a;
                vxzVar = new abxu((tqj) ghtVar62.q.io(), (ScheduledExecutorService) ghtVar62.du.io(), (ExecutorService) ghtVar62.aC.io(), (ExecutorService) ghtVar62.u.io(), (ExecutorService) ghtVar62.T.io(), (ExecutorService) ghtVar62.z.io());
                return vxzVar;
            case 289:
                ght ghtVar63 = this.a;
                vxzVar = new abxu((tqj) ghtVar63.q.io(), (ScheduledExecutorService) ghtVar63.du.io(), (ScheduledExecutorService) ghtVar63.aC.io(), (ScheduledExecutorService) ghtVar63.u.io(), (ScheduledExecutorService) ghtVar63.T.io(), (ScheduledExecutorService) ghtVar63.z.io());
                return vxzVar;
            case 290:
                ght ghtVar64 = this.a;
                vxzVar = new abxu((tqj) ghtVar64.q.io(), (ahex) ghtVar64.dx.io(), (ahex) ghtVar64.aC.io(), (ahex) ghtVar64.u.io(), (ahex) ghtVar64.T.io(), (ahex) ghtVar64.z.io());
                return vxzVar;
            case 291:
                ght ghtVar65 = this.a;
                vxzVar = new abxu((tqj) ghtVar65.q.io(), (ahey) ghtVar65.du.io(), (ahey) ghtVar65.aC.io(), (ahey) ghtVar65.u.io(), (ahey) ghtVar65.T.io(), (ahey) ghtVar65.z.io());
                return vxzVar;
            case 292:
                ght ghtVar66 = this.a;
                tqj tqjVar4 = (tqj) ghtVar66.q.io();
                vxzVar = new abxu(tqjVar4, (avmb) ghtVar66.dA.io(), (avmb) ghtVar66.dB.io(), (avmb) ghtVar66.dC.io(), (avmb) ghtVar66.dD.io(), (avmb) ghtVar66.dE.io());
                return vxzVar;
            case 293:
                ght ghtVar67 = this.a;
                return taq.G((ahey) ghtVar67.du.io(), (tqj) ghtVar67.q.io());
            case 294:
                ght ghtVar68 = this.a;
                return taq.G((ahey) ghtVar68.aC.io(), (tqj) ghtVar68.q.io());
            case 295:
                ght ghtVar69 = this.a;
                return taq.G((ahey) ghtVar69.u.io(), (tqj) ghtVar69.q.io());
            case 296:
                ght ghtVar70 = this.a;
                return taq.G((ahey) ghtVar70.T.io(), (tqj) ghtVar70.q.io());
            case 297:
                ght ghtVar71 = this.a;
                return taq.G((ahey) ghtVar71.z.io(), (tqj) ghtVar71.q.io());
            case 298:
                return rmp.y((abxu) this.a.dG.io());
            case 299:
                return new rmp();
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v240, types: [awmd, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final Object l() {
        Object aesqVar;
        Object acyvVar;
        Object acizVar;
        Object vxzVar;
        int i = this.b;
        switch (i) {
            case 300:
                ght ghtVar = this.a;
                aesqVar = new aesq((aczl) ghtVar.kg.io(), (Executor) ghtVar.u.io());
                return aesqVar;
            case 301:
                ght ghtVar2 = this.a;
                aesqVar = new aczl((tbt) ghtVar2.I.io(), (abps) ghtVar2.ke.io(), (abrg) ghtVar2.gN.io(), (Executor) ghtVar2.u.io(), (Executor) ghtVar2.B.io(), ghtVar2.db(), (txp) ghtVar2.aS.io());
                return aesqVar;
            case 302:
                ght ghtVar3 = this.a;
                aesqVar = new abps((abxv) ghtVar3.gK.io(), (abrg) ghtVar3.gN.io(), ghtVar3.gp(), ghtVar3.gv(), ghtVar3.gT, (mbc) ghtVar3.l.io(), ghtVar3.aw(), ghtVar3.dO, (abmt) ghtVar3.cT.io());
                return aesqVar;
            case 303:
                ght ghtVar4 = this.a;
                return vql.v(ghtVar4.gJ, (Executor) ghtVar4.u.io(), (Executor) ghtVar4.T.io(), (Executor) ghtVar4.z.io(), (tqj) ghtVar4.q.io(), ghtVar4.dp);
            case 304:
                return this.a.bH();
            case 305:
                ght ghtVar5 = this.a;
                acyvVar = new acyv(ghtVar5.fk, (vxz) ghtVar5.dP.io(), (vyo) ghtVar5.av.io(), (tqj) ghtVar5.q.io());
                return acyvVar;
            case 306:
                ght ghtVar6 = this.a;
                aesqVar = new aczd((Context) ghtVar6.v.io(), (vyo) ghtVar6.av.io(), (nuc) ghtVar6.dU.io(), aupm.b(ghtVar6.fg), (vxz) ghtVar6.dP.io(), (tqj) ghtVar6.q.io(), (mbc) ghtVar6.l.io(), agdf.b());
                return aesqVar;
            case 307:
                ght ghtVar7 = this.a;
                return adbc.d(aupm.b(ghtVar7.dT));
            case 308:
                return new mfk();
            case 309:
                ght ghtVar8 = this.a;
                aesqVar = new acxz((zvl) ghtVar8.dO.io(), ghtVar8.a(), ghtVar8.ek(), ghtVar8.b(), agev.i(aupm.b(ghtVar8.dR)), agev.i(ghtVar8.cb()), aupm.b(ghtVar8.dS));
                return aesqVar;
            case 310:
                ght ghtVar9 = this.a;
                vxu vxuVar = (vxu) ghtVar9.at.io();
                vyo vyoVar = (vyo) ghtVar9.av.io();
                ght.fp();
                aesqVar = new vxz(vxuVar, vyoVar, "ElementsClient");
                return aesqVar;
            case 311:
                ght ghtVar10 = this.a;
                acizVar = new aciz((vxu) ghtVar10.at.io(), (mbc) ghtVar10.l.io());
                return acizVar;
            case 312:
                ght ghtVar11 = this.a;
                vxu vxuVar2 = (vxu) ghtVar11.at.io();
                vyo vyoVar2 = (vyo) ghtVar11.av.io();
                ght.fp();
                vxzVar = new vxz(vxuVar2, vyoVar2, null);
                return vxzVar;
            case 313:
                ght ghtVar12 = this.a;
                aesqVar = new adak((nuc) ghtVar12.dU.io(), (vyo) ghtVar12.av.io(), (vxu) ghtVar12.at.io(), (vxz) ghtVar12.dS.io(), (vxz) ghtVar12.dP.io(), (vxz) ghtVar12.dV.io(), (tqj) ghtVar12.q.io(), aupm.b(ghtVar12.ez), (Context) ghtVar12.v.io(), aupm.b(ghtVar12.fG), aupm.b(ghtVar12.fH), aupm.b(ghtVar12.eJ), aupm.b(ghtVar12.fI), aupm.b(ghtVar12.fR), aupm.b(ghtVar12.fS), agev.i((Boolean) ghtVar12.eA.io()), (ahbw) ghtVar12.cx.io(), aupm.b(ghtVar12.fl), aupm.b(ghtVar12.fk), agev.i(Boolean.valueOf(ghtVar12.el())), agev.i(Boolean.valueOf(ghtVar12.em())), agev.i(aupm.b(ghtVar12.fU)), (Executor) ghtVar12.u.io(), aupm.b(ghtVar12.aC));
                return aesqVar;
            case 314:
                ght ghtVar13 = this.a;
                vxu vxuVar3 = (vxu) ghtVar13.at.io();
                vyo vyoVar3 = (vyo) ghtVar13.av.io();
                ght.fp();
                aesqVar = new vxz(vxuVar3, vyoVar3, "ElementsShared");
                return aesqVar;
            case 315:
                ght ghtVar14 = this.a;
                return ksy.az(aupm.b(ghtVar14.dX), ghtVar14.dY, Optional.of(ghtVar14.dZ), ghtVar14.cU(), Optional.of(Boolean.valueOf(ghtVar14.eh())), Optional.of((ClientErrorLoggerAdapter) ghtVar14.ea.io()), Optional.of((Boolean) ghtVar14.ed.io()), Optional.of(ghtVar14.ee), Optional.of(ghtVar14.x()), ghtVar14.ff);
            case 316:
                ght ghtVar15 = this.a;
                return adbc.g((atoo) ghtVar15.dW.io(), (vxz) ghtVar15.dP.io(), (Context) ghtVar15.v.io(), ghtVar15.ek());
            case 317:
                ght ghtVar16 = this.a;
                return adbc.h(ghtVar16.bN(), (Context) ghtVar16.v.io());
            case 318:
                return ksy.aA();
            case 319:
                return adbc.f((ahey) this.a.u.io());
            case 320:
                zvl zvlVar = (zvl) this.a.dO.io();
                int i2 = adba.a;
                aesqVar = new adbd(zvlVar);
                return aesqVar;
            case 321:
                ght ghtVar17 = this.a;
                int i3 = adba.a;
                return Boolean.FALSE;
            case 322:
                return new aawb();
            case 323:
                return aawb.Q((qrx) this.a.eb.io());
            case 324:
                ght ghtVar18 = this.a;
                return acgz.o((Context) ghtVar18.v.io(), (rrq) ghtVar18.bh.io());
            case 325:
                ght ghtVar19 = this.a;
                return iqf.h(agev.i((Boolean) ghtVar19.ed.io()), ghtVar19.cI(), ghtVar19.ey, (Context) ghtVar19.v.io(), (agev) ghtVar19.ef.io());
            case 326:
                ght ghtVar20 = this.a;
                return iqf.g(agev.i((Boolean) ghtVar20.ed.io()), (Context) ghtVar20.v.io(), ghtVar20.ee, (agev) ghtVar20.ex.io());
            case 327:
                return agev.i((ByteStore) this.a.ew.io());
            case 328:
                return vyr.j(agev.i(this.a.w()));
            case 329:
                ght ghtVar21 = this.a;
                vxzVar = new wcf(ghtVar21.eu, (wfc) ghtVar21.ev.io(), (tbt) ghtVar21.I.io());
                return vxzVar;
            case 330:
                ght ghtVar22 = this.a;
                hhb hhbVar = (hhb) ghtVar22.ek.io();
                ghtVar22.ag();
                aesqVar = new wcd(hhbVar, ghtVar22.eo, (Executor) ghtVar22.z.io(), new zik(), (tqj) ghtVar22.q.io(), (vxz) ghtVar22.aw.io(), (vxz) ghtVar22.aL.io());
                return aesqVar;
            case 331:
                aesqVar = new hhb(this);
                return aesqVar;
            case 332:
                return agev.i((ExecutorRegistry) this.a.dZ.io());
            case 333:
                ght ghtVar23 = this.a;
                return vyr.k(ghtVar23.eg);
            case 334:
                aesqVar = new wfk((mbc) this.a.l.io());
                return aesqVar;
            case 335:
                ght ghtVar24 = this.a;
                acizVar = new wfi((mbc) ghtVar24.l.io(), (vyo) ghtVar24.av.io());
                return acizVar;
            case 336:
                return vyr.h(agev.i(this.a.af()));
            case 337:
                ght ghtVar25 = this.a;
                aesqVar = new wch(ghtVar25.ep, (wfc) ghtVar25.eq.io(), (tbt) ghtVar25.I.io());
                return aesqVar;
            case 338:
                ght ghtVar26 = this.a;
                gzj gzjVar = (gzj) ghtVar26.ej.io();
                ghtVar26.ag();
                aesqVar = new wck(gzjVar, (Executor) ghtVar26.z.io(), new zik(), (tqj) ghtVar26.q.io(), (hhb) ghtVar26.ek.io(), ghtVar26.eo, (vxz) ghtVar26.aw.io(), (vxz) ghtVar26.aL.io());
                return aesqVar;
            case 339:
                return new gzj();
            case 340:
                acizVar = new hed((wfr) this.a.en.io(), ght.eC());
                return acizVar;
            case 341:
                aesqVar = new wfr(agev.i(this.a.ah()));
                return aesqVar;
            case 342:
                ght ghtVar27 = this.a;
                return vyr.l(ghtVar27.el, (tqj) ghtVar27.q.io(), ghtVar27.aw);
            case 343:
                return new wfh();
            case 344:
                aesqVar = new ghr(this);
                return aesqVar;
            case 345:
                ght ghtVar28 = this.a;
                vxu vxuVar4 = (vxu) ghtVar28.at.io();
                vyo vyoVar4 = (vyo) ghtVar28.av.io();
                ght.fp();
                aesqVar = new vxz(vxuVar4, vyoVar4, "MusicOfflineClientConfig");
                return aesqVar;
            case 346:
                aesqVar = new ghl(this, 1);
                return aesqVar;
            case 347:
                ght ghtVar29 = this.a;
                aupr auprVar = ghtVar29.ez;
                tqj tqjVar = (tqj) ghtVar29.q.io();
                aupr auprVar2 = ghtVar29.eO;
                return new acyh(auprVar, tqjVar, auprVar2);
            case 348:
                ght ghtVar30 = this.a;
                return idj.i(agev.i((Boolean) ghtVar30.eA.io()), agev.i((Boolean) ghtVar30.eB.io()), agev.i((Boolean) ghtVar30.eC.io()), agdf.b(), agev.i((Boolean) ghtVar30.eD.io()), agev.i((Boolean) ghtVar30.eE.io()), agdf.b(), agev.i((Boolean) ghtVar30.eF.io()), agev.i((Integer) ghtVar30.eG.io()), agev.i((Boolean) ghtVar30.eH.io()), agev.i((Boolean) ghtVar30.eI.io()));
            case 349:
                ght ghtVar31 = this.a;
                int i4 = adba.a;
                return Boolean.FALSE;
            case 350:
                ght ghtVar32 = this.a;
                int i5 = adba.a;
                return Boolean.FALSE;
            case 351:
                vxz vxzVar2 = (vxz) this.a.dP.io();
                int i6 = adba.a;
                return Boolean.valueOf(vxzVar2.l(401, 45767191L, false));
            case 352:
                vxz vxzVar3 = (vxz) this.a.dP.io();
                int i7 = adba.a;
                return Boolean.valueOf(vxzVar3.l(471, 45811308L, false));
            case 353:
                vxz vxzVar4 = (vxz) this.a.dP.io();
                int i8 = adba.a;
                return Boolean.valueOf(vxzVar4.l(493, 45826828L, false));
            case 354:
                vxz vxzVarEO = this.a.eO();
                int i9 = adba.a;
                return Boolean.valueOf(vxzVarEO.l(0, 45833080L, false));
            case 355:
                tqj tqjVar2 = (tqj) this.a.q.io();
                int i10 = adba.a;
                return Integer.valueOf(tym.ao(tqjVar2));
            case 356:
                return Boolean.valueOf(adba.c((tqj) this.a.q.io()));
            case 357:
                vxz vxzVar5 = (vxz) this.a.dP.io();
                int i11 = adba.a;
                return Boolean.valueOf(vxzVar5.l(539, 45857101L, false));
            case 358:
                ght ghtVar33 = this.a;
                aesqVar = new teq((awut) ghtVar33.bm.io(), (awou) ghtVar33.eK.io(), (awou) ghtVar33.bl.io(), (mbc) ghtVar33.l.io(), ghtVar33.eL, ghtVar33.eM, ghtVar33.eN);
                return aesqVar;
            case 359:
                ght ghtVar34 = this.a;
                return afmb.k(ghtVar34.gz(), (ahey) ghtVar34.A.io());
            case 360:
                aesqVar = new rnj((vxz) this.a.cR.io());
                return aesqVar;
            case 361:
                ght ghtVar35 = this.a;
                return aawb.T(((Boolean) ghtVar35.eV.io()).booleanValue(), (nzw) ghtVar35.fd.io(), ghtVar35.eq(), aupm.b(ghtVar35.fe));
            case 362:
                ght ghtVar36 = this.a;
                return Boolean.valueOf(aawb.V(ghtVar36.eQ, ghtVar36.eU, ghtVar36.v, (vxz) ghtVar36.ce.io()));
            case 363:
                aesqVar = new adbv(this.a.cj());
                return aesqVar;
            case 364:
                ght ghtVar37 = this.a;
                return adib.i((tqj) ghtVar37.q.io(), ghtVar37.eS, ghtVar37.eT);
            case 365:
                ght ghtVar38 = this.a;
                aesqVar = new sza((tpq) ghtVar38.eR.io(), (SecureRandom) ghtVar38.ay.io());
                return aesqVar;
            case 366:
                ght ghtVar39 = this.a;
                return adib.s((Context) ghtVar39.v.io(), (ahex) ghtVar39.u.io(), ght.eF(), (rrq) ghtVar39.bh.io(), Optional.empty());
            case 367:
                aesqVar = new szd(new Random());
                return aesqVar;
            case 368:
                ght ghtVar40 = this.a;
                aunn aunnVarB = aupm.b(ghtVar40.fb);
                return adbc.j(aunnVarB, ((Boolean) ghtVar40.eV.io()).booleanValue(), (adce) ghtVar40.fc.io());
            case 369:
                ght ghtVar41 = this.a;
                vxzVar = new acxl((xit) ghtVar41.fa.io(), ghtVar41.ce, (mbc) ghtVar41.l.io());
                return vxzVar;
            case 370:
                ght ghtVar42 = this.a;
                aupr auprVar3 = ghtVar42.J;
                aupr auprVar4 = ghtVar42.aY;
                mbc mbcVar = (mbc) ghtVar42.l.io();
                Executor executor = (Executor) ghtVar42.bP.io();
                aesqVar = new xip(auprVar3, auprVar4, mbcVar, executor, (txp) ghtVar42.aS.io(), ghtVar42.eZ, ghtVar42.eW, ghtVar42.eY, ghtVar42.ce, (tqj) ghtVar42.q.io());
                return aesqVar;
            case 371:
                ght ghtVar43 = this.a;
                aesqVar = new abxu(ghtVar43.l, ghtVar43.bP, ghtVar43.eW, ghtVar43.eY, ghtVar43.q, ghtVar43.dO, (byte[]) null);
                return aesqVar;
            case 372:
                ght ghtVar44 = this.a;
                acyvVar = new xej((mbc) ghtVar44.l.io(), (zwb) ghtVar44.bd.io(), ghtVar44.bw, ghtVar44.bc);
                return acyvVar;
            case 373:
                ght ghtVar45 = this.a;
                aesqVar = new xja(ghtVar45.eX, ghtVar45.F, (tqj) ghtVar45.q.io(), ghtVar45.gV(), (Executor) ghtVar45.bP.io(), (Context) ghtVar45.v.io(), ghtVar45.ce, (vyo) ghtVar45.av.io());
                return aesqVar;
            case 374:
                return adbc.e((adbv) this.a.eQ.io());
            case 375:
                ght ghtVar46 = this.a;
                adbv adbvVar = (adbv) ghtVar46.eQ.io();
                return aawb.U(adbvVar);
            case 376:
                ght ghtVar47 = this.a;
                aesqVar = new adbf((aczb) ghtVar47.fj.io(), (aczd) ghtVar47.fk.io(), (nuc) ghtVar47.dU.io(), aupm.b(ghtVar47.fm), (tqj) ghtVar47.q.io());
                return aesqVar;
            case 377:
                ght ghtVar48 = this.a;
                aesqVar = new aczb((nuc) ghtVar48.dU.io(), aupm.b(ghtVar48.ez), aupm.b(ghtVar48.fg), (vxz) ghtVar48.dP.io(), (tre) ghtVar48.Q.io(), (vxz) ghtVar48.aw.io(), (adam) ghtVar48.fe.io(), (xil) ghtVar48.fh.io(), (xit) ghtVar48.fa.io(), (tqj) ghtVar48.q.io(), aupm.b(ghtVar48.dV), (abxu) ghtVar48.dG.io(), ghtVar48.fv(), (acyn) ghtVar48.fi.io());
                return aesqVar;
            case 378:
                aesqVar = new xil((mbc) this.a.l.io());
                return aesqVar;
            case 379:
                ght ghtVar49 = this.a;
                acizVar = new acyn((vyo) ghtVar49.av.io(), (tqj) ghtVar49.q.io());
                return acizVar;
            case 380:
                ght ghtVar50 = this.a;
                return aawb.R((Context) ghtVar50.v.io(), (rrq) ghtVar50.bh.io());
            case 381:
                ght ghtVar51 = this.a;
                return vyr.f(ghtVar51.fF, Optional.of((Boolean) ghtVar51.eA.io()), Optional.empty());
            case 382:
                ght ghtVar52 = this.a;
                Context context = (Context) ghtVar52.v.io();
                aupr auprVar5 = ghtVar52.fA;
                aupr auprVar6 = ghtVar52.fz;
                Object objCr = ghtVar52.cr();
                Object objCp = ghtVar52.cp();
                hed hedVar = (hed) ghtVar52.co();
                abxv abxvVar = (abxv) objCp;
                aesqVar = new vzt(context, auprVar5, auprVar6, (vwt) objCr, abxvVar, hedVar, (ahex) ghtVar52.z.io(), (avlr) ghtVar52.fD.io(), (avlr) ghtVar52.fE.io(), ghtVar52.fB);
                return aesqVar;
            case 383:
                ght ghtVar53 = this.a;
                return nyr.o((Context) ghtVar53.v.io(), (ahex) ghtVar53.u.io(), (agke) ghtVar53.fn.io(), ghtVar53.fC(), (ayq) ghtVar53.bg.io(), (ooh) ghtVar53.fp.io(), agev.i((ooe) ghtVar53.fq.io()), (agfr) ghtVar53.fs.io(), agdf.b(), agev.i((vwt) ghtVar53.fu.io()), agev.i((qnl) ghtVar53.fv.io()), (rrq) ghtVar53.bh.io(), agdf.b(), agev.i((oii) ghtVar53.fr.io()), agev.i(ghtVar53.gE()));
            case 384:
                return vyr.g(this.a.dk());
            case 385:
                ght ghtVar54 = this.a;
                return vyr.t((Context) ghtVar54.v.io(), (rrq) ghtVar54.bh.io());
            case 386:
                aesqVar = new ooh((Context) this.a.v.io());
                return aesqVar;
            case 387:
                ght ghtVar55 = this.a;
                acizVar = new ooe((mbc) ghtVar55.l.io(), (ahex) ghtVar55.u.io());
                return acizVar;
            case 388:
                ght ghtVar56 = this.a;
                return nyr.n((Context) ghtVar56.v.io(), (ScheduledExecutorService) ghtVar56.T.io(), (ayq) ghtVar56.bg.io(), aupm.b(ghtVar56.aI), agev.i((ooe) ghtVar56.fq.io()), (oii) ghtVar56.fr.io());
            case 389:
                aesqVar = new wak(this.a.eH());
                return aesqVar;
            case 390:
                aesqVar = new vwt((dov) this.a.ft.io());
                return aesqVar;
            case 391:
                ght ghtVar57 = this.a;
                return new qnl();
            case 392:
                ght ghtVar58 = this.a;
                aesqVar = new hed((awmd) ghtVar58.v, (awmd) ghtVar58.fw, (awmd) ghtVar58.fx, (char[]) null);
                return aesqVar;
            case 393:
                aesqVar = new rnj((Context) this.a.v.io());
                return aesqVar;
            case 394:
                aesqVar = new zs((dov) this.a.ft.io(), (byte[]) null);
                return aesqVar;
            case 395:
                return new vzw();
            case 396:
                return Optional.of("datapush_release_version.binarypb");
            case 397:
                ght ghtVar59 = this.a;
                return vyr.e((vyo) ghtVar59.av.io(), (avmb) ghtVar59.dC.io());
            case 398:
                ght ghtVar60 = this.a;
                return vyr.d((vyo) ghtVar60.av.io(), (avmb) ghtVar60.dC.io());
            case 399:
                return new aawb();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        Object hldVar;
        Object aaaiVar;
        Object aaauVar;
        int i = this.b;
        byte[] bArr = null;
        switch (i) {
            case 400:
                return aaux.s();
            case 401:
                ght ghtVar = this.a;
                return adbc.i(ghtVar.fQ, (vxz) ghtVar.dP.io());
            case 402:
                ght ghtVar2 = this.a;
                return new wkn((Context) ghtVar2.v.io(), ghtVar2.bN(), ghtVar2.m(), (mbc) ghtVar2.l.io(), ghtVar2.fJ, ghtVar2.dp, (vxu) ghtVar2.at.io(), (vxz) ghtVar2.fK.io(), ghtVar2.ai(), (tfq) ghtVar2.cd.io(), (wfu) ghtVar2.fM.io(), (afkg) ghtVar2.fO.io(), Optional.of((vca) ghtVar2.fP.io()), (tqj) ghtVar2.q.io(), (vxz) ghtVar2.aw.io());
            case 403:
                return Integer.valueOf(taq.N((Context) this.a.v.io()));
            case 404:
                ght ghtVar3 = this.a;
                vxu vxuVar = (vxu) ghtVar3.at.io();
                vyo vyoVar = (vyo) ghtVar3.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "FeedsSystemClient");
            case 405:
                ght ghtVar4 = this.a;
                aupr auprVar = ghtVar4.bC;
                return new wfu(auprVar, agkj.i());
            case 406:
                return new afkg((Looper) this.a.fN.io());
            case 407:
                ght ghtVar5 = this.a;
                return idj.h(ghtVar5.cC(), (ThreadFactory) ghtVar5.m.io());
            case 408:
                return new vca();
            case 409:
                ght ghtVar6 = this.a;
                return adbc.c((vxz) ghtVar6.dP.io(), agev.i(Boolean.valueOf(ghtVar6.ed())));
            case 410:
                ght ghtVar7 = this.a;
                return acgz.k(agev.i(Boolean.valueOf(ghtVar7.el())), agev.i(Boolean.valueOf(ghtVar7.em())), ghtVar7.fT);
            case 411:
                ght ghtVar8 = this.a;
                return acgz.j(agev.i(Boolean.valueOf(ghtVar8.el())), agev.i(ghtVar8.y()), agev.i(Boolean.valueOf(ghtVar8.em())));
            case 412:
                ght ghtVar9 = this.a;
                hldVar = new hld(ghtVar9.fY, (mbc) ghtVar9.l.io());
                return hldVar;
            case 413:
                ght ghtVar10 = this.a;
                aaauVar = new aaau((SharedPreferences) ghtVar10.J.io(), (tpq) ghtVar10.fW.io(), (Executor) ghtVar10.B.io());
                return aaauVar;
            case 414:
                ght ghtVar11 = this.a;
                return zrp.n((Context) ghtVar11.v.io(), ghtVar11.bh, ghtVar11.J, (abxu) ghtVar11.dy.io(), ght.eF());
            case 415:
                ght ghtVar12 = this.a;
                aaaiVar = new aaai(ghtVar12.gh, ghtVar12.gl, (vxu) ghtVar12.at.io(), 1);
                return aaaiVar;
            case 416:
                ght ghtVar13 = this.a;
                return pox.p(ghtVar13.gf, ghtVar13.gg, (tqj) ghtVar13.q.io());
            case 417:
                ght ghtVar14 = this.a;
                return new rry((vxu) ghtVar14.at.io(), (tre) ghtVar14.Q.io(), ghtVar14.bQ(), (Context) ghtVar14.v.io(), (ScheduledExecutorService) ghtVar14.u.io(), (avmb) ghtVar14.dC.io(), (rmp) ghtVar14.ge.io(), (tqj) ghtVar14.q.io(), agev.i(aupm.b(ghtVar14.fP)));
            case 418:
                ght ghtVar15 = this.a;
                vxu vxuVar2 = (vxu) ghtVar15.at.io();
                vyo vyoVar2 = (vyo) ghtVar15.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "MusicClientInfraConfig");
            case 419:
                return ((awku) this.a.gb.io()).E();
            case 420:
                return new awku();
            case 421:
                return new rmp();
            case 422:
                ght ghtVar16 = this.a;
                return new rrx((vxu) ghtVar16.at.io(), (tre) ghtVar16.Q.io(), ghtVar16.bQ(), (Context) ghtVar16.v.io(), (ScheduledExecutorService) ghtVar16.u.io(), (avmb) ghtVar16.dC.io(), (rmp) ghtVar16.ge.io(), (tqj) ghtVar16.q.io(), agev.i(aupm.b(ghtVar16.fP)));
            case 423:
                ght ghtVar17 = this.a;
                return pox.q(ghtVar17.gj, ghtVar17.gk, (tqj) ghtVar17.q.io());
            case 424:
                ght ghtVar18 = this.a;
                avlh avlhVar = (avlh) ghtVar18.gi.io();
                tfq tfqVar = (tfq) ghtVar18.cd.io();
                aaaiVar = new rsa(avlhVar, tfqVar, (avmb) ghtVar18.dE.io(), (tao) ghtVar18.aq.io());
                return aaaiVar;
            case 425:
                return sxh.m((toj) this.a.aK.io());
            case 426:
                ght ghtVar19 = this.a;
                aunn aunnVarB = aupm.b(ghtVar19.gi);
                aunn aunnVarB2 = aupm.b(ghtVar19.cd);
                aaaiVar = new rrz(aunnVarB, aunnVarB2, (avmb) ghtVar19.dE.io(), (vxu) ghtVar19.at.io());
                return aaaiVar;
            case 427:
                ght ghtVar20 = this.a;
                return new rrk((axfd) ghtVar20.gn.io(), (tqj) ghtVar20.q.io());
            case 428:
                return new axfd((Context) this.a.v.io());
            case 429:
                return new xpf();
            case 430:
                ght ghtVar21 = this.a;
                return agkz.q((wmd) ghtVar21.gq.io(), ghtVar21.ab());
            case 431:
                ght ghtVar22 = this.a;
                aaauVar = new wkp(ghtVar22.bs(), (vxu) ghtVar22.at.io(), (Executor) ghtVar22.u.io());
                return aaauVar;
            case 432:
                return new wgb((hed) this.a.bC.io());
            case 433:
                ght ghtVar23 = this.a;
                aupr auprVar2 = ghtVar23.dK;
                return new vvo(auprVar2, 1);
            case 434:
                return new vlp(this.a.gz);
            case 435:
                ght ghtVar24 = this.a;
                return sxh.p(ghtVar24.gx, ghtVar24.gy, (tqj) ghtVar24.q.io());
            case 436:
                ght ghtVar25 = this.a;
                return sxh.q((tfq) ghtVar25.cd.io(), (Executor) ghtVar25.u.io(), ghtVar25.gv, (vyo) ghtVar25.av.io(), (Context) ghtVar25.v.io(), ghtVar25.gw.io());
            case 437:
                ght ghtVar26 = this.a;
                hldVar = new xpl((Executor) ghtVar26.u.io(), (ljt) ghtVar26.gu.io());
                return hldVar;
            case 438:
                return yno.fb((Context) this.a.v.io());
            case 439:
                ght ghtVar27 = this.a;
                hldVar = new wjr((mbc) ghtVar27.l.io(), (xeu) ghtVar27.aZ.io());
                return hldVar;
            case 440:
                ght ghtVar28 = this.a;
                return new vlk(aupm.b(ghtVar28.cd), (Executor) ghtVar28.u.io(), aupm.b(ghtVar28.gv), (vyo) ghtVar28.av.io(), (Context) ghtVar28.v.io(), aupm.b(ghtVar28.gw));
            case 441:
                ght ghtVar29 = this.a;
                return new abol((avlh) ghtVar29.gB.io(), ghtVar29.bV());
            case 442:
                return zrp.v((ci) this.a.cG.io());
            case 443:
                ght ghtVar30 = this.a;
                Context context = (Context) ghtVar30.v.io();
                tpq tpqVar = (tpq) ghtVar30.cK.io();
                Optional optionalEmpty = Optional.empty();
                tfq tfqVar2 = (tfq) ghtVar30.cd.io();
                vyo vyoVar3 = (vyo) ghtVar30.av.io();
                vxu vxuVar3 = (vxu) ghtVar30.at.io();
                zkd zkdVar = (zkd) ghtVar30.gG.io();
                isi isiVar = (isi) ghtVar30.aW.io();
                vxz vxzVar = (vxz) ghtVar30.gH.io();
                vxz vxzVar2 = (vxz) ghtVar30.cM.io();
                vxz vxzVar3 = (vxz) ghtVar30.cL.io();
                vxz vxzVarFc = ghtVar30.fc();
                vxz vxzVarFd = ghtVar30.fd();
                vxz vxzVarEX = ghtVar30.eX();
                vxz vxzVarEW = ghtVar30.eW();
                tre treVar = (tre) ghtVar30.Q.io();
                vxz vxzVar4 = (vxz) ghtVar30.ba.io();
                vxz vxzVar5 = (vxz) ghtVar30.aw.io();
                vxz vxzVar6 = (vxz) ghtVar30.cN.io();
                ghtVar30.fb();
                vxz vxzVar7 = (vxz) ghtVar30.aL.io();
                return new zjr(context, tpqVar, optionalEmpty, tfqVar2, vyoVar3, vxuVar3, zkdVar, isiVar, vxzVar, vxzVar2, vxzVar3, vxzVarFc, vxzVarFd, vxzVarEX, vxzVarEW, treVar, vxzVar4, vxzVar5, vxzVar6, vxzVar7, (vxz) ghtVar30.cS.io(), (tqj) ghtVar30.q.io());
            case 444:
                ght ghtVar31 = this.a;
                return new zkd((tpq) ghtVar31.cK.io(), (avlh) ghtVar31.gD.io(), (vyo) ghtVar31.av.io(), (zju) ghtVar31.gE.io(), (avmb) ghtVar31.dA.io(), (vxz) ghtVar31.cL.io(), (vxz) ghtVar31.gF.io(), (tqj) ghtVar31.q.io());
            case 445:
                return sxh.h((tfm) this.a.N.io());
            case 446:
                zju zjuVar = new zju((avlh) this.a.O.io());
                zjuVar.a();
                return zjuVar;
            case 447:
                ght ghtVar32 = this.a;
                vxu vxuVar4 = (vxu) ghtVar32.at.io();
                vyo vyoVar4 = (vyo) ghtVar32.av.io();
                ght.fp();
                return new vxz(vxuVar4, vyoVar4, "PremiumClientSharedConfig");
            case 448:
                ght ghtVar33 = this.a;
                vxu vxuVar5 = (vxu) ghtVar33.at.io();
                vyo vyoVar5 = (vyo) ghtVar33.av.io();
                ght.fp();
                return new vxz(vxuVar5, vyoVar5, "PlayerAndroid");
            case 449:
                ght ghtVar34 = this.a;
                return new abrg((wlp) ghtVar34.gL.io(), (abxv) ghtVar34.gK.io(), ghtVar34.fu(), (zwb) ghtVar34.bd.io(), (String) ghtVar34.gM.io(), (tbt) ghtVar34.I.io(), (vxu) ghtVar34.at.io(), (vyo) ghtVar34.av.io(), (abmt) ghtVar34.cT.io());
            case 450:
                return vql.s(this.a.fA());
            case 451:
                ght ghtVar35 = this.a;
                return sxh.e((Context) ghtVar35.v.io(), (tqj) ghtVar35.q.io());
            case 452:
                return new agqj((rut) this.a.gO.io());
            case 453:
                return new rut();
            case 454:
                return zik.bD();
            case 455:
                ght ghtVar36 = this.a;
                return vkz.e((vvn) ghtVar36.fL.io(), (tgm) ghtVar36.bf.io(), (tmo) ghtVar36.gS.io(), (Optional) ghtVar36.gR.io(), (tgl) ghtVar36.bk.io(), (ExecutorService) ghtVar36.z.io(), (awut) ghtVar36.bo.io(), (ExecutorService) ghtVar36.t.io(), (awut) ghtVar36.bm.io());
            case 456:
                ght ghtVar37 = this.a;
                return vql.f((mbc) ghtVar37.l.io(), (vvn) ghtVar37.fL.io(), (Optional) ghtVar37.gR.io(), (tqj) ghtVar37.q.io(), ghtVar37.eO);
            case 457:
                ght ghtVar38 = this.a;
                return vql.h(ghtVar38.ad(), (tqj) ghtVar38.q.io());
            case 458:
                return gzj.j();
            case 459:
                ght ghtVar39 = this.a;
                return new yrv(ghtVar39.ia, (ScheduledExecutorService) ghtVar39.u.io(), (zjk) ghtVar39.hg.io(), (abxv) ghtVar39.jh.io(), (vyo) ghtVar39.av.io(), (vxu) ghtVar39.at.io(), (mbc) ghtVar39.l.io(), (ci) ghtVar39.ji.io(), ghtVar39.av(), ghtVar39.gj(), (hed) ghtVar39.hx.io(), ghtVar39.gP(), (zgm) ghtVar39.il.io(), ghtVar39.eW(), (vxz) ghtVar39.gH.io(), (vxz) ghtVar39.cL.io(), (zjr) ghtVar39.gI.io(), (rnj) ghtVar39.hf.io());
            case 460:
                ght ghtVar40 = this.a;
                Context context2 = (Context) ghtVar40.v.io();
                zjr zjrVar = (zjr) ghtVar40.gI.io();
                xeu xeuVar = (xeu) ghtVar40.aZ.io();
                yha yhaVar = (yha) ghtVar40.hn.io();
                mbc mbcVar = (mbc) ghtVar40.l.io();
                yoq yoqVar = (yoq) ghtVar40.hE.io();
                return zik.bH(context2, zjrVar, xeuVar, yhaVar, mbcVar, yoqVar, (zgm) ghtVar40.il.io(), (zdx) ghtVar40.je.io());
            case 461:
                ght ghtVar41 = this.a;
                return new yha((agfr) ghtVar41.ho.io(), ghtVar41.hR, (abxv) ghtVar41.hq.io(), (yqy) ghtVar41.hy.io(), (ygy) ghtVar41.hU.io(), (xeu) ghtVar41.aZ.io(), (ahey) ghtVar41.u.io(), (zjr) ghtVar41.gI.io());
            case 462:
                ght ghtVar42 = this.a;
                yfu yfuVar = (yfu) ghtVar42.hT.io();
                aaaiVar = new yel((zjr) ghtVar42.gI.io(), aupm.b(ghtVar42.hS), (zwb) ghtVar42.bd.io(), yfuVar);
                return aaaiVar;
            case 463:
                ght ghtVar43 = this.a;
                vxu vxuVar6 = (vxu) ghtVar43.at.io();
                aupr auprVar3 = ghtVar43.gV;
                yfk yfkVar = (yfk) ghtVar43.gX.io();
                return new yfu(vxuVar6, auprVar3, yfkVar, (yfo) ghtVar43.hS.io(), aupm.b(ghtVar43.gY), (SharedPreferences) ghtVar43.J.io(), (zjr) ghtVar43.gI.io(), (Context) ghtVar43.v.io());
            case 464:
                ght ghtVar44 = this.a;
                return zik.bI((zjr) ghtVar44.gI.io(), (Context) ghtVar44.v.io(), Optional.empty());
            case 465:
                ght ghtVar45 = this.a;
                zjr zjrVar2 = (zjr) ghtVar45.gI.io();
                aupr auprVar4 = ghtVar45.gV;
                vxu vxuVar7 = (vxu) ghtVar45.at.io();
                return zik.bJ(zjrVar2, auprVar4, vxuVar7, (mbc) ghtVar45.l.io());
            case 466:
                return new tym();
            case 467:
                ght ghtVar46 = this.a;
                return new yfo((zjr) ghtVar46.gI.io(), (yfk) ghtVar46.gX.io(), aupm.b(ghtVar46.gY), (xeu) ghtVar46.aZ.io(), (SharedPreferences) ghtVar46.J.io(), (vxu) ghtVar46.at.io(), ghtVar46.gV, (ahey) ghtVar46.u.io(), (ahey) ghtVar46.aC.io(), (Context) ghtVar46.v.io(), (wjr) ghtVar46.gZ.io(), (xxy) ghtVar46.ha.io(), (mbc) ghtVar46.l.io(), Optional.of(new zik()), (abxv) ghtVar46.hq.io(), (syn) ghtVar46.cs.io());
            case 468:
                return new dov(aupm.b(this.a.ay), (byte[]) null);
            case 469:
                return new wjr((zjr) this.a.gI.io());
            case 470:
                return new xxy(this.a.gj(), bArr);
            case 471:
                ght ghtVar47 = this.a;
                aaauVar = new abxv((zjr) ghtVar47.gI.io(), ghtVar47.fV(), ghtVar47.hR);
                return aaauVar;
            case 472:
                ght ghtVar48 = this.a;
                hldVar = new ygf((zgy) ghtVar48.hQ.io(), (zjr) ghtVar48.gI.io());
                return hldVar;
            case 473:
                ght ghtVar49 = this.a;
                return xwg.d((xeu) ghtVar49.aZ.io(), (wis) ghtVar49.hb.io(), ghtVar49.az(), (zjr) ghtVar49.gI.io(), (agfr) ghtVar49.ho.io());
            case 474:
                return new wis(this.a.bC);
            case 475:
                ght ghtVar50 = this.a;
                return zik.bE((mbc) ghtVar50.l.io(), (wis) ghtVar50.hb.io(), (tqj) ghtVar50.q.io());
            case 476:
                ght ghtVar51 = this.a;
                Executor executor = (Executor) ghtVar51.aC.io();
                Executor executor2 = (Executor) ghtVar51.u.io();
                zjr zjrVar3 = (zjr) ghtVar51.gI.io();
                return xer.k(executor, executor2, zjrVar3);
            case 477:
                ght ghtVar52 = this.a;
                return xwg.c(ghtVar52.hi.io(), (vxz) ghtVar52.aL.io(), aupm.b(ghtVar52.aN));
            case 478:
                ght ghtVar53 = this.a;
                return new abzo((thm) ghtVar53.aD.io(), (Context) ghtVar53.v.io(), (Executor) ghtVar53.u.io(), (String) ghtVar53.aO.io(), (vxu) ghtVar53.at.io(), ghtVar53.he, (zjk) ghtVar53.hg.io(), (tao) ghtVar53.aq.io(), ghtVar53.dE(), (tfx) ghtVar53.hh.io(), ghtVar53.aL);
            case 479:
                return new hed((mbc) this.a.l.io());
            case 480:
                ght ghtVar54 = this.a;
                return new zjk((tbt) ghtVar54.I.io(), (mbc) ghtVar54.l.io(), ghtVar54.hf, (zjr) ghtVar54.gI.io());
            case 481:
                return new rnj((tre) this.a.Q.io());
            case 482:
                ght ghtVar55 = this.a;
                hldVar = new yup(ghtVar55.hl, (tfq) ghtVar55.cd.io());
                return hldVar;
            case 483:
                ght ghtVar56 = this.a;
                return zik.bK((zjr) ghtVar56.gI.io(), (yuz) ghtVar56.hk.io(), (mbc) ghtVar56.l.io());
            case 484:
                ght ghtVar57 = this.a;
                return new yuz((tfq) ghtVar57.cd.io(), (tpq) ghtVar57.cK.io(), (ScheduledExecutorService) ghtVar57.u.io(), (vyo) ghtVar57.av.io());
            case 485:
                ght ghtVar58 = this.a;
                return zik.bg((aadb) ghtVar58.hu.io(), ghtVar58.fV(), (zho) ghtVar58.hr.io(), (vxz) ghtVar58.gH.io(), (vxz) ghtVar58.aL.io());
            case 486:
                ght ghtVar59 = this.a;
                return zik.aU((yha) ghtVar59.hn.io(), (yho) ghtVar59.ht.io());
            case 487:
                ght ghtVar60 = this.a;
                return new yho((agfr) ghtVar60.ho.io(), (Key) ghtVar60.hp.io(), (ahey) ghtVar60.u.io(), (zjr) ghtVar60.gI.io(), (xeu) ghtVar60.aZ.io(), (abxv) ghtVar60.hq.io(), (zjx) ghtVar60.hs.io());
            case 488:
                ght ghtVar61 = this.a;
                return ((dov) ghtVar61.gY.io()).ai((SharedPreferences) ghtVar61.J.io());
            case 489:
                ght ghtVar62 = this.a;
                hldVar = new zjx((mbc) ghtVar62.l.io(), (zho) ghtVar62.hr.io(), 1);
                return hldVar;
            case 490:
                return new zho();
            case 491:
                ght ghtVar63 = this.a;
                return new ynu((agfr) ghtVar63.ho.io(), (Key) ghtVar63.hp.io(), (zho) ghtVar63.hr.io(), (vyo) ghtVar63.av.io(), (zjr) ghtVar63.gI.io());
            case 492:
                ght ghtVar64 = this.a;
                hldVar = new hed((vyo) ghtVar64.av.io(), (zjr) ghtVar64.gI.io());
                return hldVar;
            case 493:
                ght ghtVar65 = this.a;
                return new yqy((zjr) ghtVar65.gI.io(), (tqj) ghtVar65.q.io(), ghtVar65.eO);
            case 494:
                ght ghtVar66 = this.a;
                hldVar = new zjx((mbc) ghtVar66.l.io(), (zho) ghtVar66.hr.io(), 2);
                return hldVar;
            case 495:
                ght ghtVar67 = this.a;
                return new zeh((tfq) ghtVar67.cd.io(), (mbc) ghtVar67.l.io(), (zkk) ghtVar67.hB.io(), (zjr) ghtVar67.gI.io(), (zkd) ghtVar67.gG.io(), (hed) ghtVar67.hD.io(), ghtVar67.ax(), (tun) ghtVar67.bc.io(), (zju) ghtVar67.gE.io(), (yoq) ghtVar67.hE.io(), ghtVar67.l(), ghtVar67.hF, aupm.b(ghtVar67.hH));
            case 496:
                ght ghtVar68 = this.a;
                acfn acfnVar = new acfn((abnc) ghtVar68.hA.io(), (abmt) ghtVar68.cT.io(), aupm.b(ghtVar68.dO));
                acfnVar.b();
                aaauVar = acfnVar;
                return aaauVar;
            case 497:
                return zrp.q((ci) this.a.cG.io());
            case 498:
                return xer.s(Optional.empty(), (hed) this.a.hC.io());
            case 499:
                return new hed((Context) this.a.v.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        Object zfoVar;
        Object zfmVar;
        int i = this.b;
        switch (i) {
            case 500:
                ght ghtVar = this.a;
                return new yoq((zjr) ghtVar.gI.io(), (mbc) ghtVar.l.io());
            case 501:
                return new aehn((byte[]) null, (byte[]) null);
            case 502:
                ght ghtVar2 = this.a;
                return new SharedBandwidthSampleTrackerWrapper((zjr) ghtVar2.gI.io(), (MetadataStore) ghtVar2.hG.io());
            case 503:
                return new MetadataStoreImpl((tpq) this.a.cK.io());
            case 504:
                return new tgw((mbc) this.a.l.io());
            case 505:
                return zik.cm((wkn) this.a.fQ.io());
            case 506:
                ght ghtVar3 = this.a;
                return xer.n((zjr) ghtVar3.gI.io(), aupm.b(ghtVar3.hM), aupm.b(ghtVar3.hN));
            case 507:
                ght ghtVar4 = this.a;
                zfoVar = new zfo(ghtVar4.bu(), (ahey) ghtVar4.u.io(), (zjr) ghtVar4.gI.io(), (xit) ghtVar4.fa.io(), (xeu) ghtVar4.aZ.io(), (zwb) ghtVar4.bd.io(), (ci) ghtVar4.bw.io(), (mbc) ghtVar4.l.io(), (Context) ghtVar4.v.io());
                return zfoVar;
            case 508:
                ght ghtVar5 = this.a;
                zfmVar = new zfm((Context) ghtVar5.v.io(), (ahey) ghtVar5.u.io(), (mbc) ghtVar5.l.io(), (zjr) ghtVar5.gI.io());
                return zfmVar;
            case 509:
                ght ghtVar6 = this.a;
                zfoVar = new zfj((zjr) ghtVar6.gI.io(), ghtVar6.bu(), (mbc) ghtVar6.l.io(), (ahey) ghtVar6.u.io(), (xit) ghtVar6.fa.io(), (xeu) ghtVar6.aZ.io(), (Context) ghtVar6.v.io());
                return zfoVar;
            case 510:
                return new hhb(this);
            case 511:
                return new ygy(this.a.W());
            case SemanticState.LiveRegion /* 512 */:
                return new zik();
            case 513:
                ght ghtVar7 = this.a;
                zfoVar = new zgm((mbc) ghtVar7.l.io(), (mbc) ghtVar7.hW.io(), (Context) ghtVar7.v.io(), (abuz) ghtVar7.hX.io(), (vyo) ghtVar7.av.io(), ghtVar7.fD(), (tyw) ghtVar7.ik.io(), (ci) ghtVar7.bw.io(), (xeu) ghtVar7.aZ.io(), (Executor) ghtVar7.B.io());
                return zfoVar;
            case 514:
                ght ghtVar8 = this.a;
                return xer.o((vyo) ghtVar8.av.io(), new tyq(0), (zjg) ghtVar8.hc.io());
            case 515:
                ght ghtVar9 = this.a;
                return zik.cF((isi) ghtVar9.aW.io(), ghtVar9.gO(), (Context) ghtVar9.v.io(), (vxz) ghtVar9.fK.io());
            case 516:
                ght ghtVar10 = this.a;
                return new twf((Context) ghtVar10.v.io(), (ExecutorService) ghtVar10.u.io(), (mbc) ghtVar10.l.io(), (vxz) ghtVar10.ca.io());
            case 517:
                return new hpc(this.a.ia, 7);
            case 518:
                return new woi(this.a.ia, 3);
            case 519:
                ght ghtVar11 = this.a;
                return xer.j((yfu) ghtVar11.hT.io(), aupm.b(ghtVar11.hS), (zjr) ghtVar11.gI.io());
            case 520:
                ght ghtVar12 = this.a;
                zfoVar = new xkn((xeu) ghtVar12.aZ.io(), (mbc) ghtVar12.l.io(), ghtVar12.hY, ghtVar12.ie, (zwb) ghtVar12.bd.io(), (ci) ghtVar12.bw.io(), ghtVar12.bN(), ghtVar12.bC, (abxu) ghtVar12.dt.io(), ghtVar12.s(), (Context) ghtVar12.v.io(), (tym) ghtVar12.ig.io(), (xkp) ghtVar12.ih.io(), ghtVar12.ii, ghtVar12.ej());
                return zfoVar;
            case 521:
                return yno.dk((zrw) this.a.bu.io());
            case 522:
                return new tym();
            case 523:
                ght ghtVar13 = this.a;
                return new xkp((Context) ghtVar13.v.io(), (mbc) ghtVar13.l.io());
            case 524:
                ght ghtVar14 = this.a;
                return yno.dj((vxu) ghtVar14.at.io(), ghtVar14.aZ);
            case 525:
                ght ghtVar15 = this.a;
                return zik.aW((Context) ghtVar15.v.io(), aupm.b(ghtVar15.fO), ghtVar15.fz(), (Executor) ghtVar15.t.io(), (vxz) ghtVar15.ca.io(), agdf.b());
            case 526:
                ght ghtVar16 = this.a;
                zfoVar = new zdx(ghtVar16.ay(), aupm.b(ghtVar16.jg), (zjr) ghtVar16.gI.io(), (ahey) ghtVar16.du.io(), (xeu) ghtVar16.aZ.io(), (mbc) ghtVar16.l.io());
                return zfoVar;
            case 527:
                ght ghtVar17 = this.a;
                zfoVar = new abte((Context) ghtVar17.v.io(), ghtVar17.ir, (zgy) ghtVar17.it.io(), ghtVar17.in, (tqj) ghtVar17.q.io());
                return zfoVar;
            case 528:
                return zrp.k(this.a.cX());
            case 529:
                ght ghtVar18 = this.a;
                return zrp.o((aadb) ghtVar18.hu.io(), ghtVar18.fV(), (zho) ghtVar18.hr.io(), (vxz) ghtVar18.gH.io(), (ygn) ghtVar18.hv.io(), (vxz) ghtVar18.aL.io());
            case 530:
                ght ghtVar19 = this.a;
                return zrp.l(ghtVar19.aP(), (agfr) ghtVar19.ip.io(), (Key) ghtVar19.hp.io(), (zho) ghtVar19.hr.io(), (vyo) ghtVar19.av.io(), (zjr) ghtVar19.gI.io());
            case 531:
                return new ytx((wis) this.a.hb.io());
            case 532:
                return new tgr();
            case 533:
                ght ghtVar20 = this.a;
                return new yem((vyo) ghtVar20.av.io(), (yfu) ghtVar20.hT.io());
            case 534:
                ght ghtVar21 = this.a;
                return xer.l((xeu) ghtVar21.aZ.io(), (wis) ghtVar21.hb.io(), ghtVar21.aA(), (zjr) ghtVar21.gI.io(), (agfr) ghtVar21.ho.io());
            case 535:
                ght ghtVar22 = this.a;
                return zik.bf((aadb) ghtVar22.hu.io(), ghtVar22.fV(), (zho) ghtVar22.hr.io(), (vxz) ghtVar22.gH.io(), (vxz) ghtVar22.aL.io());
            case 536:
                return new ahnz();
            case 537:
                ght ghtVar23 = this.a;
                return new PlaybackNetFetchFactory((zjr) ghtVar23.gI.io(), (xeu) ghtVar23.aZ.io(), (hhb) ghtVar23.iw.io(), (EnvoyNetFetchProvider) ghtVar23.iy.io());
            case 538:
                return new hhb(this);
            case 539:
                ght ghtVar24 = this.a;
                zfoVar = new EnvoyNetFetchProvider((ExecutorImpl) ghtVar24.ix.io(), (zjr) ghtVar24.gI.io(), (String) ghtVar24.aO.io(), (Context) ghtVar24.v.io(), (xeu) ghtVar24.aZ.io(), (avlh) ghtVar24.gD.io(), (awut) ghtVar24.bo.io());
                return zfoVar;
            case 540:
                ght ghtVar25 = this.a;
                zfmVar = new ExecutorImpl((ahey) ghtVar25.aC.io(), (xeu) ghtVar25.aZ.io(), (zjr) ghtVar25.gI.io(), (mbc) ghtVar25.hW.io());
                return zfmVar;
            case 541:
                ght ghtVar26 = this.a;
                zfoVar = new aaqc((zwb) ghtVar26.bd.io(), (abuz) ghtVar26.hX.io(), (abxv) ghtVar26.gK.io(), (wlp) ghtVar26.gL.io(), (tgg) ghtVar26.bv.io(), (txp) ghtVar26.aS.io(), (zjr) ghtVar26.gI.io());
                return zfoVar;
            case 542:
                return tym.F((Context) this.a.v.io());
            case 543:
                return xwg.m((aanb) this.a.iG.io());
            case 544:
                ght ghtVar27 = this.a;
                Context context = (Context) ghtVar27.v.io();
                tbt tbtVar = (tbt) ghtVar27.I.io();
                Executor executor = (Executor) ghtVar27.u.io();
                tqa tqaVar = (tqa) ghtVar27.iC.io();
                aupr auprVar = ghtVar27.hu;
                zwb zwbVar = (zwb) ghtVar27.bd.io();
                abfv abfvVar = (abfv) ghtVar27.iD.io();
                aaed aaedVar = (aaed) ghtVar27.iU.io();
                zfoVar = new aadq(context, tbtVar, executor, tqaVar, auprVar, zwbVar, abfvVar, aaedVar, (aaqg) ghtVar27.iR.io(), (aalt) ghtVar27.iV.io(), (aauk) ghtVar27.iL.io(), (aalh) ghtVar27.iX.io());
                return zfoVar;
            case 545:
                return new tqa((Context) this.a.v.io());
            case 546:
                ght ghtVar28 = this.a;
                return new abfv((SharedPreferences) ghtVar28.J.io(), (zwb) ghtVar28.bd.io());
            case 547:
                return gzj.m();
            case 548:
                ght ghtVar29 = this.a;
                zfoVar = new aaed((tbt) ghtVar29.I.io(), (vyo) ghtVar29.av.io(), (ScheduledExecutorService) ghtVar29.u.io(), ghtVar29.iF, ghtVar29.iG, ghtVar29.iJ, ghtVar29.bN, ghtVar29.iT);
                return zfoVar;
            case 549:
                return zrp.r((ci) this.a.cG.io());
            case 550:
                ght ghtVar30 = this.a;
                return new aarf((vxu) ghtVar30.at.io(), ghtVar30.iG, ghtVar30.iH, ghtVar30.iI);
            case 551:
                return new grj((yha) this.a.hn.io());
            case 552:
                ght ghtVar31 = this.a;
                return new aard((aanb) ghtVar31.iG.io(), (Key) ghtVar31.hp.io());
            case 553:
                ght ghtVar32 = this.a;
                zfoVar = new aali((xeu) ghtVar32.aZ.io(), (abxv) ghtVar32.iK.io(), (tfq) ghtVar32.cd.io(), (mbc) ghtVar32.l.io(), (aaqg) ghtVar32.iR.io(), (tqa) ghtVar32.iC.io(), (abte) ghtVar32.iS.io(), (vxz) ghtVar32.cN.io());
                return zfoVar;
            case 554:
                ght ghtVar33 = this.a;
                SharedPreferences sharedPreferences = (SharedPreferences) ghtVar33.J.io();
                vxu vxuVar = (vxu) ghtVar33.at.io();
                zwb zwbVar2 = (zwb) ghtVar33.bd.io();
                aupr auprVar2 = ghtVar33.iG;
                return new abxv(sharedPreferences, vxuVar, zwbVar2, (awmd) auprVar2);
            case 555:
                ght ghtVar34 = this.a;
                zfoVar = new hlp((Context) ghtVar34.v.io(), (SharedPreferences) ghtVar34.J.io(), ((Integer) ghtVar34.iB.io()).intValue(), (vyo) ghtVar34.av.io(), (aauk) ghtVar34.iL.io(), (abfv) ghtVar34.iO.io(), (tfq) ghtVar34.cd.io(), (abfv) ghtVar34.iP.io(), (hef) ghtVar34.iQ.io());
                return zfoVar;
            case 556:
                ght ghtVar35 = this.a;
                vyo vyoVar = (vyo) ghtVar35.av.io();
                vxu vxuVar2 = (vxu) ghtVar35.at.io();
                aupr auprVar3 = ghtVar35.cN;
                vxz vxzVarEJ = ghtVar35.eJ();
                vxz vxzVar = (vxz) auprVar3.io();
                vxz vxzVar2 = (vxz) ghtVar35.cL.io();
                vxz vxzVarES = ghtVar35.eS();
                zfoVar = new aauk(vyoVar, vxuVar2, vxzVarEJ, vxzVar, vxzVar2, vxzVarES, (vxz) ghtVar35.et.io(), (vxz) ghtVar35.cR.io(), (tqj) ghtVar35.q.io());
                return zfoVar;
            case 557:
                ght ghtVar36 = this.a;
                return new abfv((tpq) ghtVar36.iM.io(), (tpq) ghtVar36.iN.io(), (char[]) null);
            case 558:
                ght ghtVar37 = this.a;
                return zik.aT((Context) ghtVar37.v.io(), (rrq) ghtVar37.bh.io());
            case 559:
                ght ghtVar38 = this.a;
                return zik.bl(ghtVar38.gM(), (zwb) ghtVar38.bd.io());
            case 560:
                ght ghtVar39 = this.a;
                return new abfv((Context) ghtVar39.v.io(), (vyo) ghtVar39.av.io(), (char[]) null);
            case 561:
                return new hef();
            case 562:
                ght ghtVar40 = this.a;
                zfoVar = new abte((xeu) ghtVar40.aZ.io(), (dov) ghtVar40.aR.io(), (vxu) ghtVar40.at.io(), (vxz) ghtVar40.ce.io(), (txp) ghtVar40.aS.io());
                return zfoVar;
            case 563:
                ght ghtVar41 = this.a;
                return new aacq((syn) ghtVar41.cc.io(), (vyo) ghtVar41.av.io());
            case 564:
                return new aalh(agkz.p());
            case 565:
                return new ahud((char[]) null);
            case 566:
                return zik.bF((Context) this.a.v.io());
            case 567:
                ght ghtVar42 = this.a;
                vyo vyoVar2 = (vyo) ghtVar42.av.io();
                tgr tgrVar = (tgr) ghtVar42.jb.io();
                xer.m(vyoVar2, tgrVar);
                return tgrVar;
            case 568:
                return new tgr(this.a.Y());
            case 569:
                return zik.bC();
            case 570:
                ght ghtVar43 = this.a;
                return zik.bG(ghtVar43.cY, ghtVar43.aZ, ghtVar43.hW, ghtVar43.hI, ghtVar43.iz, ghtVar43.aC, ghtVar43.u, ghtVar43.dC, ghtVar43.T, ghtVar43.jf, ghtVar43.f28io, ghtVar43.hB, (zjr) ghtVar43.gI.io(), ghtVar43.hK, ghtVar43.ht, ghtVar43.gD, ghtVar43.hO, ghtVar43.hq, ghtVar43.jc, ghtVar43.hG, aupm.b(ghtVar43.hH), ghtVar43.aO, ghtVar43.ix);
            case 571:
                return xwg.e((zdx) this.a.je.io());
            case 572:
                ght ghtVar44 = this.a;
                zfoVar = new abxv((awmd) ghtVar44.l, (awmd) ghtVar44.gI, (awmd) ghtVar44.u, (awmd) ghtVar44.hf, (char[]) null);
                return zfoVar;
            case 573:
                return new ci(this.a.aR(), (char[]) null);
            case 574:
                ght ghtVar45 = this.a;
                return new wjr((awmd) ghtVar45.jB, (zwb) ghtVar45.bd.io());
            case 575:
                ght ghtVar46 = this.a;
                return new dov((Object) ghtVar46.dm());
            case 576:
                ght ghtVar47 = this.a;
                zfmVar = new hed((wbz) ghtVar47.es.io(), (wco) ghtVar47.jy.io(), (wfl) ghtVar47.eh.io(), (char[]) null);
                return zfmVar;
            case 577:
                return vyr.i(agev.i((wco) this.a.jx.io()));
            case 578:
                ght ghtVar48 = this.a;
                Context context2 = (Context) ghtVar48.v.io();
                hhb hhbVar = (hhb) ghtVar48.ju.io();
                tbt tbtVar2 = (tbt) ghtVar48.I.io();
                zwb zwbVar3 = (zwb) ghtVar48.bd.io();
                Executor executor2 = (Executor) ghtVar48.u.io();
                Object objIo = ghtVar48.jm.io();
                ghtVar48.ag();
                return vkz.u(context2, hhbVar, tbtVar2, zwbVar3, executor2, objIo);
            case 579:
                return new hhb(this);
            case 580:
                return new hhb(this);
            case 581:
                return new hhb(this);
            case 582:
                return new wjr(this.a.jl);
            case 583:
                ght ghtVar49 = this.a;
                zfoVar = new ayq(ghtVar49.v, ghtVar49.t, ghtVar49.jk, null, null);
                return zfoVar;
            case 584:
                return new omj((char[]) null, (byte[]) null);
            case 585:
                ght ghtVar50 = this.a;
                return agkz.s((abxv) ghtVar50.jn.io(), (abxv) ghtVar50.jo.io(), (abxv) ghtVar50.jp.io(), (abxv) ghtVar50.jq.io());
            case 586:
                return zik.bk();
            case 587:
                return zik.bi();
            case 588:
                return zik.bh();
            case 589:
                return zik.bj();
            case 590:
                ght ghtVar51 = this.a;
                return new wcl((vxu) ghtVar51.at.io(), (dov) ghtVar51.ft.io());
            case 591:
                ght ghtVar52 = this.a;
                return vyr.v((Context) ghtVar52.v.io(), (hhb) ghtVar52.ju.io(), (wfc) ghtVar52.jw.io(), (tbt) ghtVar52.I.io(), (Executor) ghtVar52.u.io(), ghtVar52.jm.io());
            case 592:
                zfoVar = new ghl(this, 0);
                return zfoVar;
            case 593:
                aczb aczbVar = (aczb) this.a.fj.io();
                aaux.r(aczbVar);
                return aczbVar;
            case 594:
                return new agqj(this.a.gf());
            case 595:
                ght ghtVar53 = this.a;
                return new wjr((tgr) ghtVar53.f28io.io(), (zjr) ghtVar53.gI.io(), (byte[]) null);
            case 596:
                ght ghtVar54 = this.a;
                return zik.cI((Context) ghtVar54.v.io(), (Executor) ghtVar54.u.io(), (ScheduledExecutorService) ghtVar54.u.io(), (ScheduledExecutorService) ghtVar54.aC.io(), (mbc) ghtVar54.l.io(), (tfq) ghtVar54.cd.io(), (String) ghtVar54.aO.io(), ghtVar54.gB(), (wis) ghtVar54.hb.io(), ghtVar54.ax(), ghtVar54.bO(), ghtVar54.bP(), ghtVar54.he, (tgr) ghtVar54.jc.io(), ghtVar54.eX(), (wjr) ghtVar54.jE.io(), (zjr) ghtVar54.gI.io(), (tqj) ghtVar54.q.io(), (hhb) ghtVar54.hP.io(), (hhb) ghtVar54.iw.io(), (xeu) ghtVar54.aZ.io(), (avlh) ghtVar54.gD.io());
            case 597:
                return sxh.g((tfm) this.a.N.io());
            case 598:
                return xwg.g(Optional.of((yrn) this.a.jJ.io()));
            case 599:
                ght ghtVar55 = this.a;
                return new hzn((hwz) ghtVar55.jH.io(), (ilx) ghtVar55.jI.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        Object xysVar;
        Object xrjVar;
        Object xnsVar;
        Object xplVar;
        int i = this.b;
        switch (i) {
            case 600:
                return new hwz();
            case 601:
                return new ilx();
            case 602:
                return xwg.f(Optional.of((yrk) this.a.kb.io()));
            case 603:
                ght ghtVar = this.a;
                return new aapg(ghtVar.iG, (abfv) ghtVar.iD.io(), (grj) ghtVar.jL.io(), (aauk) ghtVar.iL.io(), (hno) ghtVar.jZ.io());
            case 604:
                return new grj((aarf) this.a.iJ.io());
            case 605:
                ght ghtVar2 = this.a;
                vxz vxzVar = (vxz) ghtVar2.cL.io();
                vxu vxuVar = (vxu) ghtVar2.at.io();
                vyo vyoVar = (vyo) ghtVar2.av.io();
                vxz vxzVar2 = (vxz) ghtVar2.jN.io();
                vxz vxzVarEV = ghtVar2.eV();
                vxz vxzVar3 = (vxz) ghtVar2.cM.io();
                vxz vxzVar4 = (vxz) ghtVar2.jO.io();
                vxz vxzVar5 = (vxz) ghtVar2.cR.io();
                vxz vxzVarFb = ghtVar2.fb();
                vxz vxzVar6 = (vxz) ghtVar2.cS.io();
                ghtVar2.fk();
                return new hno(vxzVar, vxuVar, vyoVar, vxzVar2, vxzVarEV, vxzVar3, vxzVar4, vxzVar5, vxzVarFb, vxzVar6, (vxz) ghtVar2.cN.io(), (vxz) ghtVar2.jQ.io(), ghtVar2.eQ(), (vxz) ghtVar2.jR.io(), ghtVar2.eU(), (vxz) ghtVar2.cQ.io(), ghtVar2.jY);
            case 606:
                ght ghtVar3 = this.a;
                vxu vxuVar2 = (vxu) ghtVar3.at.io();
                vyo vyoVar2 = (vyo) ghtVar3.av.io();
                ght.fp();
                return new vxz(vxuVar2, vyoVar2, "ShortsClient");
            case 607:
                ght ghtVar4 = this.a;
                vxu vxuVar3 = (vxu) ghtVar4.at.io();
                vyo vyoVar3 = (vyo) ghtVar4.av.io();
                ght.fp();
                return new vxz(vxuVar3, vyoVar3, "LiveConsumptionClientConfig");
            case 608:
                ght ghtVar5 = this.a;
                vxu vxuVar4 = (vxu) ghtVar5.at.io();
                vyo vyoVar4 = (vyo) ghtVar5.av.io();
                ght.fp();
                return new vxz(vxuVar4, vyoVar4, "ShortsPlayer");
            case 609:
                ght ghtVar6 = this.a;
                vxu vxuVar5 = (vxu) ghtVar6.at.io();
                vyo vyoVar5 = (vyo) ghtVar6.av.io();
                ght.fp();
                return new vxz(vxuVar5, vyoVar5, "MainAppCoreClient");
            case 610:
                ght ghtVar7 = this.a;
                vxu vxuVar6 = (vxu) ghtVar7.at.io();
                vyo vyoVar6 = (vyo) ghtVar7.av.io();
                ght.fp();
                return new vxz(vxuVar6, vyoVar6, "AdsFormatsQualityClientShared");
            case 611:
                ght ghtVar8 = this.a;
                vxu vxuVar7 = (vxu) ghtVar8.at.io();
                vyo vyoVar7 = (vyo) ghtVar8.av.io();
                ght.fp();
                return new vxz(vxuVar7, vyoVar7, "MiscUiClientConfig");
            case 612:
                ght ghtVar9 = this.a;
                return aeff.d(ghtVar9.jW, ghtVar9.jX, (tqj) ghtVar9.q.io());
            case 613:
                return new aenv(this.a.aZ());
            case 614:
                return ((hhb) this.a.jU.io()).i(true, true);
            case 615:
                return new hhb(this);
            case 616:
                return new xgp();
            case 617:
                return new aenq();
            case 618:
                return zrp.u((ci) this.a.cG.io());
            case 619:
                return new wjr((xit) this.a.fa.io());
            case 620:
                ght ghtVar10 = this.a;
                xysVar = new xys((xeu) ghtVar10.aZ.io(), (xla) ghtVar10.de.io(), (ahey) ghtVar10.u.io(), (mbc) ghtVar10.l.io());
                return xysVar;
            case 621:
                ght ghtVar11 = this.a;
                return aaux.c((tqj) ghtVar11.q.io(), ghtVar11.kq, ghtVar11.ks);
            case 622:
                ght ghtVar12 = this.a;
                return ((hhb) ghtVar12.ko.io()).h((abvn) ghtVar12.kp.io());
            case 623:
                return new hhb(this);
            case 624:
                return new abjf(this.a.kk);
            case 625:
                return ((hhb) this.a.jU.io()).i(false, false);
            case 626:
                ght ghtVar13 = this.a;
                vxu vxuVar8 = (vxu) ghtVar13.at.io();
                vyo vyoVar8 = (vyo) ghtVar13.av.io();
                ght.fp();
                return new vxz(vxuVar8, vyoVar8, "MusicPlaybackClientConfig");
            case 627:
                ght ghtVar14 = this.a;
                return new xpl(ghtVar14.jS, ghtVar14.eW, ghtVar14.bP);
            case 628:
                return ((ci) this.a.cG.io()).ar();
            case 629:
                ght ghtVar15 = this.a;
                return ((qcb) ghtVar15.kr.io()).F((abvn) ghtVar15.kp.io());
            case 630:
                return new qcb(this);
            case 631:
                ght ghtVar16 = this.a;
                return new yed((tfq) ghtVar16.cd.io(), (SharedPreferences) ghtVar16.J.io());
            case 632:
                return new ghm(this);
            case 633:
                ght ghtVar17 = this.a;
                Context context = (Context) ghtVar17.v.io();
                yan yanVarAr = ghtVar17.ar();
                xmr xmrVar = (xmr) ghtVar17.dh.io();
                Executor executorDD = ghtVar17.dD();
                wjr wjrVar = (wjr) ghtVar17.oF.io();
                aupr auprVar = ghtVar17.kx;
                return new xmn(context, yanVarAr, xmrVar, executorDD, wjrVar, aupm.b(auprVar), aupm.b(auprVar), ghtVar17.oK, (xla) ghtVar17.de.io(), (wjr) ghtVar17.oL.io(), (vxz) ghtVar17.dd.io());
            case 634:
                ght ghtVar18 = this.a;
                xwv xwvVar = (xwv) ghtVar18.oC.io();
                xrjVar = new xrj(xwvVar, (xmr) ghtVar18.dh.io());
                return xrjVar;
            case 635:
                ght ghtVar19 = this.a;
                return xer.g(ghtVar19.oB, (xmr) ghtVar19.dh.io());
            case 636:
                ght ghtVar20 = this.a;
                aupr auprVar2 = ghtVar20.iF;
                abvn abvnVar = (abvn) ghtVar20.kp.io();
                return new xwt(auprVar2, abvnVar, (vxz) ghtVar20.dd.io(), (ci) ghtVar20.kz.io(), (mbc) ghtVar20.l.io());
            case 637:
                return new aajc();
            case 638:
                return new ci((byte[]) null, (char[]) null, (char[]) null);
            case 639:
                ght ghtVar21 = this.a;
                return new xya(ghtVar21.iF, (abvn) ghtVar21.kp.io(), Optional.of((hwz) ghtVar21.oA.io()), (xla) ghtVar21.de.io(), (ci) ghtVar21.kz.io(), (vxz) ghtVar21.dd.io(), (mbc) ghtVar21.l.io());
            case 640:
                ght ghtVar22 = this.a;
                xrjVar = new hwz((abjp) ghtVar22.mf.io(), (jkp) ghtVar22.cr.io());
                return xrjVar;
            case 641:
                ght ghtVar23 = this.a;
                return gzj.aB(ghtVar23.kB, ghtVar23.kC, (hfn) ghtVar23.kD.io(), (iby) ghtVar23.oy.io(), (awku) ghtVar23.oz.io(), (abmt) ghtVar23.cT.io());
            case 642:
                return geh.t((abvn) this.a.cH.io());
            case 643:
                return geh.r((abvn) this.a.cH.io());
            case 644:
                return new hfn((char[]) null, (byte[]) null);
            case 645:
                ght ghtVar24 = this.a;
                return new iby((icj) ghtVar24.nH.io(), (hfn) ghtVar24.kD.io(), (jkp) ghtVar24.cr.io(), aupm.b(ghtVar24.ot), (abea) ghtVar24.kt.io(), (hxd) ghtVar24.ov.io(), ghtVar24.aK(), (jnm) ghtVar24.cF.io(), ghtVar24.kB, (hfn) ghtVar24.ow.io(), (vxz) ghtVar24.cu.io(), (abmt) ghtVar24.cT.io(), (khn) ghtVar24.ox.io());
            case 646:
                ght ghtVar25 = this.a;
                return new icj((icl) ghtVar25.lI.io(), (axfd) ghtVar25.lK.io(), (hwz) ghtVar25.jH.io(), (icq) ghtVar25.lL.io(), (tbt) ghtVar25.I.io(), (hfn) ghtVar25.kD.io(), (hpy) ghtVar25.md.io(), (avmb) ghtVar25.dA.io(), aupm.b(ghtVar25.mj), aupm.b(ghtVar25.ml), aupm.b(ghtVar25.mm), (jij) ghtVar25.lH.io(), (icx) ghtVar25.mo.io(), (SecureRandom) ghtVar25.ay.io(), (jnj) ghtVar25.mp.io(), aupm.b(ghtVar25.kx), aupm.b(ghtVar25.nC), (isi) ghtVar25.mn.io(), aupm.b(ghtVar25.mi), (aerv) ghtVar25.bN.io(), (vxz) ghtVar25.km.io(), (abmt) ghtVar25.cT.io(), aupm.b(ghtVar25.oq), (awkx) ghtVar25.or.io());
            case 647:
                ght ghtVar26 = this.a;
                xrjVar = new icl((wuo) ghtVar26.lG.io(), (jij) ghtVar26.lH.io());
                return xrjVar;
            case 648:
                ght ghtVar27 = this.a;
                return new wuo((abxv) ghtVar27.gK.io(), agdf.b(), ghtVar27.be, ghtVar27.bp, (wup) ghtVar27.ls.io(), ghtVar27.am(), (vyo) ghtVar27.av.io(), (tqj) ghtVar27.q.io());
            case 649:
                ght ghtVar28 = this.a;
                wlp wlpVar = (wlp) ghtVar28.kE.io();
                abxv abxvVar = (abxv) ghtVar28.gK.io();
                zwb zwbVar = (zwb) ghtVar28.bd.io();
                vxu vxuVar9 = (vxu) ghtVar28.at.io();
                vyo vyoVar9 = (vyo) ghtVar28.av.io();
                Set setDC = ghtVar28.dC();
                return new wup(wlpVar, abxvVar, zwbVar, vxuVar9, vyoVar9, setDC, ghtVar28.eH(), (vxz) ghtVar28.cL.io(), (ahbw) ghtVar28.cx.io(), (tqj) ghtVar28.q.io());
            case 650:
                ght ghtVar29 = this.a;
                return new xmw(ghtVar29.le, ghtVar29.lf, aupm.b(ghtVar29.lg), ghtVar29.lk, (Executor) ghtVar29.B.io(), ghtVar29.kx, aupm.b(ghtVar29.kQ), ghtVar29.ln, aupm.b(ghtVar29.de), aupm.b(ghtVar29.dd));
            case 651:
                ght ghtVar30 = this.a;
                return new yar((Executor) ghtVar30.u.io(), (xns) ghtVar30.kG.io(), ghtVar30.ku, ghtVar30.kN, aupm.b(ghtVar30.kT), ghtVar30.kx, (xnx) ghtVar30.kZ.io(), (xla) ghtVar30.de.io(), (mbc) ghtVar30.l.io(), ghtVar30.la, (avmb) ghtVar30.dC.io(), ghtVar30.ld, (ahey) ghtVar30.u.io(), (vxz) ghtVar30.dd.io());
            case 652:
                ght ghtVar31 = this.a;
                tft tftVar = (tft) ghtVar31.kF.io();
                ghtVar31.cM();
                xnsVar = new xns(tftVar, (xla) ghtVar31.de.io(), (vxz) ghtVar31.aL.io());
                return xnsVar;
            case 653:
                return zik.cw((ayq) this.a.dc.io());
            case 654:
                ght ghtVar32 = this.a;
                return new aesp((Context) ghtVar32.v.io(), (ahex) ghtVar32.u.io(), (xwo) ghtVar32.kI.io(), ghtVar32.kx, (xwj) ghtVar32.dj.io(), (xwm) ghtVar32.kK.io(), (xwq) ghtVar32.kM.io(), (vxz) ghtVar32.dd.io());
            case 655:
                ght ghtVar33 = this.a;
                xrjVar = new xwo((tft) ghtVar33.kH.io(), (axfd) ghtVar33.di.io());
                return xrjVar;
            case 656:
                return zik.cz((ayq) this.a.dc.io());
            case 657:
                ght ghtVar34 = this.a;
                xrjVar = new xwm((qrx) ghtVar34.kJ.io(), (xla) ghtVar34.de.io());
                return xrjVar;
            case 658:
                ght ghtVar35 = this.a;
                return xer.r((Context) ghtVar35.v.io(), ght.eF(), (ahex) ghtVar35.u.io(), (rrq) ghtVar35.bh.io());
            case 659:
                ght ghtVar36 = this.a;
                xrjVar = new xwq((tft) ghtVar36.kL.io(), (axfd) ghtVar36.di.io());
                return xrjVar;
            case 660:
                ght ghtVar37 = this.a;
                return zik.cx((ayq) ghtVar37.dc.io(), (xla) ghtVar37.de.io());
            case 661:
                ght ghtVar38 = this.a;
                Context context2 = (Context) ghtVar38.v.io();
                ghtVar38.fm();
                return new ycd(context2, ghtVar38.bv(), (awut) ghtVar38.bo.io(), (awut) ghtVar38.bm.io(), (vxz) ghtVar38.dd.io(), aupm.b(ghtVar38.kP), (dov) ghtVar38.kQ.io(), aupm.b(ghtVar38.kx), (awou) ghtVar38.eK.io(), (oml) ghtVar38.F.io(), aupm.b(ghtVar38.kS), aupm.b(ghtVar38.bd));
            case 662:
                ght ghtVar39 = this.a;
                return new ybc((wlp) ghtVar39.kE.io(), (abxv) ghtVar39.gK.io(), (tgg) ghtVar39.bv.io(), (Executor) ghtVar39.u.io(), (vxz) ghtVar39.aw.io(), (zwb) ghtVar39.bd.io(), (xmw) ghtVar39.kO.io());
            case 663:
                return new dov((ahex) this.a.u.io());
            case 664:
                return new ybi(aupm.b(this.a.kR));
            case 665:
                ght ghtVar40 = this.a;
                return new ybk(aupm.b(ghtVar40.kE), aupm.b(ghtVar40.gK), aupm.b(ghtVar40.bp), aupm.b(ghtVar40.kO));
            case 666:
                ght ghtVar41 = this.a;
                return new xnx(aupm.b(ghtVar41.kY), ghtVar41.Q, (tqj) ghtVar41.q.io(), (awut) ghtVar41.bo.io());
            case 667:
                ght ghtVar42 = this.a;
                ghtVar42.cK();
                return new xnv((xns) ghtVar42.kG.io(), ghtVar42.kU, (tft) ghtVar42.kF.io(), (xnp) ghtVar42.kW.io(), (yed) ghtVar42.ku.io(), (xeu) ghtVar42.aZ.io(), (mbc) ghtVar42.l.io(), (xla) ghtVar42.de.io(), (vxz) ghtVar42.aL.io(), aupm.b(ghtVar42.kX), ghtVar42.bM(), new xof());
            case 668:
                ght ghtVar43 = this.a;
                vyo vyoVar10 = (vyo) ghtVar43.av.io();
                ghtVar43.cM();
                xplVar = new xpl(vyoVar10);
                return xplVar;
            case 669:
                ght ghtVar44 = this.a;
                xnsVar = new xnp((qrx) ghtVar44.kV.io(), (mbc) ghtVar44.l.io(), (xla) ghtVar44.de.io());
                return xnsVar;
            case 670:
                ght ghtVar45 = this.a;
                return xer.q((Context) ghtVar45.v.io(), ght.eF(), (ahex) ghtVar45.u.io(), (rrq) ghtVar45.bh.io());
            case 671:
                ght ghtVar46 = this.a;
                return new xpo((Context) ghtVar46.v.io(), (vxz) ghtVar46.dd.io(), ghtVar46.cd);
            case 672:
                return new yea(this.a.k());
            case 673:
                ght ghtVar47 = this.a;
                xnsVar = new xsc(ghtVar47.lc, (mbc) ghtVar47.l.io(), (xla) ghtVar47.de.io());
                return xnsVar;
            case 674:
                return new yck((tpq) this.a.lb.io());
            case 675:
                return zik.cE(this.a.gM());
            case 676:
                return zik.bM((Context) this.a.v.io());
            case 677:
                ght ghtVar48 = this.a;
                ghtVar48.cH();
                return xer.i(ghtVar48.cN());
            case 678:
                ght ghtVar49 = this.a;
                xysVar = new abxv((awmd) ghtVar49.lf, ghtVar49.aq(), (ahex) ghtVar49.u.io(), (Executor) ghtVar49.B.io());
                return xysVar;
            case 679:
                ght ghtVar50 = this.a;
                return gzj.bS((vxu) ghtVar50.at.io(), (axfd) ghtVar50.cE.io());
            case 680:
                return xer.f((SharedPreferences) this.a.J.io());
            case 681:
                ght ghtVar51 = this.a;
                Executor executor = (Executor) ghtVar51.B.io();
                ahex ahexVar = (ahex) ghtVar51.u.io();
                dov dovVar = (dov) ghtVar51.kQ.io();
                ghtVar51.cH();
                xplVar = new xrx(executor, ahexVar, dovVar);
                return xplVar;
            case 682:
                ght ghtVar52 = this.a;
                xysVar = new ydu((yds) ghtVar52.lm.io(), (mbc) ghtVar52.l.io(), (SharedPreferences) ghtVar52.J.io(), (Executor) ghtVar52.u.io());
                return xysVar;
            case 683:
                ght ghtVar53 = this.a;
                xrjVar = new yds(ghtVar53.ll, (mbc) ghtVar53.l.io());
                return xrjVar;
            case 684:
                ght ghtVar54 = this.a;
                return zik.bX((Context) ghtVar54.v.io(), ght.eF(), (abxu) ghtVar54.dy.io(), (rrq) ghtVar54.bh.io());
            case 685:
                return pox.r(this.a.lp);
            case 686:
                ght ghtVar55 = this.a;
                return rmp.r((rsi) ghtVar55.dq.io(), (mbc) ghtVar55.l.io(), (tpq) ghtVar55.lo.io(), (tfq) ghtVar55.cd.io(), (sdr) ghtVar55.dK.io(), ghtVar55.eu(), ghtVar55.et(), (tun) ghtVar55.bc.io());
            case 687:
                ght ghtVar56 = this.a;
                return pox.s((Context) ghtVar56.v.io(), ghtVar56.bh, ght.eF(), (ahey) ghtVar56.u.io(), Optional.empty());
            case 688:
                return new wjr((mbc) this.a.l.io(), new twq(1000L, 30000L, 5L, -1L, 2.0d));
            case 689:
                ght ghtVar57 = this.a;
                return vql.i(ghtVar57.lE, (tag) ghtVar57.bO.io());
            case 690:
                return new agqj((wjw) this.a.lD.io());
            case 691:
                ght ghtVar58 = this.a;
                return new wjv(aupm.b(ghtVar58.lC), aupm.b(ghtVar58.lA));
            case 692:
                ght ghtVar59 = this.a;
                tbt tbtVar = (tbt) ghtVar59.I.io();
                Executor executor2 = (Executor) ghtVar59.u.io();
                aupr auprVar3 = ghtVar59.lt;
                aupr auprVar4 = ghtVar59.iF;
                aupr auprVar5 = ghtVar59.kp;
                aupr auprVar6 = ghtVar59.lv;
                abix abixVar = (abix) ghtVar59.ly.io();
                vxu vxuVar10 = (vxu) ghtVar59.at.io();
                agev agevVarI = agev.i(ghtVar59.fR());
                Map mapCV = ghtVar59.cV();
                abvc abvcVar = (abvc) ghtVar59.lB.io();
                ghtVar59.fq();
                return new abzi(tbtVar, executor2, auprVar3, auprVar4, auprVar5, auprVar6, abixVar, vxuVar10, agevVarI, mapCV, abvcVar, (xit) ghtVar59.fa.io(), (abmt) ghtVar59.cT.io());
            case 693:
                ght ghtVar60 = this.a;
                abpd abpdVarAL = ghtVar60.aL();
                vyo vyoVar11 = (vyo) ghtVar60.av.io();
                ghtVar60.fn();
                return new abss(abpdVarAL, vyoVar11, (zgm) ghtVar60.il.io(), (txp) ghtVar60.aS.io(), (axfd) ghtVar60.gn.io(), (abmt) ghtVar60.cT.io());
            case 694:
                ght ghtVar61 = this.a;
                xnsVar = new xsc((abqq) ghtVar61.lu.io(), (yob) ghtVar61.ia.io(), (Executor) ghtVar61.u.io());
                return xnsVar;
            case 695:
                ght ghtVar62 = this.a;
                agfr agfrVar = (agfr) ghtVar62.ho.io();
                Key key = (Key) ghtVar62.hp.io();
                zgy zgyVar = (zgy) ghtVar62.hQ.io();
                zgy zgyVar2 = (zgy) ghtVar62.it.io();
                mbc mbcVar = (mbc) ghtVar62.l.io();
                ygf ygfVar = (ygf) ghtVar62.hR.io();
                tgr tgrVar = (tgr) ghtVar62.f28io.io();
                Optional optionalEmpty = Optional.empty();
                zjr zjrVar = (zjr) ghtVar62.gI.io();
                return new abqq(agfrVar, key, zgyVar, zgyVar2, mbcVar, ygfVar, tgrVar, optionalEmpty, zjrVar);
            case 696:
                ght ghtVar63 = this.a;
                xrjVar = new abix((tpq) ghtVar63.lx.io(), (abvn) ghtVar63.kp.io());
                return xrjVar;
            case 697:
                return aaux.d(this.a.lw);
            case 698:
                ght ghtVar64 = this.a;
                return aaux.t((Context) ghtVar64.v.io(), ght.eF(), (ahex) ghtVar64.u.io(), (rrq) ghtVar64.bh.io(), (ayq) ghtVar64.bA.io());
            case 699:
                return new grj((zkh) this.a.lz.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        Object axfdVar;
        Object hnaVar;
        Object jnmVar;
        Object zzfVar;
        int i = this.b;
        switch (i) {
            case 700:
                return new zkh((Context) this.a.v.io());
            case 701:
                return xwg.u((ci) this.a.cG.io());
            case 702:
                ght ghtVar = this.a;
                return new jij(aupm.b(ghtVar.cH), (avmb) ghtVar.dE.io());
            case 703:
                ght ghtVar2 = this.a;
                axfdVar = new axfd((tbt) ghtVar2.I.io(), (wuo) ghtVar2.lG.io(), (wup) ghtVar2.ls.io(), (abqw) ghtVar2.lJ.io(), (mbc) ghtVar2.l.io());
                return axfdVar;
            case 704:
                ght ghtVar3 = this.a;
                return new abqw((tqj) ghtVar3.q.io(), ghtVar3.eO);
            case 705:
                ght ghtVar4 = this.a;
                axfdVar = new icq((abea) ghtVar4.kt.io(), (aerv) ghtVar4.bN.io(), (vxz) ghtVar4.km.io(), (vxz) ghtVar4.dS.io(), (abte) ghtVar4.iS.io());
                return axfdVar;
            case 706:
                ght ghtVar5 = this.a;
                axfdVar = new hps((jan) ghtVar5.lO.io(), (how) ghtVar5.me.io(), (wbz) ghtVar5.es.io(), (wco) ghtVar5.jy.io(), (zwb) ghtVar5.bd.io(), ghtVar5.bw(), (Executor) ghtVar5.z.io(), (aauk) ghtVar5.iL.io());
                return axfdVar;
            case 707:
                ght ghtVar6 = this.a;
                axfdVar = new jan((Executor) ghtVar6.u.io(), (aanb) ghtVar6.iG.io(), (hqg) ghtVar6.mb.io(), (hlz) ghtVar6.lS.io(), (jnm) ghtVar6.lQ.io(), (hef) ghtVar6.lR.io(), (jnm) ghtVar6.lT.io(), (jnm) ghtVar6.mc.io());
                return axfdVar;
            case 708:
                ght ghtVar7 = this.a;
                axfdVar = new hqg(ghtVar7.lM, ghtVar7.I, ghtVar7.lN, ghtVar7.lO, ghtVar7.lQ, ghtVar7.lR, ghtVar7.lT, (wbz) ghtVar7.es.io(), (zwb) ghtVar7.bd.io(), ghtVar7.iG, ghtVar7.lS, ghtVar7.cu, ghtVar7.bw(), ght.ez(), (Executor) ghtVar7.z.io(), (Executor) ghtVar7.u.io(), (aauk) ghtVar7.iL.io());
                return axfdVar;
            case 709:
                hnaVar = new hna(null);
                return hnaVar;
            case 710:
                return zik.aV((Executor) this.a.u.io());
            case 711:
                ght ghtVar8 = this.a;
                jnmVar = new jnm((wbz) ghtVar8.es.io(), (Object) ghtVar8.fI(), (zwb) ghtVar8.bd.io(), ghtVar8.lP.io());
                return jnmVar;
            case 712:
                ght ghtVar9 = this.a;
                axfdVar = new aahg(ghtVar9.iG, (abxu) ghtVar9.dt.io(), ghtVar9.jy, ghtVar9.I, (vxz) ghtVar9.cN.io(), (aauk) ghtVar9.iL.io());
                return axfdVar;
            case 713:
                ght ghtVar10 = this.a;
                return new hef((wbz) ghtVar10.es.io(), (zwb) ghtVar10.bd.io());
            case 714:
                ght ghtVar11 = this.a;
                jnmVar = new jnm((wbz) ghtVar11.es.io(), ghtVar11.lS.io(), (zwb) ghtVar11.bd.io(), (Object) ghtVar11.iG);
                return jnmVar;
            case 715:
                ght ghtVar12 = this.a;
                return new hlz((Context) ghtVar12.v.io(), (abxv) ghtVar12.iK.io(), (hbf) ghtVar12.cz.io(), (vxz) ghtVar12.cu.io());
            case 716:
                ght ghtVar13 = this.a;
                axfdVar = new aahf(ghtVar13.iG, (abxu) ghtVar13.dt.io(), ghtVar13.jy, ghtVar13.I, (vxz) ghtVar13.cN.io(), (aauk) ghtVar13.iL.io());
                return axfdVar;
            case 717:
                ght ghtVar14 = this.a;
                axfdVar = new aahh(ghtVar14.iG, (abxu) ghtVar14.dt.io(), ghtVar14.jy, ghtVar14.I, (vxz) ghtVar14.cN.io(), (aauk) ghtVar14.iL.io());
                return axfdVar;
            case 718:
                ght ghtVar15 = this.a;
                axfdVar = new aahe(ghtVar15.iG, (abxu) ghtVar15.dt.io(), ghtVar15.jy, ghtVar15.I, (vxz) ghtVar15.cN.io(), (aauk) ghtVar15.iL.io());
                return axfdVar;
            case 719:
                ght ghtVar16 = this.a;
                axfdVar = new aald(ghtVar16.iG, (Executor) ghtVar16.u.io(), ghtVar16.jy, ghtVar16.I, (hwz) ghtVar16.lY.io(), (aauk) ghtVar16.iL.io());
                return axfdVar;
            case 720:
                ght ghtVar17 = this.a;
                return new hwz(ghtVar17.fI(), ghtVar17.iL.io());
            case 721:
                ght ghtVar18 = this.a;
                return new hpx((Executor) ghtVar18.u.io(), ghtVar18.jy);
            case 722:
                ght ghtVar19 = this.a;
                jnmVar = new jnm((wbz) ghtVar19.es.io(), (hlz) ghtVar19.lS.io(), ghtVar19.fI(), (zwb) ghtVar19.bd.io());
                return jnmVar;
            case 723:
                ght ghtVar20 = this.a;
                axfdVar = new how((wbz) ghtVar20.es.io(), (zwb) ghtVar20.bd.io(), ghtVar20.md, ghtVar20.lN, (Executor) ghtVar20.z.io(), ghtVar20.I);
                return axfdVar;
            case 724:
                return gly.t((jan) this.a.mi.io());
            case 725:
                ght ghtVar21 = this.a;
                axfdVar = new jan(aupm.b(ghtVar21.cY), (abjp) ghtVar21.mf.io(), (ycp) ghtVar21.kx.io(), (avlh) ghtVar21.mh.io(), (abvn) ghtVar21.cH.io(), ghtVar21.kB, (avmb) ghtVar21.dA.io());
                return axfdVar;
            case 726:
                return ((awkx) this.a.mg.io()).P();
            case 727:
                return new awkx();
            case 728:
                return ((hfn) this.a.mk.io()).aq();
            case 729:
                hnaVar = new hfn((byte[]) null, (char[]) null);
                return hnaVar;
            case 730:
                return new awku();
            case 731:
                ght ghtVar22 = this.a;
                axfdVar = new icx(aupm.b(ghtVar22.cH), aupm.b(ghtVar22.mf), aupm.b(ghtVar22.mn), (avmb) ghtVar22.dE.io(), (mbc) ghtVar22.l.io());
                return axfdVar;
            case 732:
                return new isi(this.a.mf);
            case 733:
                ght ghtVar23 = this.a;
                axfdVar = new jnj((vxu) ghtVar23.at.io(), (vyo) ghtVar23.av.io(), (vxz) ghtVar23.cu.io(), (vxz) ghtVar23.et.io(), (vxz) ghtVar23.km.io(), (zwb) ghtVar23.bd.io());
                return axfdVar;
            case 734:
                ght ghtVar24 = this.a;
                axfdVar = new aczl(ghtVar24.gy(), (isi) ghtVar24.mn.io(), (vwx) ghtVar24.mA.io(), (aerv) ghtVar24.bN.io(), (ycp) ghtVar24.kx.io(), (jij) ghtVar24.lH.io(), (vxz) ghtVar24.dd.io());
                return axfdVar;
            case 735:
                ght ghtVar25 = this.a;
                axfdVar = new wsl((wlp) ghtVar25.kE.io(), (abxv) ghtVar25.gK.io(), (zwb) ghtVar25.bd.io(), (tgg) ghtVar25.ms.io(), (tbt) ghtVar25.I.io(), (wbz) ghtVar25.es.io(), Optional.of(ghtVar25.gQ()), (vxz) ghtVar25.cR.io(), (vxz) ghtVar25.cu.io());
                return axfdVar;
            case 736:
                ght ghtVar26 = this.a;
                return vql.m((tqj) ghtVar26.q.io(), aupm.b(ghtVar26.mq), aupm.b(ghtVar26.mr));
            case 737:
                ght ghtVar27 = this.a;
                return vql.o((vvn) ghtVar27.fL.io(), (tgm) ghtVar27.bf.io(), (tmo) ghtVar27.gS.io(), (Optional) ghtVar27.gR.io(), (tgl) ghtVar27.bk.io(), (ExecutorService) ghtVar27.z.io(), (ExecutorService) ghtVar27.u.io(), (Executor) ghtVar27.B.io());
            case 738:
                ght ghtVar28 = this.a;
                return vkz.g((vvn) ghtVar28.fL.io(), (tgm) ghtVar28.bf.io(), (tmo) ghtVar28.gS.io(), (Optional) ghtVar28.gR.io(), (tgl) ghtVar28.bk.io(), (ExecutorService) ghtVar28.z.io(), (awut) ghtVar28.bo.io(), (ExecutorService) ghtVar28.u.io(), (awut) ghtVar28.bm.io(), (Executor) ghtVar28.B.io());
            case 739:
                ght ghtVar29 = this.a;
                return vql.r(ghtVar29.ae(), ghtVar29.bA());
            case 740:
                ght ghtVar30 = this.a;
                return new war((hed) ghtVar30.jz.io(), (zwb) ghtVar30.bd.io());
            case 741:
                return new gvq((iir) this.a.mx.io());
            case 742:
                ght ghtVar31 = this.a;
                return new iir((tbt) ghtVar31.I.io(), (hef) ghtVar31.mw.io());
            case 743:
                ght ghtVar32 = this.a;
                return new hef((zwb) ghtVar32.bd.io(), (qrx) ghtVar32.mv.io());
            case 744:
                ght ghtVar33 = this.a;
                return idj.n((Context) ghtVar33.v.io(), (rrq) ghtVar33.bh.io());
            case 745:
                return new gtd(aupm.b(this.a.mi));
            case 746:
                ght ghtVar34 = this.a;
                return new gxd(ghtVar34.nE, ghtVar34.mA);
            case 747:
                ght ghtVar35 = this.a;
                axfdVar = new ico((Executor) ghtVar35.B.io(), (abjp) ghtVar35.mf.io(), ghtVar35.kB, ghtVar35.kC, ghtVar35.gm(), (tbt) ghtVar35.I.io(), ghtVar35.gH(), (hwz) ghtVar35.jH.io(), ghtVar35.lK, ghtVar35.nv, (hfn) ghtVar35.kD.io(), (jnj) ghtVar35.mp.io(), (hzi) ghtVar35.nw.io(), (jnm) ghtVar35.nB.io(), aupm.b(ghtVar35.nC), (isi) ghtVar35.mn.io(), aupm.b(ghtVar35.ml), (aerv) ghtVar35.bN.io(), (vxz) ghtVar35.km.io(), (awku) ghtVar35.nD.io());
                return axfdVar;
            case 748:
                ght ghtVar36 = this.a;
                jnmVar = new hpd((Context) ghtVar36.v.io(), (hpy) ghtVar36.md.io(), (mbc) ghtVar36.l.io(), (Executor) ghtVar36.z.io());
                return jnmVar;
            case 749:
                ght ghtVar37 = this.a;
                jnmVar = new hpb((hpy) ghtVar37.md.io(), (hpd) ghtVar37.mB.io(), (Executor) ghtVar37.z.io(), (Executor) ghtVar37.u.io());
                return jnmVar;
            case 750:
                axfdVar = new hfn(this.a.bz(), (byte[]) null);
                return axfdVar;
            case 751:
                ght ghtVar38 = this.a;
                return idj.e((vxz) ghtVar38.cu.io(), ghtVar38.mM, ghtVar38.mO);
            case 752:
                ght ghtVar39 = this.a;
                axfdVar = new iuo((Context) ghtVar39.v.io(), (Executor) ghtVar39.z.io(), (Executor) ghtVar39.u.io(), ghtVar39.es, (hfn) ghtVar39.mD.io(), (hfn) ghtVar39.mE.io(), (hfn) ghtVar39.mF.io(), (hfn) ghtVar39.mG.io(), (klc) ghtVar39.mI.io(), (jij) ghtVar39.mL.io(), (vxz) ghtVar39.cu.io());
                return axfdVar;
            case 753:
                return new hfn((ayq) this.a.jl.io());
            case 754:
                return new hfn((xeu) this.a.aZ.io());
            case 755:
                return new hfn((xeu) this.a.aZ.io());
            case 756:
                return new hfn((xeu) this.a.aZ.io());
            case 757:
                ght ghtVar40 = this.a;
                return new klc((qrx) ghtVar40.mH.io(), (Executor) ghtVar40.z.io());
            case 758:
                ght ghtVar41 = this.a;
                return idj.o((Context) ghtVar41.v.io(), (rrq) ghtVar41.bh.io());
            case 759:
                ght ghtVar42 = this.a;
                abhh abhhVarGl = ghtVar42.gl();
                Context context = (Context) ghtVar42.v.io();
                ahex ahexVar = (ahex) ghtVar42.T.io();
                hnaVar = new jij(abhhVarGl, context, ahexVar, (byte[]) null);
                return hnaVar;
            case 760:
                hnaVar = new ahpu((byte[]) null, (byte[]) null);
                return hnaVar;
            case 761:
                ght ghtVar43 = this.a;
                axfdVar = new iuf((Context) ghtVar43.v.io(), (Executor) ghtVar43.z.io(), (Executor) ghtVar43.u.io(), aupm.b(ghtVar43.mD), aupm.b(ghtVar43.mE), aupm.b(ghtVar43.mF), aupm.b(ghtVar43.mG), aupm.b(ghtVar43.mI), (jij) ghtVar43.mL.io(), aupm.b(ghtVar43.mN), (mbc) ghtVar43.l.io(), (vxz) ghtVar43.cu.io());
                return axfdVar;
            case 762:
                ght ghtVar44 = this.a;
                return new hcb((wbz) ghtVar44.es.io(), (zwb) ghtVar44.bd.io());
            case 763:
                hnaVar = new hfn((byte[]) null, (byte[]) null);
                return hnaVar;
            case 764:
                return gzj.aj();
            case 765:
                return new icu((abea) this.a.kt.io());
            case 766:
                ght ghtVar45 = this.a;
                axfdVar = new iao((Context) ghtVar45.v.io(), (hpd) ghtVar45.mB.io(), (axfd) ghtVar45.lK.io(), (tfq) ghtVar45.cd.io(), (ahgb) ghtVar45.cw(), (ScheduledExecutorService) ghtVar45.u.io(), (aaqj) ghtVar45.nu.io(), (kyr) ghtVar45.ns.io(), Optional.empty());
                return axfdVar;
            case 767:
                ght ghtVar46 = this.a;
                return gly.b(ghtVar46.ei(), ghtVar46.n(), ghtVar46.nn, ghtVar46.no);
            case 768:
                return new JavaRuntime.AndroidManifestLoader((Context) this.a.v.io());
            case 769:
                return geh.q(new gim(this.a));
            case 770:
                ght ghtVar47 = this.a;
                return new jah(Optional.of((DirectUpdateDataRelay) ghtVar47.mZ.io()), (zzf) ghtVar47.na.io(), (vxz) ghtVar47.et.io(), (avmb) ghtVar47.dA.io());
            case 771:
                ght ghtVar48 = this.a;
                return idj.p(ghtVar48.Gw, (nuc) ghtVar48.mY.io());
            case 772:
                ght ghtVar49 = this.a;
                return nyr.c(agdf.b(), agev.i((Boolean) ghtVar49.ed.io()), aupm.b(ghtVar49.mX));
            case 773:
                return new npf(this.a.ee);
            case 774:
                ght ghtVar50 = this.a;
                zzfVar = new zzf(ghtVar50.O, (vxz) ghtVar50.dP.io(), (avmb) ghtVar50.dC.io());
                return zzfVar;
            case 775:
                return agev.i(Boolean.valueOf(this.a.eg()));
            case 776:
                return new aclk();
            case 777:
                return new gzj();
            case 778:
                ght ghtVar51 = this.a;
                return vyr.c(ghtVar51.ef(), ghtVar51.nl, ghtVar51.nm);
            case 779:
                ght ghtVar52 = this.a;
                axfdVar = new wag(ghtVar52.nf, ghtVar52.eM(), ghtVar52.gR(), (ahex) ghtVar52.z.io(), ghtVar52.ng, ghtVar52.nk, agkj.i());
                return axfdVar;
            case 780:
                ght ghtVar53 = this.a;
                axfdVar = new afip(ghtVar53.fm, (adak) ghtVar53.fg.io(), ghtVar53.nh, ghtVar53.ni, (ahex) ghtVar53.z.io());
                return axfdVar;
            case 781:
                ght ghtVar54 = this.a;
                return new wal((afip) ghtVar54.nf.io(), ghtVar54.ng);
            case 782:
                ght ghtVar55 = this.a;
                axfdVar = new wah((zwy) ghtVar55.fa.io(), (zvl) ghtVar55.dO.io(), (szb) ghtVar55.eU.io(), ghtVar55.eM(), (xil) ghtVar55.fh.io());
                return axfdVar;
            case 783:
                return new wam((afip) this.a.nf.io());
            case 784:
                return new agqj(this.a.fy());
            case 785:
                ght ghtVar56 = this.a;
                jnmVar = new wai(ghtVar56.eM(), ghtVar56.gR(), ghtVar56.nk, agkj.i());
                return jnmVar;
            case 786:
                return vyr.b(this.a.nl);
            case 787:
                ght ghtVar57 = this.a;
                return new gmj((syn) ghtVar57.cs.io(), (zwb) ghtVar57.bd.io(), (tbt) ghtVar57.I.io(), (Context) ghtVar57.v.io(), (awut) ghtVar57.bm.io(), (Executor) ghtVar57.t.io());
            case 788:
                return new hzx(aupm.b(this.a.nt));
            case 789:
                ght ghtVar58 = this.a;
                axfdVar = new iae(ghtVar58.v, ghtVar58.nr, ghtVar58.mB, ghtVar58.md, ghtVar58.ns, ghtVar58.z, ghtVar58.cz);
                return axfdVar;
            case 790:
                ght ghtVar59 = this.a;
                axfdVar = new hpk((hbf) ghtVar59.cz.io(), (hpy) ghtVar59.md.io(), (hpd) ghtVar59.mB.io(), (hpb) ghtVar59.mC.io(), (vxz) ghtVar59.et.io(), (Executor) ghtVar59.u.io(), (Executor) ghtVar59.z.io());
                return axfdVar;
            case 791:
                ght ghtVar60 = this.a;
                zzfVar = new kyr(ghtVar60.mB.io(), ghtVar60.km.io(), (byte[]) null);
                return zzfVar;
            case 792:
                ght ghtVar61 = this.a;
                return new hzi((xit) ghtVar61.fa.io(), (abvn) ghtVar61.cH.io(), (abea) ghtVar61.kt.io(), (vxz) ghtVar61.km.io());
            case 793:
                ght ghtVar62 = this.a;
                jnmVar = new jnm((awmd) ghtVar62.ny, (hzl) ghtVar62.nA.io(), (awmd) ghtVar62.mf, (vxz) ghtVar62.km.io());
                return jnmVar;
            case 794:
                ght ghtVar63 = this.a;
                return gzj.bR(ghtVar63.nx, (axfd) ghtVar63.cE.io());
            case 795:
                return gzj.al((ycp) this.a.kx.io());
            case 796:
                ght ghtVar64 = this.a;
                return new hzl((Context) ghtVar64.v.io(), (heg) ghtVar64.nz.io());
            case 797:
                return new heg();
            case 798:
                return new awku();
            case 799:
                ght ghtVar65 = this.a;
                return new gyk(ghtVar65.mA, (ahey) ghtVar65.du.io());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final Object q() {
        Object gwrVar;
        Object xplVar;
        Object wofVar;
        Object jnmVar;
        int i = this.b;
        switch (i) {
            case 800:
                gwrVar = new gwr((icj) this.a.nH.io());
                return gwrVar;
            case 801:
                ght ghtVar = this.a;
                gwrVar = new vvq((Context) ghtVar.v.io(), (tbt) ghtVar.I.io());
                return gwrVar;
            case 802:
                gwrVar = new gwp(this.a.nL);
                return gwrVar;
            case 803:
                ght ghtVar2 = this.a;
                gwrVar = new iet(ghtVar2.nK, ghtVar2.mf, (zwb) ghtVar2.bd.io(), (avmb) ghtVar2.dE.io(), (avmb) ghtVar2.dA.io(), (Executor) ghtVar2.B.io());
                return gwrVar;
            case 804:
                ght ghtVar3 = this.a;
                xplVar = new xpl((Context) ghtVar3.v.io(), (syn) ghtVar3.cs.io());
                return xplVar;
            case 805:
                gwrVar = new gws((ilp) this.a.nN.io());
                return gwrVar;
            case 806:
                ght ghtVar4 = this.a;
                gwrVar = new ilp((Context) ghtVar4.v.io(), (icj) ghtVar4.nH.io(), aupm.b(ghtVar4.bd), aupm.b(ghtVar4.cs), (ico) ghtVar4.nE.io(), aupm.b(ghtVar4.jy), aupm.b(ghtVar4.es), aupm.b(ghtVar4.cx), aupm.b(ghtVar4.dE), (Executor) ghtVar4.z.io());
                return gwrVar;
            case 807:
                gwrVar = new gvh((vwe) this.a.nT.io());
                return gwrVar;
            case 808:
                gwrVar = new vwe(this.a.nS);
                return gwrVar;
            case 809:
                ght ghtVar5 = this.a;
                gwrVar = new vwb((ScheduledExecutorService) ghtVar5.u.io(), (dov) ghtVar5.ft.io(), (zwb) ghtVar5.bd.io(), (zvu) ghtVar5.bd.io(), (wof) ghtVar5.nP.io(), (wof) ghtVar5.nQ.io(), (ek) ghtVar5.nR.io());
                return gwrVar;
            case 810:
                ght ghtVar6 = this.a;
                gwrVar = new wof((wlp) ghtVar6.kE.io(), (abxv) ghtVar6.gK.io(), ghtVar6.mr, null);
                return gwrVar;
            case 811:
                ght ghtVar7 = this.a;
                wofVar = new wof((wlp) ghtVar7.kE.io(), (abxv) ghtVar7.gK.io(), ghtVar7.mr);
                return wofVar;
            case 812:
                gwrVar = new ek((Context) this.a.v.io());
                return gwrVar;
            case 813:
                ght ghtVar8 = this.a;
                gwrVar = new aczl((Context) ghtVar8.v.io(), aupm.b(ghtVar8.cH), (avmb) ghtVar8.dA.io(), aupm.b(ghtVar8.op), aupm.b(ghtVar8.mp));
                return gwrVar;
            case 814:
                ght ghtVar9 = this.a;
                gwrVar = new ied(aupm.b(ghtVar9.kB), ghtVar9.bX(), (hwv) ghtVar9.nW.io(), aupm.b(ghtVar9.oj), (ycp) ghtVar9.kx.io(), aupm.b(ghtVar9.mf), aupm.b(ghtVar9.nH), aupm.b(ghtVar9.ok), aupm.b(ghtVar9.lH), aupm.b(ghtVar9.mn), (Executor) ghtVar9.B.io(), (Executor) ghtVar9.u.io(), (ScheduledExecutorService) ghtVar9.u.io(), aupm.b(ghtVar9.lL), (aerv) ghtVar9.bN.io(), ghtVar9.om, (iee) ghtVar9.on.io(), aupm.b(ghtVar9.nz), aupm.b(ghtVar9.I), aupm.b(ghtVar9.oo), (vxz) ghtVar9.km.io(), (vxz) ghtVar9.cN.io());
                return gwrVar;
            case 815:
                ght ghtVar10 = this.a;
                xplVar = new hwv((abvn) ghtVar10.cH.io(), Optional.of((abvn) ghtVar10.mW.io()));
                return xplVar;
            case 816:
                ght ghtVar11 = this.a;
                gwrVar = new idr(aupm.b(ghtVar11.mf), aupm.b(ghtVar11.lH), aupm.b(ghtVar11.mo), (icj) ghtVar11.nH.io(), aupm.b(ghtVar11.kB), aupm.b(ghtVar11.kx), (avlh) ghtVar11.nZ.io(), (Context) ghtVar11.v.io(), (jnj) ghtVar11.mp.io(), (vxz) ghtVar11.cu.io(), (vxz) ghtVar11.km.io(), (abvn) ghtVar11.cH.io(), (ScheduledExecutorService) ghtVar11.u.io(), (hwz) ghtVar11.jH.io(), aupm.b(ghtVar11.dE), aupm.b(ghtVar11.dA), (ids) ghtVar11.oc.io(), (hwz) ghtVar11.oe.io(), (ibg) ghtVar11.og.io(), (acdq) ghtVar11.oh.io(), ((Integer) ghtVar11.oi.io()).intValue(), (hpy) ghtVar11.md.io(), (isi) ghtVar11.mn.io());
                return gwrVar;
            case 817:
                ght ghtVar12 = this.a;
                return idj.c((avlh) ghtVar12.nX.io(), (avlh) ghtVar12.nY.io());
            case 818:
                return gly.s((jan) this.a.mi.io());
            case 819:
                return idj.b((icj) this.a.nH.io());
            case 820:
                ght ghtVar13 = this.a;
                return gzj.am((Context) ghtVar13.v.io(), (rrq) ghtVar13.bh.io(), ghtVar13.ob, (ahex) ghtVar13.u.io(), (vxz) ghtVar13.km.io());
            case 821:
                ght ghtVar14 = this.a;
                gwrVar = new axfd(ghtVar14.l, ghtVar14.z, ghtVar14.jH, ghtVar14.kD, ghtVar14.oa, null, null, null);
                return gwrVar;
            case 822:
                gwrVar = new kjc((zwb) this.a.bd.io());
                return gwrVar;
            case 823:
                ght ghtVar15 = this.a;
                return gzj.aA((Context) ghtVar15.v.io(), (rrq) ghtVar15.bh.io(), ghtVar15.od);
            case 824:
                gwrVar = new hfn(this.a.oa, (short[]) null);
                return gwrVar;
            case 825:
                ght ghtVar16 = this.a;
                wofVar = new ibg((mbc) ghtVar16.l.io(), (zwb) ghtVar16.bd.io(), (qrx) ghtVar16.of.io());
                return wofVar;
            case 826:
                ght ghtVar17 = this.a;
                return gly.q((Context) ghtVar17.v.io(), (rrq) ghtVar17.bh.io());
            case 827:
                return zrp.t((ci) this.a.cG.io());
            case 828:
                return 5000;
            case 829:
                ght ghtVar18 = this.a;
                jnmVar = new jnm((wuo) ghtVar18.lG.io(), (wup) ghtVar18.ls.io(), (jij) ghtVar18.lH.io(), (vxz) ghtVar18.km.io());
                return jnmVar;
            case 830:
                ght ghtVar19 = this.a;
                gwrVar = new idy(aupm.b(ghtVar19.ol), (abvn) ghtVar19.cH.io(), (idr) ghtVar19.oj.io(), Optional.of(aupm.b(ghtVar19.fg)), (wjr) ghtVar19.jC.io(), aupm.b(ghtVar19.dC), (Executor) ghtVar19.B.io());
                return gwrVar;
            case 831:
                return idj.t((hfn) this.a.mk.io());
            case 832:
                ght ghtVar20 = this.a;
                wofVar = new iee(aupm.b(ghtVar20.cH), (mbc) ghtVar20.l.io(), (vxz) ghtVar20.km.io());
                return wofVar;
            case 833:
                ght ghtVar21 = this.a;
                gwrVar = new ieq(aupm.b(ghtVar21.cH), (wbz) ghtVar21.es.io(), (zwb) ghtVar21.bd.io(), (ahbw) ghtVar21.cx.io(), (abmt) ghtVar21.cT.io(), (avmb) ghtVar21.dC.io());
                return gwrVar;
            case 834:
                return new awkx();
            case 835:
                ght ghtVar22 = this.a;
                gwrVar = new aesp((icj) ghtVar22.nH.io(), ghtVar22.kB, (jkp) ghtVar22.cr.io(), (heg) ghtVar22.os.io(), (ycp) ghtVar22.kx.io(), (abvn) ghtVar22.cH.io(), (avmb) ghtVar22.dA.io());
                return gwrVar;
            case 836:
                gwrVar = new heg((jkp) this.a.cr.io());
                return gwrVar;
            case 837:
                ght ghtVar23 = this.a;
                aupr auprVar = ghtVar23.kB;
                tun tunVar = (tun) ghtVar23.bc.io();
                gwrVar = new hxd(auprVar, tunVar, aupm.b(ghtVar23.oj), aupm.b(ghtVar23.op), aupm.b(ghtVar23.mf), aupm.b(ghtVar23.cu));
                return gwrVar;
            case 838:
                return new kro();
            case 839:
                return new hfn((char[]) null);
            case 840:
                ght ghtVar24 = this.a;
                xplVar = new khn((Context) ghtVar24.v.io(), (heg) ghtVar24.nz.io());
                return xplVar;
            case 841:
                return new awku();
            case 842:
                return new zik();
            case 843:
                ght ghtVar25 = this.a;
                xplVar = new wjr((xeu) ghtVar25.aZ.io(), aupm.b(ghtVar25.kx));
                return xplVar;
            case 844:
                ght ghtVar26 = this.a;
                gwrVar = new xra((Context) ghtVar26.v.io(), (xla) ghtVar26.de.io(), (vxz) ghtVar26.dd.io(), (Executor) ghtVar26.u.io(), aupm.b(ghtVar26.oH));
                return gwrVar;
            case 845:
                gwrVar = new elq(this.a.oG, (byte[]) null);
                return gwrVar;
            case 846:
                return Boolean.TRUE;
            case 847:
                return new zik();
            case 848:
                return gzj.ak((ico) this.a.nE.io());
            case 849:
                return new wjr();
            case 850:
                ght ghtVar27 = this.a;
                xplVar = new afwv((Context) ghtVar27.v.io(), (ttm) ghtVar27.cJ.io());
                return xplVar;
            case 851:
                gwrVar = new ghn(this);
                return gwrVar;
            case 852:
                ght ghtVar28 = this.a;
                xwh xwhVar = (xwh) ghtVar28.kM.io();
                gwrVar = new xoc(xwhVar, (tft) ghtVar28.oP.io(), ghtVar28.dg, (xpl) ghtVar28.oR.io(), (xla) ghtVar28.de.io(), (vxz) ghtVar28.aL.io());
                return gwrVar;
            case 853:
                return zik.cv((ayq) this.a.dc.io());
            case 854:
                ght ghtVar29 = this.a;
                gwrVar = new xpl((bec) ghtVar29.oQ.io(), (awut) ghtVar29.bo.io());
                return gwrVar;
            case 855:
                ght ghtVar30 = this.a;
                return ghtVar30.gc().i(vkz.i());
            case 856:
                gwrVar = new gho(this);
                return gwrVar;
            case 857:
                gwrVar = new ghp(this);
                return gwrVar;
            case 858:
                ght ghtVar31 = this.a;
                xeu xeuVar = (xeu) ghtVar31.aZ.io();
                gwrVar = new ych(xeuVar, (tfq) ghtVar31.cd.io(), ghtVar31.k(), ghtVar31.l(), ghtVar31.j(), (wmy) ghtVar31.G.io(), ghtVar31.ao());
                return gwrVar;
            case 859:
                return idj.g();
            case 860:
                return zrp.s((ci) this.a.cG.io());
            case 861:
                ght ghtVar32 = this.a;
                gwrVar = new yat((mbc) ghtVar32.l.io(), (zpw) ghtVar32.pp.io(), (Handler) ghtVar32.cY.io(), (abvn) ghtVar32.kp.io(), (xla) ghtVar32.de.io(), (vxz) ghtVar32.dd.io());
                return gwrVar;
            case 862:
                ght ghtVar33 = this.a;
                gwrVar = new zpw(ghtVar33.lf, (did) ghtVar33.lg.io(), (xru) ghtVar33.po.io(), (tfq) ghtVar33.cd.io(), (xns) ghtVar33.kG.io(), (tbt) ghtVar33.I.io(), (Executor) ghtVar33.B.io(), (ahex) ghtVar33.u.io(), (yar) ghtVar33.le.io(), (xla) ghtVar33.de.io(), (xsa) ghtVar33.pi.io(), (avlh) ghtVar33.gD.io(), (avmb) ghtVar33.dA.io(), (ycd) ghtVar33.kT.io(), (vxz) ghtVar33.dd.io());
                return gwrVar;
            case 863:
                ght ghtVar34 = this.a;
                aunn aunnVarB = aupm.b(ghtVar34.lf);
                tbt tbtVar = (tbt) ghtVar34.I.io();
                aunn aunnVarB2 = aupm.b(ghtVar34.kx);
                aunn aunnVarB3 = aupm.b(ghtVar34.lg);
                aunn aunnVarB4 = aupm.b(ghtVar34.hA);
                aunn aunnVarB5 = aupm.b(ghtVar34.pg);
                aunn aunnVarB6 = aupm.b(ghtVar34.le);
                aunn aunnVarB7 = aupm.b(ghtVar34.ph);
                aunn aunnVarB8 = aupm.b(ghtVar34.pn);
                aunn aunnVarB9 = aupm.b(ghtVar34.pi);
                aunn aunnVarB10 = aupm.b(ghtVar34.oE);
                aunn aunnVarB11 = aupm.b(ghtVar34.oC);
                aunn aunnVarB12 = aupm.b(ghtVar34.dh);
                aunn aunnVarB13 = aupm.b(ghtVar34.ln);
                aunn aunnVarB14 = aupm.b(ghtVar34.ki);
                xra xraVar = (xra) ghtVar34.oI.io();
                xla xlaVar = (xla) ghtVar34.de.io();
                vxz vxzVar = (vxz) ghtVar34.dd.io();
                gwrVar = new xru(aunnVarB, tbtVar, aunnVarB2, aunnVarB3, aunnVarB4, aunnVarB5, aunnVarB6, aunnVarB7, aunnVarB8, aunnVarB9, aunnVarB10, aunnVarB11, aunnVarB12, aunnVarB13, aunnVarB14, xraVar, xlaVar, vxzVar, (vxz) ghtVar34.cR.io());
                return gwrVar;
            case 864:
                ght ghtVar35 = this.a;
                gwrVar = new aceo((Context) ghtVar35.v.io(), (Handler) ghtVar35.cY.io(), ghtVar35.pa, (acdq) ghtVar35.oh.io(), ghtVar35.pd, ghtVar35.pf, ghtVar35.aT(), ghtVar35.gS(), (abmt) ghtVar35.cT.io());
                return gwrVar;
            case 865:
                return aaux.v((ci) this.a.cG.io());
            case 866:
                ght ghtVar36 = this.a;
                return aawb.ak((Context) ghtVar36.v.io(), (aawb) ghtVar36.pc.io());
            case 867:
                return new hga();
            case 868:
                ght ghtVar37 = this.a;
                return kro.ae((Context) ghtVar37.v.io(), (Intent) ghtVar37.pe.io());
            case 869:
                return geg.l((Context) this.a.v.io());
            case 870:
                ght ghtVar38 = this.a;
                jnmVar = new xrr((abxv) ghtVar38.lk.io(), (xeu) ghtVar38.aZ.io(), (tfq) ghtVar38.cd.io(), (tbt) ghtVar38.I.io());
                return jnmVar;
            case 871:
                ght ghtVar39 = this.a;
                gwrVar = new xqt((vxz) ghtVar39.dd.io(), (xla) ghtVar39.de.io(), aupm.b(ghtVar39.lf), aupm.b(ghtVar39.lg), aupm.b(ghtVar39.pm));
                return gwrVar;
            case 872:
                ght ghtVar40 = this.a;
                gwrVar = new xqz((Context) ghtVar40.v.io(), (Executor) ghtVar40.B.io(), (ahex) ghtVar40.u.io(), ghtVar40.cN(), ghtVar40.le, ghtVar40.kx, (hhb) ghtVar40.f29pl.io(), (xla) ghtVar40.de.io());
                return gwrVar;
            case 873:
                gwrVar = new hhb(this);
                return gwrVar;
            case 874:
                ght ghtVar41 = this.a;
                jnmVar = new xsc((Object) ghtVar41.oE, (Object) aupm.b(ghtVar41.kx), (Object) aupm.b(ghtVar41.pi), (byte[]) null);
                return jnmVar;
            case 875:
                ght ghtVar42 = this.a;
                ghtVar42.cH();
                jnmVar = new xsa(ghtVar42.lf, (abxv) ghtVar42.lk.io(), (dov) ghtVar42.kQ.io(), (Executor) ghtVar42.u.io());
                return jnmVar;
            case 876:
                ght ghtVar43 = this.a;
                Context context = (Context) ghtVar43.v.io();
                aupr auprVar2 = ghtVar43.kx;
                mbc mbcVar = (mbc) ghtVar43.l.io();
                return new xzm(context, auprVar2, mbcVar);
            case 877:
                ght ghtVar44 = this.a;
                gwrVar = new ycn((mbc) ghtVar44.l.io(), aupm.b(ghtVar44.lc), aupm.b(ghtVar44.oY), aupm.b(ghtVar44.pq), (xla) ghtVar44.de.io());
                return gwrVar;
            case 878:
                ght ghtVar45 = this.a;
                return zik.bO((tun) ghtVar45.bc.io(), (xla) ghtVar45.de.io(), Optional.empty());
            case 879:
                ght ghtVar46 = this.a;
                gwrVar = new aczd((tbt) ghtVar46.I.io(), ghtVar46.px, ghtVar46.pm, ghtVar46.pk, ghtVar46.po, ghtVar46.pF, ghtVar46.pG, ghtVar46.pH, ghtVar46.pM);
                return gwrVar;
            case 880:
                ght ghtVar47 = this.a;
                return vkz.l((xyb) ghtVar47.pw.io(), (xmr) ghtVar47.dh.io());
            case 881:
                ght ghtVar48 = this.a;
                gwrVar = new xww((tbt) ghtVar48.I.io(), (abvn) ghtVar48.kp.io(), ghtVar48.iF, ghtVar48.lB, (xmr) ghtVar48.dh.io(), (ycp) ghtVar48.kx.io(), (vxz) ghtVar48.dd.io(), ghtVar48.pu);
                return gwrVar;
            case 882:
                ght ghtVar49 = this.a;
                jnmVar = new xxp((axfd) ghtVar49.lK.io(), (zdj) ghtVar49.pt.io(), ghtVar49.iF, (vxz) ghtVar49.dd.io());
                return jnmVar;
            case 883:
                gwrVar = new zdj(this.a.cO);
                return gwrVar;
            case 884:
                ght ghtVar50 = this.a;
                gwrVar = new xyb((tbt) ghtVar50.I.io(), (abvn) ghtVar50.kp.io(), ghtVar50.iF, ghtVar50.lB, (xmr) ghtVar50.dh.io(), (vxz) ghtVar50.dd.io(), (ycp) ghtVar50.kx.io());
                return gwrVar;
            case 885:
                ght ghtVar51 = this.a;
                return zik.bZ(ghtVar51.pB, ghtVar51.pE, Optional.empty(), (vxu) ghtVar51.at.io());
            case 886:
                ght ghtVar52 = this.a;
                tbt tbtVar2 = (tbt) ghtVar52.I.io();
                mbc mbcVar2 = (mbc) ghtVar52.l.io();
                aupr auprVar3 = ghtVar52.aX;
                aupr auprVar4 = ghtVar52.py;
                gwrVar = new xke(tbtVar2, mbcVar2, auprVar3, auprVar4, ghtVar52.pz, ghtVar52.cd, ghtVar52.aY, ghtVar52.fa, (vyo) ghtVar52.av.io(), (tqj) ghtVar52.q.io(), ghtVar52.pA, (Executor) ghtVar52.B.io());
                return gwrVar;
            case 887:
                return sxh.d((Context) this.a.v.io(), agdf.b());
            case 888:
                return sxh.c((Context) this.a.v.io(), agdf.b());
            case 889:
                ght ghtVar53 = this.a;
                gwrVar = new xjx(ghtVar53.bv, ghtVar53.cd, ghtVar53.hX, ghtVar53.pC, (zwb) ghtVar53.bd.io(), ghtVar53.av, ghtVar53.pD, (tqj) ghtVar53.q.io(), (vxz) ghtVar53.aL.io());
                return gwrVar;
            case 890:
                ght ghtVar54 = this.a;
                vxu vxuVar = (vxu) ghtVar54.at.io();
                vyo vyoVar = (vyo) ghtVar54.av.io();
                ght.fp();
                gwrVar = new vxz(vxuVar, vyoVar, "HomeClient");
                return gwrVar;
            case 891:
                gwrVar = new adhg((awmd) this.a.pA);
                return gwrVar;
            case 892:
                ght ghtVar55 = this.a;
                gwrVar = new xuy((Context) ghtVar55.v.io(), ghtVar55.kx);
                return gwrVar;
            case 893:
                ght ghtVar56 = this.a;
                gwrVar = new xom((ycp) ghtVar56.kx.io(), (mbc) ghtVar56.l.io(), (ydu) ghtVar56.ln.io(), (tfq) ghtVar56.cd.io(), ghtVar56.pL, (xru) ghtVar56.po.io(), (xmr) ghtVar56.dh.io(), (vxz) ghtVar56.dS.io());
                return gwrVar;
            case 894:
                ght ghtVar57 = this.a;
                wofVar = new xoj((tgg) ghtVar57.pK.io(), (vxz) ghtVar57.aL.io(), (mbc) ghtVar57.l.io());
                return wofVar;
            case 895:
                ght ghtVar58 = this.a;
                return vkz.k((tgm) ghtVar58.bf.io(), (zry) ghtVar58.bj.io(), (mbc) ghtVar58.l.io(), (Executor) ghtVar58.B.io(), (ExecutorService) ghtVar58.T.io(), (awut) ghtVar58.pJ.io(), (tqj) ghtVar58.q.io());
            case 896:
                return afmb.c((awou) this.a.pI.io());
            case 897:
                ght ghtVar59 = this.a;
                return adib.u(ghtVar59.gz(), (ahey) ghtVar59.T.io());
            case 898:
                gwrVar = new tce((tbt) this.a.I.io(), (int[]) null);
                return gwrVar;
            case 899:
                ght ghtVar60 = this.a;
                return agkz.s((wmg) ghtVar60.pT.io(), ghtVar60.al(), (wmg) ghtVar60.pX.io(), (wmg) ghtVar60.qa.io());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object r() {
        Object wmuVar;
        Object hdrVar;
        Object wvoVar;
        int i = this.b;
        switch (i) {
            case 900:
                return vyr.p((omn) this.a.au.io());
            case 901:
                ght ghtVar = this.a;
                wmuVar = new wmu(ghtVar.aj(), (ahbw) ghtVar.cx.io());
                return wmuVar;
            case 902:
                return new gpw((tmo) this.a.pU.io());
            case 903:
                ght ghtVar2 = this.a;
                return vql.g((File) ghtVar2.aH.io(), (vvn) ghtVar2.fL.io(), (Executor) ghtVar2.t.io(), (vxz) ghtVar2.aw.io(), (tqj) ghtVar2.q.io());
            case 904:
                return new wky((tmo) this.a.gS.io());
            case 905:
                ght ghtVar3 = this.a;
                hdrVar = new hdr((tbt) ghtVar3.I.io(), (tce) ghtVar3.pY.io(), (tce) ghtVar3.pZ.io());
                return hdrVar;
            case 906:
                return new tce((tbt) this.a.I.io(), (char[]) null);
            case 907:
                return new tce((tbt) this.a.I.io(), (byte[]) null);
            case 908:
                ght ghtVar4 = this.a;
                Optional optionalEmpty = Optional.empty();
                zik zikVarHc = ghtVar4.hc();
                optionalEmpty.isPresent();
                return zikVarHc;
            case 909:
                return new wjr((mbc) this.a.l.io(), (byte[]) null);
            case 910:
                ght ghtVar5 = this.a;
                return vyr.u(ghtVar5.qi.io(), ghtVar5.qk.io(), (tzk) ghtVar5.ql.io());
            case 911:
                ght ghtVar6 = this.a;
                ghtVar6.fg();
                wvoVar = new wvo((ci) ghtVar6.bw.io(), ghtVar6.qh, ghtVar6.ft, (Executor) ghtVar6.u.io());
                return wvoVar;
            case 912:
                ght ghtVar7 = this.a;
                return new aend((wlp) ghtVar7.kE.io(), (abxv) ghtVar7.gK.io(), (tgg) ghtVar7.qg.io(), (wjz) ghtVar7.lF.io());
            case 913:
                ght ghtVar8 = this.a;
                return vkz.c((vvn) ghtVar8.fL.io(), ghtVar8.be, ghtVar8.mq, ghtVar8.qf, (tqj) ghtVar8.q.io());
            case 914:
                ght ghtVar9 = this.a;
                return vkz.d((vvn) ghtVar9.fL.io(), ghtVar9.bp, ghtVar9.mr);
            case 915:
                ght ghtVar10 = this.a;
                ghtVar10.fg();
                return new wvp((ci) ghtVar10.bw.io(), ghtVar10.qh, ghtVar10.ft, (vwt) ghtVar10.qj.io(), (Executor) ghtVar10.u.io());
            case 916:
                return new vwt();
            case 917:
                return new tzk();
            case 918:
                ght ghtVar11 = this.a;
                hdrVar = new wmy((Context) ghtVar11.v.io(), (syn) ghtVar11.cs.io(), (vxz) ghtVar11.bM.io());
                return hdrVar;
            case 919:
                ght ghtVar12 = this.a;
                return vyr.m((tqj) ghtVar12.q.io(), ghtVar12.qo, ghtVar12.qp);
            case 920:
                return new wke((mbc) this.a.l.io());
            case 921:
                ght ghtVar13 = this.a;
                hdrVar = new wma((mbc) ghtVar13.l.io(), ghtVar13.gN(), ghtVar13.dO);
                return hdrVar;
            case 922:
                return new wkr();
            case 923:
                return new dov((wnb) this.a.bx.io(), (byte[]) null);
            case 924:
                ght ghtVar14 = this.a;
                return new abxv(ghtVar14.qt, (afvq) ghtVar14.mK.io(), (awut) ghtVar14.bm.io());
            case 925:
                return new hhb(this);
            case 926:
                return new zyx((SecureRandom) this.a.ay.io());
            case 927:
                ght ghtVar15 = this.a;
                return new afip((dov) ghtVar15.jB.io(), ghtVar15.ak(), ghtVar15.qe, ghtVar15.qq, ghtVar15.qn, ghtVar15.qs, (mbc) ghtVar15.l.io(), (vxz) ghtVar15.aL.io());
            case 928:
                ght ghtVar16 = this.a;
                return new zpw(ghtVar16.bE, ghtVar16.bD, ghtVar16.qc, ghtVar16.av, ghtVar16.at, ghtVar16.q, ghtVar16.qe, ghtVar16.qm, ghtVar16.qn, ghtVar16.qq, ghtVar16.aw, ghtVar16.aL, ghtVar16.qr, ghtVar16.qs, ghtVar16.qu, (byte[]) null);
            case 929:
                return new hhb(this);
            case 930:
                return new xdz((SharedPreferences) this.a.J.io());
            case 931:
                ght ghtVar17 = this.a;
                hdrVar = new xfg(ghtVar17.qC, ghtVar17.ar, (ScheduledExecutorService) ghtVar17.u.io());
                return hdrVar;
            case 932:
                return new zvb((zrs) this.a.ar.io());
            case 933:
                ght ghtVar18 = this.a;
                return new xez(ghtVar18.qB, ghtVar18.qA, ghtVar18.qF, ghtVar18.bQ, (zwb) ghtVar18.bd.io(), ghtVar18.bw, ghtVar18.ar, ghtVar18.bO, ghtVar18.cf, ghtVar18.bi, ghtVar18.bc, (Executor) ghtVar18.B.io());
            case 934:
                ght ghtVar19 = this.a;
                wvoVar = new xev((vyo) ghtVar19.av.io(), (zrs) ghtVar19.ar.io(), (vxz) ghtVar19.cP.io(), (mbc) ghtVar19.l.io());
                return wvoVar;
            case 935:
                return new elq((Context) this.a.v.io());
            case 936:
                ght ghtVar20 = this.a;
                return new xed((ztf) ghtVar20.cg.io(), (xet) ghtVar20.qE.io(), (xfg) ghtVar20.qD.io(), (Context) ghtVar20.v.io(), (vyo) ghtVar20.av.io());
            case 937:
                return rmp.h((rma) this.a.qN.io());
            case 938:
                ght ghtVar21 = this.a;
                wvoVar = new zxx((Context) ghtVar21.v.io(), (vyt) ghtVar21.bE.io(), 1, (byte[]) null);
                return wvoVar;
            case 939:
                return new zxp((syn) this.a.cc.io());
            case 940:
                ght ghtVar22 = this.a;
                return new zxq((ztf) ghtVar22.cl.io(), (zxn) ghtVar22.qT.io());
            case 941:
                return vkz.h((zrw) this.a.bu.io());
            case 942:
                ght ghtVar23 = this.a;
                return xer.u(ghtVar23.qF.io(), (ztf) ghtVar23.cl.io(), (xet) ghtVar23.qH.io(), (zwb) ghtVar23.bd.io(), (ci) ghtVar23.bw.io(), (mbc) ghtVar23.l.io(), (tun) ghtVar23.bc.io(), (tag) ghtVar23.bO.io(), Optional.empty(), (vxz) ghtVar23.ba.io(), ghtVar23.gV());
            case 943:
                return new xfo();
            case 944:
                ght ghtVar24 = this.a;
                return new xgl((vxz) ghtVar24.ce.io());
            case 945:
                ght ghtVar25 = this.a;
                vxu vxuVar = (vxu) ghtVar25.at.io();
                vyo vyoVar = (vyo) ghtVar25.av.io();
                ght.fp();
                return new vxz(vxuVar, vyoVar, "RenderNextClient");
            case 946:
                return new aewo(null);
            case 947:
                return sxh.i();
            case 948:
                return new hhb(this);
            case 949:
                ght ghtVar26 = this.a;
                return new tko((Context) ghtVar26.v.io(), (tir) ghtVar26.bp.io(), (awut) ghtVar26.pJ.io(), (Executor) ghtVar26.aC.io(), (tqj) ghtVar26.q.io());
            case 950:
                ght ghtVar27 = this.a;
                return new tiw((tqj) ghtVar27.q.io(), ghtVar27.rf, ghtVar27.Q, (mbc) ghtVar27.l.io());
            case 951:
                ght ghtVar28 = this.a;
                return new yrz(ghtVar28.ia, ghtVar28.eW(), (zjr) ghtVar28.gI.io(), (zjk) ghtVar28.hg.io(), (abxv) ghtVar28.jh.io(), (zgm) ghtVar28.il.io(), (vyo) ghtVar28.av.io(), (vxu) ghtVar28.at.io(), (mbc) ghtVar28.l.io(), (ci) ghtVar28.ji.io(), ghtVar28.av(), ghtVar28.gj(), (hed) ghtVar28.hx.io(), ghtVar28.gP());
            case 952:
                ght ghtVar29 = this.a;
                return xer.v((xdz) ghtVar29.qB.io(), ghtVar29.qF.io(), (xic) ghtVar29.bQ.io(), (wrg) ghtVar29.qA.io(), (zwb) ghtVar29.bd.io(), (ci) ghtVar29.bw.io(), (zrs) ghtVar29.ar.io(), (tag) ghtVar29.bO.io(), (ztf) ghtVar29.cf.io(), (Executor) ghtVar29.B.io());
            case 953:
                ght ghtVar30 = this.a;
                return new vmx(ghtVar30.ro, ghtVar30.tq, (Executor) ghtVar30.u.io(), ghtVar30.tr, (zwb) ghtVar30.bd.io(), ghtVar30.eP());
            case 954:
                ght ghtVar31 = this.a;
                wvoVar = new wqm((wlp) ghtVar31.kE.io(), (abxv) ghtVar31.gK.io(), (zwb) ghtVar31.bd.io(), (tgg) ghtVar31.rn.io());
                return wvoVar;
            case 955:
                ght ghtVar32 = this.a;
                return vql.l((tqj) ghtVar32.q.io(), aupm.b(ghtVar32.mq), aupm.b(ghtVar32.mr));
            case 956:
                return Optional.of(this.a.cx());
            case 957:
                ght ghtVar33 = this.a;
                return new huf((aany) ghtVar33.sh.io(), (aanb) ghtVar33.iG.io(), (hpy) ghtVar33.md.io(), (huh) ghtVar33.sw.io(), (abxv) ghtVar33.iK.io(), (aauk) ghtVar33.iL.io(), (Integer) ghtVar33.sv.io(), (Executor) ghtVar33.z.io(), (tbt) ghtVar33.I.io());
            case 958:
                ght ghtVar34 = this.a;
                return new aany(ghtVar34.ti, aupm.b(ghtVar34.tj), ghtVar34.tk, ghtVar34.cd, ghtVar34.gD, ghtVar34.tl, (tbt) ghtVar34.I.io(), (zwb) ghtVar34.bd.io(), ghtVar34.tn, (ScheduledExecutorService) ghtVar34.u.io(), aupm.b(ghtVar34.iL));
            case 959:
                ght ghtVar35 = this.a;
                wmuVar = new aanw(ghtVar35.by(), (mbc) ghtVar35.l.io());
                return wmuVar;
            case 960:
                ght ghtVar36 = this.a;
                Context context = (Context) ghtVar36.v.io();
                aanb aanbVar = (aanb) ghtVar36.iG.io();
                abfv abfvVar = (abfv) ghtVar36.rq.io();
                aapw aapwVarAH = ghtVar36.aH();
                aaqg aaqgVar = (aaqg) ghtVar36.iR.io();
                abfv abfvVar2 = (abfv) ghtVar36.iD.io();
                abfv abfvVar3 = (abfv) ghtVar36.rr.io();
                Executor executor = (Executor) ghtVar36.u.io();
                Executor executor2 = (Executor) ghtVar36.z.io();
                tbt tbtVar = (tbt) ghtVar36.I.io();
                return new hsj(context, aanbVar, abfvVar, aapwVarAH, aaqgVar, abfvVar2, abfvVar3, executor, executor2, tbtVar, (aauk) ghtVar36.iL.io(), (abfv) ghtVar36.sq.io(), (hqg) ghtVar36.mb.io(), ghtVar36.fI(), (hwz) ghtVar36.sr.io(), ghtVar36.fH(), (vxz) ghtVar36.cu.io(), (vxz) ghtVar36.cN.io(), (vxz) ghtVar36.et.io());
            case 961:
                ght ghtVar37 = this.a;
                wmuVar = new abfv((aaqc) ghtVar37.rp.io(), (Executor) ghtVar37.u.io(), (byte[]) null);
                return wmuVar;
            case 962:
                ght ghtVar38 = this.a;
                return new aaqc((wlp) ghtVar38.kE.io(), (abxv) ghtVar38.gK.io(), (zwb) ghtVar38.bd.io(), ghtVar38.mq, ghtVar38.mr, (vyo) ghtVar38.av.io(), (vxz) ghtVar38.aw.io(), (tqj) ghtVar38.q.io());
            case 963:
                ght ghtVar39 = this.a;
                wmuVar = new abfv(ghtVar39.fT(), (Executor) ghtVar39.u.io(), (byte[]) null);
                return wmuVar;
            case 964:
                return new kro();
            case 965:
                return new gzj();
            case 966:
                ght ghtVar40 = this.a;
                wmuVar = new abfv((ci) ghtVar40.rv.io(), (txp) ghtVar40.aS.io());
                return wmuVar;
            case 967:
                return new ci((aati) this.a.sp.io(), (byte[]) null);
            case 968:
                ght ghtVar41 = this.a;
                return new aatc((Context) ghtVar41.v.io(), (Executor) ghtVar41.u.io(), ghtVar41.iR, ghtVar41.iG, ghtVar41.rE, (SharedPreferences) ghtVar41.J.io(), ghtVar41.aI(), (aalj) ghtVar41.rX.io(), (aark) ghtVar41.rY.io(), (Executor) ghtVar41.rZ.io(), ghtVar41.aJ(), (abfv) ghtVar41.iO.io(), zrp.j(), (isi) ghtVar41.ru.io(), (aauk) ghtVar41.iL.io(), (vxz) ghtVar41.et.io(), ghtVar41.so, ghtVar41.rV);
            case 969:
                ght ghtVar42 = this.a;
                return gly.o(aupm.b(ghtVar42.rC), aupm.b(ghtVar42.rD), (tqj) ghtVar42.q.io());
            case 970:
                ght ghtVar43 = this.a;
                return new hub((Context) ghtVar43.v.io(), (mbc) ghtVar43.l.io(), (tfq) ghtVar43.cd.io(), (isi) ghtVar43.ru.io(), (aank) ghtVar43.rw.io(), (adhv) ghtVar43.rB.io(), (aauk) ghtVar43.iL.io(), (abfv) ghtVar43.iP.io(), (hpy) ghtVar43.md.io(), (hnq) ghtVar43.ct.io(), (vxz) ghtVar43.et.io(), (hpd) ghtVar43.mB.io(), (hpb) ghtVar43.mC.io(), (awut) ghtVar43.bo.io(), (syn) ghtVar43.cs.io(), (zwb) ghtVar43.bd.io());
            case 971:
                return new isi((Context) this.a.v.io());
            case 972:
                ght ghtVar44 = this.a;
                return new aank((isi) ghtVar44.ru.io(), (ci) ghtVar44.rv.io());
            case 973:
                ght ghtVar45 = this.a;
                adiz adizVar = (adiz) ghtVar45.rA.io();
                adib.b(adizVar, (tqj) ghtVar45.q.io(), ghtVar45.eO);
                return adizVar;
            case 974:
                ght ghtVar46 = this.a;
                return new adiz((Context) ghtVar46.v.io(), ghtVar46.ry, ghtVar46.rx, (mbc) ghtVar46.l.io(), (adkc) ghtVar46.rz.io(), ghtVar46.aw);
            case 975:
                ght ghtVar47 = this.a;
                return new adin((Context) ghtVar47.v.io(), (Executor) ghtVar47.u.io(), ghtVar47.bN, ghtVar47.rx, ghtVar47.eU, ghtVar47.aw);
            case 976:
                return adib.e((tao) this.a.aq.io());
            case 977:
                return new adkc(1);
            case 978:
                ght ghtVar48 = this.a;
                return new acfz(ghtVar48.rx, ghtVar48.bN, ghtVar48.eU, ghtVar48.jR);
            case 979:
                ght ghtVar49 = this.a;
                return new htp((Context) ghtVar49.v.io(), (mbc) ghtVar49.l.io(), (tfq) ghtVar49.cd.io(), (isi) ghtVar49.ru.io(), (aank) ghtVar49.rw.io(), (adhv) ghtVar49.rB.io(), (aauk) ghtVar49.iL.io(), (abfv) ghtVar49.iP.io(), (hpy) ghtVar49.md.io(), (hnq) ghtVar49.ct.io(), (vxz) ghtVar49.et.io(), (hpd) ghtVar49.mB.io(), (hpb) ghtVar49.mC.io(), (Executor) ghtVar49.z.io(), (syn) ghtVar49.cs.io(), (zwb) ghtVar49.bd.io());
            case 980:
                ght ghtVar50 = this.a;
                return new aaqo((Context) ghtVar50.v.io(), (tbt) ghtVar50.I.io(), (ScheduledExecutorService) ghtVar50.u.io(), (abxv) ghtVar50.iK.io());
            case 981:
                ght ghtVar51 = this.a;
                return zrp.i((aarm) ghtVar51.rI.io(), (aarn) ghtVar51.rJ.io(), (vxz) ghtVar51.cN.io());
            case 982:
                ght ghtVar52 = this.a;
                hdrVar = new aarm(ghtVar52.rG, ghtVar52.rH, (vxz) ghtVar52.cN.io());
                return hdrVar;
            case 983:
                return new aart((Context) this.a.v.io());
            case 984:
                ght ghtVar53 = this.a;
                hdrVar = new aarl((wco) ghtVar53.jy.io(), (abxv) ghtVar53.jq.io(), (zwb) ghtVar53.bd.io());
                return hdrVar;
            case 985:
                ght ghtVar54 = this.a;
                hdrVar = new aarn(ghtVar54.rG, ghtVar54.rH, (vxz) ghtVar54.cN.io());
                return hdrVar;
            case 986:
                ght ghtVar55 = this.a;
                wmuVar = new afcy((Context) ghtVar55.v.io(), ghtVar55.bW());
                return wmuVar;
            case 987:
                ght ghtVar56 = this.a;
                return xwg.k(ghtVar56.rM, ghtVar56.rN, (aauk) ghtVar56.iL.io());
            case 988:
                ght ghtVar57 = this.a;
                hdrVar = new aaso((Context) ghtVar57.v.io(), (ScheduledExecutorService) ghtVar57.u.io(), (aauk) ghtVar57.iL.io());
                return hdrVar;
            case 989:
                return new aasn((mbc) this.a.l.io());
            case 990:
                return new aasq();
            case 991:
                ght ghtVar58 = this.a;
                wvoVar = new aasr((tfq) ghtVar58.cd.io(), ghtVar58.bW(), (avlh) ghtVar58.gD.io(), (aauk) ghtVar58.iL.io());
                return wvoVar;
            case 992:
                return new aazo();
            case 993:
                return new aass();
            case 994:
                return aasc.a();
            case 995:
                return new awkx();
            case 996:
                return new aesq();
            case 997:
                ght ghtVar59 = this.a;
                return new aalj((mbc) ghtVar59.l.io(), (SharedPreferences) ghtVar59.J.io(), (aalv) ghtVar59.iT.io(), ghtVar59.iG, ghtVar59.dr());
            case 998:
                ght ghtVar60 = this.a;
                wvoVar = new isi((zwb) ghtVar60.bd.io(), (wco) ghtVar60.jy.io(), (vxz) ghtVar60.cN.io(), (byte[]) null);
                return wvoVar;
            case 999:
                return new aark(aupm.b(this.a.iG), 0);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        Object hgnVar;
        int i = this.b;
        switch (i / 100) {
            case 0:
                return b();
            case 1:
                return c();
            case 2:
                return k();
            case 3:
                return l();
            case 4:
                return m();
            case 5:
                return n();
            case 6:
                return o();
            case 7:
                return p();
            case 8:
                return q();
            case 9:
                return r();
            case 10:
                return d();
            case 11:
                return e();
            case 12:
                return f();
            case 13:
                return g();
            case 14:
                return h();
            case 15:
                return i();
            case 16:
                return j();
            default:
                switch (i) {
                    case 1700:
                        ght ghtVar = this.a;
                        hgnVar = new hgn((hwv) ghtVar.nW.io(), ghtVar.mf, aupm.b(ghtVar.zZ), aupm.b(ghtVar.Ga), (avlh) ghtVar.FZ.io(), aupm.b(ghtVar.mp), aupm.b(ghtVar.cv));
                        break;
                    case 1701:
                        ght ghtVar2 = this.a;
                        hgnVar = new abym((mbc) ghtVar2.l.io(), (Executor) ghtVar2.u.io(), (Handler) ghtVar2.cY.io(), (SecureRandom) ghtVar2.ay.io(), (wqi) ghtVar2.Ge.io(), (String) ghtVar2.gM.io(), (aawa) ghtVar2.gU.io(), (abmt) ghtVar2.cT.io(), (xeu) ghtVar2.aZ.io());
                        break;
                    case 1702:
                        ght ghtVar3 = this.a;
                        hgnVar = new wqi((wlp) ghtVar3.kE.io(), (abxv) ghtVar3.gK.io(), (zwb) ghtVar3.bd.io(), (tgg) ghtVar3.rn.io());
                        break;
                    case 1703:
                        ght ghtVar4 = this.a;
                        Context context = (Context) ghtVar4.v.io();
                        return new addn(context);
                    case 1704:
                        zrx zrxVarF = ((zrw) this.a.bu.io()).f();
                        zrxVarF.getClass();
                        return zrxVarF;
                    case 1705:
                        ght ghtVar5 = this.a;
                        hgnVar = (tun) ghtVar5.bc.io();
                        if (true != ((aawa) ghtVar5.gU.io()).f) {
                            return null;
                        }
                        break;
                    case 1706:
                        ght ghtVar6 = this.a;
                        aupr auprVar = ghtVar6.gQ;
                        Executor executor = (Executor) ghtVar6.u.io();
                        mbc mbcVar = (mbc) ghtVar6.l.io();
                        tbt tbtVar = (tbt) ghtVar6.I.io();
                        hno hnoVar = (hno) ghtVar6.jZ.io();
                        aeiy aeiyVar = (aeiy) ghtVar6.Go.io();
                        aunn aunnVarB = aupm.b(ghtVar6.Gp);
                        aunn aunnVarB2 = aupm.b(ghtVar6.Gq);
                        absl abslVar = (absl) ghtVar6.AG.io();
                        aupr auprVar2 = ghtVar6.mW;
                        aunn aunnVarB3 = aupm.b(ghtVar6.hO);
                        tre treVar = (tre) ghtVar6.Q.io();
                        rnj rnjVar = (rnj) ghtVar6.hf.io();
                        abxu abxuVar = (abxu) ghtVar6.dG.io();
                        tqj tqjVar = (tqj) ghtVar6.q.io();
                        hgnVar = new acrz(ghtVar6.Gj, auprVar, executor, mbcVar, tbtVar, hnoVar, ghtVar6.Gm, ghtVar6.Gn, aeiyVar, aunnVarB, aunnVarB2, abslVar, auprVar2, aunnVarB3, treVar, rnjVar, abxuVar, tqjVar, ghtVar6.eO);
                        break;
                    case 1707:
                        ght ghtVar7 = this.a;
                        hgnVar = new acuw((wlp) ghtVar7.kE.io(), (abxv) ghtVar7.gK.io(), (zwb) ghtVar7.bd.io(), ghtVar7.zU, ghtVar7.gT, (vxu) ghtVar7.at.io(), (vyo) ghtVar7.av.io(), (vxz) ghtVar7.aw.io(), (tqj) ghtVar7.q.io());
                        break;
                    case 1708:
                        hgnVar = new ci((abfs) this.a.Gl.io());
                        break;
                    case 1709:
                        ght ghtVar8 = this.a;
                        Context context2 = (Context) ghtVar8.v.io();
                        return new abfs(context2);
                    case 1710:
                        return new aawb();
                    case 1711:
                        return new aecm();
                    case 1712:
                        ght ghtVar9 = this.a;
                        return new aeiy((xit) ghtVar9.fa.io(), ghtVar9.jY, (tqj) ghtVar9.q.io(), (hno) ghtVar9.jZ.io());
                    case 1713:
                        hgnVar = new actk((wjb) this.a.gQ.io());
                        break;
                    case 1714:
                        ght ghtVar10 = this.a;
                        hgnVar = new acsj((awut) ghtVar10.bm.io(), (hno) ghtVar10.jZ.io(), (mbc) ghtVar10.l.io());
                        break;
                    case 1715:
                        ght ghtVar11 = this.a;
                        actv actvVar = (actv) ghtVar11.Bd.io();
                        Executor executor2 = (Executor) ghtVar11.u.io();
                        hno hnoVar2 = (hno) ghtVar11.jZ.io();
                        return new acsy(actvVar, executor2, hnoVar2);
                    case 1716:
                        return new aawr();
                    case 1717:
                        ght ghtVar12 = this.a;
                        hgnVar = new acsv((acrz) ghtVar12.Gr.io(), (wjb) ghtVar12.gQ.io(), (mbc) ghtVar12.l.io(), ghtVar12.eV(), (actv) ghtVar12.Bd.io(), (wjr) ghtVar12.jC.io(), (zwb) ghtVar12.bd.io(), (hno) ghtVar12.jZ.io(), ghtVar12.jB);
                        break;
                    case 1718:
                        ght ghtVar13 = this.a;
                        trf trfVar = (trf) ghtVar13.M.io();
                        tqj tqjVar2 = (tqj) ghtVar13.q.io();
                        vxu vxuVar = (vxu) ghtVar13.at.io();
                        vyo vyoVar = (vyo) ghtVar13.av.io();
                        ght.fp();
                        new vxz(vxuVar, vyoVar, "ShortsMiscUiShared");
                        hgnVar = new acul(trfVar, tqjVar2);
                        break;
                    default:
                        throw new AssertionError(i);
                }
                return hgnVar;
        }
    }
}
