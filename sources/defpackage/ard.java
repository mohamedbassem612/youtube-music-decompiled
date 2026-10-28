package defpackage;

import androidx.car.app.model.Alert;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ard {
    public float A;
    int B;
    float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final arc J;
    public final arc K;
    public final arc L;
    public final arc M;
    public final arc N;
    final arc O;
    final arc P;
    public final arc Q;
    public final arc[] R;
    protected final ArrayList S;
    public final boolean[] T;
    public ard U;
    int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public float ae;
    public float af;
    public Object ag;
    public int ah;
    public String ai;
    public int aj;
    public int ak;
    public final float[] al;
    public final ard[] am;
    public final ard[] an;
    public int ao;
    public int ap;
    public final int[] aq;
    private boolean b;
    public arm f;
    public arm g;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;
    public boolean e = false;
    public aru h = null;
    public arv i = null;
    public final boolean[] j = {true, true};
    private boolean a = true;
    public int k = -1;
    public int l = -1;

    public ard() {
        new HashMap();
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        arc arcVar = new arc(this, 2);
        this.J = arcVar;
        arc arcVar2 = new arc(this, 3);
        this.K = arcVar2;
        arc arcVar3 = new arc(this, 4);
        this.L = arcVar3;
        arc arcVar4 = new arc(this, 5);
        this.M = arcVar4;
        arc arcVar5 = new arc(this, 6);
        this.N = arcVar5;
        arc arcVar6 = new arc(this, 8);
        this.O = arcVar6;
        arc arcVar7 = new arc(this, 9);
        this.P = arcVar7;
        arc arcVar8 = new arc(this, 7);
        this.Q = arcVar8;
        this.R = new arc[]{arcVar, arcVar3, arcVar2, arcVar4, arcVar5, arcVar8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.T = new boolean[2];
        this.aq = new int[]{1, 1};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ae = 0.5f;
        this.af = 0.5f;
        this.ah = 0;
        this.ai = null;
        this.aj = 0;
        this.ak = 0;
        this.al = new float[]{-1.0f, -1.0f};
        this.am = new ard[]{null, null};
        this.an = new ard[]{null, null};
        this.ao = -1;
        this.ap = -1;
        arrayList.add(arcVar);
        arrayList.add(arcVar2);
        arrayList.add(arcVar3);
        arrayList.add(arcVar4);
        arrayList.add(arcVar6);
        arrayList.add(arcVar7);
        arrayList.add(arcVar8);
        arrayList.add(arcVar5);
    }

    private final boolean a(int i) {
        arc arcVar;
        arc arcVar2;
        arc[] arcVarArr = this.R;
        int i2 = i << 1;
        arc arcVar3 = arcVarArr[i2];
        arc arcVar4 = arcVar3.e;
        return (arcVar4 == null || arcVar4.e == arcVar3 || (arcVar2 = (arcVar = arcVarArr[i2 + 1]).e) == null || arcVar2.e != arcVar) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:102:0x0154  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:106:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0175  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:216:0x0387  */
    /* JADX WARN: Code duplicated, block: B:218:0x038d  */
    /* JADX WARN: Code duplicated, block: B:225:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:228:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:234:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:251:0x041a  */
    /* JADX WARN: Code duplicated, block: B:253:0x041e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0432  */
    /* JADX WARN: Code duplicated, block: B:269:0x043e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0443  */
    /* JADX WARN: Code duplicated, block: B:272:0x0445  */
    /* JADX WARN: Code duplicated, block: B:275:0x044d  */
    /* JADX WARN: Code duplicated, block: B:281:0x045b A[PHI: r0
      0x045b: PHI (r0v20 int) = (r0v19 int), (r0v24 int), (r0v24 int), (r0v24 int) binds: [B:274:0x044b, B:276:0x0451, B:277:0x0453, B:279:0x0457] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:284:0x046d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:285:0x046f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0474  */
    /* JADX WARN: Code duplicated, block: B:288:0x0477  */
    /* JADX WARN: Code duplicated, block: B:289:0x047c  */
    /* JADX WARN: Code duplicated, block: B:305:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:317:0x04d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:348:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105  */
    /* JADX WARN: Code duplicated, block: B:75:0x0107  */
    /* JADX WARN: Code duplicated, block: B:77:0x010a  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX WARN: Code duplicated, block: B:93:0x0132  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0138  */
    /* JADX WARN: Code duplicated, block: B:97:0x013c  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void c(aqu aquVar, boolean z, boolean z2, boolean z3, boolean z4, aqy aqyVar, aqy aqyVar2, int i, boolean z5, arc arcVar, arc arcVar2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        int i10;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z13;
        int iMin;
        boolean z14;
        aqy aqyVar3;
        int i15;
        int i16;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        int i19;
        aqy aqyVarB;
        aqy aqyVarB2;
        int i20;
        int i21;
        arc arcVar3;
        int i22;
        boolean z17;
        int i23;
        int i24;
        boolean z18;
        boolean z19;
        boolean z20;
        int i25;
        boolean z21;
        boolean z22;
        aqy aqyVar4;
        ard ardVar;
        int iMin2;
        int i26;
        int iB;
        int i27;
        boolean z23;
        int i28;
        boolean z24;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z25;
        boolean z26;
        aquVar = aquVar;
        aqy aqyVarB3 = aquVar.b(arcVar);
        aqy aqyVarB4 = aquVar.b(arcVar2);
        aqy aqyVarB5 = aquVar.b(arcVar.e);
        aqy aqyVarB6 = aquVar.b(arcVar2.e);
        boolean zH = arcVar.h();
        boolean zH2 = arcVar2.h();
        aqy aqyVar5 = aqyVarB6;
        boolean zH3 = this.Q.h();
        int i36 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i36++;
        }
        int i37 = true == z6 ? 3 : i6;
        int i38 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i38 != 0 && i38 != 1 && i38 == 2) {
            i10 = i37;
            z12 = i10 != 4;
            i11 = this.k;
            if (i11 != -1 && z) {
                this.k = -1;
                i3 = i11;
                z12 = false;
            }
            i12 = this.l;
            if (i12 != -1 || z) {
                i12 = i3;
            } else {
                this.l = -1;
                z12 = false;
            }
            i13 = this.ah;
            i14 = i12;
            if (i13 == 8) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (i13 == 8) {
                iMin = 0;
            } else {
                iMin = i14;
            }
            if (z11) {
                if (zH && !zH2 && !zH3) {
                    aquVar.f(aqyVarB3, i2);
                } else if (zH && !zH2) {
                    aquVar.m(aqyVarB3, aqyVarB5, arcVar.b(), 8);
                }
            }
            z14 = z13 & z12;
            aqyVar3 = aqyVarB5;
            if (!z14) {
                if (i36 != 2 || z6) {
                    if (i8 == -2) {
                        i15 = iMin;
                    } else {
                        i15 = i8;
                    }
                    if (i9 == -2) {
                        i16 = iMin;
                    } else {
                        i16 = i9;
                    }
                    if (iMin > 0 && i10 != 1) {
                        iMin = 0;
                    }
                    if (i15 > 0) {
                        aquVar.g(aqyVarB4, aqyVarB3, i15, 8);
                        iMin = Math.max(iMin, i15);
                    }
                    if (i16 > 0) {
                        if (z2 || i10 != 1) {
                            aquVar.h(aqyVarB4, aqyVarB3, i16, 8);
                            i20 = i10;
                        } else {
                            i20 = 1;
                        }
                        iMin = Math.min(iMin, i16);
                        i17 = i20;
                    } else {
                        i17 = i10;
                    }
                    if (i10 == 1) {
                        if (z2) {
                            aquVar.m(aqyVarB4, aqyVarB3, iMin, 8);
                        } else if (z8) {
                            aquVar.m(aqyVarB4, aqyVarB3, iMin, 5);
                            aquVar.h(aqyVarB4, aqyVarB3, iMin, 8);
                        } else {
                            aquVar.m(aqyVarB4, aqyVarB3, iMin, 5);
                            aquVar.h(aqyVarB4, aqyVarB3, iMin, 8);
                        }
                        i18 = i17;
                    } else if (i10 == 2) {
                        i19 = arcVar.i;
                        if (i19 != 3 || i19 == 5) {
                            aqyVarB = aquVar.b(this.U.K(3));
                            aqyVarB2 = aquVar.b(this.U.K(5));
                        } else {
                            aqyVarB = aquVar.b(this.U.K(2));
                            aqyVarB2 = aquVar.b(this.U.K(4));
                        }
                        aqy aqyVar6 = aqyVarB;
                        aqt aqtVarA = aquVar.a();
                        aqy aqyVar7 = aqyVarB2;
                        aqyVarB4 = aqyVarB4;
                        Object[] objArr = i36 == true ? 1 : 0;
                        aqyVar3 = aqyVar3;
                        aqtVarA.g(aqyVarB4, aqyVarB3, aqyVar7, aqyVar6, f2);
                        aquVar.e(aqtVarA);
                        z15 = !z2;
                        aqyVar5 = aqyVar5;
                        i36 = objArr == true ? 1 : 0;
                        i18 = i17;
                        z16 = z4;
                    } else {
                        aqyVarB4 = aqyVarB4;
                        aqyVar5 = aqyVar5;
                        aqyVar3 = aqyVar3;
                        z15 = z14;
                        i18 = i17;
                        z16 = true;
                    }
                } else {
                    if (i10 == 1) {
                        i21 = 1;
                    } else if (i10 == 0) {
                        i21 = 0;
                    } else {
                        if (i8 == -2) {
                            i15 = iMin;
                        } else {
                            i15 = i8;
                        }
                        if (i9 == -2) {
                            i16 = iMin;
                        } else {
                            i16 = i9;
                        }
                        if (iMin > 0) {
                            iMin = 0;
                        }
                        if (i15 > 0) {
                            aquVar.g(aqyVarB4, aqyVarB3, i15, 8);
                            iMin = Math.max(iMin, i15);
                        }
                        if (i16 > 0) {
                            if (z2) {
                                aquVar.h(aqyVarB4, aqyVarB3, i16, 8);
                                i20 = i10;
                            } else {
                                aquVar.h(aqyVarB4, aqyVarB3, i16, 8);
                                i20 = i10;
                            }
                            iMin = Math.min(iMin, i16);
                            i17 = i20;
                        } else {
                            i17 = i10;
                        }
                        if (i10 == 1) {
                            if (z2) {
                                aquVar.m(aqyVarB4, aqyVarB3, iMin, 8);
                            } else if (z8) {
                                aquVar.m(aqyVarB4, aqyVarB3, iMin, 5);
                                aquVar.h(aqyVarB4, aqyVarB3, iMin, 8);
                            } else {
                                aquVar.m(aqyVarB4, aqyVarB3, iMin, 5);
                                aquVar.h(aqyVarB4, aqyVarB3, iMin, 8);
                            }
                            i18 = i17;
                        } else if (i10 == 2) {
                            i19 = arcVar.i;
                            if (i19 != 3) {
                                aqyVarB = aquVar.b(this.U.K(3));
                                aqyVarB2 = aquVar.b(this.U.K(5));
                            } else {
                                aqyVarB = aquVar.b(this.U.K(3));
                                aqyVarB2 = aquVar.b(this.U.K(5));
                            }
                            aqy aqyVar8 = aqyVarB;
                            aqt aqtVarA2 = aquVar.a();
                            aqy aqyVar9 = aqyVarB2;
                            aqyVarB4 = aqyVarB4;
                            Object[] objArr2 = i36 == true ? 1 : 0;
                            aqyVar3 = aqyVar3;
                            aqtVarA2.g(aqyVarB4, aqyVarB3, aqyVar9, aqyVar8, f2);
                            aquVar.e(aqtVarA2);
                            z15 = !z2;
                            aqyVar5 = aqyVar5;
                            i36 = objArr2 == true ? 1 : 0;
                            i18 = i17;
                            z16 = z4;
                        } else {
                            aqyVarB4 = aqyVarB4;
                            aqyVar5 = aqyVar5;
                            aqyVar3 = aqyVar3;
                            z15 = z14;
                            i18 = i17;
                            z16 = true;
                        }
                    }
                    int iMax = Math.max(i8, iMin);
                    if (i9 > 0) {
                        iMax = Math.min(i9, iMax);
                    }
                    aquVar.m(aqyVarB4, aqyVarB3, iMax, 8);
                    i18 = i21;
                    i16 = i9;
                    aqyVarB4 = aqyVarB4;
                    z16 = z4;
                    i15 = i8;
                    aqyVar5 = aqyVar5;
                    aqyVar3 = aqyVar3;
                    z15 = false;
                }
                if (z11 || z8) {
                    boolean z27 = z16;
                    if (i36 >= 2 && z2 && z27) {
                        aquVar.g(aqyVarB3, aqyVar, 0, 8);
                        boolean z28 = z || this.N.e == null;
                        if (!z && (arcVar3 = this.N.e) != null) {
                            ard ardVar2 = arcVar3.d;
                            if (ardVar2.X == 0.0f) {
                                return;
                            }
                            int[] iArr = ardVar2.aq;
                            if (iArr[0] != 3 || iArr[1] != 3) {
                                return;
                            }
                        } else if (!z28) {
                            return;
                        }
                        aquVar.g(aqyVar2, aqyVarB4, 0, 8);
                        return;
                    }
                    return;
                }
                if (!zH && !zH2 && !zH3) {
                    z17 = z2;
                    z16 = z16;
                    i23 = 5;
                } else if (!zH) {
                    z16 = z16;
                    if (zH2) {
                        aquVar.m(aqyVarB4, aqyVar5, -arcVar2.b(), 8);
                        if (z2) {
                            i22 = 5;
                            aquVar.g(aqyVarB3, aqyVar, 0, 5);
                        } else {
                            i22 = 5;
                        }
                    } else {
                        i22 = 5;
                    }
                    z17 = z2;
                    i23 = i22;
                } else if (zH2) {
                    if (zH2) {
                        ard ardVar3 = arcVar.e.d;
                        ard ardVar4 = arcVar2.e.d;
                        ard ardVar5 = this.U;
                        int i39 = 6;
                        if (z15) {
                            if (i18 == 0) {
                                if (i16 != 0 || i15 != 0) {
                                    i33 = i15;
                                    i34 = 5;
                                    i35 = 5;
                                    z25 = true;
                                    z26 = false;
                                    z18 = true;
                                } else {
                                    if (aqyVar3.g && aqyVar5.g) {
                                        aquVar.m(aqyVarB3, aqyVar3, arcVar.b(), 8);
                                        aquVar.m(aqyVarB4, aqyVar5, -arcVar2.b(), 8);
                                        return;
                                    }
                                    i34 = 8;
                                    i35 = 8;
                                    z25 = false;
                                    z26 = true;
                                    z18 = false;
                                    i33 = 0;
                                }
                                if ((ardVar3 instanceof ara) || (ardVar4 instanceof ara)) {
                                    z20 = z26;
                                    i15 = i33;
                                    i24 = 4;
                                    i25 = i34;
                                    z19 = z25;
                                } else {
                                    z20 = z26;
                                    i15 = i33;
                                    i25 = i34;
                                    i24 = i35;
                                    z19 = z25;
                                }
                            } else {
                                if (i18 == 2) {
                                    if ((ardVar3 instanceof ara) || (ardVar4 instanceof ara)) {
                                        i25 = 5;
                                    } else {
                                        aquVar = aquVar;
                                        i15 = i15;
                                        i18 = i18;
                                        aqyVar3 = aqyVar3;
                                        i39 = 6;
                                        i25 = 5;
                                        i24 = 5;
                                    }
                                    z18 = true;
                                    z19 = true;
                                    z20 = false;
                                    aqyVar2 = aqyVar2;
                                } else {
                                    if (i18 == 1) {
                                        i25 = 8;
                                    } else if (i18 == 3) {
                                        if (this.B == -1) {
                                            aquVar = aquVar;
                                            i15 = i15;
                                            aqyVar3 = aqyVar3;
                                            i25 = 8;
                                            i18 = 3;
                                            if (z9) {
                                                i39 = z2 ? 5 : 4;
                                            } else {
                                                i39 = 8;
                                            }
                                        } else {
                                            if (z6) {
                                                if (i7 == 2 || i7 == 1) {
                                                    i31 = 5;
                                                    i32 = 4;
                                                } else {
                                                    i31 = 8;
                                                    i32 = 5;
                                                }
                                                i25 = i31;
                                                i24 = i32;
                                                i15 = i15;
                                                i18 = 3;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                            } else if (i16 > 0) {
                                                aquVar = aquVar;
                                                i15 = i15;
                                                aqyVar3 = aqyVar3;
                                                i39 = 6;
                                                i25 = 5;
                                                i18 = 3;
                                            } else if (i16 != 0 || i15 != 0) {
                                                aquVar = aquVar;
                                                i15 = i15;
                                                aqyVar3 = aqyVar3;
                                                i39 = 6;
                                                i25 = 5;
                                                i18 = 3;
                                                i24 = 4;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                            } else if (z9) {
                                                i25 = (ardVar3 == ardVar5 || ardVar4 == ardVar5) ? 5 : 4;
                                                i18 = 3;
                                                i24 = 4;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                                i15 = 0;
                                            } else {
                                                aquVar = aquVar;
                                                aqyVar3 = aqyVar3;
                                                i39 = 6;
                                                i25 = 5;
                                                i18 = 3;
                                                i24 = 8;
                                                z18 = true;
                                                z19 = true;
                                                z20 = true;
                                                i15 = 0;
                                            }
                                            aquVar = aquVar;
                                        }
                                        i24 = 5;
                                        z18 = true;
                                        z19 = true;
                                        z20 = true;
                                    } else {
                                        aquVar = aquVar;
                                        i15 = i15;
                                        i18 = i18;
                                        aqyVar3 = aqyVar3;
                                        i39 = 6;
                                        i25 = 5;
                                        i24 = 4;
                                        z18 = false;
                                        z19 = false;
                                        z20 = false;
                                    }
                                    aqyVar2 = aqyVar2;
                                }
                                i24 = 4;
                                z18 = true;
                                z19 = true;
                                z20 = false;
                                aqyVar2 = aqyVar2;
                            }
                            if (z18 || aqyVar3 != aqyVar5 || ardVar3 == ardVar5) {
                                z21 = z18;
                                z22 = true;
                            } else {
                                z22 = false;
                                z21 = false;
                            }
                            if (z19) {
                                if (!z15 || z7 || z9) {
                                    aqyVar4 = aqyVar;
                                } else {
                                    aqyVar4 = aqyVar;
                                    if (aqyVar3 == aqyVar4 && aqyVar5 == aqyVar2) {
                                        i30 = 8;
                                        z17 = false;
                                        i29 = 8;
                                        z24 = false;
                                    }
                                    aqy aqyVar10 = aqyVar5;
                                    ardVar = ardVar3;
                                    aqy aqyVar11 = aqyVarB4;
                                    aquVar.d(aqyVarB3, aqyVar3, arcVar.b(), f, aqyVar10, aqyVar11, arcVar2.b(), i30);
                                    aqyVar5 = aqyVar10;
                                    aqyVarB4 = aqyVar11;
                                    aqyVarB3 = aqyVarB3;
                                    i25 = i29;
                                    z22 = z24;
                                }
                                z24 = z22;
                                i29 = i25;
                                i30 = i39;
                                z17 = z2;
                                aqy aqyVar12 = aqyVar5;
                                ardVar = ardVar3;
                                aqy aqyVar13 = aqyVarB4;
                                aquVar.d(aqyVarB3, aqyVar3, arcVar.b(), f, aqyVar12, aqyVar13, arcVar2.b(), i30);
                                aqyVar5 = aqyVar12;
                                aqyVarB4 = aqyVar13;
                                aqyVarB3 = aqyVarB3;
                                i25 = i29;
                                z22 = z24;
                            } else {
                                aqyVar4 = aqyVar;
                                ardVar = ardVar3;
                                z17 = z2;
                            }
                            if (this.ah != 8 && !arcVar2.g()) {
                                return;
                            }
                            if (z21) {
                                if (z17 && aqyVar3 != aqyVar5 && !z15 && ((ardVar instanceof ara) || (ardVar4 instanceof ara))) {
                                    i25 = 6;
                                }
                                aquVar.g(aqyVarB3, aqyVar3, arcVar.b(), i25);
                                aquVar.h(aqyVarB4, aqyVar5, -arcVar2.b(), i25);
                            }
                            if (z17 || !z10 || (ardVar instanceof ara) || (ardVar4 instanceof ara) || ardVar4 == ardVar5) {
                                iMin2 = i24;
                            } else {
                                iMin2 = 6;
                                i25 = 6;
                                z22 = true;
                            }
                            if (z22) {
                                if (z20 && (z9 == 0 || z3)) {
                                    if (ardVar != ardVar5 && ardVar4 != ardVar5) {
                                        i39 = iMin2;
                                    }
                                    if ((ardVar instanceof arg) || (ardVar4 instanceof arg)) {
                                        i39 = 5;
                                    }
                                    if (!(ardVar instanceof ara) || (ardVar4 instanceof ara)) {
                                        z23 = true;
                                        i39 = 5;
                                    } else {
                                        z23 = true;
                                    }
                                    if (z23 == z9) {
                                        i28 = 5;
                                    } else {
                                        i28 = i39;
                                    }
                                    iMin2 = Math.max(i28, iMin2);
                                }
                                if (z17) {
                                    iMin2 = Math.min(i25, iMin2);
                                    if (!z6 && z9 == 0 && (ardVar == ardVar5 || ardVar4 == ardVar5)) {
                                        i27 = 4;
                                    } else {
                                        i27 = iMin2;
                                    }
                                } else {
                                    i27 = iMin2;
                                }
                                aquVar.m(aqyVarB3, aqyVar3, arcVar.b(), i27);
                                aquVar.m(aqyVarB4, aqyVar5, -arcVar2.b(), i27);
                            }
                            if (z17) {
                                if (aqyVar3 == aqyVar4) {
                                    iB = arcVar.b();
                                } else {
                                    iB = 0;
                                }
                                if (aqyVar3 != aqyVar4) {
                                    i26 = 5;
                                    aquVar.g(aqyVarB3, aqyVar4, iB, 5);
                                } else {
                                    i26 = 5;
                                }
                            } else {
                                i26 = 5;
                            }
                            if (!z17 && z15 && i4 == 0 && i15 == 0) {
                                if (i18 == 3) {
                                    aquVar.g(aqyVarB4, aqyVarB3, 0, 8);
                                    i23 = i26;
                                } else {
                                    aquVar.g(aqyVarB4, aqyVarB3, 0, i26);
                                }
                            }
                        } else {
                            if (aqyVar3.g && aqyVar5.g) {
                                aquVar.d(aqyVarB3, aqyVar3, arcVar.b(), f, aqyVar5, aqyVarB4, arcVar2.b(), 8);
                                if (z2 && z16) {
                                    int iB2 = arcVar2.e != null ? arcVar2.b() : 0;
                                    if (aqyVar5 != aqyVar2) {
                                        aquVar.g(aqyVar2, aqyVarB4, iB2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i15 = i15;
                            i24 = 4;
                            z18 = true;
                            z19 = true;
                            z20 = false;
                            i25 = 5;
                        }
                        i39 = 6;
                        if (z18) {
                            z21 = z18;
                            z22 = true;
                        } else {
                            z21 = z18;
                            z22 = true;
                        }
                        if (z19) {
                            if (z15) {
                                aqyVar4 = aqyVar;
                                z24 = z22;
                                i29 = i25;
                                i30 = i39;
                                z17 = z2;
                            } else {
                                aqyVar4 = aqyVar;
                                z24 = z22;
                                i29 = i25;
                                i30 = i39;
                                z17 = z2;
                            }
                            aqy aqyVar14 = aqyVar5;
                            ardVar = ardVar3;
                            aqy aqyVar15 = aqyVarB4;
                            aquVar.d(aqyVarB3, aqyVar3, arcVar.b(), f, aqyVar14, aqyVar15, arcVar2.b(), i30);
                            aqyVar5 = aqyVar14;
                            aqyVarB4 = aqyVar15;
                            aqyVarB3 = aqyVarB3;
                            i25 = i29;
                            z22 = z24;
                        } else {
                            aqyVar4 = aqyVar;
                            ardVar = ardVar3;
                            z17 = z2;
                        }
                        if (this.ah != 8) {
                        }
                        if (z21) {
                            if (z17) {
                                i25 = 6;
                            }
                            aquVar.g(aqyVarB3, aqyVar3, arcVar.b(), i25);
                            aquVar.h(aqyVarB4, aqyVar5, -arcVar2.b(), i25);
                        }
                        if (z17) {
                            iMin2 = i24;
                        } else {
                            iMin2 = i24;
                        }
                        if (z22) {
                            if (z20) {
                                if (ardVar != ardVar5) {
                                    i39 = iMin2;
                                }
                                if (ardVar instanceof arg) {
                                    i39 = 5;
                                } else {
                                    i39 = 5;
                                }
                                if (ardVar instanceof ara) {
                                    z23 = true;
                                    i39 = 5;
                                } else {
                                    z23 = true;
                                    i39 = 5;
                                }
                                if (z23 == z9) {
                                    i28 = 5;
                                } else {
                                    i28 = i39;
                                }
                                iMin2 = Math.max(i28, iMin2);
                            }
                            if (z17) {
                                iMin2 = Math.min(i25, iMin2);
                                if (!z6) {
                                    i27 = iMin2;
                                } else {
                                    i27 = iMin2;
                                }
                            } else {
                                i27 = iMin2;
                            }
                            aquVar.m(aqyVarB3, aqyVar3, arcVar.b(), i27);
                            aquVar.m(aqyVarB4, aqyVar5, -arcVar2.b(), i27);
                        }
                        if (z17) {
                            i26 = 5;
                        } else {
                            if (aqyVar3 == aqyVar4) {
                                iB = arcVar.b();
                            } else {
                                iB = 0;
                            }
                            if (aqyVar3 != aqyVar4) {
                                i26 = 5;
                                aquVar.g(aqyVarB3, aqyVar4, iB, 5);
                            } else {
                                i26 = 5;
                            }
                        }
                        if (!z17) {
                        }
                    } else {
                        z16 = z16;
                        z17 = z2;
                    }
                    i23 = 5;
                } else {
                    ard ardVar6 = arcVar.e.d;
                    if (z2 && (ardVar6 instanceof ara)) {
                        z17 = z2;
                        z16 = z16;
                        i23 = 8;
                    } else {
                        z17 = z2;
                        z16 = z16;
                        i23 = 5;
                    }
                }
                if (z17 && z16) {
                    int iB3 = arcVar2.e != null ? arcVar2.b() : 0;
                    if (aqyVar5 != aqyVar2) {
                        aquVar.g(aqyVar2, aqyVarB4, iB3, i23);
                        return;
                    }
                    return;
                }
                return;
            }
            if (z5) {
                aquVar.m(aqyVarB4, aqyVarB3, 0, 3);
                if (i4 > 0) {
                    aquVar.g(aqyVarB4, aqyVarB3, i4, 8);
                }
                if (i5 < Integer.MAX_VALUE) {
                    aquVar.h(aqyVarB4, aqyVarB3, i5, 8);
                }
            } else {
                aquVar.m(aqyVarB4, aqyVarB3, iMin, 8);
            }
            i15 = i8;
            i16 = i9;
            i18 = i10;
            z15 = z14;
            z16 = z4;
            if (z11) {
            }
            boolean z29 = z16;
            if (i36 >= 2) {
            }
        }
        i10 = i37;
        i11 = this.k;
        if (i11 != -1) {
            this.k = -1;
            i3 = i11;
            z12 = false;
        }
        i12 = this.l;
        if (i12 != -1) {
            i12 = i3;
        } else {
            i12 = i3;
        }
        i13 = this.ah;
        i14 = i12;
        if (i13 == 8) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (i13 == 8) {
            iMin = 0;
        } else {
            iMin = i14;
        }
        if (z11) {
            if (zH) {
                if (zH) {
                    aquVar.m(aqyVarB3, aqyVarB5, arcVar.b(), 8);
                }
            } else if (zH) {
                aquVar.m(aqyVarB3, aqyVarB5, arcVar.b(), 8);
            }
        }
        z14 = z13 & z12;
        aqyVar3 = aqyVarB5;
        if (!z14) {
            if (i36 != 2) {
                if (i8 == -2) {
                    i15 = iMin;
                } else {
                    i15 = i8;
                }
                if (i9 == -2) {
                    i16 = iMin;
                } else {
                    i16 = i9;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i15 > 0) {
                    aquVar.g(aqyVarB4, aqyVarB3, i15, 8);
                    iMin = Math.max(iMin, i15);
                }
                if (i16 > 0) {
                    if (z2) {
                        aquVar.h(aqyVarB4, aqyVarB3, i16, 8);
                        i20 = i10;
                    } else {
                        aquVar.h(aqyVarB4, aqyVarB3, i16, 8);
                        i20 = i10;
                    }
                    iMin = Math.min(iMin, i16);
                    i17 = i20;
                } else {
                    i17 = i10;
                }
                if (i10 == 1) {
                    if (z2) {
                        aquVar.m(aqyVarB4, aqyVarB3, iMin, 8);
                    } else if (z8) {
                        aquVar.m(aqyVarB4, aqyVarB3, iMin, 5);
                        aquVar.h(aqyVarB4, aqyVarB3, iMin, 8);
                    } else {
                        aquVar.m(aqyVarB4, aqyVarB3, iMin, 5);
                        aquVar.h(aqyVarB4, aqyVarB3, iMin, 8);
                    }
                    i18 = i17;
                } else if (i10 == 2) {
                    i19 = arcVar.i;
                    if (i19 != 3) {
                        aqyVarB = aquVar.b(this.U.K(3));
                        aqyVarB2 = aquVar.b(this.U.K(5));
                    } else {
                        aqyVarB = aquVar.b(this.U.K(3));
                        aqyVarB2 = aquVar.b(this.U.K(5));
                    }
                    aqy aqyVar16 = aqyVarB;
                    aqt aqtVarA3 = aquVar.a();
                    aqy aqyVar17 = aqyVarB2;
                    aqyVarB4 = aqyVarB4;
                    Object[] objArr3 = i36 == true ? 1 : 0;
                    aqyVar3 = aqyVar3;
                    aqtVarA3.g(aqyVarB4, aqyVarB3, aqyVar17, aqyVar16, f2);
                    aquVar.e(aqtVarA3);
                    z15 = !z2;
                    aqyVar5 = aqyVar5;
                    i36 = objArr3 == true ? 1 : 0;
                    i18 = i17;
                    z16 = z4;
                } else {
                    aqyVarB4 = aqyVarB4;
                    aqyVar5 = aqyVar5;
                    aqyVar3 = aqyVar3;
                    z15 = z14;
                    i18 = i17;
                    z16 = true;
                }
            } else {
                if (i8 == -2) {
                    i15 = iMin;
                } else {
                    i15 = i8;
                }
                if (i9 == -2) {
                    i16 = iMin;
                } else {
                    i16 = i9;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i15 > 0) {
                    aquVar.g(aqyVarB4, aqyVarB3, i15, 8);
                    iMin = Math.max(iMin, i15);
                }
                if (i16 > 0) {
                    if (z2) {
                        aquVar.h(aqyVarB4, aqyVarB3, i16, 8);
                        i20 = i10;
                    } else {
                        aquVar.h(aqyVarB4, aqyVarB3, i16, 8);
                        i20 = i10;
                    }
                    iMin = Math.min(iMin, i16);
                    i17 = i20;
                } else {
                    i17 = i10;
                }
                if (i10 == 1) {
                    if (z2) {
                        aquVar.m(aqyVarB4, aqyVarB3, iMin, 8);
                    } else if (z8) {
                        aquVar.m(aqyVarB4, aqyVarB3, iMin, 5);
                        aquVar.h(aqyVarB4, aqyVarB3, iMin, 8);
                    } else {
                        aquVar.m(aqyVarB4, aqyVarB3, iMin, 5);
                        aquVar.h(aqyVarB4, aqyVarB3, iMin, 8);
                    }
                    i18 = i17;
                } else if (i10 == 2) {
                    i19 = arcVar.i;
                    if (i19 != 3) {
                        aqyVarB = aquVar.b(this.U.K(3));
                        aqyVarB2 = aquVar.b(this.U.K(5));
                    } else {
                        aqyVarB = aquVar.b(this.U.K(3));
                        aqyVarB2 = aquVar.b(this.U.K(5));
                    }
                    aqy aqyVar18 = aqyVarB;
                    aqt aqtVarA4 = aquVar.a();
                    aqy aqyVar19 = aqyVarB2;
                    aqyVarB4 = aqyVarB4;
                    Object[] objArr4 = i36 == true ? 1 : 0;
                    aqyVar3 = aqyVar3;
                    aqtVarA4.g(aqyVarB4, aqyVarB3, aqyVar19, aqyVar18, f2);
                    aquVar.e(aqtVarA4);
                    z15 = !z2;
                    aqyVar5 = aqyVar5;
                    i36 = objArr4 == true ? 1 : 0;
                    i18 = i17;
                    z16 = z4;
                } else {
                    aqyVarB4 = aqyVarB4;
                    aqyVar5 = aqyVar5;
                    aqyVar3 = aqyVar3;
                    z15 = z14;
                    i18 = i17;
                    z16 = true;
                }
            }
            if (z11) {
            }
            boolean z210 = z16;
            if (i36 >= 2) {
            }
        }
        if (z5) {
            aquVar.m(aqyVarB4, aqyVarB3, 0, 3);
            if (i4 > 0) {
                aquVar.g(aqyVarB4, aqyVarB3, i4, 8);
            }
            if (i5 < Integer.MAX_VALUE) {
                aquVar.h(aqyVarB4, aqyVarB3, i5, 8);
            }
        } else {
            aquVar.m(aqyVarB4, aqyVarB3, iMin, 8);
        }
        i15 = i8;
        i16 = i9;
        i18 = i10;
        z15 = z14;
        z16 = z4;
        if (z11) {
        }
        boolean z211 = z16;
        if (i36 >= 2) {
        }
    }

    public final void A(int i) {
        if (i < 0) {
            i = 0;
        }
        this.ad = i;
    }

    public final void B(int i) {
        if (i < 0) {
            i = 0;
        }
        this.ac = i;
    }

    public final void C(int i) {
        this.V = i;
        int i2 = this.ac;
        if (i < i2) {
            this.V = i2;
        }
    }

    public void D(boolean z, boolean z2) {
        int i;
        int i2;
        aru aruVar = this.h;
        boolean z3 = z & aruVar.g;
        arv arvVar = this.i;
        boolean z4 = z2 & arvVar.g;
        int i3 = aruVar.h.f;
        int i4 = arvVar.h.f;
        int i5 = aruVar.i.f;
        int i6 = arvVar.i.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.Z = i3;
        }
        if (z4) {
            this.aa = i4;
        }
        if (this.ah == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.aq[0] == 1 && i8 < (i2 = this.V)) {
                i8 = i2;
            }
            this.V = i8;
            int i9 = this.ac;
            if (i8 < i9) {
                this.V = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.aq[1] == 1 && i10 < (i = this.W)) {
                i10 = i;
            }
            this.W = i10;
            int i11 = this.ad;
            if (i10 < i11) {
                this.W = i11;
            }
        }
    }

    final boolean E() {
        return (this instanceof arj) || (this instanceof arg);
    }

    public final boolean F(int i) {
        if (i == 0) {
            if ((this.J.e != null ? 1 : 0) + (this.L.e != null ? 1 : 0) < 2) {
                return true;
            }
        } else {
            if ((this.K.e != null ? 1 : 0) + (this.M.e != null ? 1 : 0) + (this.N.e != null ? 1 : 0) < 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean G(int i, int i2) {
        arc arcVar;
        arc arcVar2;
        arc arcVar3;
        arc arcVar4;
        if (i == 0) {
            arc arcVar5 = this.J;
            arc arcVar6 = arcVar5.e;
            if (arcVar6 != null && arcVar6.c && (arcVar4 = (arcVar3 = this.L).e) != null && arcVar4.c && (arcVar4.a() - arcVar3.b()) - (arcVar5.e.a() + arcVar5.b()) >= i2) {
                return true;
            }
        } else {
            arc arcVar7 = this.K;
            arc arcVar8 = arcVar7.e;
            if (arcVar8 != null && arcVar8.c && (arcVar2 = (arcVar = this.M).e) != null && arcVar2.c && (arcVar2.a() - arcVar.b()) - (arcVar7.e.a() + arcVar7.b()) >= i2) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        arc arcVar;
        arc arcVar2;
        arc arcVar3 = this.J;
        arc arcVar4 = arcVar3.e;
        return (arcVar4 != null && arcVar4.e == arcVar3) || ((arcVar2 = (arcVar = this.L).e) != null && arcVar2.e == arcVar);
    }

    public final boolean I() {
        arc arcVar;
        arc arcVar2;
        arc arcVar3 = this.K;
        arc arcVar4 = arcVar3.e;
        return (arcVar4 != null && arcVar4.e == arcVar3) || ((arcVar2 = (arcVar = this.M).e) != null && arcVar2.e == arcVar);
    }

    public final boolean J() {
        return this.a && this.ah != 8;
    }

    public arc K(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return this.J;
        }
        if (i2 == 2) {
            return this.K;
        }
        if (i2 == 3) {
            return this.L;
        }
        if (i2 != 4) {
            return i2 != 5 ? this.Q : this.N;
        }
        return this.M;
    }

    public final int L(int i) {
        return i == 0 ? M() : N();
    }

    public final int M() {
        return this.aq[0];
    }

    public final int N() {
        return this.aq[1];
    }

    public final void O(int i, ard ardVar, int i2, int i3, int i4) {
        K(i).j(ardVar.K(i2), i3, i4);
    }

    public final void P(int i) {
        this.aq[0] = i;
    }

    public final void Q(int i) {
        this.aq[1] = i;
    }

    public void R(boolean z) {
        int i;
        arv arvVar;
        aru aruVar;
        int iO = aqu.o(this.J);
        int iO2 = aqu.o(this.K);
        int iO3 = aqu.o(this.L);
        int iO4 = aqu.o(this.M);
        if (z && (aruVar = this.h) != null) {
            arp arpVar = aruVar.h;
            if (arpVar.i) {
                arp arpVar2 = aruVar.i;
                if (arpVar2.i) {
                    iO = arpVar.f;
                    iO3 = arpVar2.f;
                }
            }
        }
        if (z && (arvVar = this.i) != null) {
            arp arpVar3 = arvVar.h;
            if (arpVar3.i) {
                arp arpVar4 = arvVar.i;
                if (arpVar4.i) {
                    iO2 = arpVar3.f;
                    iO4 = arpVar4.f;
                }
            }
        }
        if (iO3 - iO < 0 || iO4 - iO2 < 0 || iO == Integer.MIN_VALUE || iO == Integer.MAX_VALUE || iO2 == Integer.MIN_VALUE || iO2 == Integer.MAX_VALUE || iO3 == Integer.MIN_VALUE || iO3 == Integer.MAX_VALUE || iO4 == Integer.MIN_VALUE || iO4 == Integer.MAX_VALUE) {
            iO = 0;
            iO2 = 0;
            iO3 = 0;
            iO4 = 0;
        }
        this.Z = iO;
        this.aa = iO2;
        if (this.ah == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        int i2 = iO3 - iO;
        int[] iArr = this.aq;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.V;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = iO4 - iO2;
        if (iArr[1] == 1 && i5 < (i = this.W)) {
            i5 = i;
        }
        this.V = i2;
        this.W = i5;
        int i6 = this.ad;
        if (i5 < i6) {
            this.W = i6;
        }
        int i7 = this.ac;
        if (i2 < i7) {
            this.V = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.w;
        if (i8 > 0 && i3 == 3) {
            this.V = Math.min(i7, i8);
        }
        int i9 = this.z;
        if (i9 > 0 && iArr[1] == 3) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.V;
        if (i2 != i10) {
            this.k = i10;
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.l = i11;
        }
    }

    public void S(aeiv aeivVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:119:0x0209  */
    /* JADX WARN: Code duplicated, block: B:122:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x021e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0244  */
    /* JADX WARN: Code duplicated, block: B:135:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x024a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0250  */
    /* JADX WARN: Code duplicated, block: B:145:0x026b  */
    /* JADX WARN: Code duplicated, block: B:146:0x026f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0271  */
    /* JADX WARN: Code duplicated, block: B:150:0x027b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0284  */
    /* JADX WARN: Code duplicated, block: B:154:0x0287  */
    /* JADX WARN: Code duplicated, block: B:157:0x0296  */
    /* JADX WARN: Code duplicated, block: B:158:0x0299  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x02db  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:207:0x0335  */
    /* JADX WARN: Code duplicated, block: B:217:0x0353  */
    /* JADX WARN: Code duplicated, block: B:220:0x035d  */
    /* JADX WARN: Code duplicated, block: B:222:0x0363  */
    /* JADX WARN: Code duplicated, block: B:227:0x0377  */
    /* JADX WARN: Code duplicated, block: B:229:0x037b  */
    /* JADX WARN: Code duplicated, block: B:232:0x038d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x038f  */
    /* JADX WARN: Code duplicated, block: B:237:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:239:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:242:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:249:0x03e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:250:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x041e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x0438 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x043e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:270:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x044a  */
    /* JADX WARN: Code duplicated, block: B:276:0x0453  */
    /* JADX WARN: Code duplicated, block: B:279:0x0459  */
    /* JADX WARN: Code duplicated, block: B:282:0x045d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0476  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[LOOP:0: B:25:0x0065->B:28:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:319:0x0573  */
    /* JADX WARN: Code duplicated, block: B:323:0x0595  */
    /* JADX WARN: Code duplicated, block: B:340:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:343:0x05f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:382:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:384:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:386:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:387:0x06df  */
    /* JADX WARN: Code duplicated, block: B:388:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:391:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:395:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0083 A[EDGE_INSN: B:396:0x0083->B:35:0x0083 BREAK  A[LOOP:0: B:25:0x0065->B:28:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:79:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0163  */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v19 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v19 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v20 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v20 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v6 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v6 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v6 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v6 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v6 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v18 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v16 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v16 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v37 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v37 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: aqy
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r53v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r53v0 ??, new type: aqu
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ard] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v24, types: [are] */
    /* JADX WARN: Type inference failed for: r13v44, types: [are] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [aqu] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18, types: [aqu] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [aqu] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [aqu] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r20v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [aqy] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v14, types: [aqy] */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [aqy] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [aqy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r53v0, types: [aqu] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16, types: [aqy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [ard] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [aqy] */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    public void b(aqu aquVar, boolean z) {
        arc arcVar;
        int i;
        int i2;
        int i3;
        int i4;
        ard ardVar;
        are areVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        ?? r6;
        ?? r5;
        ard ardVar2;
        are areVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        int i5;
        ?? r7;
        boolean zI;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        ?? r27;
        boolean z2;
        int i12;
        boolean z3;
        int i13;
        float f;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z4;
        boolean z5;
        char c;
        boolean z6;
        boolean z7;
        arc arcVar2;
        arc arcVar3;
        boolean z8;
        int i19;
        boolean z9;
        ?? r4;
        ?? r3;
        ?? r1;
        ?? r15;
        boolean z10;
        ?? r19;
        ?? r8;
        ?? r2;
        ?? r9;
        aqy aqyVar;
        ?? r10;
        int i20;
        int i21;
        int i22;
        int i23;
        ?? r11;
        int i24;
        float f2;
        int i25;
        arc arcVar4;
        ?? r28;
        arv arvVar;
        aru aruVar;
        boolean z11;
        int i26;
        int i27;
        int i28;
        float f3;
        int i29;
        int i30;
        ?? H;
        ?? r12;
        aru aruVar2;
        arv arvVar2;
        ArrayList arrayList;
        int size;
        int i31;
        boolean[] zArr;
        ?? r0 = this;
        ?? r13 = aquVar;
        arc arcVar5 = r0.J;
        arc arcVar6 = r0.K;
        aqy aqyVarB = r13.b(arcVar5);
        arc arcVar7 = r0.L;
        aqy aqyVarB2 = r13.b(arcVar7);
        aqy aqyVarB3 = r13.b(arcVar6);
        arc arcVar8 = r0.M;
        aqy aqyVarB4 = r13.b(arcVar8);
        arc arcVar9 = r0.N;
        aqy aqyVarB5 = r13.b(arcVar9);
        ard ardVar3 = r0.U;
        if (ardVar3 != null) {
            int[] iArr2 = ardVar3.aq;
            i = 0;
            i2 = iArr2[0] == 2 ? 1 : 0;
            i3 = iArr2[1] == 2 ? 1 : 0;
            arcVar = arcVar9;
            int i32 = r0.r;
            if (i32 == 1) {
                i3 = 0;
            } else if (i32 == 2) {
                i2 = 0;
            } else if (i32 == 3) {
            }
            if (r0.ah == 8) {
                arrayList = r0.S;
                i4 = 1;
                size = arrayList.size();
                i31 = i;
                while (true) {
                    if (i31 < size) {
                        zArr = r0.T;
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    if (!((arc) arrayList.get(i31)).g()) {
                        break;
                    } else {
                        i31++;
                    }
                }
            } else {
                i4 = 1;
            }
            if (!r0.b) {
                if (r0.m) {
                    if (z || (aruVar2 = r0.h) == null || (arvVar2 = r0.i) == null) {
                        i5 = i3;
                    } else {
                        arp arpVar = aruVar2.h;
                        i5 = i3;
                        if (arpVar.i && aruVar2.i.i && arvVar2.h.i && arvVar2.i.i) {
                            r13.f(aqyVarB, arpVar.f);
                            r13.f(aqyVarB2, r0.h.i.f);
                            r13.f(aqyVarB3, r0.i.h.f);
                            r13.f(aqyVarB4, r0.i.i.f);
                            r13.f(aqyVarB5, r0.i.a.f);
                            if (r0.U != null) {
                                if (i2 != 0 && r0.j[i] && !r0.H()) {
                                    r13.g(r13.b(r0.U.L), aqyVarB2, i, 8);
                                }
                                if (i5 != 0 && r0.j[i4] && !r0.I()) {
                                    r5 = 0;
                                    r13.g(r13.b(r0.U.M), aqyVarB4, 0, 8);
                                    r6 = r0;
                                }
                            }
                            r12 = r0;
                        }
                        r5 = 0;
                        r6 = r12;
                    }
                    if (r0.U != null) {
                        if (r0.a(0)) {
                            ((are) r0.U).a(r0, 0);
                            int i33 = i4;
                            i30 = i33 == true ? 1 : 0;
                            H = i33;
                        } else {
                            i30 = i4;
                            H = r0.H();
                        }
                        if (r0.a(i30)) {
                            ((are) r0.U).a(r0, i30);
                            zI = true;
                        } else {
                            zI = r0.I();
                        }
                        if (H != 0 && i2 != 0 && r0.ah != 8 && arcVar5.e == null && arcVar7.e == null) {
                            r13.g(r13.b(r0.U.L), aqyVarB2, 0, 1);
                        }
                        if (zI) {
                            r7 = H;
                        } else if (i5 != 0) {
                            if (r0.ah != 8 && arcVar6.e == null && arcVar8.e == null && arcVar == null) {
                                r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                            }
                            r7 = H;
                            i5 = 1;
                        } else {
                            r7 = H;
                            i5 = 0;
                        }
                    } else {
                        aqyVarB3 = aqyVarB3;
                        r7 = 0;
                        zI = false;
                    }
                    i6 = r0.V;
                    i7 = r0.ac;
                    if (i6 >= i7) {
                        i7 = i6;
                    }
                    i8 = r0.W;
                    i9 = r0.ad;
                    if (i8 >= i9) {
                        i10 = i8;
                    } else {
                        i10 = i9;
                    }
                    iArr = r0.aq;
                    i11 = iArr[0];
                    r27 = r7;
                    if (i11 != 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i12 = iArr[1];
                    if (i12 != 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i13 = r0.Y;
                    r0.B = i13;
                    f = r0.X;
                    r0.C = f;
                    i14 = r0.s;
                    i15 = r0.t;
                    if (f > 0.0f || r0.ah == 8) {
                        arcVar5 = arcVar5;
                        i16 = i13;
                        i17 = i14;
                        i18 = i15;
                    } else {
                        if (i11 == 3) {
                            if (i14 == 0) {
                                i17 = 3;
                                i26 = 3;
                            } else {
                                i26 = 3;
                            }
                            if (i12 == 3) {
                                i27 = i12;
                                i18 = i15;
                            } else if (i15 == 0) {
                                i18 = 3;
                                i27 = 3;
                            } else {
                                i18 = i15;
                                i27 = 3;
                            }
                            if (i26 != 3 && i27 == 3 && i17 == 3) {
                                if (i18 == 3) {
                                    if (i13 != -1) {
                                        if (i13 == 0) {
                                            if (arcVar6.h()) {
                                            }
                                            r0.B = 1;
                                        }
                                        if (r0.B == -1) {
                                            if (!arcVar6.h()) {
                                                if (arcVar5.h()) {
                                                    r0.C = 1.0f / r0.C;
                                                    r0.B = 1;
                                                }
                                            } else if (arcVar5.h()) {
                                                r0.C = 1.0f / r0.C;
                                                r0.B = 1;
                                            }
                                        }
                                        i13 = r0.B;
                                        if (i13 != -1) {
                                            i16 = i13;
                                        } else {
                                            i29 = r0.v;
                                            if (i29 <= 0) {
                                                if (i29 == 0) {
                                                    i16 = i13;
                                                } else {
                                                    i16 = i13;
                                                }
                                            } else if (i29 == 0) {
                                                i16 = i13;
                                            } else {
                                                i16 = i13;
                                            }
                                        }
                                        z4 = true;
                                    } else if (z2) {
                                        if (!z3) {
                                            r0.B = 0;
                                            if (arcVar6.h() || !arcVar8.h()) {
                                                r0.B = 1;
                                            }
                                        }
                                        if (r0.B == -1 && (!arcVar6.h() || !arcVar8.h() || !arcVar5.h() || !arcVar7.h())) {
                                            if (!arcVar6.h() && arcVar8.h()) {
                                                r0.B = 0;
                                            } else if (arcVar5.h() && arcVar7.h()) {
                                                r0.C = 1.0f / r0.C;
                                                r0.B = 1;
                                            }
                                        }
                                        i13 = r0.B;
                                        if (i13 != -1) {
                                            i16 = i13;
                                        } else {
                                            i29 = r0.v;
                                            if (i29 <= 0 && r0.y == 0) {
                                                r0.B = 0;
                                                i16 = 0;
                                                i13 = 0;
                                            } else if (i29 == 0 || r0.y <= 0) {
                                                i16 = i13;
                                            } else {
                                                r0.C = 1.0f / r0.C;
                                                r0.B = 1;
                                                i16 = 1;
                                                i13 = 1;
                                            }
                                        }
                                        z4 = true;
                                    } else if (z3) {
                                        r0.B = 1;
                                        r0.C = 1.0f / f;
                                    }
                                    if (r0.B == 1 && (!arcVar5.h() || !arcVar7.h())) {
                                        r0.B = 0;
                                    }
                                    if (r0.B == -1) {
                                        if (!arcVar6.h()) {
                                            if (arcVar5.h()) {
                                                r0.C = 1.0f / r0.C;
                                                r0.B = 1;
                                            }
                                        } else if (arcVar5.h()) {
                                            r0.C = 1.0f / r0.C;
                                            r0.B = 1;
                                        }
                                    }
                                    i13 = r0.B;
                                    if (i13 != -1) {
                                        i16 = i13;
                                    } else {
                                        i29 = r0.v;
                                        if (i29 <= 0) {
                                            if (i29 == 0) {
                                                i16 = i13;
                                            } else {
                                                i16 = i13;
                                            }
                                        } else if (i29 == 0) {
                                            i16 = i13;
                                        } else {
                                            i16 = i13;
                                        }
                                    }
                                    z4 = true;
                                } else {
                                    i17 = i17;
                                    i28 = 3;
                                }
                                int[] iArr3 = r0.u;
                                iArr3[0] = i17;
                                iArr3[1] = i18;
                                if (z4 || !(i13 == 0 || i13 == -1)) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if (z4 || !(i16 == 1 || i16 == -1)) {
                                    c = 0;
                                    z6 = false;
                                } else {
                                    c = 0;
                                    z6 = true;
                                }
                                if (iArr[c] == 2 || !(r0 instanceof are)) {
                                    z7 = false;
                                } else {
                                    z7 = true;
                                }
                                if (true == z7) {
                                    i7 = 0;
                                }
                                arcVar2 = r0.Q;
                                boolean z12 = !arcVar2.h();
                                boolean[] zArr2 = r0.T;
                                boolean z13 = zArr2[0];
                                boolean z14 = zArr2[1];
                                if (r0.p != 2 || r0.b) {
                                    arcVar3 = arcVar2;
                                } else {
                                    if (!z || (aruVar = r0.h) == null) {
                                        arcVar3 = arcVar2;
                                    } else {
                                        arp arpVar2 = aruVar.h;
                                        arcVar3 = arcVar2;
                                        if (arpVar2.i && aruVar.i.i) {
                                            r13.f(aqyVarB, arpVar2.f);
                                            r13.f(aqyVarB2, r0.h.i.f);
                                            if (r0.U != null) {
                                                if (i2 != 0) {
                                                    if (r0.j[0] && !r0.H()) {
                                                        r13.g(r13.b(r0.U.L), aqyVarB2, 0, 8);
                                                    }
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                aqyVarB2 = aqyVarB2;
                                                z10 = z12;
                                                r8 = i5;
                                                iArr = iArr;
                                                i19 = i17;
                                                r2 = r13;
                                                r15 = z11;
                                                r19 = r27;
                                            }
                                        }
                                        if (z || (arvVar = r0.i) == null) {
                                            r9 = r6;
                                            aqyVar = r31;
                                            r10 = r36;
                                            i20 = 0;
                                            i21 = 1;
                                            i22 = 8;
                                            i23 = 1;
                                        } else {
                                            arp arpVar3 = arvVar.h;
                                            if (arpVar3.i && arvVar.i.i) {
                                                int i34 = arpVar3.f;
                                                ?? r14 = r6;
                                                r2.f(r14, i34);
                                                aqyVar = r31;
                                                r2.f(aqyVar, r0.i.i.f);
                                                ?? r16 = r36;
                                                r2.f(r16, r0.i.a.f);
                                                ard ardVar4 = r0.U;
                                                if (ardVar4 == null || zI || r8 == 0) {
                                                    i20 = 0;
                                                    i21 = 1;
                                                } else {
                                                    i21 = 1;
                                                    if (r0.j[1]) {
                                                        i20 = 0;
                                                        i22 = 8;
                                                        r2.g(r2.b(ardVar4.M), aqyVar, 0, 8);
                                                    } else {
                                                        i20 = 0;
                                                    }
                                                    i23 = i20;
                                                    r9 = r14;
                                                    r10 = r16;
                                                }
                                                i22 = 8;
                                                i23 = i20;
                                                r9 = r14;
                                                r10 = r16;
                                            } else {
                                                r9 = r6;
                                                aqyVar = r31;
                                                r10 = r36;
                                                i20 = 0;
                                                i21 = 1;
                                                i22 = 8;
                                                i23 = 1;
                                            }
                                        }
                                        if (r0.q == 2 && i23 != 0 && !r0.m) {
                                            int i35 = (iArr[i21] == 2 && (r0 instanceof are)) ? i21 : i20;
                                            int i36 = i21 == i35 ? i20 : i10;
                                            ard ardVar5 = r0.U;
                                            aqy aqyVarB6 = ardVar5 != null ? r2.b(ardVar5.M) : null;
                                            ard ardVar6 = r0.U;
                                            aqy aqyVarB7 = ardVar6 != null ? r2.b(ardVar6.K) : null;
                                            int i37 = r0.ab;
                                            int i38 = i21;
                                            if (i37 > 0 || r0.ah == i22) {
                                                arc arcVar10 = arcVar;
                                                if (arcVar10.e != null) {
                                                    r2.m(r10, r9, i37, i22);
                                                    r2.m(r10, r2.b(arcVar10.e), arcVar10.b(), i22);
                                                    arcVar4 = r29;
                                                    if (r8 != 0) {
                                                        r2.g(aqyVarB6, r2.b(arcVar4), i20, 5);
                                                    }
                                                    i25 = i20;
                                                    r28 = i25;
                                                } else {
                                                    i25 = i20;
                                                    arcVar4 = r29;
                                                    if (r0.ah == i22) {
                                                        r2.m(r10, r9, arcVar10.b(), i22);
                                                        r28 = z10;
                                                    } else {
                                                        r2.m(r10, r9, i37, i22);
                                                        r28 = z10;
                                                    }
                                                }
                                            } else {
                                                i25 = i20;
                                                arcVar4 = r29;
                                                r28 = z10;
                                            }
                                            r0.c(aquVar, false, r8, r15, r0.j[i38], aqyVarB7, aqyVarB6, iArr[i38], i35, r24, arcVar4, r0.aa, i36, r0.ad, r0.D[i38], r0.af, z6, iArr[i25] == 3 ? i38 : i25, zI, r19, z14, i18, i19, r0.y, r0.z, r0.A, r28);
                                        }
                                        if (z4) {
                                            i24 = r0.B;
                                            f2 = r0.C;
                                            if (i24 == 1) {
                                                aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                                                r11 = aquVar;
                                            } else {
                                                aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                                                r11 = aquVar;
                                            }
                                        } else {
                                            r11 = aquVar;
                                        }
                                        r12 = r0;
                                        if (arcVar3.h()) {
                                            arc arcVar11 = arcVar3;
                                            ard ardVar7 = arcVar11.e.d;
                                            float radians = (float) Math.toRadians(r0.E + 90.0f);
                                            int iB = arcVar11.b();
                                            aqy aqyVarB8 = r11.b(r0.K(2));
                                            aqy aqyVarB9 = r11.b(r0.K(3));
                                            aqy aqyVarB10 = r11.b(r0.K(4));
                                            aqy aqyVarB11 = r11.b(r0.K(5));
                                            aqy aqyVarB12 = r11.b(ardVar7.K(2));
                                            aqy aqyVarB13 = r11.b(ardVar7.K(3));
                                            aqy aqyVarB14 = r11.b(ardVar7.K(4));
                                            aqy aqyVarB15 = r11.b(ardVar7.K(5));
                                            aqt aqtVarA = r11.a();
                                            double d = iB;
                                            double d2 = radians;
                                            aqtVarA.j(aqyVarB9, aqyVarB11, aqyVarB13, aqyVarB15, (float) (Math.sin(d2) * d));
                                            r11.e(aqtVarA);
                                            aqt aqtVarA2 = r11.a();
                                            aqtVarA2.j(aqyVarB8, aqyVarB10, aqyVarB12, aqyVarB14, (float) (Math.cos(d2) * d));
                                            r11.e(aqtVarA2);
                                            r12 = r0;
                                        }
                                        r5 = 0;
                                        r6 = r12;
                                    }
                                    ard ardVar8 = r0.U;
                                    aqy aqyVarB16 = ardVar8 != null ? r13.b(ardVar8.L) : null;
                                    ard ardVar9 = r0.U;
                                    aqy aqyVarB17 = ardVar9 != null ? r13.b(ardVar9.J) : null;
                                    boolean z15 = r0.j[0];
                                    boolean z16 = r27 == true ? 1 : 0;
                                    boolean z17 = z12;
                                    zI = zI;
                                    ?? r17 = i2;
                                    arcVar = arcVar;
                                    ?? r18 = i5;
                                    i19 = i17;
                                    ?? r20 = aquVar;
                                    r0.c(r20, true, r17, r18, z15, aqyVarB17, aqyVarB16, iArr[0], z7, arcVar5, arcVar7, r0.Z, i7, r0.ac, r0.D[0], r0.ae, z5, iArr[1] == 3, z16, zI, z13, i19, i18, r0.v, r0.w, r0.x, z17);
                                    r1 = r20;
                                    r3 = r17;
                                    r4 = r18;
                                    z9 = z16;
                                    z8 = z17;
                                    r15 = r3;
                                    r2 = r1;
                                    r8 = r4;
                                    r19 = z9;
                                    z10 = z8;
                                    if (z) {
                                        r9 = r6;
                                        aqyVar = r31;
                                        r10 = r36;
                                        i20 = 0;
                                        i21 = 1;
                                        i22 = 8;
                                        i23 = 1;
                                    } else {
                                        r9 = r6;
                                        aqyVar = r31;
                                        r10 = r36;
                                        i20 = 0;
                                        i21 = 1;
                                        i22 = 8;
                                        i23 = 1;
                                    }
                                    if (r0.q == 2) {
                                    }
                                    if (z4) {
                                        i24 = r0.B;
                                        f2 = r0.C;
                                        if (i24 == 1) {
                                            aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                                            r11 = aquVar;
                                        } else {
                                            aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                                            r11 = aquVar;
                                        }
                                    } else {
                                        r11 = aquVar;
                                    }
                                    r12 = r0;
                                    if (arcVar3.h()) {
                                        arc arcVar12 = arcVar3;
                                        ard ardVar10 = arcVar12.e.d;
                                        float radians2 = (float) Math.toRadians(r0.E + 90.0f);
                                        int iB2 = arcVar12.b();
                                        aqy aqyVarB18 = r11.b(r0.K(2));
                                        aqy aqyVarB19 = r11.b(r0.K(3));
                                        aqy aqyVarB110 = r11.b(r0.K(4));
                                        aqy aqyVarB111 = r11.b(r0.K(5));
                                        aqy aqyVarB112 = r11.b(ardVar10.K(2));
                                        aqy aqyVarB113 = r11.b(ardVar10.K(3));
                                        aqy aqyVarB114 = r11.b(ardVar10.K(4));
                                        aqy aqyVarB115 = r11.b(ardVar10.K(5));
                                        aqt aqtVarA3 = r11.a();
                                        double d3 = iB2;
                                        double d4 = radians2;
                                        aqtVarA3.j(aqyVarB19, aqyVarB111, aqyVarB113, aqyVarB115, (float) (Math.sin(d4) * d3));
                                        r11.e(aqtVarA3);
                                        aqt aqtVarA4 = r11.a();
                                        aqtVarA4.j(aqyVarB18, aqyVarB110, aqyVarB112, aqyVarB114, (float) (Math.cos(d4) * d3));
                                        r11.e(aqtVarA4);
                                        r12 = r0;
                                    }
                                    r5 = 0;
                                    r6 = r12;
                                }
                                zI = zI;
                                r3 = i2;
                                arcVar = arcVar;
                                z9 = r27 == true ? 1 : 0;
                                z8 = z12;
                                r4 = i5;
                                i19 = i17;
                                r1 = r13;
                                r15 = r3;
                                r2 = r1;
                                r8 = r4;
                                r19 = z9;
                                z10 = z8;
                                if (z) {
                                    r9 = r6;
                                    aqyVar = r31;
                                    r10 = r36;
                                    i20 = 0;
                                    i21 = 1;
                                    i22 = 8;
                                    i23 = 1;
                                } else {
                                    r9 = r6;
                                    aqyVar = r31;
                                    r10 = r36;
                                    i20 = 0;
                                    i21 = 1;
                                    i22 = 8;
                                    i23 = 1;
                                }
                                if (r0.q == 2) {
                                }
                                if (z4) {
                                    i24 = r0.B;
                                    f2 = r0.C;
                                    if (i24 == 1) {
                                        aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                                        r11 = aquVar;
                                    } else {
                                        aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                                        r11 = aquVar;
                                    }
                                } else {
                                    r11 = aquVar;
                                }
                                r12 = r0;
                                if (arcVar3.h()) {
                                    arc arcVar13 = arcVar3;
                                    ard ardVar11 = arcVar13.e.d;
                                    float radians3 = (float) Math.toRadians(r0.E + 90.0f);
                                    int iB3 = arcVar13.b();
                                    aqy aqyVarB116 = r11.b(r0.K(2));
                                    aqy aqyVarB117 = r11.b(r0.K(3));
                                    aqy aqyVarB118 = r11.b(r0.K(4));
                                    aqy aqyVarB119 = r11.b(r0.K(5));
                                    aqy aqyVarB1110 = r11.b(ardVar11.K(2));
                                    aqy aqyVarB1111 = r11.b(ardVar11.K(3));
                                    aqy aqyVarB1112 = r11.b(ardVar11.K(4));
                                    aqy aqyVarB1113 = r11.b(ardVar11.K(5));
                                    aqt aqtVarA5 = r11.a();
                                    double d5 = iB3;
                                    double d6 = radians3;
                                    aqtVarA5.j(aqyVarB117, aqyVarB119, aqyVarB1111, aqyVarB1113, (float) (Math.sin(d6) * d5));
                                    r11.e(aqtVarA5);
                                    aqt aqtVarA6 = r11.a();
                                    aqtVarA6.j(aqyVarB116, aqyVarB118, aqyVarB1110, aqyVarB1112, (float) (Math.cos(d6) * d5));
                                    r11.e(aqtVarA6);
                                    r12 = r0;
                                }
                                r5 = 0;
                                r6 = r12;
                            } else {
                                i28 = i17;
                                i17 = i28;
                            }
                            if (i26 == 3 || i28 != 3) {
                                if (i27 == 3 || i18 != 3) {
                                    i16 = i13;
                                } else {
                                    r0.B = 1;
                                    if (i13 == -1) {
                                        f3 = 1.0f / f;
                                        r0.C = f3;
                                    } else {
                                        f3 = f;
                                    }
                                    int i39 = (int) (f3 * i6);
                                    if (i26 != 3) {
                                        i16 = 1;
                                        i18 = 4;
                                        z4 = false;
                                    } else {
                                        i18 = i18;
                                        i16 = 1;
                                        z4 = true;
                                    }
                                    i10 = i39;
                                    i13 = 1;
                                }
                                int[] iArr4 = r0.u;
                                iArr4[0] = i17;
                                iArr4[1] = i18;
                                if (z4) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    c = 0;
                                    z6 = false;
                                } else {
                                    c = 0;
                                    z6 = false;
                                }
                                if (iArr[c] == 2) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (true == z7) {
                                    i7 = 0;
                                }
                                arcVar2 = r0.Q;
                                boolean z18 = !arcVar2.h();
                                boolean[] zArr3 = r0.T;
                                boolean z19 = zArr3[0];
                                boolean z110 = zArr3[1];
                                if (r0.p != 2) {
                                    arcVar3 = arcVar2;
                                    zI = zI;
                                    r3 = i2;
                                    arcVar = arcVar;
                                    z9 = r27 == true ? 1 : 0;
                                    z8 = z18;
                                    r4 = i5;
                                    i19 = i17;
                                    r1 = r13;
                                    r15 = r3;
                                    r2 = r1;
                                    r8 = r4;
                                    r19 = z9;
                                    z10 = z8;
                                } else {
                                    arcVar3 = arcVar2;
                                    zI = zI;
                                    r3 = i2;
                                    arcVar = arcVar;
                                    z9 = r27 == true ? 1 : 0;
                                    z8 = z18;
                                    r4 = i5;
                                    i19 = i17;
                                    r1 = r13;
                                    r15 = r3;
                                    r2 = r1;
                                    r8 = r4;
                                    r19 = z9;
                                    z10 = z8;
                                }
                                if (z) {
                                    r9 = r6;
                                    aqyVar = r31;
                                    r10 = r36;
                                    i20 = 0;
                                    i21 = 1;
                                    i22 = 8;
                                    i23 = 1;
                                } else {
                                    r9 = r6;
                                    aqyVar = r31;
                                    r10 = r36;
                                    i20 = 0;
                                    i21 = 1;
                                    i22 = 8;
                                    i23 = 1;
                                }
                                if (r0.q == 2) {
                                }
                                if (z4) {
                                    i24 = r0.B;
                                    f2 = r0.C;
                                    if (i24 == 1) {
                                        aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                                        r11 = aquVar;
                                    } else {
                                        aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                                        r11 = aquVar;
                                    }
                                } else {
                                    r11 = aquVar;
                                }
                                r12 = r0;
                                if (arcVar3.h()) {
                                    arc arcVar14 = arcVar3;
                                    ard ardVar12 = arcVar14.e.d;
                                    float radians4 = (float) Math.toRadians(r0.E + 90.0f);
                                    int iB4 = arcVar14.b();
                                    aqy aqyVarB1114 = r11.b(r0.K(2));
                                    aqy aqyVarB1115 = r11.b(r0.K(3));
                                    aqy aqyVarB1116 = r11.b(r0.K(4));
                                    aqy aqyVarB1117 = r11.b(r0.K(5));
                                    aqy aqyVarB1118 = r11.b(ardVar12.K(2));
                                    aqy aqyVarB1119 = r11.b(ardVar12.K(3));
                                    aqy aqyVarB11110 = r11.b(ardVar12.K(4));
                                    aqy aqyVarB11111 = r11.b(ardVar12.K(5));
                                    aqt aqtVarA7 = r11.a();
                                    double d7 = iB4;
                                    double d8 = radians4;
                                    aqtVarA7.j(aqyVarB1115, aqyVarB1117, aqyVarB1119, aqyVarB11111, (float) (Math.sin(d8) * d7));
                                    r11.e(aqtVarA7);
                                    aqt aqtVarA8 = r11.a();
                                    aqtVarA8.j(aqyVarB1114, aqyVarB1116, aqyVarB1118, aqyVarB11110, (float) (Math.cos(d8) * d7));
                                    r11.e(aqtVarA8);
                                    r12 = r0;
                                }
                                r5 = 0;
                                r6 = r12;
                            } else {
                                r0.B = 0;
                                int i40 = (int) (f * i8);
                                if (i27 != 3) {
                                    i18 = i18;
                                    i7 = i40;
                                    i16 = 0;
                                    i13 = 0;
                                    i17 = 4;
                                } else {
                                    i7 = i40;
                                    i16 = 0;
                                    i13 = 0;
                                }
                            }
                            z4 = true;
                            i10 = i10;
                            int[] iArr5 = r0.u;
                            iArr5[0] = i17;
                            iArr5[1] = i18;
                            if (z4) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                c = 0;
                                z6 = false;
                            } else {
                                c = 0;
                                z6 = false;
                            }
                            if (iArr[c] == 2) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (true == z7) {
                                i7 = 0;
                            }
                            arcVar2 = r0.Q;
                            boolean z111 = !arcVar2.h();
                            boolean[] zArr4 = r0.T;
                            boolean z112 = zArr4[0];
                            boolean z113 = zArr4[1];
                            if (r0.p != 2) {
                                arcVar3 = arcVar2;
                                zI = zI;
                                r3 = i2;
                                arcVar = arcVar;
                                z9 = r27 == true ? 1 : 0;
                                z8 = z111;
                                r4 = i5;
                                i19 = i17;
                                r1 = r13;
                                r15 = r3;
                                r2 = r1;
                                r8 = r4;
                                r19 = z9;
                                z10 = z8;
                            } else {
                                arcVar3 = arcVar2;
                                zI = zI;
                                r3 = i2;
                                arcVar = arcVar;
                                z9 = r27 == true ? 1 : 0;
                                z8 = z111;
                                r4 = i5;
                                i19 = i17;
                                r1 = r13;
                                r15 = r3;
                                r2 = r1;
                                r8 = r4;
                                r19 = z9;
                                z10 = z8;
                            }
                            if (z) {
                                r9 = r6;
                                aqyVar = r31;
                                r10 = r36;
                                i20 = 0;
                                i21 = 1;
                                i22 = 8;
                                i23 = 1;
                            } else {
                                r9 = r6;
                                aqyVar = r31;
                                r10 = r36;
                                i20 = 0;
                                i21 = 1;
                                i22 = 8;
                                i23 = 1;
                            }
                            if (r0.q == 2) {
                            }
                            if (z4) {
                                i24 = r0.B;
                                f2 = r0.C;
                                if (i24 == 1) {
                                    aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                                    r11 = aquVar;
                                } else {
                                    aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                                    r11 = aquVar;
                                }
                            } else {
                                r11 = aquVar;
                            }
                            r12 = r0;
                            if (arcVar3.h()) {
                                arc arcVar15 = arcVar3;
                                ard ardVar13 = arcVar15.e.d;
                                float radians5 = (float) Math.toRadians(r0.E + 90.0f);
                                int iB5 = arcVar15.b();
                                aqy aqyVarB11112 = r11.b(r0.K(2));
                                aqy aqyVarB11113 = r11.b(r0.K(3));
                                aqy aqyVarB11114 = r11.b(r0.K(4));
                                aqy aqyVarB11115 = r11.b(r0.K(5));
                                aqy aqyVarB11116 = r11.b(ardVar13.K(2));
                                aqy aqyVarB11117 = r11.b(ardVar13.K(3));
                                aqy aqyVarB11118 = r11.b(ardVar13.K(4));
                                aqy aqyVarB11119 = r11.b(ardVar13.K(5));
                                aqt aqtVarA9 = r11.a();
                                double d9 = iB5;
                                double d10 = radians5;
                                aqtVarA9.j(aqyVarB11113, aqyVarB11115, aqyVarB11117, aqyVarB11119, (float) (Math.sin(d10) * d9));
                                r11.e(aqtVarA9);
                                aqt aqtVarA10 = r11.a();
                                aqtVarA10.j(aqyVarB11112, aqyVarB11114, aqyVarB11116, aqyVarB11118, (float) (Math.cos(d10) * d9));
                                r11.e(aqtVarA10);
                                r12 = r0;
                            }
                            r5 = 0;
                            r6 = r12;
                        } else {
                            i26 = i11;
                        }
                        i17 = i14;
                        if (i12 == 3) {
                            i27 = i12;
                            i18 = i15;
                        } else if (i15 == 0) {
                            i18 = 3;
                            i27 = 3;
                        } else {
                            i18 = i15;
                            i27 = 3;
                        }
                        if (i26 != 3) {
                            i28 = i17;
                            i17 = i28;
                            if (i26 == 3) {
                                if (i27 == 3) {
                                }
                                i16 = i13;
                                z4 = true;
                                i10 = i10;
                            } else {
                                if (i27 == 3) {
                                }
                                i16 = i13;
                                z4 = true;
                                i10 = i10;
                            }
                        } else {
                            i28 = i17;
                            i17 = i28;
                            if (i26 == 3) {
                                if (i27 == 3) {
                                }
                                i16 = i13;
                                z4 = true;
                                i10 = i10;
                            } else {
                                if (i27 == 3) {
                                }
                                i16 = i13;
                                z4 = true;
                                i10 = i10;
                            }
                        }
                        int[] iArr6 = r0.u;
                        iArr6[0] = i17;
                        iArr6[1] = i18;
                        if (z4) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (z4) {
                            c = 0;
                            z6 = false;
                        } else {
                            c = 0;
                            z6 = false;
                        }
                        if (iArr[c] == 2) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (true == z7) {
                            i7 = 0;
                        }
                        arcVar2 = r0.Q;
                        boolean z114 = !arcVar2.h();
                        boolean[] zArr5 = r0.T;
                        boolean z115 = zArr5[0];
                        boolean z116 = zArr5[1];
                        if (r0.p != 2) {
                            arcVar3 = arcVar2;
                            zI = zI;
                            r3 = i2;
                            arcVar = arcVar;
                            z9 = r27 == true ? 1 : 0;
                            z8 = z114;
                            r4 = i5;
                            i19 = i17;
                            r1 = r13;
                            r15 = r3;
                            r2 = r1;
                            r8 = r4;
                            r19 = z9;
                            z10 = z8;
                        } else {
                            arcVar3 = arcVar2;
                            zI = zI;
                            r3 = i2;
                            arcVar = arcVar;
                            z9 = r27 == true ? 1 : 0;
                            z8 = z114;
                            r4 = i5;
                            i19 = i17;
                            r1 = r13;
                            r15 = r3;
                            r2 = r1;
                            r8 = r4;
                            r19 = z9;
                            z10 = z8;
                        }
                        if (z) {
                            r9 = r6;
                            aqyVar = r31;
                            r10 = r36;
                            i20 = 0;
                            i21 = 1;
                            i22 = 8;
                            i23 = 1;
                        } else {
                            r9 = r6;
                            aqyVar = r31;
                            r10 = r36;
                            i20 = 0;
                            i21 = 1;
                            i22 = 8;
                            i23 = 1;
                        }
                        if (r0.q == 2) {
                        }
                        if (z4) {
                            i24 = r0.B;
                            f2 = r0.C;
                            if (i24 == 1) {
                                aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                                r11 = aquVar;
                            } else {
                                aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                                r11 = aquVar;
                            }
                        } else {
                            r11 = aquVar;
                        }
                        r12 = r0;
                        if (arcVar3.h()) {
                            arc arcVar16 = arcVar3;
                            ard ardVar14 = arcVar16.e.d;
                            float radians6 = (float) Math.toRadians(r0.E + 90.0f);
                            int iB6 = arcVar16.b();
                            aqy aqyVarB111110 = r11.b(r0.K(2));
                            aqy aqyVarB111111 = r11.b(r0.K(3));
                            aqy aqyVarB111112 = r11.b(r0.K(4));
                            aqy aqyVarB111113 = r11.b(r0.K(5));
                            aqy aqyVarB111114 = r11.b(ardVar14.K(2));
                            aqy aqyVarB111115 = r11.b(ardVar14.K(3));
                            aqy aqyVarB111116 = r11.b(ardVar14.K(4));
                            aqy aqyVarB111117 = r11.b(ardVar14.K(5));
                            aqt aqtVarA11 = r11.a();
                            double d11 = iB6;
                            double d12 = radians6;
                            aqtVarA11.j(aqyVarB111111, aqyVarB111113, aqyVarB111115, aqyVarB111117, (float) (Math.sin(d12) * d11));
                            r11.e(aqtVarA11);
                            aqt aqtVarA12 = r11.a();
                            aqtVarA12.j(aqyVarB111110, aqyVarB111112, aqyVarB111114, aqyVarB111116, (float) (Math.cos(d12) * d11));
                            r11.e(aqtVarA12);
                            r12 = r0;
                        }
                        r5 = 0;
                        r6 = r12;
                    }
                    z4 = false;
                    int[] iArr7 = r0.u;
                    iArr7[0] = i17;
                    iArr7[1] = i18;
                    if (z4) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        c = 0;
                        z6 = false;
                    } else {
                        c = 0;
                        z6 = false;
                    }
                    if (iArr[c] == 2) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (true == z7) {
                        i7 = 0;
                    }
                    arcVar2 = r0.Q;
                    boolean z117 = !arcVar2.h();
                    boolean[] zArr6 = r0.T;
                    boolean z118 = zArr6[0];
                    boolean z119 = zArr6[1];
                    if (r0.p != 2) {
                        arcVar3 = arcVar2;
                        zI = zI;
                        r3 = i2;
                        arcVar = arcVar;
                        z9 = r27 == true ? 1 : 0;
                        z8 = z117;
                        r4 = i5;
                        i19 = i17;
                        r1 = r13;
                        r15 = r3;
                        r2 = r1;
                        r8 = r4;
                        r19 = z9;
                        z10 = z8;
                    } else {
                        arcVar3 = arcVar2;
                        zI = zI;
                        r3 = i2;
                        arcVar = arcVar;
                        z9 = r27 == true ? 1 : 0;
                        z8 = z117;
                        r4 = i5;
                        i19 = i17;
                        r1 = r13;
                        r15 = r3;
                        r2 = r1;
                        r8 = r4;
                        r19 = z9;
                        z10 = z8;
                    }
                    if (z) {
                        r9 = r6;
                        aqyVar = r31;
                        r10 = r36;
                        i20 = 0;
                        i21 = 1;
                        i22 = 8;
                        i23 = 1;
                    } else {
                        r9 = r6;
                        aqyVar = r31;
                        r10 = r36;
                        i20 = 0;
                        i21 = 1;
                        i22 = 8;
                        i23 = 1;
                    }
                    if (r0.q == 2) {
                    }
                    if (z4) {
                        i24 = r0.B;
                        f2 = r0.C;
                        if (i24 == 1) {
                            aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                            r11 = aquVar;
                        } else {
                            aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                            r11 = aquVar;
                        }
                    } else {
                        r11 = aquVar;
                    }
                    r12 = r0;
                    if (arcVar3.h()) {
                        arc arcVar17 = arcVar3;
                        ard ardVar15 = arcVar17.e.d;
                        float radians7 = (float) Math.toRadians(r0.E + 90.0f);
                        int iB7 = arcVar17.b();
                        aqy aqyVarB111118 = r11.b(r0.K(2));
                        aqy aqyVarB111119 = r11.b(r0.K(3));
                        aqy aqyVarB1111110 = r11.b(r0.K(4));
                        aqy aqyVarB1111111 = r11.b(r0.K(5));
                        aqy aqyVarB1111112 = r11.b(ardVar15.K(2));
                        aqy aqyVarB1111113 = r11.b(ardVar15.K(3));
                        aqy aqyVarB1111114 = r11.b(ardVar15.K(4));
                        aqy aqyVarB1111115 = r11.b(ardVar15.K(5));
                        aqt aqtVarA13 = r11.a();
                        double d13 = iB7;
                        double d14 = radians7;
                        aqtVarA13.j(aqyVarB111119, aqyVarB1111111, aqyVarB1111113, aqyVarB1111115, (float) (Math.sin(d14) * d13));
                        r11.e(aqtVarA13);
                        aqt aqtVarA14 = r11.a();
                        aqtVarA14.j(aqyVarB111118, aqyVarB1111110, aqyVarB1111112, aqyVarB1111114, (float) (Math.cos(d14) * d13));
                        r11.e(aqtVarA14);
                        r12 = r0;
                    }
                    r5 = 0;
                    r6 = r12;
                }
                r6.b = r5;
                r6.m = r5;
            }
            r13.f(aqyVarB, r0.Z);
            r13.f(aqyVarB2, r0.Z + r0.V);
            if (i2 != 0 && (ardVar = r0.U) != null) {
                areVar = (are) ardVar;
                weakReference = areVar.aB;
                if (weakReference != null || weakReference.get() == null || arcVar5.a() > ((arc) areVar.aB.get()).a()) {
                    areVar.aB = new WeakReference(arcVar5);
                }
                weakReference2 = areVar.aD;
                if (weakReference2 != null || weakReference2.get() == null || arcVar7.a() > ((arc) areVar.aD.get()).a()) {
                    areVar.aD = new WeakReference(arcVar7);
                }
            }
            if (r0.m) {
                r13.f(aqyVarB3, r0.aa);
                r13.f(aqyVarB4, r0.aa + r0.W);
                if (arcVar.g()) {
                    r13.f(aqyVarB5, r0.aa + r0.ab);
                }
                if (i3 != 0 && (ardVar2 = r0.U) != null) {
                    areVar2 = (are) ardVar2;
                    weakReference3 = areVar2.aA;
                    if (weakReference3 != null || weakReference3.get() == null || arcVar6.a() > ((arc) areVar2.aA.get()).a()) {
                        areVar2.aA = new WeakReference(arcVar6);
                    }
                    weakReference4 = areVar2.aC;
                    if (weakReference4 != null || weakReference4.get() == null || arcVar8.a() > ((arc) areVar2.aC.get()).a()) {
                        areVar2.aC = new WeakReference(arcVar8);
                    }
                }
            }
            if (!r0.b && r0.m) {
                r6 = r0;
                r5 = i;
            } else if (z) {
                i5 = i3;
                if (r0.U != null) {
                    if (r0.a(0)) {
                        ((are) r0.U).a(r0, 0);
                        int i310 = i4;
                        i30 = i310 == true ? 1 : 0;
                        H = i310;
                    } else {
                        i30 = i4;
                        H = r0.H();
                    }
                    if (r0.a(i30)) {
                        ((are) r0.U).a(r0, i30);
                        zI = true;
                    } else {
                        zI = r0.I();
                    }
                    if (H != 0) {
                    }
                    if (zI) {
                        r7 = H;
                    } else if (i5 != 0) {
                        if (r0.ah != 8) {
                            r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                        }
                        r7 = H;
                        i5 = 1;
                    } else {
                        r7 = H;
                        i5 = 0;
                    }
                } else {
                    aqyVarB3 = aqyVarB3;
                    r7 = 0;
                    zI = false;
                }
                i6 = r0.V;
                i7 = r0.ac;
                if (i6 >= i7) {
                    i7 = i6;
                }
                i8 = r0.W;
                i9 = r0.ad;
                if (i8 >= i9) {
                    i10 = i8;
                } else {
                    i10 = i9;
                }
                iArr = r0.aq;
                i11 = iArr[0];
                r27 = r7;
                if (i11 != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i12 = iArr[1];
                if (i12 != 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i13 = r0.Y;
                r0.B = i13;
                f = r0.X;
                r0.C = f;
                i14 = r0.s;
                i15 = r0.t;
                if (f > 0.0f) {
                }
                arcVar5 = arcVar5;
                i16 = i13;
                i17 = i14;
                i18 = i15;
                z4 = false;
                int[] iArr8 = r0.u;
                iArr8[0] = i17;
                iArr8[1] = i18;
                if (z4) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z4) {
                    c = 0;
                    z6 = false;
                } else {
                    c = 0;
                    z6 = false;
                }
                if (iArr[c] == 2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (true == z7) {
                    i7 = 0;
                }
                arcVar2 = r0.Q;
                boolean z1110 = !arcVar2.h();
                boolean[] zArr7 = r0.T;
                boolean z1111 = zArr7[0];
                boolean z1112 = zArr7[1];
                if (r0.p != 2) {
                    arcVar3 = arcVar2;
                    zI = zI;
                    r3 = i2;
                    arcVar = arcVar;
                    z9 = r27 == true ? 1 : 0;
                    z8 = z1110;
                    r4 = i5;
                    i19 = i17;
                    r1 = r13;
                    r15 = r3;
                    r2 = r1;
                    r8 = r4;
                    r19 = z9;
                    z10 = z8;
                } else {
                    arcVar3 = arcVar2;
                    zI = zI;
                    r3 = i2;
                    arcVar = arcVar;
                    z9 = r27 == true ? 1 : 0;
                    z8 = z1110;
                    r4 = i5;
                    i19 = i17;
                    r1 = r13;
                    r15 = r3;
                    r2 = r1;
                    r8 = r4;
                    r19 = z9;
                    z10 = z8;
                }
                if (z) {
                    r9 = r6;
                    aqyVar = r31;
                    r10 = r36;
                    i20 = 0;
                    i21 = 1;
                    i22 = 8;
                    i23 = 1;
                } else {
                    r9 = r6;
                    aqyVar = r31;
                    r10 = r36;
                    i20 = 0;
                    i21 = 1;
                    i22 = 8;
                    i23 = 1;
                }
                if (r0.q == 2) {
                }
                if (z4) {
                    i24 = r0.B;
                    f2 = r0.C;
                    if (i24 == 1) {
                        aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                        r11 = aquVar;
                    } else {
                        aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                        r11 = aquVar;
                    }
                } else {
                    r11 = aquVar;
                }
                r12 = r0;
                if (arcVar3.h()) {
                    arc arcVar18 = arcVar3;
                    ard ardVar16 = arcVar18.e.d;
                    float radians8 = (float) Math.toRadians(r0.E + 90.0f);
                    int iB8 = arcVar18.b();
                    aqy aqyVarB1111116 = r11.b(r0.K(2));
                    aqy aqyVarB1111117 = r11.b(r0.K(3));
                    aqy aqyVarB1111118 = r11.b(r0.K(4));
                    aqy aqyVarB1111119 = r11.b(r0.K(5));
                    aqy aqyVarB11111110 = r11.b(ardVar16.K(2));
                    aqy aqyVarB11111111 = r11.b(ardVar16.K(3));
                    aqy aqyVarB11111112 = r11.b(ardVar16.K(4));
                    aqy aqyVarB11111113 = r11.b(ardVar16.K(5));
                    aqt aqtVarA15 = r11.a();
                    double d15 = iB8;
                    double d16 = radians8;
                    aqtVarA15.j(aqyVarB1111117, aqyVarB1111119, aqyVarB11111111, aqyVarB11111113, (float) (Math.sin(d16) * d15));
                    r11.e(aqtVarA15);
                    aqt aqtVarA16 = r11.a();
                    aqtVarA16.j(aqyVarB1111116, aqyVarB1111118, aqyVarB11111110, aqyVarB11111112, (float) (Math.cos(d16) * d15));
                    r11.e(aqtVarA16);
                    r12 = r0;
                }
                r5 = 0;
                r6 = r12;
            } else {
                i5 = i3;
                if (r0.U != null) {
                    if (r0.a(0)) {
                        ((are) r0.U).a(r0, 0);
                        int i311 = i4;
                        i30 = i311 == true ? 1 : 0;
                        H = i311;
                    } else {
                        i30 = i4;
                        H = r0.H();
                    }
                    if (r0.a(i30)) {
                        ((are) r0.U).a(r0, i30);
                        zI = true;
                    } else {
                        zI = r0.I();
                    }
                    if (H != 0) {
                    }
                    if (zI) {
                        r7 = H;
                    } else if (i5 != 0) {
                        if (r0.ah != 8) {
                            r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                        }
                        r7 = H;
                        i5 = 1;
                    } else {
                        r7 = H;
                        i5 = 0;
                    }
                } else {
                    aqyVarB3 = aqyVarB3;
                    r7 = 0;
                    zI = false;
                }
                i6 = r0.V;
                i7 = r0.ac;
                if (i6 >= i7) {
                    i7 = i6;
                }
                i8 = r0.W;
                i9 = r0.ad;
                if (i8 >= i9) {
                    i10 = i8;
                } else {
                    i10 = i9;
                }
                iArr = r0.aq;
                i11 = iArr[0];
                r27 = r7;
                if (i11 != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i12 = iArr[1];
                if (i12 != 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i13 = r0.Y;
                r0.B = i13;
                f = r0.X;
                r0.C = f;
                i14 = r0.s;
                i15 = r0.t;
                if (f > 0.0f) {
                }
                arcVar5 = arcVar5;
                i16 = i13;
                i17 = i14;
                i18 = i15;
                z4 = false;
                int[] iArr9 = r0.u;
                iArr9[0] = i17;
                iArr9[1] = i18;
                if (z4) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z4) {
                    c = 0;
                    z6 = false;
                } else {
                    c = 0;
                    z6 = false;
                }
                if (iArr[c] == 2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (true == z7) {
                    i7 = 0;
                }
                arcVar2 = r0.Q;
                boolean z1113 = !arcVar2.h();
                boolean[] zArr8 = r0.T;
                boolean z1114 = zArr8[0];
                boolean z1115 = zArr8[1];
                if (r0.p != 2) {
                    arcVar3 = arcVar2;
                    zI = zI;
                    r3 = i2;
                    arcVar = arcVar;
                    z9 = r27 == true ? 1 : 0;
                    z8 = z1113;
                    r4 = i5;
                    i19 = i17;
                    r1 = r13;
                    r15 = r3;
                    r2 = r1;
                    r8 = r4;
                    r19 = z9;
                    z10 = z8;
                } else {
                    arcVar3 = arcVar2;
                    zI = zI;
                    r3 = i2;
                    arcVar = arcVar;
                    z9 = r27 == true ? 1 : 0;
                    z8 = z1113;
                    r4 = i5;
                    i19 = i17;
                    r1 = r13;
                    r15 = r3;
                    r2 = r1;
                    r8 = r4;
                    r19 = z9;
                    z10 = z8;
                }
                if (z) {
                    r9 = r6;
                    aqyVar = r31;
                    r10 = r36;
                    i20 = 0;
                    i21 = 1;
                    i22 = 8;
                    i23 = 1;
                } else {
                    r9 = r6;
                    aqyVar = r31;
                    r10 = r36;
                    i20 = 0;
                    i21 = 1;
                    i22 = 8;
                    i23 = 1;
                }
                if (r0.q == 2) {
                }
                if (z4) {
                    i24 = r0.B;
                    f2 = r0.C;
                    if (i24 == 1) {
                        aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                        r11 = aquVar;
                    } else {
                        aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                        r11 = aquVar;
                    }
                } else {
                    r11 = aquVar;
                }
                r12 = r0;
                if (arcVar3.h()) {
                    arc arcVar19 = arcVar3;
                    ard ardVar17 = arcVar19.e.d;
                    float radians9 = (float) Math.toRadians(r0.E + 90.0f);
                    int iB9 = arcVar19.b();
                    aqy aqyVarB11111114 = r11.b(r0.K(2));
                    aqy aqyVarB11111115 = r11.b(r0.K(3));
                    aqy aqyVarB11111116 = r11.b(r0.K(4));
                    aqy aqyVarB11111117 = r11.b(r0.K(5));
                    aqy aqyVarB11111118 = r11.b(ardVar17.K(2));
                    aqy aqyVarB11111119 = r11.b(ardVar17.K(3));
                    aqy aqyVarB111111110 = r11.b(ardVar17.K(4));
                    aqy aqyVarB111111111 = r11.b(ardVar17.K(5));
                    aqt aqtVarA17 = r11.a();
                    double d17 = iB9;
                    double d18 = radians9;
                    aqtVarA17.j(aqyVarB11111115, aqyVarB11111117, aqyVarB11111119, aqyVarB111111111, (float) (Math.sin(d18) * d17));
                    r11.e(aqtVarA17);
                    aqt aqtVarA18 = r11.a();
                    aqtVarA18.j(aqyVarB11111114, aqyVarB11111116, aqyVarB11111118, aqyVarB111111110, (float) (Math.cos(d18) * d17));
                    r11.e(aqtVarA18);
                    r12 = r0;
                }
                r5 = 0;
                r6 = r12;
            }
            r6.b = r5;
            r6.m = r5;
        }
        arcVar = arcVar9;
        i = 0;
        i3 = i;
        i2 = i3;
        if (r0.ah == 8) {
            arrayList = r0.S;
            i4 = 1;
            size = arrayList.size();
            i31 = i;
            while (true) {
                if (i31 < size) {
                    zArr = r0.T;
                    if (!zArr[i]) {
                        break;
                    } else {
                        return;
                    }
                } else {
                    if (!((arc) arrayList.get(i31)).g()) {
                        break;
                        break;
                    }
                    i31++;
                }
            }
        } else {
            i4 = 1;
        }
        if (!r0.b) {
            if (r0.m) {
                if (z) {
                    i5 = i3;
                    if (r0.U != null) {
                        if (r0.a(0)) {
                            ((are) r0.U).a(r0, 0);
                            int i312 = i4;
                            i30 = i312 == true ? 1 : 0;
                            H = i312;
                        } else {
                            i30 = i4;
                            H = r0.H();
                        }
                        if (r0.a(i30)) {
                            ((are) r0.U).a(r0, i30);
                            zI = true;
                        } else {
                            zI = r0.I();
                        }
                        if (H != 0) {
                        }
                        if (zI) {
                            r7 = H;
                        } else if (i5 != 0) {
                            if (r0.ah != 8) {
                                r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                            }
                            r7 = H;
                            i5 = 1;
                        } else {
                            r7 = H;
                            i5 = 0;
                        }
                    } else {
                        aqyVarB3 = aqyVarB3;
                        r7 = 0;
                        zI = false;
                    }
                    i6 = r0.V;
                    i7 = r0.ac;
                    if (i6 >= i7) {
                        i7 = i6;
                    }
                    i8 = r0.W;
                    i9 = r0.ad;
                    if (i8 >= i9) {
                        i10 = i8;
                    } else {
                        i10 = i9;
                    }
                    iArr = r0.aq;
                    i11 = iArr[0];
                    r27 = r7;
                    if (i11 != 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i12 = iArr[1];
                    if (i12 != 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i13 = r0.Y;
                    r0.B = i13;
                    f = r0.X;
                    r0.C = f;
                    i14 = r0.s;
                    i15 = r0.t;
                    if (f > 0.0f) {
                    }
                    arcVar5 = arcVar5;
                    i16 = i13;
                    i17 = i14;
                    i18 = i15;
                    z4 = false;
                    int[] iArr10 = r0.u;
                    iArr10[0] = i17;
                    iArr10[1] = i18;
                    if (z4) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        c = 0;
                        z6 = false;
                    } else {
                        c = 0;
                        z6 = false;
                    }
                    if (iArr[c] == 2) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (true == z7) {
                        i7 = 0;
                    }
                    arcVar2 = r0.Q;
                    boolean z1116 = !arcVar2.h();
                    boolean[] zArr9 = r0.T;
                    boolean z1117 = zArr9[0];
                    boolean z1118 = zArr9[1];
                    if (r0.p != 2) {
                        arcVar3 = arcVar2;
                        zI = zI;
                        r3 = i2;
                        arcVar = arcVar;
                        z9 = r27 == true ? 1 : 0;
                        z8 = z1116;
                        r4 = i5;
                        i19 = i17;
                        r1 = r13;
                        r15 = r3;
                        r2 = r1;
                        r8 = r4;
                        r19 = z9;
                        z10 = z8;
                    } else {
                        arcVar3 = arcVar2;
                        zI = zI;
                        r3 = i2;
                        arcVar = arcVar;
                        z9 = r27 == true ? 1 : 0;
                        z8 = z1116;
                        r4 = i5;
                        i19 = i17;
                        r1 = r13;
                        r15 = r3;
                        r2 = r1;
                        r8 = r4;
                        r19 = z9;
                        z10 = z8;
                    }
                    if (z) {
                        r9 = r6;
                        aqyVar = r31;
                        r10 = r36;
                        i20 = 0;
                        i21 = 1;
                        i22 = 8;
                        i23 = 1;
                    } else {
                        r9 = r6;
                        aqyVar = r31;
                        r10 = r36;
                        i20 = 0;
                        i21 = 1;
                        i22 = 8;
                        i23 = 1;
                    }
                    if (r0.q == 2) {
                    }
                    if (z4) {
                        i24 = r0.B;
                        f2 = r0.C;
                        if (i24 == 1) {
                            aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                            r11 = aquVar;
                        } else {
                            aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                            r11 = aquVar;
                        }
                    } else {
                        r11 = aquVar;
                    }
                    r12 = r0;
                    if (arcVar3.h()) {
                        arc arcVar110 = arcVar3;
                        ard ardVar18 = arcVar110.e.d;
                        float radians10 = (float) Math.toRadians(r0.E + 90.0f);
                        int iB10 = arcVar110.b();
                        aqy aqyVarB111111112 = r11.b(r0.K(2));
                        aqy aqyVarB111111113 = r11.b(r0.K(3));
                        aqy aqyVarB111111114 = r11.b(r0.K(4));
                        aqy aqyVarB111111115 = r11.b(r0.K(5));
                        aqy aqyVarB111111116 = r11.b(ardVar18.K(2));
                        aqy aqyVarB111111117 = r11.b(ardVar18.K(3));
                        aqy aqyVarB111111118 = r11.b(ardVar18.K(4));
                        aqy aqyVarB111111119 = r11.b(ardVar18.K(5));
                        aqt aqtVarA19 = r11.a();
                        double d19 = iB10;
                        double d110 = radians10;
                        aqtVarA19.j(aqyVarB111111113, aqyVarB111111115, aqyVarB111111117, aqyVarB111111119, (float) (Math.sin(d110) * d19));
                        r11.e(aqtVarA19);
                        aqt aqtVarA110 = r11.a();
                        aqtVarA110.j(aqyVarB111111112, aqyVarB111111114, aqyVarB111111116, aqyVarB111111118, (float) (Math.cos(d110) * d19));
                        r11.e(aqtVarA110);
                        r12 = r0;
                    }
                    r5 = 0;
                    r6 = r12;
                } else {
                    i5 = i3;
                    if (r0.U != null) {
                        if (r0.a(0)) {
                            ((are) r0.U).a(r0, 0);
                            int i313 = i4;
                            i30 = i313 == true ? 1 : 0;
                            H = i313;
                        } else {
                            i30 = i4;
                            H = r0.H();
                        }
                        if (r0.a(i30)) {
                            ((are) r0.U).a(r0, i30);
                            zI = true;
                        } else {
                            zI = r0.I();
                        }
                        if (H != 0) {
                        }
                        if (zI) {
                            r7 = H;
                        } else if (i5 != 0) {
                            if (r0.ah != 8) {
                                r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                            }
                            r7 = H;
                            i5 = 1;
                        } else {
                            r7 = H;
                            i5 = 0;
                        }
                    } else {
                        aqyVarB3 = aqyVarB3;
                        r7 = 0;
                        zI = false;
                    }
                    i6 = r0.V;
                    i7 = r0.ac;
                    if (i6 >= i7) {
                        i7 = i6;
                    }
                    i8 = r0.W;
                    i9 = r0.ad;
                    if (i8 >= i9) {
                        i10 = i8;
                    } else {
                        i10 = i9;
                    }
                    iArr = r0.aq;
                    i11 = iArr[0];
                    r27 = r7;
                    if (i11 != 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i12 = iArr[1];
                    if (i12 != 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i13 = r0.Y;
                    r0.B = i13;
                    f = r0.X;
                    r0.C = f;
                    i14 = r0.s;
                    i15 = r0.t;
                    if (f > 0.0f) {
                    }
                    arcVar5 = arcVar5;
                    i16 = i13;
                    i17 = i14;
                    i18 = i15;
                    z4 = false;
                    int[] iArr11 = r0.u;
                    iArr11[0] = i17;
                    iArr11[1] = i18;
                    if (z4) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        c = 0;
                        z6 = false;
                    } else {
                        c = 0;
                        z6 = false;
                    }
                    if (iArr[c] == 2) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (true == z7) {
                        i7 = 0;
                    }
                    arcVar2 = r0.Q;
                    boolean z1119 = !arcVar2.h();
                    boolean[] zArr10 = r0.T;
                    boolean z11110 = zArr10[0];
                    boolean z11111 = zArr10[1];
                    if (r0.p != 2) {
                        arcVar3 = arcVar2;
                        zI = zI;
                        r3 = i2;
                        arcVar = arcVar;
                        z9 = r27 == true ? 1 : 0;
                        z8 = z1119;
                        r4 = i5;
                        i19 = i17;
                        r1 = r13;
                        r15 = r3;
                        r2 = r1;
                        r8 = r4;
                        r19 = z9;
                        z10 = z8;
                    } else {
                        arcVar3 = arcVar2;
                        zI = zI;
                        r3 = i2;
                        arcVar = arcVar;
                        z9 = r27 == true ? 1 : 0;
                        z8 = z1119;
                        r4 = i5;
                        i19 = i17;
                        r1 = r13;
                        r15 = r3;
                        r2 = r1;
                        r8 = r4;
                        r19 = z9;
                        z10 = z8;
                    }
                    if (z) {
                        r9 = r6;
                        aqyVar = r31;
                        r10 = r36;
                        i20 = 0;
                        i21 = 1;
                        i22 = 8;
                        i23 = 1;
                    } else {
                        r9 = r6;
                        aqyVar = r31;
                        r10 = r36;
                        i20 = 0;
                        i21 = 1;
                        i22 = 8;
                        i23 = 1;
                    }
                    if (r0.q == 2) {
                    }
                    if (z4) {
                        i24 = r0.B;
                        f2 = r0.C;
                        if (i24 == 1) {
                            aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                            r11 = aquVar;
                        } else {
                            aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                            r11 = aquVar;
                        }
                    } else {
                        r11 = aquVar;
                    }
                    r12 = r0;
                    if (arcVar3.h()) {
                        arc arcVar111 = arcVar3;
                        ard ardVar19 = arcVar111.e.d;
                        float radians11 = (float) Math.toRadians(r0.E + 90.0f);
                        int iB11 = arcVar111.b();
                        aqy aqyVarB1111111110 = r11.b(r0.K(2));
                        aqy aqyVarB1111111111 = r11.b(r0.K(3));
                        aqy aqyVarB1111111112 = r11.b(r0.K(4));
                        aqy aqyVarB1111111113 = r11.b(r0.K(5));
                        aqy aqyVarB1111111114 = r11.b(ardVar19.K(2));
                        aqy aqyVarB1111111115 = r11.b(ardVar19.K(3));
                        aqy aqyVarB1111111116 = r11.b(ardVar19.K(4));
                        aqy aqyVarB1111111117 = r11.b(ardVar19.K(5));
                        aqt aqtVarA111 = r11.a();
                        double d111 = iB11;
                        double d112 = radians11;
                        aqtVarA111.j(aqyVarB1111111111, aqyVarB1111111113, aqyVarB1111111115, aqyVarB1111111117, (float) (Math.sin(d112) * d111));
                        r11.e(aqtVarA111);
                        aqt aqtVarA112 = r11.a();
                        aqtVarA112.j(aqyVarB1111111110, aqyVarB1111111112, aqyVarB1111111114, aqyVarB1111111116, (float) (Math.cos(d112) * d111));
                        r11.e(aqtVarA112);
                        r12 = r0;
                    }
                    r5 = 0;
                    r6 = r12;
                }
            }
            r6.b = r5;
            r6.m = r5;
        }
        r13.f(aqyVarB, r0.Z);
        r13.f(aqyVarB2, r0.Z + r0.V);
        if (i2 != 0) {
            areVar = (are) ardVar;
            weakReference = areVar.aB;
            if (weakReference != null) {
                areVar.aB = new WeakReference(arcVar5);
            } else {
                areVar.aB = new WeakReference(arcVar5);
            }
            weakReference2 = areVar.aD;
            if (weakReference2 != null) {
                areVar.aD = new WeakReference(arcVar7);
            } else {
                areVar.aD = new WeakReference(arcVar7);
            }
        }
        if (r0.m) {
            r13.f(aqyVarB3, r0.aa);
            r13.f(aqyVarB4, r0.aa + r0.W);
            if (arcVar.g()) {
                r13.f(aqyVarB5, r0.aa + r0.ab);
            }
            if (i3 != 0) {
                areVar2 = (are) ardVar2;
                weakReference3 = areVar2.aA;
                if (weakReference3 != null) {
                    areVar2.aA = new WeakReference(arcVar6);
                } else {
                    areVar2.aA = new WeakReference(arcVar6);
                }
                weakReference4 = areVar2.aC;
                if (weakReference4 != null) {
                    areVar2.aC = new WeakReference(arcVar8);
                } else {
                    areVar2.aC = new WeakReference(arcVar8);
                }
            }
        }
        if (!r0.b) {
            if (z) {
                i5 = i3;
                if (r0.U != null) {
                    if (r0.a(0)) {
                        ((are) r0.U).a(r0, 0);
                        int i314 = i4;
                        i30 = i314 == true ? 1 : 0;
                        H = i314;
                    } else {
                        i30 = i4;
                        H = r0.H();
                    }
                    if (r0.a(i30)) {
                        ((are) r0.U).a(r0, i30);
                        zI = true;
                    } else {
                        zI = r0.I();
                    }
                    if (H != 0) {
                    }
                    if (zI) {
                        r7 = H;
                    } else if (i5 != 0) {
                        if (r0.ah != 8) {
                            r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                        }
                        r7 = H;
                        i5 = 1;
                    } else {
                        r7 = H;
                        i5 = 0;
                    }
                } else {
                    aqyVarB3 = aqyVarB3;
                    r7 = 0;
                    zI = false;
                }
                i6 = r0.V;
                i7 = r0.ac;
                if (i6 >= i7) {
                    i7 = i6;
                }
                i8 = r0.W;
                i9 = r0.ad;
                if (i8 >= i9) {
                    i10 = i8;
                } else {
                    i10 = i9;
                }
                iArr = r0.aq;
                i11 = iArr[0];
                r27 = r7;
                if (i11 != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i12 = iArr[1];
                if (i12 != 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i13 = r0.Y;
                r0.B = i13;
                f = r0.X;
                r0.C = f;
                i14 = r0.s;
                i15 = r0.t;
                if (f > 0.0f) {
                }
                arcVar5 = arcVar5;
                i16 = i13;
                i17 = i14;
                i18 = i15;
                z4 = false;
                int[] iArr12 = r0.u;
                iArr12[0] = i17;
                iArr12[1] = i18;
                if (z4) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z4) {
                    c = 0;
                    z6 = false;
                } else {
                    c = 0;
                    z6 = false;
                }
                if (iArr[c] == 2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (true == z7) {
                    i7 = 0;
                }
                arcVar2 = r0.Q;
                boolean z11112 = !arcVar2.h();
                boolean[] zArr11 = r0.T;
                boolean z11113 = zArr11[0];
                boolean z11114 = zArr11[1];
                if (r0.p != 2) {
                    arcVar3 = arcVar2;
                    zI = zI;
                    r3 = i2;
                    arcVar = arcVar;
                    z9 = r27 == true ? 1 : 0;
                    z8 = z11112;
                    r4 = i5;
                    i19 = i17;
                    r1 = r13;
                    r15 = r3;
                    r2 = r1;
                    r8 = r4;
                    r19 = z9;
                    z10 = z8;
                } else {
                    arcVar3 = arcVar2;
                    zI = zI;
                    r3 = i2;
                    arcVar = arcVar;
                    z9 = r27 == true ? 1 : 0;
                    z8 = z11112;
                    r4 = i5;
                    i19 = i17;
                    r1 = r13;
                    r15 = r3;
                    r2 = r1;
                    r8 = r4;
                    r19 = z9;
                    z10 = z8;
                }
                if (z) {
                    r9 = r6;
                    aqyVar = r31;
                    r10 = r36;
                    i20 = 0;
                    i21 = 1;
                    i22 = 8;
                    i23 = 1;
                } else {
                    r9 = r6;
                    aqyVar = r31;
                    r10 = r36;
                    i20 = 0;
                    i21 = 1;
                    i22 = 8;
                    i23 = 1;
                }
                if (r0.q == 2) {
                }
                if (z4) {
                    i24 = r0.B;
                    f2 = r0.C;
                    if (i24 == 1) {
                        aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                        r11 = aquVar;
                    } else {
                        aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                        r11 = aquVar;
                    }
                } else {
                    r11 = aquVar;
                }
                r12 = r0;
                if (arcVar3.h()) {
                    arc arcVar112 = arcVar3;
                    ard ardVar110 = arcVar112.e.d;
                    float radians12 = (float) Math.toRadians(r0.E + 90.0f);
                    int iB12 = arcVar112.b();
                    aqy aqyVarB1111111118 = r11.b(r0.K(2));
                    aqy aqyVarB1111111119 = r11.b(r0.K(3));
                    aqy aqyVarB11111111110 = r11.b(r0.K(4));
                    aqy aqyVarB11111111111 = r11.b(r0.K(5));
                    aqy aqyVarB11111111112 = r11.b(ardVar110.K(2));
                    aqy aqyVarB11111111113 = r11.b(ardVar110.K(3));
                    aqy aqyVarB11111111114 = r11.b(ardVar110.K(4));
                    aqy aqyVarB11111111115 = r11.b(ardVar110.K(5));
                    aqt aqtVarA113 = r11.a();
                    double d113 = iB12;
                    double d114 = radians12;
                    aqtVarA113.j(aqyVarB1111111119, aqyVarB11111111111, aqyVarB11111111113, aqyVarB11111111115, (float) (Math.sin(d114) * d113));
                    r11.e(aqtVarA113);
                    aqt aqtVarA114 = r11.a();
                    aqtVarA114.j(aqyVarB1111111118, aqyVarB11111111110, aqyVarB11111111112, aqyVarB11111111114, (float) (Math.cos(d114) * d113));
                    r11.e(aqtVarA114);
                    r12 = r0;
                }
                r5 = 0;
                r6 = r12;
            } else {
                i5 = i3;
                if (r0.U != null) {
                    if (r0.a(0)) {
                        ((are) r0.U).a(r0, 0);
                        int i315 = i4;
                        i30 = i315 == true ? 1 : 0;
                        H = i315;
                    } else {
                        i30 = i4;
                        H = r0.H();
                    }
                    if (r0.a(i30)) {
                        ((are) r0.U).a(r0, i30);
                        zI = true;
                    } else {
                        zI = r0.I();
                    }
                    if (H != 0) {
                    }
                    if (zI) {
                        r7 = H;
                    } else if (i5 != 0) {
                        if (r0.ah != 8) {
                            r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                        }
                        r7 = H;
                        i5 = 1;
                    } else {
                        r7 = H;
                        i5 = 0;
                    }
                } else {
                    aqyVarB3 = aqyVarB3;
                    r7 = 0;
                    zI = false;
                }
                i6 = r0.V;
                i7 = r0.ac;
                if (i6 >= i7) {
                    i7 = i6;
                }
                i8 = r0.W;
                i9 = r0.ad;
                if (i8 >= i9) {
                    i10 = i8;
                } else {
                    i10 = i9;
                }
                iArr = r0.aq;
                i11 = iArr[0];
                r27 = r7;
                if (i11 != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i12 = iArr[1];
                if (i12 != 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i13 = r0.Y;
                r0.B = i13;
                f = r0.X;
                r0.C = f;
                i14 = r0.s;
                i15 = r0.t;
                if (f > 0.0f) {
                }
                arcVar5 = arcVar5;
                i16 = i13;
                i17 = i14;
                i18 = i15;
                z4 = false;
                int[] iArr13 = r0.u;
                iArr13[0] = i17;
                iArr13[1] = i18;
                if (z4) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z4) {
                    c = 0;
                    z6 = false;
                } else {
                    c = 0;
                    z6 = false;
                }
                if (iArr[c] == 2) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (true == z7) {
                    i7 = 0;
                }
                arcVar2 = r0.Q;
                boolean z11115 = !arcVar2.h();
                boolean[] zArr12 = r0.T;
                boolean z11116 = zArr12[0];
                boolean z11117 = zArr12[1];
                if (r0.p != 2) {
                    arcVar3 = arcVar2;
                    zI = zI;
                    r3 = i2;
                    arcVar = arcVar;
                    z9 = r27 == true ? 1 : 0;
                    z8 = z11115;
                    r4 = i5;
                    i19 = i17;
                    r1 = r13;
                    r15 = r3;
                    r2 = r1;
                    r8 = r4;
                    r19 = z9;
                    z10 = z8;
                } else {
                    arcVar3 = arcVar2;
                    zI = zI;
                    r3 = i2;
                    arcVar = arcVar;
                    z9 = r27 == true ? 1 : 0;
                    z8 = z11115;
                    r4 = i5;
                    i19 = i17;
                    r1 = r13;
                    r15 = r3;
                    r2 = r1;
                    r8 = r4;
                    r19 = z9;
                    z10 = z8;
                }
                if (z) {
                    r9 = r6;
                    aqyVar = r31;
                    r10 = r36;
                    i20 = 0;
                    i21 = 1;
                    i22 = 8;
                    i23 = 1;
                } else {
                    r9 = r6;
                    aqyVar = r31;
                    r10 = r36;
                    i20 = 0;
                    i21 = 1;
                    i22 = 8;
                    i23 = 1;
                }
                if (r0.q == 2) {
                }
                if (z4) {
                    i24 = r0.B;
                    f2 = r0.C;
                    if (i24 == 1) {
                        aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                        r11 = aquVar;
                    } else {
                        aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                        r11 = aquVar;
                    }
                } else {
                    r11 = aquVar;
                }
                r12 = r0;
                if (arcVar3.h()) {
                    arc arcVar113 = arcVar3;
                    ard ardVar111 = arcVar113.e.d;
                    float radians13 = (float) Math.toRadians(r0.E + 90.0f);
                    int iB13 = arcVar113.b();
                    aqy aqyVarB11111111116 = r11.b(r0.K(2));
                    aqy aqyVarB11111111117 = r11.b(r0.K(3));
                    aqy aqyVarB11111111118 = r11.b(r0.K(4));
                    aqy aqyVarB11111111119 = r11.b(r0.K(5));
                    aqy aqyVarB111111111110 = r11.b(ardVar111.K(2));
                    aqy aqyVarB111111111111 = r11.b(ardVar111.K(3));
                    aqy aqyVarB111111111112 = r11.b(ardVar111.K(4));
                    aqy aqyVarB111111111113 = r11.b(ardVar111.K(5));
                    aqt aqtVarA115 = r11.a();
                    double d115 = iB13;
                    double d116 = radians13;
                    aqtVarA115.j(aqyVarB11111111117, aqyVarB11111111119, aqyVarB111111111111, aqyVarB111111111113, (float) (Math.sin(d116) * d115));
                    r11.e(aqtVarA115);
                    aqt aqtVarA116 = r11.a();
                    aqtVarA116.j(aqyVarB11111111116, aqyVarB11111111118, aqyVarB111111111110, aqyVarB111111111112, (float) (Math.cos(d116) * d115));
                    r11.e(aqtVarA116);
                    r12 = r0;
                }
                r5 = 0;
                r6 = r12;
            }
        } else if (z) {
            i5 = i3;
            if (r0.U != null) {
                if (r0.a(0)) {
                    ((are) r0.U).a(r0, 0);
                    int i316 = i4;
                    i30 = i316 == true ? 1 : 0;
                    H = i316;
                } else {
                    i30 = i4;
                    H = r0.H();
                }
                if (r0.a(i30)) {
                    ((are) r0.U).a(r0, i30);
                    zI = true;
                } else {
                    zI = r0.I();
                }
                if (H != 0) {
                }
                if (zI) {
                    r7 = H;
                } else if (i5 != 0) {
                    if (r0.ah != 8) {
                        r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                    }
                    r7 = H;
                    i5 = 1;
                } else {
                    r7 = H;
                    i5 = 0;
                }
            } else {
                aqyVarB3 = aqyVarB3;
                r7 = 0;
                zI = false;
            }
            i6 = r0.V;
            i7 = r0.ac;
            if (i6 >= i7) {
                i7 = i6;
            }
            i8 = r0.W;
            i9 = r0.ad;
            if (i8 >= i9) {
                i10 = i8;
            } else {
                i10 = i9;
            }
            iArr = r0.aq;
            i11 = iArr[0];
            r27 = r7;
            if (i11 != 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            i12 = iArr[1];
            if (i12 != 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            i13 = r0.Y;
            r0.B = i13;
            f = r0.X;
            r0.C = f;
            i14 = r0.s;
            i15 = r0.t;
            if (f > 0.0f) {
            }
            arcVar5 = arcVar5;
            i16 = i13;
            i17 = i14;
            i18 = i15;
            z4 = false;
            int[] iArr14 = r0.u;
            iArr14[0] = i17;
            iArr14[1] = i18;
            if (z4) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z4) {
                c = 0;
                z6 = false;
            } else {
                c = 0;
                z6 = false;
            }
            if (iArr[c] == 2) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (true == z7) {
                i7 = 0;
            }
            arcVar2 = r0.Q;
            boolean z11118 = !arcVar2.h();
            boolean[] zArr13 = r0.T;
            boolean z11119 = zArr13[0];
            boolean z111110 = zArr13[1];
            if (r0.p != 2) {
                arcVar3 = arcVar2;
                zI = zI;
                r3 = i2;
                arcVar = arcVar;
                z9 = r27 == true ? 1 : 0;
                z8 = z11118;
                r4 = i5;
                i19 = i17;
                r1 = r13;
                r15 = r3;
                r2 = r1;
                r8 = r4;
                r19 = z9;
                z10 = z8;
            } else {
                arcVar3 = arcVar2;
                zI = zI;
                r3 = i2;
                arcVar = arcVar;
                z9 = r27 == true ? 1 : 0;
                z8 = z11118;
                r4 = i5;
                i19 = i17;
                r1 = r13;
                r15 = r3;
                r2 = r1;
                r8 = r4;
                r19 = z9;
                z10 = z8;
            }
            if (z) {
                r9 = r6;
                aqyVar = r31;
                r10 = r36;
                i20 = 0;
                i21 = 1;
                i22 = 8;
                i23 = 1;
            } else {
                r9 = r6;
                aqyVar = r31;
                r10 = r36;
                i20 = 0;
                i21 = 1;
                i22 = 8;
                i23 = 1;
            }
            if (r0.q == 2) {
            }
            if (z4) {
                i24 = r0.B;
                f2 = r0.C;
                if (i24 == 1) {
                    aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                    r11 = aquVar;
                } else {
                    aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                    r11 = aquVar;
                }
            } else {
                r11 = aquVar;
            }
            r12 = r0;
            if (arcVar3.h()) {
                arc arcVar114 = arcVar3;
                ard ardVar112 = arcVar114.e.d;
                float radians14 = (float) Math.toRadians(r0.E + 90.0f);
                int iB14 = arcVar114.b();
                aqy aqyVarB111111111114 = r11.b(r0.K(2));
                aqy aqyVarB111111111115 = r11.b(r0.K(3));
                aqy aqyVarB111111111116 = r11.b(r0.K(4));
                aqy aqyVarB111111111117 = r11.b(r0.K(5));
                aqy aqyVarB111111111118 = r11.b(ardVar112.K(2));
                aqy aqyVarB111111111119 = r11.b(ardVar112.K(3));
                aqy aqyVarB1111111111110 = r11.b(ardVar112.K(4));
                aqy aqyVarB1111111111111 = r11.b(ardVar112.K(5));
                aqt aqtVarA117 = r11.a();
                double d117 = iB14;
                double d118 = radians14;
                aqtVarA117.j(aqyVarB111111111115, aqyVarB111111111117, aqyVarB111111111119, aqyVarB1111111111111, (float) (Math.sin(d118) * d117));
                r11.e(aqtVarA117);
                aqt aqtVarA118 = r11.a();
                aqtVarA118.j(aqyVarB111111111114, aqyVarB111111111116, aqyVarB111111111118, aqyVarB1111111111110, (float) (Math.cos(d118) * d117));
                r11.e(aqtVarA118);
                r12 = r0;
            }
            r5 = 0;
            r6 = r12;
        } else {
            i5 = i3;
            if (r0.U != null) {
                if (r0.a(0)) {
                    ((are) r0.U).a(r0, 0);
                    int i317 = i4;
                    i30 = i317 == true ? 1 : 0;
                    H = i317;
                } else {
                    i30 = i4;
                    H = r0.H();
                }
                if (r0.a(i30)) {
                    ((are) r0.U).a(r0, i30);
                    zI = true;
                } else {
                    zI = r0.I();
                }
                if (H != 0) {
                }
                if (zI) {
                    r7 = H;
                } else if (i5 != 0) {
                    if (r0.ah != 8) {
                        r13.g(r13.b(r0.U.M), aqyVarB4, 0, 1);
                    }
                    r7 = H;
                    i5 = 1;
                } else {
                    r7 = H;
                    i5 = 0;
                }
            } else {
                aqyVarB3 = aqyVarB3;
                r7 = 0;
                zI = false;
            }
            i6 = r0.V;
            i7 = r0.ac;
            if (i6 >= i7) {
                i7 = i6;
            }
            i8 = r0.W;
            i9 = r0.ad;
            if (i8 >= i9) {
                i10 = i8;
            } else {
                i10 = i9;
            }
            iArr = r0.aq;
            i11 = iArr[0];
            r27 = r7;
            if (i11 != 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            i12 = iArr[1];
            if (i12 != 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            i13 = r0.Y;
            r0.B = i13;
            f = r0.X;
            r0.C = f;
            i14 = r0.s;
            i15 = r0.t;
            if (f > 0.0f) {
            }
            arcVar5 = arcVar5;
            i16 = i13;
            i17 = i14;
            i18 = i15;
            z4 = false;
            int[] iArr15 = r0.u;
            iArr15[0] = i17;
            iArr15[1] = i18;
            if (z4) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z4) {
                c = 0;
                z6 = false;
            } else {
                c = 0;
                z6 = false;
            }
            if (iArr[c] == 2) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (true == z7) {
                i7 = 0;
            }
            arcVar2 = r0.Q;
            boolean z111111 = !arcVar2.h();
            boolean[] zArr14 = r0.T;
            boolean z111112 = zArr14[0];
            boolean z111113 = zArr14[1];
            if (r0.p != 2) {
                arcVar3 = arcVar2;
                zI = zI;
                r3 = i2;
                arcVar = arcVar;
                z9 = r27 == true ? 1 : 0;
                z8 = z111111;
                r4 = i5;
                i19 = i17;
                r1 = r13;
                r15 = r3;
                r2 = r1;
                r8 = r4;
                r19 = z9;
                z10 = z8;
            } else {
                arcVar3 = arcVar2;
                zI = zI;
                r3 = i2;
                arcVar = arcVar;
                z9 = r27 == true ? 1 : 0;
                z8 = z111111;
                r4 = i5;
                i19 = i17;
                r1 = r13;
                r15 = r3;
                r2 = r1;
                r8 = r4;
                r19 = z9;
                z10 = z8;
            }
            if (z) {
                r9 = r6;
                aqyVar = r31;
                r10 = r36;
                i20 = 0;
                i21 = 1;
                i22 = 8;
                i23 = 1;
            } else {
                r9 = r6;
                aqyVar = r31;
                r10 = r36;
                i20 = 0;
                i21 = 1;
                i22 = 8;
                i23 = 1;
            }
            if (r0.q == 2) {
            }
            if (z4) {
                i24 = r0.B;
                f2 = r0.C;
                if (i24 == 1) {
                    aquVar.n(aqyVar, r9, aqyVarB2, aqyVarB, f2);
                    r11 = aquVar;
                } else {
                    aquVar.n(aqyVarB2, aqyVarB, aqyVar, r9, f2);
                    r11 = aquVar;
                }
            } else {
                r11 = aquVar;
            }
            r12 = r0;
            if (arcVar3.h()) {
                arc arcVar115 = arcVar3;
                ard ardVar113 = arcVar115.e.d;
                float radians15 = (float) Math.toRadians(r0.E + 90.0f);
                int iB15 = arcVar115.b();
                aqy aqyVarB1111111111112 = r11.b(r0.K(2));
                aqy aqyVarB1111111111113 = r11.b(r0.K(3));
                aqy aqyVarB1111111111114 = r11.b(r0.K(4));
                aqy aqyVarB1111111111115 = r11.b(r0.K(5));
                aqy aqyVarB1111111111116 = r11.b(ardVar113.K(2));
                aqy aqyVarB1111111111117 = r11.b(ardVar113.K(3));
                aqy aqyVarB1111111111118 = r11.b(ardVar113.K(4));
                aqy aqyVarB1111111111119 = r11.b(ardVar113.K(5));
                aqt aqtVarA119 = r11.a();
                double d119 = iB15;
                double d1110 = radians15;
                aqtVarA119.j(aqyVarB1111111111113, aqyVarB1111111111115, aqyVarB1111111111117, aqyVarB1111111111119, (float) (Math.sin(d1110) * d119));
                r11.e(aqtVarA119);
                aqt aqtVarA1110 = r11.a();
                aqtVarA1110.j(aqyVarB1111111111112, aqyVarB1111111111114, aqyVarB1111111111116, aqyVarB1111111111118, (float) (Math.cos(d1110) * d119));
                r11.e(aqtVarA1110);
                r12 = r0;
            }
            r5 = 0;
            r6 = r12;
        }
        r6.b = r5;
        r6.m = r5;
    }

    public boolean d() {
        return this.ah != 8;
    }

    public boolean e() {
        if (this.b) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean f() {
        if (this.m) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public final int g() {
        return l() + this.W;
    }

    public final int h() {
        if (this.ah == 8) {
            return 0;
        }
        return this.W;
    }

    public final int i() {
        return k() + this.V;
    }

    public final int j() {
        if (this.ah == 8) {
            return 0;
        }
        return this.V;
    }

    public final int k() {
        ard ardVar = this.U;
        return ardVar != null ? ((are) ardVar).ar + this.Z : this.Z;
    }

    public final int l() {
        ard ardVar = this.U;
        return ardVar != null ? ((are) ardVar).as + this.aa : this.aa;
    }

    public final ard m(int i) {
        arc arcVar;
        arc arcVar2;
        arc arcVar3;
        if (i != 0 ? !(i == 1 && (arcVar2 = (arcVar = this.M).e) != null && arcVar2.e == arcVar) : (arcVar2 = (arcVar3 = this.L).e) == null || arcVar2.e != arcVar3) {
            return null;
        }
        return arcVar2.d;
    }

    public final ard n(int i) {
        arc arcVar;
        arc arcVar2;
        arc arcVar3;
        if (i != 0 ? !(i == 1 && (arcVar2 = (arcVar = this.K).e) != null && arcVar2.e == arcVar) : (arcVar2 = (arcVar3 = this.J).e) == null || arcVar2.e != arcVar3) {
            return null;
        }
        return arcVar2.d;
    }

    public final arx o(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public final void p(are areVar, aqu aquVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            ari.a(areVar, aquVar, this);
            hashSet.remove(this);
            b(aquVar, areVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((arc) it.next()).d.p(areVar, aquVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((arc) it2.next()).d.p(areVar, aquVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((arc) it3.next()).d.p(areVar, aquVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((arc) it4.next()).d.p(areVar, aquVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((arc) it5.next()).d.p(areVar, aquVar, hashSet, 1, true);
            }
        }
    }

    public final void q(aqu aquVar) {
        aquVar.b(this.J);
        aquVar.b(this.K);
        aquVar.b(this.L);
        aquVar.b(this.M);
        if (this.ab > 0) {
            aquVar.b(this.N);
        }
    }

    public final void r() {
        if (this.h == null) {
            this.h = new aru(this);
        }
        if (this.i == null) {
            this.i = new arv(this);
        }
    }

    public void s() {
        this.J.d();
        this.K.d();
        this.L.d();
        this.M.d();
        this.N.d();
        this.O.d();
        this.P.d();
        this.Q.d();
        this.U = null;
        this.E = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0.5f;
        this.af = 0.5f;
        int[] iArr = this.aq;
        iArr[0] = 1;
        iArr[1] = 1;
        this.ag = null;
        this.ah = 0;
        this.aj = 0;
        this.ak = 0;
        float[] fArr = this.al;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Alert.DURATION_SHOW_INDEFINITELY;
        this.z = Alert.DURATION_SHOW_INDEFINITELY;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.j;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.a = true;
        int[] iArr3 = this.u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.k = -1;
        this.l = -1;
    }

    public final void t() {
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arc arcVar = (arc) arrayList.get(i);
            arcVar.c = false;
            arcVar.b = 0;
        }
    }

    public String toString() {
        String str = this.ai;
        return "" + (str != null ? a.bU((byte) 32, str, "id: ") : "") + '(' + this.Z + ", " + this.aa + ") - (" + this.V + " x " + this.W + ')';
    }

    public final void u(int i) {
        this.ab = i;
        this.F = i > 0;
    }

    public final void v(int i, int i2) {
        if (this.b) {
            return;
        }
        this.J.e(i);
        this.L.e(i2);
        this.Z = i;
        this.V = i2 - i;
        this.b = true;
    }

    public final void w(int i, int i2) {
        if (this.m) {
            return;
        }
        this.K.e(i);
        this.M.e(i2);
        this.aa = i;
        this.W = i2 - i;
        if (this.F) {
            this.N.e(i + this.ab);
        }
        this.m = true;
    }

    public final void x(int i) {
        this.W = i;
        int i2 = this.ad;
        if (i < i2) {
            this.W = i2;
        }
    }

    protected final void y(int i, boolean z) {
        this.T[i] = z;
    }

    public final void z(int i, int i2) {
        this.H = i;
        this.I = i2;
        this.a = false;
    }
}
