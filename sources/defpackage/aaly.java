package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aaly implements aeow {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aaly(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aeow
    public final byte[] a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return (byte[]) obj;
        }
        if (i != 1) {
            return ((aprb) obj).toByteArray();
        }
        Set set = (Set) obj;
        int size = set.size();
        byte[][] bArr = new byte[size][];
        Iterator it = set.iterator();
        int length = 0;
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            bArr[i2] = bytes;
            length += bytes.length + 4;
            i2++;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        for (int i3 = 0; i3 < size; i3++) {
            byte[] bArr2 = bArr[i3];
            bArr2.getClass();
            byteBufferAllocate.putInt(bArr2.length);
            byteBufferAllocate.put(bArr2);
        }
        return byteBufferAllocate.array();
    }
}
