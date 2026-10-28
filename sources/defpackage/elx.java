package defpackage;

import android.content.res.Resources;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elx {
    private static final boy a = boy.s("ty", "d");

    /* JADX WARN: Code duplicated, block: B:220:0x039a  */
    /* JADX WARN: Code duplicated, block: B:421:0x075d A[PHI: r17
      0x075d: PHI (r17v5 eka) = 
      (r17v0 eka)
      (r17v6 eka)
      (r17v7 eka)
      (r17v8 eka)
      (r17v9 eka)
      (r17v14 eka)
      (r17v15 eka)
      (r17v16 eka)
      (r17v16 eka)
      (r17v16 eka)
      (r17v16 eka)
      (r17v16 eka)
      (r17v16 eka)
      (r17v16 eka)
      (r17v16 eka)
     binds: [B:398:0x0708, B:372:0x067e, B:338:0x05da, B:314:0x0583, B:295:0x0534, B:279:0x04dd, B:245:0x0443, B:186:0x0313, B:160:0x02ae, B:157:0x02a0, B:136:0x0250, B:78:0x010f, B:60:0x00c3, B:42:0x007e, B:44:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [end] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4, types: [ekn] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    public static ekn a(emz emzVar, egy egyVar) {
        String strF;
        eka ekaVarF;
        Object ekmVar;
        ?? ektVar;
        Object ekyVar;
        Object elaVar;
        emzVar.h();
        int iB = 2;
        while (true) {
            if (!emzVar.n()) {
                strF = null;
                break;
            }
            int iQ = emzVar.q(a);
            if (iQ == 0) {
                strF = emzVar.f();
                break;
            }
            if (iQ != 1) {
                emzVar.l();
                emzVar.m();
            } else {
                iB = emzVar.b();
            }
        }
        if (strF == null) {
            return null;
        }
        int iHashCode = strF.hashCode();
        int i = 0;
        boolean zO = false;
        boolean zO2 = false;
        if (iHashCode != 3239) {
            int i2 = 100;
            if (iHashCode == 3270) {
                ekaVarF = null;
                if (strF.equals("fl")) {
                    boy boyVar = emr.a;
                    int iB2 = 1;
                    boolean zO3 = false;
                    boolean zO4 = false;
                    ekc ekcVar = null;
                    String strF2 = null;
                    ejz ejzVar = null;
                    while (emzVar.n()) {
                        int iQ2 = emzVar.q(emr.a);
                        if (iQ2 == 0) {
                            strF2 = emzVar.f();
                        } else if (iQ2 == 1) {
                            ejzVar = new ejz(emi.a(emzVar, egyVar, 1.0f, ema.b, false));
                        } else if (iQ2 == 2) {
                            ekcVar = new ekc(emi.a(emzVar, egyVar, 1.0f, ema.c, false));
                        } else if (iQ2 == 3) {
                            zO3 = emzVar.o();
                        } else if (iQ2 == 4) {
                            iB2 = emzVar.b();
                        } else if (iQ2 != 5) {
                            emzVar.l();
                            emzVar.m();
                        } else {
                            zO4 = emzVar.o();
                        }
                    }
                    if (ekcVar == null) {
                        ekcVar = new ekc(Collections.singletonList(new enn(100)));
                    }
                    ekyVar = new eky(strF2, zO3, iB2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, ejzVar, ekcVar, zO4);
                    ektVar = ekyVar;
                } else {
                    ?? r3 = ekaVarF;
                    ((end) ene.a).a("Unknown shape type ".concat(strF), r3);
                    ektVar = r3;
                }
            } else if (iHashCode == 3295) {
                ekaVarF = null;
                if (strF.equals("gf")) {
                    boy boyVar2 = eme.a;
                    Path.FillType fillType = Path.FillType.WINDING;
                    int i3 = 0;
                    boolean zO5 = false;
                    ekc ekcVar2 = null;
                    String strF3 = null;
                    ekb ekbVarG = null;
                    eke ekeVarI = null;
                    eke ekeVarI2 = null;
                    while (emzVar.n()) {
                        switch (emzVar.q(eme.a)) {
                            case 0:
                                strF3 = emzVar.f();
                                break;
                            case 1:
                                emzVar.h();
                                int iB3 = -1;
                                while (emzVar.n()) {
                                    int iQ3 = emzVar.q(eme.b);
                                    if (iQ3 == 0) {
                                        iB3 = emzVar.b();
                                    } else if (iQ3 != 1) {
                                        emzVar.l();
                                        emzVar.m();
                                    } else {
                                        ekbVarG = qa.G(emzVar, egyVar, iB3);
                                    }
                                }
                                emzVar.j();
                                break;
                            case 2:
                                ekcVar2 = qa.H(emzVar, egyVar);
                                break;
                            case 3:
                                i3 = emzVar.b() != 1 ? 2 : 1;
                                break;
                            case 4:
                                ekeVarI = qa.I(emzVar, egyVar);
                                break;
                            case 5:
                                ekeVarI2 = qa.I(emzVar, egyVar);
                                break;
                            case 6:
                                fillType = emzVar.b() != 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
                                break;
                            case 7:
                                zO5 = emzVar.o();
                                break;
                            default:
                                emzVar.l();
                                emzVar.m();
                                break;
                        }
                    }
                    if (ekcVar2 == null) {
                        ekcVar2 = new ekc(Collections.singletonList(new enn(100)));
                    }
                    ektVar = new ekp(strF3, i3, fillType, ekbVarG, ekcVar2, ekeVarI, ekeVarI2, zO5);
                } else {
                    ?? r4 = ekaVarF;
                    ((end) ene.a).a("Unknown shape type ".concat(strF), r4);
                    ektVar = r4;
                }
            } else if (iHashCode != 3488) {
                if (iHashCode == 3646) {
                    ekaVarF = null;
                    if (strF.equals("rp")) {
                        boy boyVar3 = emo.a;
                        String strF4 = null;
                        eka ekaVarF2 = null;
                        eka ekaVarF3 = null;
                        ekj ekjVarA = null;
                        boolean zO6 = false;
                        while (emzVar.n()) {
                            int iQ4 = emzVar.q(emo.a);
                            if (iQ4 == 0) {
                                strF4 = emzVar.f();
                            } else if (iQ4 == 1) {
                                ekaVarF2 = qa.F(emzVar, egyVar, false);
                            } else if (iQ4 == 2) {
                                ekaVarF3 = qa.F(emzVar, egyVar, false);
                            } else if (iQ4 == 3) {
                                ekjVarA = elu.a(emzVar, egyVar);
                            } else if (iQ4 != 4) {
                                emzVar.m();
                            } else {
                                zO6 = emzVar.o();
                            }
                        }
                        ekmVar = new ekv(strF4, ekaVarF2, ekaVarF3, ekjVarA, zO6);
                        ektVar = ekmVar;
                    }
                } else if (iHashCode == 3669) {
                    ekaVarF = null;
                    if (strF.equals("sh")) {
                        int i4 = emt.b;
                        int iB4 = 0;
                        boolean zO7 = false;
                        ekg ekgVar = null;
                        String strF5 = null;
                        while (emzVar.n()) {
                            int iQ5 = emzVar.q(emt.a);
                            if (iQ5 == 0) {
                                strF5 = emzVar.f();
                            } else if (iQ5 == 1) {
                                iB4 = emzVar.b();
                            } else if (iQ5 == 2) {
                                ThreadLocal threadLocal = enm.a;
                                ekgVar = new ekg(emi.a(emzVar, egyVar, Resources.getSystem().getDisplayMetrics().density, emq.a, false));
                            } else if (iQ5 != 3) {
                                emzVar.m();
                            } else {
                                zO7 = emzVar.o();
                            }
                        }
                        elaVar = new ela(strF5, iB4, ekgVar, zO7);
                        ektVar = elaVar;
                    }
                } else if (iHashCode != 3679) {
                    ekaVarF = null;
                    if (iHashCode != 3681) {
                        if (iHashCode != 3705) {
                            if (iHashCode != 3710) {
                                if (iHashCode != 3307) {
                                    if (iHashCode != 3308) {
                                        if (iHashCode != 3633) {
                                            if (iHashCode == 3634 && strF.equals("rd")) {
                                                boy boyVar4 = emp.a;
                                                eka ekaVarF4 = null;
                                                while (emzVar.n()) {
                                                    int iQ6 = emzVar.q(emp.a);
                                                    if (iQ6 == 0) {
                                                        emzVar.f();
                                                    } else if (iQ6 == 1) {
                                                        ekaVarF4 = qa.F(emzVar, egyVar, true);
                                                    } else if (iQ6 != 2) {
                                                        emzVar.m();
                                                    } else {
                                                        zO = emzVar.o();
                                                    }
                                                }
                                                ektVar = zO ? 0 : new ekw(ekaVarF4);
                                            }
                                        } else if (strF.equals("rc")) {
                                            boy boyVar5 = emn.a;
                                            boolean zO8 = false;
                                            String strF6 = null;
                                            ekk ekkVarB = null;
                                            eke ekeVarI3 = null;
                                            eka ekaVarF5 = null;
                                            while (emzVar.n()) {
                                                int iQ7 = emzVar.q(emn.a);
                                                if (iQ7 == 0) {
                                                    strF6 = emzVar.f();
                                                } else if (iQ7 == 1) {
                                                    ekkVarB = els.b(emzVar, egyVar);
                                                } else if (iQ7 == 2) {
                                                    ekeVarI3 = qa.I(emzVar, egyVar);
                                                } else if (iQ7 == 3) {
                                                    ekaVarF5 = qa.F(emzVar, egyVar, true);
                                                } else if (iQ7 != 4) {
                                                    emzVar.m();
                                                } else {
                                                    zO8 = emzVar.o();
                                                }
                                            }
                                            ektVar = new eku(strF6, ekkVarB, ekeVarI3, ekaVarF5, zO8);
                                        }
                                    } else if (strF.equals("gs")) {
                                        boy boyVar6 = emf.a;
                                        ArrayList arrayList = new ArrayList();
                                        int i5 = 0;
                                        int i6 = 0;
                                        int i7 = 0;
                                        boolean zO9 = false;
                                        ekc ekcVar3 = null;
                                        String strF7 = null;
                                        ekb ekbVarG2 = null;
                                        eke ekeVarI4 = null;
                                        eke ekeVarI5 = null;
                                        eka ekaVarF6 = null;
                                        eka ekaVar = null;
                                        float fA = 0.0f;
                                        while (emzVar.n()) {
                                            switch (emzVar.q(emf.a)) {
                                                case 0:
                                                    strF7 = emzVar.f();
                                                    break;
                                                case 1:
                                                    emzVar.h();
                                                    int iB5 = -1;
                                                    while (emzVar.n()) {
                                                        int iQ8 = emzVar.q(emf.b);
                                                        if (iQ8 == 0) {
                                                            iB5 = emzVar.b();
                                                        } else if (iQ8 != 1) {
                                                            emzVar.l();
                                                            emzVar.m();
                                                        } else {
                                                            ekbVarG2 = qa.G(emzVar, egyVar, iB5);
                                                        }
                                                    }
                                                    emzVar.j();
                                                    break;
                                                case 2:
                                                    ekcVar3 = qa.H(emzVar, egyVar);
                                                    break;
                                                case 3:
                                                    i5 = emzVar.b() != 1 ? 2 : 1;
                                                    break;
                                                case 4:
                                                    ekeVarI4 = qa.I(emzVar, egyVar);
                                                    break;
                                                case 5:
                                                    ekeVarI5 = qa.I(emzVar, egyVar);
                                                    break;
                                                case 6:
                                                    ekaVarF6 = qa.F(emzVar, egyVar, true);
                                                    break;
                                                case 7:
                                                    i6 = afxw.p()[emzVar.b() - 1];
                                                    break;
                                                case 8:
                                                    i7 = afxw.p()[emzVar.b() - 1];
                                                    break;
                                                case 9:
                                                    fA = (float) emzVar.a();
                                                    break;
                                                case 10:
                                                    zO9 = emzVar.o();
                                                    break;
                                                case 11:
                                                    emzVar.g();
                                                    while (emzVar.n()) {
                                                        emzVar.h();
                                                        String strF8 = null;
                                                        eka ekaVarF7 = null;
                                                        while (emzVar.n()) {
                                                            int iQ9 = emzVar.q(emf.c);
                                                            if (iQ9 == 0) {
                                                                strF8 = emzVar.f();
                                                            } else if (iQ9 != 1) {
                                                                emzVar.l();
                                                                emzVar.m();
                                                            } else {
                                                                ekaVarF7 = qa.F(emzVar, egyVar, true);
                                                            }
                                                        }
                                                        emzVar.j();
                                                        if (strF8.equals("o")) {
                                                            ekaVar = ekaVarF7;
                                                        } else if (strF8.equals("d") || strF8.equals("g")) {
                                                            egyVar.g();
                                                            arrayList.add(ekaVarF7);
                                                        }
                                                    }
                                                    emzVar.i();
                                                    if (arrayList.size() == 1) {
                                                        arrayList.add((eka) arrayList.get(0));
                                                    }
                                                    break;
                                                default:
                                                    emzVar.l();
                                                    emzVar.m();
                                                    break;
                                            }
                                        }
                                        if (ekcVar3 == null) {
                                            ekcVar3 = new ekc(Collections.singletonList(new enn(100)));
                                        }
                                        ekyVar = new ekq(strF7, i5, ekbVarG2, ekcVar3, ekeVarI4, ekeVarI5, ekaVarF6, i6, i7, fA, arrayList, ekaVar, zO9);
                                        ektVar = ekyVar;
                                    }
                                } else if (strF.equals("gr")) {
                                    boy boyVar7 = ems.a;
                                    ArrayList arrayList2 = new ArrayList();
                                    String strF9 = null;
                                    while (emzVar.n()) {
                                        int iQ10 = emzVar.q(ems.a);
                                        if (iQ10 == 0) {
                                            strF9 = emzVar.f();
                                        } else if (iQ10 == 1) {
                                            zO2 = emzVar.o();
                                        } else if (iQ10 != 2) {
                                            emzVar.m();
                                        } else {
                                            emzVar.g();
                                            while (emzVar.n()) {
                                                ekn eknVarA = a(emzVar, egyVar);
                                                if (eknVarA != null) {
                                                    arrayList2.add(eknVarA);
                                                }
                                            }
                                            emzVar.i();
                                        }
                                    }
                                    elaVar = new ekz(strF9, arrayList2, zO2);
                                    ektVar = elaVar;
                                }
                            } else if (strF.equals("tr")) {
                                ektVar = elu.a(emzVar, egyVar);
                            }
                        } else if (strF.equals("tm")) {
                            boy boyVar8 = emv.a;
                            int i8 = 0;
                            boolean zO10 = false;
                            eka ekaVarF8 = null;
                            eka ekaVarF9 = null;
                            while (emzVar.n()) {
                                int iQ11 = emzVar.q(emv.a);
                                if (iQ11 == 0) {
                                    ekaVarF8 = qa.F(emzVar, egyVar, false);
                                } else if (iQ11 == 1) {
                                    ekaVarF = qa.F(emzVar, egyVar, false);
                                } else if (iQ11 == 2) {
                                    ekaVarF9 = qa.F(emzVar, egyVar, false);
                                } else if (iQ11 == 3) {
                                    emzVar.f();
                                } else if (iQ11 == 4) {
                                    int iB6 = emzVar.b();
                                    if (iB6 == 1) {
                                        i8 = 1;
                                    } else {
                                        if (iB6 != 2) {
                                            throw new IllegalArgumentException(a.bR(iB6, "Unknown trim path type "));
                                        }
                                        i8 = 2;
                                    }
                                } else if (iQ11 != 5) {
                                    emzVar.m();
                                } else {
                                    zO10 = emzVar.o();
                                }
                            }
                            ektVar = new elc(i8, ekaVarF8, ekaVarF, ekaVarF9, zO10);
                        }
                    } else if (strF.equals("st")) {
                        boy boyVar9 = emu.a;
                        ArrayList arrayList3 = new ArrayList();
                        int i9 = 0;
                        int i10 = 0;
                        boolean zO11 = false;
                        ekc ekcVar4 = null;
                        String strF10 = null;
                        eka ekaVar2 = null;
                        ejz ejzVar2 = null;
                        eka ekaVarF10 = null;
                        float fA2 = 0.0f;
                        while (emzVar.n()) {
                            switch (emzVar.q(emu.a)) {
                                case 0:
                                    strF10 = emzVar.f();
                                    break;
                                case 1:
                                    ejzVar2 = new ejz(emi.a(emzVar, egyVar, 1.0f, ema.b, false));
                                    break;
                                case 2:
                                    ekaVarF10 = qa.F(emzVar, egyVar, true);
                                    break;
                                case 3:
                                    ekcVar4 = new ekc(emi.a(emzVar, egyVar, 1.0f, ema.c, false));
                                    break;
                                case 4:
                                    i9 = afxw.p()[emzVar.b() - 1];
                                    break;
                                case 5:
                                    i10 = afxw.p()[emzVar.b() - 1];
                                    break;
                                case 6:
                                    fA2 = (float) emzVar.a();
                                    break;
                                case 7:
                                    zO11 = emzVar.o();
                                    break;
                                case 8:
                                    emzVar.g();
                                    while (emzVar.n()) {
                                        emzVar.h();
                                        String strF11 = null;
                                        eka ekaVarF11 = null;
                                        while (emzVar.n()) {
                                            int iQ12 = emzVar.q(emu.b);
                                            if (iQ12 == 0) {
                                                strF11 = emzVar.f();
                                            } else if (iQ12 != 1) {
                                                emzVar.l();
                                                emzVar.m();
                                            } else {
                                                ekaVarF11 = qa.F(emzVar, egyVar, true);
                                            }
                                        }
                                        emzVar.j();
                                        int iHashCode2 = strF11.hashCode();
                                        int i11 = i2;
                                        if (iHashCode2 != i2) {
                                            if (iHashCode2 != 103) {
                                                if (iHashCode2 == 111 && strF11.equals("o")) {
                                                    ekaVar2 = ekaVarF11;
                                                }
                                            } else if (strF11.equals("g")) {
                                                egyVar.g();
                                                arrayList3.add(ekaVarF11);
                                            }
                                        } else if (strF11.equals("d")) {
                                            egyVar.g();
                                            arrayList3.add(ekaVarF11);
                                        }
                                        i2 = i11;
                                    }
                                    int i12 = i2;
                                    emzVar.i();
                                    if (arrayList3.size() == 1) {
                                        arrayList3.add((eka) arrayList3.get(0));
                                    }
                                    i2 = i12;
                                    break;
                                default:
                                    emzVar.m();
                                    break;
                            }
                        }
                        int i13 = i2;
                        if (ekcVar4 == null) {
                            ekcVar4 = new ekc(Collections.singletonList(new enn(Integer.valueOf(i13))));
                        }
                        ekyVar = new elb(strF10, ekaVar2, arrayList3, ejzVar2, ekcVar4, ekaVarF10, i9 == 0 ? 1 : i9, i10 == 0 ? 1 : i10, fA2, zO11);
                        ektVar = ekyVar;
                    }
                } else {
                    ekaVarF = null;
                    if (strF.equals("sr")) {
                        boolean z = iB == 3;
                        boy boyVar10 = emm.a;
                        boolean z2 = z;
                        int i14 = 0;
                        boolean zO12 = false;
                        String strF12 = null;
                        eka ekaVarF12 = null;
                        ekk ekkVarB2 = null;
                        eka ekaVarF13 = null;
                        eka ekaVarF14 = null;
                        eka ekaVarF15 = null;
                        eka ekaVarF16 = null;
                        eka ekaVarF17 = null;
                        while (emzVar.n()) {
                            switch (emzVar.q(emm.a)) {
                                case 0:
                                    strF12 = emzVar.f();
                                    break;
                                case 1:
                                    int iB7 = emzVar.b();
                                    int[] iArr = {1, 2};
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= 2) {
                                            i14 = 0;
                                        }
                                        int i16 = iArr[i15];
                                        if (i16 == 0) {
                                            throw null;
                                        }
                                        if (i16 == iB7) {
                                            i14 = i16;
                                        }
                                        i15++;
                                        break;
                                        break;
                                    }
                                    break;
                                case 2:
                                    ekaVarF12 = qa.F(emzVar, egyVar, false);
                                    break;
                                case 3:
                                    ekkVarB2 = els.b(emzVar, egyVar);
                                    break;
                                case 4:
                                    ekaVarF13 = qa.F(emzVar, egyVar, false);
                                    break;
                                case 5:
                                    ekaVarF15 = qa.F(emzVar, egyVar, true);
                                    break;
                                case 6:
                                    ekaVarF17 = qa.F(emzVar, egyVar, false);
                                    break;
                                case 7:
                                    ekaVarF14 = qa.F(emzVar, egyVar, true);
                                    break;
                                case 8:
                                    ekaVarF16 = qa.F(emzVar, egyVar, false);
                                    break;
                                case 9:
                                    zO12 = emzVar.o();
                                    break;
                                case 10:
                                    z2 = emzVar.b() == 3;
                                    break;
                                default:
                                    emzVar.l();
                                    emzVar.m();
                                    break;
                            }
                        }
                        ektVar = new ekt(strF12, i14, ekaVarF12, ekkVarB2, ekaVarF13, ekaVarF14, ekaVarF15, ekaVarF16, ekaVarF17, zO12, z2);
                    }
                }
                ?? r5 = ekaVarF;
                ((end) ene.a).a("Unknown shape type ".concat(strF), r5);
                ektVar = r5;
            } else {
                ekaVarF = null;
                if (strF.equals("mm")) {
                    boy boyVar11 = eml.a;
                    boolean zO13 = false;
                    while (emzVar.n()) {
                        int iQ13 = emzVar.q(eml.a);
                        if (iQ13 == 0) {
                            emzVar.f();
                        } else if (iQ13 == 1) {
                            int iB8 = emzVar.b();
                            if (iB8 != 1) {
                                if (iB8 == 2) {
                                    i = 2;
                                } else if (iB8 == 3) {
                                    i = 3;
                                } else if (iB8 == 4) {
                                    i = 4;
                                } else if (iB8 == 5) {
                                    i = 5;
                                }
                            }
                            i = 1;
                        } else if (iQ13 != 2) {
                            emzVar.l();
                            emzVar.m();
                        } else {
                            zO13 = emzVar.o();
                        }
                    }
                    eks eksVar = new eks(i, zO13);
                    egyVar.e("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                    ektVar = eksVar;
                } else {
                    ?? r6 = ekaVarF;
                    ((end) ene.a).a("Unknown shape type ".concat(strF), r6);
                    ektVar = r6;
                }
            }
        } else {
            ekaVarF = null;
            if (strF.equals("el")) {
                boolean z3 = iB == 3;
                boy boyVar12 = elw.a;
                boolean z4 = z3;
                String strF13 = null;
                ekk ekkVarB3 = null;
                eke ekeVarI6 = null;
                boolean zO14 = false;
                while (emzVar.n()) {
                    int iQ14 = emzVar.q(elw.a);
                    if (iQ14 == 0) {
                        strF13 = emzVar.f();
                    } else if (iQ14 == 1) {
                        ekkVarB3 = els.b(emzVar, egyVar);
                    } else if (iQ14 == 2) {
                        ekeVarI6 = qa.I(emzVar, egyVar);
                    } else if (iQ14 == 3) {
                        zO14 = emzVar.o();
                    } else if (iQ14 != 4) {
                        emzVar.l();
                        emzVar.m();
                    } else {
                        z4 = emzVar.b() == 3;
                    }
                }
                ekmVar = new ekm(strF13, ekkVarB3, ekeVarI6, z4, zO14);
                ektVar = ekmVar;
            } else {
                ?? r7 = ekaVarF;
                ((end) ene.a).a("Unknown shape type ".concat(strF), r7);
                ektVar = r7;
            }
        }
        while (emzVar.n()) {
            emzVar.m();
        }
        emzVar.j();
        return ektVar;
    }
}
