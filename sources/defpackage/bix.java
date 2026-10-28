package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bix {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        ByteBuffer.wrap(bArr);
        int i = bic.e;
        try {
            new bia(bArr, 0).e(0);
        } catch (bja e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void a(Object obj) {
        obj.getClass();
    }
}
