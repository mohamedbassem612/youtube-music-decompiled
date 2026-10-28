package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lwz implements lww {
    private final /* synthetic */ int $cid;

    public lwz(int i) {
        this.$cid = i;
    }

    @Override // defpackage.lww
    public final byte[] a(byte[] bArr, int i, int i2) {
        if (this.$cid != 0) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
