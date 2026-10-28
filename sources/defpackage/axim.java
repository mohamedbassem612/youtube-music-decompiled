package defpackage;

import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axim extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ axin a;

    public axim(axin axinVar) {
        this.a = axinVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        axin axinVar = this.a;
        if (axinVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(axinVar.b.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        axin axinVar = this.a;
        if (axinVar.c) {
            throw new IOException("closed");
        }
        AndroidInfo.c(bArr.length, i, i2);
        axig axigVar = axinVar.b;
        if (axigVar.b == 0 && axinVar.a.e(axigVar, 8192L) == -1) {
            return -1;
        }
        return axigVar.c(bArr, i, i2);
    }

    public final String toString() {
        axin axinVar = this.a;
        Objects.toString(axinVar);
        return axinVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        axin axinVar = this.a;
        if (axinVar.c) {
            throw new IOException("closed");
        }
        long j = 0;
        while (true) {
            axig axigVar = axinVar.b;
            if (axigVar.b == 0 && axinVar.a.e(axigVar, 8192L) == -1) {
                return j;
            }
            long j2 = axigVar.b;
            j += j2;
            AndroidInfo.c(j2, 0L, j2);
            axio axioVar = axigVar.a;
            while (j2 > 0) {
                axioVar.getClass();
                int iMin = (int) Math.min(j2, axioVar.c - axioVar.b);
                outputStream.write(axioVar.a, axioVar.b, iMin);
                int i = axioVar.b + iMin;
                axioVar.b = i;
                long j3 = iMin;
                axigVar.b -= j3;
                j2 -= j3;
                if (i == axioVar.c) {
                    axio axioVarA = axioVar.a();
                    axigVar.a = axioVarA;
                    axip.b(axioVar);
                    axioVar = axioVarA;
                }
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        axin axinVar = this.a;
        if (axinVar.c) {
            throw new IOException("closed");
        }
        axig axigVar = axinVar.b;
        if (axigVar.b == 0 && axinVar.a.e(axigVar, 8192L) == -1) {
            return -1;
        }
        return axigVar.b() & 255;
    }
}
