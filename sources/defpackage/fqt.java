package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fqt implements fri {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    private int f;

    public fqt(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.fri
    public final int a() {
        return this.e;
    }

    @Override // defpackage.fri
    public final void b(ftg ftgVar, int i, int i2) {
        if (this.f == 0) {
            int i3 = this.e;
            if (this.c == 1) {
                i = i2;
            }
            this.e = i3 + i;
        }
        if (ftgVar.j()) {
            this.f = 0;
            return;
        }
        int iA = this.f + ftgVar.a();
        this.f = iA;
        if (iA == this.d) {
            this.f = 0;
        }
    }

    @Override // defpackage.fri
    public final boolean c() {
        return this.e < (this.c == 1 ? this.b : this.a);
    }
}
