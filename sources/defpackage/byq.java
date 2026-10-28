package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class byq extends bxw {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public byq() {
        super(false);
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws byp {
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
            throw new byp(e, 2000);
        }
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws byp {
        Uri uri = byiVar.a;
        this.b = uri;
        i(byiVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                long j = byiVar.h;
                randomAccessFile.seek(j);
                long length = byiVar.i;
                if (length == -1) {
                    length = this.a.length() - j;
                }
                this.c = length;
                if (length < 0) {
                    throw new byp(null, null, 2008);
                }
                this.d = true;
                j(byiVar);
                return this.c;
            } catch (IOException e) {
                throw new byp(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new byp(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new byp(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new byp(e3, 2006);
        } catch (RuntimeException e4) {
            throw new byp(e4, 2000);
        }
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.b;
    }

    @Override // defpackage.bye
    public final void f() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.a = null;
                if (this.d) {
                    this.d = false;
                    h();
                }
            } catch (IOException e) {
                throw new byp(e, 2000);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                h();
            }
            throw th;
        }
    }
}
