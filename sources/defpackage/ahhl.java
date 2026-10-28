package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhl {
    public static final ahnf a = ahnf.b(new byte[0]);
    public final long[] b;
    public final List[] c;
    public final List d;

    public ahhl(long[] jArr, List[] listArr, List list) {
        this.b = jArr;
        this.c = listArr;
        this.d = list;
    }

    public static long a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 32) | ((((long) bArr[1]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[3]) & 255) << 8) | (((long) bArr[4]) & 255);
    }
}
