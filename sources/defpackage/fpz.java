package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fpz extends fkx {

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float a;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean b;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float c;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float d;

    @fmt(a = 3)
    @fmu(a = fmv.g)
    public int e;

    @fmt(a = 0)
    @fmu(a = fmv.h)
    public float f;

    @fmt(a = 3)
    @fmu(a = fmv.g)
    public int g;

    public fpz() {
        super("CardShadow");
        this.c = -1.0f;
        this.d = -1.0f;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new fqa();
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        fqa fqaVar = (fqa) obj;
        int i = this.g;
        int i2 = this.e;
        float f = this.a;
        float f2 = this.f;
        float f3 = this.c;
        float f4 = this.d;
        boolean z = this.b;
        if (fqaVar.a != i) {
            fqaVar.a = i;
            fqaVar.j = true;
            fqaVar.invalidateSelf();
        }
        if (fqaVar.b != i2) {
            fqaVar.b = i2;
            fqaVar.j = true;
            fqaVar.invalidateSelf();
        }
        float f5 = (int) (f + 0.5f);
        if (fqaVar.c != f5) {
            fqaVar.c = f5;
            fqaVar.j = true;
            fqaVar.invalidateSelf();
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float fE = fqa.e(f2);
        if (fqaVar.d != fE) {
            fqaVar.d = fE;
            fqaVar.j = true;
            fqaVar.invalidateSelf();
        }
        fqaVar.e = -1.0f;
        fqaVar.f = -1.0f;
        if (f3 != fqaVar.g) {
            fqaVar.g = f3;
            fqaVar.j = true;
            fqaVar.invalidateSelf();
        }
        if (f4 != fqaVar.h) {
            fqaVar.h = f4;
            fqaVar.j = true;
            fqaVar.invalidateSelf();
        }
        if (fqaVar.i != z) {
            fqaVar.i = z;
            fqaVar.j = true;
            fqaVar.invalidateSelf();
        }
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 2;
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            fpz fpzVar = (fpz) fgyVar;
            if (Float.compare(this.a, fpzVar.a) == 0 && this.b == fpzVar.b && Float.compare(this.c, fpzVar.c) == 0 && Float.compare(this.d, fpzVar.d) == 0 && this.e == fpzVar.e && Float.compare(this.f, fpzVar.f) == 0 && this.g == fpzVar.g) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }
}
