package defpackage;

import androidx.car.app.model.Alert;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qkx extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ aigm a;

    public qkx(aigm aigmVar) {
        this.a = aigmVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws aiik {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        aigl aiglVar = (aigl) this.a;
        int i3 = aiglVar.c;
        int i4 = aiglVar.d;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = Math.min(i2, i5);
            System.arraycopy(aiglVar.b, aiglVar.d, bArr, i, iMin);
            aiglVar.d += iMin;
            return iMin;
        }
        int iMin2 = Math.min(aiglVar.f, aiglVar.j) - (aiglVar.e + i4);
        if (iMin2 <= 0) {
            return -1;
        }
        int iJ = aigl.j(aiglVar.a, bArr, i, Math.min(i2, iMin2));
        if (iJ != -1) {
            aiglVar.e += iJ;
        }
        return iJ;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        int i = j > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : (int) j;
        this.a.C(i);
        return i;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) != -1) {
            return bArr[0];
        }
        return -1;
    }
}
