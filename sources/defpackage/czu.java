package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class czu implements czr {
    private final bwb a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public czu(bwx bwxVar) {
        bwb bwbVar = bwxVar.a;
        this.a = bwbVar;
        bwbVar.P(12);
        this.c = bwbVar.q() & 255;
        this.b = bwbVar.q();
    }

    @Override // defpackage.czr
    public final int a() {
        return -1;
    }

    @Override // defpackage.czr
    public final int b() {
        return this.b;
    }

    @Override // defpackage.czr
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.n();
        }
        if (i == 16) {
            return this.a.s();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iN = this.a.n();
        this.e = iN;
        return (iN & 240) >> 4;
    }
}
