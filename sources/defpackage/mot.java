package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mot implements fpn {
    static final fpg a = new fpf().a();
    public int b = 1;
    public int c = Integer.MIN_VALUE;
    private fpg i = a;
    public float d = 0.0f;
    public float e = 0.0f;
    public int f = -1;
    private final moo j = moo.a;
    public String g = null;
    public mlf h = null;

    @Override // defpackage.fpn
    public final /* bridge */ /* synthetic */ fpo a() {
        mou mouVar = new mou(this.b, this.c, this.e, this.d, this.f, this.g, this.h, this.i, this.j);
        mouVar.c = Alert.DURATION_SHOW_INDEFINITELY;
        mouVar.d = 1;
        int i = mouVar.b;
        if (mouVar.a != 1 || i == Integer.MIN_VALUE || i == -1) {
            return mouVar;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }

    @Override // defpackage.fpn
    public final /* synthetic */ void b(fpg fpgVar) {
        this.i = fpgVar;
    }
}
