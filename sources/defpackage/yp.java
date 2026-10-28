package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class yp {
    public static zc a(xr xrVar) {
        try {
            ServiceInfo serviceInfoA = xi.a(xrVar);
            String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
            if (string != null) {
                return (zc) Class.forName(string).getConstructor(null).newInstance(null);
            }
            throw new ClassNotFoundException("ResultManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:193:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:195:0x0303  */
    /* JADX WARN: Code duplicated, block: B:197:0x0309  */
    /* JADX WARN: Code duplicated, block: B:221:0x038e  */
    /* JADX WARN: Code duplicated, block: B:223:0x03a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:236:0x0422  */
    /* JADX WARN: Code duplicated, block: B:238:0x0440  */
    /* JADX WARN: Code duplicated, block: B:321:0x0587  */
    /* JADX WARN: Code duplicated, block: B:322:0x0589  */
    /* JADX WARN: Code duplicated, block: B:398:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:401:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:402:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:405:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:406:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:408:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:410:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:411:0x06ff A[PHI: r9
      0x06ff: PHI (r9v25 aqy) = (r9v24 aqy), (r9v30 aqy) binds: [B:407:0x06f3, B:410:0x06fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:413:0x0703  */
    /* JADX WARN: Code duplicated, block: B:415:0x0707 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:425:0x0721 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    public static void b(are areVar, aqu aquVar, ArrayList arrayList, int i) {
        int i2;
        arb[] arbVarArr;
        int i3;
        int i4;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        arb[] arbVarArr2;
        ard ardVar;
        ard ardVar2;
        ard ardVar3;
        aqu aquVar2;
        ard ardVar4;
        int i6;
        int i7;
        ard ardVar5;
        aqy aqyVar;
        aqy aqyVar2;
        arc arcVar;
        aqy aqyVar3;
        ard ardVar6;
        int i8;
        arc arcVar2;
        aqy aqyVar4;
        int i9;
        arc[] arcVarArr;
        arc arcVar3;
        arc arcVar4;
        aqy aqyVar5;
        arc arcVar5;
        aqy aqyVar6;
        arc arcVar6;
        int size;
        ArrayList arrayList2;
        float f2;
        float f3;
        aqy aqyVar7;
        aqy aqyVar8;
        aqy aqyVar9;
        aqy aqyVar10;
        aqt aqtVarA;
        float f4;
        int i10;
        arc arcVar7;
        ard ardVar7;
        int i11;
        int i12;
        ard ardVar8;
        int iH;
        are areVar2 = areVar;
        int i13 = 2;
        if (i == 0) {
            i2 = areVar2.at;
            arbVarArr = areVar2.aw;
            i3 = 0;
        } else {
            i2 = areVar2.au;
            arbVarArr = areVar2.av;
            i3 = 2;
        }
        int i14 = i2;
        arb[] arbVarArr3 = arbVarArr;
        int i15 = 0;
        while (i15 < i14) {
            arb arbVar = arbVarArr3[i15];
            int i16 = 3;
            int i17 = 8;
            aqy aqyVar11 = null;
            if (arbVar.t) {
                i4 = i15;
                f = 0.0f;
            } else {
                int i18 = arbVar.o;
                int i19 = i18 << 1;
                f = 0.0f;
                ard ardVar9 = arbVar.a;
                ard ardVar10 = ardVar9;
                ard ardVar11 = ardVar10;
                boolean z5 = false;
                while (!z5) {
                    int i20 = i19 + 1;
                    arbVar.i++;
                    ardVar10.an[i18] = null;
                    ardVar10.am[i18] = null;
                    if (ardVar10.ah != i17) {
                        arbVar.l++;
                        if (ardVar10.L(i18) != i16) {
                            int i21 = arbVar.m;
                            if (i18 == 0) {
                                iH = ardVar10.j();
                                i12 = 0;
                            } else {
                                iH = ardVar10.h();
                                i12 = 1;
                            }
                            arbVar.m = i21 + iH;
                        } else {
                            i12 = i18;
                        }
                        int i22 = arbVar.m;
                        arc[] arcVarArr2 = ardVar10.R;
                        int iB = i22 + arcVarArr2[i19].b();
                        arbVar.m = iB;
                        arbVar.m = iB + arcVarArr2[i20].b();
                        int iB2 = arbVar.n + arcVarArr2[i19].b();
                        arbVar.n = iB2;
                        arbVar.n = iB2 + arcVarArr2[i20].b();
                        if (arbVar.b == null) {
                            arbVar.b = ardVar10;
                        }
                        arbVar.d = ardVar10;
                        int i23 = ardVar10.aq[i12];
                        if (i23 == i16) {
                            int i24 = ardVar10.u[i12];
                            if (i24 != 0 && i24 != i16) {
                                if (i24 == i13) {
                                    i24 = i13;
                                }
                            }
                            arbVar.j++;
                            float f5 = ardVar10.al[i12];
                            if (f5 > 0.0f) {
                                arbVar.k += f5;
                            }
                            if (ardVar10.ah != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                if (f5 < 0.0f) {
                                    arbVar.q = true;
                                } else {
                                    arbVar.r = true;
                                }
                                if (arbVar.h == null) {
                                    arbVar.h = new ArrayList();
                                }
                                arbVar.h.add(ardVar10);
                            }
                            if (arbVar.f == null) {
                                arbVar.f = ardVar10;
                            }
                            ard ardVar12 = arbVar.g;
                            if (ardVar12 != null) {
                                ardVar12.am[i12] = ardVar10;
                            }
                            arbVar.g = ardVar10;
                        }
                    } else {
                        i12 = i18;
                    }
                    ard ardVar13 = ardVar11;
                    if (ardVar13 != ardVar10) {
                        ardVar13.an[i12] = ardVar10;
                    }
                    arc arcVar8 = ardVar10.R[i20].e;
                    if (arcVar8 != null) {
                        ardVar8 = arcVar8.d;
                        arc arcVar9 = ardVar8.R[i19].e;
                        if (arcVar9 == null || arcVar9.d != ardVar10) {
                            ardVar8 = null;
                        }
                    } else {
                        ardVar8 = null;
                    }
                    if (ardVar8 != null) {
                        z5 = false;
                    } else {
                        ardVar8 = ardVar10;
                        z5 = true;
                    }
                    ardVar11 = ardVar10;
                    i16 = 3;
                    i17 = 8;
                    i13 = 2;
                    ardVar10 = ardVar8;
                    i15 = i15;
                }
                i4 = i15;
                ard ardVar14 = arbVar.b;
                if (ardVar14 != null) {
                    arbVar.m -= ardVar14.R[i19].b();
                }
                ard ardVar15 = arbVar.d;
                if (ardVar15 != null) {
                    arbVar.m -= ardVar15.R[i19 + 1].b();
                }
                arbVar.c = ardVar10;
                if (i18 == 0 && arbVar.p) {
                    arbVar.e = arbVar.c;
                } else {
                    arbVar.e = ardVar9;
                }
                arbVar.s = arbVar.r && arbVar.q;
            }
            arbVar.t = true;
            if (arrayList == 0 || arrayList.contains(arbVar.a)) {
                ard ardVar16 = arbVar.a;
                ard ardVar17 = arbVar.c;
                ard ardVar18 = arbVar.b;
                ard ardVar19 = arbVar.d;
                ard ardVar20 = arbVar.e;
                float f6 = arbVar.k;
                ard ardVar21 = arbVar.f;
                ard ardVar22 = arbVar.g;
                int i25 = areVar2.aq[i];
                if (i == 0) {
                    int i26 = ardVar20.aj;
                    boolean z6 = i26 == 0;
                    boolean z7 = i26 == 1;
                    z = i26 == 2;
                    z4 = z7;
                    z2 = z6;
                    z3 = false;
                } else {
                    int i27 = ardVar20.ak;
                    boolean z8 = i27 == 0;
                    boolean z9 = i27 == 1;
                    z = i27 == 2;
                    z2 = z8;
                    z3 = false;
                    z4 = z9;
                }
                while (!z3) {
                    int i28 = i3 + 1;
                    arc[] arcVarArr3 = ardVar16.R;
                    arc arcVar10 = arcVarArr3[i3];
                    int i29 = true != z ? 4 : 1;
                    int iB3 = arcVar10.b();
                    boolean z10 = z;
                    int[] iArr = ardVar16.aq;
                    int iB4 = iB3;
                    boolean z11 = iArr[i] == 3 && ardVar16.u[i] == 0;
                    arc arcVar11 = arcVar10.e;
                    if (arcVar11 != null && ardVar16 != ardVar16) {
                        iB4 += arcVar11.b();
                    }
                    boolean z12 = z11;
                    int i30 = iB4;
                    if (z10 && ardVar16 != ardVar16 && ardVar16 != ardVar18) {
                        i29 = 8;
                    }
                    int i31 = i14;
                    if (arcVar11 != null) {
                        if (ardVar16 == ardVar18) {
                            aquVar.g(arcVar10.h, arcVar11.h, i30, 6);
                        } else {
                            aquVar.g(arcVar10.h, arcVar11.h, i30, 8);
                        }
                        if (z12 && !z10) {
                            i29 = 5;
                        }
                        aquVar.m(arcVar10.h, arcVar10.e.h, i30, (ardVar16 == ardVar18 && z10 && ardVar16.T[i]) ? 5 : i29);
                    } else {
                        arbVarArr3 = arbVarArr3;
                    }
                    if (i25 == 2) {
                        if (ardVar16.ah == 8 || iArr[i] != 3) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            aquVar.g(arcVarArr3[i28].h, arcVarArr3[i3].h, 0, 5);
                        }
                        aquVar.g(arcVarArr3[i3].h, areVar2.R[i3].h, i11, 8);
                    }
                    arc arcVar12 = arcVarArr3[i28].e;
                    if (arcVar12 != null) {
                        ardVar7 = arcVar12.d;
                        arc arcVar13 = ardVar7.R[i3].e;
                        if (arcVar13 == null || arcVar13.d != ardVar16) {
                            ardVar7 = null;
                        }
                    } else {
                        ardVar7 = null;
                    }
                    if (ardVar7 != null) {
                        ardVar16 = ardVar7;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    z = z10;
                    i14 = i31;
                    arbVarArr3 = arbVarArr3;
                }
                boolean z13 = z;
                i5 = i14;
                arbVarArr2 = arbVarArr3;
                if (ardVar19 != null) {
                    int i32 = i3 + 1;
                    arc[] arcVarArr4 = ardVar17.R;
                    if (arcVarArr4[i32].e != null) {
                        arc arcVar14 = ardVar19.R[i32];
                        if (ardVar19.aq[i] == 3 && ardVar19.u[i] == 0 && !z13) {
                            arc arcVar15 = arcVar14.e;
                            if (arcVar15.d == areVar2) {
                                i10 = i32;
                                aquVar.m(arcVar14.h, arcVar15.h, -arcVar14.b(), 5);
                            } else {
                                i10 = i32;
                                if (z13) {
                                    arcVar7 = arcVar14.e;
                                    if (arcVar7.d == areVar2) {
                                        aquVar.m(arcVar14.h, arcVar7.h, -arcVar14.b(), 4);
                                    }
                                }
                            }
                        } else {
                            i10 = i32;
                            if (z13) {
                                arcVar7 = arcVar14.e;
                                if (arcVar7.d == areVar2) {
                                    aquVar.m(arcVar14.h, arcVar7.h, -arcVar14.b(), 4);
                                }
                            }
                        }
                        aquVar.h(arcVar14.h, arcVarArr4[i10].e.h, -arcVar14.b(), 6);
                    }
                }
                if (i25 == 2) {
                    int i33 = i3 + 1;
                    aqy aqyVar12 = areVar2.R[i33].h;
                    arc arcVar16 = ardVar17.R[i33];
                    aquVar.g(aqyVar12, arcVar16.h, arcVar16.b(), 8);
                }
                ArrayList arrayList3 = arbVar.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (arbVar.q && !arbVar.s) {
                        f6 = arbVar.j;
                    }
                    ard ardVar23 = null;
                    float f7 = f;
                    int i34 = 0;
                    while (i34 < size) {
                        ard ardVar24 = (ard) arrayList3.get(i34);
                        float f8 = ardVar24.al[i];
                        if (f8 >= f) {
                            arrayList2 = arrayList3;
                            if (f8 == f) {
                                arc[] arcVarArr5 = ardVar24.R;
                                aquVar.m(arcVarArr5[i3 + 1].h, arcVarArr5[i3].h, 0, 8);
                                size = size;
                                i34 = i34;
                                f3 = f;
                            } else {
                                if (ardVar23 != null) {
                                    int i35 = i3 + 1;
                                    arc[] arcVarArr6 = ardVar23.R;
                                    aqyVar7 = arcVarArr6[i3].h;
                                    aqyVar8 = arcVarArr6[i35].h;
                                    arc[] arcVarArr7 = ardVar24.R;
                                    aqyVar9 = arcVarArr7[i3].h;
                                    aqyVar10 = arcVarArr7[i35].h;
                                    float f9 = f7;
                                    aqtVarA = aquVar.a();
                                    f2 = f8;
                                    f4 = f;
                                    aqtVarA.b = f4;
                                    f3 = f4;
                                    if (f6 != f4 || f9 == f2) {
                                        aqtVarA.e.g(aqyVar7, 1.0f);
                                        aqtVarA.e.g(aqyVar8, -1.0f);
                                        aqtVarA.e.g(aqyVar10, 1.0f);
                                        aqtVarA.e.g(aqyVar9, -1.0f);
                                    } else if (f9 == f3) {
                                        aqtVarA.e.g(aqyVar7, 1.0f);
                                        aqtVarA.e.g(aqyVar8, -1.0f);
                                    } else if (f8 == f) {
                                        aqtVarA.e.g(aqyVar9, 1.0f);
                                        aqtVarA.e.g(aqyVar10, -1.0f);
                                    } else {
                                        aqtVarA.e.g(aqyVar7, 1.0f);
                                        aqtVarA.e.g(aqyVar8, -1.0f);
                                        float f10 = (f9 / f6) / (f2 / f6);
                                        aqtVarA.e.g(aqyVar10, f10);
                                        aqtVarA.e.g(aqyVar9, -f10);
                                    }
                                    aquVar.e(aqtVarA);
                                } else {
                                    f2 = f8;
                                    i34 = i34;
                                    f3 = f;
                                }
                                ardVar23 = ardVar24;
                                f7 = f2;
                            }
                        } else {
                            if (arbVar.s) {
                                arc[] arcVarArr8 = ardVar24.R;
                                arrayList2 = arrayList3;
                                aquVar.m(arcVarArr8[i3 + 1].h, arcVarArr8[i3].h, 0, 4);
                            } else {
                                f8 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f8 == f) {
                                    arc[] arcVarArr9 = ardVar24.R;
                                    aquVar.m(arcVarArr9[i3 + 1].h, arcVarArr9[i3].h, 0, 8);
                                } else {
                                    if (ardVar23 != null) {
                                        int i36 = i3 + 1;
                                        arc[] arcVarArr10 = ardVar23.R;
                                        aqyVar7 = arcVarArr10[i3].h;
                                        aqyVar8 = arcVarArr10[i36].h;
                                        arc[] arcVarArr11 = ardVar24.R;
                                        aqyVar9 = arcVarArr11[i3].h;
                                        aqyVar10 = arcVarArr11[i36].h;
                                        float f11 = f7;
                                        aqtVarA = aquVar.a();
                                        f2 = f8;
                                        f4 = f;
                                        aqtVarA.b = f4;
                                        f3 = f4;
                                        if (f6 != f4) {
                                            aqtVarA.e.g(aqyVar7, 1.0f);
                                            aqtVarA.e.g(aqyVar8, -1.0f);
                                            aqtVarA.e.g(aqyVar10, 1.0f);
                                            aqtVarA.e.g(aqyVar9, -1.0f);
                                        } else {
                                            aqtVarA.e.g(aqyVar7, 1.0f);
                                            aqtVarA.e.g(aqyVar8, -1.0f);
                                            aqtVarA.e.g(aqyVar10, 1.0f);
                                            aqtVarA.e.g(aqyVar9, -1.0f);
                                        }
                                        aquVar.e(aqtVarA);
                                    } else {
                                        f2 = f8;
                                        i34 = i34;
                                        f3 = f;
                                    }
                                    ardVar23 = ardVar24;
                                    f7 = f2;
                                }
                            }
                            size = size;
                            i34 = i34;
                            f3 = f;
                        }
                        i34++;
                        arrayList3 = arrayList2;
                        size = size;
                        f = f3;
                    }
                }
                if (ardVar18 == null || !(ardVar18 == ardVar19 || z13)) {
                    ardVar = ardVar18;
                    ardVar2 = ardVar19;
                    if (!z2) {
                        ardVar3 = ardVar;
                    } else if (ardVar != null) {
                        int i37 = arbVar.j;
                        boolean z14 = i37 > 0 && arbVar.i == i37;
                        ard ardVar25 = ardVar;
                        ard ardVar26 = ardVar25;
                        while (ardVar26 != null) {
                            ard ardVar27 = ardVar26.an[i];
                            while (true) {
                                if (ardVar27 == null) {
                                    if (ardVar26 != ardVar2) {
                                        ardVar6 = ardVar27;
                                        i8 = 8;
                                    }
                                    if (ardVar26.ah != i8) {
                                        ardVar25 = ardVar26;
                                    } else {
                                        ardVar25 = ardVar25;
                                    }
                                    ardVar26 = ardVar6;
                                    z14 = z14;
                                } else if (ardVar27.ah == 8) {
                                    ardVar27 = ardVar27.an[i];
                                }
                                int i38 = i3 + 1;
                                arc[] arcVarArr12 = ardVar26.R;
                                arc arcVar17 = arcVarArr12[i3];
                                aqy aqyVar13 = arcVar17.h;
                                arc arcVar18 = arcVar17.e;
                                aqy aqyVar14 = arcVar18 != null ? arcVar18.h : null;
                                if (ardVar25 != ardVar26) {
                                    aqyVar14 = ardVar25.R[i38].h;
                                } else if (ardVar26 == ardVar) {
                                    arc arcVar19 = ardVar16.R[i3].e;
                                    aqyVar14 = arcVar19 != null ? arcVar19.h : null;
                                }
                                int iB5 = arcVar17.b();
                                int iB6 = arcVarArr12[i38].b();
                                if (ardVar27 != null) {
                                    arcVar2 = ardVar27.R[i3];
                                    ardVar6 = ardVar27;
                                    aqyVar4 = arcVar2.h;
                                } else {
                                    ardVar6 = ardVar27;
                                    arcVar2 = ardVar17.R[i38].e;
                                    aqyVar4 = arcVar2 != null ? arcVar2.h : null;
                                }
                                aqy aqyVar15 = arcVarArr12[i38].h;
                                if (arcVar2 != null) {
                                    iB6 += arcVar2.b();
                                }
                                int iB7 = iB5 + ardVar25.R[i38].b();
                                if (aqyVar13 == null || aqyVar14 == null || aqyVar4 == null || aqyVar15 == null) {
                                    i8 = 8;
                                } else {
                                    if (ardVar26 == ardVar) {
                                        iB7 = ardVar.R[i3].b();
                                    }
                                    int i39 = iB7;
                                    if (ardVar26 == ardVar2) {
                                        iB6 = ardVar2.R[i38].b();
                                    }
                                    int i40 = true != z14 ? 5 : 8;
                                    i8 = 8;
                                    aquVar.d(aqyVar13, aqyVar14, i39, 0.5f, aqyVar4, aqyVar15, iB6, i40);
                                }
                                if (ardVar26.ah != i8) {
                                    ardVar25 = ardVar26;
                                } else {
                                    ardVar25 = ardVar25;
                                }
                                ardVar26 = ardVar6;
                                z14 = z14;
                            }
                        }
                    } else {
                        ardVar3 = null;
                    }
                    int i41 = 8;
                    if (!z4 || ardVar == null) {
                        aquVar2 = aquVar;
                        ardVar3 = ardVar3;
                    } else {
                        int i42 = i3 + 1;
                        int i43 = arbVar.j;
                        boolean z15 = i43 > 0 && arbVar.i == i43;
                        ard ardVar28 = ardVar;
                        ard ardVar29 = ardVar28;
                        while (ardVar28 != null) {
                            ard ardVar30 = ardVar28.an[i];
                            while (ardVar30 != null && ardVar30.ah == i41) {
                                ardVar30 = ardVar30.an[i];
                            }
                            if (ardVar28 == ardVar || ardVar28 == ardVar2 || ardVar30 == null) {
                                z15 = z15;
                                ardVar5 = ardVar28;
                                ardVar28 = ardVar30;
                            } else {
                                if (ardVar30 == ardVar2) {
                                    ardVar30 = null;
                                }
                                arc[] arcVarArr13 = ardVar28.R;
                                arc arcVar20 = arcVarArr13[i3];
                                ard ardVar31 = ardVar28;
                                aqy aqyVar16 = arcVar20.h;
                                arc arcVar21 = arcVar20.e;
                                arc[] arcVarArr14 = ardVar29.R;
                                aqy aqyVar17 = arcVarArr14[i42].h;
                                int iB8 = arcVar20.b();
                                int iB9 = arcVarArr13[i42].b();
                                if (ardVar30 != null) {
                                    arcVar = ardVar30.R[i3];
                                    aqyVar2 = arcVar.h;
                                    aqyVar = aqyVar16;
                                    arc arcVar22 = arcVar.e;
                                    aqyVar3 = arcVar22 != null ? arcVar22.h : null;
                                } else {
                                    aqyVar = aqyVar16;
                                    arc arcVar23 = ardVar2.R[i3];
                                    aqyVar2 = arcVar23 != null ? arcVar23.h : null;
                                    aqy aqyVar18 = arcVarArr13[i42].h;
                                    arcVar = arcVar23;
                                    aqyVar3 = aqyVar18;
                                }
                                if (arcVar != null) {
                                    iB9 += arcVar.b();
                                }
                                int iB10 = iB8 + arcVarArr14[i42].b();
                                int i44 = true != z15 ? 4 : 8;
                                if (aqyVar == null || aqyVar17 == null || aqyVar2 == null || aqyVar3 == null) {
                                    ardVar5 = ardVar31;
                                } else {
                                    aqy aqyVar19 = aqyVar2;
                                    ardVar5 = ardVar31;
                                    aquVar.d(aqyVar, aqyVar17, iB10, 0.5f, aqyVar19, aqyVar3, iB9, i44);
                                }
                                ardVar28 = ardVar30;
                            }
                            ardVar29 = ardVar5.ah != 8 ? ardVar5 : ardVar29;
                            i41 = 8;
                            z15 = z15;
                        }
                        aquVar2 = aquVar;
                        arc arcVar24 = ardVar.R[i3];
                        arc arcVar25 = ardVar16.R[i3].e;
                        arc arcVar26 = ardVar2.R[i42];
                        arc arcVar27 = ardVar17.R[i42].e;
                        if (arcVar25 != null) {
                            if (ardVar != ardVar2) {
                                i7 = 5;
                                aquVar2.m(arcVar24.h, arcVar25.h, arcVar24.b(), 5);
                            } else {
                                i7 = 5;
                                if (arcVar27 != null) {
                                    i6 = 5;
                                    aquVar2.d(arcVar24.h, arcVar25.h, arcVar24.b(), 0.5f, arcVar26.h, arcVar27.h, arcVar26.b(), 5);
                                }
                            }
                            i6 = i7;
                        } else {
                            i6 = 5;
                        }
                        if (arcVar27 != null && ardVar != ardVar2) {
                            aquVar2.m(arcVar26.h, arcVar27.h, -arcVar26.b(), i6);
                        }
                    }
                    ardVar4 = ardVar3;
                    if ((z2 || z4) && ardVar4 != null && ardVar4 != ardVar2) {
                        i9 = i3 + 1;
                        arcVarArr = ardVar4.R;
                        arc arcVar28 = arcVarArr[i3];
                        if (ardVar2 == null) {
                            ardVar2 = ardVar4;
                        }
                        arc[] arcVarArr15 = ardVar2.R;
                        arcVar3 = arcVarArr15[i9];
                        arcVar4 = arcVar28.e;
                        if (arcVar4 != null) {
                            aqyVar5 = arcVar4.h;
                        } else {
                            aqyVar5 = null;
                        }
                        arcVar5 = arcVar3.e;
                        if (arcVar5 != null) {
                            aqyVar6 = arcVar5.h;
                        } else {
                            aqyVar6 = null;
                        }
                        if (ardVar17 == ardVar2) {
                            aqyVar11 = aqyVar6;
                        } else {
                            arcVar6 = ardVar17.R[i9].e;
                            if (arcVar6 != null) {
                                aqyVar6 = arcVar6.h;
                                aqyVar11 = aqyVar6;
                            }
                        }
                        if (ardVar4 == ardVar2) {
                            arcVar3 = arcVarArr[i9];
                        }
                        if (aqyVar5 == null && aqyVar11 != null) {
                            aquVar2.d(arcVar28.h, aqyVar5, arcVar28.b(), 0.5f, aqyVar11, arcVar3.h, arcVarArr15[i9].b(), 5);
                        }
                    }
                } else {
                    int i45 = i3 + 1;
                    arc arcVar29 = ardVar16.R[i3];
                    arc arcVar30 = ardVar17.R[i45];
                    arc arcVar31 = arcVar29.e;
                    aqy aqyVar20 = arcVar31 != null ? arcVar31.h : null;
                    arc arcVar32 = arcVar30.e;
                    aqy aqyVar21 = arcVar32 != null ? arcVar32.h : null;
                    arc arcVar33 = ardVar18.R[i3];
                    if (ardVar19 != null) {
                        arcVar30 = ardVar19.R[i45];
                    }
                    if (aqyVar20 == null || aqyVar21 == null) {
                        ardVar = ardVar18;
                        ardVar2 = ardVar19;
                    } else {
                        ardVar2 = ardVar19;
                        ardVar = ardVar18;
                        aquVar.d(arcVar33.h, aqyVar20, arcVar33.b(), i == 0 ? ardVar20.ae : ardVar20.af, aqyVar21, arcVar30.h, arcVar30.b(), 7);
                    }
                }
                aquVar2 = aquVar;
                ardVar4 = ardVar;
                if (z2) {
                    i9 = i3 + 1;
                    arcVarArr = ardVar4.R;
                    arc arcVar210 = arcVarArr[i3];
                    if (ardVar2 == null) {
                        ardVar2 = ardVar4;
                    }
                    arc[] arcVarArr16 = ardVar2.R;
                    arcVar3 = arcVarArr16[i9];
                    arcVar4 = arcVar210.e;
                    if (arcVar4 != null) {
                        aqyVar5 = arcVar4.h;
                    } else {
                        aqyVar5 = null;
                    }
                    arcVar5 = arcVar3.e;
                    if (arcVar5 != null) {
                        aqyVar6 = arcVar5.h;
                    } else {
                        aqyVar6 = null;
                    }
                    if (ardVar17 == ardVar2) {
                        aqyVar11 = aqyVar6;
                    } else {
                        arcVar6 = ardVar17.R[i9].e;
                        if (arcVar6 != null) {
                            aqyVar6 = arcVar6.h;
                            aqyVar11 = aqyVar6;
                        }
                    }
                    if (ardVar4 == ardVar2) {
                        arcVar3 = arcVarArr[i9];
                    }
                    if (aqyVar5 == null) {
                    }
                } else {
                    i9 = i3 + 1;
                    arcVarArr = ardVar4.R;
                    arc arcVar211 = arcVarArr[i3];
                    if (ardVar2 == null) {
                        ardVar2 = ardVar4;
                    }
                    arc[] arcVarArr17 = ardVar2.R;
                    arcVar3 = arcVarArr17[i9];
                    arcVar4 = arcVar211.e;
                    if (arcVar4 != null) {
                        aqyVar5 = arcVar4.h;
                    } else {
                        aqyVar5 = null;
                    }
                    arcVar5 = arcVar3.e;
                    if (arcVar5 != null) {
                        aqyVar6 = arcVar5.h;
                    } else {
                        aqyVar6 = null;
                    }
                    if (ardVar17 == ardVar2) {
                        aqyVar11 = aqyVar6;
                    } else {
                        arcVar6 = ardVar17.R[i9].e;
                        if (arcVar6 != null) {
                            aqyVar6 = arcVar6.h;
                            aqyVar11 = aqyVar6;
                        }
                    }
                    if (ardVar4 == ardVar2) {
                        arcVar3 = arcVarArr[i9];
                    }
                    if (aqyVar5 == null) {
                    }
                }
            } else {
                i5 = i14;
                arbVarArr2 = arbVarArr3;
            }
            i15 = i4 + 1;
            areVar2 = areVar;
            i14 = i5;
            arbVarArr3 = arbVarArr2;
            i13 = 2;
        }
    }

    public static ListenableFuture c(Executor executor, Function0 function0) {
        return ape.f(new dzx(executor, function0, 0));
    }

    public static Point d(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public static int e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
