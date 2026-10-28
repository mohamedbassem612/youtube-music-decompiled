package defpackage;

import android.os.Looper;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jtj implements cjz {
    public final List a;
    public jth b;
    public final ywn c;
    public final bvd d;
    public byte[] e;
    public ckd f;
    public int g;
    public int h = -1;
    public boolean i;
    public long j;
    public final mgk k;
    private final UUID l;
    private final HashMap n;
    private final boolean o;
    private int p;
    private Looper q;
    private cfd r;
    private final zjd s;
    private final ywj t;
    private final String u;
    private final yvk v;
    private final zah w;

    public jtj(UUID uuid, yvk yvkVar, HashMap map, ywn ywnVar, zjd zjdVar, ywj ywjVar, String str, bvd bvdVar, zah zahVar, boolean z) {
        uuid.getClass();
        this.l = uuid;
        this.v = yvkVar;
        this.n = map;
        this.c = ywnVar;
        this.s = zjdVar;
        this.t = ywjVar;
        this.u = str;
        this.d = bvdVar;
        this.w = zahVar;
        this.g = 3;
        this.o = z;
        this.k = new mgk((char[]) null);
        this.a = new ArrayList();
    }

    private static brz i(bsa bsaVar, UUID uuid, boolean z) {
        int i = bsaVar.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            brz brzVarA = bsaVar.a(i2);
            if ((brzVarA.c(uuid) || (brt.c.equals(uuid) && brzVarA.c(brt.b))) && (brzVarA.d != null || z)) {
                arrayList.add(brzVarA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (brt.d.equals(uuid)) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                brz brzVar = (brz) arrayList.get(i3);
                if (brzVar.b() && om.h(brzVar.d) == 1) {
                    return brzVar;
                }
            }
        }
        return (brz) arrayList.get(0);
    }

    @Override // defpackage.cjz
    public final int a(bse bseVar) {
        bsa bsaVar = bseVar.u;
        if (bsaVar == null) {
            return 0;
        }
        if (this.e == null) {
            UUID uuid = this.l;
            if (i(bsaVar, uuid, true) == null) {
                if (bsaVar.c != 1 || !bsaVar.a(0).c(brt.b)) {
                    return 1;
                }
                Log.w("YTDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: ".concat(String.valueOf(String.valueOf(uuid))));
            }
        }
        return 2;
    }

    public final boolean b(byte[] bArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((jth) it.next()).q(bArr)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cjz
    public final void c() {
        this.p++;
    }

    @Override // defpackage.cjz
    public final void d() {
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            this.w.a.remove(this);
        }
    }

    @Override // defpackage.cjz
    public final void e(Looper looper, cfd cfdVar) {
        Looper looper2 = this.q;
        boolean z = true;
        if (looper2 != null && looper2 != looper) {
            z = false;
        }
        ahno.O(z);
        this.q = looper;
        this.r = cfdVar;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0215  */
    /* JADX WARN: Code duplicated, block: B:118:0x0219  */
    /* JADX WARN: Code duplicated, block: B:119:0x021f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bf  */
    @Override // defpackage.cjz
    public final cju f(aae aaeVar, bse bseVar) {
        byte[] bArr;
        String str;
        jte jteVarH;
        jth jthVar;
        jte jteVar;
        int i;
        int i2;
        jth jthVar2;
        bsa bsaVar = bseVar.u;
        if (bsaVar == null) {
            return null;
        }
        int i3 = 0;
        if (this.e == null) {
            UUID uuid = this.l;
            brz brzVarI = i(bsaVar, uuid, false);
            if (brzVarI == null) {
                jti jtiVar = new jti(uuid);
                if (aaeVar != null) {
                    aaeVar.q(jtiVar);
                }
                return new ckb(new cjt(jtiVar, 6003));
            }
            str = brzVarI.c;
            bArr = brzVarI.d;
        } else {
            bArr = null;
            str = null;
        }
        int i4 = 1;
        if (!"video/webm".equals(str)) {
            jteVarH = yno.h(bArr);
        } else if (bArr != null) {
            try {
                Iterator it = agfm.d(";").f(new String(bArr, StandardCharsets.UTF_8)).iterator();
                Integer numValueOf = null;
                Integer numValueOf2 = null;
                while (it.hasNext()) {
                    List listH = agfm.c(": ").h((String) it.next());
                    if (listH.size() >= 2) {
                        if (((String) listH.get(0)).equals("Crypto-Period-Index")) {
                            numValueOf = Integer.valueOf(Integer.parseInt((String) listH.get(1)));
                        } else if (((String) listH.get(0)).equals("Crypto-Period-Seconds")) {
                            numValueOf2 = Integer.valueOf(Integer.parseInt((String) listH.get(1)));
                        }
                    }
                }
                jteVarH = numValueOf == null ? null : new jte(new byte[0], numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 120);
            } catch (RuntimeException unused) {
                zhr.d(zhq.DRM, "Could not parse drmInitData from WebM");
            }
        }
        yvk yvkVar = this.v;
        if (jteVarH != null) {
            yvkVar.k = Integer.valueOf(jteVarH.b);
        } else {
            yvkVar.k = null;
        }
        boolean z = this.o;
        if (z) {
            if (jteVarH == null && (jthVar2 = this.b) != null) {
                jthVar2.o(aaeVar);
                return jthVar2;
            }
        } else if (jteVarH == null) {
            List list = this.a;
            if (!list.isEmpty()) {
                cju cjuVar = (cju) list.get(0);
                cjuVar.o(aaeVar);
                return cjuVar;
            }
        }
        List<jth> list2 = this.a;
        jth jthVar3 = null;
        jth jthVarG = null;
        for (jth jthVar4 : list2) {
            if (jteVarH == null || jthVar4.f() == null || jthVar4.f().intValue() != jteVarH.b) {
                if (jthVar4.g == 4 && jteVarH != null && (jteVar = jthVar4.c) != null && (i = jteVarH.b) != -1 && (i2 = jteVar.b) != -1 && Math.abs(i - i2) <= i4) {
                    if (jthVar4.u() != null) {
                        byte[] bArr2 = jteVarH.a;
                        if (Arrays.equals(bArr2, new byte[i3]) || Arrays.equals(jthVar4.u(), new byte[i3]) || Arrays.equals(bArr2, jthVar4.u())) {
                            jthVarG = jthVar4;
                        } else {
                            ywn ywnVar = this.c;
                            zhv zhvVar = new zhv("drm.session");
                            zhvVar.e(0L);
                            zhvVar.c = "Try to reuse " + new String(jthVar4.u(), StandardCharsets.UTF_8) + " session for " + new String(bArr2, StandardCharsets.UTF_8);
                            ywnVar.k(zhvVar.a());
                        }
                    } else {
                        jthVarG = jthVar4;
                    }
                }
                z = z;
                i3 = 0;
                i4 = 1;
            } else {
                if (jthVar4.s()) {
                    jthVar3 = jthVar4;
                    break;
                }
                jthVar3 = jthVar4;
            }
        }
        boolean z2 = z;
        if (jthVar3 == null || !jthVar3.s()) {
            if (jthVarG != null) {
                jteVarH.getClass();
                Integer numF = jthVarG.f();
                if (numF == null) {
                    Log.w("YTDrmSessionMgr", "AcquireSession: No crypto period index available for overlap session!");
                }
                if (jthVar3 != null || jteVarH.b <= numF.intValue()) {
                    jthVar = null;
                } else {
                    jth jthVarG2 = g(bArr, str, jteVarH, jthVarG);
                    list2.add(jthVarG2);
                    jthVar = null;
                    jthVarG2.o(null);
                }
            } else {
                jthVar = null;
                if (jthVar3 == null) {
                    jthVarG = g(bArr, str, jteVarH, null);
                    if (z2 && jteVarH == null) {
                        this.b = jthVarG;
                    }
                    list2.add(jthVarG);
                }
            }
            if (jthVarG.d != null) {
                jthVarG.d = jthVar;
                if (aaeVar != null) {
                    jthVarG.b.c(aaeVar);
                }
            } else {
                jthVarG.o(aaeVar);
            }
            return jthVarG;
        }
        jthVar = null;
        jthVarG = jthVar3;
        if (jthVarG.d != null) {
            jthVarG.d = jthVar;
            if (aaeVar != null) {
                jthVarG.b.c(aaeVar);
            }
        } else {
            jthVarG.o(aaeVar);
        }
        return jthVarG;
    }

    protected final jth g(byte[] bArr, String str, jte jteVar, jth jthVar) {
        ckd ckdVar = this.f;
        ckdVar.getClass();
        byte[] bArr2 = this.e;
        Looper looper = this.q;
        long j = this.j;
        int i = this.g;
        int i2 = this.h;
        boolean z = this.i;
        qcb qcbVar = new qcb(this, null);
        cfd cfdVar = this.r;
        ywn ywnVar = this.c;
        zjd zjdVar = this.s;
        ywj ywjVar = this.t;
        return new jth(this.l, ckdVar, bArr, str, bArr2, this.n, this.v, looper, j, i, i2, z, jteVar, jthVar, qcbVar, cfdVar, ywnVar, zjdVar, ywjVar, this.u, this.k);
    }

    @Override // defpackage.cjz
    public final /* synthetic */ cjy h(aae aaeVar, bse bseVar) {
        return cjy.e;
    }
}
