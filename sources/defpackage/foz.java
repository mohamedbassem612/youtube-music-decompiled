package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foz implements fpo {
    public final int a;
    public final int b;
    public int c = Alert.DURATION_SHOW_INDEFINITELY;
    public int d = 1;
    private final int e;
    private final fpg f;

    @Deprecated
    public foz(int i, int i2, fpg fpgVar, fhz fhzVar, int i3) {
        this.a = i;
        this.e = i2;
        this.f = fpgVar == null ? foy.a : fpgVar;
        if (fhzVar == null) {
            int i4 = foy.g;
        }
        this.b = i3;
    }

    @Override // defpackage.fpo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.fpo
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fpo
    public final oq c() {
        return gzj.aK(this.b, this.c, this.d);
    }

    @Override // defpackage.fpo
    public final fpg d() {
        return this.f;
    }

    @Override // defpackage.fpo
    public final frj e(fhd fhdVar) {
        return new fqu(fhdVar.a, this.e, this.a);
    }
}
