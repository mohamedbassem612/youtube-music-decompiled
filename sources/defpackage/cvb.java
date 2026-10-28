package defpackage;

import app.rive.semantics.SemanticState;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvb implements cvj {
    public final long a;
    public long b;
    public int d;
    public int e;
    private final brv g;
    public byte[] c = new byte[65536];
    private final byte[] f = new byte[SemanticState.Obscured];

    static {
        bst.b("media3.extractor");
    }

    public cvb(brv brvVar, long j, long j2) {
        this.g = brvVar;
        this.b = j;
        this.a = j2;
    }

    private final int q(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.c, 0, bArr, i, iMin);
        t(iMin);
        return iMin;
    }

    private final int r(int i) {
        int iMin = Math.min(this.e, i);
        t(iMin);
        return iMin;
    }

    private final void s(int i) {
        if (i != -1) {
            this.b += (long) i;
        }
    }

    private final void t(int i) {
        int i2 = this.e - i;
        this.e = i2;
        this.d = 0;
        byte[] bArr = this.c;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.c = bArr2;
    }

    @Override // defpackage.cvj, defpackage.brv
    public final int a(byte[] bArr, int i, int i2) {
        cvb cvbVar;
        int iQ = q(bArr, i, i2);
        if (iQ == 0) {
            int iB = b(bArr, i, i2, 0, true);
            cvbVar = this;
            iQ = iB;
        } else {
            cvbVar = this;
        }
        cvbVar.s(iQ);
        return iQ;
    }

    public final int b(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iA = this.g.a(bArr, i + i3, i2 - i3);
        if (iA != -1) {
            return i3 + iA;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.cvj
    public final int c(int i) {
        cvb cvbVar;
        int iR = r(i);
        if (iR == 0) {
            int iB = b(this.f, 0, Math.min(i, SemanticState.Obscured), 0, true);
            cvbVar = this;
            iR = iB;
        } else {
            cvbVar = this;
        }
        cvbVar.s(iR);
        return iR;
    }

    @Override // defpackage.cvj
    public final long d() {
        return this.a;
    }

    @Override // defpackage.cvj
    public final long e() {
        return this.b + ((long) this.d);
    }

    @Override // defpackage.cvj
    public final long f() {
        return this.b;
    }

    @Override // defpackage.cvj
    public final void g(int i) {
        m(i, false);
    }

    public final void h(int i) {
        int i2 = this.d + i;
        int length = this.c.length;
        if (i2 > length) {
            this.c = Arrays.copyOf(this.c, bwp.c(length << 1, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.cvj
    public final void i(byte[] bArr, int i, int i2) {
        n(bArr, i, i2, false);
    }

    @Override // defpackage.cvj
    public final void j(byte[] bArr, int i, int i2) {
        o(bArr, i, i2, false);
    }

    @Override // defpackage.cvj
    public final void k() {
        this.d = 0;
    }

    @Override // defpackage.cvj
    public final void l(int i) {
        p(i, false);
    }

    @Override // defpackage.cvj
    public final boolean m(int i, boolean z) {
        h(i);
        int iB = this.e - this.d;
        while (iB < i) {
            cvb cvbVar = this;
            int i2 = i;
            boolean z2 = z;
            iB = cvbVar.b(this.c, this.d, i2, iB, z2);
            if (iB == -1) {
                return false;
            }
            cvbVar.e = cvbVar.d + iB;
            this = cvbVar;
            i = i2;
            z = z2;
        }
        this.d += i;
        return true;
    }

    @Override // defpackage.cvj
    public final boolean n(byte[] bArr, int i, int i2, boolean z) {
        if (!m(i2, z)) {
            return false;
        }
        System.arraycopy(this.c, this.d - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.cvj
    public final boolean o(byte[] bArr, int i, int i2, boolean z) {
        int iQ = q(bArr, i, i2);
        while (iQ < i2 && iQ != -1) {
            iQ = b(bArr, i, i2, iQ, z);
        }
        s(iQ);
        return iQ != -1;
    }

    @Override // defpackage.cvj
    public final void p(int i, boolean z) {
        int iR = r(i);
        while (iR < i && iR != -1) {
            iR = b(this.f, -iR, Math.min(i, iR + SemanticState.Obscured), iR, z);
        }
        s(iR);
    }
}
