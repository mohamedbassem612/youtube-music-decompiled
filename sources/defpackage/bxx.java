package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class bxx implements byc {
    public ByteArrayOutputStream a;

    @Override // defpackage.byc
    public final void a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        int i = bwp.a;
        byteArrayOutputStream.close();
    }

    @Override // defpackage.byc
    public final void b(byi byiVar) {
        long j = byiVar.i;
        if (j == -1) {
            this.a = new ByteArrayOutputStream();
        } else {
            ahno.F(j <= 2147483647L);
            this.a = new ByteArrayOutputStream((int) j);
        }
    }

    @Override // defpackage.byc
    public final void c(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        int i3 = bwp.a;
        byteArrayOutputStream.write(bArr, i, i2);
    }
}
