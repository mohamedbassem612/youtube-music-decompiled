package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpb implements fpn {
    static final fpg a = new fpf().a();
    static final fpa b = new fpc();
    public int c = 1;
    public int d = Integer.MIN_VALUE;
    private fpg f = a;
    public fpa e = b;

    @Override // defpackage.fpn
    public final /* bridge */ /* synthetic */ fpo a() {
        fpd fpdVar = new fpd(this.c, this.d, this.f, this.e);
        fpdVar.c = Alert.DURATION_SHOW_INDEFINITELY;
        fpdVar.d = 1;
        int i = fpdVar.b;
        if (fpdVar.a != 1 || i == Integer.MIN_VALUE || i == -1) {
            return fpdVar;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    @Override // defpackage.fpn
    public final /* synthetic */ void b(fpg fpgVar) {
        this.f = fpgVar;
    }
}
