package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class am {
    private static int h = 1000;
    public ak[] c;
    public final ahto g;
    int a = 0;
    public final al b = new al();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private an[] l = new an[h];
    private int m = 0;
    private ak[] n = new ak[32];

    public am() {
        this.c = null;
        this.c = new ak[32];
        r();
        this.g = new ahto((byte[]) null, (byte[]) null, (byte[]) null);
    }

    public static ak b(am amVar, an anVar, an anVar2, int i, float f, an anVar3, an anVar4, int i2, boolean z) {
        ak akVarA = amVar.a();
        akVarA.d(anVar, anVar2, i, f, anVar3, anVar4, i2);
        if (z) {
            an anVarD = amVar.d();
            an anVarD2 = amVar.d();
            anVarD.c = 4;
            anVarD2.c = 4;
            akVarA.c(anVarD, anVarD2);
        }
        return akVarA;
    }

    public static ak c(am amVar, an anVar, an anVar2, int i, boolean z) {
        ak akVarA = amVar.a();
        akVarA.h(anVar, anVar2, i);
        if (z) {
            amVar.k(akVarA, 1);
        }
        return akVarA;
    }

    public static final int p(Object obj) {
        an anVar = ((ao) obj).f;
        if (anVar != null) {
            return (int) (anVar.d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int i = this.i << 1;
        this.i = i;
        this.c = (ak[]) Arrays.copyOf(this.c, i);
        ahto ahtoVar = this.g;
        ahtoVar.c = (an[]) Arrays.copyOf((Object[]) ahtoVar.c, this.i);
        int i2 = this.i;
        this.d = new boolean[i2];
        this.j = i2;
        this.k = i2;
        this.b.a.clear();
    }

    private final void r() {
        int i = 0;
        while (true) {
            ak[] akVarArr = this.c;
            if (i >= akVarArr.length) {
                return;
            }
            ak akVar = akVarArr[i];
            if (akVar != null) {
                ((kjs) this.g.a).o(akVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final an s(int i) {
        an anVar = (an) ((kjs) this.g.b).n();
        if (anVar == null) {
            anVar = new an(i);
        } else {
            anVar.b();
            anVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 << 1;
            h = i4;
            this.l = (an[]) Arrays.copyOf(this.l, i4);
        }
        an[] anVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        anVarArr[i5] = anVar;
        return anVar;
    }

    public final ak a() {
        ahto ahtoVar = this.g;
        ak akVar = (ak) ((kjs) ahtoVar.a).n();
        if (akVar == null) {
            return new ak(ahtoVar);
        }
        akVar.a = null;
        aj ajVar = akVar.d;
        ajVar.e = -1;
        ajVar.f = -1;
        ajVar.g = false;
        ajVar.a = 0;
        akVar.b = 0.0f;
        akVar.e = false;
        return akVar;
    }

    public final an d() {
        if (this.e + 1 >= this.j) {
            q();
        }
        an anVarS = s(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        anVarS.a = i;
        ((an[]) this.g.c)[i] = anVarS;
        return anVarS;
    }

    public final an e(Object obj) {
        an anVar;
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            q();
        }
        ao aoVar = (ao) obj;
        an anVar2 = aoVar.f;
        if (anVar2 == null) {
            aoVar.e();
            anVar = aoVar.f;
        } else {
            anVar = anVar2;
        }
        int i = anVar.a;
        if (i == -1) {
            int i2 = this.a + 1;
            this.a = i2;
            this.e++;
            anVar.a = i2;
            anVar.h = 1;
            ((an[]) this.g.c)[i2] = anVar;
        } else if (i > this.a || ((an[]) this.g.c)[i] == null) {
            if (i != -1) {
                anVar.b();
            }
            int i3 = this.a + 1;
            this.a = i3;
            this.e++;
            anVar.a = i3;
            anVar.h = 1;
            ((an[]) this.g.c)[i3] = anVar;
        }
        return anVar;
    }

    public final an f() {
        if (this.e + 1 >= this.j) {
            q();
        }
        an anVarS = s(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        anVarS.a = i;
        ((an[]) this.g.c)[i] = anVarS;
        return anVarS;
    }

    public final void g(ak akVar) {
        ak[] akVarArr;
        if (this.f + 1 >= this.k || this.e + 1 >= this.j) {
            q();
        }
        if (!akVar.e) {
            if (this.f > 0) {
                aj ajVar = akVar.d;
                ak[] akVarArr2 = this.c;
                int i = ajVar.e;
                loop0: while (true) {
                    int i2 = 0;
                    while (true) {
                        if (i == -1 || i2 >= ajVar.a) {
                            break loop0;
                        }
                        ahto ahtoVar = ajVar.h;
                        an anVar = ((an[]) ahtoVar.c)[ajVar.b[i]];
                        if (anVar.b != -1) {
                            float f = ajVar.d[i];
                            ajVar.c(anVar);
                            ak akVar2 = akVarArr2[anVar.b];
                            if (!akVar2.e) {
                                aj ajVar2 = akVar2.d;
                                int i3 = ajVar2.e;
                                for (int i4 = 0; i3 != -1 && i4 < ajVar2.a; i4++) {
                                    ajVar.e(((an[]) ahtoVar.c)[ajVar2.b[i3]], ajVar2.d[i3] * f);
                                    i3 = ajVar2.c[i3];
                                }
                            }
                            akVar.b += akVar2.b * f;
                            akVar2.a.a(akVar);
                            i = ajVar.e;
                        } else {
                            i = ajVar.c[i];
                            i2++;
                        }
                    }
                }
                if (ajVar.a == 0) {
                    akVar.e = true;
                }
            }
            float f2 = akVar.b;
            if (f2 < 0.0f) {
                akVar.b = -f2;
                aj ajVar3 = akVar.d;
                int i5 = ajVar3.e;
                for (int i6 = 0; i5 != -1 && i6 < ajVar3.a; i6++) {
                    float[] fArr = ajVar3.d;
                    fArr[i5] = -fArr[i5];
                    i5 = ajVar3.c[i5];
                }
            }
            aj ajVar4 = akVar.d;
            int i7 = ajVar4.e;
            an anVar2 = null;
            int i8 = 0;
            an anVar3 = null;
            while (true) {
                if (i7 == -1 || i8 >= ajVar4.a) {
                    if (anVar3 == null) {
                        break;
                    }
                    anVar2 = anVar3;
                    break;
                }
                float[] fArr2 = ajVar4.d;
                float f3 = fArr2[i7];
                if (f3 < 0.0f) {
                    if (f3 > -0.001f) {
                        fArr2[i7] = 0.0f;
                        f3 = 0.0f;
                    }
                } else if (f3 < 0.001f) {
                    fArr2[i7] = 0.0f;
                    f3 = 0.0f;
                }
                if (f3 != 0.0f) {
                    an anVar4 = ((an[]) ajVar4.h.c)[ajVar4.b[i7]];
                    if (anVar4.h == 1) {
                        if (f3 < 0.0f) {
                            anVar2 = anVar4;
                            break;
                        } else if (anVar3 == null) {
                            anVar3 = anVar4;
                        }
                    } else if (f3 < 0.0f && (anVar2 == null || anVar4.c < anVar2.c)) {
                        anVar2 = anVar4;
                    }
                }
                i7 = ajVar4.c[i7];
                i8++;
            }
            if (anVar2 != null) {
                akVar.a(anVar2);
            }
            if (ajVar4.a == 0) {
                akVar.e = true;
            }
            an anVar5 = akVar.a;
            if (anVar5 == null) {
                return;
            }
            if (anVar5.h != 1 && akVar.b < 0.0f) {
                return;
            }
        }
        ak akVar3 = this.c[this.f];
        if (akVar3 != null) {
            ((kjs) this.g.a).o(akVar3);
        }
        if (!akVar.e) {
            akVar.b();
        }
        ak[] akVarArr3 = this.c;
        int i9 = this.f;
        akVarArr3[i9] = akVar;
        an anVar6 = akVar.a;
        anVar6.b = i9;
        this.f = i9 + 1;
        int i10 = anVar6.g;
        if (i10 > 0) {
            while (true) {
                akVarArr = this.n;
                int length = akVarArr.length;
                if (length >= i10) {
                    break;
                } else {
                    this.n = new ak[length << 1];
                }
            }
            for (int i11 = 0; i11 < i10; i11++) {
                akVarArr[i11] = akVar.a.f[i11];
            }
            for (int i12 = 0; i12 < i10; i12++) {
                ak akVar4 = akVarArr[i12];
                if (akVar4 != akVar) {
                    akVar4.d.g(akVar4, akVar);
                    akVar4.b();
                }
            }
        }
    }

    public final void h(an anVar, int i) {
        int i2 = anVar.b;
        if (i2 != -1) {
            ak akVar = this.c[i2];
            if (akVar.e) {
                akVar.b = i;
                return;
            }
            ak akVarA = a();
            akVarA.g(anVar, i);
            g(akVarA);
            return;
        }
        float f = i;
        ak akVarA2 = a();
        akVarA2.a = anVar;
        anVar.d = f;
        akVarA2.b = f;
        akVarA2.e = true;
        g(akVarA2);
    }

    public final void i(an anVar, an anVar2, int i, int i2) {
        ak akVarA = a();
        an anVarF = f();
        anVarF.c = i2;
        akVarA.i(anVar, anVar2, anVarF, i);
        g(akVarA);
    }

    public final void j(an anVar, an anVar2, int i, int i2) {
        ak akVarA = a();
        an anVarF = f();
        anVarF.c = i2;
        akVarA.j(anVar, anVar2, anVarF, i);
        g(akVarA);
    }

    public final void k(ak akVar, int i) {
        akVar.d.f(d(), i);
    }

    public final void l() {
        ahto ahtoVar;
        int i = 0;
        while (true) {
            ahtoVar = this.g;
            an[] anVarArr = (an[]) ahtoVar.c;
            if (i >= anVarArr.length) {
                break;
            }
            an anVar = anVarArr[i];
            if (anVar != null) {
                anVar.b();
            }
            i++;
        }
        Object obj = ahtoVar.b;
        an[] anVarArr2 = this.l;
        int i2 = this.m;
        int length = anVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            an anVar2 = anVarArr2[i3];
            kjs kjsVar = (kjs) obj;
            int i4 = kjsVar.a;
            if (i4 < 256) {
                ((Object[]) kjsVar.b)[i4] = anVar2;
                kjsVar.a = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill((Object[]) ahtoVar.c, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        r();
        this.f = 0;
    }

    public final void m(an anVar, an anVar2, int i, float f, an anVar3, an anVar4, int i2) {
        ak akVarA = a();
        akVarA.d(anVar, anVar2, i, f, anVar3, anVar4, i2);
        an anVarD = d();
        an anVarD2 = d();
        anVarD.c = 4;
        anVarD2.c = 4;
        akVarA.c(anVarD, anVarD2);
        g(akVarA);
    }

    public final void n(an anVar, an anVar2, int i, int i2) {
        ak akVarA = a();
        akVarA.h(anVar, anVar2, i);
        an anVarD = d();
        an anVarD2 = d();
        anVarD.c = i2;
        anVarD2.c = i2;
        akVarA.c(anVarD, anVarD2);
        g(akVarA);
    }

    public final void o(al alVar) {
        for (int i = 0; i < this.f; i++) {
            ak akVar = this.c[i];
            if (akVar.a.h != 1 && akVar.b < 0.0f) {
                while (true) {
                    float f = Float.MAX_VALUE;
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        ak akVar2 = this.c[i5];
                        if (akVar2.a.h != 1 && akVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                an anVar = ((an[]) this.g.c)[i6];
                                float fA = akVar2.d.a(anVar);
                                if (fA > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = anVar.e[i7] / fA;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    ak akVar3 = this.c[i2];
                    akVar3.a.b = -1;
                    akVar3.a(((an[]) this.g.c)[i3]);
                    akVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        this.c[i8].k(akVar3);
                    }
                    alVar.a(this);
                }
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            ak akVar4 = this.c[i9];
            if (akVar4.a.h != 1 && akVar4.b < 0.0f) {
                return;
            }
        }
    }
}
