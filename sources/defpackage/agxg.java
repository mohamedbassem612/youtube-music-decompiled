package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agxg extends agxi implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;

    public agxg(int i) {
        this.a = i;
    }

    @Override // defpackage.agxi
    public final int a() {
        return this.a;
    }

    @Override // defpackage.agxi
    public final int b() {
        return 32;
    }

    @Override // defpackage.agxi
    public final long c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.agxi
    public final boolean d(agxi agxiVar) {
        return this.a == agxiVar.a();
    }

    @Override // defpackage.agxi
    public final byte[] e() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
