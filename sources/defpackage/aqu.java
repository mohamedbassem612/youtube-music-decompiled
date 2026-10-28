package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqu {
    public static boolean a = false;
    public static long b;
    public final aeiv j;
    private final aqt r;
    private aqt s;
    private int k = 1000;
    public boolean c = false;
    int d = 0;
    private int l = 32;
    private int m = 32;
    public boolean f = false;
    public boolean g = false;
    private boolean[] n = new boolean[32];
    int h = 1;
    int i = 0;
    private int o = 32;
    private aqy[] p = new aqy[1000];
    private int q = 0;
    aqt[] e = new aqt[32];

    public aqu() {
        t();
        aeiv aeivVar = new aeiv((byte[]) null, (byte[]) null, (byte[]) null);
        this.j = aeivVar;
        this.r = new aqx(aeivVar);
        this.s = new aqt(aeivVar);
    }

    public static final int o(Object obj) {
        aqy aqyVar = ((arc) obj).h;
        if (aqyVar != null) {
            return (int) (aqyVar.f + 0.5f);
        }
        return 0;
    }

    private final void q(aqt aqtVar) {
        int i;
        if (aqtVar.d) {
            aqtVar.a.d(this, aqtVar.b);
        } else {
            aqt[] aqtVarArr = this.e;
            int i2 = this.i;
            aqtVarArr[i2] = aqtVar;
            aqy aqyVar = aqtVar.a;
            aqyVar.d = i2;
            this.i = i2 + 1;
            aqyVar.e(this, aqtVar);
        }
        if (this.c) {
            int i3 = 0;
            while (i3 < this.i) {
                if (this.e[i3] == null) {
                    System.out.println("WTF");
                }
                aqt aqtVar2 = this.e[i3];
                if (aqtVar2 != null && aqtVar2.d) {
                    aqtVar2.a.d(this, aqtVar2.b);
                    ((auzc) this.j.a).i(aqtVar2);
                    this.e[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.i;
                        if (i4 >= i) {
                            break;
                        }
                        aqt[] aqtVarArr2 = this.e;
                        int i6 = i4 - 1;
                        aqt aqtVar3 = aqtVarArr2[i4];
                        aqtVarArr2[i6] = aqtVar3;
                        aqy aqyVar2 = aqtVar3.a;
                        if (aqyVar2.d == i4) {
                            aqyVar2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.e[i5] = null;
                    }
                    this.i = i - 1;
                    i3--;
                }
                i3++;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i = 0; i < this.i; i++) {
            aqt aqtVar = this.e[i];
            aqtVar.a.f = aqtVar.b;
        }
    }

    private final void s() {
        int i = this.l << 1;
        this.l = i;
        this.e = (aqt[]) Arrays.copyOf(this.e, i);
        aeiv aeivVar = this.j;
        aeivVar.c = (aqy[]) Arrays.copyOf((Object[]) aeivVar.c, this.l);
        int i2 = this.l;
        this.n = new boolean[i2];
        this.m = i2;
        this.o = i2;
    }

    private final void t() {
        for (int i = 0; i < this.i; i++) {
            aqt aqtVar = this.e[i];
            if (aqtVar != null) {
                ((auzc) this.j.a).i(aqtVar);
            }
            this.e[i] = null;
        }
    }

    private final void u(aqt aqtVar) {
        aqs aqsVar;
        int i;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.n[i2] = false;
        }
        boolean z = false;
        int i3 = 0;
        while (!z) {
            z = true;
            i3++;
            if (i3 >= (this.h << 1)) {
                return;
            }
            aqy aqyVar = aqtVar.a;
            if (aqyVar != null) {
                this.n[aqyVar.c] = true;
            }
            aqy aqyVarK = aqtVar.k(this.n);
            if (aqyVarK != null) {
                boolean[] zArr = this.n;
                int i4 = aqyVarK.c;
                if (zArr[i4]) {
                    return;
                }
                zArr[i4] = true;
                float f = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.i; i6++) {
                    aqt aqtVar2 = this.e[i6];
                    if (aqtVar2.a.n != 1 && !aqtVar2.d && (i = (aqsVar = aqtVar2.e).e) != -1) {
                        for (int i7 = 0; i != -1 && i7 < aqsVar.a; i7++) {
                            if (aqsVar.b[i] == aqyVarK.c) {
                                float fA = aqtVar2.e.a(aqyVarK);
                                if (fA >= 0.0f) {
                                    break;
                                }
                                float f2 = (-aqtVar2.b) / fA;
                                if (f2 >= f) {
                                    break;
                                }
                                i5 = i6;
                                f = f2;
                                break;
                            }
                            i = aqsVar.c[i];
                        }
                    }
                }
                if (i5 >= 0) {
                    aqt aqtVar3 = this.e[i5];
                    aqtVar3.a.d = -1;
                    aqtVar3.b(aqyVarK);
                    aqy aqyVar2 = aqtVar3.a;
                    aqyVar2.d = i5;
                    aqyVar2.e(this, aqtVar3);
                }
                z = false;
            }
        }
    }

    private final aqy v(int i) {
        aqy aqyVar = (aqy) ((auzc) this.j.b).h();
        if (aqyVar == null) {
            aqyVar = new aqy(i);
            aqyVar.n = i;
        } else {
            aqyVar.c();
            aqyVar.n = i;
        }
        int i2 = this.q;
        int i3 = this.k;
        if (i2 >= i3) {
            int i4 = i3 << 1;
            this.k = i4;
            this.p = (aqy[]) Arrays.copyOf(this.p, i4);
        }
        aqy[] aqyVarArr = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        aqyVarArr[i5] = aqyVar;
        return aqyVar;
    }

    public final aqt a() {
        aeiv aeivVar = this.j;
        aqt aqtVar = (aqt) ((auzc) aeivVar.a).h();
        if (aqtVar == null) {
            aqtVar = new aqt(aeivVar);
            b++;
        } else {
            aqtVar.a = null;
            aqtVar.e.f();
            aqtVar.b = 0.0f;
            aqtVar.d = false;
        }
        aqy.a++;
        return aqtVar;
    }

    public final aqy b(Object obj) {
        aqy aqyVar;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            s();
        }
        arc arcVar = (arc) obj;
        aqy aqyVar2 = arcVar.h;
        if (aqyVar2 == null) {
            arcVar.i();
            aqyVar = arcVar.h;
        } else {
            aqyVar = aqyVar2;
        }
        int i = aqyVar.c;
        if (i == -1) {
            int i2 = this.d + 1;
            this.d = i2;
            this.h++;
            aqyVar.c = i2;
            aqyVar.n = 1;
            ((aqy[]) this.j.c)[i2] = aqyVar;
        } else if (i > this.d || ((aqy[]) this.j.c)[i] == null) {
            if (i != -1) {
                aqyVar.c();
            }
            int i3 = this.d + 1;
            this.d = i3;
            this.h++;
            aqyVar.c = i3;
            aqyVar.n = 1;
            ((aqy[]) this.j.c)[i3] = aqyVar;
        }
        return aqyVar;
    }

    public final aqy c() {
        if (this.h + 1 >= this.m) {
            s();
        }
        aqy aqyVarV = v(3);
        int i = this.d + 1;
        this.d = i;
        this.h++;
        aqyVarV.c = i;
        ((aqy[]) this.j.c)[i] = aqyVarV;
        return aqyVarV;
    }

    public final void d(aqy aqyVar, aqy aqyVar2, int i, float f, aqy aqyVar3, aqy aqyVar4, int i2, int i3) {
        aqt aqtVarA = a();
        if (aqyVar2 == aqyVar3) {
            aqtVarA.e.g(aqyVar, 1.0f);
            aqtVarA.e.g(aqyVar4, 1.0f);
            aqtVarA.e.g(aqyVar2, -2.0f);
        } else if (f == 0.5f) {
            aqtVarA.e.g(aqyVar, 1.0f);
            aqtVarA.e.g(aqyVar2, -1.0f);
            aqtVarA.e.g(aqyVar3, -1.0f);
            aqtVarA.e.g(aqyVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                aqtVarA.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            aqtVarA.e.g(aqyVar, -1.0f);
            aqtVarA.e.g(aqyVar2, 1.0f);
            aqtVarA.b = i;
        } else if (f >= 1.0f) {
            aqtVarA.e.g(aqyVar4, -1.0f);
            aqtVarA.e.g(aqyVar3, 1.0f);
            aqtVarA.b = -i2;
        } else {
            float f2 = 1.0f - f;
            aqtVarA.e.g(aqyVar, f2);
            aqtVarA.e.g(aqyVar2, -f2);
            aqtVarA.e.g(aqyVar3, -f);
            aqtVarA.e.g(aqyVar4, f);
            if (i > 0 || i2 > 0) {
                aqtVarA.b = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            aqtVarA.f(this, i3);
        }
        e(aqtVarA);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0106  */
    public final void e(aqt aqtVar) {
        boolean z;
        boolean z2;
        aqy aqyVarA;
        if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
            s();
        }
        if (!aqtVar.d) {
            if (this.e.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int i = aqtVar.e.a;
                    for (int i2 = 0; i2 < i; i2++) {
                        aqy aqyVarD = aqtVar.e.d(i2);
                        if (aqyVarD.d != -1 || aqyVarD.g) {
                            aqtVar.c.add(aqyVarD);
                        } else {
                            boolean z4 = aqyVarD.m;
                        }
                    }
                    ArrayList arrayList = aqtVar.c;
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            aqy aqyVar = (aqy) arrayList.get(i3);
                            if (aqyVar.g) {
                                aqtVar.c(this, aqyVar, true);
                            } else {
                                boolean z5 = aqyVar.m;
                                aqtVar.d(this, this.e[aqyVar.d], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (aqtVar.a != null && aqtVar.e.a == 0) {
                    aqtVar.d = true;
                    this.c = true;
                }
            }
            if (aqtVar.e()) {
                return;
            }
            float f = aqtVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                aqtVar.b = -f;
                aqs aqsVar = aqtVar.e;
                int i4 = aqsVar.e;
                for (int i5 = 0; i4 != -1 && i5 < aqsVar.a; i5++) {
                    float[] fArr = aqsVar.d;
                    fArr[i4] = -fArr[i4];
                    i4 = aqsVar.c[i4];
                }
            }
            int i6 = aqtVar.e.a;
            float f3 = 0.0f;
            float f4 = 0.0f;
            aqy aqyVar2 = null;
            aqy aqyVar3 = null;
            int i7 = 0;
            boolean zL = false;
            boolean zL2 = false;
            while (i7 < i6) {
                float fB = aqtVar.e.b(i7);
                aqy aqyVarD2 = aqtVar.e.d(i7);
                float f5 = f2;
                if (aqyVarD2.n == 1) {
                    if (aqyVar2 == null || f3 > fB) {
                        zL = aqt.l(aqyVarD2);
                    } else if (!zL && aqt.l(aqyVarD2)) {
                        zL = true;
                    }
                    aqyVar2 = aqyVarD2;
                    f3 = fB;
                } else if (aqyVar2 == null) {
                    if (fB >= f5) {
                        aqyVar2 = null;
                    } else {
                        if (aqyVar3 == null || f4 > fB) {
                            zL2 = aqt.l(aqyVarD2);
                        } else if (zL2 || !aqt.l(aqyVarD2)) {
                            aqyVar2 = null;
                        } else {
                            zL2 = true;
                        }
                        aqyVar3 = aqyVarD2;
                        aqyVar2 = null;
                        f4 = fB;
                    }
                }
                i7++;
                f2 = f5;
            }
            float f6 = f2;
            if (aqyVar2 == null) {
                aqyVar2 = aqyVar3;
            }
            if (aqyVar2 == null) {
                z = true;
            } else {
                aqtVar.b(aqyVar2);
                z = false;
            }
            if (aqtVar.e.a == 0) {
                aqtVar.d = true;
            }
            if (z) {
                if (this.h + 1 >= this.m) {
                    s();
                }
                aqy aqyVarV = v(3);
                int i8 = this.d + 1;
                this.d = i8;
                this.h++;
                aqyVarV.c = i8;
                aeiv aeivVar = this.j;
                ((aqy[]) aeivVar.c)[i8] = aqyVarV;
                aqtVar.a = aqyVarV;
                int i9 = this.i;
                q(aqtVar);
                if (this.i == i9 + 1) {
                    aqt aqtVar2 = this.s;
                    aqtVar2.a = null;
                    aqtVar2.e.f();
                    int i10 = 0;
                    while (true) {
                        aqs aqsVar2 = aqtVar.e;
                        if (i10 >= aqsVar2.a) {
                            break;
                        }
                        aqtVar2.e.e(aqsVar2.d(i10), aqtVar.e.b(i10), true);
                        i10++;
                    }
                    u(this.s);
                    if (aqyVarV.d == -1) {
                        if (aqtVar.a == aqyVarV && (aqyVarA = aqtVar.a(null, aqyVarV)) != null) {
                            aqtVar.b(aqyVarA);
                        }
                        if (!aqtVar.d) {
                            aqtVar.a.e(this, aqtVar);
                        }
                        ((auzc) aeivVar.a).i(aqtVar);
                        this.i--;
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            aqy aqyVar4 = aqtVar.a;
            if (aqyVar4 == null) {
                return;
            }
            if ((aqyVar4.n != 1 && aqtVar.b < f6) || z2) {
                return;
            }
        }
        q(aqtVar);
    }

    public final void f(aqy aqyVar, int i) {
        int i2 = aqyVar.d;
        if (i2 == -1) {
            aqyVar.d(this, i);
            for (int i3 = 0; i3 < this.d + 1; i3++) {
                aqy aqyVar2 = ((aqy[]) this.j.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            float f = i;
            aqt aqtVarA = a();
            aqtVarA.a = aqyVar;
            aqyVar.f = f;
            aqtVarA.b = f;
            aqtVarA.d = true;
            e(aqtVarA);
            return;
        }
        aqt aqtVar = this.e[i2];
        if (aqtVar.d) {
            aqtVar.b = i;
            return;
        }
        if (aqtVar.e.a == 0) {
            aqtVar.d = true;
            aqtVar.b = i;
            return;
        }
        aqt aqtVarA2 = a();
        if (i < 0) {
            aqtVarA2.b = -i;
            aqtVarA2.e.g(aqyVar, 1.0f);
        } else {
            aqtVarA2.b = i;
            aqtVarA2.e.g(aqyVar, -1.0f);
        }
        e(aqtVarA2);
    }

    public final void g(aqy aqyVar, aqy aqyVar2, int i, int i2) {
        aqt aqtVarA = a();
        aqy aqyVarC = c();
        aqyVarC.e = 0;
        aqtVarA.h(aqyVar, aqyVar2, aqyVarC, i);
        if (i2 != 8) {
            i(aqtVarA, (int) (-aqtVarA.e.a(aqyVarC)), i2);
        }
        e(aqtVarA);
    }

    public final void h(aqy aqyVar, aqy aqyVar2, int i, int i2) {
        aqt aqtVarA = a();
        aqy aqyVarC = c();
        aqyVarC.e = 0;
        aqtVarA.i(aqyVar, aqyVar2, aqyVarC, i);
        if (i2 != 8) {
            i(aqtVarA, (int) (-aqtVarA.e.a(aqyVarC)), i2);
        }
        e(aqtVarA);
    }

    final void i(aqt aqtVar, int i, int i2) {
        aqtVar.e.g(p(i2), i);
    }

    public final void j() {
        aqt aqtVar = this.r;
        if (aqtVar.e()) {
            r();
            return;
        }
        if (!this.g) {
            l(aqtVar);
            return;
        }
        for (int i = 0; i < this.i; i++) {
            if (!this.e[i].d) {
                l(aqtVar);
                return;
            }
        }
        r();
    }

    public final void k() {
        aeiv aeivVar;
        int i = 0;
        while (true) {
            aeivVar = this.j;
            aqy[] aqyVarArr = (aqy[]) aeivVar.c;
            if (i >= aqyVarArr.length) {
                break;
            }
            aqy aqyVar = aqyVarArr[i];
            if (aqyVar != null) {
                aqyVar.c();
            }
            i++;
        }
        Object obj = aeivVar.b;
        aqy[] aqyVarArr2 = this.p;
        int i2 = this.q;
        int length = aqyVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            aqy aqyVar2 = aqyVarArr2[i3];
            auzc auzcVar = (auzc) obj;
            int i4 = auzcVar.a;
            if (i4 < 256) {
                ((Object[]) auzcVar.b)[i4] = aqyVar2;
                auzcVar.a = i4 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[]) aeivVar.c, (Object) null);
        this.d = 0;
        aqx aqxVar = (aqx) this.r;
        aqxVar.f = 0;
        aqxVar.b = 0.0f;
        this.h = 1;
        for (int i5 = 0; i5 < this.i; i5++) {
            aqt aqtVar = this.e[i5];
        }
        t();
        this.i = 0;
        this.s = new aqt(aeivVar);
    }

    final void l(aqt aqtVar) {
        boolean z;
        for (int i = 0; i < this.i; i++) {
            aqt aqtVar2 = this.e[i];
            if (aqtVar2.a.n != 1) {
                float f = 0.0f;
                if (aqtVar2.b < 0.0f) {
                    boolean z2 = false;
                    int i2 = 0;
                    while (!z2) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.i) {
                            aqt aqtVar3 = this.e[i5];
                            if (aqtVar3.a.n != 1 && !aqtVar3.d && aqtVar3.b < f) {
                                int i7 = aqtVar3.e.a;
                                int i8 = 0;
                                while (i8 < i7) {
                                    aqy aqyVarD = aqtVar3.e.d(i8);
                                    float fA = aqtVar3.e.a(aqyVarD);
                                    if (fA > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = aqyVarD.h[i9] / fA;
                                            if ((f3 < f2 && i9 == i6) || i9 > i6) {
                                                i4 = aqyVarD.c;
                                                i6 = i9;
                                                f2 = f3;
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            aqt aqtVar4 = this.e[i3];
                            aqtVar4.a.d = -1;
                            aqtVar4.b(((aqy[]) this.j.c)[i4]);
                            aqy aqyVar = aqtVar4.a;
                            aqyVar.d = i3;
                            aqyVar.e(this, aqtVar4);
                            z = false;
                        } else {
                            z = true;
                        }
                        z2 = (!(i2 <= this.h / 2)) | z;
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        u(aqtVar);
        r();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final void m(aqy aqyVar, aqy aqyVar2, int i, int i2) {
        boolean z;
        if (i2 == 8) {
            if (aqyVar2.g && aqyVar.d == -1) {
                aqyVar.d(this, aqyVar2.f + i);
                return;
            }
            i2 = 8;
        }
        aqt aqtVarA = a();
        if (i == 0) {
            aqtVarA.e.g(aqyVar, -1.0f);
            aqtVarA.e.g(aqyVar2, 1.0f);
        } else {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            aqtVarA.b = i;
            if (z) {
                aqtVarA.e.g(aqyVar, 1.0f);
                aqtVarA.e.g(aqyVar2, -1.0f);
            } else {
                aqtVarA.e.g(aqyVar, -1.0f);
                aqtVarA.e.g(aqyVar2, 1.0f);
            }
        }
        if (i2 != 8) {
            aqtVarA.f(this, i2);
        }
        e(aqtVarA);
    }

    public final void n(aqy aqyVar, aqy aqyVar2, aqy aqyVar3, aqy aqyVar4, float f) {
        aqt aqtVarA = a();
        aqtVarA.g(aqyVar, aqyVar2, aqyVar3, aqyVar4, f);
        e(aqtVarA);
    }

    public final aqy p(int i) {
        if (this.h + 1 >= this.m) {
            s();
        }
        aqy aqyVarV = v(4);
        int i2 = this.d + 1;
        this.d = i2;
        this.h++;
        aqyVarV.c = i2;
        aqyVarV.e = i;
        ((aqy[]) this.j.c)[i2] = aqyVarV;
        aqx aqxVar = (aqx) this.r;
        aqw aqwVar = aqxVar.g;
        aqwVar.a = aqyVarV;
        Arrays.fill(aqwVar.a.i, 0.0f);
        aqyVarV.i[aqyVarV.e] = 1.0f;
        aqxVar.m(aqyVarV);
        return aqyVarV;
    }
}
