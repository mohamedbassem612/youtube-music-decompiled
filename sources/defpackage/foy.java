package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foy implements fpn {
    static final fpg a = new fpf().a();
    static final fhz f = new fhz();
    public static final /* synthetic */ int g = 0;
    public int b = 1;
    public int c = 2;
    private fpg h = a;
    private final fhz i = f;
    public int d = 1;
    public int e = Integer.MIN_VALUE;

    @Override // defpackage.fpn
    public final /* bridge */ /* synthetic */ fpo a() {
        foz fozVar = new foz(this.b, this.c, this.h, this.i, this.e);
        fozVar.c = Alert.DURATION_SHOW_INDEFINITELY;
        fozVar.d = this.d;
        int i = fozVar.b;
        if (fozVar.a != 1 || i == Integer.MIN_VALUE || i == -1) {
            return fozVar;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    @Override // defpackage.fpn
    public final /* synthetic */ void b(fpg fpgVar) {
        this.h = fpgVar;
    }
}
