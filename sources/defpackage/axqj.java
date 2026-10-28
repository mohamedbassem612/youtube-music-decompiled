package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axqj {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        ByteBuffer.wrap(bArr);
        int i = axps.e;
        try {
            new axpq(bArr, 0).e(0);
        } catch (axqm e) {
            throw new IllegalArgumentException(e);
        }
    }

    static void a(Object obj) {
        obj.getClass();
    }
}
