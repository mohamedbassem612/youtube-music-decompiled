package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzn implements byc {
    private final bzk a;
    private byi b;
    private long c;
    private File d;
    private OutputStream e;
    private long f;
    private long g;
    private bzz h;

    public bzn(bzk bzkVar) {
        this.a = bzkVar;
    }

    private final void d() {
        OutputStream outputStream = this.e;
        if (outputStream != null) {
            try {
                outputStream.flush();
                OutputStream outputStream2 = this.e;
                int i = bwp.a;
                afxw.h(outputStream2);
                this.e = null;
                File file = this.d;
                this.d = null;
                this.a.d(file, this.f);
            } catch (Throwable th) {
                OutputStream outputStream3 = this.e;
                int i2 = bwp.a;
                afxw.h(outputStream3);
                this.e = null;
                File file2 = this.d;
                this.d = null;
                file2.delete();
                throw th;
            }
        }
    }

    private final void e(byi byiVar) {
        long j = byiVar.i;
        long jMin = j != -1 ? Math.min(j - this.g, this.c) : -1L;
        bzk bzkVar = this.a;
        String str = byiVar.j;
        int i = bwp.a;
        this.d = bzkVar.c(str, byiVar.h + this.g, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.d);
        bzz bzzVar = this.h;
        if (bzzVar == null) {
            this.h = new bzz(fileOutputStream);
        } else {
            bzzVar.a(fileOutputStream);
        }
        this.e = this.h;
        this.f = 0L;
    }

    @Override // defpackage.byc
    public final void a() throws bzl {
        if (this.b != null) {
            try {
                d();
            } catch (IOException e) {
                throw new bzl(e);
            }
        }
    }

    @Override // defpackage.byc
    public final void b(byi byiVar) throws bzl {
        byiVar.j.getClass();
        if (byiVar.i == -1 && byiVar.f(2)) {
            this.b = null;
            return;
        }
        this.b = byiVar;
        this.c = true != byiVar.f(4) ? Long.MAX_VALUE : 5242880L;
        this.g = 0L;
        try {
            e(byiVar);
        } catch (IOException e) {
            throw new bzl(e);
        }
    }

    @Override // defpackage.byc
    public final void c(byte[] bArr, int i, int i2) throws bzl {
        byi byiVar = this.b;
        if (byiVar != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f == this.c) {
                        d();
                        e(byiVar);
                    }
                    int iMin = (int) Math.min(i2 - i3, this.c - this.f);
                    OutputStream outputStream = this.e;
                    int i4 = bwp.a;
                    outputStream.write(bArr, i + i3, iMin);
                    i3 += iMin;
                    long j = iMin;
                    this.f += j;
                    this.g += j;
                } catch (IOException e) {
                    throw new bzl(e);
                }
            }
        }
    }
}
