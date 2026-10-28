package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
class lzq extends lzp {
    @Override // defpackage.lzp
    public final int a(String str, byte[] bArr, int i, int i2) {
        return a.T(str, bArr, i, i2);
    }

    @Override // defpackage.lzp
    public final String b(byte[] bArr, int i, int i2) throws lyh {
        String str = new String(bArr, i, i2, StandardCharsets.UTF_8);
        if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(StandardCharsets.UTF_8), Arrays.copyOfRange(bArr, i, i2 + i))) {
            return str;
        }
        throw new lyh("Protocol message had invalid UTF-8.");
    }
}
