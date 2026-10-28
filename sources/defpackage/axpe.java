package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axpe extends FilterInputStream implements InputStreamRetargetInterface {
    private final /* synthetic */ int $cid;
    private int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpe(InputStream inputStream, int i, int i2, byte[] bArr) {
        super(inputStream);
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.$cid != 0 ? Math.min(super.available(), this.a) : Math.min(super.available(), this.a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.$cid;
        int i4 = this.a;
        int i5 = -1;
        if (i3 != 0) {
            if (i4 > 0 && (i5 = super.read(bArr, i, Math.min(i2, i4))) >= 0) {
                this.a -= i5;
            }
        } else if (i4 > 0 && (i5 = super.read(bArr, i, Math.min(i2, i4))) >= 0) {
            this.a -= i5;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int iSkip;
        int i = this.$cid;
        int i2 = this.a;
        if (i != 0) {
            iSkip = (int) super.skip(Math.min(j, i2));
            if (iSkip >= 0) {
                this.a -= iSkip;
            }
        } else {
            iSkip = (int) super.skip(Math.min(j, i2));
            if (iSkip >= 0) {
                this.a -= iSkip;
            }
        }
        return iSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return this.$cid != 0 ? DesugarInputStream.transferTo(this, outputStream) : DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axpe(InputStream inputStream, int i, int i2) {
        super(inputStream);
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2 = this.$cid;
        int i3 = this.a;
        if (i2 != 0) {
            if (i3 <= 0) {
                return -1;
            }
            i = super.read();
            if (i >= 0) {
                this.a--;
            }
        } else {
            if (i3 <= 0) {
                return -1;
            }
            i = super.read();
            if (i >= 0) {
                this.a--;
            }
        }
        return i;
    }
}
