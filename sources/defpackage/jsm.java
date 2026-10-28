package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsm implements byc {
    private final jsk a;
    private final int b;
    private byi c;
    private long d;
    private File e;
    private OutputStream f;
    private FileOutputStream g;
    private long h;
    private long i;
    private jta j;
    private final boolean k;
    private ypq l;

    public jsm(jsk jskVar, int i, zjr zjrVar) {
        jskVar.getClass();
        this.a = jskVar;
        this.b = i;
        this.k = zjrVar.eI();
    }

    private final void d() {
        OutputStream outputStream = this.f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.g.getFD().sync();
                OutputStream outputStream2 = this.f;
                int i = bwp.a;
                afxw.h(outputStream2);
                this.f = null;
                File file = this.e;
                this.e = null;
                this.a.j(file, this.h, this.l);
            } catch (Throwable th) {
                OutputStream outputStream3 = this.f;
                int i2 = bwp.a;
                afxw.h(outputStream3);
                this.f = null;
                File file2 = this.e;
                this.e = null;
                file2.delete();
                throw th;
            }
        }
    }

    private final void e() throws jsi {
        FileOutputStream fileOutputStream;
        long j = this.c.i;
        long jMin = j != -1 ? Math.min(j - this.i, this.d) : -1L;
        jsk jskVar = this.a;
        byi byiVar = this.c;
        File fileF = jskVar.f(byiVar.j, byiVar.g + this.i, jMin, this.l);
        this.e = fileF;
        if (!this.k) {
            fileOutputStream = new FileOutputStream(this.e);
            this.g = fileOutputStream;
        } else {
            if (fileF == null) {
                this.f = null;
                this.c = null;
                return;
            }
            File parentFile = fileF.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                throw new jsi("c.createDirsFailed;dir.".concat(String.valueOf(parentFile.getName())));
            }
            fileOutputStream = new FileOutputStream(this.e, true);
            this.g = fileOutputStream;
        }
        int i = this.b;
        if (i > 0) {
            jta jtaVar = this.j;
            if (jtaVar == null) {
                this.j = new jta(this.g, i);
            } else {
                jtaVar.a(fileOutputStream);
            }
            this.f = this.j;
        } else {
            this.f = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // defpackage.byc
    public final void a() throws jsl {
        if (this.c != null) {
            try {
                d();
            } catch (IOException e) {
                throw new jsl(e);
            }
        }
    }

    @Override // defpackage.byc
    public final void b(byi byiVar) throws jsl {
        if (byiVar.i == -1 && byiVar.f(2)) {
            this.c = null;
            return;
        }
        this.c = byiVar;
        this.d = true != byiVar.f(4) ? Long.MAX_VALUE : 5242880L;
        this.i = 0L;
        Object obj = byiVar.l;
        if (obj instanceof ypq) {
            this.l = (ypq) obj;
        }
        try {
            e();
        } catch (IOException e) {
            throw new jsl(e);
        }
    }

    @Override // defpackage.byc
    public final void c(byte[] bArr, int i, int i2) throws jsl {
        if (this.c != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.h == this.d) {
                        d();
                        e();
                    }
                    if (this.k && this.f == null) {
                        return;
                    }
                    int iMin = (int) Math.min(i2 - i3, this.d - this.h);
                    this.f.write(bArr, i + i3, iMin);
                    i3 += iMin;
                    long j = iMin;
                    this.h += j;
                    this.i += j;
                } catch (IOException e) {
                    throw new jsl(e);
                }
            }
        }
    }
}
