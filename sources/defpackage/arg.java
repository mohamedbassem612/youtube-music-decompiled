package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class arg extends ard {
    private boolean as;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public arc d = this.K;
    public int ar = 0;

    public arg() {
        this.S.clear();
        this.S.add(this.d);
        int length = this.R.length;
        for (int i = 0; i < 6; i++) {
            this.R[i] = this.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f A[PHI: r0
      0x000f: PHI (r0v1 int) = (r0v0 int), (r0v2 int), (r0v0 int) binds: [B:3:0x0003, B:10:0x000e, B:7:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:
    
        if (r3 == 4) goto L10;
     */
    @Override // defpackage.ard
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.arc K(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto Lf
            r1 = 2
            if (r3 == r1) goto Le
            r1 = 3
            if (r3 == r1) goto Lf
            r0 = 4
            if (r3 != r0) goto L16
        Le:
            r0 = 0
        Lf:
            int r3 = r2.ar
            if (r3 != r0) goto L16
            arc r2 = r2.d
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arg.K(int):arc");
    }

    @Override // defpackage.ard
    public final void R(boolean z) {
        if (this.U != null) {
            int iO = aqu.o(this.d);
            if (this.ar == 1) {
                this.Z = iO;
                this.aa = 0;
                x(this.U.h());
                C(0);
                return;
            }
            this.Z = 0;
            this.aa = iO;
            C(this.U.j());
            x(0);
        }
    }

    public final void a(int i) {
        this.d.e(i);
        this.as = true;
    }

    @Override // defpackage.ard
    public final void b(aqu aquVar, boolean z) {
        ard ardVar = this.U;
        if (ardVar != null) {
            Object objK = ardVar.K(2);
            Object objK2 = ardVar.K(4);
            ard ardVar2 = this.U;
            boolean z2 = ardVar2 != null && ardVar2.aq[0] == 2;
            if (this.ar == 0) {
                objK = ardVar.K(3);
                objK2 = ardVar.K(5);
                z2 = ardVar2 != null && ardVar2.aq[1] == 2;
            }
            if (this.as) {
                arc arcVar = this.d;
                if (arcVar.c) {
                    aqy aqyVarB = aquVar.b(arcVar);
                    aquVar.f(aqyVarB, this.d.a());
                    if (this.b != -1) {
                        if (z2) {
                            aquVar.g(aquVar.b(objK2), aqyVarB, 0, 5);
                        }
                    } else if (this.c != -1 && z2) {
                        aqy aqyVarB2 = aquVar.b(objK2);
                        aquVar.g(aqyVarB, aquVar.b(objK), 0, 5);
                        aquVar.g(aqyVarB2, aqyVarB, 0, 5);
                    }
                    this.as = false;
                    return;
                }
            }
            if (this.b != -1) {
                aqy aqyVarB3 = aquVar.b(this.d);
                aquVar.m(aqyVarB3, aquVar.b(objK), this.b, 8);
                if (z2) {
                    aquVar.g(aquVar.b(objK2), aqyVarB3, 0, 5);
                    return;
                }
                return;
            }
            if (this.c != -1) {
                aqy aqyVarB4 = aquVar.b(this.d);
                aqy aqyVarB5 = aquVar.b(objK2);
                aquVar.m(aqyVarB4, aqyVarB5, -this.c, 8);
                if (z2) {
                    aquVar.g(aqyVarB4, aquVar.b(objK), 0, 5);
                    aquVar.g(aqyVarB5, aqyVarB4, 0, 5);
                    return;
                }
                return;
            }
            if (this.a != -1.0f) {
                aqy aqyVarB6 = aquVar.b(this.d);
                aqy aqyVarB7 = aquVar.b(objK2);
                float f = this.a;
                aqt aqtVarA = aquVar.a();
                aqtVarA.e.g(aqyVarB6, -1.0f);
                aqtVarA.e.g(aqyVarB7, f);
                aquVar.e(aqtVarA);
            }
        }
    }

    public final void c(int i) {
        arc arcVar;
        if (this.ar != i) {
            this.ar = i;
            ArrayList arrayList = this.S;
            arrayList.clear();
            if (this.ar == 1) {
                arcVar = this.J;
                this.d = arcVar;
            } else {
                arcVar = this.K;
                this.d = arcVar;
            }
            arrayList.add(arcVar);
            arc[] arcVarArr = this.R;
            int length = arcVarArr.length;
            for (int i2 = 0; i2 < 6; i2++) {
                arcVarArr[i2] = this.d;
            }
        }
    }

    @Override // defpackage.ard
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ard
    public final boolean e() {
        return this.as;
    }

    @Override // defpackage.ard
    public final boolean f() {
        return this.as;
    }
}
