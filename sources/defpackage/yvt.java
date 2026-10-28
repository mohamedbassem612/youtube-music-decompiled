package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yvt {
    public final long a;
    public final int b;

    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    public yvt(int i, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ahno.F(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        this.b = i;
        this.a = j;
    }

    public static yvt a(long j, long j2, int i) {
        return new yvt(Math.max(0L, j - j2), i);
    }

    public static yvt b(cvj cvjVar, bwb bwbVar) {
        ((cvb) cvjVar).n(bwbVar.b, 0, 8, false);
        bwbVar.P(0);
        return new yvt(bwbVar.i(), bwbVar.u());
    }

    public final boolean c() {
        int i = this.b;
        return i == 0 || i == 1;
    }

    public yvt(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public yvt(long j, int i, short[] sArr) {
        this.b = i;
        this.a = j;
    }

    public yvt(int i, long j) {
        this.b = i;
        this.a = j;
    }
}
