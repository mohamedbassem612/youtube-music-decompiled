package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zsj extends zsi {
    @Override // defpackage.zsi
    protected final /* bridge */ /* synthetic */ Object f(tgn tgnVar) throws IOException {
        if (tgnVar == null) {
            return null;
        }
        InputStream inputStreamC = tgnVar.c();
        int iA = (int) tgnVar.a();
        byte[] bArr = new byte[iA < 0 ? 16384 : iA];
        int i = 0;
        while (true) {
            try {
                int length = bArr.length;
                int i2 = inputStreamC.read(bArr, i, length - i);
                if (i2 == -1) {
                    inputStreamC.close();
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    return bArr2;
                }
                i += i2;
                if (i == length) {
                    if (i == iA) {
                        inputStreamC.close();
                        return bArr;
                    }
                    byte[] bArr3 = new byte[length << 1];
                    System.arraycopy(bArr, 0, bArr3, 0, length);
                    bArr = bArr3;
                }
            } catch (Throwable th) {
                inputStreamC.close();
                throw th;
            }
        }
    }
}
