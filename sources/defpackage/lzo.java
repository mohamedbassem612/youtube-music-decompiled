package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lzo extends lzp {
    @Override // defpackage.lzp
    public final int a(String str, byte[] bArr, int i, int i2) {
        return a.bx(str, bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[PHI: r3
      0x00a3: PHI (r3v7 byte) = (r3v6 byte), (r3v12 byte) binds: [B:40:0x009e, B:42:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00bb A[SYNTHETIC] */
    @Override // defpackage.lzp
    public final String b(byte[] bArr, int i, int i2) throws lyh {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!mdu.o(b)) {
                break;
            }
            i++;
            mdu.n(b, cArr, i5);
            i5++;
        }
        while (i < i4) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (mdu.o(b2)) {
                mdu.n(b2, cArr, i5);
                i5++;
                i = i6;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (!mdu.o(b3)) {
                        break;
                    }
                    i++;
                    mdu.n(b3, cArr, i5);
                    i5++;
                }
            } else {
                if (a.W(b2)) {
                    if (i6 >= i4) {
                        throw new lyh("Protocol message had invalid UTF-8.");
                    }
                    i3 = i5 + 1;
                    i += 2;
                    byte b4 = bArr[i6];
                    if (b2 < -62 || a.U(b4)) {
                        throw new lyh("Protocol message had invalid UTF-8.");
                    }
                    cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                } else {
                    if (a.V(b2)) {
                        if (i6 >= i4 - 1) {
                            throw new lyh("Protocol message had invalid UTF-8.");
                        }
                        i3 = i5 + 1;
                        int i7 = i + 2;
                        byte b5 = bArr[i6];
                        i += 3;
                        byte b6 = bArr[i7];
                        if (!a.U(b5)) {
                            if (b2 != -32) {
                                if (b2 != -19) {
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                } else if (b5 < -96) {
                                    b2 = -19;
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                }
                            } else if (b5 >= -96) {
                                b2 = -32;
                                if (b2 != -19) {
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                } else if (b5 < -96) {
                                    b2 = -19;
                                    if (!a.U(b6)) {
                                        cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    }
                                }
                            }
                        }
                        throw new lyh("Protocol message had invalid UTF-8.");
                    }
                    if (i6 >= i4 - 2) {
                        throw new lyh("Protocol message had invalid UTF-8.");
                    }
                    byte b7 = bArr[i6];
                    int i8 = i + 3;
                    byte b8 = bArr[i + 2];
                    i += 4;
                    byte b9 = bArr[i8];
                    if (a.U(b7) || (((b2 << 28) + (b7 + 112)) >> 30) != 0 || a.U(b8) || a.U(b9)) {
                        throw new lyh("Protocol message had invalid UTF-8.");
                    }
                    int i9 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                    cArr[i5] = (char) ((i9 >>> 10) + 55232);
                    cArr[i5 + 1] = (char) ((i9 & 1023) + 56320);
                    i5 += 2;
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }
}
