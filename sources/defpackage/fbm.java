package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fbm implements etw {
    private final /* synthetic */ int $cid;
    private final ByteBuffer a = ByteBuffer.allocate(4);

    public fbm(int i, byte[] bArr) {
        this.$cid = i;
    }

    @Override // defpackage.etw
    public final /* synthetic */ void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        if (this.$cid != 0) {
            Long l = (Long) obj;
            messageDigest.update(bArr);
            ByteBuffer byteBuffer = this.a;
            synchronized (byteBuffer) {
                byteBuffer.position(0);
                messageDigest.update(byteBuffer.putLong(l.longValue()).array());
            }
            return;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            ByteBuffer byteBuffer2 = this.a;
            synchronized (byteBuffer2) {
                byteBuffer2.position(0);
                messageDigest.update(byteBuffer2.putInt(num.intValue()).array());
            }
        }
    }

    public fbm(int i) {
        this.$cid = i;
    }
}
