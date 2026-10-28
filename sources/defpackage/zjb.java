package defpackage;

import android.opengl.EGL14;
import app.rive.semantics.SemanticState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjb {
    public static final agfr a = new xjr(6);
    public static final agfr b = new xjr(7);
    public static final agfr c = new xjr(8);
    public static final abfv d;
    public static final abfv e;

    static {
        agpr agprVar = agpr.a;
        d = new abfv(agprVar, (Object) null, (byte[]) null);
        e = new abfv(agprVar, (Object) null, (byte[]) null);
    }

    static Set a(zjr zjrVar, wiu wiuVar, wja wjaVar) {
        if (zjrVar.bX() || wjaVar.E()) {
            return wir.x(wiuVar.aW());
        }
        HashSet hashSet = new HashSet(wir.x(wiuVar.aW()));
        hashSet.remove(Integer.valueOf(wgq.DASH_WEBM_OPUS_ULTRALOW_LQ.ep));
        return hashSet;
    }

    public static boolean b(wja wjaVar, wiu wiuVar, zjr zjrVar, wit witVar) {
        if (!zjrVar.dn()) {
            return false;
        }
        boolean z = wjaVar.A;
        if (z && !zjrVar.aO()) {
            return false;
        }
        int i = wjaVar.N;
        boolean z2 = wjaVar.D;
        if (i == 3 || z2) {
            return false;
        }
        if (witVar == null) {
            witVar = zjrVar.eR();
        }
        if (witVar != wit.a && witVar != wit.b) {
            return false;
        }
        Set setV = wiuVar.V();
        Set setW = wiuVar.W();
        agkj agkjVarB = wiuVar.B();
        return (z ? zjrVar.fw(setV, setW, agkjVarB) : zjrVar.fp(setV, setW, agkjVarB)) && zjrVar.fH(i);
    }

    public static boolean c(wiu wiuVar, wja wjaVar, zjr zjrVar, agfr agfrVar) {
        int i;
        return zjrVar.du() && (i = wjaVar.N) != 3 && zjrVar.fH(i) && !wjaVar.D && d(wiuVar, wjaVar, agfrVar);
    }

    public static boolean d(wiu wiuVar, wja wjaVar, agfr agfrVar) {
        return wiuVar.ak() && ((Boolean) agfrVar.io()).booleanValue() && wjaVar.x && !wjaVar.A;
    }

    public static boolean e(wja wjaVar, wiu wiuVar, zjr zjrVar, wit witVar) {
        boolean z = wjaVar.A;
        if ((z && !zjrVar.aM()) || !wjaVar.x) {
            return false;
        }
        if (witVar == null) {
            witVar = zjrVar.eR();
        }
        boolean z2 = (witVar == wit.a && zjrVar.aN()) || witVar == wit.b || wjaVar.E();
        Set setV = wiuVar.V();
        Set setW = wiuVar.W();
        agkj agkjVarB = wiuVar.B();
        return z2 && (z ? zjrVar.fr("av1_secure_supported", "video/av01", true, setV, setW, agkjVarB, 0) : zjrVar.fr("av1_supported", "video/av01", false, setV, setW, agkjVarB, 0));
    }

    public static boolean f(wja wjaVar, wiu wiuVar, zjr zjrVar, wit witVar) {
        if (!wjaVar.x || wjaVar.A) {
            return false;
        }
        if (witVar == null) {
            witVar = zjrVar.eR();
        }
        return ((witVar == wit.a && zjrVar.aL()) || witVar == wit.c || wjaVar.E()) && zjrVar.fq(wiuVar.V());
    }

    public static boolean g(wja wjaVar, wiu wiuVar, zjr zjrVar, wit witVar) {
        if (wjaVar.z) {
            if (witVar == null) {
                witVar = zjrVar.eR();
            }
            if (witVar == wit.a || witVar == wit.h) {
                return zjrVar.fu(wiuVar.V());
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    public static boolean h(wja wjaVar, wiu wiuVar, zjr zjrVar, boolean z, wit witVar) {
        int i = wjaVar.M;
        if (i == 3 || !zjrVar.fH(i)) {
            return false;
        }
        boolean z2 = wjaVar.A;
        if (z2 && !z) {
            return false;
        }
        if (witVar == null) {
            witVar = zjrVar.eR();
        }
        if (witVar != wit.a) {
            if (witVar != wit.d) {
                return false;
            }
        } else if (!z2) {
            akwm akwmVar = wiuVar.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (!akwmVar.am) {
                if (!z2) {
                    if (witVar != wit.d) {
                        return false;
                    }
                }
            }
        } else if (!z2) {
            if (witVar != wit.d) {
                return false;
            }
        }
        Set setV = wiuVar.V();
        Set setW = wiuVar.W();
        agkj agkjVarB = wiuVar.B();
        return z2 ? zjrVar.fx(setV, setW, agkjVarB) : zjrVar.fr("vp9_profile_2_supported", "video/x-vnd.on2.vp9", false, setV, setW, agkjVarB, SemanticState.Obscured);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public static boolean i(wja wjaVar, wiu wiuVar, zjr zjrVar, agfr agfrVar, wit witVar) {
        boolean z;
        if (wjaVar.M == 3 || wjaVar.A) {
            return false;
        }
        if (witVar == null) {
            witVar = zjrVar.eR();
        }
        if (witVar == wit.a) {
            akwm akwmVar = wiuVar.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (!akwmVar.al || !wiuVar.aI()) {
                if (witVar != wit.f) {
                    return false;
                }
            }
        } else if (witVar != wit.f) {
            return false;
        }
        if (zjrVar.B) {
            return false;
        }
        if (zjrVar.r.getConfiguration().isScreenWideColorGamut()) {
            tpq tpqVar = zjrVar.s;
            atpl atplVar = (atpl) tpqVar.c();
            if ((atplVar.b & SemanticState.ReadOnly) != 0) {
                z = atplVar.n;
            } else {
                String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                boolean z2 = strEglQueryString != null && strEglQueryString.contains("EGL_KHR_gl_colorspace") && strEglQueryString.contains("EGL_EXT_gl_colorspace_display_p3");
                tpqVar.b(new zjq(z2, 2));
                z = z2;
            }
            if (!z) {
                return false;
            }
        }
        return ((Boolean) agfrVar.io()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public static boolean j(wja wjaVar, wiu wiuVar, zjr zjrVar, wit witVar) {
        int i = wjaVar.M;
        if (i == 3 || wjaVar.A) {
            return false;
        }
        if (witVar == null) {
            witVar = zjrVar.eR();
        }
        if (witVar == wit.a) {
            akwm akwmVar = wiuVar.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (!akwmVar.an) {
                if (witVar != wit.e) {
                    return false;
                }
            }
        } else if (witVar != wit.e) {
            return false;
        }
        return zjrVar.fH(i) && zjrVar.fr("vp9_profile_2_supported", "video/x-vnd.on2.vp9", false, wiuVar.V(), agpr.a, agpn.b, SemanticState.Obscured);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r4 == defpackage.wit.d) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(defpackage.wja r1, defpackage.wiu r2, defpackage.zjr r3, defpackage.wit r4) {
        /*
            boolean r0 = r1.y
            if (r0 == 0) goto L3e
            if (r4 != 0) goto La
            wit r4 = r3.eR()
        La:
            boolean r1 = r1.A
            wit r0 = defpackage.wit.a
            if (r4 != r0) goto L22
            boolean r0 = r2.k
            if (r0 == 0) goto L22
            if (r1 == 0) goto L26
            aoqd r0 = r2.d
            akwm r0 = r0.f
            if (r0 != 0) goto L1e
            akwm r0 = defpackage.akwm.b
        L1e:
            boolean r0 = r0.aa
            if (r0 != 0) goto L26
        L22:
            wit r0 = defpackage.wit.d
            if (r4 != r0) goto L3e
        L26:
            java.util.Set r4 = r2.V()
            java.util.Set r0 = r2.W()
            agkj r2 = r2.B()
            if (r1 == 0) goto L39
            boolean r1 = r3.fy(r4, r0, r2)
            goto L3f
        L39:
            boolean r1 = r3.fC(r4, r0, r2)
            goto L3f
        L3e:
            r1 = 0
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjb.k(wja, wiu, zjr, wit):boolean");
    }

    public static boolean l(wja wjaVar, wiu wiuVar, zjr zjrVar, agfr agfrVar, wit witVar) {
        int iOrdinal;
        if (!wjaVar.y || wjaVar.A) {
            return false;
        }
        boolean z = wjaVar.z;
        if (!z && !wjaVar.w()) {
            return ((Boolean) agfrVar.io()).booleanValue();
        }
        if (witVar == null) {
            witVar = zjrVar.eR();
        }
        if ((witVar != wit.a || !wiuVar.aH()) && (iOrdinal = witVar.ordinal()) != 5 && iOrdinal != 6 && wjaVar.a(wiuVar.p()) > zjrVar.S().d) {
            akwm akwmVar = wiuVar.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (!akwmVar.H) {
                return false;
            }
            if (z && zjrVar.fu(wiuVar.V())) {
                return false;
            }
        }
        return ((Boolean) agfrVar.io()).booleanValue() && zjrVar.fF();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x005b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r4.fu(r3.V()) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(defpackage.wja r2, defpackage.wiu r3, defpackage.zjr r4, defpackage.wit r5) {
        /*
            boolean r0 = r2.y
            if (r0 == 0) goto L6d
            if (r5 != 0) goto La
            wit r5 = r4.eR()
        La:
            boolean r0 = r2.A
            wit r1 = defpackage.wit.a
            if (r5 != r1) goto L2f
            boolean r1 = r3.k
            if (r1 == 0) goto L2f
            if (r0 == 0) goto L23
            aoqd r1 = r3.d
            akwm r1 = r1.f
            if (r1 != 0) goto L1e
            akwm r1 = defpackage.akwm.b
        L1e:
            boolean r1 = r1.B
            if (r1 == 0) goto L2f
            goto L55
        L23:
            aoqd r1 = r3.d
            akwm r1 = r1.f
            if (r1 != 0) goto L2b
            akwm r1 = defpackage.akwm.b
        L2b:
            boolean r1 = r1.A
            if (r1 != 0) goto L55
        L2f:
            wit r1 = defpackage.wit.e
            if (r5 == r1) goto L55
            boolean r5 = r2.z
            if (r5 != 0) goto L3d
            boolean r2 = r2.w()
            if (r2 == 0) goto L55
        L3d:
            aoqd r2 = r3.d
            akwm r2 = r2.f
            if (r2 != 0) goto L45
            akwm r2 = defpackage.akwm.b
        L45:
            boolean r2 = r2.C
            if (r2 == 0) goto L6d
            if (r5 == 0) goto L55
            java.util.Set r2 = r3.V()
            boolean r2 = r4.fu(r2)
            if (r2 != 0) goto L6d
        L55:
            java.util.Set r2 = r3.V()
            if (r0 == 0) goto L64
            agpr r3 = defpackage.agpr.a
            agkj r5 = defpackage.agpn.b
            boolean r2 = r4.fy(r2, r3, r5)
            goto L6e
        L64:
            agpr r3 = defpackage.agpr.a
            agkj r5 = defpackage.agpn.b
            boolean r2 = r4.fC(r2, r3, r5)
            goto L6e
        L6d:
            r2 = 0
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjb.m(wja, wiu, zjr, wit):boolean");
    }

    public static abfv n(wja wjaVar, wiu wiuVar, zjr zjrVar, boolean z, agfr agfrVar) {
        wit witVarER = zjrVar.ed() ? zjrVar.eR() : null;
        if (b(wjaVar, wiuVar, zjrVar, witVarER)) {
            return new abfv(wir.l(), zjv.c, (byte[]) null);
        }
        if (c(wiuVar, wjaVar, zjrVar, b)) {
            return new abfv(wir.l(), zjv.g, (byte[]) null);
        }
        if (h(wjaVar, wiuVar, zjrVar, z, witVarER)) {
            return new abfv(wir.C(), zjv.c, (byte[]) null);
        }
        if (j(wjaVar, wiuVar, zjrVar, witVarER)) {
            return new abfv(wir.C(), zjv.b, (byte[]) null);
        }
        if (i(wjaVar, wiuVar, zjrVar, agfrVar, witVarER)) {
            return new abfv(wir.C(), zjv.d, (byte[]) null);
        }
        if (e(wjaVar, wiuVar, zjrVar, witVarER)) {
            return new abfv(wir.e(), zjv.c, (byte[]) null);
        }
        if (f(wjaVar, wiuVar, zjrVar, witVarER)) {
            return new abfv(wir.e(), zjv.b, (byte[]) null);
        }
        HashSet hashSet = new HashSet(wir.D());
        if (!zjrVar.h.m(18, 45358643L)) {
            hashSet.removeAll((Set) wir.n.io());
        }
        if (!zjrVar.aG() && !wjaVar.E()) {
            hashSet.remove(Integer.valueOf(wgq.DASH_WEBM_VP9_1080P_HQ.ep));
        }
        if ((!zjrVar.bZ() || !zjrVar.ca()) && !wjaVar.E()) {
            hashSet.remove(Integer.valueOf(wgq.DASH_WEBM_VP9_ULTRALOW_LQ.ep));
        }
        if (k(wjaVar, wiuVar, zjrVar, witVarER)) {
            return new abfv(hashSet, zjv.c, (byte[]) null);
        }
        if (!m(wjaVar, wiuVar, zjrVar, witVarER)) {
            if (l(wjaVar, wiuVar, zjrVar, agfrVar, witVarER)) {
                return new abfv(hashSet, zjv.d, (byte[]) null);
            }
            hashSet = new HashSet(wir.t());
            if ((!zjrVar.bZ() || !zjrVar.bY()) && !wjaVar.E()) {
                hashSet.remove(Integer.valueOf(wgq.DASH_FMP4_H264_ULTRALOW_LQ.ep));
            }
            if (!g(wjaVar, wiuVar, zjrVar, witVarER)) {
                return d;
            }
        }
        return new abfv(hashSet, zjv.b, (byte[]) null);
    }

    public static abfv o(wja wjaVar, wiu wiuVar, zjr zjrVar, agfr agfrVar, String str) {
        abfv abfvVar;
        int iAs;
        if (zjrVar.j.l(50, 45374860L, false) && str != null) {
            if (wjaVar.J == null) {
                wjaVar.J = new HashSet();
                Iterator it = wjaVar.u.iterator();
                while (it.hasNext()) {
                    wjaVar.J.add(ahno.Z(((wgs) it.next()).v()));
                }
            }
            if (wjaVar.J.contains(str)) {
                wjaVar = wjaVar.h(new hsb(str, 6));
            }
        }
        if (wiuVar.ar() && wiuVar.aE() && wjaVar.v() && (zjrVar.fv(wiuVar.V()) || (wiuVar.ay() && ((Boolean) agfrVar.io()).booleanValue()))) {
            return new abfv(wir.v(), zjv.f, (byte[]) null);
        }
        boolean z = wjaVar.A;
        int i = z ? wgq.DASH_FMP4_EAC3_51_HIGH_CENC.ep : wgq.DASH_FMP4_EAC3_51_HIGH.ep;
        if (((zjrVar.fz() && zjrVar.bk() && zjrVar.fh(wjaVar.e(i))) || !wjaVar.E) && wjaVar.G && zjrVar.fs(wiuVar.V())) {
            return new abfv(wir.q(), zjv.b, (byte[]) null);
        }
        int i2 = z ? wgq.DASH_FMP4_AAC_51_HIGH_CENC.ep : wgq.DASH_FMP4_AAC_51_HIGH.ep;
        if (((zjrVar.fz() && zjrVar.aE() && zjrVar.fh(wjaVar.e(i2))) || !wjaVar.E) && wjaVar.H) {
            return new abfv(wir.a(), zjv.b, (byte[]) null);
        }
        if ((zjrVar.cB() || wjaVar.E()) && wjaVar.I && zjrVar.fD(wiuVar.V())) {
            return new abfv(wir.E(), zjv.b, (byte[]) null);
        }
        if (((wiuVar.aK() && zjrVar.dF()) || wjaVar.E()) && wjaVar.F && ((Boolean) agfrVar.io()).booleanValue()) {
            abfvVar = new abfv(a(zjrVar, wiuVar, wjaVar), zjv.e, (byte[]) null);
        } else {
            if (((!wiuVar.aK() || (iAs = ahng.as(zjrVar.S().i)) == 0 || iAs != 3) && !wjaVar.E()) || !wjaVar.F || !zjrVar.fv(wiuVar.V())) {
                HashSet hashSet = new HashSet(wir.A());
                if (!wjaVar.E()) {
                    if (!zjrVar.bX()) {
                        hashSet.remove(Integer.valueOf(wgq.DASH_FMP4_HE_AAC_ULTRALOW_LQ.ep));
                    }
                    if (!zjrVar.i.m(44, 45387735L)) {
                        hashSet.remove(Integer.valueOf(wgq.DASH_FMP4_AAC_HIGH_CENC.ep));
                    }
                }
                return new abfv(hashSet, zjv.b, (byte[]) null);
            }
            abfvVar = new abfv(a(zjrVar, wiuVar, wjaVar), zjv.b, (byte[]) null);
        }
        return abfvVar;
    }
}
