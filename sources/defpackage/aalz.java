package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aalz implements aeox {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aalz(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aeox
    public final Object a(byte[] bArr) {
        int i = this.$cid;
        if (i == 0) {
            return bArr;
        }
        if (i != 1) {
            return aejd.a(bArr);
        }
        if (bArr.length == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        while (byteBufferWrap.position() < bArr.length) {
            int i2 = byteBufferWrap.getInt();
            String str = new String(bArr, byteBufferWrap.position(), i2, StandardCharsets.UTF_8);
            byteBufferWrap.position(byteBufferWrap.position() + i2);
            hashSet.add(str);
        }
        return hashSet;
    }
}
