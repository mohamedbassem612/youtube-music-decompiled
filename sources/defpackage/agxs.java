package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agxs extends agwy {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public agxs(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void l() {
        ahno.P(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.agwy
    protected final void b(ByteBuffer byteBuffer) {
        l();
        this.a.update(byteBuffer);
    }

    @Override // defpackage.agwy
    protected final void e(byte[] bArr, int i) {
        l();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.agxk
    public final agxi o() {
        l();
        this.c = true;
        int i = this.b;
        MessageDigest messageDigest = this.a;
        if (i == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = agxi.b;
            return new agxf(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = agxi.b;
        return new agxf(bArrCopyOf);
    }
}
