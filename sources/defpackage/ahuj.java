package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ahuj {
    public int a;
    public ByteBuffer b;
    private int c;
    private int d;

    public ahuj() {
        if (aewo.g == null) {
            aewo.g = new aewo(null);
        }
    }

    public static ahuj q(ByteBuffer byteBuffer) {
        ahuj ahujVar = new ahuj();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        ahujVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return ahujVar;
    }

    public static /* synthetic */ String r(ahuj ahujVar) {
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.e(iB + ahujVar.a);
        }
        return null;
    }

    public final int a(int i) {
        return i + this.b.getInt(i);
    }

    public final int b(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public final int c(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public final int d(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }

    public final String e(int i) {
        char[] cArr;
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBuffer = this.b;
        int i5 = i + byteBuffer.getInt(i);
        int i6 = byteBuffer.getInt(i5);
        int i7 = i5 + 4;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + i7;
            int length = bArrArray.length;
            if ((iArrayOffset | i6 | ((length - iArrayOffset) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iArrayOffset), Integer.valueOf(i6)));
            }
            int i8 = iArrayOffset + i6;
            cArr = new char[i6];
            int i9 = 0;
            while (iArrayOffset < i8) {
                byte b = bArrArray[iArrayOffset];
                if (!aewo.ak(b)) {
                    break;
                }
                iArrayOffset++;
                aewo.ah(b, cArr, i9);
                i9++;
            }
            i2 = i9;
            while (iArrayOffset < i8) {
                int i10 = iArrayOffset + 1;
                byte b2 = bArrArray[iArrayOffset];
                if (aewo.ak(b2)) {
                    aewo.ah(b2, cArr, i2);
                    i2++;
                    iArrayOffset = i10;
                    while (iArrayOffset < i8) {
                        byte b3 = bArrArray[iArrayOffset];
                        if (!aewo.ak(b3)) {
                            break;
                        }
                        iArrayOffset++;
                        aewo.ah(b3, cArr, i2);
                        i2++;
                    }
                } else {
                    if (a.W(b2)) {
                        if (i10 >= i8) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i2 + 1;
                        iArrayOffset += 2;
                        aewo.aj(b2, bArrArray[i10], cArr, i2);
                    } else if (a.V(b2)) {
                        if (i10 >= i8 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i4 = i2 + 1;
                        int i11 = iArrayOffset + 2;
                        iArrayOffset += 3;
                        aewo.ai(b2, bArrArray[i10], bArrArray[i11], cArr, i2);
                    } else {
                        if (i10 >= i8 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b4 = bArrArray[i10];
                        int i12 = iArrayOffset + 3;
                        byte b5 = bArrArray[iArrayOffset + 2];
                        iArrayOffset += 4;
                        aewo.ag(b2, b4, b5, bArrArray[i12], cArr, i2);
                        i2 += 2;
                    }
                    i2 = i4;
                }
            }
        } else {
            if ((i7 | i6 | ((byteBuffer.limit() - i7) - i6)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i6)));
            }
            int i13 = i7 + i6;
            cArr = new char[i6];
            int i14 = 0;
            while (i7 < i13) {
                byte b6 = byteBuffer.get(i7);
                if (!aewo.ak(b6)) {
                    break;
                }
                i7++;
                aewo.ah(b6, cArr, i14);
                i14++;
            }
            i2 = i14;
            while (i7 < i13) {
                int i15 = i7 + 1;
                byte b7 = byteBuffer.get(i7);
                if (aewo.ak(b7)) {
                    aewo.ah(b7, cArr, i2);
                    i2++;
                    i7 = i15;
                    while (i7 < i13) {
                        byte b8 = byteBuffer.get(i7);
                        if (!aewo.ak(b8)) {
                            break;
                        }
                        i7++;
                        aewo.ah(b8, cArr, i2);
                        i2++;
                    }
                } else {
                    if (a.W(b7)) {
                        if (i15 >= i13) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i3 = i2 + 1;
                        i7 += 2;
                        aewo.aj(b7, byteBuffer.get(i15), cArr, i2);
                    } else if (a.V(b7)) {
                        if (i15 >= i13 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i3 = i2 + 1;
                        int i16 = i7 + 2;
                        i7 += 3;
                        aewo.ai(b7, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i2);
                    } else {
                        if (i15 >= i13 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        byte b9 = byteBuffer.get(i15);
                        int i17 = i7 + 3;
                        byte b10 = byteBuffer.get(i7 + 2);
                        i7 += 4;
                        aewo.ag(b7, b9, b10, byteBuffer.get(i17), cArr, i2);
                        i2 += 2;
                    }
                    i2 = i3;
                }
            }
        }
        return new String(cArr, 0, i2);
    }

    public final void f(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = s;
    }

    public final ByteBuffer g(int i) {
        int iB = b(i);
        if (iB == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iC = c(iB);
        byteBufferOrder.position(iC);
        byteBufferOrder.limit(iC + d(iB));
        return byteBufferOrder;
    }

    public String h() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB + this.a);
        }
        return null;
    }

    public final String i() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB + this.a);
        }
        return null;
    }

    public final String j() {
        int iB = b(10);
        if (iB != 0) {
            return e(iB + this.a);
        }
        return null;
    }

    public final int k() {
        int iB = b(4);
        if (iB != 0) {
            return this.b.getInt(iB + this.a);
        }
        return 0;
    }

    public final int l() {
        int iB = b(8);
        if (iB != 0) {
            return this.b.getInt(iB + this.a);
        }
        return 0;
    }

    public final String m() {
        int iB = b(8);
        if (iB != 0) {
            return e(iB + this.a);
        }
        return null;
    }

    public final String n() {
        int iB = b(24);
        if (iB != 0) {
            return e(iB + this.a);
        }
        return null;
    }

    public final String o() {
        int iB = b(32);
        if (iB != 0) {
            return e(iB + this.a);
        }
        return null;
    }

    public final String p() {
        int iB = b(8);
        if (iB != 0) {
            return e(iB + this.a);
        }
        return null;
    }
}
