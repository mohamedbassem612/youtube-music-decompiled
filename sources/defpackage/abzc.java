package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abzc {
    private static final agrf V = agrf.h("com/google/android/libraries/youtube/player/stats/VideoStats2Client");
    public volatile boolean A;
    public int B;
    public int C;
    public String D;
    public float E;
    public long F;
    public int G;
    public long H;
    public int I;
    public float J;
    public final String K;
    public final boolean L;
    public final zwa M;
    public final String N;
    public final int O;
    public String P;
    public String Q;
    public Optional R;
    public final boolean S;
    public final boolean T;
    public Optional U;
    private final mbc W;
    private final tyt X;
    private final tyt Y;
    private final tyt Z;
    public final wjm a;
    private final arif aa;
    private final tun ab;
    private final abzf ac;
    private final zzj ad;
    private final agkj ae;
    private final boolean af;
    private final ScheduledExecutorService ag;
    private final vyo ah;
    private final abmt ai;
    private aaxo aj;
    private aboa ak;
    private boolean al;
    private boolean am;
    private final tyw an;
    private final xeu ao;
    private final awmd ap;
    private final avmm aq;
    private final Runnable ar;
    private long as;
    private long at;
    private ScheduledFuture au;
    private List av;
    private final abzj aw;
    private final tfq ax;
    private final vxu ay;
    private final abuz az;
    public final wjm b;
    public final wjm c;
    public final boolean d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final zxj n;
    public final zrx o;
    public final int p;
    public final int[] q;
    public int r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Illegal instructions before constructor call */
    public abzc(ScheduledExecutorService scheduledExecutorService, zxj zxjVar, zrx zrxVar, mbc mbcVar, tfq tfqVar, tyw tywVar, abuz abuzVar, zzj zzjVar, tun tunVar, aawa aawaVar, zwb zwbVar, ci ciVar, vyo vyoVar, vxu vxuVar, abmt abmtVar, abnc abncVar, aboi aboiVar, arif arifVar, abzj abzjVar, abnl abnlVar, abnp abnpVar, xeu xeuVar, Map map, awmd awmdVar, ijt ijtVar, String str, wjf wjfVar, String str2, int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        int i3;
        Optional optionalEmpty;
        abyd abydVarM;
        wjm wjmVar = wjfVar.h().b;
        wjm wjmVar2 = wjfVar.h().c;
        wjm wjmVar3 = wjfVar.h().d;
        boolean z5 = wjfVar.k().f() == 2 || wjfVar.k().f() == 3;
        String strG = wjfVar.G();
        long millis = TimeUnit.SECONDS.toMillis(wjfVar.a());
        int iG = aawo.g(wjfVar.h().c, aboiVar.l(), wjfVar.Z(), K(i), abmtVar.ah());
        boolean z6 = K(i) && aboiVar.l();
        boolean Z = wjfVar.Z();
        boolean z7 = K(i) && aboiVar.n();
        boolean zV = wjfVar.V();
        if (K(i)) {
            wiu wiuVarF = wjfVar.f();
            if (abmtVar.Y() && (abydVarM = ijtVar.m(str2)) != null) {
            }
            if (y(wiuVarF, abncVar)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        String strU = null;
        if (K(i) && abnlVar != null) {
            strU = abnlVar.u();
        }
        String str3 = strU;
        long jB = mbcVar.b();
        aaxo aaxoVarC = abncVar.c();
        aboa aboaVar = abncVar.r;
        int i4 = wjfVar.h().h;
        int[] iArr = wjfVar.h().i;
        boolean z8 = aawaVar.b;
        int i5 = tywVar.b;
        boolean z9 = wjfVar.h().j != null && abmt.bt(vyoVar) && abmt.bC(vyoVar) && abmt.bs(vyoVar);
        boolean z10 = wjfVar.h().j != null && abmt.bt(vyoVar) && abmt.bC(vyoVar) && !abmt.bs(vyoVar);
        if (wjfVar.X()) {
            i2 = i5;
            i3 = i4;
            optionalEmpty = Collection.EL.stream(wjfVar.g().r).filter(new aaep(11)).filter(new aaep(12)).findFirst();
            if (true == optionalEmpty.isPresent()) {
                optionalEmpty = Optional.ofNullable(((wgs) optionalEmpty.get()).v());
            }
        } else {
            i2 = i5;
            i3 = i4;
            optionalEmpty = Optional.empty();
        }
        Optional optional = optionalEmpty;
        int i6 = appa.SEEK_SOURCE_UNKNOWN.bm;
        int i7 = -1;
        if (K(i) && abnpVar != null) {
            i7 = abnpVar.j;
        }
        this(scheduledExecutorService, zxjVar, zrxVar, mbcVar, wjmVar, wjmVar2, wjmVar3, z5, strG, millis, iG, z6, Z, z7, zV, z4, str, str2, str3, jB, "-", 1.0f, 1.0f, aaxoVarC, aboaVar, tfqVar, abuzVar, tunVar, zzjVar, i3, iArr, 0, z8, null, zwbVar, ciVar, vyoVar, vxuVar, abmtVar, i2, -1L, abzjVar, z9, z, z2, z3, tywVar, z10, arifVar, optional, i6, i7, wjfVar.h().d(), wjfVar.h().c(), xeuVar, map, awmdVar);
    }

    private final long A() {
        return this.W.b() - this.e;
    }

    private static String B(long j) {
        long j2 = j + 50;
        long j3 = (j2 % 1000) / 100;
        return String.valueOf(j2 / 1000) + '.' + String.valueOf(j3);
    }

    private final synchronized List C() {
        List list;
        if (this.av.isEmpty()) {
            J();
            c();
        }
        list = this.av;
        this.av = new ArrayList();
        return list;
    }

    private final void D(tyt tytVar, String str) {
        agqr it = this.az.d(this.h).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tytVar.f((String) entry.getKey(), (String) entry.getValue());
        }
        tytVar.f("rt", str);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tytVar.f("len", String.valueOf(this.F / 1000));
        tun tunVar = this.ab;
        if (tunVar != null) {
            long jB = tunVar.c.b();
            long j = tunVar.a;
            tytVar.f("lact", String.valueOf(j != -1 ? jB - j : -1L));
        }
        if (this.C == 0 && this.B == 0) {
            ((agrc) ((agrc) V.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats2Client", "addCommonVssParameters", 1755, "VideoStats2Client.java")).t("Warning: Sending VSS ping without a format parameter.");
        }
        int i = this.B;
        if (i > 0) {
            tytVar.i("fmt", i);
        }
        int i2 = this.C;
        if (i2 > 0 && i2 != this.B) {
            tytVar.i("afmt", i2);
        }
        arif arifVar = this.aa;
        if (arifVar != null && (arifVar.b & 1) != 0) {
            tytVar.c(arifVar.c);
        }
        if (!TextUtils.isEmpty(this.P)) {
            tytVar.f("cbs", this.P);
        }
        if (!TextUtils.isEmpty(this.Q)) {
            tytVar.f("clio", this.Q);
        }
        Optional optional = this.R;
        abyy abyyVar = new abyy(tytVar, 2);
        if (true == optional.isPresent()) {
            ((tyt) abyyVar.a).f("hb_data", Base64.encodeToString(((aigj) optional.get()).G(), 8));
        }
    }

    private final void E(tyt tytVar) {
        if (tytVar != null) {
            tytVar.f("cpn", this.h);
            tytVar.f("ns", "yt");
            tytVar.f("docid", this.f);
            tytVar.f("ver", "2");
            this.az.f(tytVar);
            if (tytVar.b("adformat") == null) {
                tytVar.f("el", "detailpage");
                if (this.k && !TextUtils.isEmpty(this.i)) {
                    tytVar.f("autonav", "1");
                }
            }
            String str = this.g;
            if (!TextUtils.isEmpty(str)) {
                tytVar.f("host_cpn", str);
            }
            String str2 = this.i;
            if (!TextUtils.isEmpty(str2)) {
                tytVar.f("list", str2);
                int i = this.O;
                if (i == 0) {
                    tytVar.f("plloop", "1");
                } else if (i == 1) {
                    tytVar.f("plloop", "3");
                } else if (i == 2) {
                    tytVar.f("plloop", "2");
                }
            }
            if (this.k) {
                tytVar.f("autoplay", "1");
            }
            if (this.m) {
                tytVar.f("splay", "1");
            }
            if (!this.af) {
                tytVar.f("dnc", "1");
            }
            String str3 = this.K;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            tytVar.f("referring_app", str3);
        }
    }

    private final void F(tyt tytVar, wjm wjmVar, boolean z) {
        tyt tytVar2 = new tyt(tytVar);
        if (abmt.bs(this.ai.a)) {
            H(tytVar, new wjk(wjmVar, 0));
            tytVar2.f("dl", "1");
        }
        String string = tytVar2.a().toString();
        aihf aihfVarCreateBuilder = arhm.a.createBuilder();
        if (z) {
            aihfVarCreateBuilder.copyOnWrite();
            arhm arhmVar = (arhm) aihfVarCreateBuilder.instance;
            string.getClass();
            arhmVar.b |= 2;
            arhmVar.d = string;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            arhm arhmVar2 = (arhm) aihfVarCreateBuilder.instance;
            string.getClass();
            arhmVar2.b |= 1;
            arhmVar2.c = string;
        }
        Q(aihfVarCreateBuilder);
    }

    private final void G() {
        if (this.Y == null || this.b == null || this.v) {
            return;
        }
        long j = this.u;
        int i = this.j;
        if (j >= ((long) i) * 1000) {
            if (i == 0) {
                if (!this.l || !this.ai.ah() || this.u <= 0) {
                    return;
                }
            } else if (i == 0) {
                return;
            }
            this.v = true;
        }
    }

    private final void H(tyt tytVar, zya zyaVar) {
        if (this.x) {
            ((agrc) ((agrc) V.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats2Client", "sendPing", 2083, "VideoStats2Client.java")).w("Final ping for playback %s has already been sent - Ignoring request", this.h);
        } else {
            if (this.A) {
                return;
            }
            this.ag.execute(afwl.i(new aapc((Object) this, (Object) tytVar, (Object) zyaVar, 10, (byte[]) null)));
        }
    }

    private final void I(boolean z) {
        this.al = z;
        this.ac.c = z;
    }

    private final synchronized void J() {
        this.am = true;
        agkh agkhVar = new agkh(4);
        agqr it = this.ae.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strB = ((abyl) entry.getValue()).b();
            if (strB != null) {
                agkhVar.e((String) entry.getKey(), strB);
            }
        }
        Optional.empty();
        String strB2 = B(a());
        String strValueOf = String.valueOf(this.ax.a());
        if (strValueOf == null) {
            throw new NullPointerException("Null connectionType");
        }
        String str = this.D;
        if (str == null) {
            throw new NullPointerException("Null subtitleId");
        }
        float f = this.E;
        String strA = this.aj.a.a();
        if (strA == null) {
            throw new NullPointerException("Null playerVisibility");
        }
        String strA2 = this.ak.a();
        if (strA2 == null) {
            throw new NullPointerException("Null userinducedAudioOnly");
        }
        agkj agkjVarD = agkhVar.d(true);
        String str2 = this.aj.f;
        if (str2 == null) {
            throw new NullPointerException("Null embargoStatusToken");
        }
        int iZ = z();
        String str3 = true != this.z ? "0" : "1";
        abzj abzjVar = this.aw;
        String str4 = abzjVar.a;
        if (str4 == null) {
            throw new NullPointerException("Null clipId");
        }
        String str5 = abzjVar.b;
        if (str5 == null) {
            throw new NullPointerException("Null als");
        }
        Optional optional = this.U;
        if (optional == null) {
            throw new NullPointerException("Null multiAudioTrackId");
        }
        this.av.add(aawo.h(strB2, "", strValueOf, strA, str, strA2, "0", str2, str3, f, this.J, iZ, str4, str5, agkjVarD, optional, this.I, (byte) 15));
    }

    private static boolean K(int i) {
        return i == 0;
    }

    private final boolean L(long j) {
        long j2 = this.s;
        return j < (-5000) + j2 || j > j2 + 5000;
    }

    private final boolean M() {
        if (this.p > 0) {
            return true;
        }
        int[] iArr = this.q;
        return iArr != null && this.r < iArr.length;
    }

    private final boolean N() {
        return this.H != -1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r10.al != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void O(defpackage.tyt r11, int r12, long r13) {
        /*
            r10 = this;
            long r0 = r10.at
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1
            if (r4 <= 0) goto L14
            if (r12 == r5) goto L14
            java.lang.String r4 = "rti"
            java.lang.String r0 = B(r0)
            r11.f(r4, r0)
        L14:
            int[] r0 = r10.q
            if (r0 == 0) goto L31
        L18:
            int r1 = r10.r
            int r4 = r0.length
            if (r1 >= r4) goto L31
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            int r4 = r10.r
            int r6 = r4 + 1
            r10.r = r6
            r4 = r0[r4]
            long r6 = (long) r4
            long r6 = r1.toMillis(r6)
            int r1 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r1 <= 0) goto L18
            goto L40
        L31:
            int r0 = r10.p
            if (r0 <= 0) goto L3f
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = (long) r0
            long r0 = r1.toMillis(r6)
            long r6 = r13 + r0
            goto L40
        L3f:
            r6 = r2
        L40:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L8d
            if (r12 == r5) goto L6e
            r0 = 2
            if (r12 != r0) goto L5e
            boolean r12 = r10.al
            if (r12 != 0) goto L6e
            mbc r12 = r10.W
            long r0 = r12.b()
            long r8 = r10.as
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 >= 0) goto L68
            boolean r12 = r10.al
            if (r12 != 0) goto L68
            goto L6e
        L5e:
            r11 = 4
            if (r12 != r11) goto L68
            java.util.concurrent.ScheduledFuture r11 = r10.au
            if (r11 == 0) goto L68
            r11.cancel(r5)
        L68:
            r11 = 0
            r10.au = r11
            r10.at = r2
            goto L8d
        L6e:
            java.lang.String r12 = B(r6)
            java.lang.String r0 = "rtn"
            r11.f(r0, r12)
            r10.at = r6
            java.util.concurrent.ScheduledFuture r11 = r10.au
            if (r11 == 0) goto L80
            r11.cancel(r5)
        L80:
            java.util.concurrent.ScheduledExecutorService r11 = r10.ag
            java.lang.Runnable r12 = r10.ar
            long r6 = r6 - r13
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r11 = r11.schedule(r12, r6, r13)
            r10.au = r11
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzc.O(tyt, int, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0348 A[Catch: all -> 0x0433, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000b, B:12:0x002b, B:14:0x0034, B:16:0x003c, B:17:0x0045, B:19:0x0049, B:20:0x0050, B:21:0x0091, B:23:0x0097, B:24:0x00a6, B:26:0x0118, B:28:0x011c, B:29:0x012a, B:30:0x013f, B:32:0x0145, B:34:0x0155, B:38:0x0168, B:39:0x01c2, B:41:0x01c8, B:43:0x01dc, B:45:0x01eb, B:49:0x02bd, B:53:0x02cb, B:57:0x02f5, B:60:0x0312, B:61:0x0317, B:65:0x0323, B:72:0x0340, B:76:0x034f, B:77:0x0354, B:79:0x035c, B:81:0x0363, B:82:0x0368, B:83:0x0370, B:85:0x0376, B:87:0x038c, B:93:0x03ab, B:94:0x03b2, B:96:0x03b8, B:97:0x03bb, B:99:0x03c1, B:106:0x03d1, B:107:0x03dc, B:109:0x03eb, B:115:0x0426, B:110:0x03f0, B:112:0x0401, B:114:0x0405, B:74:0x0348, B:67:0x0330, B:69:0x0337), top: B:122:0x0005 }] */
    /* JADX WARN: Multi-variable type inference failed */
    private final synchronized void P(int i) {
        int i2;
        if (this.T) {
            return;
        }
        long jA = A();
        String strB = B(jA);
        tyt tytVar = new tyt(this.Z);
        D(tytVar, strB);
        List listC = C();
        int i3 = 1;
        tytVar.f("state", true != this.al ? "paused" : "playing");
        if (this.L) {
            long j = this.t;
            if (j > 0) {
                tytVar.e("lio", B(j));
            }
        }
        if (this.S) {
            tytVar.f("dl", "1");
        }
        HashMap map = new HashMap();
        map.put("st", new StringBuilder());
        map.put("et", new StringBuilder());
        map.put("conn", new StringBuilder());
        map.put("vis", new StringBuilder());
        map.put("uao", new StringBuilder());
        agqr it = this.ae.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), new StringBuilder());
        }
        map.put("cc", new StringBuilder());
        map.put("rate", new StringBuilder());
        map.put("blo", new StringBuilder());
        map.put("muted", new StringBuilder());
        map.put("volume", new StringBuilder());
        map.put("clipid", new StringBuilder());
        map.put("als", new StringBuilder());
        map.put("au", new StringBuilder());
        map.put("ss", new StringBuilder());
        map.put("brate", new StringBuilder());
        map.put("hb_data", new StringBuilder());
        if (this.v && !this.w) {
            this.w = true;
            map.put("dtm", new StringBuilder("1"));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = listC.iterator();
        String str = "";
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i6 = 0;
        while (it2.hasNext()) {
            abzb abzbVar = (abzb) it2.next();
            listC = listC;
            if (listC.size() != i3) {
                i2 = i3;
                if (TextUtils.equals(abzbVar.a, abzbVar.b)) {
                    i3 = i2;
                }
            } else {
                i2 = i3;
            }
            StringBuilder sb2 = (StringBuilder) map.get("st");
            sb2.append(str);
            sb2.append(abzbVar.a);
            StringBuilder sb3 = (StringBuilder) map.get("et");
            sb3.append(str);
            sb3.append(abzbVar.b);
            StringBuilder sb4 = (StringBuilder) map.get("conn");
            sb4.append(str);
            sb4.append(abzbVar.c);
            StringBuilder sb5 = (StringBuilder) map.get("vis");
            sb5.append(str);
            sb5.append(abzbVar.d);
            StringBuilder sb6 = (StringBuilder) map.get("uao");
            sb6.append(str);
            sb6.append(abzbVar.f);
            agqr it3 = abzbVar.o.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                agqr agqrVar = it3;
                StringBuilder sb7 = (StringBuilder) map.get(entry.getKey());
                if (sb7 != null) {
                    sb7.append(str);
                    sb7.append((String) entry.getValue());
                }
                it3 = agqrVar;
            }
            StringBuilder sb8 = (StringBuilder) map.get("cc");
            sb8.append(str);
            String str2 = abzbVar.e;
            sb8.append(str2);
            StringBuilder sb9 = (StringBuilder) map.get("rate");
            sb9.append(str);
            Iterator it4 = it2;
            float f = abzbVar.j;
            sb9.append(f);
            StringBuilder sb10 = (StringBuilder) map.get("blo");
            sb10.append(str);
            boolean z5 = z;
            String str3 = abzbVar.g;
            sb10.append(str3);
            sb.append(str);
            String str4 = abzbVar.h;
            sb.append(str4);
            StringBuilder sb11 = (StringBuilder) map.get("muted");
            sb11.append(str);
            int i7 = i4;
            sb11.append(abzbVar.i);
            StringBuilder sb12 = (StringBuilder) map.get("volume");
            sb12.append(str);
            sb12.append(abzbVar.l);
            StringBuilder sb13 = (StringBuilder) map.get("clipid");
            sb13.append(str);
            String str5 = abzbVar.m;
            sb13.append(str5);
            StringBuilder sb14 = (StringBuilder) map.get("als");
            sb14.append(str);
            int i8 = i5;
            sb14.append(abzbVar.n);
            StringBuilder sb15 = (StringBuilder) map.get("au");
            sb15.append(str);
            boolean z6 = z2;
            sb15.append((String) abzbVar.p.orElse(""));
            StringBuilder sb16 = (StringBuilder) map.get("ss");
            sb16.append(str);
            int i9 = abzbVar.q;
            sb16.append(i9);
            StringBuilder sb17 = (StringBuilder) map.get("brate");
            sb17.append(str);
            float f2 = abzbVar.k;
            sb17.append(f2);
            boolean z7 = (!TextUtils.equals(str2, "-")) | z5;
            int i10 = ((Float.compare(1.0f, f) != 0 ? 0 : i2) ^ 1) | i7;
            int i11 = ((Float.compare(1.0f, f2) != 0 ? 0 : i2) ^ 1) | i8;
            z2 = (!TextUtils.equals("0", str3)) | z6;
            z3 = (!TextUtils.isEmpty(str4)) | z3;
            z4 = (!TextUtils.equals("-", str5)) | z4;
            i6 = ((appa.SEEK_SOURCE_UNKNOWN.bm != i9 ? 0 : i2) ^ 1) | i6;
            str = ",";
            z = z7;
            i5 = i11;
            i4 = i10;
            i3 = i2;
            it2 = it4;
        }
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        boolean z8 = z2;
        if (!z) {
            map.remove("cc");
        }
        abmt abmtVar = this.ai;
        if (!abmtVar.bd()) {
            if (i13 == 0) {
                map.remove("rate");
            }
            if (i14 == 0) {
                map.remove("brate");
            }
        } else if (i13 == 0 && i14 == 0) {
            map.remove("rate");
            map.remove("brate");
        }
        if (z8) {
            if (z3) {
                map.put("blo", sb);
            }
        } else if (z3) {
            map.put("blo", sb);
        } else {
            map.remove("blo");
        }
        if (!z4) {
            map.remove("clipid");
        }
        if (this.U.isEmpty()) {
            map.remove("au");
        }
        if (i6 == 0) {
            map.remove("ss");
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (((StringBuilder) entry2.getValue()).toString().length() > 0) {
                tytVar.g((String) entry2.getKey(), ((StringBuilder) entry2.getValue()).toString(), ",:");
            }
        }
        int i15 = i == 3 ? 0 : i12;
        if (i == 3) {
            tytVar.f("final", "1");
        }
        if (M()) {
            O(tytVar, i, jA);
        }
        if (abmtVar.be()) {
            int i16 = i - 1;
            ((xkn) this.ap.io()).a(i16 != i12 ? i16 != 2 ? 9 : 8 : 6);
        }
        boolean zM = abmtVar.i.m(35, 45600124L);
        wjm wjmVar = this.c;
        if (zM) {
            F(tytVar, wjmVar, true);
        } else {
            H(tytVar, new wjk(wjmVar, 0));
            aoqb aoqbVarCn = abmt.cn(this.ay);
            if (aoqbVarCn != null && aoqbVarCn.k) {
                aihf aihfVarCreateBuilder = arhm.a.createBuilder();
                String string = tytVar.toString();
                aihfVarCreateBuilder.copyOnWrite();
                arhm arhmVar = (arhm) aihfVarCreateBuilder.instance;
                string.getClass();
                arhmVar.b |= 1;
                arhmVar.c = string;
                Q(aihfVarCreateBuilder);
            }
        }
        this.x = (this.x ? 1 : 0) | (i15 ^ 1);
    }

    private final void Q(aihf aihfVar) {
        xeu xeuVar = this.ao;
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVar, alot.VSS_DATA);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arhm arhmVar = (arhm) aihfVar.build();
        arhmVar.getClass();
        alouVar.d = arhmVar;
        alouVar.c = 491;
        xeuVar.b((alou) alosVar.build());
    }

    public static boolean y(wiu wiuVar, abnc abncVar) {
        if (abncVar.s == 2) {
            return true;
        }
        if (wiuVar != null) {
            if (wiuVar.aO()) {
                return true;
            }
            if (wiuVar.aQ() && abncVar.s == 1) {
                return true;
            }
        }
        return false;
    }

    private final int z() {
        return this.an.b;
    }

    final long a() {
        if (abmt.by(this.L, this.ah)) {
            long j = this.s;
            long j2 = this.F;
            if (j > j2 && j2 != 0) {
                ((agrc) ((agrc) V.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats2Client", "getCurrentPlaybackPosition", 2125, "VideoStats2Client.java")).z("Reported playback position %d is greater than the duration of the video %d", this.s, this.F);
                return this.F;
            }
        }
        return this.s;
    }

    public final abyu b() {
        return new abyu(this.y, this.v, this.x);
    }

    public final synchronized void c() {
        if (this.am && !this.av.isEmpty()) {
            List list = this.av;
            abzb abzbVar = (abzb) list.remove(list.size() - 1);
            List list2 = this.av;
            Optional.empty();
            list2.add(aawo.h(abzbVar.a, B(a()), abzbVar.c, abzbVar.d, abzbVar.e, abzbVar.f, abzbVar.g, abzbVar.h, abzbVar.i, abzbVar.j, abzbVar.k, abzbVar.l, abzbVar.m, abzbVar.n, abzbVar.o, abzbVar.p, abzbVar.q, (byte) 15));
            this.am = false;
            this.I = appa.SEEK_SOURCE_UNKNOWN.bm;
        }
    }

    public final void d() {
        c();
        x();
    }

    public final void e(aaxh aaxhVar) {
        float f = this.E;
        float f2 = aaxhVar.c;
        if (f != f2) {
            this.E = f2;
            if (this.ai.bd()) {
                Float f3 = aaxhVar.d;
                if (f3 == null || f3.floatValue() == 0.0f) {
                    this.J = f2;
                } else {
                    this.J = f2 / f3.floatValue();
                }
            }
            c();
            x();
        }
    }

    public final void f(aaxo aaxoVar) {
        abzf abzfVar = this.ac;
        abnr abnrVar = aaxoVar.a;
        abzfVar.a = abnrVar;
        aaxo aaxoVar2 = this.aj;
        if (aaxoVar2 != null && aaxoVar2.a == abnrVar && TextUtils.equals(aaxoVar2.f, aaxoVar.f)) {
            return;
        }
        c();
        this.aj = aaxoVar;
        x();
    }

    public final void g(aazb aazbVar) {
        if (this.ai.cl() || TextUtils.equals(this.D, aazbVar.a())) {
            return;
        }
        this.D = aazbVar.a();
        c();
        x();
    }

    public final void h(aazg aazgVar) {
        aboa aboaVar = this.ak;
        aboa aboaVar2 = aazgVar.a;
        if (aboaVar != aboaVar2) {
            c();
            this.ak = aboaVar2;
            x();
        }
    }

    public final void i(aazl aazlVar) {
        if (!this.ai.cl() || TextUtils.equals(this.D, aazlVar.b())) {
            return;
        }
        this.D = aazlVar.b();
        c();
        x();
    }

    public final void j(yvu yvuVar) {
        wgs wgsVar = yvuVar.c;
        int iE = wgsVar == null ? 0 : wgsVar.e();
        wgs wgsVar2 = yvuVar.f;
        this.B = iE;
        this.C = wgsVar2 != null ? wgsVar2.e() : 0;
        if (!this.U.isPresent() || wgsVar2 == null || ((String) this.U.get()).equals(wgsVar2.v())) {
            return;
        }
        this.U = Optional.of(wgsVar2.v());
        w();
    }

    public final void k(long j) {
        if (this.ai.aZ() && !L(j)) {
            this.s = j;
        }
        c();
        if (this.y) {
            P(3);
        }
    }

    public final void l() {
        ScheduledFuture scheduledFuture;
        I(false);
        G();
        c();
        if (this.u > 0) {
            if (M() && (scheduledFuture = this.au) != null) {
                scheduledFuture.cancel(true);
                this.au = null;
            }
            P(4);
        }
    }

    public final void m() {
        if (this.al) {
            c();
            this.z = true;
            x();
        }
    }

    public final void n() {
        I(false);
        r();
    }

    public final void o(long j, appa appaVar) {
        c();
        this.s = j;
        this.I = appaVar.bm;
        x();
    }

    public final void p(long j) {
        if (this.al) {
            ((agrc) ((agrc) V.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats2Client", "onPlaybackStartedOrResumed", 1252, "VideoStats2Client.java")).v("Warning: unexpected playback play %d suppressed", j);
            return;
        }
        avmm avmmVar = this.aq;
        avmmVar.b();
        agkj agkjVar = this.ae;
        if (!agkjVar.isEmpty()) {
            agqs agqsVarListIterator = ((agke) agkjVar.values()).listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                avmmVar.c(((abyl) agqsVarListIterator.next()).a().al(new abyr(this, 8), new abxq(3)));
            }
        }
        I(true);
        this.s = j;
    }

    public final void q(long j) {
        if (this.ai.ca()) {
            this.s = j;
        }
        I(false);
    }

    public final void r() {
        c();
        if (this.y) {
            P(4);
        }
    }

    public final void s() {
        if (this.al) {
            c();
            this.z = false;
            x();
        }
    }

    public final void t(aazk aazkVar) {
        long j = aazkVar.d;
        if (j > 0) {
            this.F = j;
        }
        if (aazkVar.h) {
            long j2 = aazkVar.a;
            if (L(j2)) {
                ((agrc) ((agrc) V.c()).k("com/google/android/libraries/youtube/player/stats/VideoStats2Client", "onVideoTimeEvent", 1199, "VideoStats2Client.java")).z("Warning: unexpected playback progress %d for current playback position %d", j2, this.s);
                o(j2, appa.SEEK_SOURCE_UNKNOWN);
                return;
            }
            long j3 = this.s;
            if (j2 >= j3) {
                long j4 = this.u + (j2 - j3);
                this.u = j4;
                this.s = j2;
                this.t = aazkVar.b - j2;
                this.as = aazkVar.g + 30000;
                this.ac.b = j2;
                int iZ = z();
                if (iZ != this.G && !N()) {
                    this.G = iZ;
                    this.H = j4;
                }
                long j5 = j4 - this.H;
                if (N() && j5 > 2000) {
                    this.H = -1L;
                    this.G = iZ;
                    c();
                    x();
                }
                if (!this.y) {
                    this.y = true;
                    tyt tytVar = this.X;
                    wjm wjmVar = this.a;
                    boolean zM = M();
                    long jA = A();
                    String strB = B(jA);
                    tyt tytVar2 = new tyt(tytVar);
                    D(tytVar2, strB);
                    tytVar2.f("cmt", B(a()));
                    tytVar2.i("conn", this.ax.a());
                    tytVar2.f("vis", this.aj.a.a());
                    tytVar2.f("uao", this.ak.a());
                    agqr it = this.ae.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String strB2 = ((abyl) entry.getValue()).b();
                        if (strB2 != null) {
                            tytVar2.f((String) entry.getKey(), strB2);
                        }
                    }
                    tytVar2.f("muted", true != this.z ? "0" : "1");
                    tytVar2.f("volume", String.valueOf(z()));
                    int i = this.j;
                    if (i > 0) {
                        tytVar2.i("delay", i);
                    }
                    if (!TextUtils.equals(this.D, "-")) {
                        tytVar2.f("cc", this.D);
                    }
                    abmt abmtVar = this.ai;
                    boolean zBd = abmtVar.bd();
                    float f = this.E;
                    if (zBd) {
                        int iCompare = Float.compare(f, 1.0f);
                        int iCompare2 = Float.compare(this.J, 1.0f);
                        if (iCompare != 0 || iCompare2 != 0) {
                            tytVar2.f("rate", String.valueOf(this.E));
                            tytVar2.f("brate", String.valueOf(this.J));
                        }
                    } else if (f != 1.0f) {
                        tytVar2.f("rate", String.valueOf(f));
                    }
                    if (this.d) {
                        tytVar2.i("reuse", 1);
                    }
                    abzj abzjVar = this.aw;
                    if (!TextUtils.equals("-", abzjVar.a)) {
                        tytVar2.f("clipid", abzjVar.a);
                    }
                    int i2 = 0;
                    if (abmtVar.g.l(534, 45859281L, false) && this.L) {
                        long j6 = this.t;
                        if (j6 > 0) {
                            tytVar2.e("lio", B(j6));
                        }
                    }
                    Optional optional = this.U;
                    abyy abyyVar = new abyy(tytVar2, i2);
                    if (true == optional.isPresent()) {
                        ((tyt) abyyVar.a).f("au_d", (String) optional.get());
                    }
                    if (zM) {
                        O(tytVar2, 1, jA);
                    }
                    if (abmtVar.be()) {
                        ((xkn) this.ap.io()).a(7);
                    }
                    if (abmtVar.i.m(34, 45600123L)) {
                        F(tytVar2, wjmVar, false);
                    } else {
                        H(tytVar2, new wjk(wjmVar, 0));
                    }
                } else if (M() && this.au == null) {
                    v();
                }
                x();
                G();
            }
        }
    }

    public final void u() {
        if (this.am) {
            ((agrc) ((agrc) ((agrc) V.c()).j(new Exception())).k("com/google/android/libraries/youtube/player/stats/VideoStats2Client", "release", (char) 2143, "VideoStats2Client.java")).t("VSS2 client released unexpectedly");
            r();
        }
        this.ad.e(this.ac);
        this.an.c();
        this.aq.dispose();
    }

    public final synchronized void v() {
        if (!this.x) {
            c();
            P(2);
            x();
        }
    }

    final void w() {
        c();
        x();
    }

    public final synchronized void x() {
        if (this.al && !this.am) {
            J();
        }
    }

    public abzc(ScheduledExecutorService scheduledExecutorService, zxj zxjVar, zrx zrxVar, mbc mbcVar, tfq tfqVar, abuz abuzVar, zzj zzjVar, tun tunVar, aawa aawaVar, zwb zwbVar, ci ciVar, vyo vyoVar, vxu vxuVar, abmt abmtVar, abnc abncVar, xeu xeuVar, arif arifVar, abzj abzjVar, tyw tywVar, Map map, awmd awmdVar, abza abzaVar) {
        this(scheduledExecutorService, zxjVar, zrxVar, mbcVar, abzaVar.a, abzaVar.b, abzaVar.c, abzaVar.d, abzaVar.h, abzaVar.g, abzaVar.l, abzaVar.o, abzaVar.p, abzaVar.q, abzaVar.w, abzaVar.x, abzaVar.i, abzaVar.j, abzaVar.k, abzaVar.e, abzaVar.C, abzaVar.D, abzaVar.M, abncVar.c(), abncVar.r, tfqVar, abuzVar, tunVar, zzjVar, abzaVar.E, abzaVar.F, abzaVar.G, aawaVar.b, abzaVar.H, zwbVar, ciVar, vyoVar, vxuVar, abmtVar, abzaVar.A, abzaVar.B, abzjVar, abzaVar.I, abzaVar.t, abzaVar.r, abzaVar.u, tywVar, abzaVar.J, arifVar, abzaVar.K, abzaVar.L, abzaVar.N, abzaVar.O, abzaVar.P, xeuVar, map, awmdVar);
        this.s = abzaVar.f;
        this.u = abzaVar.m;
        this.A = abzaVar.v;
        this.B = abzaVar.y;
        this.C = abzaVar.z;
    }

    @Deprecated
    public abzc(ScheduledExecutorService scheduledExecutorService, zxj zxjVar, zrx zrxVar, mbc mbcVar, wjm wjmVar, wjm wjmVar2, wjm wjmVar3, boolean z, String str, long j, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, String str4, long j2, String str5, float f, float f2, aaxo aaxoVar, aboa aboaVar, tfq tfqVar, abuz abuzVar, tun tunVar, zzj zzjVar, int i2, int[] iArr, int i3, boolean z7, String str6, zwb zwbVar, ci ciVar, vyo vyoVar, vxu vxuVar, abmt abmtVar, int i4, long j3, abzj abzjVar, boolean z8, boolean z9, boolean z10, boolean z11, tyw tywVar, boolean z12, arif arifVar, Optional optional, int i5, int i6, String str7, String str8, xeu xeuVar, Map map, awmd awmdVar) {
        this.R = Optional.empty();
        this.aq = new avmm();
        this.ar = new abyz(this, 0);
        this.ag = scheduledExecutorService;
        this.n = zxjVar;
        this.o = zrxVar;
        this.W = mbcVar;
        wjmVar.getClass();
        this.a = wjmVar;
        this.X = new tyt(wjmVar.c());
        this.b = wjmVar2;
        this.Y = wjmVar2 != null ? new tyt(wjmVar2.c()) : null;
        wjmVar3.getClass();
        this.c = wjmVar3;
        this.Z = new tyt(wjmVar3.c());
        this.d = z;
        this.ah = vyoVar;
        this.ay = vxuVar;
        this.ai = abmtVar;
        this.f = str;
        this.F = j;
        this.j = i;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.L = z5;
        this.z = z6;
        this.g = str2;
        this.h = str3;
        this.e = j2;
        this.D = str5;
        this.E = f;
        this.J = f2;
        this.aj = aaxoVar;
        this.ak = aboaVar;
        this.ax = tfqVar;
        agkh agkhVar = new agkh(4);
        for (Map.Entry entry : map.entrySet()) {
            agkhVar.e((String) entry.getKey(), (abyl) ((awmd) entry.getValue()).io());
        }
        this.ae = agkhVar.d(true);
        this.az = abuzVar;
        this.i = str4;
        this.u = 0L;
        this.ab = tunVar;
        this.ap = awmdVar;
        this.ad = zzjVar;
        this.af = z7;
        abzf abzfVar = new abzf(tfqVar, aaxoVar.a, aboaVar, map, mbcVar, j2, str3);
        this.ac = abzfVar;
        zzjVar.c(abzfVar);
        this.p = i2;
        this.q = iArr;
        this.r = i3;
        this.av = new ArrayList();
        this.K = str6 == null ? "" : str6;
        this.G = i4;
        this.H = j3;
        this.aw = abzjVar;
        this.S = z8;
        this.T = z12;
        this.y = z9;
        this.v = z10;
        this.x = z11;
        this.an = tywVar;
        zwa zwaVarE = zwbVar.e();
        this.M = zwaVarE;
        this.N = ciVar.aD(zwaVarE);
        this.aa = arifVar;
        this.U = optional;
        this.I = i5;
        this.O = i6;
        this.P = str7;
        this.Q = str8;
        this.ao = xeuVar;
        tywVar.b();
        E(this.X);
        E(this.Z);
        E(this.Y);
    }
}
