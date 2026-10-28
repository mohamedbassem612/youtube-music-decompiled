package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiif {
    public static final byte[] a;
    public static final ByteBuffer b;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        b = ByteBuffer.wrap(bArr);
        aigm.M(bArr);
    }

    public static int a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
