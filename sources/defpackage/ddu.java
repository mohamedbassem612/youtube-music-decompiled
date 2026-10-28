package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ddu {
    public static final byte[] a = {0, 0, 1};
    public boolean b;
    public int c;
    public int d;
    public int e;
    public byte[] f = new byte[SemanticState.Focused];

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.f;
            int length = bArrCopyOf.length;
            int i4 = this.d + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 << 1);
                this.f = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.d, i3);
            this.d += i3;
        }
    }

    public final void b() {
        this.b = false;
        this.d = 0;
        this.c = 0;
    }
}
