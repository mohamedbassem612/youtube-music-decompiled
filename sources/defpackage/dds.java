package defpackage;

import app.rive.semantics.SemanticState;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dds {
    public static final byte[] a = {0, 0, 1};
    public boolean b;
    public int c;
    public int d;
    public byte[] e = new byte[SemanticState.Focused];

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.e;
            int length = bArrCopyOf.length;
            int i4 = this.c + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 << 1);
                this.e = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.c, i3);
            this.c += i3;
        }
    }
}
