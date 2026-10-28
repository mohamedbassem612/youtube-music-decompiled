package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mor implements fri {
    private final /* synthetic */ int $cid;
    private final int a;
    private final int b;
    private final int c;
    private int d;

    public mor(int i, int i2, int i3, int i4) {
        this.$cid = i4;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.fri
    public final int a() {
        return this.d;
    }

    @Override // defpackage.fri
    public final void b(ftg ftgVar, int i, int i2) {
        int i3 = this.$cid;
        int i4 = this.d;
        if (i3 == 0 ? 1 == this.c : this.c == 1) {
            i = i2;
        }
        this.d = i4 + i;
    }

    @Override // defpackage.fri
    public final boolean c() {
        int i = this.$cid;
        int i2 = this.c;
        if (i != 0) {
            if (this.d >= (i2 == 1 ? this.b : this.a)) {
                return false;
            }
        } else {
            if (this.d >= (i2 == 1 ? this.b : this.a)) {
                return false;
            }
        }
        return true;
    }
}
