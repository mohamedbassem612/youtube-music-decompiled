package defpackage;

import android.text.TextUtils;
import android.util.Size;
import app.rive.semantics.SemanticState;
import internal.org.jni_zero.CommonApis;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkw {
    public final uxi a;
    public auir b;
    public boolean c;
    public String d;
    public int e;
    public float f;
    public int g;
    public int h;
    public final String i;
    public int j;
    public int k;
    public final int l;
    private String m = "";

    static {
        float f = aqkh.a.h;
    }

    private vkw(uxi uxiVar, String str, int i, auir auirVar, int i2, float f, int i3, int i4, boolean z, int i5, String str2, int i6, List list) {
        arcs arcsVar = arcs.a;
        this.a = uxiVar;
        this.d = str;
        this.e = i;
        this.b = auirVar;
        this.j = i2;
        this.f = f;
        this.g = i3;
        this.h = i4;
        this.c = z;
        this.k = i5;
        this.i = str2;
        this.l = i6;
        agke.n(list);
    }

    public static vkw a() {
        auir auirVar = auir.FONT_FAMILY_UNSPECIFIED;
        agke agkeVar = agpi.a;
        new stj(agkeVar, agkeVar);
        arcs arcsVar = arcs.a;
        return new vkw(null, "", 4, auirVar, 1, 0.0f, 0, 0, false, 1, "und", 2, agkeVar);
    }

    public static vkw b(uxi uxiVar, int i, Size size) {
        int i2;
        agke agkeVar = agpi.a;
        new stj(agkeVar, agkeVar);
        uxk uxkVar = (uxk) uxiVar;
        augy augyVar = uxkVar.a;
        int i3 = augyVar.c;
        if (i3 != 110) {
            augu auguVar = i3 == 101 ? (augu) augyVar.d : augu.a;
            String str = auguVar.c;
            atzx atzxVarA = atzx.a(auguVar.i);
            if (atzxVarA == null) {
                atzxVarA = atzx.ALIGN_HORIZONTAL_UNSPECIFIED;
            }
            int iA = ujq.a(atzxVarA);
            auir auirVarA = auir.a(auguVar.h);
            if (auirVarA == null) {
                auirVarA = auir.UNRECOGNIZED;
            }
            int iD = CommonApis.d(auguVar.j);
            if (iD == 0) {
                iD = 1;
                i2 = 1;
            } else {
                i2 = 1;
            }
            float f = auguVar.d;
            aimw aimwVar = auguVar.e;
            if (aimwVar == null) {
                aimwVar = aimw.a;
            }
            int iB = ujq.b(aimwVar);
            aimw aimwVar2 = auguVar.f;
            if (aimwVar2 == null) {
                aimwVar2 = aimw.a;
            }
            int iB2 = ujq.b(aimwVar2);
            int i4 = i2;
            boolean z = auguVar.k;
            int iBc = a.bc(auguVar.l);
            if (iBc != 0) {
                i4 = iBc;
            }
            String str2 = auguVar.m;
            arcs arcsVar = arcs.a;
            return new vkw(uxiVar, str, iA, auirVarA, iD, f, iB, iB2, z, i4, str2, 2, agkeVar);
        }
        auhb auhbVar = (auhb) augyVar.d;
        augi augiVar = (augi) uxkVar.c.orElse(augi.a);
        aqkj aqkjVar = auhbVar.o;
        if (aqkjVar == null) {
            aqkjVar = aqkj.a;
        }
        aqkh aqkhVar = aqkjVar.d;
        if (aqkhVar == null) {
            aqkhVar = aqkh.a;
        }
        if ((aqkhVar.b & 16) != 0) {
            aqkj aqkjVar2 = auhbVar.o;
            if (aqkjVar2 == null) {
                aqkjVar2 = aqkj.a;
            }
            aqkh aqkhVar2 = aqkjVar2.d;
            if (aqkhVar2 == null) {
                aqkhVar2 = aqkh.a;
            }
            int i5 = aqkhVar2.g;
        }
        aqkj aqkjVar3 = auhbVar.o;
        aqkh aqkhVar3 = (aqkjVar3 == null ? aqkj.a : aqkjVar3).d;
        if (aqkhVar3 == null) {
            aqkhVar3 = aqkh.a;
        }
        float f2 = aqkhVar3.h;
        if (aqkjVar3 == null) {
            aqkjVar3 = aqkj.a;
        }
        aqkg aqkgVar = aqkjVar3.e;
        if (aqkgVar == null) {
            aqkgVar = aqkg.a;
        }
        int i6 = aqkgVar.b;
        if ((i6 & 1) != 0) {
            int i7 = aqkgVar.c;
        }
        if ((i6 & 2) != 0) {
            int i8 = aqkgVar.d;
        }
        if ((i6 & 4) != 0) {
            int i9 = aqkgVar.e;
        }
        float fE = augiVar.d;
        if ((auhbVar.b & 64) != 0) {
            float f3 = auhbVar.i;
            if (f3 > 0.0f && size != null && i > 0) {
                fE = nqx.e(nqx.d(f3, size), i);
            }
        }
        float f4 = fE;
        String str3 = augiVar.h;
        atzx atzxVarA2 = atzx.a(auhbVar.h);
        if (atzxVarA2 == null) {
            atzxVarA2 = atzx.ALIGN_HORIZONTAL_UNSPECIFIED;
        }
        int iA2 = ujq.a(atzxVarA2);
        auir auirVarD = ujq.d(auhbVar.g);
        int iD2 = CommonApis.d(augiVar.f);
        int i10 = iD2 == 0 ? 1 : iD2;
        int i11 = auhbVar.d;
        int i12 = augiVar.g;
        int iBc2 = a.bc(i12);
        int i13 = (iBc2 == 0 || iBc2 != 3) ? auhbVar.e : auhbVar.f;
        int iBc3 = a.bc(i12);
        int i14 = iBc3 == 0 ? 1 : iBc3;
        String str4 = augiVar.e;
        int iAV = a.aV(augiVar.i);
        int i15 = iAV == 0 ? 1 : iAV;
        aiie aiieVar = augiVar.j;
        arcs arcsVar2 = arcs.a;
        if ((auhbVar.b & SemanticState.Multiline) != 0) {
            aqkf aqkfVar = auhbVar.p;
            if (aqkfVar == null) {
                aqkfVar = aqkf.a;
            }
            int i16 = aqkfVar.f;
        }
        vkw vkwVar = new vkw(uxiVar, str3, iA2, auirVarD, i10, f4, i11, i13, false, i14, str4, i15, aiieVar);
        String str5 = auhbVar.c;
        vkwVar.m = str5;
        if (!TextUtils.isEmpty(vkwVar.d)) {
            return vkwVar;
        }
        vkwVar.d = str5;
        return vkwVar;
    }

    public final void c(String str) {
        this.d = str;
        if (TextUtils.isEmpty(this.m)) {
            this.m = str;
        }
    }

    public final void d(int i) {
        int iBc = a.bc(i);
        if (iBc != 0) {
            this.k = iBc;
        }
    }

    public final void e(auir auirVar, int i) {
        this.b = auirVar;
        this.j = i;
    }
}
