package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bxv extends bxw {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public bxv(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws bxu {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new bxu(e, 2000);
                }
            }
            InputStream inputStream = this.c;
            int i3 = bwp.a;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.d;
                if (j2 != -1) {
                    this.d = j2 - ((long) i4);
                }
                g(i4);
                return i4;
            }
        }
        return -1;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws bxu {
        try {
            Uri uri = byiVar.a;
            this.b = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            i(byiVar);
            InputStream inputStreamOpen = this.a.open(path, 1);
            this.c = inputStreamOpen;
            long j = byiVar.h;
            if (inputStreamOpen.skip(j) < j) {
                throw new bxu(null, 2008);
            }
            long j2 = byiVar.i;
            if (j2 != -1) {
                this.d = j2;
            } else {
                long jAvailable = this.c.available();
                this.d = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.d = -1L;
                }
            }
            this.e = true;
            j(byiVar);
            return this.d;
        } catch (bxu e) {
            throw e;
        } catch (IOException e2) {
            throw new bxu(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
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
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                if (this.e) {
                    this.e = false;
                    h();
                }
            } catch (IOException e) {
                throw new bxu(e, 2000);
            }
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                h();
            }
            throw th;
        }
    }
}
