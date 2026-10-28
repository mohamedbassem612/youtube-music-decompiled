package j$.io;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class DesugarInputStream {
    public static long transferTo(InputStream inputStream, OutputStream outputStream) throws IOException {
        Objects.a(outputStream, "out");
        byte[] bArr = new byte[SemanticState.Multiline];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, SemanticState.Multiline);
            if (i < 0) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }
}
