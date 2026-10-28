package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aqx extends aqt {
    public int f;
    final aqw g;
    private aqy[] h;
    private aqy[] i;

    public aqx(aeiv aeivVar) {
        super(aeivVar);
        this.h = new aqy[SemanticState.Focused];
        this.i = new aqy[SemanticState.Focused];
        this.f = 0;
        this.g = new aqw(this);
    }

    @Override // defpackage.aqt
    public final void d(aqu aquVar, aqt aqtVar, boolean z) {
        aqy aqyVar = aqtVar.a;
        if (aqyVar != null) {
            aqs aqsVar = aqtVar.e;
            int i = aqsVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                aqy aqyVarD = aqsVar.d(i2);
                float fB = aqsVar.b(i2);
                aqw aqwVar = this.g;
                aqwVar.a = aqyVarD;
                if (aqwVar.a.b) {
                    boolean z2 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = aqwVar.a.i;
                        float f = fArr[i3] + (aqyVar.i[i3] * fB);
                        fArr[i3] = f;
                        if (Math.abs(f) < 1.0E-4f) {
                            aqwVar.a.i[i3] = 0.0f;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        aqwVar.b.n(aqwVar.a);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f2 = aqyVar.i[i4];
                        if (f2 != 0.0f) {
                            float f3 = f2 * fB;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            aqwVar.a.i[i4] = f3;
                        } else {
                            aqwVar.a.i[i4] = 0.0f;
                        }
                    }
                    m(aqyVarD);
                }
                this.b += aqtVar.b * fB;
            }
            n(aqyVar);
        }
    }

    @Override // defpackage.aqt
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.aqt
    public final aqy k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            aqy[] aqyVarArr = this.h;
            aqy aqyVar = aqyVarArr[i2];
            if (!zArr[aqyVar.c]) {
                aqw aqwVar = this.g;
                aqwVar.a = aqyVar;
                int i3 = 8;
                if (i != -1) {
                    aqy aqyVar2 = aqyVarArr[i];
                    while (i3 >= 0) {
                        float f = aqyVar2.i[i3];
                        float f2 = aqwVar.a.i[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (true) {
                        if (i3 >= 0) {
                            float f3 = aqwVar.a.i[i3];
                            if (f3 <= 0.0f) {
                                if (f3 < 0.0f) {
                                    i = i2;
                                    break;
                                }
                                i3--;
                            }
                        }
                        i = -1;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(aqy aqyVar) {
        int i;
        aqy[] aqyVarArr;
        int i2 = this.f + 1;
        aqy[] aqyVarArr2 = this.h;
        int length = aqyVarArr2.length;
        if (i2 > length) {
            aqy[] aqyVarArr3 = (aqy[]) Arrays.copyOf(aqyVarArr2, length << 1);
            this.h = aqyVarArr3;
            this.i = (aqy[]) Arrays.copyOf(aqyVarArr3, aqyVarArr3.length << 1);
        }
        aqy[] aqyVarArr4 = this.h;
        int i3 = this.f;
        aqyVarArr4[i3] = aqyVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && aqyVarArr4[i3].c > aqyVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                aqyVarArr = this.i;
                if (i5 >= i) {
                    break;
                }
                aqyVarArr[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(aqyVarArr, 0, i, new aqv(0));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        aqyVar.b = true;
        aqyVar.a(this);
    }

    public final void n(aqy aqyVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == aqyVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        aqyVar.b = false;
                        return;
                    } else {
                        aqy[] aqyVarArr = this.h;
                        int i3 = i + 1;
                        aqyVarArr[i] = aqyVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.aqt
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            aqy aqyVar = this.h[i];
            aqw aqwVar = this.g;
            aqwVar.a = aqyVar;
            str = str + String.valueOf(aqwVar) + ' ';
        }
        return str;
    }
}
