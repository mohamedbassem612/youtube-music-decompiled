package defpackage;

import android.media.MediaMetadataRetriever;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxb extends MediaMetadataRetriever implements AutoCloseable {
    private FileInputStream a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        throw new java.lang.UnsupportedOperationException("HTTPS URIs are not supported");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.qwy r5, android.content.Context r6) {
        /*
            r4 = this;
            java.io.FileInputStream r0 = r4.a
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            defpackage.ahno.O(r0)
            qwp r5 = (defpackage.qwp) r5
            android.net.Uri r5 = r5.a
            java.lang.String r0 = r5.getScheme()
            j$.util.Optional r0 = j$.util.Optional.ofNullable(r0)
            java.lang.String r1 = "file"
            java.lang.Object r0 = r0.orElse(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r2 == r3) goto L4a
            r1 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r1) goto L3a
            r1 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 != r1) goto L66
            java.lang.String r1 = "https"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L66
        L3a:
            java.lang.String r1 = "http"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L66
        L42:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "HTTPS URIs are not supported"
            r4.<init>(r5)
            throw r4
        L4a:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L66
            java.io.FileInputStream r6 = new java.io.FileInputStream
            java.lang.String r5 = r5.getPath()
            r5.getClass()
            r6.<init>(r5)
            r4.a = r6
            java.io.FileDescriptor r5 = r6.getFD()
            r4.setDataSource(r5)
            goto L69
        L66:
            r4.setDataSource(r6, r5)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxb.a(qwy, android.content.Context):void");
    }

    @Override // android.media.MediaMetadataRetriever, java.lang.AutoCloseable
    public final void close() throws IOException {
        release();
        FileInputStream fileInputStream = this.a;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.a = null;
        }
    }
}
