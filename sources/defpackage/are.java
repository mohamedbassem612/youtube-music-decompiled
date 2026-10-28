package defpackage;

import app.rive.semantics.SemanticState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class are extends ark {
    public int ar;
    public int as;
    public int b;
    public final xsc aH = new xsc(this);
    public final aro a = new aro(this);
    public asc aG = null;
    public boolean c = false;
    public final aqu d = new aqu();
    public int at = 0;
    public int au = 0;
    public arb[] av = new arb[4];
    public arb[] aw = new arb[4];
    public int ax = 257;
    public boolean ay = false;
    public boolean az = false;
    public WeakReference aA = null;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    final HashSet aE = new HashSet();
    public final arl aF = new arl();

    public static void X(ard ardVar, asc ascVar, arl arlVar) {
        int i;
        int i2;
        if (ascVar != null) {
            if (ardVar.ah == 8 || (ardVar instanceof arg) || (ardVar instanceof ara)) {
                arlVar.c = 0;
                arlVar.d = 0;
                return;
            }
            arlVar.i = ardVar.M();
            arlVar.j = ardVar.N();
            arlVar.a = ardVar.j();
            arlVar.b = ardVar.h();
            arlVar.g = false;
            arlVar.h = 0;
            boolean z = arlVar.i == 3;
            boolean z2 = arlVar.j == 3;
            boolean z3 = z && ardVar.X > 0.0f;
            boolean z4 = z2 && ardVar.X > 0.0f;
            if (z && ardVar.F(0) && ardVar.s == 0 && !z3) {
                arlVar.i = 2;
                if (z2 && ardVar.t == 0) {
                    arlVar.i = 1;
                }
                z = false;
            }
            if (z2 && ardVar.F(1) && ardVar.t == 0 && !z4) {
                arlVar.j = 2;
                if (z && ardVar.s == 0) {
                    arlVar.j = 1;
                }
                z2 = false;
            }
            if (ardVar.e()) {
                arlVar.i = 1;
                z = false;
            }
            if (ardVar.f()) {
                arlVar.j = 1;
                z2 = false;
            }
            if (z3) {
                if (ardVar.u[0] == 4) {
                    arlVar.i = 1;
                } else if (!z2) {
                    if (arlVar.j == 1) {
                        i2 = arlVar.b;
                    } else {
                        arlVar.i = 2;
                        ascVar.a(ardVar, arlVar);
                        i2 = arlVar.d;
                    }
                    arlVar.i = 1;
                    arlVar.a = (int) (ardVar.X * i2);
                }
            }
            if (z4) {
                if (ardVar.u[1] == 4) {
                    arlVar.j = 1;
                } else if (!z) {
                    if (arlVar.i == 1) {
                        i = arlVar.a;
                    } else {
                        arlVar.j = 2;
                        ascVar.a(ardVar, arlVar);
                        i = arlVar.c;
                    }
                    arlVar.j = 1;
                    float f = i;
                    if (ardVar.Y == -1) {
                        arlVar.b = (int) (f / ardVar.X);
                    } else {
                        arlVar.b = (int) (ardVar.X * f);
                    }
                }
            }
            ascVar.a(ardVar, arlVar);
            ardVar.C(arlVar.c);
            ardVar.x(arlVar.d);
            ardVar.F = arlVar.f;
            ardVar.u(arlVar.e);
            arlVar.h = 0;
            boolean z5 = arlVar.g;
        }
    }

    private final void Z(arc arcVar, aqy aqyVar) {
        aqu aquVar = this.d;
        aquVar.g(aqyVar, aquVar.b(arcVar), 0, 5);
    }

    private final void aa(arc arcVar, aqy aqyVar) {
        aqu aquVar = this.d;
        aquVar.g(aquVar.b(arcVar), aqyVar, 0, 5);
    }

    private final void ab() {
        this.at = 0;
        this.au = 0;
    }

    @Override // defpackage.ard
    public final void D(boolean z, boolean z2) {
        super.D(z, z2);
        int size = this.aI.size();
        for (int i = 0; i < size; i++) {
            ((ard) this.aI.get(i)).D(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0241  */
    /* JADX WARN: Code duplicated, block: B:144:0x024c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0281  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02da  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:183:0x0304  */
    /* JADX WARN: Code duplicated, block: B:186:0x030e  */
    /* JADX WARN: Code duplicated, block: B:196:0x032a  */
    /* JADX WARN: Code duplicated, block: B:213:0x036f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0376 A[LOOP:27: B:214:0x0374->B:215:0x0376, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x0386  */
    /* JADX WARN: Code duplicated, block: B:219:0x038d A[LOOP:28: B:218:0x038b->B:219:0x038d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:225:0x03b5 A[LOOP:29: B:223:0x03af->B:225:0x03b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:231:0x03d6 A[LOOP:30: B:229:0x03d0->B:231:0x03d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:237:0x03f7 A[LOOP:31: B:235:0x03f1->B:237:0x03f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x0409  */
    /* JADX WARN: Code duplicated, block: B:242:0x0410 A[LOOP:32: B:241:0x040e->B:242:0x0410, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:244:0x0420  */
    /* JADX WARN: Code duplicated, block: B:246:0x0427 A[LOOP:33: B:245:0x0425->B:246:0x0427, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:248:0x0437  */
    /* JADX WARN: Code duplicated, block: B:250:0x043e A[LOOP:34: B:249:0x043c->B:250:0x043e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x045c  */
    /* JADX WARN: Code duplicated, block: B:256:0x0466 A[LOOP:35: B:254:0x0460->B:256:0x0466, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x047d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0487 A[LOOP:36: B:260:0x0481->B:262:0x0487, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x049e  */
    /* JADX WARN: Code duplicated, block: B:268:0x04a8 A[LOOP:37: B:266:0x04a2->B:268:0x04a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x04be  */
    /* JADX WARN: Code duplicated, block: B:274:0x04c8 A[LOOP:38: B:272:0x04c2->B:274:0x04c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:277:0x04da  */
    /* JADX WARN: Code duplicated, block: B:279:0x04e1 A[LOOP:39: B:278:0x04df->B:279:0x04e1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:293:0x0529  */
    /* JADX WARN: Code duplicated, block: B:295:0x0530  */
    /* JADX WARN: Code duplicated, block: B:297:0x0539  */
    /* JADX WARN: Code duplicated, block: B:299:0x0543  */
    /* JADX WARN: Code duplicated, block: B:301:0x054c  */
    /* JADX WARN: Code duplicated, block: B:303:0x054f  */
    /* JADX WARN: Code duplicated, block: B:306:0x0556  */
    /* JADX WARN: Code duplicated, block: B:307:0x055e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0566  */
    /* JADX WARN: Code duplicated, block: B:312:0x056f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0579  */
    /* JADX WARN: Code duplicated, block: B:316:0x0582  */
    /* JADX WARN: Code duplicated, block: B:318:0x0585  */
    /* JADX WARN: Code duplicated, block: B:321:0x058b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0593  */
    /* JADX WARN: Code duplicated, block: B:328:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:333:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:334:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:336:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:341:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:342:0x05de  */
    /* JADX WARN: Code duplicated, block: B:344:0x05e7 A[PHI: r4
      0x05e7: PHI (r4v1 int) = (r4v0 int), (r4v37 int) binds: [B:136:0x0230, B:141:0x023f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:519:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:521:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:524:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:528:0x0908 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:533:0x0915 A[LOOP:14: B:532:0x0913->B:533:0x0915, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:536:0x0946  */
    /* JADX WARN: Code duplicated, block: B:540:0x095a  */
    /* JADX WARN: Code duplicated, block: B:545:0x097c  */
    /* JADX WARN: Code duplicated, block: B:546:0x098a  */
    /* JADX WARN: Code duplicated, block: B:549:0x099d  */
    /* JADX WARN: Code duplicated, block: B:550:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:552:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:554:0x09b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:557:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:560:0x09ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:565:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:566:0x09df  */
    /* JADX WARN: Code duplicated, block: B:668:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // defpackage.ark
    public final void T() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean zW;
        int size;
        int i6;
        boolean z3;
        int iMax;
        ?? r5;
        boolean z4;
        int iMax2;
        ?? r0;
        int i7;
        ?? r4;
        ?? r1;
        int i8;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        ard ardVar;
        boolean z5;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList;
        ara araVar;
        boolean z6;
        asc ascVar;
        ArrayList arrayList2;
        int size2;
        int i12;
        ArrayList arrayList3;
        int i13;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList9;
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        arw arwVar;
        int i17;
        HashSet hashSet4;
        HashSet hashSet5;
        HashSet hashSet6;
        HashSet hashSet7;
        arw arwVar2;
        int i18;
        int i19;
        int i20;
        arw arwVar3;
        arw arwVar4;
        char c;
        int iJ;
        int iH;
        int size3;
        int i21;
        int i22;
        arw arwVar5;
        int iA;
        int size4;
        int i23;
        int i24;
        arw arwVar6;
        int iA2;
        int[] iArr;
        int size5;
        int i25;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        int size6;
        int i26;
        int size7;
        int i27;
        int size8;
        int i28;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        int size9;
        int i29;
        int size10;
        int i30;
        ard ardVar2;
        boolean z7;
        ara araVar2;
        arg argVar;
        ard ardVar3;
        boolean z8;
        boolean z9;
        this.Z = 0;
        this.aa = 0;
        this.ay = false;
        this.az = false;
        int size11 = this.aI.size();
        int iMax7 = Math.max(0, j());
        int iMax8 = Math.max(0, h());
        int[] iArr2 = this.aq;
        int i31 = iArr2[1];
        int i32 = iArr2[0];
        int i33 = -1;
        if (this.b == 0 && ari.b(this.ax, 1)) {
            asc ascVar2 = this.aG;
            int iM = M();
            int iN = N();
            arr.b = 0;
            arr.c = 0;
            t();
            ArrayList arrayList10 = this.aI;
            int size12 = arrayList10.size();
            for (int i34 = 0; i34 < size12; i34++) {
                ((ard) arrayList10.get(i34)).t();
            }
            boolean z10 = this.c;
            if (iM == 1) {
                v(0, j());
            } else {
                this.J.e(0);
                this.Z = 0;
            }
            int i35 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i35 < size12) {
                ard ardVar4 = (ard) arrayList10.get(i35);
                if (ardVar4 instanceof arg) {
                    arg argVar2 = (arg) ardVar4;
                    if (argVar2.ar == 1) {
                        int i36 = argVar2.b;
                        if (i36 != i33) {
                            argVar2.a(i36);
                        } else if (argVar2.c != i33 && e()) {
                            argVar2.a(j() - argVar2.c);
                        } else if (e()) {
                            argVar2.a((int) ((argVar2.a * j()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else if ((ardVar4 instanceof ara) && ((ara) ardVar4).a() == 0) {
                    z12 = true;
                }
                i35++;
                i33 = -1;
                z11 = z11;
                z12 = z12;
            }
            if (z11) {
                for (int i37 = 0; i37 < size12; i37++) {
                    ard ardVar5 = (ard) arrayList10.get(i37);
                    if (ardVar5 instanceof arg) {
                        arg argVar3 = (arg) ardVar5;
                        if (argVar3.ar == 1) {
                            arr.a(0, argVar3, ascVar2, z10);
                        }
                    }
                }
            }
            int i38 = 0;
            arr.a(0, this, ascVar2, z10);
            if (z12) {
                for (int i39 = 0; i39 < size12; i39++) {
                    ard ardVar6 = (ard) arrayList10.get(i39);
                    if (ardVar6 instanceof ara) {
                        ara araVar3 = (ara) ardVar6;
                        if (araVar3.a() == 0) {
                            arr.d(araVar3, ascVar2, 0, z10);
                        }
                    }
                }
            }
            if (iN == 1) {
                w(0, h());
                z8 = false;
                z9 = false;
            } else {
                this.K.e(0);
                this.aa = 0;
                z8 = false;
                z9 = false;
                i38 = 0;
            }
            while (i38 < size12) {
                ard ardVar7 = (ard) arrayList10.get(i38);
                if (ardVar7 instanceof arg) {
                    arg argVar4 = (arg) ardVar7;
                    if (argVar4.ar == 0) {
                        int i40 = argVar4.b;
                        if (i40 != -1) {
                            argVar4.a(i40);
                        } else if (argVar4.c != -1 && f()) {
                            argVar4.a(h() - argVar4.c);
                        } else if (f()) {
                            argVar4.a((int) ((argVar4.a * h()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else if ((ardVar7 instanceof ara) && ((ara) ardVar7).a() == 1) {
                    z9 = true;
                }
                i38++;
            }
            if (z8) {
                for (int i41 = 0; i41 < size12; i41++) {
                    ard ardVar8 = (ard) arrayList10.get(i41);
                    if (ardVar8 instanceof arg) {
                        arg argVar5 = (arg) ardVar8;
                        if (argVar5.ar == 0) {
                            arr.b(1, argVar5, ascVar2);
                        }
                    }
                }
            }
            arr.b(0, this, ascVar2);
            if (z9) {
                for (int i42 = 0; i42 < size12; i42++) {
                    ard ardVar9 = (ard) arrayList10.get(i42);
                    if (ardVar9 instanceof ara) {
                        ara araVar4 = (ara) ardVar9;
                        if (araVar4.a() == 1) {
                            arr.d(araVar4, ascVar2, 1, z10);
                        }
                    }
                }
            }
            for (int i43 = 0; i43 < size12; i43++) {
                ard ardVar10 = (ard) arrayList10.get(i43);
                if (ardVar10.J() && arr.c(ardVar10)) {
                    X(ardVar10, ascVar2, arr.a);
                    if (!(ardVar10 instanceof arg)) {
                        arr.a(0, ardVar10, ascVar2, z10);
                        arr.b(0, ardVar10, ascVar2);
                    } else if (((arg) ardVar10).ar == 0) {
                        arr.b(0, ardVar10, ascVar2);
                    } else {
                        arr.a(0, ardVar10, ascVar2, z10);
                    }
                }
            }
            for (int i44 = 0; i44 < size11; i44++) {
                ard ardVar11 = (ard) this.aI.get(i44);
                if (ardVar11.J() && !(ardVar11 instanceof arg) && !(ardVar11 instanceof ara) && !(ardVar11 instanceof arj)) {
                    boolean z13 = ardVar11.G;
                    int iL = ardVar11.L(0);
                    int iL2 = ardVar11.L(1);
                    if (iL != 3 || ardVar11.s == 1 || iL2 != 3 || ardVar11.t == 1) {
                        X(ardVar11, this.aG, new arl());
                    }
                }
            }
        }
        if (size11 <= 2) {
            i = size11;
            i2 = iMax7;
            i3 = i31;
            i4 = iMax8;
            z = false;
            break;
        }
        if (i32 == 2) {
            if (ari.b(this.ax, SemanticState.ReadOnly)) {
                ascVar = this.aG;
                arrayList2 = this.aI;
                size2 = arrayList2.size();
                i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        ardVar3 = (ard) arrayList2.get(i12);
                        if (zi.e(M(), N(), ardVar3.M(), ardVar3.N()) || (ardVar3 instanceof arf)) {
                            i2 = iMax7;
                            i32 = i32;
                            i3 = i31;
                            i = size11;
                            z = false;
                            i4 = iMax8;
                            break;
                        }
                        i12++;
                    } else {
                        arrayList3 = null;
                        i13 = 0;
                        arrayList4 = null;
                        arrayList5 = null;
                        arrayList6 = null;
                        arrayList7 = null;
                        arrayList8 = null;
                        while (i13 < size2) {
                            int i45 = i13;
                            ardVar2 = (ard) arrayList2.get(i13);
                            int i46 = size11;
                            int i47 = iMax8;
                            int i48 = i31;
                            int i49 = iMax7;
                            if (!zi.e(M(), N(), ardVar2.M(), ardVar2.N())) {
                                X(ardVar2, ascVar, this.aF);
                            }
                            z7 = ardVar2 instanceof arg;
                            if (z7) {
                                argVar = (arg) ardVar2;
                                if (argVar.ar == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(argVar);
                                }
                                if (argVar.ar == 1) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(argVar);
                                }
                            }
                            if (ardVar2 instanceof arh) {
                                if (ardVar2 instanceof ara) {
                                    araVar2 = (ara) ardVar2;
                                    if (araVar2.a() == 0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(araVar2);
                                    }
                                    if (araVar2.a() == 1) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(araVar2);
                                    }
                                } else {
                                    arh arhVar = (arh) ardVar2;
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(arhVar);
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(arhVar);
                                }
                            }
                            if (ardVar2.J.e == null && ardVar2.L.e == null && !z7 && !(ardVar2 instanceof ara)) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(ardVar2);
                            }
                            if (ardVar2.K.e != null && ardVar2.M.e == null && ardVar2.N.e == null && !z7 && !(ardVar2 instanceof ara)) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(ardVar2);
                            }
                            i13 = i45 + 1;
                            size11 = i46;
                            iMax8 = i47;
                            i31 = i48;
                            iMax7 = i49;
                        }
                        i14 = iMax7;
                        i15 = iMax8;
                        i16 = i31;
                        i = size11;
                        arrayList9 = new ArrayList();
                        if (arrayList3 != null) {
                            size10 = arrayList3.size();
                            while (i30 < size10) {
                                zi.c((arg) arrayList3.get(i30), 0, arrayList9, null);
                            }
                        }
                        if (arrayList4 != null) {
                            size9 = arrayList4.size();
                            while (i29 < size9) {
                                arh arhVar2 = (arh) arrayList4.get(i29);
                                arw arwVarC = zi.c(arhVar2, 0, arrayList9, null);
                                arhVar2.T(arrayList9, 0, arwVarC);
                                arwVarC.b(arrayList9);
                            }
                        }
                        hashSet = K(2).a;
                        if (hashSet != null) {
                            it7 = hashSet.iterator();
                            while (it7.hasNext()) {
                                zi.c(((arc) it7.next()).d, 0, arrayList9, null);
                            }
                        }
                        hashSet2 = K(4).a;
                        if (hashSet2 != null) {
                            it6 = hashSet2.iterator();
                            while (it6.hasNext()) {
                                zi.c(((arc) it6.next()).d, 0, arrayList9, null);
                            }
                        }
                        hashSet3 = K(7).a;
                        if (hashSet3 != null) {
                            it5 = hashSet3.iterator();
                            while (it5.hasNext()) {
                                zi.c(((arc) it5.next()).d, 0, arrayList9, null);
                            }
                        }
                        arwVar = null;
                        i17 = 0;
                        if (arrayList7 != null) {
                            size8 = arrayList7.size();
                            i28 = 0;
                            while (i28 < size8) {
                                zi.c((ard) arrayList7.get(i28), i17, arrayList9, arwVar);
                                i28++;
                                arwVar = null;
                                i17 = 0;
                            }
                        }
                        if (arrayList5 != null) {
                            size7 = arrayList5.size();
                            while (i27 < size7) {
                                zi.c((arg) arrayList5.get(i27), 1, arrayList9, null);
                            }
                        }
                        if (arrayList6 != null) {
                            size6 = arrayList6.size();
                            while (i26 < size6) {
                                arh arhVar3 = (arh) arrayList6.get(i26);
                                arw arwVarC2 = zi.c(arhVar3, 1, arrayList9, null);
                                arhVar3.T(arrayList9, 1, arwVarC2);
                                arwVarC2.b(arrayList9);
                            }
                        }
                        hashSet4 = K(3).a;
                        if (hashSet4 != null) {
                            it4 = hashSet4.iterator();
                            while (it4.hasNext()) {
                                zi.c(((arc) it4.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet5 = K(6).a;
                        if (hashSet5 != null) {
                            it3 = hashSet5.iterator();
                            while (it3.hasNext()) {
                                zi.c(((arc) it3.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet6 = K(5).a;
                        if (hashSet6 != null) {
                            it2 = hashSet6.iterator();
                            while (it2.hasNext()) {
                                zi.c(((arc) it2.next()).d, 1, arrayList9, null);
                            }
                        }
                        hashSet7 = K(7).a;
                        if (hashSet7 != null) {
                            it = hashSet7.iterator();
                            while (it.hasNext()) {
                                zi.c(((arc) it.next()).d, 1, arrayList9, null);
                            }
                        }
                        arwVar2 = null;
                        i18 = 1;
                        if (arrayList8 != null) {
                            size5 = arrayList8.size();
                            i25 = 0;
                            while (i25 < size5) {
                                zi.c((ard) arrayList8.get(i25), i18, arrayList9, arwVar2);
                                i25++;
                                arwVar2 = null;
                                i18 = 1;
                            }
                        }
                        while (i19 < size2) {
                            ard ardVar12 = (ard) arrayList2.get(i19);
                            iArr = ardVar12.aq;
                            if (iArr[0] != 3 && iArr[1] == 3) {
                                arw arwVarD = zi.d(arrayList9, ardVar12.ao);
                                arw arwVarD2 = zi.d(arrayList9, ardVar12.ap);
                                if (arwVarD != null && arwVarD2 != null) {
                                    arwVarD.c(0, arwVarD2);
                                    arwVarD2.d = 2;
                                    arrayList9.remove(arwVarD);
                                }
                            }
                        }
                        i20 = 1;
                        if (arrayList9.size() > 1) {
                            if (M() == 2) {
                                size4 = arrayList9.size();
                                arwVar3 = null;
                                i23 = 0;
                                i24 = 0;
                                while (i23 < size4) {
                                    arwVar6 = (arw) arrayList9.get(i23);
                                    if (arwVar6.d == i20) {
                                        iA2 = arwVar6.a(this.d, 0);
                                        if (iA2 > i24) {
                                            arwVar3 = arwVar6;
                                        }
                                        if (iA2 > i24) {
                                            i24 = iA2;
                                        }
                                    }
                                    i23++;
                                    i20 = 1;
                                }
                                if (arwVar3 != null) {
                                    P(1);
                                    C(i24);
                                } else {
                                    arwVar3 = null;
                                }
                            } else {
                                arwVar3 = null;
                            }
                            if (N() == 2) {
                                size3 = arrayList9.size();
                                arwVar4 = null;
                                i22 = 0;
                                while (i21 < size3) {
                                    arwVar5 = (arw) arrayList9.get(i21);
                                    if (arwVar5.d == 0) {
                                        iA = arwVar5.a(this.d, 1);
                                        if (iA > i22) {
                                            arwVar4 = arwVar5;
                                        }
                                        if (iA > i22) {
                                            i22 = iA;
                                        }
                                    }
                                }
                                if (arwVar4 != null) {
                                    Q(1);
                                    x(i22);
                                } else {
                                    arwVar4 = null;
                                }
                            } else {
                                arwVar4 = null;
                            }
                            if (arwVar3 == null || arwVar4 != null) {
                                c = 2;
                                if (i32 == 2) {
                                    if (i14 < j() || i14 <= 0) {
                                        iJ = j();
                                    } else {
                                        C(i14);
                                        this.ay = true;
                                        iJ = i14;
                                    }
                                    i32 = 2;
                                    c = 2;
                                } else {
                                    iJ = i14;
                                }
                                if (i16 == c) {
                                    if (i15 < h() || i15 <= 0) {
                                        iH = h();
                                    } else {
                                        x(i15);
                                        this.az = true;
                                        iH = i15;
                                    }
                                    i16 = 2;
                                } else {
                                    iH = i15;
                                }
                                i2 = iJ;
                                i4 = iH;
                                i32 = i32;
                                i3 = i16;
                                z = true;
                                break;
                            }
                        }
                        i4 = i15;
                        i3 = i16;
                        i2 = i14;
                    }
                }
            } else {
                i = size11;
                i2 = iMax7;
                i3 = i31;
                i4 = iMax8;
            }
            z = false;
            break;
        } else {
            if (i31 != 2) {
                i2 = iMax7;
                i32 = i32;
                i3 = i31;
                i = size11;
                z = false;
                i4 = iMax8;
                break;
            }
            i31 = 2;
            if (ari.b(this.ax, SemanticState.ReadOnly)) {
                ascVar = this.aG;
                arrayList2 = this.aI;
                size2 = arrayList2.size();
                i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        ardVar3 = (ard) arrayList2.get(i12);
                        if (zi.e(M(), N(), ardVar3.M(), ardVar3.N())) {
                        }
                        i2 = iMax7;
                        i32 = i32;
                        i3 = i31;
                        i = size11;
                        z = false;
                        i4 = iMax8;
                        break;
                    }
                    arrayList3 = null;
                    i13 = 0;
                    arrayList4 = null;
                    arrayList5 = null;
                    arrayList6 = null;
                    arrayList7 = null;
                    arrayList8 = null;
                    while (i13 < size2) {
                        int i410 = i13;
                        ardVar2 = (ard) arrayList2.get(i13);
                        int i411 = size11;
                        int i412 = iMax8;
                        int i413 = i31;
                        int i414 = iMax7;
                        if (!zi.e(M(), N(), ardVar2.M(), ardVar2.N())) {
                            X(ardVar2, ascVar, this.aF);
                        }
                        z7 = ardVar2 instanceof arg;
                        if (z7) {
                            argVar = (arg) ardVar2;
                            if (argVar.ar == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(argVar);
                            }
                            if (argVar.ar == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(argVar);
                            }
                        }
                        if (ardVar2 instanceof arh) {
                            if (ardVar2 instanceof ara) {
                                araVar2 = (ara) ardVar2;
                                if (araVar2.a() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(araVar2);
                                }
                                if (araVar2.a() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(araVar2);
                                }
                            } else {
                                arh arhVar4 = (arh) ardVar2;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(arhVar4);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(arhVar4);
                            }
                        }
                        if (ardVar2.J.e == null) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(ardVar2);
                        }
                        if (ardVar2.K.e != null) {
                        }
                        i13 = i410 + 1;
                        size11 = i411;
                        iMax8 = i412;
                        i31 = i413;
                        iMax7 = i414;
                    }
                    i14 = iMax7;
                    i15 = iMax8;
                    i16 = i31;
                    i = size11;
                    arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        size10 = arrayList3.size();
                        for (i30 = 0; i30 < size10; i30++) {
                            zi.c((arg) arrayList3.get(i30), 0, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        size9 = arrayList4.size();
                        for (i29 = 0; i29 < size9; i29++) {
                            arh arhVar5 = (arh) arrayList4.get(i29);
                            arw arwVarC3 = zi.c(arhVar5, 0, arrayList9, null);
                            arhVar5.T(arrayList9, 0, arwVarC3);
                            arwVarC3.b(arrayList9);
                        }
                    }
                    hashSet = K(2).a;
                    if (hashSet != null) {
                        it7 = hashSet.iterator();
                        while (it7.hasNext()) {
                            zi.c(((arc) it7.next()).d, 0, arrayList9, null);
                        }
                    }
                    hashSet2 = K(4).a;
                    if (hashSet2 != null) {
                        it6 = hashSet2.iterator();
                        while (it6.hasNext()) {
                            zi.c(((arc) it6.next()).d, 0, arrayList9, null);
                        }
                    }
                    hashSet3 = K(7).a;
                    if (hashSet3 != null) {
                        it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            zi.c(((arc) it5.next()).d, 0, arrayList9, null);
                        }
                    }
                    arwVar = null;
                    i17 = 0;
                    if (arrayList7 != null) {
                        size8 = arrayList7.size();
                        i28 = 0;
                        while (i28 < size8) {
                            zi.c((ard) arrayList7.get(i28), i17, arrayList9, arwVar);
                            i28++;
                            arwVar = null;
                            i17 = 0;
                        }
                    }
                    if (arrayList5 != null) {
                        size7 = arrayList5.size();
                        for (i27 = 0; i27 < size7; i27++) {
                            zi.c((arg) arrayList5.get(i27), 1, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        size6 = arrayList6.size();
                        for (i26 = 0; i26 < size6; i26++) {
                            arh arhVar6 = (arh) arrayList6.get(i26);
                            arw arwVarC4 = zi.c(arhVar6, 1, arrayList9, null);
                            arhVar6.T(arrayList9, 1, arwVarC4);
                            arwVarC4.b(arrayList9);
                        }
                    }
                    hashSet4 = K(3).a;
                    if (hashSet4 != null) {
                        it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            zi.c(((arc) it4.next()).d, 1, arrayList9, null);
                        }
                    }
                    hashSet5 = K(6).a;
                    if (hashSet5 != null) {
                        it3 = hashSet5.iterator();
                        while (it3.hasNext()) {
                            zi.c(((arc) it3.next()).d, 1, arrayList9, null);
                        }
                    }
                    hashSet6 = K(5).a;
                    if (hashSet6 != null) {
                        it2 = hashSet6.iterator();
                        while (it2.hasNext()) {
                            zi.c(((arc) it2.next()).d, 1, arrayList9, null);
                        }
                    }
                    hashSet7 = K(7).a;
                    if (hashSet7 != null) {
                        it = hashSet7.iterator();
                        while (it.hasNext()) {
                            zi.c(((arc) it.next()).d, 1, arrayList9, null);
                        }
                    }
                    arwVar2 = null;
                    i18 = 1;
                    if (arrayList8 != null) {
                        size5 = arrayList8.size();
                        i25 = 0;
                        while (i25 < size5) {
                            zi.c((ard) arrayList8.get(i25), i18, arrayList9, arwVar2);
                            i25++;
                            arwVar2 = null;
                            i18 = 1;
                        }
                    }
                    for (i19 = 0; i19 < size2; i19++) {
                        ard ardVar13 = (ard) arrayList2.get(i19);
                        iArr = ardVar13.aq;
                        if (iArr[0] != 3) {
                        }
                    }
                    i20 = 1;
                    if (arrayList9.size() > 1) {
                        if (M() == 2) {
                            size4 = arrayList9.size();
                            arwVar3 = null;
                            i23 = 0;
                            i24 = 0;
                            while (i23 < size4) {
                                arwVar6 = (arw) arrayList9.get(i23);
                                if (arwVar6.d == i20) {
                                    iA2 = arwVar6.a(this.d, 0);
                                    if (iA2 > i24) {
                                        arwVar3 = arwVar6;
                                    }
                                    if (iA2 > i24) {
                                        i24 = iA2;
                                    }
                                }
                                i23++;
                                i20 = 1;
                            }
                            if (arwVar3 != null) {
                                P(1);
                                C(i24);
                            } else {
                                arwVar3 = null;
                            }
                        } else {
                            arwVar3 = null;
                        }
                        if (N() == 2) {
                            size3 = arrayList9.size();
                            arwVar4 = null;
                            i22 = 0;
                            for (i21 = 0; i21 < size3; i21++) {
                                arwVar5 = (arw) arrayList9.get(i21);
                                if (arwVar5.d == 0) {
                                    iA = arwVar5.a(this.d, 1);
                                    if (iA > i22) {
                                        arwVar4 = arwVar5;
                                    }
                                    if (iA > i22) {
                                        i22 = iA;
                                    }
                                }
                            }
                            if (arwVar4 != null) {
                                Q(1);
                                x(i22);
                            } else {
                                arwVar4 = null;
                            }
                        } else {
                            arwVar4 = null;
                        }
                        if (arwVar3 == null) {
                        }
                        c = 2;
                        if (i32 == 2) {
                            if (i14 < j()) {
                                iJ = j();
                            } else {
                                iJ = j();
                            }
                            i32 = 2;
                            c = 2;
                        } else {
                            iJ = i14;
                        }
                        if (i16 == c) {
                            if (i15 < h()) {
                                iH = h();
                            } else {
                                iH = h();
                            }
                            i16 = 2;
                        } else {
                            iH = i15;
                        }
                        i2 = iJ;
                        i4 = iH;
                        i32 = i32;
                        i3 = i16;
                        z = true;
                        break;
                    }
                    i4 = i15;
                    i3 = i16;
                    i2 = i14;
                    i12++;
                }
            } else {
                i = size11;
                i2 = iMax7;
                i3 = i31;
                i4 = iMax8;
            }
            z = false;
            break;
        }
        int i50 = 64;
        boolean z14 = W(64) || W(SemanticState.Focused);
        aqu aquVar = this.d;
        aquVar.f = false;
        aquVar.g = false;
        if (this.ax != 0 && z14) {
            aquVar.g = true;
        }
        ArrayList arrayList11 = this.aI;
        boolean z15 = M() == 2 || N() == 2;
        ab();
        int i51 = i;
        for (int i52 = 0; i52 < i51; i52++) {
            ard ardVar14 = (ard) this.aI.get(i52);
            if (ardVar14 instanceof ark) {
                ((ark) ardVar14).T();
            }
        }
        boolean z16 = z;
        int i53 = 1;
        int i54 = 0;
        while (i53 != 0) {
            int i55 = i54 + 1;
            try {
                aquVar.k();
                ab();
                q(aquVar);
                for (int i56 = 0; i56 < i51; i56++) {
                    ((ard) this.aI.get(i56)).q(aquVar);
                }
                boolean zW2 = W(i50);
                b(aquVar, zW2);
                int size13 = this.aI.size();
                int i57 = 0;
                boolean z17 = false;
                while (i57 < size13) {
                    try {
                        ard ardVar15 = (ard) this.aI.get(i57);
                        i9 = i55;
                        try {
                            ardVar15.y(0, false);
                            ardVar15.y(1, false);
                            z17 |= ardVar15 instanceof ara;
                            i57++;
                            i55 = i9;
                        } catch (Exception e) {
                            e = e;
                            z2 = z15;
                            i5 = i9;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : ".concat(e.toString()));
                            boolean[] zArr = ari.a;
                            zArr[2] = false;
                            zW = W(64);
                            R(zW);
                            size = this.aI.size();
                            i6 = 0;
                            z3 = false;
                            while (i6 < size) {
                                ardVar = (ard) this.aI.get(i6);
                                ardVar.R(zW);
                                aqu aquVar2 = aquVar;
                                if (ardVar.k == -1) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                z3 = z5 | z3;
                                i6++;
                                aquVar = aquVar2;
                            }
                            aqu aquVar3 = aquVar;
                            if (z2) {
                                iMax3 = 0;
                                iMax4 = 0;
                                for (i8 = 0; i8 < i51; i8++) {
                                    ard ardVar16 = (ard) this.aI.get(i8);
                                    iMax3 = Math.max(iMax3, ardVar16.Z + ardVar16.j());
                                    iMax4 = Math.max(iMax4, ardVar16.aa + ardVar16.h());
                                }
                                iMax5 = Math.max(this.ac, iMax3);
                                iMax6 = Math.max(this.ad, iMax4);
                                if (i32 == 2) {
                                    C(iMax5);
                                    this.aq[0] = 2;
                                    z16 = true;
                                    z3 = true;
                                }
                                if (i3 == 2) {
                                    x(iMax6);
                                    this.aq[1] = 2;
                                    z16 = true;
                                    z3 = true;
                                }
                            }
                            iMax = Math.max(this.ac, j());
                            if (iMax > j()) {
                                C(iMax);
                                r5 = 1;
                                this.aq[0] = 1;
                                z16 = true;
                                z4 = true;
                            } else {
                                r5 = 1;
                                z4 = z3;
                            }
                            iMax2 = Math.max(this.ad, h());
                            if (iMax2 > h()) {
                                x(iMax2);
                                this.aq[r5] = r5;
                                r1 = r5;
                                z16 = r1 == true ? 1 : 0;
                            } else {
                                r0 = z4;
                            }
                            if (!z16) {
                                r4 = this.aq;
                                if (r4[0] == 2) {
                                    r0 = r0;
                                    if (j() > i2) {
                                        this.ay = r5;
                                        r4[0] = r5;
                                        C(i2);
                                        ?? r2 = r5;
                                        z16 = r2 == true ? 1 : 0;
                                        r0 = r2;
                                    }
                                }
                                r0 = r1;
                                r0 = r0;
                                r0 = r0;
                                if (r4[r5] == 2) {
                                    this.az = r5;
                                    r4[r5] = r5;
                                    x(i4);
                                    r0 = 1;
                                    z16 = true;
                                }
                            }
                            if (i5 > 8) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            i53 = r0 & i7;
                            i54 = i5;
                            aquVar = aquVar3;
                            z15 = z2;
                            i50 = 64;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i9 = i55;
                    }
                }
                i9 = i55;
                if (z17) {
                    int i58 = 0;
                    while (i58 < size13) {
                        ard ardVar17 = (ard) this.aI.get(i58);
                        if (ardVar17 instanceof ara) {
                            ara araVar5 = (ara) ardVar17;
                            int i59 = 0;
                            while (i59 < araVar5.as) {
                                ard ardVar18 = araVar5.ar[i59];
                                int i60 = i58;
                                if (araVar5.b || ardVar18.d()) {
                                    int i61 = araVar5.a;
                                    araVar = araVar5;
                                    if (i61 == 0) {
                                        z6 = true;
                                    } else if (i61 == 1) {
                                        z6 = true;
                                    } else if (i61 == 2 || i61 == 3) {
                                        ardVar18.y(1, true);
                                    }
                                    ardVar18.y(0, z6);
                                } else {
                                    araVar = araVar5;
                                }
                                i59++;
                                i58 = i60;
                                araVar5 = araVar;
                            }
                        }
                        i58++;
                    }
                }
                HashSet hashSet8 = this.aE;
                hashSet8.clear();
                int i62 = 0;
                while (i62 < size13) {
                    int i63 = size13;
                    boolean z18 = z15;
                    int i64 = i9;
                    ard ardVar19 = (ard) this.aI.get(i62);
                    if (ardVar19.E()) {
                        if (ardVar19 instanceof arj) {
                            hashSet8.add(ardVar19);
                        } else {
                            ardVar19.b(aquVar, zW2);
                        }
                    }
                    i62++;
                    i9 = i64;
                    size13 = i63;
                    z15 = z18;
                }
                while (hashSet8.size() > 0) {
                    int size14 = hashSet8.size();
                    Iterator it8 = hashSet8.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            z2 = z15;
                            break;
                        }
                        arj arjVar = (arj) ((ard) it8.next());
                        Iterator it9 = it8;
                        z2 = z15;
                        for (int i65 = 0; i65 < arjVar.as; i65++) {
                            try {
                                if (hashSet8.contains(arjVar.ar[i65])) {
                                    arjVar.b(aquVar, zW2);
                                    hashSet8.remove(arjVar);
                                    break;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i5 = i9;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : ".concat(e.toString()));
                                boolean[] zArr2 = ari.a;
                                zArr2[2] = false;
                                zW = W(64);
                                R(zW);
                                size = this.aI.size();
                                i6 = 0;
                                z3 = false;
                                while (i6 < size) {
                                    ardVar = (ard) this.aI.get(i6);
                                    ardVar.R(zW);
                                    aqu aquVar4 = aquVar;
                                    if (ardVar.k == -1) {
                                        z5 = true;
                                    } else {
                                        z5 = true;
                                    }
                                    z3 = z5 | z3;
                                    i6++;
                                    aquVar = aquVar4;
                                }
                                aqu aquVar5 = aquVar;
                                if (z2) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i8 < i51) {
                                        ard ardVar110 = (ard) this.aI.get(i8);
                                        iMax3 = Math.max(iMax3, ardVar110.Z + ardVar110.j());
                                        iMax4 = Math.max(iMax4, ardVar110.aa + ardVar110.h());
                                    }
                                    iMax5 = Math.max(this.ac, iMax3);
                                    iMax6 = Math.max(this.ad, iMax4);
                                    if (i32 == 2) {
                                        C(iMax5);
                                        this.aq[0] = 2;
                                        z16 = true;
                                        z3 = true;
                                    }
                                    if (i3 == 2) {
                                        x(iMax6);
                                        this.aq[1] = 2;
                                        z16 = true;
                                        z3 = true;
                                    }
                                }
                                iMax = Math.max(this.ac, j());
                                if (iMax > j()) {
                                    C(iMax);
                                    r5 = 1;
                                    this.aq[0] = 1;
                                    z16 = true;
                                    z4 = true;
                                } else {
                                    r5 = 1;
                                    z4 = z3;
                                }
                                iMax2 = Math.max(this.ad, h());
                                if (iMax2 > h()) {
                                    x(iMax2);
                                    this.aq[r5] = r5;
                                    r1 = r5;
                                    z16 = r1 == true ? 1 : 0;
                                } else {
                                    r0 = z4;
                                }
                                if (!z16) {
                                    r4 = this.aq;
                                    if (r4[0] == 2) {
                                        r0 = r0;
                                        if (j() > i2) {
                                            this.ay = r5;
                                            r4[0] = r5;
                                            C(i2);
                                            ?? r3 = r5;
                                            z16 = r3 == true ? 1 : 0;
                                            r0 = r3;
                                        }
                                    }
                                    r0 = r1;
                                    r0 = r0;
                                    r0 = r0;
                                    if (r4[r5] == 2) {
                                        this.az = r5;
                                        r4[r5] = r5;
                                        x(i4);
                                        r0 = 1;
                                        z16 = true;
                                    }
                                }
                                if (i5 > 8) {
                                    i7 = 0;
                                } else {
                                    i7 = 1;
                                }
                                i53 = r0 & i7;
                                i54 = i5;
                                aquVar = aquVar5;
                                z15 = z2;
                                i50 = 64;
                            }
                        }
                        it8 = it9;
                        z15 = z2;
                    }
                    if (size14 == hashSet8.size()) {
                        Iterator it10 = hashSet8.iterator();
                        while (it10.hasNext()) {
                            ((ard) it10.next()).b(aquVar, zW2);
                        }
                        hashSet8.clear();
                    }
                    z15 = z2;
                }
                z2 = z15;
                if (aqu.a) {
                    HashSet<ard> hashSet9 = new HashSet();
                    for (int i66 = 0; i66 < size13; i66++) {
                        ard ardVar20 = (ard) this.aI.get(i66);
                        if (!ardVar20.E()) {
                            hashSet9.add(ardVar20);
                        }
                    }
                    i5 = i9;
                    try {
                        p(this, aquVar, hashSet9, M() == 2 ? 0 : 1, false);
                        for (ard ardVar21 : hashSet9) {
                            ari.a(this, aquVar, ardVar21);
                            ardVar21.b(aquVar, zW2);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : ".concat(e.toString()));
                    }
                } else {
                    i5 = i9;
                    int i67 = 0;
                    while (i67 < size13) {
                        ard ardVar22 = (ard) this.aI.get(i67);
                        if (ardVar22 instanceof are) {
                            int[] iArr3 = ardVar22.aq;
                            int i68 = iArr3[0];
                            i10 = i67;
                            int i69 = iArr3[1];
                            i11 = size13;
                            if (i68 == 2) {
                                ardVar22.P(1);
                                i68 = 2;
                            }
                            if (i69 == 2) {
                                ardVar22.Q(1);
                                i69 = 2;
                            }
                            ardVar22.b(aquVar, zW2);
                            if (i68 == 2) {
                                ardVar22.P(2);
                            }
                            if (i69 == 2) {
                                ardVar22.Q(2);
                            }
                        } else {
                            i10 = i67;
                            i11 = size13;
                            ari.a(this, aquVar, ardVar22);
                            if (!ardVar22.E()) {
                                ardVar22.b(aquVar, zW2);
                            }
                        }
                        i67 = i10 + 1;
                        size13 = i11;
                    }
                }
                if (this.at > 0) {
                    arrayList = null;
                    yp.b(this, aquVar, null, 0);
                } else {
                    arrayList = null;
                }
                if (this.au > 0) {
                    yp.b(this, aquVar, arrayList, 1);
                }
                WeakReference weakReference = this.aA;
                if (weakReference != null && weakReference.get() != null) {
                    aa((arc) this.aA.get(), aquVar.b(this.K));
                    this.aA = null;
                }
                WeakReference weakReference2 = this.aC;
                if (weakReference2 != null && weakReference2.get() != null) {
                    Z((arc) this.aC.get(), aquVar.b(this.M));
                    this.aC = null;
                }
                WeakReference weakReference3 = this.aB;
                if (weakReference3 != null && weakReference3.get() != null) {
                    aa((arc) this.aB.get(), aquVar.b(this.J));
                    this.aB = null;
                }
                WeakReference weakReference4 = this.aD;
                if (weakReference4 != null && weakReference4.get() != null) {
                    Z((arc) this.aD.get(), aquVar.b(this.L));
                    this.aD = null;
                }
                aquVar.j();
            } catch (Exception e5) {
                e = e5;
                i5 = i55;
                z2 = z15;
            }
            boolean[] zArr3 = ari.a;
            zArr3[2] = false;
            zW = W(64);
            R(zW);
            size = this.aI.size();
            i6 = 0;
            z3 = false;
            while (i6 < size) {
                ardVar = (ard) this.aI.get(i6);
                ardVar.R(zW);
                aqu aquVar6 = aquVar;
                if (ardVar.k == -1 || ardVar.l != -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z3 = z5 | z3;
                i6++;
                aquVar = aquVar6;
            }
            aqu aquVar7 = aquVar;
            if (z2 && i5 < 8 && zArr3[2]) {
                iMax3 = 0;
                iMax4 = 0;
                while (i8 < i51) {
                    ard ardVar111 = (ard) this.aI.get(i8);
                    iMax3 = Math.max(iMax3, ardVar111.Z + ardVar111.j());
                    iMax4 = Math.max(iMax4, ardVar111.aa + ardVar111.h());
                }
                iMax5 = Math.max(this.ac, iMax3);
                iMax6 = Math.max(this.ad, iMax4);
                if (i32 == 2 && j() < iMax5) {
                    C(iMax5);
                    this.aq[0] = 2;
                    z16 = true;
                    z3 = true;
                }
                if (i3 == 2 && h() < iMax6) {
                    x(iMax6);
                    this.aq[1] = 2;
                    z16 = true;
                    z3 = true;
                }
            }
            iMax = Math.max(this.ac, j());
            if (iMax > j()) {
                C(iMax);
                r5 = 1;
                this.aq[0] = 1;
                z16 = true;
                z4 = true;
            } else {
                r5 = 1;
                z4 = z3;
            }
            iMax2 = Math.max(this.ad, h());
            if (iMax2 > h()) {
                x(iMax2);
                this.aq[r5] = r5;
                r1 = r5;
                z16 = r1 == true ? 1 : 0;
            } else {
                r0 = z4;
            }
            if (!z16) {
                r4 = this.aq;
                if (r4[0] == 2 && i2 > 0) {
                    r0 = r0;
                    if (j() > i2) {
                        this.ay = r5;
                        r4[0] = r5;
                        C(i2);
                        ?? r6 = r5;
                        z16 = r6 == true ? 1 : 0;
                        r0 = r6;
                    }
                }
                r0 = r1;
                r0 = r0;
                r0 = r0;
                if (r4[r5] == 2 && i4 > 0 && h() > i4) {
                    this.az = r5;
                    r4[r5] = r5;
                    x(i4);
                    r0 = 1;
                    z16 = true;
                }
            }
            if (i5 > 8) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            i53 = r0 & i7;
            i54 = i5;
            aquVar = aquVar7;
            z15 = z2;
            i50 = 64;
        }
        this.aI = arrayList11;
        if (z16) {
            int[] iArr4 = this.aq;
            iArr4[0] = i32;
            iArr4[1] = i3;
        }
        S(this.d.j);
    }

    public final void U(int i) {
        this.ax = i;
        aqu.a = W(SemanticState.LiveRegion);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:65:0x003c A[SYNTHETIC] */
    public final boolean V(boolean z, int i) {
        boolean z2;
        ArrayList arrayList;
        int size;
        int i2;
        boolean z3;
        arx arxVar;
        aro aroVar = this.a;
        are areVar = aroVar.a;
        boolean z4 = false;
        int iL = areVar.L(0);
        int iL2 = areVar.L(1);
        int iK = areVar.k();
        int iL3 = areVar.l();
        if (z) {
            if (iL == 2) {
                arrayList = aroVar.e;
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    arxVar = (arx) arrayList.get(i2);
                    if (arxVar.f != i && !arxVar.e()) {
                        z3 = false;
                        break;
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3 && iL == 2) {
                        areVar.P(1);
                        areVar.C(aroVar.a(areVar, 0));
                        areVar.h.e.c(areVar.j());
                    }
                } else if (z3 && iL2 == 2) {
                    areVar.Q(1);
                    areVar.x(aroVar.a(areVar, 1));
                    areVar.i.e.c(areVar.h());
                }
            } else if (iL2 == 2) {
                iL2 = 2;
                arrayList = aroVar.e;
                size = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 < size) {
                        z3 = true;
                        break;
                    }
                    arxVar = (arx) arrayList.get(i2);
                    if (arxVar.f != i) {
                    }
                    i2++;
                }
                if (i == 0) {
                    if (z3) {
                        areVar.P(1);
                        areVar.C(aroVar.a(areVar, 0));
                        areVar.h.e.c(areVar.j());
                    }
                } else if (z3) {
                    areVar.Q(1);
                    areVar.x(aroVar.a(areVar, 1));
                    areVar.i.e.c(areVar.h());
                }
            }
        }
        if (i == 0) {
            int i3 = areVar.aq[0];
            if (i3 == 1 || i3 == 4) {
                int iJ = areVar.j() + iK;
                areVar.h.i.c(iJ);
                areVar.h.e.c(iJ - iK);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i4 = areVar.aq[1];
            if (i4 == 1 || i4 == 4) {
                int iH = areVar.h() + iL3;
                areVar.i.i.c(iH);
                areVar.i.e.c(iH - iL3);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        aroVar.c();
        ArrayList arrayList2 = aroVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            arx arxVar2 = (arx) arrayList2.get(i5);
            if (arxVar2.f == i && (arxVar2.d != areVar || arxVar2.g)) {
                arxVar2.c();
            }
        }
        int size3 = arrayList2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            arx arxVar3 = (arx) arrayList2.get(i6);
            if (arxVar3.f == i && ((z2 || arxVar3.d != areVar) && (!arxVar3.h.i || !arxVar3.i.i || (!(arxVar3 instanceof arm) && !arxVar3.e.i)))) {
                areVar.P(iL);
                areVar.Q(iL2);
                return z4;
            }
        }
        z4 = true;
        areVar.P(iL);
        areVar.Q(iL2);
        return z4;
    }

    public final boolean W(int i) {
        return (this.ax & i) == i;
    }

    final void a(ard ardVar, int i) {
        if (i == 0) {
            int i2 = this.at + 1;
            arb[] arbVarArr = this.aw;
            int length = arbVarArr.length;
            if (i2 >= length) {
                arbVarArr = (arb[]) Arrays.copyOf(arbVarArr, length << 1);
                this.aw = arbVarArr;
            }
            int i3 = this.at;
            arbVarArr[i3] = new arb(ardVar, 0, this.c);
            this.at = i3 + 1;
            return;
        }
        int i4 = this.au + 1;
        arb[] arbVarArr2 = this.av;
        int length2 = arbVarArr2.length;
        if (i4 >= length2) {
            arbVarArr2 = (arb[]) Arrays.copyOf(arbVarArr2, length2 << 1);
            this.av = arbVarArr2;
        }
        int i5 = this.au;
        arbVarArr2[i5] = new arb(ardVar, 1, this.c);
        this.au = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.ark, defpackage.ard
    public final void s() {
        this.d.k();
        this.ar = 0;
        this.as = 0;
        super.s();
    }
}
