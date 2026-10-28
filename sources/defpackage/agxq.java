package defpackage;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agxq implements agxo {
    public static final agxq a;
    public static final agxq b;
    private static final Unsafe c;
    private static final int d;
    private static final /* synthetic */ agxq[] e;

    static {
        Unsafe unsafeJ;
        agxq agxqVar = new agxq("UNSAFE_LITTLE_ENDIAN", 0);
        a = agxqVar;
        agxq agxqVar2 = new agxq("UNSAFE_BIG_ENDIAN", 1);
        b = agxqVar2;
        e = new agxq[]{agxqVar, agxqVar2};
        try {
            try {
                unsafeJ = Unsafe.getUnsafe();
            } catch (Exception e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2);
            }
        } catch (SecurityException unused) {
            try {
                unsafeJ = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new agxp());
            } catch (Exception unused2) {
                unsafeJ = a.j();
            }
        }
        c = unsafeJ;
        d = unsafeJ.arrayBaseOffset(byte[].class);
        if (unsafeJ.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }

    public static agxq[] values() {
        return (agxq[]) e.clone();
    }

    @Override // defpackage.agxo
    public final /* synthetic */ long a(byte[] bArr, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return c.getLong(bArr, ((long) i) + ((long) d));
        }
        if (iOrdinal == 1) {
            return Long.reverseBytes(c.getLong(bArr, ((long) i) + ((long) d)));
        }
        throw null;
    }
}
