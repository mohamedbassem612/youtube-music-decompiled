package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emj {
    public static final /* synthetic */ int a = 0;
    private static final boy b = boy.s("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    private static final boy c = boy.s("d", "a");
    private static final boy d = boy.s("ty", "nm");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v41, types: [int[]] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    public static elh a(emz emzVar, egy egyVar) {
        String str;
        String str2;
        boolean z;
        Float f;
        long j;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        emzVar.h();
        boolean z3 = true;
        boolean z4 = false;
        Float fValueOf = Float.valueOf(0.0f);
        String strF = "UNSET";
        long jB = 0;
        long jB2 = -1;
        boolean z5 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int color = 0;
        boolean zO = false;
        int i4 = 1;
        ?? r32 = 1;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float fA3 = 0.0f;
        String strF2 = null;
        String strF3 = null;
        ekj ekjVarA = null;
        float fA4 = 1.0f;
        dov dovVar = null;
        axfd axfdVar = null;
        eki ekiVar = null;
        jnm jnmVar = null;
        eka ekaVarF = null;
        while (emzVar.n()) {
            switch (emzVar.q(b)) {
                case 0:
                    strF = emzVar.f();
                    z3 = true;
                    break;
                case 1:
                    jB = emzVar.b();
                    z3 = true;
                    break;
                case 2:
                    strF3 = emzVar.f();
                    z3 = true;
                    break;
                case 3:
                    z = z4;
                    f = fValueOf;
                    j = jB2;
                    int iB = emzVar.b();
                    i = iB < 6 ? new int[]{1, 2, 3, 4, 5, 6, 7}[iB] : 7;
                    z4 = z;
                    fValueOf = f;
                    jB2 = j;
                    z3 = true;
                    break;
                case 4:
                    jB2 = emzVar.b();
                    z3 = true;
                    break;
                case 5:
                    float fB = emzVar.b();
                    ThreadLocal threadLocal = enm.a;
                    i2 = (int) (fB * Resources.getSystem().getDisplayMetrics().density);
                    z4 = z4;
                    z3 = true;
                    break;
                case 6:
                    float fB2 = emzVar.b();
                    ThreadLocal threadLocal2 = enm.a;
                    i3 = (int) (fB2 * Resources.getSystem().getDisplayMetrics().density);
                    z4 = z4;
                    z3 = true;
                    break;
                case 7:
                    color = Color.parseColor(emzVar.f());
                    z3 = true;
                    break;
                case 8:
                    ekjVarA = elu.a(emzVar, egyVar);
                    z3 = true;
                    break;
                case 9:
                    z = z4;
                    f = fValueOf;
                    j = jB2;
                    int iB2 = emzVar.b();
                    afxw.f();
                    if (iB2 >= 6) {
                        egyVar.e(a.bR(iB2, "Unsupported matte type: "));
                        z4 = z;
                        fValueOf = f;
                        jB2 = j;
                        z3 = true;
                    } else {
                        i4 = afxw.f()[iB2];
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            throw null;
                        }
                        if (i5 == 3) {
                            egyVar.e("Unsupported matte type: Luma");
                        } else if (i5 == 4) {
                            egyVar.e("Unsupported matte type: Luma Inverted");
                        }
                        egyVar.f(1);
                        z3 = true;
                        z4 = z;
                        fValueOf = f;
                        jB2 = j;
                    }
                    break;
                case 10:
                    f = fValueOf;
                    j = jB2;
                    emzVar.g();
                    while (emzVar.n()) {
                        emzVar.h();
                        ekc ekcVarH = null;
                        boolean zO2 = false;
                        ekg ekgVar = null;
                        int i6 = 0;
                        while (emzVar.n()) {
                            String strE = emzVar.e();
                            int iHashCode = strE.hashCode();
                            if (iHashCode != 111) {
                                if (iHashCode != 3588) {
                                    if (iHashCode != 104433) {
                                        if (iHashCode == 3357091 && strE.equals("mode")) {
                                            String strF4 = emzVar.f();
                                            int iHashCode2 = strF4.hashCode();
                                            if (iHashCode2 == 97) {
                                                if (!strF4.equals("a")) {
                                                }
                                                i6 = 1;
                                            } else if (iHashCode2 != 105) {
                                                if (iHashCode2 != 110) {
                                                    if (iHashCode2 == 115 && strF4.equals("s")) {
                                                        i6 = 2;
                                                    }
                                                } else if (strF4.equals("n")) {
                                                    i6 = 4;
                                                }
                                            } else if (strF4.equals("i")) {
                                                egyVar.e("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                i6 = 3;
                                            }
                                            ((end) ene.a).a(a.bT(strE, "Unknown mask mode ", ". Defaulting to Add."), null);
                                            i6 = 1;
                                        } else {
                                            emzVar.m();
                                        }
                                    } else if (strE.equals("inv")) {
                                        zO2 = emzVar.o();
                                    } else {
                                        emzVar.m();
                                    }
                                } else if (strE.equals("pt")) {
                                    ThreadLocal threadLocal3 = enm.a;
                                    ekgVar = new ekg(emi.a(emzVar, egyVar, Resources.getSystem().getDisplayMetrics().density, emq.a, false));
                                } else {
                                    emzVar.m();
                                }
                            } else if (strE.equals("o")) {
                                ekcVarH = qa.H(emzVar, egyVar);
                            } else {
                                emzVar.m();
                            }
                        }
                        emzVar.j();
                        arrayList.add(new ekr(i6, ekgVar, ekcVarH, zO2));
                    }
                    z = false;
                    egyVar.f(arrayList.size());
                    emzVar.i();
                    z4 = z;
                    fValueOf = f;
                    jB2 = j;
                    z3 = true;
                    break;
                case 11:
                    f = fValueOf;
                    j = jB2;
                    emzVar.g();
                    while (emzVar.n()) {
                        ekn eknVarA = elx.a(emzVar, egyVar);
                        if (eknVarA != null) {
                            arrayList2.add(eknVarA);
                        }
                    }
                    emzVar.i();
                    z = false;
                    z4 = z;
                    fValueOf = f;
                    jB2 = j;
                    z3 = true;
                    break;
                case 12:
                    Float f4 = fValueOf;
                    long j2 = jB2;
                    emzVar.h();
                    while (emzVar.n()) {
                        int iQ = emzVar.q(c);
                        if (iQ == 0) {
                            ThreadLocal threadLocal4 = enm.a;
                            ekiVar = new eki(emi.a(emzVar, egyVar, Resources.getSystem().getDisplayMetrics().density, ely.a, false));
                        } else if (iQ != z3) {
                            emzVar.l();
                            emzVar.m();
                        } else {
                            emzVar.g();
                            if (emzVar.n()) {
                                boy boyVar = elt.a;
                                emzVar.h();
                                jnm jnmVar2 = null;
                                while (emzVar.n()) {
                                    if (emzVar.q(elt.a) != 0) {
                                        emzVar.l();
                                        emzVar.m();
                                    } else {
                                        emzVar.h();
                                        ejz ejzVarE = null;
                                        ejz ejzVarE2 = null;
                                        eka ekaVarF2 = null;
                                        eka ekaVarF3 = null;
                                        while (emzVar.n()) {
                                            int iQ2 = emzVar.q(elt.b);
                                            if (iQ2 == 0) {
                                                ejzVarE = qa.E(emzVar, egyVar);
                                            } else if (iQ2 != z3) {
                                                if (iQ2 == 2) {
                                                    z2 = true;
                                                    ekaVarF2 = qa.F(emzVar, egyVar, true);
                                                } else if (iQ2 != 3) {
                                                    emzVar.l();
                                                    emzVar.m();
                                                } else {
                                                    z2 = true;
                                                    ekaVarF3 = qa.F(emzVar, egyVar, true);
                                                }
                                                z3 = z2;
                                            } else {
                                                ejzVarE2 = qa.E(emzVar, egyVar);
                                            }
                                            z3 = true;
                                        }
                                        emzVar.j();
                                        jnmVar2 = new jnm(ejzVarE, ejzVarE2, ekaVarF2, ekaVarF3);
                                        z3 = true;
                                    }
                                }
                                emzVar.j();
                                if (jnmVar2 == null) {
                                    jnmVar2 = new jnm((Object) null, (Object) null, (Object) null, (Object) null);
                                }
                                jnmVar = jnmVar2;
                            }
                            while (emzVar.n()) {
                                emzVar.m();
                            }
                            emzVar.i();
                        }
                        z3 = true;
                    }
                    emzVar.j();
                    fValueOf = f4;
                    jB2 = j2;
                    z4 = false;
                    z3 = true;
                    break;
                case 13:
                    emzVar.g();
                    ArrayList arrayList3 = new ArrayList();
                    while (emzVar.n()) {
                        emzVar.h();
                        while (emzVar.n()) {
                            int iQ3 = emzVar.q(d);
                            if (iQ3 == 0) {
                                int iB3 = emzVar.b();
                                if (iB3 == 29) {
                                    boy boyVar2 = elv.a;
                                    dovVar = null;
                                    while (emzVar.n()) {
                                        if (emzVar.q(elv.a) != 0) {
                                            emzVar.l();
                                            emzVar.m();
                                        } else {
                                            emzVar.g();
                                            while (emzVar.n()) {
                                                emzVar.h();
                                                dov dovVar2 = null;
                                                while (true) {
                                                    boolean z6 = false;
                                                    while (true) {
                                                        if (emzVar.n()) {
                                                            int iQ4 = emzVar.q(elv.b);
                                                            if (iQ4 != 0) {
                                                                if (iQ4 != z3) {
                                                                    emzVar.l();
                                                                    emzVar.m();
                                                                } else if (z6) {
                                                                    dovVar2 = new dov(qa.F(emzVar, egyVar, z3), (byte[]) null);
                                                                } else {
                                                                    emzVar.m();
                                                                }
                                                            } else if (emzVar.b() == 0) {
                                                                z6 = z3;
                                                            }
                                                        } else {
                                                            emzVar.j();
                                                            if (dovVar2 != null) {
                                                                dovVar = dovVar2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            emzVar.i();
                                        }
                                    }
                                } else if (iB3 == 25) {
                                    boy boyVar3 = elz.a;
                                    ejz ejzVarE3 = null;
                                    eka ekaVarF4 = null;
                                    eka ekaVarF5 = null;
                                    eka ekaVarF6 = null;
                                    eka ekaVarF7 = null;
                                    while (emzVar.n()) {
                                        if (emzVar.q(elz.a) != 0) {
                                            emzVar.l();
                                            emzVar.m();
                                        } else {
                                            emzVar.g();
                                            while (emzVar.n()) {
                                                emzVar.h();
                                                String strF5 = "";
                                                while (emzVar.n()) {
                                                    int iQ5 = emzVar.q(elz.b);
                                                    if (iQ5 == 0) {
                                                        strF5 = emzVar.f();
                                                    } else if (iQ5 == z3) {
                                                        switch (strF5.hashCode()) {
                                                            case 353103893:
                                                                if (!strF5.equals("Distance")) {
                                                                    emzVar.m();
                                                                } else {
                                                                    ekaVarF6 = qa.F(emzVar, egyVar, z3);
                                                                }
                                                                break;
                                                            case 397447147:
                                                                if (!strF5.equals("Opacity")) {
                                                                    emzVar.m();
                                                                } else {
                                                                    ekaVarF4 = qa.F(emzVar, egyVar, false);
                                                                }
                                                                break;
                                                            case 1041377119:
                                                                if (!strF5.equals("Direction")) {
                                                                    emzVar.m();
                                                                } else {
                                                                    ekaVarF5 = qa.F(emzVar, egyVar, false);
                                                                }
                                                                break;
                                                            case 1379387491:
                                                                if (!strF5.equals("Shadow Color")) {
                                                                    emzVar.m();
                                                                } else {
                                                                    ejzVarE3 = qa.E(emzVar, egyVar);
                                                                }
                                                                break;
                                                            case 1383710113:
                                                                if (!strF5.equals("Softness")) {
                                                                    emzVar.m();
                                                                } else {
                                                                    ekaVarF7 = qa.F(emzVar, egyVar, z3);
                                                                }
                                                                break;
                                                            default:
                                                                emzVar.m();
                                                                break;
                                                        }
                                                    } else {
                                                        emzVar.l();
                                                        emzVar.m();
                                                    }
                                                }
                                                emzVar.j();
                                            }
                                            emzVar.i();
                                        }
                                    }
                                    axfdVar = (ejzVarE3 == null || ekaVarF4 == null || ekaVarF5 == null || ekaVarF6 == null || ekaVarF7 == null) ? null : new axfd(ejzVarE3, ekaVarF4, ekaVarF5, ekaVarF6, ekaVarF7);
                                }
                            } else if (iQ3 != z3) {
                                emzVar.l();
                                emzVar.m();
                            } else {
                                arrayList3.add(emzVar.f());
                            }
                        }
                        emzVar.j();
                    }
                    emzVar.i();
                    egyVar.e("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(arrayList3.toString()));
                    fValueOf = fValueOf;
                    jB2 = jB2;
                    z4 = false;
                    break;
                case 14:
                    fA4 = (float) emzVar.a();
                    z4 = false;
                    break;
                case 15:
                    fA3 = (float) emzVar.a();
                    z4 = false;
                    break;
                case 16:
                    double dA = emzVar.a();
                    ThreadLocal threadLocal5 = enm.a;
                    f2 = (float) (dA * ((double) Resources.getSystem().getDisplayMetrics().density));
                    fValueOf = fValueOf;
                    jB2 = jB2;
                    z4 = false;
                    break;
                case 17:
                    double dA2 = emzVar.a();
                    ThreadLocal threadLocal6 = enm.a;
                    f3 = (float) (dA2 * ((double) Resources.getSystem().getDisplayMetrics().density));
                    fValueOf = fValueOf;
                    jB2 = jB2;
                    z4 = false;
                    break;
                case 18:
                    fA = (float) emzVar.a();
                    z4 = false;
                    break;
                case 19:
                    fA2 = (float) emzVar.a();
                    fValueOf = fValueOf;
                    z4 = false;
                    break;
                case 20:
                    ekaVarF = qa.F(emzVar, egyVar, z4);
                    break;
                case 21:
                    strF2 = emzVar.f();
                    break;
                case 22:
                    zO = emzVar.o();
                    break;
                case 23:
                    z5 = emzVar.b() == z3 ? z3 : z4;
                    break;
                case 24:
                    int iB4 = emzVar.b();
                    qa.L();
                    if (iB4 >= 18) {
                        egyVar.e(a.bR(iB4, "Unsupported Blend Mode: "));
                        r32 = z3;
                    } else {
                        r32 = qa.L()[iB4];
                    }
                    break;
                default:
                    z = z4;
                    f = fValueOf;
                    j = jB2;
                    emzVar.l();
                    emzVar.m();
                    z4 = z;
                    fValueOf = f;
                    jB2 = j;
                    z3 = true;
                    break;
            }
        }
        Float f5 = fValueOf;
        long j3 = jB2;
        emzVar.j();
        ArrayList arrayList4 = new ArrayList();
        if (fA > 0.0f) {
            str = strF;
            str2 = strF2;
            arrayList4.add(new enn(egyVar, f5, f5, (Interpolator) null, 0.0f, Float.valueOf(fA)));
        } else {
            str = strF;
            str2 = strF2;
        }
        if (fA2 <= 0.0f) {
            fA2 = egyVar.k;
        }
        Float fValueOf2 = Float.valueOf(1.0f);
        arrayList4.add(new enn(egyVar, fValueOf2, fValueOf2, (Interpolator) null, fA, Float.valueOf(fA2)));
        arrayList4.add(new enn(egyVar, f5, f5, (Interpolator) null, fA2, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || "ai".equals(str2)) {
            egyVar.e("Convert your Illustrator layers to shape layers.");
        }
        if (z5) {
            ekj ekjVar = ekjVarA == null ? new ekj(null, null, null, null, null, null, null, null, null) : ekjVarA;
            ekjVar.j = true;
            ekjVarA = ekjVar;
        }
        return new elh(arrayList2, egyVar, str, jB, i, j3, strF3, arrayList, ekjVarA, i2, i3, color, fA4, fA3, f2, f3, ekiVar, jnmVar, arrayList4, i4, ekaVarF, zO, dovVar, axfdVar, r32 == true ? 1 : 0);
    }
}
