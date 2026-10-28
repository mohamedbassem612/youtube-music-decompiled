package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class aqt {
    aqy a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public aqs e;

    public aqt(aeiv aeivVar) {
        this.e = new aqs(this, aeivVar);
    }

    public static final boolean l(aqy aqyVar) {
        return aqyVar.l <= 1;
    }

    public final aqy a(boolean[] zArr, aqy aqyVar) {
        int i;
        int i2 = this.e.a;
        aqy aqyVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < 0.0f) {
                aqy aqyVarD = this.e.d(i3);
                if ((zArr == null || !zArr[aqyVarD.c]) && aqyVarD != aqyVar && (((i = aqyVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    aqyVar2 = aqyVarD;
                }
            }
        }
        return aqyVar2;
    }

    final void b(aqy aqyVar) {
        aqy aqyVar2 = this.a;
        if (aqyVar2 != null) {
            this.e.g(aqyVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(aqyVar, true);
        this.a = aqyVar;
        if (f != 1.0f) {
            this.b /= f;
            aqs aqsVar = this.e;
            int i = aqsVar.e;
            for (int i2 = 0; i != -1 && i2 < aqsVar.a; i2++) {
                float[] fArr = aqsVar.d;
                fArr[i] = fArr[i] / f;
                i = aqsVar.c[i];
            }
        }
    }

    public final void c(aqu aquVar, aqy aqyVar, boolean z) {
        if (aqyVar == null || !aqyVar.g) {
            return;
        }
        this.b += aqyVar.f * this.e.a(aqyVar);
        this.e.c(aqyVar, z);
        if (z) {
            aqyVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            aquVar.c = true;
        }
    }

    public void d(aqu aquVar, aqt aqtVar, boolean z) {
        aqs aqsVar = this.e;
        float fA = aqsVar.a(aqtVar.a);
        aqsVar.c(aqtVar.a, z);
        aqs aqsVar2 = aqtVar.e;
        int i = aqsVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            aqy aqyVarD = aqsVar2.d(i2);
            aqsVar.e(aqyVarD, aqsVar2.a(aqyVarD) * fA, z);
        }
        this.b += aqtVar.b * fA;
        if (z) {
            aqtVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        aquVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(aqu aquVar, int i) {
        this.e.g(aquVar.p(i), 1.0f);
        this.e.g(aquVar.p(i), -1.0f);
    }

    public final void g(aqy aqyVar, aqy aqyVar2, aqy aqyVar3, aqy aqyVar4, float f) {
        this.e.g(aqyVar, -1.0f);
        this.e.g(aqyVar2, 1.0f);
        this.e.g(aqyVar3, f);
        this.e.g(aqyVar4, -f);
    }

    public final void h(aqy aqyVar, aqy aqyVar2, aqy aqyVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(aqyVar, 1.0f);
                this.e.g(aqyVar2, -1.0f);
                this.e.g(aqyVar3, -1.0f);
                return;
            }
        }
        this.e.g(aqyVar, -1.0f);
        this.e.g(aqyVar2, 1.0f);
        this.e.g(aqyVar3, 1.0f);
    }

    public final void i(aqy aqyVar, aqy aqyVar2, aqy aqyVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(aqyVar, 1.0f);
                this.e.g(aqyVar2, -1.0f);
                this.e.g(aqyVar3, 1.0f);
                return;
            }
        }
        this.e.g(aqyVar, -1.0f);
        this.e.g(aqyVar2, 1.0f);
        this.e.g(aqyVar3, -1.0f);
    }

    public final void j(aqy aqyVar, aqy aqyVar2, aqy aqyVar3, aqy aqyVar4, float f) {
        this.e.g(aqyVar3, 0.5f);
        this.e.g(aqyVar4, 0.5f);
        this.e.g(aqyVar, -0.5f);
        this.e.g(aqyVar2, -0.5f);
        this.b = -f;
    }

    public aqy k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        boolean z;
        String str;
        aqy aqyVar = this.a;
        String strConcat = aqyVar == null ? "0" : "".concat(aqyVar.toString());
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + f;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            aqy aqyVarD = this.e.d(i2);
            if (aqyVarD != null) {
                float fB = this.e.b(i2);
                if (fB != 0.0f) {
                    String string = aqyVarD.toString();
                    if (z) {
                        if (fB > 0.0f) {
                            str = " + ";
                        } else {
                            fB = -fB;
                            str = " - ";
                        }
                        strConcat2 = strConcat2.concat(str);
                    } else if (fB < 0.0f) {
                        fB = -fB;
                        strConcat2 = strConcat2.concat("- ");
                    }
                    strConcat2 = fB == 1.0f ? strConcat2.concat(string) : strConcat2 + fB + ' ' + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }

    public aqt() {
    }
}
