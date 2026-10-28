package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agxh extends agxi implements Serializable {
    private static final long serialVersionUID = 0;
    public final long a;

    public agxh(long j) {
        this.a = j;
    }

    @Override // defpackage.agxi
    public final int a() {
        return (int) this.a;
    }

    @Override // defpackage.agxi
    public final int b() {
        return 64;
    }

    @Override // defpackage.agxi
    public final long c() {
        return this.a;
    }

    @Override // defpackage.agxi
    public final boolean d(agxi agxiVar) {
        return this.a == agxiVar.c();
    }

    @Override // defpackage.agxi
    public final byte[] e() {
        long j = this.a;
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }
}
