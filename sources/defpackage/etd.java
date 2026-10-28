package defpackage;

import app.rive.semantics.SemanticState;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class etd {
    public ByteBuffer b;
    public etc c;
    public final byte[] a = new byte[SemanticState.Hidden];
    public int d = 0;

    public final int a() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final int b() {
        return this.b.getShort();
    }

    public final void c() {
        int iA = a();
        this.d = iA;
        if (iA <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                this.c.b = 1;
                return;
            }
        }
    }

    public final void d() {
        int iA;
        do {
            iA = a();
            this.b.position(Math.min(this.b.position() + iA, this.b.limit()));
        } while (iA > 0);
    }

    public final boolean e() {
        return this.c.b != 0;
    }

    public final int[] f(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            this.b.get(bArr);
            iArr = new int[SemanticState.Hidden];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i3 + 2;
                    i3 += 3;
                    int i6 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i2 = i6;
                } catch (BufferUnderflowException unused) {
                    this.c.b = 1;
                    return iArr;
                }
            }
            return iArr;
        } catch (BufferUnderflowException unused2) {
            iArr = null;
        }
    }
}
