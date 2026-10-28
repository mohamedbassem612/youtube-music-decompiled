package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsx extends bxw {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;
    private final String e;

    public jsx(String str) {
        super(false);
        this.e = str;
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws jsw {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = bwp.a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(this.c, i2));
            if (i4 > 0) {
                this.c -= (long) i4;
                g(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new jsw("c.file.read;src.".concat(this.e), e);
        }
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws jsw {
        try {
            Uri uri = byiVar.a;
            this.b = uri;
            i(byiVar);
            try {
                String path = uri.getPath();
                path.getClass();
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.a = randomAccessFile;
                long j = byiVar.h;
                randomAccessFile.seek(j);
                long length = byiVar.i;
                if (length == -1) {
                    length = this.a.length() - j;
                }
                this.c = length;
                if (length < 0) {
                    throw new byf(2008);
                }
                this.d = true;
                j(byiVar);
                return this.c;
            } catch (FileNotFoundException e) {
                throw new jsw("c.FileNotFound;src.".concat(this.e), e);
            }
        } catch (jsw e2) {
            throw e2;
        } catch (Exception e3) {
            throw new jsw("c.file.open;src.".concat(this.e), e3);
        }
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002e */
    @Override // defpackage.bye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r7 = this;
            java.lang.String r0 = "c.close;src."
            r1 = 0
            r7.b = r1
            r2 = 0
            java.io.RandomAccessFile r3 = r7.a     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L2e
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L2e
        Ld:
            r7.a = r1
            boolean r0 = r7.d
            if (r0 == 0) goto L18
            r7.d = r2
            r7.h()
        L18:
            return
        L19:
            r3 = move-exception
            jsw r4 = new jsw     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r7.e     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0 = move-exception
            r7.a = r1
            boolean r1 = r7.d
            if (r1 == 0) goto L3a
            r7.d = r2
            r7.h()
        L3a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsx.f():void");
    }
}
