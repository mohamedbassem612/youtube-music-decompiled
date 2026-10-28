package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpd implements fpo {
    public final int a;
    public final int b;
    public int c = Alert.DURATION_SHOW_INDEFINITELY;
    public int d = 1;
    private final fpg e;
    private final fpa f;

    @Deprecated
    public fpd(int i, int i2, fpg fpgVar, fpa fpaVar) {
        if (i == 1 && i2 != Integer.MIN_VALUE && i2 != -1) {
            throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
        }
        this.a = i;
        this.b = i2;
        this.e = fpgVar == null ? fpb.a : fpgVar;
        this.f = fpaVar == null ? fpb.b : fpaVar;
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
        return this.e;
    }

    @Override // defpackage.fpo
    public final frj e(fhd fhdVar) {
        return this.f.a(fhdVar.a, this.a);
    }
}
