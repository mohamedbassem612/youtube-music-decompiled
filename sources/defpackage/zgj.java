package defpackage;

import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.LongSupplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zgj implements zgk {
    private static final long K;
    public static final long a;
    public volatile zhc A;
    public final List B;
    public String C;
    public boolean D;
    public boolean E;
    public String F;
    public String G;
    public float H;
    public float I;
    public final hno J;
    private final mbc L;
    private final zfx M;
    private final zfv P;
    private final apbv Q;
    private final String R;
    private final Executor S;
    private final tyw T;
    private final arie U;
    private ScheduledFuture V;
    private volatile ScheduledFuture W;
    private wgs X;
    private wgs Y;
    private String Z;
    private long aA;
    private long aB;
    private avmn aC;
    private final Set aD;
    private int aE;
    private aigj aF;
    private volatile boolean aG;
    private final boolean aH;
    private final zgm aI;
    private boolean aa;
    private long ad;
    private boolean ae;
    private long af;
    private tyt ag;
    private float ah;
    private boolean aj;
    private final boolean ak;
    private long al;
    private boolean am;
    private final boolean an;
    private final List ao;
    private arfb ap;
    private final boolean aq;
    private final boolean ar;
    private final boolean as;
    private final boolean at;
    private final boolean au;
    private final boolean av;
    private zhc aw;
    private zhc ax;
    private int ay;
    private final twf az;
    public final long b;
    public final zft c;
    public final zfw d;
    public final zga e;
    public final CountDownLatch f;
    public final zfu g;
    final zfy h;
    public final apbx i;
    public final String j;
    public wiu k;
    public zgi l;
    public boolean r;
    public long s;
    public boolean t;
    public wja u;
    public final boolean v;
    public volatile long w;
    public final boolean x;
    public final boolean y;
    public volatile zhc z;
    private final Runnable N = new zdv(this, 4);
    private final Runnable O = new zdv(this, 5);
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;
    private int ab = -1;
    private int ac = -1;
    private boolean ai = true;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        K = 600000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        a = 30000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    public zgj(hno hnoVar, mbc mbcVar, wjm wjmVar, tyt tytVar, boolean z, String str, String str2, arie arieVar, apbx apbxVar, wiu wiuVar, int i, boolean z2, twf twfVar, tyw tywVar, zgm zgmVar, boolean z3, boolean z4, ci ciVar, xeu xeuVar, aigj aigjVar) {
        boolean z5;
        zgn[] zgnVarArr;
        int i2;
        this.aj = true;
        long j = K;
        this.al = j;
        this.z = zhc.b("video/unknown", false, "");
        this.A = zhc.b("audio/unknown", false, "");
        this.aw = zhc.b("video/unknown", false, "");
        this.ax = zhc.b("audio/unknown", false, "");
        this.B = new ArrayList();
        this.C = "";
        this.E = false;
        this.aD = new HashSet();
        this.F = "";
        this.G = "";
        this.aE = -1;
        this.H = -1.0f;
        this.I = -1.0f;
        this.aG = false;
        this.aI = zgmVar;
        this.y = z2;
        this.k = wiuVar;
        this.j = str;
        this.R = str2;
        this.U = arieVar;
        this.L = mbcVar;
        long jB = mbcVar.b();
        this.b = jB;
        this.J = hnoVar;
        ahfg ahfgVar = new ahfg(hnoVar.k);
        this.S = ahfgVar;
        this.aq = ((zhl) hnoVar.j).bT();
        this.ar = ((zhl) hnoVar.j).bO();
        this.w = wiuVar.i();
        zfx zfxVar = new zfx(mbcVar, jB, new LongSupplier() { // from class: zgb
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return this.a.w;
            }
        });
        this.M = zfxVar;
        this.ag = tytVar;
        zfu zfuVar = new zfu(hnoVar, apbxVar, mbcVar, jB);
        this.g = zfuVar;
        zfv zfvVar = new zfv();
        this.P = zfvVar;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f = countDownLatch;
        boolean z6 = apbxVar.o;
        this.ak = z6;
        this.v = !apbxVar.s;
        ajdf ajdfVar = apbxVar.q;
        this.an = (ajdfVar == null ? ajdf.a : ajdfVar).b;
        this.ao = ((zhl) hnoVar.j).ae();
        this.i = apbxVar;
        boolean zM = ((zhl) hnoVar.j).i.m(251, 45715919L);
        this.x = zM;
        boolean zM2 = ((zhl) hnoVar.j).i.m(357, 45759558L);
        this.as = zM2;
        boolean zDh = ((zhl) hnoVar.j).dh();
        this.at = zDh;
        this.au = ((zhl) hnoVar.j).j.l(330, 45763921L, true);
        this.aj = !((zhl) hnoVar.j).i.m(322, 45748162L);
        this.av = ((zhl) hnoVar.j).i.l(407, 45790760L, false);
        this.T = tywVar;
        this.aF = aigjVar;
        if (zM2) {
            tywVar.getClass();
            ahfgVar.execute(afwl.i(new zdv(tywVar, 6)));
        }
        aihf aihfVarCreateBuilder = apbv.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apbv apbvVar = (apbv) aihfVarCreateBuilder.instance;
        str.getClass();
        apbvVar.b |= 1;
        apbvVar.c = str;
        if (arieVar != null) {
            String str3 = arieVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            apbv apbvVar2 = (apbv) aihfVarCreateBuilder.instance;
            str3.getClass();
            apbvVar2.b |= 4;
            apbvVar2.d = str3;
        }
        apbv apbvVar3 = (apbv) aihfVarCreateBuilder.build();
        this.Q = apbvVar3;
        int i3 = zic.a;
        zfy zfyVar = new zfy(hnoVar, str, this, z6, zDh, zM, z2);
        this.h = zfyVar;
        if (z2) {
            z5 = true;
            zgnVarArr = new zgn[]{zfyVar, zfuVar, zfvVar};
        } else {
            z5 = true;
            zgnVarArr = new zgn[]{zfyVar, zfuVar, zfvVar, zfxVar};
        }
        Object obj = ahfgVar;
        if (!apbxVar.t && !wiuVar.aA()) {
            obj = ahfgVar;
            obj = hnoVar.k;
        }
        obj = ahfgVar;
        zga zgaVar = new zga(hnoVar, obj, ciVar, countDownLatch, apbxVar, xeuVar, apbvVar3, zgnVarArr);
        this.e = zgaVar;
        this.c = new zft(hnoVar, str, zgaVar, this);
        this.d = new zfw(zgaVar, this);
        zgaVar.g((apbxVar.p || wiuVar.ad()) ? z5 : false);
        zgaVar.d(z2);
        zgaVar.f(wjmVar);
        zgaVar.a("vc", String.valueOf(i));
        this.af = a;
        this.az = twfVar;
        zgi zgiVar = zgi.NOT_STARTED;
        this.l = zgiVar;
        this.aH = ((zhl) hnoVar.j).i.m(457, 45808227L);
        if (((zhl) hnoVar.j).i.m(478, 45824682L) && (i2 = ((zjr) hnoVar.j).K) != 0) {
            zgaVar.a("darch", String.valueOf(i2 - 1));
        }
        if (z2) {
            this.ap = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
            return;
        }
        this.ap = ((zjr) hnoVar.j).u.f(str);
        this.al = ((apbxVar.c & 64) == 0 || apbxVar.h <= 0) ? j : TimeUnit.SECONDS.toMillis(apbxVar.h);
        zgaVar.a("vps", "0.000:".concat(zgiVar.k));
        if (z) {
            zgaVar.a("ctmp", "ttr");
        }
        if (z3 && ((zhl) hnoVar.j).bN()) {
            zgaVar.a("cat", "prefetch");
        }
        if (z4 && !((zhl) hnoVar.j).j.m(346, 45782230L)) {
            zgaVar.a("pb", "1");
        }
        this.ae = false;
        this.ay = -1;
        hnoVar.k.execute(afwl.i(new zgc(this, hnoVar, 0)));
    }

    private final synchronized String N(String str, zgi zgiVar) {
        StringBuilder sb;
        sb = new StringBuilder(str);
        sb.append(':');
        sb.append(zgiVar);
        sb.append(':');
        int iOrdinal = zgiVar.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4) {
            if (!this.C.isEmpty()) {
                sb.append(this.C);
                sb.append(';');
            }
            this.C = "";
        } else if (iOrdinal == 6) {
            List list = this.B;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(';');
            }
            list.clear();
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static String O(String str, wgs wgsVar, wgs wgsVar2, String str2, String str3, MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo, boolean z) {
        int iAV;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(':');
        sb.append(wgsVar != null ? wgsVar.e() : 0);
        String strC = wgsVar != null ? wgsVar.C() : "";
        if (!TextUtils.isEmpty(strC)) {
            sb.append(';');
            sb.append(strC);
        }
        sb.append("::");
        sb.append(wgsVar2 != null ? Integer.valueOf(wgsVar2.e()) : "");
        String strC2 = wgsVar2 != null ? wgsVar2.C() : "";
        if (!TextUtils.isEmpty(strC2)) {
            sb.append(';');
            sb.append(strC2);
        }
        sb.append(':');
        sb.append(str2);
        if (z && mediaSource$MediaSourceInfo != null) {
            int iBc = a.bc(mediaSource$MediaSourceInfo.b);
            if (iBc == 0) {
                iBc = 1;
            }
            sb.append(":sms.");
            sb.append(iBc - 1);
            if ((iBc == 4 || iBc == 5) && (iAV = a.aV(mediaSource$MediaSourceInfo.c)) != 0 && iAV != 1) {
                sb.append('_');
                int iAV2 = a.aV(mediaSource$MediaSourceInfo.c);
                sb.append((iAV2 != 0 ? iAV2 : 1) - 1);
            }
        }
        if (str3 != null) {
            sb.append(':');
            sb.append(str3);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    private final synchronized void P() {
        int intProperty;
        this.W = this.J.f.schedule(this.O, this.af, TimeUnit.MILLISECONDS);
        ajdf ajdfVar = this.i.q;
        if (ajdfVar == null) {
            ajdfVar = ajdf.a;
        }
        if (ajdfVar.d && this.aC == null) {
            twf twfVar = this.az;
            agfr agfrVar = twfVar.a;
            if (!((Optional) agfrVar.io()).isEmpty() && (intProperty = ((BatteryManager) ((Optional) agfrVar.io()).get()).getIntProperty(2)) != Integer.MIN_VALUE && (Build.VERSION.SDK_INT >= 28 || intProperty != 0)) {
                this.aC = twfVar.c.af(new zgd(this, 0));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    private final synchronized void Q() {
        this.V = this.J.f.schedule(this.N, this.al, TimeUnit.MILLISECONDS);
    }

    private static boolean R(wgs wgsVar, wgs wgsVar2) {
        if (wgsVar == null) {
            if (wgsVar2 == null) {
                return false;
            }
        } else if (wgsVar2 != null && wgsVar.e() == wgsVar2.e() && TextUtils.equals(wgsVar.C(), wgsVar2.C())) {
            return false;
        }
        return true;
    }

    private final boolean S() {
        return this.r || this.aG;
    }

    private final synchronized void T(String str, zia ziaVar) {
        V(str, ziaVar, true, 2);
    }

    private final void U(String str, int i) {
        String strB = b();
        if (strB != null) {
            this.e.k("cmt", a.cl(strB, (byte) 58, str), i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x009d A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0111 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128 A[Catch: all -> 0x01d9, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x004b, B:9:0x0051, B:10:0x0072, B:12:0x0078, B:13:0x007a, B:15:0x007f, B:17:0x0083, B:19:0x0087, B:22:0x008d, B:23:0x008f, B:56:0x0149, B:58:0x014d, B:60:0x0155, B:61:0x0172, B:64:0x017d, B:66:0x0181, B:68:0x018b, B:70:0x0194, B:69:0x0190, B:72:0x01bc, B:75:0x01c1, B:77:0x01c5, B:79:0x01cb, B:25:0x0093, B:27:0x009d, B:29:0x00a5, B:31:0x00b1, B:32:0x00b3, B:34:0x00b7, B:35:0x00cf, B:37:0x00d3, B:38:0x00d5, B:40:0x00d9, B:44:0x0104, B:43:0x00f0, B:45:0x0107, B:47:0x010b, B:48:0x010d, B:50:0x0111, B:54:0x013d, B:53:0x0128, B:55:0x0140), top: B:86:0x000d }] */
    private final synchronized void V(String str, zia ziaVar, boolean z, int i) {
        List list;
        StringBuilder sb;
        ajdf ajdfVar;
        ajdf ajdfVar2;
        ajdf ajdfVar3;
        agfr agfrVar;
        long jMax;
        agfr agfrVar2;
        int iMax;
        long j;
        long j2;
        d();
        zft zftVar = this.c;
        if (zftVar.b > 0) {
            zhq zhqVar = zhq.ABR;
            zftVar.a.k("bwm", str + ':' + zftVar.b + ':' + yno.cF(zftVar.c), i);
            zftVar.b = 0L;
            zftVar.c = 0;
        }
        long j3 = zftVar.d;
        if (j3 > 0) {
            zftVar.a.l("nreqbw", "response_duration_ms." + zftVar.e + ";response_bytes." + j3, i);
            zftVar.d = 0L;
            zftVar.e = 0L;
        }
        apbx apbxVar = this.i;
        ajdf ajdfVar4 = apbxVar.q;
        if (ajdfVar4 == null) {
            ajdfVar4 = ajdf.a;
        }
        if (ajdfVar4.d) {
            list = this.ao;
            if (!list.contains("*") && !list.contains("bcurrent")) {
                sb = new StringBuilder("rt.");
                sb.append(str);
                ajdfVar = apbxVar.q;
                if (ajdfVar == null) {
                    ajdfVar = ajdf.a;
                }
                if (ajdfVar.d) {
                    sb.append(";d.");
                    sb.append(this.aB);
                    sb.append(";I.");
                    sb.append(this.aA);
                    this.aB = 0L;
                    this.aA = 0L;
                }
                ajdfVar2 = apbxVar.q;
                if (ajdfVar2 == null) {
                    ajdfVar2 = ajdf.a;
                }
                if (ajdfVar2.e) {
                    sb.append(";P.");
                    agfrVar2 = this.az.a;
                    if (((Optional) agfrVar2.io()).isEmpty()) {
                        iMax = 0;
                    } else {
                        iMax = Math.max(0, ((BatteryManager) ((Optional) agfrVar2.io()).get()).getIntProperty(1));
                    }
                    sb.append(iMax);
                }
                ajdfVar3 = apbxVar.q;
                if (ajdfVar3 == null) {
                    ajdfVar3 = ajdf.a;
                }
                if (ajdfVar3.f) {
                    sb.append(";E.");
                    agfrVar = this.az.a;
                    if (((Optional) agfrVar.io()).isEmpty()) {
                        jMax = 0;
                    } else {
                        jMax = Math.max(0L, ((BatteryManager) ((Optional) agfrVar.io()).get()).getLongProperty(5));
                    }
                    sb.append(jMax);
                }
                M("bcurrent", sb.toString(), i);
            }
        } else {
            ajdf ajdfVar5 = apbxVar.q;
            if ((ajdfVar5 == null ? ajdf.a : ajdfVar5).e) {
                list = this.ao;
                if (!list.contains("*")) {
                    sb = new StringBuilder("rt.");
                    sb.append(str);
                    ajdfVar = apbxVar.q;
                    if (ajdfVar == null) {
                        ajdfVar = ajdf.a;
                    }
                    if (ajdfVar.d) {
                        sb.append(";d.");
                        sb.append(this.aB);
                        sb.append(";I.");
                        sb.append(this.aA);
                        this.aB = 0L;
                        this.aA = 0L;
                    }
                    ajdfVar2 = apbxVar.q;
                    if (ajdfVar2 == null) {
                        ajdfVar2 = ajdf.a;
                    }
                    if (ajdfVar2.e) {
                        sb.append(";P.");
                        agfrVar2 = this.az.a;
                        if (((Optional) agfrVar2.io()).isEmpty()) {
                            iMax = 0;
                        } else {
                            iMax = Math.max(0, ((BatteryManager) ((Optional) agfrVar2.io()).get()).getIntProperty(1));
                        }
                        sb.append(iMax);
                    }
                    ajdfVar3 = apbxVar.q;
                    if (ajdfVar3 == null) {
                        ajdfVar3 = ajdf.a;
                    }
                    if (ajdfVar3.f) {
                        sb.append(";E.");
                        agfrVar = this.az.a;
                        if (((Optional) agfrVar.io()).isEmpty()) {
                            jMax = 0;
                        } else {
                            jMax = Math.max(0L, ((BatteryManager) ((Optional) agfrVar.io()).get()).getLongProperty(5));
                        }
                        sb.append(jMax);
                    }
                    M("bcurrent", sb.toString(), i);
                }
            } else {
                if (ajdfVar5 == null) {
                    ajdfVar5 = ajdf.a;
                }
                if (ajdfVar5.f) {
                    list = this.ao;
                    if (!list.contains("*")) {
                        sb = new StringBuilder("rt.");
                        sb.append(str);
                        ajdfVar = apbxVar.q;
                        if (ajdfVar == null) {
                            ajdfVar = ajdf.a;
                        }
                        if (ajdfVar.d) {
                            sb.append(";d.");
                            sb.append(this.aB);
                            sb.append(";I.");
                            sb.append(this.aA);
                            this.aB = 0L;
                            this.aA = 0L;
                        }
                        ajdfVar2 = apbxVar.q;
                        if (ajdfVar2 == null) {
                            ajdfVar2 = ajdf.a;
                        }
                        if (ajdfVar2.e) {
                            sb.append(";P.");
                            agfrVar2 = this.az.a;
                            if (((Optional) agfrVar2.io()).isEmpty()) {
                                iMax = 0;
                            } else {
                                iMax = Math.max(0, ((BatteryManager) ((Optional) agfrVar2.io()).get()).getIntProperty(1));
                            }
                            sb.append(iMax);
                        }
                        ajdfVar3 = apbxVar.q;
                        if (ajdfVar3 == null) {
                            ajdfVar3 = ajdf.a;
                        }
                        if (ajdfVar3.f) {
                            sb.append(";E.");
                            agfrVar = this.az.a;
                            if (((Optional) agfrVar.io()).isEmpty()) {
                                jMax = 0;
                            } else {
                                jMax = Math.max(0L, ((BatteryManager) ((Optional) agfrVar.io()).get()).getLongProperty(5));
                            }
                            sb.append(jMax);
                        }
                        M("bcurrent", sb.toString(), i);
                    }
                }
            }
        }
        if (!this.y) {
            zfw zfwVar = this.d;
            long j4 = zfwVar.b;
            if (j4 > 0) {
                zfwVar.a.k("cache_bytes", str + ':' + j4, i);
                zfwVar.b = 0L;
            }
            U(str, i);
            if (S()) {
                if (ziaVar == null || ziaVar == zia.a || !ziaVar.i.equals(this.j)) {
                    j = this.ad;
                    j2 = this.s;
                } else {
                    j = ziaVar.e;
                    j2 = ziaVar.b;
                }
                this.e.k("bh", String.format(Locale.US, "%s:%s", str, yno.cD(apbxVar, Math.max(0L, j - j2) / 1000.0d, 2)), i);
            }
        }
        if (z) {
            P();
            return;
        }
        avmn avmnVar = this.aC;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.aC);
            this.aC = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aunn, java.lang.Object] */
    private final synchronized void W(zgi zgiVar, boolean z, int i) {
        ScheduledFuture scheduledFuture;
        if (!this.l.equals(zgiVar)) {
            hno hnoVar = this.J;
            Object obj = hnoVar.j;
            if (!((zhl) obj).df() && (scheduledFuture = this.V) != null) {
                scheduledFuture.cancel(true);
                this.V = null;
            }
            String strC = c();
            V(strC, (zia) a$$ExternalSyntheticApiModelOutline0.m8m(hnoVar.i.io()).apply(this.j), z, i);
            zga zgaVar = this.e;
            zgaVar.k("vps", N(strC, zgiVar), i);
            this.l = zgiVar;
            if (zgiVar == zgi.PLAYING) {
                if (zgaVar.k == 1 && (this.ak || this.k.ad() || ((zjr) obj).fk())) {
                    zgaVar.m(this.ar, 11);
                }
                if (!((zhl) obj).df()) {
                    Q();
                }
            }
        }
    }

    private final synchronized void X(zgi zgiVar) {
        W(zgiVar, true, 12);
    }

    public final void A(String str, Throwable th) {
        zgj zgjVar;
        tyt tytVar;
        if (!TextUtils.isEmpty(str) && (tytVar = this.ag) != null) {
            tytVar.f("docid", str);
        }
        if (this.t) {
            zgjVar = this;
        } else {
            if (str == null) {
                str = "";
            }
            zgjVar = this;
            zgjVar.f(this.e.h, this.j, "", null, str, this.u, this.k, this.aF, false);
        }
        zgjVar.w(new zhz(zhw.c, "net.retryexhausted", 0L, th));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aunn, java.lang.Object] */
    public final void B() {
        this.ae = false;
        if (this.aH) {
            this.aG = true;
        }
        J(zgi.PLAYING);
        if (this.an) {
            I(((hed) this.J.b.io()).z().n);
        }
    }

    public final void C() {
        J(zgi.SEEKING);
    }

    public final void D(long j, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4) {
        int i;
        int i2;
        zga zgaVar = this.e;
        boolean z5 = this.ar;
        zgaVar.i(z5);
        boolean zEquals = str.equals(this.j);
        tyt tytVar = this.ag;
        if (zEquals) {
            tytVar.h("adcpn");
            tytVar.h("addocid");
            zgaVar.c(tytVar);
        } else {
            tytVar.e("adcpn", str);
            tytVar.e("addocid", str2);
            zgaVar.c(tytVar);
        }
        int i3 = 3;
        if (z2) {
            i2 = z ? 3 : 2;
        } else {
            if (z3) {
                i = z ? 5 : 4;
            } else if (z) {
                i2 = 1;
            } else {
                i = 0;
            }
            i2 = i;
        }
        String strC = c();
        q(strC, j, 2, i2, false, str3, str4);
        zgaVar.a("vps", strC + ':' + String.valueOf(this.l));
        if (i2 != 1) {
            if (i2 == 3) {
            }
            zgaVar.i(z5);
            if (i2 == 0 || !z4) {
            }
            M("underdec", a.bT(str, "cpn.", ";missing.end"), 2);
            return;
        }
        i3 = i2;
        if (this.aj) {
            zgaVar.a("vis", strC + ':' + this.q);
        }
        String str5 = this.Z;
        if (str5 != null) {
            zgaVar.a("fexp", str5);
        }
        i2 = i3;
        zgaVar.i(z5);
        if (i2 == 0) {
        }
    }

    public final void E(arfb arfbVar, aipc aipcVar) {
        String str;
        String str2;
        this.ap = arfbVar;
        int iOrdinal = arfbVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                str2 = "Q";
            } else if (iOrdinal == 2) {
                str2 = "Z";
            } else {
                if (iOrdinal != 3) {
                    return;
                }
                zhl zhlVar = (zhl) this.J.j;
                if (zhlVar.i.m(82, 45427190L) || zhlVar.j.m(148, 45430482L)) {
                    M("fsr", "ams.".concat(String.valueOf(zhf.d())), 2);
                }
                str = "M";
            }
            str = str2;
        } else {
            str = "A";
        }
        if (!str.equals("A")) {
            String strC = c();
            wgs wgsVar = this.X;
            this.e.a("vfs", O(strC, wgsVar, wgsVar, str, null, null, false));
        }
        String strC2 = c();
        StringBuilder sb = new StringBuilder();
        sb.append(strC2);
        sb.append(':');
        sb.append(str.equals("M") ? Integer.toString(aipcVar.s) : "");
        sb.append(':');
        sb.append(str);
        this.e.a("vfi", sb.toString());
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aunn, java.lang.Object] */
    public final void F(boolean z, long j, long j2) {
        wja wjaVar;
        int i;
        boolean z2 = true;
        if (!z && !this.r) {
            z2 = false;
        }
        this.r = z2;
        if (z2) {
            L();
            this.s = j;
            this.ad = j2;
            if (this.as && this.x && (i = this.T.b) != this.aE) {
                this.aE = i;
                l();
            }
        }
        if (!this.av || (wjaVar = this.u) == null || wjaVar.B()) {
            long j3 = ((zia) a$$ExternalSyntheticApiModelOutline0.m8m(this.J.i.io()).apply(this.j)).f;
            if (j3 != -1) {
                zfx zfxVar = this.M;
                if (zfxVar.b() > 6283) {
                    zfxVar.d(j3);
                }
            }
        }
    }

    public final void G(boolean z) {
        this.P.a = z;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aunn, java.lang.Object] */
    public final synchronized void H() {
        if (this.W != null) {
            try {
                V(c(), (zia) a$$ExternalSyntheticApiModelOutline0.m8m(this.J.l.io()).apply(this.j), true, 10);
            } catch (Exception e) {
                w(new zhz(zhw.a, "qoe.client", this.s, e));
            }
            wja wjaVar = this.u;
            if (wjaVar != null && wjaVar.B()) {
                this.e.m(this.ar, 10);
            }
        }
    }

    public final void I(int i) {
        if (this.an) {
            int i2 = this.ay;
            if (i2 == -1 || i2 != i) {
                this.ay = i;
                String strC = c();
                this.e.a("aur", strC + ':' + i);
                if (this.x) {
                    l();
                }
            }
        }
    }

    public final synchronized void J(zgi zgiVar) {
        W(zgiVar, true, 2);
    }

    public final synchronized void K() {
        zgi zgiVar = this.l;
        zgi zgiVar2 = zgi.PLAYING;
        if (zgiVar == zgiVar2) {
            String strC = c();
            zga zgaVar = this.e;
            zgaVar.k("vps", strC + ':' + zgiVar2.k, 10);
            U(strC, 10);
            if (this.ak) {
                zgaVar.m(false, 10);
            }
            Q();
        }
    }

    public final synchronized void L() {
        zhc zhcVar = this.z;
        zhc zhcVar2 = this.A;
        if (zhcVar2.a.isEmpty() || ((zhcVar.a.isEmpty() && this.q != 3) || (this.ax.equals(zhcVar2) && this.aw.equals(zhcVar)))) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append(':');
        sb.append(zhcVar.c());
        sb.append(':');
        String str = zhcVar.b;
        sb.append((CharSequence) str, 0, Math.min(str.length(), 40));
        sb.append(':');
        sb.append(zhcVar2.c());
        sb.append(':');
        String str2 = zhcVar2.b;
        sb.append((CharSequence) str2, 0, Math.min(str2.length(), 40));
        this.e.a("decoder", sb.toString());
        this.ax = zhcVar2;
        this.aw = zhcVar;
    }

    public final void M(String str, String str2, int i) {
        boolean zEquals = TextUtils.equals("cat", str);
        zga zgaVar = this.e;
        if (zEquals) {
            zgaVar.k("cat", ahno.Z(str2), i);
        } else {
            zgaVar.l(str, str2, i);
        }
    }

    @Override // defpackage.zgk
    public final long a() {
        return yno.cB(this.L, this.b);
    }

    @Override // defpackage.zgk
    public final String b() {
        if (this.r) {
            return yno.cF(this.s);
        }
        return null;
    }

    @Override // defpackage.zgk
    public final String c() {
        return yno.cE(this.L, this.b);
    }

    final synchronized void d() {
        if (this.W != null) {
            this.W.cancel(false);
            this.W = null;
        }
    }

    public final void e() {
        zgj zgjVar;
        wjr wjrVar = this.aI.a;
        String str = this.j;
        wjrVar.p(str);
        if (this.y) {
            zgjVar = this;
            zgjVar.V(zgjVar.c(), null, false, 12);
        } else {
            if (this.t) {
                zgjVar = this;
            } else {
                zgjVar = this;
                zgjVar.f(this.e.h, str, "", null, "", this.u, this.k, this.aF, false);
                zgjVar.w(new zhz(zhw.a, "qoe.client", zgjVar.s, "ForcedFinishCreate"));
                zvp.h(zvn.a, zvm.f, "ForcedFinishCreate", 0.1d);
            }
            if (((zhl) zgjVar.J.j).i.l(438, 45800806L, false)) {
                synchronized (zgjVar) {
                    zgi zgiVar = zgjVar.l;
                    zgi zgiVar2 = zgi.NOT_STARTED;
                    zgjVar.W(zgiVar2, false, 12);
                    if (zgiVar == zgiVar2) {
                        zgjVar.d();
                        ScheduledFuture scheduledFuture = zgjVar.V;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            zgjVar.V = null;
                        }
                        avmn avmnVar = zgjVar.aC;
                        if (avmnVar != null && !avmnVar.f()) {
                            avnr.b((AtomicReference) zgjVar.aC);
                            zgjVar.aC = null;
                        }
                    }
                }
            } else {
                zgjVar.W(zgi.NOT_STARTED, false, 12);
            }
            ((zho) zgjVar.J.m).e(zgjVar.d);
        }
        zft zftVar = zgjVar.c;
        hno hnoVar = zgjVar.J;
        ((zho) hnoVar.m).e(zftVar);
        if (zgjVar.as) {
            Executor executor = zgjVar.S;
            tyw tywVar = zgjVar.T;
            tywVar.getClass();
            executor.execute(afwl.i(new zdv(tywVar, 3)));
        }
        zga zgaVar = zgjVar.e;
        zgaVar.m(((zhl) hnoVar.j).bP(), 12);
        zgaVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    public final void f(wjm wjmVar, String str, String str2, Integer num, String str3, wja wjaVar, wiu wiuVar, aigj aigjVar, boolean z) {
        boolean z2;
        String str4;
        wjm wjmVar2 = wjmVar;
        if (this.t) {
            return;
        }
        boolean z3 = true;
        this.t = true;
        this.k = wiuVar;
        this.w = wiuVar.i();
        zga zgaVar = this.e;
        if (wjmVar2 == null) {
            wjmVar2 = zgaVar.h;
            z2 = true;
        } else {
            zgaVar.f(wjmVar2);
            z2 = false;
        }
        boolean z4 = this.y;
        if (z4) {
            this.h.b(num);
        }
        if (TextUtils.isEmpty(str3) && ((zhl) this.J.j).j.m(349, 45788848L)) {
            String str5 = this.R;
            if (TextUtils.isEmpty(str5)) {
                str4 = str3;
            } else {
                str4 = str5;
            }
        } else {
            str4 = str3;
        }
        Uri uriC = wjmVar2.c();
        typ.f(str);
        hno hnoVar = this.J;
        tyt tytVarCJ = yno.cJ(uriC, str, str2, str4, (abuz) hnoVar.q, this.U, wiuVar);
        this.ag = tytVarCJ;
        if (this.aq) {
            tytVarCJ.f("dl", "1");
        }
        this.aF = aigjVar;
        boolean z5 = this.au;
        if (z5 && aigjVar != null) {
            this.e.e(aigjVar);
        }
        if (!this.at) {
            aihf builder = this.Q.toBuilder();
            if (z5 && aigjVar != null) {
                builder.cc(aigjVar);
            }
            String strCC = yno.cC((apbv) builder.build());
            if (strCC == null) {
                zhr.b(zhq.QOE, "%s", "QoeStatsClient: Unable to append base64 encoded qclc to baseQoeUri");
            } else {
                this.ag.f("qclc", strCC);
            }
        }
        zga zgaVar2 = this.e;
        zgaVar2.c(this.ag);
        this.Z = this.ag.b("fexp");
        this.u = wjaVar;
        long j = a;
        aoqd aoqdVar = wiuVar.d;
        apby apbyVar = aoqdVar.w;
        if (apbyVar == null) {
            apbyVar = apby.a;
        }
        long j2 = apbyVar.b;
        if (j2 != 0) {
            j = j2;
        }
        this.af = j;
        zgaVar2.j();
        if (!z4) {
            akjx akjxVar = aoqdVar.x;
            if (akjxVar == null) {
                akjxVar = akjx.b;
            }
            if (akjxVar.h && ((tfq) hnoVar.p).j(0)) {
                String strC = c();
                akjx akjxVar2 = aoqdVar.x;
                if (akjxVar2 == null) {
                    akjxVar2 = akjx.b;
                }
                zgaVar2.a("dp", strC + ':' + (akjxVar2.d / 1000));
            }
        }
        if (z2) {
            w(new zhz(zhw.a, "qoe.client", 0L, "NoTrackingUrl"));
        }
        if (!this.i.p && !wiuVar.ad()) {
            z3 = false;
        }
        zgaVar2.g(z3);
        if (wiuVar.aA() || wiuVar.az()) {
            if (wiuVar.aA()) {
                zgaVar2.a("cat", "ssa");
            }
            zgaVar2.a("cat", "lifa");
        }
        if (z && ((zhl) hnoVar.j).bN()) {
            zgaVar2.a("cat", "prefetch");
        }
        P();
    }

    public final void g(int i) {
        this.e.a("conn", c() + ':' + i);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [aunn, java.lang.Object] */
    public final void h(float f) {
        if (Float.compare(this.ah, f) != 0) {
            this.ah = f;
            String strC = c();
            this.e.a("rate", strC + ':' + f);
            T(strC, (zia) a$$ExternalSyntheticApiModelOutline0.m8m(this.J.i.io()).apply(this.j));
        }
    }

    public final void i(int i, boolean z, int i2, int i3) {
        if (i >= 0 && this.q != i) {
            this.q = i;
            this.e.a("vis", c() + ':' + i);
        }
        this.aa = z;
        this.ac = i2;
        this.ab = i3;
    }

    public final void j(String str) {
        if (this.am) {
            return;
        }
        this.e.a("user_intent", str);
        this.am = true;
    }

    public final void k(String str) {
        if (((zhl) this.J.j).i.m(470, 45820250L)) {
            try {
                str = yno.cF(Math.max(0L, Long.parseLong(str) - this.b));
            } catch (NumberFormatException unused) {
            }
            j(str);
        }
    }

    public final void l() {
        int i = this.aE;
        float f = this.H;
        float f2 = this.I;
        int i2 = this.ay;
        zfy zfyVar = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = zfyVar.c;
        if (concurrentLinkedQueue != null) {
            aihf aihfVarCreateBuilder = argw.a.createBuilder();
            long jA = zfyVar.a.a();
            aihfVarCreateBuilder.copyOnWrite();
            argw argwVar = (argw) aihfVarCreateBuilder.instance;
            argwVar.b |= 1;
            argwVar.c = jA;
            if (i != -1) {
                aihfVarCreateBuilder.copyOnWrite();
                argw argwVar2 = (argw) aihfVarCreateBuilder.instance;
                argwVar2.b |= 2;
                argwVar2.d = i / 100.0f;
            }
            if (f != -1.0f) {
                aihfVarCreateBuilder.copyOnWrite();
                argw argwVar3 = (argw) aihfVarCreateBuilder.instance;
                argwVar3.b |= 4;
                argwVar3.e = f;
            }
            if (f2 != -1.0f) {
                aihfVarCreateBuilder.copyOnWrite();
                argw argwVar4 = (argw) aihfVarCreateBuilder.instance;
                argwVar4.b |= 8;
                argwVar4.f = f2;
            }
            aooc aoocVarA = aooc.a(i2);
            if (aoocVarA != null) {
                aihfVarCreateBuilder.copyOnWrite();
                argw argwVar5 = (argw) aihfVarCreateBuilder.instance;
                argwVar5.g = aoocVarA.n;
                argwVar5.b |= 16;
            }
            concurrentLinkedQueue.add((argw) aihfVarCreateBuilder.build());
            zfyVar.b.incrementAndGet();
        }
    }

    public final void m(String str, int i) {
        int i2;
        int i3 = i - this.n;
        if (this.k.aw(akwl.EXO_PLAYER_CONFIG_FEATURES_DROPPED_FRAMES_CTMP_LOGGING) && i3 != 0) {
            M("drop", str + ';' + String.valueOf(this.l) + ';' + i3, 2);
        }
        if (i == -1 || (i2 = this.n) == -1) {
            return;
        }
        if (i2 > i) {
            if (this.v) {
                zvp.h(zvn.b, zvm.f, "QoeStatsClient: Unexpected drop in dropped frames count.", 0.01d);
            }
            zhr.a(zhq.QOE, "QoeStatsClient: Unexpected drop in dropped frames count.");
            return;
        }
        this.e.a("df", str + ':' + i3);
        this.n = i;
    }

    public final void n(String str) {
        String str2 = c() + ':' + str + "::";
        zga zgaVar = this.e;
        zgaVar.a("ad_playback", str2);
        zgaVar.i(false);
    }

    public final synchronized void o(twe tweVar) {
        int i = tweVar.a;
        if (i != 0 && i != Integer.MIN_VALUE) {
            long j = this.aB;
            long j2 = tweVar.b;
            this.aB = j + j2;
            this.aA -= j2 * ((long) i);
        }
    }

    public final void p() {
        J(zgi.BUFFERING);
    }

    public final void q(String str, long j, int i, int i2, boolean z, String str2, String str3) {
        this.e.a("xvt", String.format(Locale.US, "t.%s;m.%s;g.%d;tt.%d;np.%d;c.%s;d.%s", str, yno.cF(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(z ? 1 : 0), str2, str3));
    }

    public final void r() {
        X(zgi.ENDED);
        this.e.m(((zhl) this.J.j).bP(), 12);
        this.ae = true;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec  */
    public final void s(yvu yvuVar) {
        String strCv;
        String str;
        int i;
        String strCv2;
        yvy yvyVar;
        int iAV;
        int i2;
        int i3;
        wgs wgsVar = yvuVar.c;
        wgs wgsVar2 = yvuVar.f;
        if (wgsVar == null && wgsVar2 == null) {
            return;
        }
        int i4 = yvuVar.j;
        yog yogVar = yvuVar.i;
        zhl zhlVar = (zhl) this.J.j;
        String str2 = "a";
        if (zhlVar.j.m(253, 45664950L) && yno.cv(i4) == null) {
            strCv = null;
        } else {
            arfb arfbVar = this.ap;
            if (arfbVar == arfb.VIDEO_QUALITY_SETTING_DATA_SAVER) {
                strCv = "z";
            } else if (arfbVar == arfb.VIDEO_QUALITY_SETTING_HIGHER_QUALITY) {
                strCv = "q";
            } else if (yogVar.d()) {
                strCv = "s";
            } else if (yogVar.e()) {
                strCv = "m";
            } else if (this.ai) {
                strCv = "i";
            } else {
                strCv = (i4 == 1 || i4 == 10000) ? "a" : yno.cv(i4);
            }
        }
        if (TextUtils.isEmpty(strCv)) {
            return;
        }
        String strC = wgsVar2 != null ? wgsVar2.C() : "";
        String str3 = strCv;
        String strC2 = c();
        apbx apbxVar = this.i;
        ajdf ajdfVar = apbxVar.q;
        if (ajdfVar == null) {
            ajdfVar = ajdf.a;
        }
        boolean z = ajdfVar.i;
        if (R(wgsVar, this.X)) {
            yvv yvvVar = yvuVar.p;
            str = strC;
            i = 1;
            String strO = O(strC2, wgsVar, this.X, str3, yvuVar.n, yvvVar != null ? yvvVar.a : null, z);
            zga zgaVar = this.e;
            zgaVar.a("vfs", strO);
            this.X = wgsVar;
            this.h.d(wgsVar);
            yvt yvtVar = yvuVar.m;
            if (yvtVar != null) {
                if (S()) {
                    zgaVar.a("bh", String.format(Locale.US, "%s:%s", strC2, yno.cD(apbxVar, yvtVar.a / 1000.0d, 2)));
                }
                m(strC2, yvtVar.b);
            } else {
                z = z;
                str2 = "a";
            }
            long j = yvuVar.k;
            if (j > 0) {
                zgaVar.a("bwe", String.format(Locale.US, "%s:%s", strC2, yno.cD(apbxVar, j / 8.0d, 2)));
                if (this.ai) {
                    M("ibws", String.valueOf(yvuVar.l), 2);
                }
            }
            if (this.q != -1 && this.aa && (i2 = this.ac) != -1 && (i3 = this.ab) != -1) {
                zgaVar.a("view", strC2 + ':' + i2 + ':' + i3);
            }
        } else {
            str = strC;
            z = z;
            str2 = "a";
            i = 1;
        }
        if (R(wgsVar2, this.Y)) {
            StringBuilder sb = new StringBuilder();
            sb.append(strC2);
            sb.append(':');
            sb.append(wgsVar2 != null ? Integer.valueOf(wgsVar2.e()) : "0");
            if (!TextUtils.isEmpty(str)) {
                sb.append(';');
                sb.append(str);
                if (wgsVar2 != null && !TextUtils.isEmpty(wgsVar2.v())) {
                    sb.append(';');
                    sb.append(wgsVar2.v());
                }
            }
            wgs wgsVar3 = this.Y;
            if (this.ai) {
                strCv2 = "i";
            } else if (wgsVar3 == null || wgsVar2 == null) {
                int i5 = i;
                if (this.ai && i4 == i5) {
                    strCv2 = str2;
                } else {
                    strCv2 = yno.cv(i4);
                }
            } else if (wgsVar3.P() != wgsVar2.P()) {
                strCv2 = "m";
            } else if (Objects.equals(wgsVar3.v(), wgsVar2.v())) {
                int i6 = i;
                if (this.ai) {
                    strCv2 = yno.cv(i4);
                } else {
                    strCv2 = yno.cv(i4);
                }
            } else if (i != this.k.aD()) {
                strCv2 = "m";
            } else {
                strCv2 = "t";
            }
            sb.append(':');
            wgs wgsVar4 = this.Y;
            sb.append(wgsVar4 != null ? Integer.valueOf(wgsVar4.e()) : "");
            sb.append(':');
            sb.append(strCv2);
            ArrayList arrayList = new ArrayList();
            if (z) {
                yvv yvvVar2 = yvuVar.p;
                MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo = yvvVar2 != null ? yvvVar2.b : null;
                if (mediaSource$MediaSourceInfo != null) {
                    int iBc = a.bc(mediaSource$MediaSourceInfo.b);
                    if (iBc == 0) {
                        iBc = 1;
                    }
                    StringBuilder sb2 = new StringBuilder("sms.");
                    sb2.append(iBc - 1);
                    if ((iBc == 4 || iBc == 5) && (iAV = a.aV(mediaSource$MediaSourceInfo.c)) != 0 && iAV != 1) {
                        sb2.append('_');
                        int iAV2 = a.aV(mediaSource$MediaSourceInfo.c);
                        if (iAV2 == 0) {
                            iAV2 = 1;
                        }
                        sb2.append(iAV2 - 1);
                    }
                    arrayList.add(sb2.toString());
                }
            }
            if (zhlVar.i.m(252, 45715920L) && (yvyVar = yvuVar.q) != null) {
                ArrayList arrayList2 = new ArrayList();
                Float f = yvyVar.b;
                if (f != null) {
                    arrayList2.add("fl.".concat(f.toString()));
                }
                Float f2 = yvyVar.a;
                if (f2 != null) {
                    arrayList2.add("tl.".concat(f2.toString()));
                }
                Float f3 = yvyVar.e;
                if (f3 != null) {
                    arrayList2.add("vg.".concat(f3.toString()));
                }
                int i7 = yvyVar.l;
                StringBuilder sb3 = new StringBuilder("nm.");
                sb3.append(i7 - 1);
                arrayList2.add(sb3.toString());
                arrayList.add(TextUtils.join(";", arrayList2));
            }
            if (!arrayList.isEmpty()) {
                sb.append(':');
                sb.append(TextUtils.join(";", arrayList));
            }
            String str4 = yvuVar.n;
            if (str4 != null) {
                sb.append(':');
                sb.append(str4);
            }
            this.e.a("afs", sb.toString());
            this.Y = wgsVar2;
            this.ai = false;
        }
    }

    public final void t(String str, zgg zggVar) {
        M(str, zggVar.a(this.b), 2);
    }

    public final void u(arfb arfbVar) {
        if (((zjr) this.J.j).u.m()) {
            this.ap = arfbVar;
        }
    }

    public final void v(zgh zghVar, long j, long j2, long j3) {
        Set set = this.aD;
        if (set.contains(zghVar)) {
            return;
        }
        set.add(zghVar);
        this.e.a("lse", c() + ':' + zghVar.e + ':' + (j != -1 ? Long.valueOf(j) : "").toString() + ':' + (j2 != -1 ? Long.valueOf(j2) : "").toString() + ':' + (j3 != -1 ? yno.cF(j3) : ""));
    }

    @Override // defpackage.zgk
    public final void w(zhz zhzVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append(':');
        sb.append(zhzVar.f());
        sb.append(':');
        if (zhzVar.f && !zhz.j(zhzVar.b)) {
            sb.append("fatal");
        }
        sb.append(':');
        if (zhzVar.g()) {
            sb.append(yno.cF(zhzVar.a()));
        } else {
            sb.append(yno.cF(this.s));
        }
        if (zhzVar.e != null) {
            sb.append(':');
            sb.append(zhzVar.e);
        }
        zga zgaVar = this.e;
        zgaVar.a("error", sb.toString());
        if (zhzVar.f) {
            J(zgi.ERROR);
            zgaVar.i(this.ar);
        }
    }

    public final void x() {
        J(zgi.PAUSED);
    }

    public final void y() {
        J(zgi.PAUSED_BUFFERING);
    }

    public final void z() {
        W(zgi.SUSPENDED, false, 13);
        if (this.ae) {
            return;
        }
        this.e.m(((zhl) this.J.j).bP(), 13);
    }
}
