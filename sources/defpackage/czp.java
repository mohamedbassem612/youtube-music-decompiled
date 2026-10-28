package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czp {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final bwb f;
    private final bwb g;
    private int h;
    private int i;

    public czp(bwb bwbVar, bwb bwbVar2, boolean z) throws bsz {
        this.g = bwbVar;
        this.f = bwbVar2;
        this.e = z;
        bwbVar2.P(12);
        this.a = bwbVar2.q();
        bwbVar.P(12);
        this.i = bwbVar.q();
        azz.g(bwbVar.i() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        bwb bwbVar = this.f;
        this.d = z ? bwbVar.x() : bwbVar.w();
        if (this.b != this.h) {
            return true;
        }
        bwb bwbVar2 = this.g;
        this.c = bwbVar2.q();
        bwbVar2.Q(4);
        int i2 = this.i - 1;
        this.i = i2;
        this.h = i2 > 0 ? (-1) + bwbVar2.q() : -1;
        return true;
    }
}
