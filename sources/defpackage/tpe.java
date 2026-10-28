package defpackage;

import j$.io.ByteArrayInputStreamRetargetInterface;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tpe extends ByteArrayInputStream implements ByteArrayInputStreamRetargetInterface, InputStreamRetargetInterface, tpf {
    public tpe(byte[] bArr, int i) {
        super(bArr, 0, i);
    }

    @Override // defpackage.tpf
    public final int a(ByteBuffer byteBuffer, int i) {
        if (this.pos >= this.count) {
            return -1;
        }
        int iMin = Math.min(this.count - this.pos, i);
        if (iMin == 0) {
            return 0;
        }
        byteBuffer.put(this.buf, this.pos, iMin);
        this.pos += iMin;
        return iMin;
    }

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, j$.io.ByteArrayInputStreamRetargetInterface, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
