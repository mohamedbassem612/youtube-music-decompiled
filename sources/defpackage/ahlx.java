package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahlx {
    public static final byte[] a = {42, -122, 72, -50, 61, 3, 1, 7};
    public static final byte[] b = {43, -127, 4, 0, 34};
    public static final byte[] c = {43, -127, 4, 0, 35};

    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = length + 2;
        byte[] bArr2 = new byte[i];
        bArr2[0] = 6;
        bArr2[1] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, 2, length);
        byte[] bArr3 = new byte[length + 4];
        bArr3[0] = -96;
        bArr3[1] = (byte) i;
        System.arraycopy(bArr2, 0, bArr3, 2, i);
        return bArr3;
    }
}
