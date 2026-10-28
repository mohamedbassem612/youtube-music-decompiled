package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wgs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kwo(13);
    public static boolean a = false;
    public final alaw b;
    public final String c;
    public final long d;
    public final Uri e;
    public final String f;
    public final int g;
    public final wgr h;
    public boolean i;
    private final boolean j;
    private final String k;

    public wgs(alaw alawVar, String str, boolean z, zs zsVar) {
        String str2;
        Object obj;
        boolean z2 = false;
        this.i = false;
        this.b = alawVar;
        this.c = str;
        this.d = alawVar.G;
        this.e = Uri.parse(alawVar.f);
        String strCo = zik.co(alawVar.e, alawVar.r);
        this.f = strCo;
        int i = alawVar.i;
        this.g = z ? i <= 0 ? (int) (alawVar.h * 0.8f) : i : alawVar.h;
        this.j = z;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str + '.' + strCo + '.' + alawVar.p;
        }
        this.k = str2;
        if (zsVar != null && (obj = zsVar.a) != null && ((vxz) obj).m(22, 45374643L)) {
            z2 = true;
        }
        this.i = z2;
        this.h = z2 ? p(alawVar.g) : wgr.a;
    }

    public static boolean K(int i) {
        return i == -2 || i == -1;
    }

    public static boolean U(alaw alawVar) {
        return ((Set) wir.m.io()).contains(Integer.valueOf(alawVar.e));
    }

    public static boolean ae(int i) {
        return i >= 0;
    }

    public static void ap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aihf aihfVarCreateBuilder = atzt.a.createBuilder();
        for (String str2 : str.split(":", -1)) {
            String[] strArrSplit = str2.split("=", -1);
            int length = strArrSplit.length;
            String str3 = length > 0 ? strArrSplit[0] : "";
            String str4 = length > 1 ? strArrSplit[1] : "";
            aihf aihfVarCreateBuilder2 = atzs.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            atzs atzsVar = (atzs) aihfVarCreateBuilder2.instance;
            str3.getClass();
            atzsVar.b |= 1;
            atzsVar.c = str3;
            aihfVarCreateBuilder2.copyOnWrite();
            atzs atzsVar2 = (atzs) aihfVarCreateBuilder2.instance;
            str4.getClass();
            atzsVar2.b |= 2;
            atzsVar2.d = str4;
            aihfVarCreateBuilder.copyOnWrite();
            atzt atztVar = (atzt) aihfVarCreateBuilder.instance;
            atzs atzsVar3 = (atzs) aihfVarCreateBuilder2.build();
            atzsVar3.getClass();
            aiie aiieVar = atztVar.b;
            if (!aiieVar.c()) {
                atztVar.b = aihn.mutableCopy(aiieVar);
            }
            atztVar.b.add(atzsVar3);
        }
        Base64.encodeToString(((atzt) aihfVarCreateBuilder.build()).toByteArray(), 11);
    }

    public static int g(int i, int i2) {
        return i < i2 ? wgp.a(i2, i) : wgp.a(i, i2);
    }

    public static wgr p(String str) {
        String strA = txo.a(str);
        if (strA != null) {
            if (strA.contains(",")) {
                if (strA.contains("mp4a") && (strA.contains("mp4v") || strA.contains("avc1"))) {
                    return wgr.l;
                }
            } else {
                if (strA.startsWith("avc1")) {
                    return wgr.h;
                }
                if ("vp9".equals(strA) || strA.startsWith("vp09.00")) {
                    return wgr.i;
                }
                if ("opus".equals(strA)) {
                    return wgr.b;
                }
                if (strA.startsWith("mp4a")) {
                    return wgr.c;
                }
                if (strA.startsWith("av01")) {
                    return wgr.j;
                }
                if ("vp9.2".equals(strA) || strA.startsWith("vp09.02")) {
                    return wgr.k;
                }
                if ("ac-3".equals(strA)) {
                    return wgr.e;
                }
                if ("ec-3".equals(strA)) {
                    return wgr.f;
                }
                if ("dtse".equals(strA)) {
                    return wgr.g;
                }
            }
        }
        return wgr.a;
    }

    public final String A() {
        int iB;
        String str;
        alaw alawVar = this.b;
        if (!alawVar.t.isEmpty()) {
            return alawVar.t;
        }
        if (!af() || (iB = wgp.b(i(), d())) == -1) {
            return "";
        }
        int iC = c();
        if (iC >= 55) {
            str = "60";
        } else if (iC >= 49) {
            str = "50";
        } else {
            str = iC >= 39 ? "48" : "";
        }
        return iB + 'p' + str + (true == T() ? " HDR" : "");
    }

    public final String B() {
        return txo.b(z());
    }

    public final String C() {
        return this.b.r;
    }

    public final boolean D() {
        String strA = txo.a(z());
        return strA != null && strA.startsWith("av01");
    }

    public final boolean E() {
        String strA = txo.a(z());
        if (strA != null) {
            return strA.startsWith("vp9") || strA.startsWith("vp09");
        }
        return false;
    }

    public final boolean F() {
        if (this.i) {
            return this.h == wgr.c && this.b.I == 6 && !H();
        }
        return wir.a().contains(Integer.valueOf(e()));
    }

    public final boolean G() {
        wgr wgrVar;
        if (this.i) {
            return (!af() || (wgrVar = this.h) == wgr.a || wgrVar == wgr.l) ? false : true;
        }
        return wir.c().contains(Integer.valueOf(e()));
    }

    public final boolean H() {
        int iAV;
        alaw alawVar = this.b;
        return ((alawVar.c & 65536) == 0 || (iAV = a.aV(alawVar.v)) == 0 || iAV == 1) ? false : true;
    }

    public final boolean I() {
        return z().startsWith("audio");
    }

    public final boolean J() {
        ajhl ajhlVar = this.b.y;
        if (ajhlVar == null) {
            ajhlVar = ajhl.a;
        }
        return ajhlVar.f;
    }

    public final boolean L() {
        if (this.i) {
            return this.h == wgr.j;
        }
        return wir.e().contains(Integer.valueOf(e()));
    }

    public final boolean M() {
        if (this.i) {
            return T() && this.h == wgr.j;
        }
        return wir.d().contains(Integer.valueOf(e()));
    }

    public final boolean N() {
        akvr akvrVarA = akvr.a(this.b.M);
        if (akvrVarA == null) {
            akvrVarA = akvr.DRM_TRACK_TYPE_UNSPECIFIED;
        }
        return akvrVarA == akvr.DRM_TRACK_TYPE_UNSPECIFIED;
    }

    public final boolean O() {
        ajhl ajhlVar = this.b.y;
        if (ajhlVar == null) {
            ajhlVar = ajhl.a;
        }
        return ajhlVar.e;
    }

    public final boolean P() {
        return this.b.L;
    }

    public final boolean Q() {
        alaw alawVar = this.b;
        if ((alawVar.c & 2097152) != 0) {
            alav alavVar = alawVar.A;
            if (alavVar == null) {
                alavVar = alav.a;
            }
            int iAU = a.aU(alavVar.d);
            if (iAU != 0 && iAU == 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        if (this.i) {
            return this.h == wgr.f;
        }
        return wir.q().contains(Integer.valueOf(e()));
    }

    public final boolean S() {
        if (this.i) {
            return this.h == wgr.h;
        }
        return wir.t().contains(Integer.valueOf(e()));
    }

    public final boolean T() {
        boolean z = this.i;
        alaw alawVar = this.b;
        if (!z) {
            return U(alawVar);
        }
        alav alavVar = alawVar.A;
        if (alavVar == null) {
            alavVar = alav.a;
        }
        int iL = afyd.L(alavVar.b);
        if (iL == 0 || iL != 10) {
            alav alavVar2 = alawVar.A;
            if (alavVar2 == null) {
                alavVar2 = alav.a;
            }
            int iL2 = afyd.L(alavVar2.b);
            if (iL2 == 0 || iL2 != 2) {
                return false;
            }
        }
        alav alavVar3 = alawVar.A;
        int iK = afyd.K((alavVar3 == null ? alav.a : alavVar3).c);
        if (iK == 0 || iK != 17) {
            if (alavVar3 == null) {
                alavVar3 = alav.a;
            }
            int iK2 = afyd.K(alavVar3.c);
            if (iK2 == 0 || iK2 != 19) {
                return false;
            }
        }
        return true;
    }

    public final boolean V() {
        alaw alawVar = this.b;
        if (alawVar.m <= 32) {
            return !this.i && wir.u().contains(Integer.valueOf(alawVar.e));
        }
        return true;
    }

    public final boolean W() {
        return tyu.i(this.e);
    }

    public final boolean X() {
        if (this.i) {
            return this.h == wgr.b;
        }
        return wir.w().contains(Integer.valueOf(e()));
    }

    public final boolean Y() {
        if (this.i) {
            return this.h == wgr.b && H();
        }
        return wir.v().contains(Integer.valueOf(e()));
    }

    public final boolean Z() {
        int iM = afyd.M(this.b.D);
        return iM != 0 && iM == 4;
    }

    public final double a() {
        return this.b.C;
    }

    public final boolean aa() {
        if (this.i) {
            return this.h == wgr.l;
        }
        return wir.y().contains(Integer.valueOf(e()));
    }

    public final boolean ab() {
        return this.b.O;
    }

    public final boolean ac() {
        int i = this.b.c;
        return ((i & SemanticState.Hidden) == 0 || (i & SemanticState.LiveRegion) == 0) ? false : true;
    }

    public final boolean ad() {
        if (this.i) {
            return this.h == wgr.c;
        }
        return wir.A().contains(Integer.valueOf(e()));
    }

    public final boolean af() {
        return z().startsWith("video");
    }

    public final boolean ag() {
        if (this.i) {
            return this.h == wgr.i;
        }
        return wir.D().contains(Integer.valueOf(e()));
    }

    public final boolean ah() {
        Iterator<E> it = new aihx(this.b.s, alaw.a).iterator();
        while (it.hasNext()) {
            if (((amkp) it.next()) == amkp.WIDEVINE) {
                return true;
            }
        }
        return false;
    }

    public final boolean ai() {
        if (this.i) {
            return this.h == wgr.d;
        }
        return wir.E().contains(Integer.valueOf(e()));
    }

    public final long aj() {
        String queryParameter = this.e.getQueryParameter("maxdsq");
        if (queryParameter != null) {
            try {
                return Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public final long ak() {
        Uri uri = this.e;
        String queryParameter = uri.getQueryParameter("mindsq");
        if (queryParameter == null) {
            queryParameter = uri.getQueryParameter("min_sq");
        }
        if (queryParameter != null) {
            try {
                return Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public final void al() {
        int i = this.b.x;
    }

    public final int am() {
        alaw alawVar = this.b;
        if ((alawVar.c & 2097152) == 0) {
            return 3;
        }
        alav alavVar = alawVar.A;
        if (alavVar == null) {
            alavVar = alav.a;
        }
        int iK = afyd.K(alavVar.c);
        if (iK == 0) {
            return 1;
        }
        return iK;
    }

    public final int an() {
        int iBc = a.bc(this.b.u);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    public final int ao() {
        int iAS = a.aS(this.b.w);
        if (iAS == 0) {
            return 1;
        }
        return iAS;
    }

    public final zs aq() {
        return new zs(this.e);
    }

    public final int b() {
        return this.b.I;
    }

    public final int c() {
        return this.b.m;
    }

    public final int d() {
        return this.b.l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.b.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wgs) {
            wgs wgsVar = (wgs) obj;
            if (this.d == wgsVar.d && Objects.equals(this.c, wgsVar.c) && this.b.equals(wgsVar.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r1 == 31) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (((java.util.Set) defpackage.wir.k.io()).contains(r6) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f() {
        /*
            r6 = this;
            boolean r0 = r6.af()
            if (r0 == 0) goto L13
            int r0 = r6.i()
            int r6 = r6.d()
            int r6 = g(r0, r6)
            goto L8d
        L13:
            boolean r0 = r6.I()
            if (r0 == 0) goto L8c
            boolean r0 = r6.i
            if (r0 != 0) goto L2f
            java.util.Set r0 = defpackage.wir.b()
            int r1 = r6.e()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L8c
        L2f:
            boolean r0 = r6.i
            alaw r1 = r6.b
            int r1 = r1.F
            int r1 = defpackage.afxw.aA(r1)
            r2 = 1
            if (r1 != 0) goto L3d
            r1 = r2
        L3d:
            int r6 = r6.e()
            r3 = 4
            r4 = 2
            r5 = 3
            if (r0 == 0) goto L56
            r6 = 6
            if (r1 == r6) goto L68
            r6 = 11
            if (r1 == r6) goto L78
            r6 = 21
            if (r1 == r6) goto L8a
            r6 = 31
            if (r1 != r6) goto L8a
            goto L88
        L56:
            twv r0 = defpackage.wir.i
            java.lang.Object r0 = r0.io()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L6a
        L68:
            r6 = r2
            goto L8d
        L6a:
            twv r0 = defpackage.wir.j
            java.lang.Object r0 = r0.io()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L7a
        L78:
            r6 = r4
            goto L8d
        L7a:
            twv r0 = defpackage.wir.k
            java.lang.Object r0 = r0.io()
            java.util.Set r0 = (java.util.Set) r0
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L8a
        L88:
            r6 = r3
            goto L8d
        L8a:
            r6 = r5
            goto L8d
        L8c:
            r6 = -1
        L8d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgs.f():int");
    }

    public final int h() {
        return (int) (this.b.B * 1000.0d);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.d;
        return ((((((int) (j ^ (j >>> 32))) + 31) * 31) + iHashCode) * 31) + this.b.hashCode();
    }

    public final int i() {
        return this.b.k;
    }

    public final long j() {
        return this.b.q;
    }

    public final long k() {
        return this.b.p;
    }

    public final Uri l(String str) {
        zs zsVarAq = aq();
        zsVarAq.y(str);
        return zsVarAq.x();
    }

    public final bse m() {
        bsd bsdVar = new bsd();
        bsdVar.a = this.f;
        bsdVar.a(B());
        String strA = txo.a(z());
        bsdVar.k = strA;
        int i = this.g;
        bsdVar.i = i;
        bsdVar.j = i;
        if (af()) {
            bsdVar.e(bsy.f(strA));
            bsdVar.u = i();
            bsdVar.v = d();
            int iC = c();
            bsdVar.b(iC > 0 ? iC : -1.0f);
            bsdVar.e = 4;
        } else {
            bsdVar.e(bsy.c(strA));
            bsdVar.e = true == O() ? 1 : 4;
            bsdVar.d = v();
        }
        return new bse(bsdVar);
    }

    public final cix n(String str) {
        bse bseVarM = m();
        alaw alawVar = this.b;
        long j = alawVar.p;
        String string = l(str).toString();
        alax alaxVar = alawVar.n;
        if (alaxVar == null) {
            alaxVar = alax.a;
        }
        long j2 = alaxVar.b;
        alax alaxVar2 = alawVar.n;
        if (alaxVar2 == null) {
            alaxVar2 = alax.a;
        }
        long j3 = alaxVar2.c;
        alax alaxVar3 = alawVar.o;
        long j4 = (alaxVar3 == null ? alax.a : alaxVar3).b;
        if (alaxVar3 == null) {
            alaxVar3 = alax.a;
        }
        String str2 = this.k;
        long j5 = alaxVar3.c;
        return new cix(bseVarM, agke.q(new cim(string, string, Integer.MIN_VALUE, 1)), new cjd(new civ(null, j2, (j3 - j2) + 1), 1L, 0L, j4, (j5 - j4) + 1), agpi.a, str2, j());
    }

    public final FormatIdOuterClass$FormatId o() {
        aihf aihfVarCreateBuilder = FormatIdOuterClass$FormatId.a.createBuilder();
        int iE = e();
        aihfVarCreateBuilder.copyOnWrite();
        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder.instance;
        formatIdOuterClass$FormatId.b |= 1;
        formatIdOuterClass$FormatId.c = iE;
        String strC = C();
        aihfVarCreateBuilder.copyOnWrite();
        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId2 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder.instance;
        strC.getClass();
        formatIdOuterClass$FormatId2.b |= 4;
        formatIdOuterClass$FormatId2.e = strC;
        long jK = k();
        aihfVarCreateBuilder.copyOnWrite();
        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId3 = (FormatIdOuterClass$FormatId) aihfVarCreateBuilder.instance;
        formatIdOuterClass$FormatId3.b |= 2;
        formatIdOuterClass$FormatId3.d = jK;
        return (FormatIdOuterClass$FormatId) aihfVarCreateBuilder.build();
    }

    public final aipc q() {
        aipc aipcVarA = aipc.a(this.b.N);
        return aipcVarA == null ? aipc.QUALITY_ORDINAL_UNKNOWN : aipcVarA;
    }

    public final arfx r() {
        arfx arfxVar = this.b.z;
        return arfxVar == null ? arfx.a : arfxVar;
    }

    public final Optional s() {
        alaw alawVar = this.b;
        return (alawVar.d & 2) != 0 ? Optional.of(Float.valueOf(Math.min(-alawVar.J, 0.0f))) : Optional.empty();
    }

    public final Optional t() {
        alaw alawVar = this.b;
        return (alawVar.d & 4) != 0 ? Optional.of(Float.valueOf(alawVar.K)) : Optional.empty();
    }

    public final String toString() {
        String str;
        int iE = e();
        String strC = C();
        String str2 = "";
        if (I()) {
            str = " isDefaultAudioTrack=" + O() + " audioTrackId=" + v() + " audioTrackDisplayName=" + u() + " isAutoDubbedAudioTrack=" + J();
        } else {
            str = "";
        }
        if (af()) {
            str2 = " width=" + i() + " height=" + d();
        }
        return "FormatStream(itag=" + iE + " xtags=" + strC + str + str2 + " mimeType=" + z() + " drmFamilies=" + new aihx(this.b.s, alaw.a).toString() + " uri=" + String.valueOf(this.e) + ')';
    }

    public final String u() {
        ajhl ajhlVar = this.b.y;
        if (ajhlVar == null) {
            ajhlVar = ajhl.a;
        }
        return ajhlVar.c;
    }

    public final String v() {
        ajhl ajhlVar = this.b.y;
        if (ajhlVar == null) {
            ajhlVar = ajhl.a;
        }
        return ajhlVar.d;
    }

    public final String w() {
        ajoj ajojVar = this.b.E;
        if (ajojVar == null) {
            ajojVar = ajoj.a;
        }
        return ajojVar.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.b, parcel);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public final String x() {
        ajoj ajojVar = this.b.E;
        if (ajojVar == null) {
            ajojVar = ajoj.a;
        }
        return ajojVar.f;
    }

    public final String y() {
        ajoj ajojVar = this.b.E;
        if (ajojVar == null) {
            ajojVar = ajoj.a;
        }
        return ajojVar.e;
    }

    public final String z() {
        return this.b.g;
    }
}
