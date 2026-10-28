package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kmb extends krd {
    public final byte[] a;

    public kmb(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.krd
    public final byte[] D() {
        return this.a;
    }
}
