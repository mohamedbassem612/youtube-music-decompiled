package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ak {
    public final aj d;
    public an a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public ak(ahto ahtoVar) {
        this.d = new aj(this, ahtoVar);
    }

    public final void a(an anVar) {
        an anVar2 = this.a;
        if (anVar2 != null) {
            this.d.f(anVar2, -1.0f);
            this.a = null;
        }
        aj ajVar = this.d;
        float f = -ajVar.c(anVar);
        this.a = anVar;
        if (f != 1.0f) {
            this.b /= f;
            int i = ajVar.e;
            for (int i2 = 0; i != -1 && i2 < ajVar.a; i2++) {
                float[] fArr = ajVar.d;
                fArr[i] = fArr[i] / f;
                i = ajVar.c[i];
            }
        }
    }

    final void b() {
        aj ajVar = this.d;
        int i = ajVar.e;
        for (int i2 = 0; i != -1 && i2 < ajVar.a; i2++) {
            an anVar = ((an[]) ajVar.h.c)[ajVar.b[i]];
            int i3 = 0;
            while (true) {
                int i4 = anVar.g;
                if (i3 >= i4) {
                    ak[] akVarArr = anVar.f;
                    int length = akVarArr.length;
                    if (i4 >= length) {
                        anVar.f = (ak[]) Arrays.copyOf(akVarArr, length << 1);
                    }
                    ak[] akVarArr2 = anVar.f;
                    int i5 = anVar.g;
                    akVarArr2[i5] = this;
                    anVar.g = i5 + 1;
                    break;
                }
                if (anVar.f[i3] == this) {
                    break;
                } else {
                    i3++;
                }
            }
            i = ajVar.c[i];
        }
    }

    public final void c(an anVar, an anVar2) {
        aj ajVar = this.d;
        ajVar.f(anVar, 1.0f);
        ajVar.f(anVar2, -1.0f);
    }

    final void d(an anVar, an anVar2, int i, float f, an anVar3, an anVar4, int i2) {
        if (anVar2 == anVar3) {
            aj ajVar = this.d;
            ajVar.f(anVar, 1.0f);
            ajVar.f(anVar4, 1.0f);
            ajVar.f(anVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            aj ajVar2 = this.d;
            ajVar2.f(anVar, 1.0f);
            ajVar2.f(anVar2, -1.0f);
            ajVar2.f(anVar3, -1.0f);
            ajVar2.f(anVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            aj ajVar3 = this.d;
            ajVar3.f(anVar, -1.0f);
            ajVar3.f(anVar2, 1.0f);
            this.b = i;
            return;
        }
        aj ajVar4 = this.d;
        if (f >= 1.0f) {
            ajVar4.f(anVar3, -1.0f);
            ajVar4.f(anVar4, 1.0f);
            this.b = i2;
            return;
        }
        float f2 = 1.0f - f;
        ajVar4.f(anVar, f2);
        ajVar4.f(anVar2, -f2);
        ajVar4.f(anVar3, -f);
        ajVar4.f(anVar4, f);
        if (i > 0 || i2 > 0) {
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(an anVar, an anVar2, an anVar3, an anVar4, float f) {
        aj ajVar = this.d;
        ajVar.f(anVar, -1.0f);
        ajVar.f(anVar2, 1.0f);
        ajVar.f(anVar3, f);
        ajVar.f(anVar4, -f);
    }

    public final void f(float f, float f2, float f3, an anVar, int i, an anVar2, int i2, an anVar3, int i3, an anVar4, int i4) {
        int i5 = (-i) - i2;
        if (f2 == 0.0f || f == f3) {
            this.b = i5 + i3 + i4;
            aj ajVar = this.d;
            ajVar.f(anVar, 1.0f);
            ajVar.f(anVar2, -1.0f);
            ajVar.f(anVar4, 1.0f);
            ajVar.f(anVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = i5 + (i3 * f4) + (i4 * f4);
        aj ajVar2 = this.d;
        ajVar2.f(anVar, 1.0f);
        ajVar2.f(anVar2, -1.0f);
        ajVar2.f(anVar4, f4);
        ajVar2.f(anVar3, -f4);
    }

    public final void g(an anVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(anVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(anVar, -1.0f);
        }
    }

    public final void h(an anVar, an anVar2, int i) {
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
                aj ajVar = this.d;
                ajVar.f(anVar, 1.0f);
                ajVar.f(anVar2, -1.0f);
                return;
            }
        }
        aj ajVar2 = this.d;
        ajVar2.f(anVar, -1.0f);
        ajVar2.f(anVar2, 1.0f);
    }

    public final void i(an anVar, an anVar2, an anVar3, int i) {
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
                aj ajVar = this.d;
                ajVar.f(anVar, 1.0f);
                ajVar.f(anVar2, -1.0f);
                ajVar.f(anVar3, -1.0f);
                return;
            }
        }
        aj ajVar2 = this.d;
        ajVar2.f(anVar, -1.0f);
        ajVar2.f(anVar2, 1.0f);
        ajVar2.f(anVar3, 1.0f);
    }

    public final void j(an anVar, an anVar2, an anVar3, int i) {
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
                aj ajVar = this.d;
                ajVar.f(anVar, 1.0f);
                ajVar.f(anVar2, -1.0f);
                ajVar.f(anVar3, 1.0f);
                return;
            }
        }
        aj ajVar2 = this.d;
        ajVar2.f(anVar, -1.0f);
        ajVar2.f(anVar2, 1.0f);
        ajVar2.f(anVar3, -1.0f);
    }

    public final void k(ak akVar) {
        this.d.g(this, akVar);
    }

    public final String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            an anVar = this.a;
            Objects.toString(anVar);
            strConcat = "".concat(String.valueOf(anVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        aj ajVar = this.d;
        int i = ajVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (ajVar.d(i2) != null) {
                float fB = ajVar.b(i2);
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
                strConcat2 = fB == 1.0f ? strConcat2.concat("null") : strConcat2 + fB + " null";
                z = true;
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }
}
