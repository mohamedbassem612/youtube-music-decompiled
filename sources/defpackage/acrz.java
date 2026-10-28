package defpackage;

import android.util.LruCache;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acrz implements absk, tdz {
    public final awmd a;
    public final mbc b;
    final LruCache c;
    final LruCache d;
    private final awmd e;
    private final Executor f;
    private final awmd g;
    private final awmd h;
    private final aunn i;
    private final aunn j;
    private final absl k;
    private final awmd l;
    private final aunn m;
    private abvk n;
    private final boolean o;
    private final tre p;
    private boolean q = false;
    private final boolean r;
    private final aeiy s;
    private final hno t;
    private final abxu u;
    private final rnj v;

    public acrz(awmd awmdVar, awmd awmdVar2, Executor executor, mbc mbcVar, tbt tbtVar, hno hnoVar, awmd awmdVar3, awmd awmdVar4, aeiy aeiyVar, aunn aunnVar, aunn aunnVar2, absl abslVar, awmd awmdVar5, aunn aunnVar3, tre treVar, rnj rnjVar, abxu abxuVar, tqj tqjVar, awmd awmdVar6) {
        int i = tqr.a;
        boolean zL = tqjVar.l(1074142963, 1);
        this.o = zL;
        this.r = tqjVar.l(1073815567, 1);
        this.a = new tbp(awmdVar, zL);
        this.e = new tbp(awmdVar2, zL);
        this.f = executor;
        this.b = mbcVar;
        this.t = hnoVar;
        this.g = awmdVar3;
        this.h = awmdVar4;
        this.s = aeiyVar;
        this.i = aunnVar;
        this.j = aunnVar2;
        this.k = abslVar;
        this.l = new tbp(awmdVar5, zL);
        if (!zL) {
            this.n = ((abvn) awmdVar5.io()).o();
        }
        this.m = aunnVar3;
        this.p = treVar;
        this.v = rnjVar;
        this.u = abxuVar;
        abslVar.b(this);
        long jC = ((vxz) hnoVar.i).c(0, 45386107L, 0L);
        this.c = new LruCache(jC > 0 ? (int) jC : 64);
        this.d = new LruCache(5);
        tbtVar.f(this);
        if (tqjVar == null || !tqjVar.l(1074092410, 4)) {
            return;
        }
        ((tes) awmdVar6.io()).b(this, tew.c, tew.e);
    }

    public static int b(alqc alqcVar) {
        alop alopVar = alqcVar.c;
        if (alopVar == null) {
            alopVar = alop.a;
        }
        int i = alopVar.e;
        alvt alvtVar = alqcVar.e;
        if (alvtVar == null) {
            alvtVar = alvt.a;
        }
        alvw alvwVar = alvtVar.g;
        if (alvwVar == null) {
            alvwVar = alvw.a;
        }
        if (true == alvwVar.f) {
            i = 15;
        }
        if (i <= 0) {
            return 300;
        }
        return i;
    }

    static final acuv n(ajwo ajwoVar, acuw acuwVar, hno hnoVar, awmd awmdVar, awmd awmdVar2, aunn aunnVar) {
        byte[] bArr;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aihf aihfVarCreateBuilder = alvr.a.createBuilder();
        if ((apfpVar.c & SemanticState.LiveRegion) != 0) {
            String str = apfpVar.t;
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar = (alvr) aihfVarCreateBuilder.instance;
            str.getClass();
            alvrVar.b |= SemanticState.Modal;
            alvrVar.l = str;
        }
        if ((apfpVar.c & 8) != 0) {
            String str2 = apfpVar.o;
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar2 = (alvr) aihfVarCreateBuilder.instance;
            str2.getClass();
            alvrVar2.b |= 2;
            alvrVar2.d = str2;
        }
        if ((apfpVar.c & 32) != 0) {
            String str3 = apfpVar.p;
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar3 = (alvr) aihfVarCreateBuilder.instance;
            str3.getClass();
            alvrVar3.b |= SemanticState.Hidden;
            alvrVar3.i = str3;
        }
        if ((apfpVar.c & SemanticState.Hidden) != 0) {
            int i = apfpVar.s;
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar4 = (alvr) aihfVarCreateBuilder.instance;
            alvrVar4.b |= SemanticState.LiveRegion;
            alvrVar4.j = i;
        }
        if (((vxz) hnoVar.k).l(72, 45817574L, false) && (apfpVar.c & 8) != 0 && !apfpVar.o.isEmpty()) {
            zfs zfsVar = (zfs) aunnVar.io();
            zh zhVar = new zh((byte[]) null, (char[]) null);
            zhVar.m(apfpVar.o);
            zfp zfpVarB = zfsVar.b(zhVar.l());
            if (zfpVarB != null && (bArr = zfpVarB.b) != null) {
                aihf aihfVarCreateBuilder2 = appy.a.createBuilder();
                aigj aigjVarV = aigj.v(bArr);
                aihfVarCreateBuilder2.copyOnWrite();
                appy appyVar = (appy) aihfVarCreateBuilder2.instance;
                aigjVarV.getClass();
                appyVar.b |= 1;
                appyVar.c = aigjVarV;
                appy appyVar2 = (appy) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                alvr alvrVar5 = (alvr) aihfVarCreateBuilder.instance;
                appyVar2.getClass();
                alvrVar5.p = appyVar2;
                alvrVar5.b |= 2097152;
            }
        }
        abxv abxvVar = acuwVar.b;
        zwa zwaVarE = acuwVar.c.e();
        boolean zM = acuwVar.j.m(44, 45411807L);
        tqj tqjVar = acuwVar.g;
        int i2 = tqr.a;
        acuv acuvVar = new acuv(abxvVar, zwaVarE, zM, !tqjVar.k(1073815177), !((Boolean) acuwVar.h.io()).booleanValue());
        int i3 = apfpVar.c;
        if ((i3 & 4) != 0) {
            int iAV = a.aV(apfpVar.n);
            if (iAV == 0) {
                iAV = 1;
            }
            acuvVar.E = iAV;
        }
        acuvVar.G = aihfVarCreateBuilder;
        if ((i3 & 524288) != 0) {
            acuvVar.a = apfpVar.B;
        }
        acuvVar.n(ajwoVar.c);
        if (((vxz) hnoVar.q).l(12, 45381226L, false)) {
            acuvVar.y = tnr.d;
            acuvVar.j = true;
        }
        if (hnoVar.bf()) {
        }
        if (hnoVar.at()) {
            acuvVar.c = Optional.of(Boolean.FALSE);
        }
        int i4 = apfpVar.d;
        if ((i4 & 8) != 0) {
            int iAU = a.aU(apfpVar.M);
            acuvVar.F = iAU != 0 ? iAU : 1;
        }
        if ((i4 & 262144) != 0) {
            acuvVar.d = apfpVar.U;
        }
        return acuvVar;
    }

    private static void o(LruCache lruCache) {
        synchronized (lruCache) {
            Iterator it = lruCache.snapshot().values().iterator();
            while (it.hasNext()) {
                acrw acrwVar = ((acry) it.next()).a;
                if (acrwVar != null) {
                    acrwVar.b = true;
                }
            }
            lruCache.evictAll();
        }
    }

    private final void p(ajwo ajwoVar, acuv acuvVar) {
        apfu apfuVar;
        int iAV;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                if ((apfpVar.d & 32768) != 0) {
                    apfuVar = apfpVar.R;
                    if (apfuVar == null) {
                        apfuVar = apfu.a;
                    }
                } else {
                    apfuVar = null;
                }
                vxz vxzVar = (vxz) this.t.i;
                if (vxzVar.l(328, 52085577L, false) && hno.bi(apfuVar) && (iAV = a.aV(apfpVar.n)) != 0) {
                    int i = 3;
                    if (iAV == 3) {
                        Optional optionalC = ((acsj) this.j.io()).c(acsj.g(acuvVar.u));
                        acrj acrjVar = new acrj(acuvVar, i);
                        if (true == optionalC.isPresent()) {
                            ((acuv) acrjVar.a).e = (alqg) optionalC.get();
                        }
                        acuvVar.D = vxzVar.l(275, 45816985L, false);
                    }
                }
            }
        }
    }

    private static int q(apfp apfpVar, boolean z) {
        int iAV;
        int iAU = a.aU(apfpVar.M);
        if (iAU == 0 || iAU != 2) {
            if (!z) {
                return 2;
            }
            if (apfpVar.X && (iAV = a.aV(apfpVar.n)) != 0 && iAV == 2) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022e A[Catch: all -> 0x0247, TRY_LEAVE, TryCatch #2 {all -> 0x0247, blocks: (B:3:0x0014, B:7:0x002c, B:10:0x0034, B:12:0x0047, B:14:0x004e, B:16:0x0053, B:18:0x0072, B:19:0x0087, B:13:0x004a, B:20:0x0090, B:22:0x00c6, B:24:0x00cd, B:28:0x00de, B:35:0x00ec, B:36:0x00f4, B:82:0x01cc, B:84:0x01d4, B:86:0x01da, B:88:0x01de, B:90:0x01e8, B:93:0x020c, B:95:0x0219, B:96:0x021b, B:98:0x0228, B:100:0x022e, B:108:0x0244, B:23:0x00c9), top: B:120:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x012d A[Catch: all -> 0x0241, TryCatch #0 {all -> 0x0241, blocks: (B:37:0x00f5, B:40:0x0103, B:42:0x0109, B:44:0x0119, B:46:0x011f, B:47:0x0121, B:51:0x012d, B:53:0x0133, B:54:0x0146, B:56:0x014a, B:58:0x014f, B:60:0x0159, B:65:0x016c), top: B:118:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0133 A[Catch: all -> 0x0241, TryCatch #0 {all -> 0x0241, blocks: (B:37:0x00f5, B:40:0x0103, B:42:0x0109, B:44:0x0119, B:46:0x011f, B:47:0x0121, B:51:0x012d, B:53:0x0133, B:54:0x0146, B:56:0x014a, B:58:0x014f, B:60:0x0159, B:65:0x016c), top: B:118:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0146 A[Catch: all -> 0x0241, TryCatch #0 {all -> 0x0241, blocks: (B:37:0x00f5, B:40:0x0103, B:42:0x0109, B:44:0x0119, B:46:0x011f, B:47:0x0121, B:51:0x012d, B:53:0x0133, B:54:0x0146, B:56:0x014a, B:58:0x014f, B:60:0x0159, B:65:0x016c), top: B:118:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014a A[Catch: all -> 0x0241, TryCatch #0 {all -> 0x0241, blocks: (B:37:0x00f5, B:40:0x0103, B:42:0x0109, B:44:0x0119, B:46:0x011f, B:47:0x0121, B:51:0x012d, B:53:0x0133, B:54:0x0146, B:56:0x014a, B:58:0x014f, B:60:0x0159, B:65:0x016c), top: B:118:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[Catch: all -> 0x0241, TryCatch #0 {all -> 0x0241, blocks: (B:37:0x00f5, B:40:0x0103, B:42:0x0109, B:44:0x0119, B:46:0x011f, B:47:0x0121, B:51:0x012d, B:53:0x0133, B:54:0x0146, B:56:0x014a, B:58:0x014f, B:60:0x0159, B:65:0x016c), top: B:118:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c A[Catch: all -> 0x0241, TRY_LEAVE, TryCatch #0 {all -> 0x0241, blocks: (B:37:0x00f5, B:40:0x0103, B:42:0x0109, B:44:0x0119, B:46:0x011f, B:47:0x0121, B:51:0x012d, B:53:0x0133, B:54:0x0146, B:56:0x014a, B:58:0x014f, B:60:0x0159, B:65:0x016c), top: B:118:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2 A[Catch: all -> 0x0245, TryCatch #1 {all -> 0x0245, blocks: (B:74:0x01b2, B:76:0x01ba, B:79:0x01c4, B:80:0x01c8, B:81:0x01cb, B:69:0x019d, B:71:0x01a2, B:72:0x01a5, B:107:0x0243), top: B:119:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c4 A[Catch: all -> 0x0245, TryCatch #1 {all -> 0x0245, blocks: (B:74:0x01b2, B:76:0x01ba, B:79:0x01c4, B:80:0x01c8, B:81:0x01cb, B:69:0x019d, B:71:0x01a2, B:72:0x01a5, B:107:0x0243), top: B:119:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c8 A[Catch: all -> 0x0245, TryCatch #1 {all -> 0x0245, blocks: (B:74:0x01b2, B:76:0x01ba, B:79:0x01c4, B:80:0x01c8, B:81:0x01cb, B:69:0x019d, B:71:0x01a2, B:72:0x01a5, B:107:0x0243), top: B:119:0x00f4 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4 A[Catch: all -> 0x0247, TryCatch #2 {all -> 0x0247, blocks: (B:3:0x0014, B:7:0x002c, B:10:0x0034, B:12:0x0047, B:14:0x004e, B:16:0x0053, B:18:0x0072, B:19:0x0087, B:13:0x004a, B:20:0x0090, B:22:0x00c6, B:24:0x00cd, B:28:0x00de, B:35:0x00ec, B:36:0x00f4, B:82:0x01cc, B:84:0x01d4, B:86:0x01da, B:88:0x01de, B:90:0x01e8, B:93:0x020c, B:95:0x0219, B:96:0x021b, B:98:0x0228, B:100:0x022e, B:108:0x0244, B:23:0x00c9), top: B:120:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0207  */
    /* JADX WARN: Code duplicated, block: B:93:0x020c A[Catch: all -> 0x0247, TryCatch #2 {all -> 0x0247, blocks: (B:3:0x0014, B:7:0x002c, B:10:0x0034, B:12:0x0047, B:14:0x004e, B:16:0x0053, B:18:0x0072, B:19:0x0087, B:13:0x004a, B:20:0x0090, B:22:0x00c6, B:24:0x00cd, B:28:0x00de, B:35:0x00ec, B:36:0x00f4, B:82:0x01cc, B:84:0x01d4, B:86:0x01da, B:88:0x01de, B:90:0x01e8, B:93:0x020c, B:95:0x0219, B:96:0x021b, B:98:0x0228, B:100:0x022e, B:108:0x0244, B:23:0x00c9), top: B:120:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0219 A[Catch: all -> 0x0247, TryCatch #2 {all -> 0x0247, blocks: (B:3:0x0014, B:7:0x002c, B:10:0x0034, B:12:0x0047, B:14:0x004e, B:16:0x0053, B:18:0x0072, B:19:0x0087, B:13:0x004a, B:20:0x0090, B:22:0x00c6, B:24:0x00cd, B:28:0x00de, B:35:0x00ec, B:36:0x00f4, B:82:0x01cc, B:84:0x01d4, B:86:0x01da, B:88:0x01de, B:90:0x01e8, B:93:0x020c, B:95:0x0219, B:96:0x021b, B:98:0x0228, B:100:0x022e, B:108:0x0244, B:23:0x00c9), top: B:120:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0228 A[Catch: all -> 0x0247, TryCatch #2 {all -> 0x0247, blocks: (B:3:0x0014, B:7:0x002c, B:10:0x0034, B:12:0x0047, B:14:0x004e, B:16:0x0053, B:18:0x0072, B:19:0x0087, B:13:0x004a, B:20:0x0090, B:22:0x00c6, B:24:0x00cd, B:28:0x00de, B:35:0x00ec, B:36:0x00f4, B:82:0x01cc, B:84:0x01d4, B:86:0x01da, B:88:0x01de, B:90:0x01e8, B:93:0x020c, B:95:0x0219, B:96:0x021b, B:98:0x0228, B:100:0x022e, B:108:0x0244, B:23:0x00c9), top: B:120:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x022c A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v0, types: [zza] */
    /* JADX WARN: Type inference failed for: r9v1, types: [mbc] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    private final void r(ajwo ajwoVar, String str, boolean z, int i, final zza zzaVar, zza zzaVar2) {
        acuv acuvVar;
        acry acryVar;
        long j;
        acrw acrwVar;
        acuv acuvVar2;
        LruCache lruCache;
        wjf wjfVar;
        boolean z2;
        acrx acrxVar;
        acrw acrwVar2;
        alvt alvtVar;
        int i2;
        acrw acrwVar3;
        boolean z3;
        apfp apfpVar;
        afuu afuuVarC = afwt.c(90, "GetReelItemWatchFetcher.requestPlayback");
        try {
            hno hnoVar = this.t;
            acrw acrwVar4 = null;
            if (((vxz) hnoVar.e).l(101, 45407323L, false) && !z && str != null && !str.isEmpty()) {
                if (ajwoVar != null) {
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                    apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                } else {
                    apfpVar = null;
                }
                xir xirVarD = this.s.d(apfpVar);
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amiuVar.b |= 32768;
                amiuVar.n = str;
                if (apfpVar != null) {
                    String str2 = apfpVar.o;
                    aihfVarCreateBuilder.copyOnWrite();
                    amiu amiuVar2 = (amiu) aihfVarCreateBuilder.instance;
                    str2.getClass();
                    amiuVar2.b |= 536870912;
                    amiuVar2.w = str2;
                }
                xirVarD.h((amiu) aihfVarCreateBuilder.build());
            }
            final acrv acrvVar = new acrv(zzaVar2);
            awmd awmdVar = this.a;
            acuw acuwVar = (acuw) awmdVar.io();
            awmd awmdVar2 = this.g;
            awmd awmdVar3 = this.h;
            aunn aunnVar = this.m;
            acuv acuvVarN = n(ajwoVar, acuwVar, hnoVar, awmdVar2, awmdVar3, aunnVar);
            m(acuvVarN);
            p(ajwoVar, acuvVarN);
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            final apfp apfpVar2 = (apfp) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
            rnj rnjVar = this.v;
            acuvVarN.x = new acsa(rnjVar, 0);
            acuvVarN.b = i != 2;
            boolean z4 = i != 2;
            boolean z5 = i == 2;
            ?? r9 = this.b;
            long jB = r9.b();
            LruCache lruCache2 = this.c;
            try {
                synchronized (lruCache2) {
                    try {
                        String strY = acuvVarN.Y();
                        acry acryVar2 = (acry) lruCache2.get(strY);
                        if (acryVar2 == null && !z) {
                            acuvVar = acuvVarN;
                            if (this.r && (acryVar = (acry) lruCache2.remove(acuvVar.e().D())) != null) {
                                acrw acrwVar5 = acryVar.a;
                                if (acrwVar5 != null) {
                                    acrwVar5.c = strY;
                                }
                                lruCache2.put(strY, acryVar);
                            }
                            if (acryVar == null) {
                                acry acryVar3 = new acry();
                                j = jB;
                                try {
                                    acuvVar2 = acuvVar;
                                    acrwVar = new acrw(acuvVar2, j, lruCache2, awmdVar, this.n, this.l, r9, this.e, z4, hnoVar, awmdVar2, awmdVar3, this.p, this.u, aunnVar);
                                    lruCache = lruCache2;
                                    acrwVar.d(zzaVar, z);
                                    if (z5) {
                                        acrwVar.e(acrvVar, z);
                                    }
                                    acryVar3.a = acrwVar;
                                    lruCache.put(strY, acryVar3);
                                    wjfVar = null;
                                    acrwVar4 = acrwVar;
                                    z2 = false;
                                    acrxVar = null;
                                } catch (Throwable th) {
                                    th = th;
                                    r9 = lruCache2;
                                    throw th;
                                }
                            } else if (l(acryVar)) {
                                acrxVar = new acrx(acryVar.b, acryVar.e, true);
                                acuvVar2 = acuvVar;
                                lruCache = lruCache2;
                                j = jB;
                                wjfVar = null;
                                z2 = true;
                            } else {
                                acrwVar3 = acryVar.a;
                                if (acrwVar3 != null) {
                                    acrwVar3.d(zzaVar, z);
                                    if (z5) {
                                        acryVar.a.e(acrvVar, z);
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    lruCache2.put(strY, acryVar);
                                    wjfVar = acryVar.c;
                                    if (wjfVar != null || !z3) {
                                        wjfVar = null;
                                    }
                                    acuvVar2 = acuvVar;
                                    lruCache = lruCache2;
                                    j = jB;
                                    acrxVar = null;
                                    z2 = true;
                                } else {
                                    acry acryVar4 = new acry();
                                    j = jB;
                                    acuvVar2 = acuvVar;
                                    acrwVar = new acrw(acuvVar2, j, lruCache2, awmdVar, this.n, this.l, r9, this.e, z4, hnoVar, awmdVar2, awmdVar3, this.p, this.u, aunnVar);
                                    lruCache = lruCache2;
                                    acrwVar.d(zzaVar, z);
                                    if (z5) {
                                        acrwVar.e(acrvVar, z);
                                    }
                                    acryVar4.a = acrwVar;
                                    lruCache.put(strY, acryVar4);
                                    wjfVar = null;
                                    acrwVar4 = acrwVar;
                                    z2 = false;
                                    acrxVar = null;
                                }
                            }
                            if (!z && !rnjVar.h(238) && !rnjVar.h(239)) {
                                if (z2) {
                                    rnjVar.g(238);
                                } else {
                                    rnjVar.g(239);
                                }
                            }
                            if (this.t.aE()) {
                                i2 = apfpVar2.c;
                                if ((i2 & 8) != 0 || (i2 & 64) == 0) {
                                    acrwVar2 = acrwVar4;
                                    if (acrxVar != null) {
                                        zzaVar.a(acrxVar);
                                        alvtVar = ((alqc) acrxVar.b).e;
                                        if (alvtVar == null) {
                                            alvtVar = alvt.a;
                                        }
                                        acrvVar.a(new wji(alvtVar, j, (wja) acrxVar.c));
                                    } else if (wjfVar != null) {
                                        acrvVar.a(wjfVar);
                                    } else if (acrwVar2 != null) {
                                        ((acuw) this.a.io()).b(acuvVar2, acrwVar2);
                                    }
                                } else {
                                    String str3 = apfpVar2.q;
                                    int i3 = actk.b;
                                    if (aasc.c(str3)) {
                                        actk actkVar = (actk) this.i.io();
                                        String str4 = apfpVar2.o;
                                        final acuv acuvVar3 = acuvVar2;
                                        final long j2 = j;
                                        final acrw acrwVar6 = acrwVar4;
                                        taf.n(actkVar.a(), this.f, new tae() { // from class: acru
                                            @Override // defpackage.tae, defpackage.twi
                                            public final void a(Object obj) {
                                                wjf wjfVar2 = (wjf) obj;
                                                if (aecm.av(apfpVar2)) {
                                                    acrw acrwVar7 = acrwVar6;
                                                    if (acrwVar7 != null) {
                                                        ((acuw) this.a.a.io()).b(acuvVar3, acrwVar7);
                                                    }
                                                } else {
                                                    zza zzaVar3 = zzaVar;
                                                    aihf aihfVarCreateBuilder2 = alqc.a.createBuilder();
                                                    apdw apdwVar = apdw.REEL_LOOP_BEHAVIOR_REPEAT;
                                                    aihfVarCreateBuilder2.copyOnWrite();
                                                    alqc alqcVar = (alqc) aihfVarCreateBuilder2.instance;
                                                    alqcVar.h = apdwVar.j;
                                                    alqcVar.b |= SemanticState.Focused;
                                                    zzaVar3.a(new acrx((alqc) aihfVarCreateBuilder2.build(), wjfVar2.g(), false));
                                                }
                                                acrvVar.a(new wji(wjfVar2.u(), j2, wjfVar2.g()));
                                            }
                                        });
                                    } else {
                                        acrwVar2 = acrwVar4;
                                        if (acrxVar != null) {
                                            zzaVar.a(acrxVar);
                                            alvtVar = ((alqc) acrxVar.b).e;
                                            if (alvtVar == null) {
                                                alvtVar = alvt.a;
                                            }
                                            acrvVar.a(new wji(alvtVar, j, (wja) acrxVar.c));
                                        } else if (wjfVar != null) {
                                            acrvVar.a(wjfVar);
                                        } else if (acrwVar2 != null) {
                                            ((acuw) this.a.io()).b(acuvVar2, acrwVar2);
                                        }
                                    }
                                }
                            } else {
                                acrwVar2 = acrwVar4;
                                if (acrxVar != null) {
                                    zzaVar.a(acrxVar);
                                    alvtVar = ((alqc) acrxVar.b).e;
                                    if (alvtVar == null) {
                                        alvtVar = alvt.a;
                                    }
                                    acrvVar.a(new wji(alvtVar, j, (wja) acrxVar.c));
                                } else if (wjfVar != null) {
                                    acrvVar.a(wjfVar);
                                } else if (acrwVar2 != null) {
                                    ((acuw) this.a.io()).b(acuvVar2, acrwVar2);
                                }
                            }
                            afuuVarC.close();
                        }
                        acuvVar = acuvVarN;
                        acryVar = acryVar2;
                        if (acryVar == null) {
                            acry acryVar5 = new acry();
                            j = jB;
                            acuvVar2 = acuvVar;
                            acrwVar = new acrw(acuvVar2, j, lruCache2, awmdVar, this.n, this.l, r9, this.e, z4, hnoVar, awmdVar2, awmdVar3, this.p, this.u, aunnVar);
                            lruCache = lruCache2;
                            acrwVar.d(zzaVar, z);
                            if (z5) {
                                acrwVar.e(acrvVar, z);
                            }
                            acryVar5.a = acrwVar;
                            lruCache.put(strY, acryVar5);
                            wjfVar = null;
                            acrwVar4 = acrwVar;
                            z2 = false;
                            acrxVar = null;
                        } else if (l(acryVar)) {
                            acrxVar = new acrx(acryVar.b, acryVar.e, true);
                            acuvVar2 = acuvVar;
                            lruCache = lruCache2;
                            j = jB;
                            wjfVar = null;
                            z2 = true;
                        } else {
                            acrwVar3 = acryVar.a;
                            if (acrwVar3 != null) {
                                acrwVar3.d(zzaVar, z);
                                if (z5) {
                                    acryVar.a.e(acrvVar, z);
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                lruCache2.put(strY, acryVar);
                                wjfVar = acryVar.c;
                                if (wjfVar != null) {
                                    wjfVar = null;
                                } else {
                                    wjfVar = null;
                                }
                                acuvVar2 = acuvVar;
                                lruCache = lruCache2;
                                j = jB;
                                acrxVar = null;
                                z2 = true;
                            } else {
                                acry acryVar6 = new acry();
                                j = jB;
                                acuvVar2 = acuvVar;
                                acrwVar = new acrw(acuvVar2, j, lruCache2, awmdVar, this.n, this.l, r9, this.e, z4, hnoVar, awmdVar2, awmdVar3, this.p, this.u, aunnVar);
                                lruCache = lruCache2;
                                acrwVar.d(zzaVar, z);
                                if (z5) {
                                    acrwVar.e(acrvVar, z);
                                }
                                acryVar6.a = acrwVar;
                                lruCache.put(strY, acryVar6);
                                wjfVar = null;
                                acrwVar4 = acrwVar;
                                z2 = false;
                                acrxVar = null;
                            }
                        }
                        if (!z) {
                            if (z2) {
                                rnjVar.g(238);
                            } else {
                                rnjVar.g(239);
                            }
                        }
                        if (this.t.aE()) {
                            i2 = apfpVar2.c;
                            if ((i2 & 8) != 0) {
                                acrwVar2 = acrwVar4;
                                if (acrxVar != null) {
                                    zzaVar.a(acrxVar);
                                    alvtVar = ((alqc) acrxVar.b).e;
                                    if (alvtVar == null) {
                                        alvtVar = alvt.a;
                                    }
                                    acrvVar.a(new wji(alvtVar, j, (wja) acrxVar.c));
                                } else if (wjfVar != null) {
                                    acrvVar.a(wjfVar);
                                } else if (acrwVar2 != null) {
                                    ((acuw) this.a.io()).b(acuvVar2, acrwVar2);
                                }
                            } else {
                                acrwVar2 = acrwVar4;
                                if (acrxVar != null) {
                                    zzaVar.a(acrxVar);
                                    alvtVar = ((alqc) acrxVar.b).e;
                                    if (alvtVar == null) {
                                        alvtVar = alvt.a;
                                    }
                                    acrvVar.a(new wji(alvtVar, j, (wja) acrxVar.c));
                                } else if (wjfVar != null) {
                                    acrvVar.a(wjfVar);
                                } else if (acrwVar2 != null) {
                                    ((acuw) this.a.io()).b(acuvVar2, acrwVar2);
                                }
                            }
                        } else {
                            acrwVar2 = acrwVar4;
                            if (acrxVar != null) {
                                zzaVar.a(acrxVar);
                                alvtVar = ((alqc) acrxVar.b).e;
                                if (alvtVar == null) {
                                    alvtVar = alvt.a;
                                }
                                acrvVar.a(new wji(alvtVar, j, (wja) acrxVar.c));
                            } else if (wjfVar != null) {
                                acrvVar.a(wjfVar);
                            } else if (acrwVar2 != null) {
                                ((acuw) this.a.io()).b(acuvVar2, acrwVar2);
                            }
                        }
                        afuuVarC.close();
                    } catch (Throwable th2) {
                        th = th2;
                        r9 = lruCache2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            try {
                afuuVarC.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public final acuv d(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return null;
        }
        acuv acuvVarN = n(ajwoVar, (acuw) this.a.io(), this.t, this.g, this.h, this.m);
        m(acuvVarN);
        p(ajwoVar, acuvVarN);
        return acuvVarN;
    }

    public final void e(ajwo ajwoVar, wjf wjfVar, long j) {
        acuv acuvVarD;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d) || wjfVar == null || (acuvVarD = d(ajwoVar)) == null) {
            return;
        }
        acuvVarD.h = true;
        acuvVarD.b = true;
        String strY = acuvVarD.Y();
        acry acryVar = new acry();
        long jB = this.b.b();
        if (j <= 0) {
            j = jB;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        alop alopVar = wjfVar.u().d;
        if (alopVar == null) {
            alopVar = alop.a;
        }
        int i = alopVar.e;
        if (i <= 0) {
            i = 300;
        }
        acryVar.d = j + timeUnit.toMillis(i);
        acryVar.c = wjfVar;
        LruCache lruCache = this.d;
        synchronized (lruCache) {
            lruCache.put(strY, acryVar);
        }
    }

    public final void f(ajwo ajwoVar, alqc alqcVar, long j) {
        acuv acuvVarD;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d) || alqcVar == null || (acuvVarD = d(ajwoVar)) == null) {
            return;
        }
        acuvVarD.h = true;
        acuvVarD.b = true;
        String strY = acuvVarD.Y();
        acry acryVar = new acry();
        long jB = this.b.b();
        if (j <= 0) {
            j = jB;
        }
        acryVar.d = TimeUnit.SECONDS.toMillis(b(alqcVar)) + j;
        acryVar.b = alqcVar;
        if ((alqcVar.b & 4) != 0) {
            wjb wjbVar = (wjb) this.e.io();
            alvt alvtVar = alqcVar.e;
            if (alvtVar == null) {
                alvtVar = alvt.a;
            }
            acryVar.e = wji.ai(wjbVar, alvtVar, j);
        }
        LruCache lruCache = this.c;
        synchronized (lruCache) {
            lruCache.put(strY, acryVar);
        }
    }

    public final void g() {
        o(this.c);
        o(this.d);
    }

    public final void h(String str) {
        if (ahno.aa(str)) {
            return;
        }
        LruCache lruCache = this.c;
        synchronized (lruCache) {
            lruCache.remove(str);
        }
        LruCache lruCache2 = this.d;
        synchronized (lruCache2) {
            lruCache2.remove(str);
        }
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        g();
    }

    public final void i(String str) {
        if (ahno.aa(str)) {
            return;
        }
        LruCache lruCache = this.c;
        synchronized (lruCache) {
            lruCache.remove(str);
        }
    }

    public final void j(ajwo ajwoVar, String str, zza zzaVar, zza zzaVar2) {
        if (this.t.aO()) {
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        r(ajwoVar, str, false, q(apfpVar, !apfpVar.o.isEmpty()), zzaVar, zzaVar2);
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.tdz
    public final void jz() {
        g();
    }

    public final void k(ajwo ajwoVar, zza zzaVar, zza zzaVar2) {
        if (this.t.aO()) {
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        r(ajwoVar, null, true, q(apfpVar, !apfpVar.o.isEmpty()), zzaVar, zzaVar2);
    }

    public final boolean l(acry acryVar) {
        return this.b.b() <= acryVar.d && acryVar.b != null;
    }

    public final void m(acuv acuvVar) {
        aihf aihfVar = acuvVar.G;
        boolean z = this.q;
        aihfVar.copyOnWrite();
        alvr alvrVar = (alvr) aihfVar.instance;
        alvr alvrVar2 = alvr.a;
        alvrVar.b |= 8;
        alvrVar.f = z;
        aihf aihfVar2 = acuvVar.G;
        boolean z2 = this.k.c;
        aihfVar2.copyOnWrite();
        alvr alvrVar3 = (alvr) aihfVar2.instance;
        alvrVar3.b |= 4;
        alvrVar3.e = z2;
    }

    @Override // defpackage.absk
    public final void t(zwa zwaVar) {
        zwa zwaVarA = ((acuw) this.a.io()).a();
        if (zwaVarA == null || zwaVarA.h()) {
            return;
        }
        if (zwaVar.equals(zwaVarA)) {
            this.q = true;
        } else {
            this.q = ((Boolean) taf.f(this.k.a(zwaVar), Boolean.FALSE)).booleanValue();
        }
    }
}
