package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aask implements aasa, aasp {
    static final long a;
    private static final agrf w = agrf.h("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor");
    private static final long x;
    private static final long y;
    private static final long z;
    private final ScheduledExecutorService A;
    private final mbc B;
    private final aaqo C;
    private final awmd D;
    private final aalv E;
    private final vyo F;
    private final aauk G;
    private final awmd H;
    private final zwb I;
    private final awkv J;
    private final awkv K;
    private final awku L;
    private final aasb M;
    private final aasy N;
    private final String O;
    private final PowerManager.WakeLock P;
    private final aast Q;
    private final WifiManager.WifiLock R;
    private volatile zwa T;
    private final tfq W;
    private final syn X;
    private final abxv Y;
    private final afcy Z;
    private final abfv aa;
    private final dov ab;
    public final Context b;
    public final aary c;
    public final aasq d;
    public final aasr e;
    public final aass f;
    public final aarz g;
    public volatile String h;
    boolean k;
    public boolean l;
    public boolean m;
    public volatile boolean n;
    public volatile boolean o;
    public boolean p;
    public avmn t;
    public final aazo u;
    public final aesq v;
    private atpr S = atpr.ANY;
    public final Object q = new Object();
    private final Queue U = new ArrayDeque();
    public ListenableFuture r = null;
    public final Map s = new HashMap();
    private ScheduledFuture V = null;
    public volatile boolean j = false;
    public final Set i = new HashSet();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        x = 10000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        y = 30000L;
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        z = 60000L;
        TimeUnit timeUnit4 = TimeUnit.MILLISECONDS;
        a = 30000 / 1000;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    public aask(Context context, ScheduledExecutorService scheduledExecutorService, tfq tfqVar, mbc mbcVar, dov dovVar, syn synVar, aaqo aaqoVar, awmd awmdVar, abxv abxvVar, aalv aalvVar, aary aaryVar, vyo vyoVar, aauk aaukVar, awmd awmdVar2, abfv abfvVar, afcy afcyVar, aasb aasbVar, aasq aasqVar, aasr aasrVar, aazo aazoVar, aass aassVar, zwb zwbVar, awkv awkvVar, awkv awkvVar2, aesq aesqVar, awku awkuVar, aarz aarzVar, String str, aasy aasyVar) {
        byte[] bArr = null;
        this.t = null;
        this.b = context;
        this.A = scheduledExecutorService;
        this.W = tfqVar;
        this.B = mbcVar;
        this.ab = dovVar;
        this.X = synVar;
        this.C = aaqoVar;
        this.D = awmdVar;
        this.Y = abxvVar;
        this.E = aalvVar;
        this.c = aaryVar;
        this.F = vyoVar;
        this.G = aaukVar;
        this.H = awmdVar2;
        this.aa = abfvVar;
        this.Z = afcyVar;
        this.M = aasbVar;
        this.d = aasqVar;
        this.e = aasrVar;
        this.u = aazoVar;
        this.f = aassVar;
        this.I = zwbVar;
        this.J = awkvVar;
        this.K = awkvVar2;
        this.v = aesqVar;
        this.L = awkuVar;
        this.g = aarzVar;
        this.O = str;
        this.N = aasyVar;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, getClass().getName());
        this.P = wakeLockNewWakeLock;
        this.Q = new aast(wakeLockNewWakeLock, scheduledExecutorService, mbcVar);
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        wifiManager.getClass();
        this.R = wifiManager.createWifiLock(3, getClass().getName());
        ((dzt) synVar.d.io()).d();
        aasqVar.a = this;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        context.registerReceiver(aasqVar, intentFilter);
        aasrVar.c = aasrVar.a.ak(new mnt(aasrVar, this, 17, bArr));
        aasrVar.d = aasrVar.b.ak(new mnt(aasrVar, this, 18, bArr));
        scheduledExecutorService.execute(new aadm(aasrVar, 9));
        if (aaukVar.j()) {
            this.t = ((avlh) aesqVar.a).ag().r().af(new zgd(this, 14));
        }
    }

    private final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("servicePath", this.O);
        bundle.putString("intentAction", "com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
        return bundle;
    }

    private final void k() {
        synchronized (this.q) {
            ScheduledFuture scheduledFuture = this.V;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.V = null;
        }
    }

    private final void l() {
        synchronized (this.q) {
            int iE = e();
            if (iE <= 0 && this.G.b.l(166, 45674554L, false)) {
                this.L.kk(Boolean.valueOf(this.l));
            }
            k();
            if (iE > 0 || this.l) {
                return;
            }
            if (!this.j && !this.k) {
                long j = this.m ? y : x;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j2 = j / 1000;
                this.V = this.A.schedule(new aadm(this, 8), j, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final void m(aamw aamwVar, aogv aogvVar, aamg aamgVar) {
        aasw aaswVar = (aasw) this.g;
        aaswVar.b.execute(new aasv(aaswVar, aamwVar, aogvVar, aamgVar, 0));
        aase aaseVarF = aasg.f(aamwVar, aasf.g);
        aaseVarF.c = aogvVar;
        aaseVarF.b(aamgVar);
        this.K.kk(aaseVarF.a());
    }

    /* JADX WARN: Code duplicated, block: B:122:0x020d  */
    /* JADX WARN: Code duplicated, block: B:127:0x021a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0223 A[Catch: IllegalArgumentException -> 0x0474, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0474, blocks: (B:125:0x0214, B:129:0x0223), top: B:250:0x0214 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0249 A[Catch: IllegalArgumentException -> 0x047a, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0263 A[Catch: IllegalArgumentException -> 0x047a, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x026f A[Catch: IllegalArgumentException -> 0x047a, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0295 A[Catch: IllegalArgumentException -> 0x047a, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x029b A[Catch: IllegalArgumentException -> 0x047a, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5 A[Catch: IllegalArgumentException -> 0x047a, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02bb A[Catch: IllegalArgumentException -> 0x047a, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02d7 A[Catch: IllegalArgumentException -> 0x047a, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x033f A[Catch: IllegalArgumentException -> 0x047a, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x034b A[Catch: IllegalArgumentException -> 0x047a, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x047a, blocks: (B:135:0x0241, B:137:0x0249, B:161:0x034b, B:138:0x0263, B:140:0x026f, B:142:0x027b, B:143:0x0295, B:145:0x029b, B:146:0x02b5, B:148:0x02bb, B:150:0x02d7, B:154:0x030b, B:157:0x0331, B:159:0x033f), top: B:256:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0354  */
    /* JADX WARN: Code duplicated, block: B:165:0x0358  */
    /* JADX WARN: Code duplicated, block: B:168:0x035f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x0434  */
    /* JADX WARN: Code duplicated, block: B:210:0x0437 A[PHI: r6 r8
      0x0437: PHI (r6v29 int) = (r6v27 int), (r6v31 int), (r6v31 int), (r6v31 int) binds: [B:209:0x0435, B:204:0x0416, B:206:0x041a, B:207:0x041c] A[DONT_GENERATE, DONT_INLINE]
      0x0437: PHI (r8v19 int) = (r8v17 int), (r8v24 int), (r8v24 int), (r8v24 int) binds: [B:209:0x0435, B:204:0x0416, B:206:0x041a, B:207:0x041c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:212:0x044e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.lang.Object, java.util.Set] */
    private final void n() {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        Set set;
        boolean z2;
        long j;
        int i4;
        int iB;
        aasy aasyVar;
        aamw aamwVarA;
        aaqn aaqnVarB;
        aadc aadcVarC;
        aamc aamcVarC;
        aatj aatjVar;
        int iB2;
        awmd awmdVar;
        aarw aarwVarA;
        boolean zE;
        boolean z3;
        int i5;
        boolean z4;
        boolean zA;
        Class<?> cls;
        abfv abfvVarE;
        Set set2 = this.i;
        Iterator it = set2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                objArr = false;
                break;
            }
            aaro aaroVarE = this.u.e((String) it.next());
            if (aaroVarE != null) {
                long j2 = aarq.a;
                if (aaroVarE.e.b("retry_strategy", 1) == 2) {
                    objArr = true;
                    break;
                }
            }
        }
        int i6 = true != s() ? 0 : 2;
        aauk aaukVar = this.G;
        int i7 = 8;
        if (!aaukVar.p() ? !t() : !((this.S == atpr.UNMETERED_WIFI_OR_UNMETERED_MOBILE && !v()) || (this.S == atpr.UNMETERED_WIFI && t()))) {
            i7 = 0;
        }
        int i8 = i6 | i7;
        abxv abxvVar = this.Y;
        aazo aazoVar = this.u;
        long jB = abxvVar.b();
        Iterator it2 = aazoVar.h().iterator();
        boolean z5 = false;
        boolean z6 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (it2.hasNext()) {
            aaro aaroVar = (aaro) it2.next();
            if (aaroVar.d()) {
                aamb aambVar = aaroVar.e;
                long j3 = aarq.a;
                Object[] objArr2 = objArr;
                int i9 = ((aambVar.b("download_constraint", i) != 1 || v()) && (aambVar.b("download_constraint", 0) != 2 || this.W.j(1))) ? i8 : i8 | 8;
                int i10 = i8;
                Iterator it3 = it2;
                if (!((vxz) this.H.io()).m(58, 45813924L) || aaroVar == null) {
                    i2 = i9;
                } else {
                    String strE = aarq.e(aambVar);
                    String strF = aambVar.f("playlist_id");
                    aaqn aaqnVarB2 = ((aanb) this.D.io()).b();
                    if (aaqnVarB2 == null || (abfvVarE = aaqnVarB2.E()) == null || ((strE.length() == 0 || !abfvVarE.b.contains(strE)) && (strF == null || strF.length() == 0 || !abfvVarE.a.contains(strF)))) {
                        i2 = i9;
                    } else {
                        i2 = i9 & (-9);
                    }
                }
                int i11 = i2;
                if (aaukVar.b.l(222, 45824185L, false)) {
                    i3 = i11;
                } else {
                    long j4 = aaroVar.d;
                    i3 = i11 | ((j4 <= 0 || jB >= j4 - aaroVar.c) ? 0 : SemanticState.Obscured);
                }
                if ((i3 & SemanticState.Obscured) != 0) {
                    this.C.c(this.O, aaroVar.d - aaroVar.c);
                    z9 = true;
                }
                z8 = (!((i3 & 2) == 0)) | z8;
                boolean z10 = (!((i3 & 8) == 0)) | z5;
                if (i3 != 0) {
                    r(aaroVar, i3);
                    z5 = z10;
                    objArr = objArr2;
                    aaukVar = aaukVar;
                    i8 = i10;
                    it2 = it3;
                    i = 0;
                    z7 = true;
                } else {
                    aass aassVar = this.f;
                    String str = aaroVar.a;
                    if (aassVar.d(str)) {
                        z5 = z10;
                        objArr = objArr2;
                        aaukVar = aaukVar;
                        i8 = i10;
                        it2 = it3;
                        i = 0;
                        z6 = 1;
                    } else {
                        if (set2.contains(str)) {
                            synchronized (this.q) {
                                z6 = (z6 ? 1 : 0) | (this.s.containsKey(str) ? 1 : 0);
                            }
                        } else {
                            aamb aambVar2 = aaroVar.e;
                            if (aambVar2.b("retry_strategy", 1) != 2 || objArr2 == false) {
                                ahno.O(!aassVar.d(str));
                                if (u()) {
                                    aambVar2.h("is_unmetered_5g", true);
                                }
                                if (aaukVar.j() && aaukVar.h() && !this.n) {
                                    boolean zG = aaukVar.g();
                                    if (this.n) {
                                        iB = aambVar2.b("transfer_type", 0);
                                        if (aassVar.c(iB)) {
                                            aasyVar = this.N;
                                            aamwVarA = aaroVar.a();
                                            set = set2;
                                            aaqnVarB = ((aanb) aasyVar.c.io()).b();
                                            z2 = z10;
                                            j = jB;
                                            if (aaqnVarB.s().equals("NO_OP_STORE_TAG")) {
                                                ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 103, "DefaultTransferTaskSelector.java")).t("[Offline] account logged out");
                                            } else if (TextUtils.equals(aaqnVarB.s(), aamwVarA.h)) {
                                                aadcVarC = aaqnVarB.c();
                                                if (aadcVarC == null) {
                                                    ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 115, "DefaultTransferTaskSelector.java")).t("[Offline] cache supplier missing");
                                                } else {
                                                    aamcVarC = aadcVarC.c();
                                                    if (aamcVarC == null) {
                                                        ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 120, "DefaultTransferTaskSelector.java")).t("[Offline] storage location missing");
                                                    } else {
                                                        aasx aasxVar = new aasx(aasyVar, aamwVarA);
                                                        mbc mbcVar = aasyVar.e;
                                                        Object obj = aasy.b;
                                                        ygf ygfVar = (ygf) aasyVar.f.io();
                                                        tgr tgrVar = aasyVar.k;
                                                        Optional optional = aasyVar.h;
                                                        yha yhaVar = aasyVar.j;
                                                        zjr zjrVar = aasyVar.g;
                                                        abxv abxvVar2 = aasyVar.l;
                                                        aamb aambVar3 = aamwVarA.f;
                                                        boolean zM = aambVar3.m("is_external_media_source", false);
                                                        mbcVar.getClass();
                                                        ygfVar.getClass();
                                                        tgrVar.getClass();
                                                        yhaVar.getClass();
                                                        zjrVar.getClass();
                                                        abxvVar2.getClass();
                                                        aatjVar = new aatj(aasxVar, aamcVarC, mbcVar, obj, ygfVar, tgrVar, optional, zjrVar, zM);
                                                        iB2 = aambVar3.b("transfer_type", 0);
                                                        awmdVar = (awmd) aasyVar.i.get(Integer.valueOf(iB2));
                                                        if (awmdVar != null) {
                                                            i = 0;
                                                            zvp.a(zvn.b, zvm.C, a.bR(iB2, "Unrecognized transfer type: "));
                                                            throw new IllegalArgumentException(a.bR(iB2, "Unrecognized transfer type: "));
                                                        }
                                                        aarwVarA = ((aatq) awmdVar.io()).a(aamwVarA, this, aatjVar, aaqnVarB);
                                                    }
                                                    if (aarwVarA != null) {
                                                    }
                                                    i = 0;
                                                    if (aaroVar.b != 0) {
                                                        aaroVar.b = 0;
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    aarw aarwVarA2 = aassVar.a(str);
                                                    if (zE) {
                                                        i5 = 1;
                                                        if (z3) {
                                                            this.c.j(aaroVar);
                                                            m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                        }
                                                    } else {
                                                        i5 = 1;
                                                        if (z3) {
                                                            this.c.j(aaroVar);
                                                            m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                        }
                                                    }
                                                    i4 = i5;
                                                }
                                            } else {
                                                aadcVarC = aaqnVarB.c();
                                                if (aadcVarC == null) {
                                                    ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 115, "DefaultTransferTaskSelector.java")).t("[Offline] cache supplier missing");
                                                } else {
                                                    aamcVarC = aadcVarC.c();
                                                    if (aamcVarC == null) {
                                                        ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 120, "DefaultTransferTaskSelector.java")).t("[Offline] storage location missing");
                                                    } else {
                                                        aasx aasxVar2 = new aasx(aasyVar, aamwVarA);
                                                        mbc mbcVar2 = aasyVar.e;
                                                        Object obj2 = aasy.b;
                                                        ygf ygfVar2 = (ygf) aasyVar.f.io();
                                                        tgr tgrVar2 = aasyVar.k;
                                                        Optional optional2 = aasyVar.h;
                                                        yha yhaVar2 = aasyVar.j;
                                                        zjr zjrVar2 = aasyVar.g;
                                                        abxv abxvVar3 = aasyVar.l;
                                                        aamb aambVar4 = aamwVarA.f;
                                                        boolean zM2 = aambVar4.m("is_external_media_source", false);
                                                        mbcVar2.getClass();
                                                        ygfVar2.getClass();
                                                        tgrVar2.getClass();
                                                        yhaVar2.getClass();
                                                        zjrVar2.getClass();
                                                        abxvVar3.getClass();
                                                        aatjVar = new aatj(aasxVar2, aamcVarC, mbcVar2, obj2, ygfVar2, tgrVar2, optional2, zjrVar2, zM2);
                                                        iB2 = aambVar4.b("transfer_type", 0);
                                                        awmdVar = (awmd) aasyVar.i.get(Integer.valueOf(iB2));
                                                        if (awmdVar != null) {
                                                            i = 0;
                                                            zvp.a(zvn.b, zvm.C, a.bR(iB2, "Unrecognized transfer type: "));
                                                            throw new IllegalArgumentException(a.bR(iB2, "Unrecognized transfer type: "));
                                                        }
                                                        aarwVarA = ((aatq) awmdVar.io()).a(aamwVarA, this, aatjVar, aaqnVarB);
                                                    }
                                                    if (aarwVarA != null) {
                                                    }
                                                    i = 0;
                                                    if (aaroVar.b != 0) {
                                                        aaroVar.b = 0;
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    aarw aarwVarA3 = aassVar.a(str);
                                                    if (zE) {
                                                        i5 = 1;
                                                        if (z3) {
                                                            this.c.j(aaroVar);
                                                            m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                        }
                                                    } else {
                                                        i5 = 1;
                                                        if (z3) {
                                                            this.c.j(aaroVar);
                                                            m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                        }
                                                    }
                                                    i4 = i5;
                                                }
                                            }
                                            aarwVarA = null;
                                            if (aarwVarA != null) {
                                            }
                                            i = 0;
                                            if (aaroVar.b != 0) {
                                                aaroVar.b = 0;
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            aarw aarwVarA4 = aassVar.a(str);
                                            if (zE) {
                                                i5 = 1;
                                                if (z3) {
                                                    this.c.j(aaroVar);
                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                }
                                            } else {
                                                i5 = 1;
                                                if (z3) {
                                                    this.c.j(aaroVar);
                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                }
                                            }
                                            i4 = i5;
                                        } else {
                                            set = set2;
                                            z2 = z10;
                                            j = jB;
                                        }
                                        i = 0;
                                        if (aaroVar.b != 0) {
                                            aaroVar.b = 0;
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        aarw aarwVarA5 = aassVar.a(str);
                                        if (zE) {
                                            i5 = 1;
                                            if (z3) {
                                                this.c.j(aaroVar);
                                                m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                            }
                                        } else {
                                            i5 = 1;
                                            if (z3) {
                                                this.c.j(aaroVar);
                                                m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                            }
                                        }
                                        i4 = i5;
                                    } else {
                                        if (!this.o) {
                                            if (aacy.a(this.b, zG)) {
                                                this.o = true;
                                            } else {
                                                iB = aambVar2.b("transfer_type", 0);
                                                if (aassVar.c(iB)) {
                                                    set = set2;
                                                    z2 = z10;
                                                    j = jB;
                                                } else {
                                                    aasyVar = this.N;
                                                    aamwVarA = aaroVar.a();
                                                    set = set2;
                                                    aaqnVarB = ((aanb) aasyVar.c.io()).b();
                                                    z2 = z10;
                                                    j = jB;
                                                    if (aaqnVarB.s().equals("NO_OP_STORE_TAG")) {
                                                        ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 103, "DefaultTransferTaskSelector.java")).t("[Offline] account logged out");
                                                    } else if (TextUtils.equals(aaqnVarB.s(), aamwVarA.h)) {
                                                        aadcVarC = aaqnVarB.c();
                                                        if (aadcVarC == null) {
                                                            ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 115, "DefaultTransferTaskSelector.java")).t("[Offline] cache supplier missing");
                                                        } else {
                                                            aamcVarC = aadcVarC.c();
                                                            if (aamcVarC == null) {
                                                                ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 120, "DefaultTransferTaskSelector.java")).t("[Offline] storage location missing");
                                                            } else {
                                                                aasx aasxVar3 = new aasx(aasyVar, aamwVarA);
                                                                mbc mbcVar3 = aasyVar.e;
                                                                Object obj3 = aasy.b;
                                                                ygf ygfVar3 = (ygf) aasyVar.f.io();
                                                                tgr tgrVar3 = aasyVar.k;
                                                                Optional optional3 = aasyVar.h;
                                                                yha yhaVar3 = aasyVar.j;
                                                                zjr zjrVar3 = aasyVar.g;
                                                                abxv abxvVar4 = aasyVar.l;
                                                                aamb aambVar5 = aamwVarA.f;
                                                                boolean zM3 = aambVar5.m("is_external_media_source", false);
                                                                mbcVar3.getClass();
                                                                ygfVar3.getClass();
                                                                tgrVar3.getClass();
                                                                yhaVar3.getClass();
                                                                zjrVar3.getClass();
                                                                abxvVar4.getClass();
                                                                aatjVar = new aatj(aasxVar3, aamcVarC, mbcVar3, obj3, ygfVar3, tgrVar3, optional3, zjrVar3, zM3);
                                                                iB2 = aambVar5.b("transfer_type", 0);
                                                                awmdVar = (awmd) aasyVar.i.get(Integer.valueOf(iB2));
                                                                if (awmdVar != null) {
                                                                    i = 0;
                                                                    zvp.a(zvn.b, zvm.C, a.bR(iB2, "Unrecognized transfer type: "));
                                                                    throw new IllegalArgumentException(a.bR(iB2, "Unrecognized transfer type: "));
                                                                }
                                                                aarwVarA = ((aatq) awmdVar.io()).a(aamwVarA, this, aatjVar, aaqnVarB);
                                                            }
                                                            if (aarwVarA != null) {
                                                            }
                                                            i = 0;
                                                            if (aaroVar.b != 0) {
                                                                aaroVar.b = 0;
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            aarw aarwVarA6 = aassVar.a(str);
                                                            if (zE) {
                                                                i5 = 1;
                                                                if (z3) {
                                                                    this.c.j(aaroVar);
                                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                                }
                                                            } else {
                                                                i5 = 1;
                                                                if (z3) {
                                                                    this.c.j(aaroVar);
                                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                                }
                                                            }
                                                            i4 = i5;
                                                        }
                                                    } else {
                                                        aadcVarC = aaqnVarB.c();
                                                        if (aadcVarC == null) {
                                                            ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 115, "DefaultTransferTaskSelector.java")).t("[Offline] cache supplier missing");
                                                        } else {
                                                            aamcVarC = aadcVarC.c();
                                                            if (aamcVarC == null) {
                                                                ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 120, "DefaultTransferTaskSelector.java")).t("[Offline] storage location missing");
                                                            } else {
                                                                aasx aasxVar4 = new aasx(aasyVar, aamwVarA);
                                                                mbc mbcVar4 = aasyVar.e;
                                                                Object obj4 = aasy.b;
                                                                ygf ygfVar4 = (ygf) aasyVar.f.io();
                                                                tgr tgrVar4 = aasyVar.k;
                                                                Optional optional4 = aasyVar.h;
                                                                yha yhaVar4 = aasyVar.j;
                                                                zjr zjrVar4 = aasyVar.g;
                                                                abxv abxvVar5 = aasyVar.l;
                                                                aamb aambVar6 = aamwVarA.f;
                                                                boolean zM4 = aambVar6.m("is_external_media_source", false);
                                                                mbcVar4.getClass();
                                                                ygfVar4.getClass();
                                                                tgrVar4.getClass();
                                                                yhaVar4.getClass();
                                                                zjrVar4.getClass();
                                                                abxvVar5.getClass();
                                                                aatjVar = new aatj(aasxVar4, aamcVarC, mbcVar4, obj4, ygfVar4, tgrVar4, optional4, zjrVar4, zM4);
                                                                iB2 = aambVar6.b("transfer_type", 0);
                                                                awmdVar = (awmd) aasyVar.i.get(Integer.valueOf(iB2));
                                                                if (awmdVar != null) {
                                                                    i = 0;
                                                                    zvp.a(zvn.b, zvm.C, a.bR(iB2, "Unrecognized transfer type: "));
                                                                    throw new IllegalArgumentException(a.bR(iB2, "Unrecognized transfer type: "));
                                                                }
                                                                aarwVarA = ((aatq) awmdVar.io()).a(aamwVarA, this, aatjVar, aaqnVarB);
                                                            }
                                                            if (aarwVarA != null) {
                                                            }
                                                            i = 0;
                                                            if (aaroVar.b != 0) {
                                                                aaroVar.b = 0;
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            aarw aarwVarA7 = aassVar.a(str);
                                                            if (zE) {
                                                                i5 = 1;
                                                                if (z3) {
                                                                    this.c.j(aaroVar);
                                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                                }
                                                            } else {
                                                                i5 = 1;
                                                                if (z3) {
                                                                    this.c.j(aaroVar);
                                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                                }
                                                            }
                                                            i4 = i5;
                                                        }
                                                    }
                                                    aarwVarA = null;
                                                    if (aarwVarA != null) {
                                                    }
                                                    i = 0;
                                                    if (aaroVar.b != 0) {
                                                        aaroVar.b = 0;
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    aarw aarwVarA8 = aassVar.a(str);
                                                    if (zE) {
                                                        i5 = 1;
                                                        if (z3) {
                                                            this.c.j(aaroVar);
                                                            m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                        }
                                                    } else {
                                                        i5 = 1;
                                                        if (z3) {
                                                            this.c.j(aaroVar);
                                                            m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                        }
                                                    }
                                                    i4 = i5;
                                                }
                                                i = 0;
                                                if (aaroVar.b != 0) {
                                                    aaroVar.b = 0;
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                aarw aarwVarA9 = aassVar.a(str);
                                                if (zE) {
                                                    i5 = 1;
                                                    if (z3) {
                                                        this.c.j(aaroVar);
                                                        m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                    }
                                                } else {
                                                    i5 = 1;
                                                    if (z3) {
                                                        this.c.j(aaroVar);
                                                        m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                    }
                                                }
                                                i4 = i5;
                                            }
                                        }
                                        set = set2;
                                        z2 = z10;
                                        j = jB;
                                        i = 0;
                                        i4 = 0;
                                    }
                                } else {
                                    try {
                                        iB = aambVar2.b("transfer_type", 0);
                                        try {
                                            if (aassVar.c(iB)) {
                                                set = set2;
                                                z2 = z10;
                                                j = jB;
                                            } else {
                                                aasyVar = this.N;
                                                aamwVarA = aaroVar.a();
                                                set = set2;
                                                try {
                                                    aaqnVarB = ((aanb) aasyVar.c.io()).b();
                                                    z2 = z10;
                                                    try {
                                                        j = jB;
                                                        try {
                                                            if (aaqnVarB.s().equals("NO_OP_STORE_TAG")) {
                                                                ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 103, "DefaultTransferTaskSelector.java")).t("[Offline] account logged out");
                                                            } else if (TextUtils.equals(aaqnVarB.s(), aamwVarA.h) || aaqnVarB.b().equals(aamwVarA.j)) {
                                                                aadcVarC = aaqnVarB.c();
                                                                if (aadcVarC == null) {
                                                                    ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 115, "DefaultTransferTaskSelector.java")).t("[Offline] cache supplier missing");
                                                                } else {
                                                                    aamcVarC = aadcVarC.c();
                                                                    if (aamcVarC == null) {
                                                                        ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 120, "DefaultTransferTaskSelector.java")).t("[Offline] storage location missing");
                                                                    } else {
                                                                        aasx aasxVar5 = new aasx(aasyVar, aamwVarA);
                                                                        mbc mbcVar5 = aasyVar.e;
                                                                        Object obj5 = aasy.b;
                                                                        ygf ygfVar5 = (ygf) aasyVar.f.io();
                                                                        tgr tgrVar5 = aasyVar.k;
                                                                        Optional optional5 = aasyVar.h;
                                                                        yha yhaVar5 = aasyVar.j;
                                                                        zjr zjrVar5 = aasyVar.g;
                                                                        abxv abxvVar6 = aasyVar.l;
                                                                        aamb aambVar7 = aamwVarA.f;
                                                                        try {
                                                                            boolean zM5 = aambVar7.m("is_external_media_source", false);
                                                                            mbcVar5.getClass();
                                                                            ygfVar5.getClass();
                                                                            tgrVar5.getClass();
                                                                            yhaVar5.getClass();
                                                                            zjrVar5.getClass();
                                                                            abxvVar6.getClass();
                                                                            aatjVar = new aatj(aasxVar5, aamcVarC, mbcVar5, obj5, ygfVar5, tgrVar5, optional5, zjrVar5, zM5);
                                                                            try {
                                                                                iB2 = aambVar7.b("transfer_type", 0);
                                                                                awmdVar = (awmd) aasyVar.i.get(Integer.valueOf(iB2));
                                                                                if (awmdVar != null) {
                                                                                    aarwVarA = ((aatq) awmdVar.io()).a(aamwVarA, this, aatjVar, aaqnVarB);
                                                                                } else {
                                                                                    i = 0;
                                                                                    try {
                                                                                        zvp.a(zvn.b, zvm.C, a.bR(iB2, "Unrecognized transfer type: "));
                                                                                        throw new IllegalArgumentException(a.bR(iB2, "Unrecognized transfer type: "));
                                                                                    } catch (IllegalArgumentException unused) {
                                                                                        aasi aasiVarA = aasj.a(10);
                                                                                        aasiVarA.f(str);
                                                                                        aasiVarA.d(aamg.CANNOT_OFFLINE);
                                                                                        aasiVarA.c(aogv.NOT_OFFLINABLE);
                                                                                        f(aasiVarA.a());
                                                                                        i4 = i;
                                                                                        z6 = i4 | (z6 ? 1 : 0);
                                                                                        objArr = objArr2;
                                                                                        aaukVar = aaukVar;
                                                                                        i8 = i10;
                                                                                        it2 = it3;
                                                                                        set2 = set;
                                                                                        z5 = z2;
                                                                                        jB = j;
                                                                                    }
                                                                                }
                                                                            } catch (IllegalArgumentException unused2) {
                                                                                i = 0;
                                                                            }
                                                                        } catch (IllegalArgumentException unused3) {
                                                                            i = 0;
                                                                        }
                                                                    }
                                                                    zE = aarwVarA != null ? aassVar.e(str, aarwVarA, iB) : false;
                                                                    i = 0;
                                                                    if (aaroVar.b != 0) {
                                                                        aaroVar.b = 0;
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                    aarw aarwVarA10 = aassVar.a(str);
                                                                    if (zE || aarwVarA10 == null) {
                                                                        i5 = 1;
                                                                        if (z3) {
                                                                        }
                                                                        i4 = i5;
                                                                    } else {
                                                                        if (aaroVar.f.o()) {
                                                                            aaroVar.f.h("sd_card_offline_disk_error", false);
                                                                        }
                                                                        aaroVar.j = aqpc.TRANSFER_STATE_TRANSFERRING;
                                                                        if (aaukVar.g()) {
                                                                            i = 0;
                                                                            if (aaukVar.h()) {
                                                                                if (aaukVar.j()) {
                                                                                    i5 = 1;
                                                                                    zA = this.n;
                                                                                } else {
                                                                                    i5 = 1;
                                                                                    zA = aacy.a(this.b, true);
                                                                                }
                                                                                z4 = zA;
                                                                            } else {
                                                                                i5 = 1;
                                                                                z4 = false;
                                                                            }
                                                                        } else {
                                                                            if (!aaukVar.h() || this.n || aaukVar.j()) {
                                                                                i = 0;
                                                                            } else {
                                                                                i = 0;
                                                                                this.n = aacy.a(this.b, false);
                                                                            }
                                                                            z4 = this.n;
                                                                            i5 = 1;
                                                                        }
                                                                        if (!z4 && !this.p) {
                                                                            try {
                                                                                cls = Class.forName(this.O);
                                                                            } catch (ClassNotFoundException e) {
                                                                                ((agrc) ((agrc) w.b()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "getKeepAliveServiceClass", 1679, "DefaultTransfersExecutor.java")).w("[Offline] Cannot find class: %s", this.O);
                                                                                zvp.b(zvn.b, zvm.C, "Transfer executor cannot find transfer service class: ".concat(String.valueOf(e.getMessage())), e);
                                                                                cls = null;
                                                                            }
                                                                            if (cls != null) {
                                                                                Context context = this.b;
                                                                                this.p = aauq.a(context, new Intent(context, cls));
                                                                            } else {
                                                                                i4 = i;
                                                                            }
                                                                        }
                                                                        try {
                                                                            this.M.a(aarwVarA10);
                                                                        } catch (Throwable th) {
                                                                            zvp.b(zvn.b, zvm.C, "Failed to run transfer on TransfersRunner.", th);
                                                                        }
                                                                        if (!z4 && !this.p) {
                                                                            this.X.d("offline_transfer_keep_alive", 0L, 1, 1, false, null, null, false);
                                                                        }
                                                                    }
                                                                    this.c.j(aaroVar);
                                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                                    i4 = i5;
                                                                }
                                                            } else {
                                                                ((agrc) ((agrc) aasy.a.b()).k("com/google/android/libraries/youtube/offline/transfer/service/DefaultTransferTaskSelector", "selectTransferTask", 109, "DefaultTransferTaskSelector.java")).t("[Offline] incorrect account");
                                                            }
                                                            aarwVarA = null;
                                                            if (aarwVarA != null) {
                                                            }
                                                            i = 0;
                                                            if (aaroVar.b != 0) {
                                                                aaroVar.b = 0;
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            aarw aarwVarA11 = aassVar.a(str);
                                                            if (zE) {
                                                                i5 = 1;
                                                                if (z3) {
                                                                    this.c.j(aaroVar);
                                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                                }
                                                            } else {
                                                                i5 = 1;
                                                                if (z3) {
                                                                    this.c.j(aaroVar);
                                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                                }
                                                            }
                                                            i4 = i5;
                                                        } catch (IllegalArgumentException unused4) {
                                                            i = 0;
                                                            aasi aasiVarA2 = aasj.a(10);
                                                            aasiVarA2.f(str);
                                                            aasiVarA2.d(aamg.CANNOT_OFFLINE);
                                                            aasiVarA2.c(aogv.NOT_OFFLINABLE);
                                                            f(aasiVarA2.a());
                                                            i4 = i;
                                                            z6 = i4 | (z6 ? 1 : 0);
                                                            objArr = objArr2;
                                                            aaukVar = aaukVar;
                                                            i8 = i10;
                                                            it2 = it3;
                                                            set2 = set;
                                                            z5 = z2;
                                                            jB = j;
                                                        }
                                                    } catch (IllegalArgumentException unused5) {
                                                        j = jB;
                                                        i = 0;
                                                        aasi aasiVarA3 = aasj.a(10);
                                                        aasiVarA3.f(str);
                                                        aasiVarA3.d(aamg.CANNOT_OFFLINE);
                                                        aasiVarA3.c(aogv.NOT_OFFLINABLE);
                                                        f(aasiVarA3.a());
                                                        i4 = i;
                                                        z6 = i4 | (z6 ? 1 : 0);
                                                        objArr = objArr2;
                                                        aaukVar = aaukVar;
                                                        i8 = i10;
                                                        it2 = it3;
                                                        set2 = set;
                                                        z5 = z2;
                                                        jB = j;
                                                    }
                                                } catch (IllegalArgumentException unused6) {
                                                    z2 = z10;
                                                    j = jB;
                                                    i = 0;
                                                    aasi aasiVarA4 = aasj.a(10);
                                                    aasiVarA4.f(str);
                                                    aasiVarA4.d(aamg.CANNOT_OFFLINE);
                                                    aasiVarA4.c(aogv.NOT_OFFLINABLE);
                                                    f(aasiVarA4.a());
                                                    i4 = i;
                                                    z6 = i4 | (z6 ? 1 : 0);
                                                    objArr = objArr2;
                                                    aaukVar = aaukVar;
                                                    i8 = i10;
                                                    it2 = it3;
                                                    set2 = set;
                                                    z5 = z2;
                                                    jB = j;
                                                }
                                            }
                                            i = 0;
                                            if (aaroVar.b != 0) {
                                                aaroVar.b = 0;
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            aarw aarwVarA12 = aassVar.a(str);
                                            if (zE) {
                                                i5 = 1;
                                                if (z3) {
                                                    this.c.j(aaroVar);
                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                }
                                            } else {
                                                i5 = 1;
                                                if (z3) {
                                                    this.c.j(aaroVar);
                                                    m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, aarq.a(aaroVar.e));
                                                }
                                            }
                                            i4 = i5;
                                        } catch (IllegalArgumentException unused7) {
                                            set = set2;
                                        }
                                    } catch (IllegalArgumentException unused8) {
                                        set = set2;
                                        z2 = z10;
                                        i = 0;
                                        j = jB;
                                    }
                                }
                                z6 = i4 | (z6 ? 1 : 0);
                                objArr = objArr2;
                                aaukVar = aaukVar;
                                i8 = i10;
                                it2 = it3;
                                set2 = set;
                                z5 = z2;
                                jB = j;
                            }
                        }
                        z5 = z10;
                        objArr = objArr2;
                        aaukVar = aaukVar;
                        i8 = i10;
                        it2 = it3;
                        i = 0;
                    }
                }
            }
        }
        this.l = z6;
        this.m = z7;
        WifiManager.WifiLock wifiLock = this.R;
        if (z6 != 0) {
            if (!wifiLock.isHeld()) {
                wifiLock.acquire();
            }
            this.J.kk(aash.f);
        } else {
            if (wifiLock.isHeld()) {
                wifiLock.release();
            }
            if (z5) {
                this.J.kk(aash.c);
            } else if (z8) {
                this.J.kk(aash.d);
            } else if (z9) {
                this.J.kk(aash.e);
            } else {
                boolean z11 = this.k;
                awkv awkvVar = this.J;
                if (z11) {
                    awkvVar.kk(aash.a);
                } else {
                    awkvVar.kk(aash.b);
                }
            }
        }
        q(z8, z5);
    }

    private final void o() {
        try {
            this.P.release();
        } catch (RuntimeException unused) {
            ((agrc) ((agrc) w.c()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "releaseWakeLock", 1284, "DefaultTransfersExecutor.java")).t("[Offline] Wakelock already released.");
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Set] */
    private final void p(aaro aaroVar) {
        aaqn aaqnVarB;
        abfv abfvVarE;
        if (!((vxz) this.H.io()).m(58, 45813924L) || (aaqnVarB = ((aanb) this.D.io()).b()) == null || (abfvVarE = aaqnVarB.E()) == null) {
            return;
        }
        aamb aambVar = aaroVar.e;
        String strE = aarq.e(aambVar);
        if (!TextUtils.isEmpty(strE)) {
            abfvVarE.b.remove(strE);
        }
        String strF = aambVar.f("playlist_id");
        if (strF != null) {
            for (aaro aaroVar2 : this.u.h()) {
                if (!aaroVar2.a.equals(aaroVar.a) && strF.equals(aaroVar2.e.f("playlist_id"))) {
                    return;
                }
            }
            abfvVarE.a.remove(strF);
        }
    }

    private final void q(boolean z2, boolean z3) {
        syn synVar = this.X;
        if (z2) {
            synVar.d("transfer_connectivity_wakeup", a, 2, 1, false, j(), null, false);
        } else {
            synVar.b("transfer_connectivity_wakeup");
        }
        syn synVar2 = this.X;
        if (z3) {
            synVar2.d("transfer_wifi_wakeup", a, 2, 2, false, j(), null, false);
            this.Z.f(this.O);
        } else {
            synVar2.b("transfer_wifi_wakeup");
            this.Z.e();
        }
    }

    private final void r(aaro aaroVar, int i) {
        boolean z2;
        aqpc aqpcVar = aaroVar.j;
        aqpc aqpcVar2 = aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
        boolean z3 = true;
        if (aqpcVar != aqpcVar2) {
            aaroVar.j = aqpcVar2;
            z2 = true;
        } else {
            z2 = false;
        }
        String str = aaroVar.a;
        aarw aarwVarB = this.f.b(str);
        if (aarwVarB != null) {
            aarwVarB.a(i);
        }
        aaroVar.i = 0;
        if (this.i.remove(str)) {
            aarq.f(aaroVar.e, this.B.f().toEpochMilli());
            z2 = true;
        }
        if (aaroVar.b != i) {
            aaroVar.b = i;
        } else {
            z3 = z2;
        }
        this.c.j(aaroVar);
        if (z3) {
            m(aaroVar.a(), aogv.UNKNOWN_FAILURE_REASON, (aaroVar.b & 384) != 0 ? aamg.PAUSED : aarq.a(aaroVar.e));
        }
    }

    private final boolean s() {
        return !this.W.h();
    }

    private final boolean t() {
        if (this.S == atpr.ANY) {
            return false;
        }
        if (!s()) {
            tfq tfqVar = this.W;
            if (tfqVar.j(1) && !tfqVar.g()) {
                return false;
            }
        }
        return true;
    }

    private final boolean u() {
        return this.aa.z() && this.W.k();
    }

    private final boolean v() {
        tfq tfqVar = this.W;
        return (tfqVar.j(1) && !tfqVar.g()) || u();
    }

    @Override // defpackage.aarv
    public final void a(String str, aamb aambVar) {
        aasi aasiVarA = aasj.a(8);
        aasiVarA.f(str);
        aasiVarA.d = aambVar;
        f(aasiVarA.a());
    }

    @Override // defpackage.aarv
    public final void b(String str, long j, double d, boolean z2) {
        aasi aasiVarA = aasj.a(7);
        aasiVarA.f(str);
        aasiVarA.b(j);
        aasiVarA.h(d);
        aasiVarA.i(z2);
        f(aasiVarA.a());
    }

    @Override // defpackage.aarv
    public final void c(String str, aarx aarxVar, aamb aambVar) {
        int i;
        aaro aaroVarE = this.u.e(str);
        if (aaroVarE != null) {
            int i2 = aaroVarE.i + 1;
            aogv aogvVar = aarxVar.c;
            boolean z2 = aarxVar.a;
            if (aogvVar == aogv.STREAM_VERIFICATION_FAILED) {
                long j = aarq.a;
                aambVar.j("stream_verification_attempts", aambVar.b("stream_verification_attempts", 0) + 1);
            }
            if (z2) {
                i = 13;
            } else {
                aamb aambVar2 = aaroVarE.e;
                agru agruVarB = w.b();
                long j2 = aarq.a;
                i = 13;
                ((agrc) ((agrc) ((agrc) agruVarB).j(aarxVar)).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "onError", (char) 2055, "DefaultTransfersExecutor.java")).w("[Offline] Transfer failed due to retry-able error, transfer nonce = %s", aambVar2.p());
                if (aalu.b(aambVar2)) {
                    aihf aihfVarC = aalu.c(aaroVarE.a());
                    aihfVarC.copyOnWrite();
                    aogy aogyVar = (aogy) aihfVarC.instance;
                    aogy aogyVar2 = aogy.a;
                    aogyVar.h = 13;
                    aogyVar.b |= 16;
                    aihfVarC.copyOnWrite();
                    aogy aogyVar3 = (aogy) aihfVarC.instance;
                    aogyVar3.i = aogvVar.H;
                    aogyVar3.b |= 32;
                    aihfVarC.copyOnWrite();
                    aogy aogyVar4 = (aogy) aihfVarC.instance;
                    aogyVar4.g = 3;
                    aogyVar4.b |= 8;
                    boolean z3 = aaut.a;
                    aihfVarC.copyOnWrite();
                    aogy aogyVar5 = (aogy) aihfVarC.instance;
                    aogyVar5.c |= 64;
                    aogyVar5.A = z3;
                    if (aarxVar.getCause() != null && aogvVar == aogv.OFFLINE_DISK_ERROR) {
                        String simpleName = aarxVar.getCause().getClass().getSimpleName();
                        aihfVarC.copyOnWrite();
                        aogy aogyVar6 = (aogy) aihfVarC.instance;
                        simpleName.getClass();
                        aogyVar6.b |= SemanticState.Focused;
                        aogyVar6.j = simpleName;
                    }
                    this.E.d((aogy) aihfVarC.build());
                }
                long jD = aambVar2.d("back_off_total_millis", 0L);
                long millis = TimeUnit.HOURS.toMillis(this.G.c().s);
                if (aambVar2.b("retry_strategy", 1) == 0) {
                    aogvVar = aogv.RETRY_NOT_ALLOWED;
                } else if (i2 > aambVar2.b("max_retries", 35) || (millis > 0 && jD >= millis)) {
                    aogvVar = aogv.TOO_MANY_RETRIES;
                } else if (aambVar.b("stream_verification_attempts", 0) > 2) {
                    aogvVar = aogv.TOO_MANY_FAILED_STREAM_VERIFICATIONS;
                }
                z2 = true;
            }
            if (aogvVar == aogv.OFFLINE_DISK_ERROR) {
                awmd awmdVar = this.D;
                aadc aadcVarC = ((aanb) awmdVar.io()).b().c();
                aalf aalfVarG = ((aanb) awmdVar.io()).b().g();
                if (aadcVarC != null && aalfVarG != null && aadcVarC.e() != null && aalfVarG.q()) {
                    long j3 = aarq.a;
                    aambVar.h("sd_card_offline_disk_error", true);
                }
            }
            aasi aasiVarA = aasj.a(17);
            aasiVarA.f(str);
            aasiVarA.d = aambVar;
            f(aasiVarA.a());
            if (aarxVar.getCause() instanceof aarr) {
                aarr aarrVar = (aarr) aarxVar.getCause();
                aasi aasiVarA2 = aasj.a(i);
                aasiVarA2.f(str);
                aasiVarA2.e(SemanticState.Obscured);
                f(aasiVarA2.a());
                h();
                this.C.c(this.O, aarrVar.a);
                return;
            }
            if (!z2) {
                aasi aasiVarA3 = aasj.a(9);
                aasiVarA3.f(str);
                f(aasiVarA3.a());
            } else {
                aasi aasiVarA4 = aasj.a(10);
                aasiVarA4.f(str);
                aasiVarA4.d(aarxVar.b);
                aasiVarA4.c(aogvVar);
                f(aasiVarA4.a());
            }
        }
    }

    @Override // defpackage.aasa
    public final void d(String str) {
        aasi aasiVarA = aasj.a(1);
        aasiVarA.a = agev.i(str);
        f(aasiVarA.a());
    }

    public final int e() {
        int size;
        synchronized (this.q) {
            size = this.U.size() + this.s.size();
        }
        return size;
    }

    public final void f(aasj aasjVar) {
        if (this.k) {
            return;
        }
        synchronized (this.q) {
            k();
            this.U.add(aasjVar);
            g();
        }
    }

    public final void g() {
        ListenableFuture listenableFuture;
        synchronized (this.q) {
            if (!this.U.isEmpty() && ((listenableFuture = this.r) == null || listenableFuture.isDone())) {
                aadm aadmVar = new aadm(this, 10);
                ScheduledExecutorService scheduledExecutorService = this.A;
                ListenableFuture listenableFutureQ = ahng.q(aadmVar, scheduledExecutorService);
                this.r = listenableFutureQ;
                listenableFutureQ.addListener(new aadm(this, 11), scheduledExecutorService);
            }
        }
    }

    @Override // defpackage.aasp
    public final void h() {
        f(aasj.a(4).a());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0235 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x024b A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0258 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0268 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0298 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a0 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02ae A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02d4 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02df A[Catch: all -> 0x0350, TryCatch #10 {all -> 0x0350, blocks: (B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea), top: B:361:0x02db, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02f3 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, LOOP:1: B:123:0x02eb->B:125:0x02f3, LOOP_END, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x032d A[Catch: all -> 0x034c, TryCatch #7 {, blocks: (B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340), top: B:357:0x0318, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0335 A[Catch: all -> 0x034c, TryCatch #7 {, blocks: (B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340), top: B:357:0x0318, outer: #16 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x001c A[Catch: Error | RuntimeException -> 0x08f0, RuntimeException -> 0x08f2, TRY_ENTER, TryCatch #19 {Error | RuntimeException -> 0x08f0, blocks: (B:8:0x0012, B:13:0x001c, B:15:0x0020), top: B:368:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0352 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x035a A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0368 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x036f A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x037f A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x03aa A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0020 A[Catch: Error | RuntimeException -> 0x08f0, RuntimeException -> 0x08f2, TRY_LEAVE, TryCatch #19 {Error | RuntimeException -> 0x08f0, blocks: (B:8:0x0012, B:13:0x001c, B:15:0x0020), top: B:368:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x03b2 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x03e1 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x03e9 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x03f1 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x03f9 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0412 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0445 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0448 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x044b A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x044e A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x0451 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0454 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x0457 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x045a A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0489 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0491 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x04a2 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:191:0x04d8 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x050e A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x0549 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x057e A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0586 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x0594 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: Error | RuntimeException -> 0x009f, RuntimeException -> 0x00a1, TRY_ENTER, TryCatch #17 {Error | RuntimeException -> 0x009f, blocks: (B:10:0x0016, B:20:0x0045, B:21:0x0049, B:42:0x008c, B:45:0x008f, B:47:0x0097, B:48:0x009b, B:22:0x004a, B:26:0x005e, B:31:0x006d, B:37:0x0079, B:39:0x0089, B:38:0x0082), top: B:371:0x0016, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0598 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x05e3 A[Catch: all -> 0x0657, RuntimeException -> 0x065d, TryCatch #15 {RuntimeException -> 0x065d, all -> 0x0657, blocks: (B:213:0x05db, B:215:0x05e3, B:217:0x05f1), top: B:372:0x05db }] */
    /* JADX WARN: Code duplicated, block: B:217:0x05f1 A[Catch: all -> 0x0657, RuntimeException -> 0x065d, TRY_LEAVE, TryCatch #15 {RuntimeException -> 0x065d, all -> 0x0657, blocks: (B:213:0x05db, B:215:0x05e3, B:217:0x05f1), top: B:372:0x05db }] */
    /* JADX WARN: Code duplicated, block: B:220:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:222:0x0612  */
    /* JADX WARN: Code duplicated, block: B:224:0x0654  */
    /* JADX WARN: Code duplicated, block: B:231:0x0663 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x066c A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x067a A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0682 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x06b0 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x06b9 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x06c9 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x06d9 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x06df A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x06e8 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x06f9 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0700 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x070b A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x071b A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x074c A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0755 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x0766 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x076c A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x0772 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:268:0x07a8 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x07bb A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x07e0 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x07f3 A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x080f A[Catch: all -> 0x0853, RuntimeException -> 0x0856, TryCatch #20 {RuntimeException -> 0x0856, all -> 0x0853, blocks: (B:221:0x05fa, B:223:0x0613, B:231:0x0663, B:233:0x066c, B:235:0x067a, B:237:0x0682, B:238:0x0684, B:239:0x06b0, B:241:0x06b9, B:243:0x06c9, B:244:0x06d9, B:245:0x06df, B:247:0x06e8, B:249:0x06f9, B:250:0x0700, B:252:0x070b, B:253:0x070e, B:255:0x071b, B:256:0x0747, B:257:0x074c, B:259:0x0755, B:261:0x0766, B:263:0x076c, B:265:0x0772, B:266:0x0775, B:267:0x07a3, B:268:0x07a8, B:270:0x07bb, B:271:0x07e0, B:273:0x07eb, B:275:0x07f3, B:276:0x0809, B:278:0x080f, B:280:0x0829, B:281:0x0833), top: B:367:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x085b A[Catch: Error -> 0x08ec, RuntimeException -> 0x08ee, TRY_ENTER, TryCatch #18 {Error -> 0x08ec, RuntimeException -> 0x08ee, blocks: (B:288:0x085b, B:290:0x085f, B:294:0x0867, B:319:0x08c5, B:320:0x08c9, B:321:0x08cc, B:324:0x08d3, B:326:0x08d7, B:330:0x08df, B:331:0x08e5, B:332:0x08e8, B:333:0x08eb, B:312:0x08b7, B:314:0x08bb, B:318:0x08c3), top: B:370:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x0867 A[Catch: Error -> 0x08ec, RuntimeException -> 0x08ee, TRY_LEAVE, TryCatch #18 {Error -> 0x08ec, RuntimeException -> 0x08ee, blocks: (B:288:0x085b, B:290:0x085f, B:294:0x0867, B:319:0x08c5, B:320:0x08c9, B:321:0x08cc, B:324:0x08d3, B:326:0x08d7, B:330:0x08df, B:331:0x08e5, B:332:0x08e8, B:333:0x08eb, B:312:0x08b7, B:314:0x08bb, B:318:0x08c3), top: B:370:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:296:0x086c  */
    /* JADX WARN: Code duplicated, block: B:306:0x0887 A[Catch: all -> 0x08d0, TryCatch #9 {all -> 0x08d0, blocks: (B:304:0x087d, B:306:0x0887, B:308:0x0891, B:310:0x08b4, B:297:0x0871), top: B:355:0x0871 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x0891 A[Catch: all -> 0x08d0, TryCatch #9 {all -> 0x08d0, blocks: (B:304:0x087d, B:306:0x0887, B:308:0x0891, B:310:0x08b4, B:297:0x0871), top: B:355:0x0871 }] */
    /* JADX WARN: Code duplicated, block: B:309:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:312:0x08b7 A[Catch: Error -> 0x08ec, RuntimeException -> 0x08ee, TRY_ENTER, TryCatch #18 {Error -> 0x08ec, RuntimeException -> 0x08ee, blocks: (B:288:0x085b, B:290:0x085f, B:294:0x0867, B:319:0x08c5, B:320:0x08c9, B:321:0x08cc, B:324:0x08d3, B:326:0x08d7, B:330:0x08df, B:331:0x08e5, B:332:0x08e8, B:333:0x08eb, B:312:0x08b7, B:314:0x08bb, B:318:0x08c3), top: B:370:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x08c3 A[Catch: Error -> 0x08ec, RuntimeException -> 0x08ee, TryCatch #18 {Error -> 0x08ec, RuntimeException -> 0x08ee, blocks: (B:288:0x085b, B:290:0x085f, B:294:0x0867, B:319:0x08c5, B:320:0x08c9, B:321:0x08cc, B:324:0x08d3, B:326:0x08d7, B:330:0x08df, B:331:0x08e5, B:332:0x08e8, B:333:0x08eb, B:312:0x08b7, B:314:0x08bb, B:318:0x08c3), top: B:370:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x08c9 A[Catch: Error -> 0x08ec, RuntimeException -> 0x08ee, PHI: r11
      0x08c9: PHI (r11v9 ??) = (r11v72 ??), (r11v73 ??) binds: [B:317:0x08c1, B:293:0x0865] A[DONT_GENERATE, DONT_INLINE], TryCatch #18 {Error -> 0x08ec, RuntimeException -> 0x08ee, blocks: (B:288:0x085b, B:290:0x085f, B:294:0x0867, B:319:0x08c5, B:320:0x08c9, B:321:0x08cc, B:324:0x08d3, B:326:0x08d7, B:330:0x08df, B:331:0x08e5, B:332:0x08e8, B:333:0x08eb, B:312:0x08b7, B:314:0x08bb, B:318:0x08c3), top: B:370:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x08d3 A[Catch: Error -> 0x08ec, RuntimeException -> 0x08ee, TryCatch #18 {Error -> 0x08ec, RuntimeException -> 0x08ee, blocks: (B:288:0x085b, B:290:0x085f, B:294:0x0867, B:319:0x08c5, B:320:0x08c9, B:321:0x08cc, B:324:0x08d3, B:326:0x08d7, B:330:0x08df, B:331:0x08e5, B:332:0x08e8, B:333:0x08eb, B:312:0x08b7, B:314:0x08bb, B:318:0x08c3), top: B:370:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x08df A[Catch: Error -> 0x08ec, RuntimeException -> 0x08ee, TryCatch #18 {Error -> 0x08ec, RuntimeException -> 0x08ee, blocks: (B:288:0x085b, B:290:0x085f, B:294:0x0867, B:319:0x08c5, B:320:0x08c9, B:321:0x08cc, B:324:0x08d3, B:326:0x08d7, B:330:0x08df, B:331:0x08e5, B:332:0x08e8, B:333:0x08eb, B:312:0x08b7, B:314:0x08bb, B:318:0x08c3), top: B:370:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x08e5 A[Catch: Error -> 0x08ec, RuntimeException -> 0x08ee, TryCatch #18 {Error -> 0x08ec, RuntimeException -> 0x08ee, blocks: (B:288:0x085b, B:290:0x085f, B:294:0x0867, B:319:0x08c5, B:320:0x08c9, B:321:0x08cc, B:324:0x08d3, B:326:0x08d7, B:330:0x08df, B:331:0x08e5, B:332:0x08e8, B:333:0x08eb, B:312:0x08b7, B:314:0x08bb, B:318:0x08c3), top: B:370:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:344:0x0909  */
    /* JADX WARN: Code duplicated, block: B:346:0x090c  */
    /* JADX WARN: Code duplicated, block: B:357:0x0318 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0558 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x05db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0079 A[Catch: all -> 0x008d, TRY_ENTER, TryCatch #8 {all -> 0x008d, blocks: (B:22:0x004a, B:26:0x005e, B:31:0x006d, B:37:0x0079, B:39:0x0089, B:38:0x0082), top: B:359:0x004a, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:382:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0829 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[Catch: all -> 0x008d, TryCatch #8 {all -> 0x008d, blocks: (B:22:0x004a, B:26:0x005e, B:31:0x006d, B:37:0x0079, B:39:0x0089, B:38:0x0082), top: B:359:0x004a, outer: #17 }] */
    /* JADX WARN: Code duplicated, block: B:391:0x0809 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x008f A[Catch: Error | RuntimeException -> 0x009f, RuntimeException -> 0x00a1, TryCatch #17 {Error | RuntimeException -> 0x009f, blocks: (B:10:0x0016, B:20:0x0045, B:21:0x0049, B:42:0x008c, B:45:0x008f, B:47:0x0097, B:48:0x009b, B:22:0x004a, B:26:0x005e, B:31:0x006d, B:37:0x0079, B:39:0x0089, B:38:0x0082), top: B:371:0x0016, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0097 A[Catch: Error | RuntimeException -> 0x009f, RuntimeException -> 0x00a1, TryCatch #17 {Error | RuntimeException -> 0x009f, blocks: (B:10:0x0016, B:20:0x0045, B:21:0x0049, B:42:0x008c, B:45:0x008f, B:47:0x0097, B:48:0x009b, B:22:0x004a, B:26:0x005e, B:31:0x006d, B:37:0x0079, B:39:0x0089, B:38:0x0082), top: B:371:0x0016, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009b A[Catch: Error | RuntimeException -> 0x009f, RuntimeException -> 0x00a1, TRY_LEAVE, TryCatch #17 {Error | RuntimeException -> 0x009f, blocks: (B:10:0x0016, B:20:0x0045, B:21:0x0049, B:42:0x008c, B:45:0x008f, B:47:0x0097, B:48:0x009b, B:22:0x004a, B:26:0x005e, B:31:0x006d, B:37:0x0079, B:39:0x0089, B:38:0x0082), top: B:371:0x0016, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c5 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0111 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x012a A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0132 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0140 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0146 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x017c A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0184 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0192 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0198 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a8 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e3 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01eb A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f9 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x021f A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0227 A[Catch: all -> 0x0874, RuntimeException -> 0x0879, TryCatch #16 {RuntimeException -> 0x0879, all -> 0x0874, blocks: (B:56:0x00a9, B:59:0x00b8, B:61:0x00bd, B:63:0x00c5, B:65:0x00d3, B:67:0x00e5, B:68:0x0111, B:70:0x0119, B:72:0x0121, B:73:0x012a, B:75:0x0132, B:77:0x0140, B:79:0x0146, B:80:0x0153, B:81:0x017c, B:83:0x0184, B:85:0x0192, B:87:0x0198, B:89:0x01a8, B:90:0x01ab, B:91:0x01de, B:92:0x01e3, B:94:0x01eb, B:96:0x01f9, B:97:0x021f, B:99:0x0227, B:101:0x0235, B:103:0x024b, B:104:0x0258, B:105:0x0262, B:107:0x0268, B:109:0x027d, B:110:0x0281, B:111:0x0298, B:113:0x02a0, B:115:0x02ae, B:116:0x02d4, B:117:0x02da, B:123:0x02eb, B:125:0x02f3, B:126:0x0310, B:127:0x0317, B:137:0x0341, B:140:0x034b, B:144:0x034f, B:147:0x0352, B:149:0x035a, B:151:0x0368, B:152:0x036f, B:153:0x0379, B:155:0x037f, B:157:0x0394, B:158:0x0398, B:159:0x03aa, B:161:0x03b2, B:163:0x03be, B:165:0x03c8, B:166:0x03e1, B:168:0x03e9, B:170:0x03f1, B:172:0x03f9, B:174:0x0412, B:175:0x0442, B:176:0x0445, B:184:0x045c, B:177:0x0448, B:178:0x044b, B:179:0x044e, B:180:0x0451, B:181:0x0454, B:182:0x0457, B:183:0x045a, B:185:0x0489, B:187:0x0491, B:189:0x04a2, B:191:0x04d8, B:193:0x050e, B:194:0x0549, B:195:0x0557, B:200:0x0571, B:203:0x0574, B:204:0x057e, B:206:0x0586, B:208:0x0594, B:210:0x0598, B:211:0x059d, B:128:0x0318, B:129:0x0327, B:131:0x032d, B:133:0x0335, B:134:0x0339, B:135:0x033d, B:136:0x0340, B:118:0x02db, B:120:0x02df, B:121:0x02e5, B:122:0x02ea, B:196:0x0558, B:197:0x056e), top: B:370:0x00a9, inners: #7, #10, #12 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:308:0x0891, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [long] */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v19, types: [long] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v89, types: [android.os.PowerManager$WakeLock] */
    /* JADX WARN: Type inference failed for: r4v92, types: [android.os.PowerManager$WakeLock] */
    public final boolean i() throws Throwable {
        aasj aasjVar;
        ?? C;
        ?? r11;
        Throwable th;
        long jC;
        long j;
        long j2;
        aast aastVar;
        zvn zvnVar;
        zvm zvmVar;
        int i;
        int i2;
        aary aaryVar;
        int i3;
        int i4;
        agev agevVar;
        aaro aaroVarE;
        long j3;
        boolean z2;
        zwa zwaVarE;
        aary aaryVar2;
        agev agevVar2;
        Object objC;
        aazo aazoVar;
        String str;
        aaro aaroVarE2;
        agev agevVar3;
        Object objC2;
        int i5;
        aazo aazoVar2;
        aarw aarwVarB;
        aaro aaroVarF;
        agev agevVar4;
        agev agevVarB;
        agev agevVar5;
        aaro aaroVarE3;
        long j4;
        agev agevVar6;
        aazo aazoVar3;
        aaro aaroVarE4;
        aamb aamvVar;
        agev agevVar7;
        Object objC3;
        aaro aaroVarE5;
        aamb aambVar;
        int iMin;
        long jMin;
        long jAe;
        agev agevVar8;
        agev agevVar9;
        agev agevVar10;
        Object objC4;
        Object objC5;
        Object objC6;
        aazo aazoVar4;
        aaro aaroVarE6;
        aqpe aqpeVar;
        agev agevVar11;
        Object objC7;
        aaro aaroVarE7;
        agev agevVar12;
        aaro aaroVarE8;
        aast aastVar2;
        ScheduledFuture scheduledFuture;
        WifiManager.WifiLock wifiLock;
        Iterator it;
        ScheduledFuture scheduledFuture2;
        agev agevVar13;
        aaro aaroVarE9;
        agev agevVar14;
        aaro aaroVarE10;
        aamb aambVar2;
        agev agevVar15;
        aaro aaroVarE11;
        agev agevVar16;
        aaro aaroVarE12;
        aarw aarwVarB2;
        agev agevVar17;
        aaro aaroVarE13;
        agev agevVar18;
        Object objC8;
        agev agevVar19;
        aazo aazoVar5;
        agev agevVarB2;
        ?? r4;
        aast aastVar3;
        long jB;
        boolean zIsHeld;
        ?? r12;
        synchronized (this.q) {
            aasjVar = (aasj) this.U.poll();
        }
        if (aasjVar != null) {
            try {
                if (this.j) {
                    try {
                        if (aasjVar.l != 14) {
                            r12 = 0;
                        } else if (this.k) {
                            r12 = 0;
                        } else {
                            vxz vxzVar = this.G.b;
                            C = vxzVar.c(7, 45385073L, 0L);
                            jC = vxzVar.c(27, 45819850L, 0L);
                            if (C != -1) {
                                j = jC;
                            } else if (jC > 0) {
                                aastVar3 = this.Q;
                                synchronized (aastVar3.c) {
                                    try {
                                        aastVar3.d = 0L;
                                        jB = aastVar3.b.b();
                                        PowerManager.WakeLock wakeLock = aastVar3.a;
                                        zIsHeld = wakeLock.isHeld();
                                        if (zIsHeld || C <= 0) {
                                            j = jC;
                                        } else {
                                            j = jC;
                                            long j5 = aastVar3.f;
                                            if (j5 > 0 && j5 - jB < (C >> 1)) {
                                                try {
                                                    wakeLock.release();
                                                } catch (RuntimeException unused) {
                                                }
                                            }
                                            if (C > 0) {
                                                aastVar3.a.acquire(C);
                                                aastVar3.f = jB + C;
                                            } else {
                                                aastVar3.a.acquire();
                                                aastVar3.f = 0L;
                                            }
                                        }
                                        if (!zIsHeld) {
                                            if (C > 0) {
                                                aastVar3.a.acquire(C);
                                                aastVar3.f = jB + C;
                                            } else {
                                                aastVar3.a.acquire();
                                                aastVar3.f = 0L;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                j = jC;
                                r4 = this.P;
                                if (C > 0) {
                                    r4.acquire(C);
                                } else {
                                    r4.acquire();
                                }
                            }
                            try {
                                try {
                                    aaryVar = this.c;
                                    aaryVar.g();
                                    i3 = aasjVar.l;
                                    i4 = i3 - 1;
                                    if (i3 != 0) {
                                        j2 = j;
                                        C = 0;
                                        try {
                                            try {
                                                throw null;
                                            } catch (RuntimeException e) {
                                                e = e;
                                                if (aauk.d(this.F).q) {
                                                    zvnVar = zvn.b;
                                                    zvmVar = zvm.C;
                                                    i = aasjVar.l;
                                                    i2 = i - 1;
                                                    if (i == 0) {
                                                        throw null;
                                                    }
                                                    zvp.b(zvnVar, zvmVar, "Transfer executor error handling message " + i2 + ": " + e.getMessage(), e);
                                                }
                                                if (C != -1 && !this.j && !this.k) {
                                                    if (j2 > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                if (aasjVar == null) {
                                                    return r12;
                                                }
                                                return true;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (C != -1 && !this.j && !this.k) {
                                                if (j2 > 0) {
                                                    this.Q.b(j2);
                                                } else {
                                                    o();
                                                }
                                            }
                                            l();
                                            throw th;
                                        }
                                    }
                                    try {
                                        switch (i4) {
                                            case 0:
                                                C = 0;
                                                C = 0;
                                                zwaVarE = this.I.e();
                                                if (this.T != null || !this.T.equals(zwaVarE)) {
                                                    this.T = zwaVarE;
                                                    this.h = this.T.k();
                                                    aaryVar2 = this.c;
                                                    for (aaro aaroVar : aaryVar2.d(this.T)) {
                                                        String str2 = aaroVar.a;
                                                        String str3 = aaroVar.g;
                                                        aaroVar.j.name();
                                                        this.u.i(aaroVar);
                                                        if (aaroVar.c()) {
                                                            aaroVar.j = aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
                                                            aaroVar.b = 1;
                                                            aaryVar2.j(aaroVar);
                                                        }
                                                    }
                                                    aarz aarzVar = this.g;
                                                    ((aasw) aarzVar).b.execute(new aadw(aarzVar, this.u.g(), 10));
                                                    this.J.kk(aash.b);
                                                    n();
                                                }
                                                if (C != -1 && !this.j && !this.k) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 1:
                                                C = 0;
                                                C = 0;
                                                C = 0;
                                                C = 0;
                                                agevVar2 = aasjVar.i;
                                                if (agevVar2.g()) {
                                                    objC = agevVar2.c();
                                                    aazoVar = this.u;
                                                    str = ((aaro) objC).a;
                                                    if (aazoVar.k(str)) {
                                                        aaroVarE2 = aazoVar.e(str);
                                                        if (aaroVarE2 != null) {
                                                            if (aaroVarE2.c()) {
                                                                r(aaroVarE2, SemanticState.Hidden);
                                                            }
                                                            aaryVar.h(aaroVarE2);
                                                            aaryVar.f((aaro) objC);
                                                            aazoVar.i((aaro) objC);
                                                            aamw aamwVarA = ((aaro) objC).a();
                                                            this.g.a(aamwVarA);
                                                            this.K.kk(aasg.f(aamwVarA, aasf.a).a());
                                                            this.i.remove(str);
                                                        }
                                                        n();
                                                    } else {
                                                        aaryVar.f((aaro) objC);
                                                        if (TextUtils.equals(this.h, ((aaro) objC).g)) {
                                                            aazoVar.i((aaro) objC);
                                                            aamw aamwVarA2 = ((aaro) objC).a();
                                                            this.g.a(aamwVarA2);
                                                            this.K.kk(aasg.f(aamwVarA2, aasf.a).a());
                                                            n();
                                                        }
                                                    }
                                                }
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 2:
                                                C = 0;
                                                C = 0;
                                                C = 0;
                                                agevVar3 = aasjVar.a;
                                                if (agevVar3.g()) {
                                                    objC2 = agevVar3.c();
                                                    i5 = aasjVar.h;
                                                    aazoVar2 = this.u;
                                                    if (aazoVar2.k((String) objC2)) {
                                                        aarwVarB = this.f.b((String) objC2);
                                                        if (aarwVarB != null) {
                                                            aarwVarB.a(i5);
                                                        }
                                                        this.i.remove(objC2);
                                                        aaroVarF = aazoVar2.f((String) objC2);
                                                        if (aaroVarF != null) {
                                                            aaroVarF.b = i5;
                                                            aaryVar.h(aaroVarF);
                                                            p(aaroVarF);
                                                            aamw aamwVarA3 = aaroVarF.a();
                                                            aarz aarzVar2 = this.g;
                                                            ((aasw) aarzVar2).b.execute(new aadw(aarzVar2, aamwVarA3, 7, (byte[]) null));
                                                            this.K.kk(aasg.f(aamwVarA3, aasf.b).a());
                                                        }
                                                        n();
                                                    } else {
                                                        aaryVar.i((String) objC2);
                                                    }
                                                }
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 3:
                                                C = 0;
                                                n();
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 4:
                                                C = 0;
                                                C = 0;
                                                C = 0;
                                                agevVar4 = aasjVar.a;
                                                if (agevVar4.g()) {
                                                    agevVarB = aaryVar.b((String) agevVar4.c());
                                                    if (agevVarB.g()) {
                                                        this.u.i((aaro) agevVarB.c());
                                                        n();
                                                    }
                                                }
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 5:
                                                C = 0;
                                                C = 0;
                                                C = 0;
                                                agevVar5 = aasjVar.a;
                                                if (agevVar5.g()) {
                                                    aaroVarE3 = this.u.e((String) agevVar5.c());
                                                    if (aaroVarE3 != null) {
                                                        j4 = aasjVar.b;
                                                        if (j4 != aaroVarE3.d) {
                                                            aaroVarE3.c = 0L;
                                                        }
                                                        aaroVarE3.d = j4;
                                                        aaryVar.j(aaroVarE3);
                                                        aamw aamwVarA4 = aaroVarE3.a();
                                                        aarz aarzVar3 = this.g;
                                                        ((aasw) aarzVar3).b.execute(new aadw(aarzVar3, aamwVarA4, 13, (byte[]) null));
                                                        this.K.kk(aasg.f(aamwVarA4, aasf.c).a());
                                                    }
                                                }
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 6:
                                                try {
                                                    agevVar = aasjVar.a;
                                                    if (agevVar.g()) {
                                                        aaroVarE = this.u.e((String) agevVar.c());
                                                        if (aaroVarE != null) {
                                                            j3 = aasjVar.c;
                                                            if (aaroVarE.c < j3) {
                                                                z2 = false;
                                                                aaroVarE.i = 0;
                                                                aaroVarE.c = j3;
                                                                aamb aambVar3 = aaroVarE.e;
                                                                long epochMilli = this.B.f().toEpochMilli();
                                                                long j6 = aarq.a;
                                                                aambVar3.k("transfer_last_progress_time_millis", epochMilli);
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            aamb aambVar4 = aaroVarE.f;
                                                            double d = aasjVar.d;
                                                            long j7 = aarq.a;
                                                            aambVar4.q(d);
                                                            aaryVar.j(aaroVarE);
                                                            aamw aamwVarA5 = aaroVarE.a();
                                                            aarz aarzVar4 = this.g;
                                                            boolean z3 = aasjVar.e;
                                                            ((aasw) aarzVar4).b.execute(new hff(aarzVar4, aamwVarA5, z3, 6, null));
                                                            awkv awkvVar = this.K;
                                                            aase aaseVarF = aasg.f(aamwVarA5, aasf.f);
                                                            aaseVarF.c(z3);
                                                            awkvVar.kk(aaseVarF.a());
                                                            C = z2;
                                                        } else {
                                                            C = 0;
                                                        }
                                                    } else {
                                                        C = 0;
                                                    }
                                                    if (C != -1) {
                                                        if (j > 0) {
                                                            C = C;
                                                            aastVar = this.Q;
                                                            j2 = j;
                                                            C = C;
                                                            aastVar.b(j2);
                                                        } else {
                                                            C = C;
                                                            C = C;
                                                            o();
                                                        }
                                                    }
                                                } catch (RuntimeException e2) {
                                                    e = e2;
                                                    C = 0;
                                                    j2 = j;
                                                    if (aauk.d(this.F).q) {
                                                        zvnVar = zvn.b;
                                                        zvmVar = zvm.C;
                                                        i = aasjVar.l;
                                                        i2 = i - 1;
                                                        if (i == 0) {
                                                            throw null;
                                                        }
                                                        zvp.b(zvnVar, zvmVar, "Transfer executor error handling message " + i2 + ": " + e.getMessage(), e);
                                                    }
                                                    if (C != -1) {
                                                        if (j2 > 0) {
                                                            C = C;
                                                            aastVar = this.Q;
                                                            C = C;
                                                        } else {
                                                            C = C;
                                                            C = C;
                                                            o();
                                                        }
                                                    }
                                                    l();
                                                    r12 = C;
                                                    if (aasjVar == null) {
                                                        return r12;
                                                    }
                                                    return true;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    j2 = j;
                                                    if (C != -1) {
                                                        if (j2 > 0) {
                                                            this.Q.b(j2);
                                                        } else {
                                                            o();
                                                        }
                                                    }
                                                    l();
                                                    throw th;
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 7:
                                                agevVar6 = aasjVar.a;
                                                if (agevVar6.g()) {
                                                    Object objC9 = agevVar6.c();
                                                    aazoVar3 = this.u;
                                                    aaroVarE4 = aazoVar3.e((String) objC9);
                                                    if (aaroVarE4 != null) {
                                                        aamvVar = aasjVar.k;
                                                        if (aamvVar == null) {
                                                            aamvVar = new aamv();
                                                        }
                                                        aaroVarE4.f = aamvVar;
                                                        aaroVarE4.j = aqpc.TRANSFER_STATE_COMPLETE;
                                                        String str4 = aaroVarE4.a;
                                                        this.f.b(str4);
                                                        aaroVarE4.i = 0;
                                                        this.i.remove(str4);
                                                        aazoVar3.f(str4);
                                                        aaryVar.e(aaroVarE4);
                                                        aamw aamwVarA6 = aaroVarE4.a();
                                                        aogv aogvVar = aogv.UNKNOWN_FAILURE_REASON;
                                                        aamb aambVar5 = aaroVarE4.e;
                                                        long j8 = aarq.a;
                                                        m(aamwVarA6, aogvVar, aamg.a(aambVar5.b("complete_media_status", aamg.COMPLETE.p)));
                                                        p(aaroVarE4);
                                                        n();
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 8:
                                                agevVar7 = aasjVar.a;
                                                if (agevVar7.g()) {
                                                    objC3 = agevVar7.c();
                                                    aaroVarE5 = this.u.e((String) objC3);
                                                    if (aaroVarE5 != null) {
                                                        ((agrc) ((agrc) w.c()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "scheduleRetryTransferAfterBackoff", 1781, "DefaultTransfersExecutor.java")).A("[Offline] transfer retry %s, previous failure count: %d", objC3, aaroVarE5.i);
                                                        aambVar = aaroVarE5.e;
                                                        this.f.b((String) objC3);
                                                        int i6 = aaroVarE5.i + 1;
                                                        aaroVarE5.i = i6;
                                                        iMin = Math.min(Math.max(i6, 1), 20);
                                                        if (iMin > 1) {
                                                            long j9 = aarq.a;
                                                            jMin = Math.min(((long) (1 << (iMin - 1))) * aambVar.d("base_retry_milli_secs", 2000L), aambVar.d("max_retry_milli_secs", aarq.a));
                                                            aambVar.k("back_off_start_millis", this.B.f().toEpochMilli());
                                                            this.i.add(objC3);
                                                            if (jMin > z) {
                                                                Bundle bundle = new Bundle();
                                                                bundle.putString("servicePath", this.O);
                                                                bundle.putString("intentAction", "com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage");
                                                                bundle.putInt("messageId", 10);
                                                                bundle.putString("messageData", (String) objC3);
                                                                syn synVar = this.X;
                                                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                                                synVar.d("transfer_dm2", jMin / 1000, 2, 0, false, bundle, null, true);
                                                            } else {
                                                                double d2 = jMin;
                                                                jAe = (long) this.ab.ae(d2, (0.5d * d2) + d2);
                                                                synchronized (this.q) {
                                                                    try {
                                                                        k();
                                                                        this.s.put(objC3, this.A.schedule(new aadw(this, objC3, 4), jAe, TimeUnit.MILLISECONDS));
                                                                    } catch (Throwable th5) {
                                                                        throw th5;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        this.c.j(aaroVarE5);
                                                        n();
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 9:
                                                agevVar8 = aasjVar.a;
                                                if (agevVar8.g()) {
                                                    agevVar9 = aasjVar.f;
                                                    if (agevVar9.g()) {
                                                        agevVar10 = aasjVar.g;
                                                        if (agevVar10.g()) {
                                                            objC4 = agevVar8.c();
                                                            objC5 = agevVar9.c();
                                                            objC6 = agevVar10.c();
                                                            aazoVar4 = this.u;
                                                            aaroVarE6 = aazoVar4.e((String) objC4);
                                                            if (aaroVarE6 != null) {
                                                                ((agrc) ((agrc) w.b()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "failTransfer", 1830, "DefaultTransfersExecutor.java")).E("[Offline] transfer fatal fail Id:%s Reason: %d Media Status: %s", objC4, Integer.valueOf(((aogv) objC6).H), objC5);
                                                                aaroVarE6.j = aqpc.TRANSFER_STATE_FAILED;
                                                                aaroVarE6.i = 0;
                                                                switch (((aogv) objC6).ordinal()) {
                                                                    case 5:
                                                                    case 26:
                                                                        aqpeVar = aqpe.TRANSFER_FAILURE_REASON_STREAM_MISSING;
                                                                        break;
                                                                    case 6:
                                                                    case 10:
                                                                        aqpeVar = aqpe.TRANSFER_FAILURE_REASON_PLAYABILITY;
                                                                        break;
                                                                    case 7:
                                                                    case 29:
                                                                        aqpeVar = aqpe.TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES;
                                                                        break;
                                                                    case 8:
                                                                    case 18:
                                                                    case 19:
                                                                    case 20:
                                                                    case 22:
                                                                    case 27:
                                                                    case 28:
                                                                        aqpeVar = aqpe.TRANSFER_FAILURE_REASON_INTERNAL;
                                                                        break;
                                                                    case 9:
                                                                    case 11:
                                                                    case 12:
                                                                    case 13:
                                                                    case 14:
                                                                    case 15:
                                                                    case 17:
                                                                    case 23:
                                                                    case 25:
                                                                    case 30:
                                                                    default:
                                                                        aqpeVar = aqpe.TRANSFER_FAILURE_REASON_UNKNOWN;
                                                                        break;
                                                                    case 16:
                                                                        aqpeVar = aqpe.TRANSFER_FAILURE_REASON_SERVER;
                                                                        break;
                                                                    case 21:
                                                                    case 31:
                                                                        aqpeVar = aqpe.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE;
                                                                        break;
                                                                    case 24:
                                                                        aqpeVar = aqpe.TRANSFER_FAILURE_REASON_NETWORK;
                                                                        break;
                                                                }
                                                                aaroVarE6.k = aqpeVar;
                                                                aazoVar4.f((String) objC4);
                                                                this.c.e(aaroVarE6);
                                                                this.f.b((String) objC4);
                                                                this.i.remove(objC4);
                                                                m(aaroVarE6.a(), (aogv) objC6, (aamg) objC5);
                                                                p(aaroVarE6);
                                                                n();
                                                            }
                                                        }
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 10:
                                                agevVar11 = aasjVar.a;
                                                if (agevVar11.g()) {
                                                    objC7 = agevVar11.c();
                                                    if (this.i.remove(objC7) && (aaroVarE7 = this.u.e((String) objC7)) != null) {
                                                        aarq.f(aaroVarE7.e, this.B.f().toEpochMilli());
                                                        this.c.j(aaroVarE7);
                                                        n();
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 11:
                                                aazo aazoVar6 = this.u;
                                                for (aaro aaroVar2 : aazoVar6.h()) {
                                                    String str5 = aaroVar2.a;
                                                    String str6 = aaroVar2.g;
                                                    aaroVar2.j.name();
                                                    if (aaroVar2.c()) {
                                                        r(aaroVar2, SemanticState.Hidden);
                                                    }
                                                }
                                                this.h = null;
                                                aazoVar6.j();
                                                this.i.clear();
                                                this.l = false;
                                                q(false, false);
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 12:
                                                agevVar12 = aasjVar.a;
                                                if (agevVar12.g()) {
                                                    aaroVarE8 = this.u.e((String) agevVar12.c());
                                                    if (aaroVarE8 != null) {
                                                        r(aaroVarE8, aasjVar.h);
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 13:
                                                aastVar2 = this.Q;
                                                synchronized (aastVar2.c) {
                                                    try {
                                                        scheduledFuture = aastVar2.e;
                                                        if (scheduledFuture != null) {
                                                            scheduledFuture.cancel(false);
                                                            aastVar2.e = null;
                                                        }
                                                        aastVar2.d = 0L;
                                                        aastVar2.a();
                                                    } catch (Throwable th6) {
                                                        throw th6;
                                                    }
                                                    break;
                                                }
                                                while (true) {
                                                    wifiLock = this.R;
                                                    if (wifiLock.isHeld()) {
                                                        e();
                                                        this.k = true;
                                                        synchronized (this.q) {
                                                            this.U.clear();
                                                            it = this.s.values().iterator();
                                                            while (it.hasNext()) {
                                                                scheduledFuture2 = (ScheduledFuture) it.next();
                                                                if (scheduledFuture2 != null) {
                                                                    scheduledFuture2.cancel(false);
                                                                }
                                                                it.remove();
                                                            }
                                                            k();
                                                            break;
                                                        }
                                                        this.J.kk(aash.a);
                                                        C = 0;
                                                        if (C != -1) {
                                                            if (j > 0) {
                                                                C = C;
                                                                aastVar = this.Q;
                                                                j2 = j;
                                                                C = C;
                                                            } else {
                                                                C = C;
                                                                C = C;
                                                                o();
                                                            }
                                                        }
                                                        l();
                                                        r12 = C;
                                                    } else {
                                                        ((agrc) ((agrc) w.c()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "quitTasks", 651, "DefaultTransfersExecutor.java")).t("[Offline] wifiLock held in quit");
                                                        wifiLock.release();
                                                    }
                                                    aastVar.b(j2);
                                                    l();
                                                    r12 = C;
                                                    break;
                                                }
                                                break;
                                            case 14:
                                                agevVar13 = aasjVar.a;
                                                if (agevVar13.g()) {
                                                    aaroVarE9 = this.u.e((String) agevVar13.c());
                                                    if (aaroVarE9 != null) {
                                                        aamw aamwVarA7 = aaroVarE9.a();
                                                        aarz aarzVar5 = this.g;
                                                        ((aasw) aarzVar5).b.execute(new aadw(aarzVar5, aamwVarA7, 12, (byte[]) null));
                                                        this.K.kk(aasg.f(aamwVarA7, aasf.d).a());
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 15:
                                                aazo aazoVar7 = this.u;
                                                for (aaro aaroVar3 : aazoVar7.h()) {
                                                    String str7 = aaroVar3.a;
                                                    String str8 = aaroVar3.g;
                                                    aaroVar3.j.name();
                                                    if (aaroVar3.d()) {
                                                        r(aaroVar3, SemanticState.Hidden);
                                                    }
                                                }
                                                aazoVar7.j();
                                                this.i.clear();
                                                this.l = false;
                                                this.J.kk(aash.b);
                                                q(false, false);
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 16:
                                                agevVar14 = aasjVar.a;
                                                if (agevVar14.g()) {
                                                    aaroVarE10 = this.u.e((String) agevVar14.c());
                                                    if (aaroVarE10 != null) {
                                                        aamb aambVar6 = aasjVar.k;
                                                        aambVar6.getClass();
                                                        aaroVarE10.f = aambVar6;
                                                        this.c.j(aaroVarE10);
                                                        aambVar2 = aaroVarE10.f;
                                                        long j10 = aarq.a;
                                                        if (aambVar2.o()) {
                                                            m(aaroVarE10.a(), aogv.OFFLINE_DISK_ERROR, aamg.ACTIVE);
                                                        }
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 17:
                                                agevVar15 = aasjVar.a;
                                                if (agevVar15.g()) {
                                                    aaroVarE11 = this.u.e((String) agevVar15.c());
                                                    if (aaroVarE11 != null) {
                                                        aamw aamwVarA8 = aaroVarE11.a();
                                                        aarz aarzVar6 = this.g;
                                                        ((aasw) aarzVar6).b.execute(new aadw(aarzVar6, aamwVarA8, 11, (byte[]) null));
                                                        this.K.kk(aasg.f(aamwVarA8, aasf.e).a());
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 18:
                                                agevVar16 = aasjVar.a;
                                                if (agevVar16.g()) {
                                                    aaroVarE12 = this.u.e((String) agevVar16.c());
                                                    if (aaroVarE12 != null) {
                                                        if (aaroVarE12.d()) {
                                                            aaroVarE12.j = aqpc.TRANSFER_STATE_PAUSED_BY_USER;
                                                            String str9 = aaroVarE12.a;
                                                            aarwVarB2 = this.f.b(str9);
                                                            if (aarwVarB2 != null) {
                                                                aarwVarB2.a(SemanticState.Focused);
                                                            }
                                                            aaroVarE12.i = 0;
                                                            this.i.remove(str9);
                                                            aaroVarE12.b = SemanticState.Focused;
                                                            this.c.j(aaroVarE12);
                                                            aamw aamwVarA9 = aaroVarE12.a();
                                                            aarz aarzVar7 = this.g;
                                                            ((aasw) aarzVar7).b.execute(new aadw(aarzVar7, aamwVarA9, 9, (byte[]) null));
                                                            this.K.kk(aasg.f(aamwVarA9, aasf.h).a());
                                                        }
                                                        n();
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 19:
                                                agevVar17 = aasjVar.a;
                                                if (agevVar17.g()) {
                                                    aaroVarE13 = this.u.e((String) agevVar17.c());
                                                    if (aaroVarE13 != null) {
                                                        if (aaroVarE13.b()) {
                                                            aaroVarE13.j = aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
                                                            aaroVarE13.b = 64;
                                                            this.c.j(aaroVarE13);
                                                        }
                                                        aamw aamwVarA10 = aaroVarE13.a();
                                                        aarz aarzVar8 = this.g;
                                                        ((aasw) aarzVar8).b.execute(new aadw(aarzVar8, aamwVarA10, 8, (byte[]) null));
                                                        this.K.kk(aasg.f(aamwVarA10, aasf.i).a());
                                                        n();
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 20:
                                                agevVar18 = aasjVar.j;
                                                if (agevVar18.g() && this.S != (objC8 = agevVar18.c())) {
                                                    this.S = (atpr) objC8;
                                                    n();
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            case 21:
                                                agevVar19 = aasjVar.a;
                                                if (agevVar19.g()) {
                                                    aazoVar5 = this.u;
                                                    if (!aazoVar5.k((String) agevVar19.c())) {
                                                        agevVarB2 = this.c.b((String) agevVar19.c());
                                                        if (agevVarB2.g()) {
                                                            aazoVar5.i((aaro) agevVarB2.c());
                                                            aamw aamwVarA11 = ((aaro) agevVarB2.c()).a();
                                                            this.g.a(aamwVarA11);
                                                            this.K.kk(aasg.f(aamwVarA11, aasf.a).a());
                                                            n();
                                                        }
                                                    }
                                                }
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                            default:
                                                C = 0;
                                                if (C != -1) {
                                                    if (j > 0) {
                                                        C = C;
                                                        aastVar = this.Q;
                                                        j2 = j;
                                                        C = C;
                                                        aastVar.b(j2);
                                                    } else {
                                                        C = C;
                                                        C = C;
                                                        o();
                                                    }
                                                }
                                                l();
                                                r12 = C;
                                                break;
                                        }
                                    } catch (RuntimeException e3) {
                                        e = e3;
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                } catch (Error e4) {
                                    e = e4;
                                    th = e;
                                    r11 = C;
                                    ((agrc) ((agrc) ((agrc) w.b()).j(th)).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "runNextAction", (char) 641, "DefaultTransfersExecutor.java")).t("[Offline] Error while executing queued action!");
                                    r12 = r11;
                                } catch (RuntimeException e5) {
                                    e = e5;
                                    th = e;
                                    r11 = C;
                                    ((agrc) ((agrc) ((agrc) w.b()).j(th)).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "runNextAction", (char) 641, "DefaultTransfersExecutor.java")).t("[Offline] Error while executing queued action!");
                                    r12 = r11;
                                }
                            } catch (RuntimeException e6) {
                                e = e6;
                                j2 = j;
                                C = 0;
                                if (aauk.d(this.F).q) {
                                    zvnVar = zvn.b;
                                    zvmVar = zvm.C;
                                    i = aasjVar.l;
                                    i2 = i - 1;
                                    if (i == 0) {
                                        throw null;
                                    }
                                    zvp.b(zvnVar, zvmVar, "Transfer executor error handling message " + i2 + ": " + e.getMessage(), e);
                                }
                                if (C != -1) {
                                    if (j2 > 0) {
                                        C = C;
                                        aastVar = this.Q;
                                        C = C;
                                    } else {
                                        C = C;
                                        C = C;
                                        o();
                                    }
                                }
                                l();
                                r12 = C;
                                if (aasjVar == null) {
                                    return r12;
                                }
                                return true;
                            } catch (Throwable th8) {
                                th = th8;
                                j2 = j;
                                if (C != -1) {
                                    if (j2 > 0) {
                                        this.Q.b(j2);
                                    } else {
                                        o();
                                    }
                                }
                                l();
                                throw th;
                            }
                        }
                    } catch (Error | RuntimeException e7) {
                        th = e7;
                        r11 = 0;
                        ((agrc) ((agrc) ((agrc) w.b()).j(th)).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "runNextAction", (char) 641, "DefaultTransfersExecutor.java")).t("[Offline] Error while executing queued action!");
                        r12 = r11;
                    }
                } else if (this.k) {
                    vxz vxzVar2 = this.G.b;
                    C = vxzVar2.c(7, 45385073L, 0L);
                    jC = vxzVar2.c(27, 45819850L, 0L);
                    if (C != -1) {
                        j = jC;
                    } else if (jC > 0) {
                        aastVar3 = this.Q;
                        synchronized (aastVar3.c) {
                            aastVar3.d = 0L;
                            jB = aastVar3.b.b();
                            PowerManager.WakeLock wakeLock2 = aastVar3.a;
                            zIsHeld = wakeLock2.isHeld();
                            if (zIsHeld) {
                                j = jC;
                                if (!zIsHeld) {
                                }
                            } else {
                                j = jC;
                                if (!zIsHeld) {
                                }
                            }
                            if (C > 0) {
                                aastVar3.a.acquire(C);
                                aastVar3.f = jB + C;
                            } else {
                                aastVar3.a.acquire();
                                aastVar3.f = 0L;
                            }
                        }
                    } else {
                        j = jC;
                        r4 = this.P;
                        if (C > 0) {
                            r4.acquire(C);
                        } else {
                            r4.acquire();
                        }
                    }
                    aaryVar = this.c;
                    aaryVar.g();
                    i3 = aasjVar.l;
                    i4 = i3 - 1;
                    if (i3 != 0) {
                        j2 = j;
                        C = 0;
                        throw null;
                    }
                    switch (i4) {
                        case 0:
                            C = 0;
                            C = 0;
                            zwaVarE = this.I.e();
                            if (this.T != null) {
                                this.T = zwaVarE;
                                this.h = this.T.k();
                                aaryVar2 = this.c;
                                while (r4.hasNext()) {
                                    String str10 = aaroVar.a;
                                    String str11 = aaroVar.g;
                                    aaroVar.j.name();
                                    this.u.i(aaroVar);
                                    if (aaroVar.c()) {
                                        aaroVar.j = aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
                                        aaroVar.b = 1;
                                        aaryVar2.j(aaroVar);
                                    }
                                }
                                aarz aarzVar9 = this.g;
                                ((aasw) aarzVar9).b.execute(new aadw(aarzVar9, this.u.g(), 10));
                                this.J.kk(aash.b);
                                n();
                            } else {
                                this.T = zwaVarE;
                                this.h = this.T.k();
                                aaryVar2 = this.c;
                                while (r4.hasNext()) {
                                    String str12 = aaroVar.a;
                                    String str13 = aaroVar.g;
                                    aaroVar.j.name();
                                    this.u.i(aaroVar);
                                    if (aaroVar.c()) {
                                        aaroVar.j = aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
                                        aaroVar.b = 1;
                                        aaryVar2.j(aaroVar);
                                    }
                                }
                                aarz aarzVar10 = this.g;
                                ((aasw) aarzVar10).b.execute(new aadw(aarzVar10, this.u.g(), 10));
                                this.J.kk(aash.b);
                                n();
                            }
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 1:
                            C = 0;
                            C = 0;
                            C = 0;
                            C = 0;
                            agevVar2 = aasjVar.i;
                            if (agevVar2.g()) {
                                objC = agevVar2.c();
                                aazoVar = this.u;
                                str = ((aaro) objC).a;
                                if (aazoVar.k(str)) {
                                    aaroVarE2 = aazoVar.e(str);
                                    if (aaroVarE2 != null) {
                                        if (aaroVarE2.c()) {
                                            r(aaroVarE2, SemanticState.Hidden);
                                        }
                                        aaryVar.h(aaroVarE2);
                                        aaryVar.f((aaro) objC);
                                        aazoVar.i((aaro) objC);
                                        aamw aamwVarA12 = ((aaro) objC).a();
                                        this.g.a(aamwVarA12);
                                        this.K.kk(aasg.f(aamwVarA12, aasf.a).a());
                                        this.i.remove(str);
                                    }
                                    n();
                                } else {
                                    aaryVar.f((aaro) objC);
                                    if (TextUtils.equals(this.h, ((aaro) objC).g)) {
                                        aazoVar.i((aaro) objC);
                                        aamw aamwVarA13 = ((aaro) objC).a();
                                        this.g.a(aamwVarA13);
                                        this.K.kk(aasg.f(aamwVarA13, aasf.a).a());
                                        n();
                                    }
                                }
                            }
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 2:
                            C = 0;
                            C = 0;
                            C = 0;
                            agevVar3 = aasjVar.a;
                            if (agevVar3.g()) {
                                objC2 = agevVar3.c();
                                i5 = aasjVar.h;
                                aazoVar2 = this.u;
                                if (aazoVar2.k((String) objC2)) {
                                    aaryVar.i((String) objC2);
                                } else {
                                    aarwVarB = this.f.b((String) objC2);
                                    if (aarwVarB != null) {
                                        aarwVarB.a(i5);
                                    }
                                    this.i.remove(objC2);
                                    aaroVarF = aazoVar2.f((String) objC2);
                                    if (aaroVarF != null) {
                                        aaroVarF.b = i5;
                                        aaryVar.h(aaroVarF);
                                        p(aaroVarF);
                                        aamw aamwVarA14 = aaroVarF.a();
                                        aarz aarzVar11 = this.g;
                                        ((aasw) aarzVar11).b.execute(new aadw(aarzVar11, aamwVarA14, 7, (byte[]) null));
                                        this.K.kk(aasg.f(aamwVarA14, aasf.b).a());
                                    }
                                    n();
                                }
                            }
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 3:
                            C = 0;
                            n();
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 4:
                            C = 0;
                            C = 0;
                            C = 0;
                            agevVar4 = aasjVar.a;
                            if (agevVar4.g()) {
                                agevVarB = aaryVar.b((String) agevVar4.c());
                                if (agevVarB.g()) {
                                    this.u.i((aaro) agevVarB.c());
                                    n();
                                }
                            }
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 5:
                            C = 0;
                            C = 0;
                            C = 0;
                            agevVar5 = aasjVar.a;
                            if (agevVar5.g()) {
                                aaroVarE3 = this.u.e((String) agevVar5.c());
                                if (aaroVarE3 != null) {
                                    j4 = aasjVar.b;
                                    if (j4 != aaroVarE3.d) {
                                        aaroVarE3.c = 0L;
                                    }
                                    aaroVarE3.d = j4;
                                    aaryVar.j(aaroVarE3);
                                    aamw aamwVarA15 = aaroVarE3.a();
                                    aarz aarzVar12 = this.g;
                                    ((aasw) aarzVar12).b.execute(new aadw(aarzVar12, aamwVarA15, 13, (byte[]) null));
                                    this.K.kk(aasg.f(aamwVarA15, aasf.c).a());
                                }
                            }
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 6:
                            agevVar = aasjVar.a;
                            if (agevVar.g()) {
                                aaroVarE = this.u.e((String) agevVar.c());
                                if (aaroVarE != null) {
                                    j3 = aasjVar.c;
                                    if (aaroVarE.c < j3) {
                                        z2 = false;
                                        aaroVarE.i = 0;
                                        aaroVarE.c = j3;
                                        aamb aambVar7 = aaroVarE.e;
                                        long epochMilli2 = this.B.f().toEpochMilli();
                                        long j11 = aarq.a;
                                        aambVar7.k("transfer_last_progress_time_millis", epochMilli2);
                                    } else {
                                        z2 = false;
                                    }
                                    aamb aambVar8 = aaroVarE.f;
                                    double d3 = aasjVar.d;
                                    long j12 = aarq.a;
                                    aambVar8.q(d3);
                                    aaryVar.j(aaroVarE);
                                    aamw aamwVarA16 = aaroVarE.a();
                                    aarz aarzVar13 = this.g;
                                    boolean z4 = aasjVar.e;
                                    ((aasw) aarzVar13).b.execute(new hff(aarzVar13, aamwVarA16, z4, 6, null));
                                    awkv awkvVar2 = this.K;
                                    aase aaseVarF2 = aasg.f(aamwVarA16, aasf.f);
                                    aaseVarF2.c(z4);
                                    awkvVar2.kk(aaseVarF2.a());
                                    C = z2;
                                } else {
                                    C = 0;
                                }
                            } else {
                                C = 0;
                            }
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 7:
                            agevVar6 = aasjVar.a;
                            if (agevVar6.g()) {
                                Object objC10 = agevVar6.c();
                                aazoVar3 = this.u;
                                aaroVarE4 = aazoVar3.e((String) objC10);
                                if (aaroVarE4 != null) {
                                    aamvVar = aasjVar.k;
                                    if (aamvVar == null) {
                                        aamvVar = new aamv();
                                    }
                                    aaroVarE4.f = aamvVar;
                                    aaroVarE4.j = aqpc.TRANSFER_STATE_COMPLETE;
                                    String str14 = aaroVarE4.a;
                                    this.f.b(str14);
                                    aaroVarE4.i = 0;
                                    this.i.remove(str14);
                                    aazoVar3.f(str14);
                                    aaryVar.e(aaroVarE4);
                                    aamw aamwVarA17 = aaroVarE4.a();
                                    aogv aogvVar2 = aogv.UNKNOWN_FAILURE_REASON;
                                    aamb aambVar9 = aaroVarE4.e;
                                    long j13 = aarq.a;
                                    m(aamwVarA17, aogvVar2, aamg.a(aambVar9.b("complete_media_status", aamg.COMPLETE.p)));
                                    p(aaroVarE4);
                                    n();
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 8:
                            agevVar7 = aasjVar.a;
                            if (agevVar7.g()) {
                                objC3 = agevVar7.c();
                                aaroVarE5 = this.u.e((String) objC3);
                                if (aaroVarE5 != null) {
                                    ((agrc) ((agrc) w.c()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "scheduleRetryTransferAfterBackoff", 1781, "DefaultTransfersExecutor.java")).A("[Offline] transfer retry %s, previous failure count: %d", objC3, aaroVarE5.i);
                                    aambVar = aaroVarE5.e;
                                    this.f.b((String) objC3);
                                    int i7 = aaroVarE5.i + 1;
                                    aaroVarE5.i = i7;
                                    iMin = Math.min(Math.max(i7, 1), 20);
                                    if (iMin > 1) {
                                        long j14 = aarq.a;
                                        jMin = Math.min(((long) (1 << (iMin - 1))) * aambVar.d("base_retry_milli_secs", 2000L), aambVar.d("max_retry_milli_secs", aarq.a));
                                        aambVar.k("back_off_start_millis", this.B.f().toEpochMilli());
                                        this.i.add(objC3);
                                        if (jMin > z) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("servicePath", this.O);
                                            bundle2.putString("intentAction", "com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage");
                                            bundle2.putInt("messageId", 10);
                                            bundle2.putString("messageData", (String) objC3);
                                            syn synVar2 = this.X;
                                            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                                            synVar2.d("transfer_dm2", jMin / 1000, 2, 0, false, bundle2, null, true);
                                        } else {
                                            double d4 = jMin;
                                            jAe = (long) this.ab.ae(d4, (0.5d * d4) + d4);
                                            synchronized (this.q) {
                                                k();
                                                this.s.put(objC3, this.A.schedule(new aadw(this, objC3, 4), jAe, TimeUnit.MILLISECONDS));
                                            }
                                        }
                                    }
                                    this.c.j(aaroVarE5);
                                    n();
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 9:
                            agevVar8 = aasjVar.a;
                            if (agevVar8.g()) {
                                agevVar9 = aasjVar.f;
                                if (agevVar9.g()) {
                                    agevVar10 = aasjVar.g;
                                    if (agevVar10.g()) {
                                        objC4 = agevVar8.c();
                                        objC5 = agevVar9.c();
                                        objC6 = agevVar10.c();
                                        aazoVar4 = this.u;
                                        aaroVarE6 = aazoVar4.e((String) objC4);
                                        if (aaroVarE6 != null) {
                                            ((agrc) ((agrc) w.b()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "failTransfer", 1830, "DefaultTransfersExecutor.java")).E("[Offline] transfer fatal fail Id:%s Reason: %d Media Status: %s", objC4, Integer.valueOf(((aogv) objC6).H), objC5);
                                            aaroVarE6.j = aqpc.TRANSFER_STATE_FAILED;
                                            aaroVarE6.i = 0;
                                            switch (((aogv) objC6).ordinal()) {
                                                case 5:
                                                case 26:
                                                    aqpeVar = aqpe.TRANSFER_FAILURE_REASON_STREAM_MISSING;
                                                    break;
                                                case 6:
                                                case 10:
                                                    aqpeVar = aqpe.TRANSFER_FAILURE_REASON_PLAYABILITY;
                                                    break;
                                                case 7:
                                                case 29:
                                                    aqpeVar = aqpe.TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES;
                                                    break;
                                                case 8:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 22:
                                                case 27:
                                                case 28:
                                                    aqpeVar = aqpe.TRANSFER_FAILURE_REASON_INTERNAL;
                                                    break;
                                                case 9:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 17:
                                                case 23:
                                                case 25:
                                                case 30:
                                                default:
                                                    aqpeVar = aqpe.TRANSFER_FAILURE_REASON_UNKNOWN;
                                                    break;
                                                case 16:
                                                    aqpeVar = aqpe.TRANSFER_FAILURE_REASON_SERVER;
                                                    break;
                                                case 21:
                                                case 31:
                                                    aqpeVar = aqpe.TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE;
                                                    break;
                                                case 24:
                                                    aqpeVar = aqpe.TRANSFER_FAILURE_REASON_NETWORK;
                                                    break;
                                            }
                                            aaroVarE6.k = aqpeVar;
                                            aazoVar4.f((String) objC4);
                                            this.c.e(aaroVarE6);
                                            this.f.b((String) objC4);
                                            this.i.remove(objC4);
                                            m(aaroVarE6.a(), (aogv) objC6, (aamg) objC5);
                                            p(aaroVarE6);
                                            n();
                                        }
                                    }
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 10:
                            agevVar11 = aasjVar.a;
                            if (agevVar11.g()) {
                                objC7 = agevVar11.c();
                                if (this.i.remove(objC7)) {
                                    aarq.f(aaroVarE7.e, this.B.f().toEpochMilli());
                                    this.c.j(aaroVarE7);
                                    n();
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 11:
                            aazo aazoVar8 = this.u;
                            while (r5.hasNext()) {
                                String str15 = aaroVar2.a;
                                String str16 = aaroVar2.g;
                                aaroVar2.j.name();
                                if (aaroVar2.c()) {
                                    r(aaroVar2, SemanticState.Hidden);
                                }
                            }
                            this.h = null;
                            aazoVar8.j();
                            this.i.clear();
                            this.l = false;
                            q(false, false);
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 12:
                            agevVar12 = aasjVar.a;
                            if (agevVar12.g()) {
                                aaroVarE8 = this.u.e((String) agevVar12.c());
                                if (aaroVarE8 != null) {
                                    r(aaroVarE8, aasjVar.h);
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 13:
                            aastVar2 = this.Q;
                            synchronized (aastVar2.c) {
                                scheduledFuture = aastVar2.e;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                    aastVar2.e = null;
                                }
                                aastVar2.d = 0L;
                                aastVar2.a();
                                while (true) {
                                    wifiLock = this.R;
                                    if (wifiLock.isHeld()) {
                                        e();
                                        this.k = true;
                                        synchronized (this.q) {
                                            this.U.clear();
                                            it = this.s.values().iterator();
                                            while (it.hasNext()) {
                                                scheduledFuture2 = (ScheduledFuture) it.next();
                                                if (scheduledFuture2 != null) {
                                                    scheduledFuture2.cancel(false);
                                                }
                                                it.remove();
                                            }
                                            k();
                                            this.J.kk(aash.a);
                                            C = 0;
                                            if (C != -1) {
                                                if (j > 0) {
                                                    C = C;
                                                    aastVar = this.Q;
                                                    j2 = j;
                                                    C = C;
                                                } else {
                                                    C = C;
                                                    C = C;
                                                    o();
                                                }
                                            }
                                            l();
                                            r12 = C;
                                        }
                                    } else {
                                        ((agrc) ((agrc) w.c()).k("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersExecutor", "quitTasks", 651, "DefaultTransfersExecutor.java")).t("[Offline] wifiLock held in quit");
                                        wifiLock.release();
                                    }
                                    aastVar.b(j2);
                                    l();
                                    r12 = C;
                                    break;
                                }
                            }
                            break;
                        case 14:
                            agevVar13 = aasjVar.a;
                            if (agevVar13.g()) {
                                aaroVarE9 = this.u.e((String) agevVar13.c());
                                if (aaroVarE9 != null) {
                                    aamw aamwVarA18 = aaroVarE9.a();
                                    aarz aarzVar14 = this.g;
                                    ((aasw) aarzVar14).b.execute(new aadw(aarzVar14, aamwVarA18, 12, (byte[]) null));
                                    this.K.kk(aasg.f(aamwVarA18, aasf.d).a());
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 15:
                            aazo aazoVar9 = this.u;
                            while (r5.hasNext()) {
                                String str17 = aaroVar3.a;
                                String str18 = aaroVar3.g;
                                aaroVar3.j.name();
                                if (aaroVar3.d()) {
                                    r(aaroVar3, SemanticState.Hidden);
                                }
                            }
                            aazoVar9.j();
                            this.i.clear();
                            this.l = false;
                            this.J.kk(aash.b);
                            q(false, false);
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 16:
                            agevVar14 = aasjVar.a;
                            if (agevVar14.g()) {
                                aaroVarE10 = this.u.e((String) agevVar14.c());
                                if (aaroVarE10 != null) {
                                    aamb aambVar10 = aasjVar.k;
                                    aambVar10.getClass();
                                    aaroVarE10.f = aambVar10;
                                    this.c.j(aaroVarE10);
                                    aambVar2 = aaroVarE10.f;
                                    long j15 = aarq.a;
                                    if (aambVar2.o()) {
                                        m(aaroVarE10.a(), aogv.OFFLINE_DISK_ERROR, aamg.ACTIVE);
                                    }
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 17:
                            agevVar15 = aasjVar.a;
                            if (agevVar15.g()) {
                                aaroVarE11 = this.u.e((String) agevVar15.c());
                                if (aaroVarE11 != null) {
                                    aamw aamwVarA19 = aaroVarE11.a();
                                    aarz aarzVar15 = this.g;
                                    ((aasw) aarzVar15).b.execute(new aadw(aarzVar15, aamwVarA19, 11, (byte[]) null));
                                    this.K.kk(aasg.f(aamwVarA19, aasf.e).a());
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 18:
                            agevVar16 = aasjVar.a;
                            if (agevVar16.g()) {
                                aaroVarE12 = this.u.e((String) agevVar16.c());
                                if (aaroVarE12 != null) {
                                    if (aaroVarE12.d()) {
                                        aaroVarE12.j = aqpc.TRANSFER_STATE_PAUSED_BY_USER;
                                        String str19 = aaroVarE12.a;
                                        aarwVarB2 = this.f.b(str19);
                                        if (aarwVarB2 != null) {
                                            aarwVarB2.a(SemanticState.Focused);
                                        }
                                        aaroVarE12.i = 0;
                                        this.i.remove(str19);
                                        aaroVarE12.b = SemanticState.Focused;
                                        this.c.j(aaroVarE12);
                                        aamw aamwVarA20 = aaroVarE12.a();
                                        aarz aarzVar16 = this.g;
                                        ((aasw) aarzVar16).b.execute(new aadw(aarzVar16, aamwVarA20, 9, (byte[]) null));
                                        this.K.kk(aasg.f(aamwVarA20, aasf.h).a());
                                    }
                                    n();
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 19:
                            agevVar17 = aasjVar.a;
                            if (agevVar17.g()) {
                                aaroVarE13 = this.u.e((String) agevVar17.c());
                                if (aaroVarE13 != null) {
                                    if (aaroVarE13.b()) {
                                        aaroVarE13.j = aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
                                        aaroVarE13.b = 64;
                                        this.c.j(aaroVarE13);
                                    }
                                    aamw aamwVarA110 = aaroVarE13.a();
                                    aarz aarzVar17 = this.g;
                                    ((aasw) aarzVar17).b.execute(new aadw(aarzVar17, aamwVarA110, 8, (byte[]) null));
                                    this.K.kk(aasg.f(aamwVarA110, aasf.i).a());
                                    n();
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 20:
                            agevVar18 = aasjVar.j;
                            if (agevVar18.g()) {
                                this.S = (atpr) objC8;
                                n();
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        case 21:
                            agevVar19 = aasjVar.a;
                            if (agevVar19.g()) {
                                aazoVar5 = this.u;
                                if (!aazoVar5.k((String) agevVar19.c())) {
                                    agevVarB2 = this.c.b((String) agevVar19.c());
                                    if (agevVarB2.g()) {
                                        aazoVar5.i((aaro) agevVarB2.c());
                                        aamw aamwVarA111 = ((aaro) agevVarB2.c()).a();
                                        this.g.a(aamwVarA111);
                                        this.K.kk(aasg.f(aamwVarA111, aasf.a).a());
                                        n();
                                    }
                                }
                            }
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                        default:
                            C = 0;
                            if (C != -1) {
                                if (j > 0) {
                                    C = C;
                                    aastVar = this.Q;
                                    j2 = j;
                                    C = C;
                                    aastVar.b(j2);
                                } else {
                                    C = C;
                                    C = C;
                                    o();
                                }
                            }
                            l();
                            r12 = C;
                            break;
                    }
                } else {
                    r12 = 0;
                }
            } catch (Error | RuntimeException e8) {
                e = e8;
                C = 0;
            }
        } else {
            r12 = 0;
        }
        if (aasjVar == null) {
            return r12;
        }
        return true;
    }
}
