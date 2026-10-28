package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axii implements Serializable, Comparable {
    public static final axii a = new axii(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public axii(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static final axii d(String str) {
        byte[] bytes = str.getBytes(awtd.a);
        bytes.getClass();
        axii axiiVar = new axii(bytes);
        axiiVar.d = str;
        return axiiVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        objectInputStream.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bR(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        axii axiiVar = new axii(bArr);
        Field declaredField = axii.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, axiiVar.b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int b() {
        return this.b.length;
    }

    public String c() {
        byte[] bArr = this.b;
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = axit.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r0 >= r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r6 >= r7) goto L12;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            axii r9 = (defpackage.axii) r9
            r9.getClass()
            int r0 = r8.b()
            int r1 = r9.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = 1
            if (r4 >= r2) goto L2a
            byte r6 = r8.a(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.a(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L27
            int r4 = r4 + 1
            goto L13
        L27:
            if (r6 < r7) goto L30
            goto L2e
        L2a:
            if (r0 == r1) goto L31
            if (r0 < r1) goto L30
        L2e:
            r3 = r5
            goto L31
        L30:
            r3 = -1
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axii.compareTo(java.lang.Object):int");
    }

    public boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.b;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AndroidInfo.d(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axii) {
            axii axiiVar = (axii) obj;
            int iB = axiiVar.b();
            byte[] bArr = this.b;
            int length = bArr.length;
            if (iB == length && axiiVar.e(0, bArr, 0, length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.b;
    }

    public boolean g(axii axiiVar, int i) {
        return axiiVar.e(0, this.b, 0, i);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0136 A[EDGE_INSN: B:119:0x0136->B:120:0x0137 BREAK  A[LOOP:0: B:7:0x000f->B:167:0x000f]] */
    public String toString() {
        int i;
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length == 0) {
            return "[size=0]";
        }
        char[] cArr = axit.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b = bArr[i2];
            if (b < 0) {
                if ((b >> 5) != -2) {
                    if ((b >> 4) != -2) {
                        if ((b >> 3) != -2) {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b2 = bArr[i2 + 1];
                            if ((b2 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b3 = bArr[i2 + 2];
                            if ((b3 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b4 = bArr[i5];
                            if ((b4 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
                            if (i6 <= 1114111) {
                                if (i6 >= 55296 && i6 < 57344) {
                                    if (i3 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i3 + 1;
                                    if (i3 == 64) {
                                        break;
                                    }
                                    i4 += 2;
                                    i2 += 4;
                                    i3 = i;
                                } else {
                                    if (i3 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                            } else {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                        } else {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b5 = bArr[i2 + 1];
                            if ((b5 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b6 = bArr[i7];
                            if ((b6 & 192) != 128) {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            int i8 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b << 12);
                            if (i8 >= 2048) {
                                if (i8 >= 55296 && i8 < 57344) {
                                    if (i3 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                                i = i3 + 1;
                                if (i3 != 64) {
                                    if (i8 == 65533) {
                                        i4 = -1;
                                        break;
                                    }
                                    i2 += 3;
                                    i4 += i8 < 65536 ? 1 : 2;
                                    i3 = i;
                                } else {
                                    break;
                                }
                            } else {
                                if (i3 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                        } else {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b7 = bArr[i9];
                        if ((b7 & 192) != 128) {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i10 = (b7 ^ 3968) ^ (b << 6);
                        if (i10 < 128) {
                            if (i3 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i11 = i3 + 1;
                        if (i3 == 64) {
                            break;
                        }
                        if (i10 < 160 || i10 == 65533) {
                            i4 = -1;
                            break;
                        }
                        i2 += 2;
                        i4 += i10 < 65536 ? 1 : 2;
                        i3 = i11;
                    } else {
                        if (i3 == 64) {
                            break;
                        }
                        i4 = -1;
                        break;
                    }
                }
            } else {
                i = i3 + 1;
                if (i3 != 64) {
                    if (b == 10 || b == 13 || (b >= 32 && b < 127)) {
                        i4++;
                        i2++;
                        while (true) {
                            if (i2 < length) {
                                byte b8 = bArr[i2];
                                if (b8 >= 0) {
                                    i2++;
                                    int i12 = i + 1;
                                    if (i == 64) {
                                        break loop0;
                                    }
                                    if (b8 == 10 || b8 == 13 || (b8 >= 32 && b8 < 127)) {
                                        i4++;
                                        i = i12;
                                    }
                                }
                            }
                            i3 = i;
                        }
                    }
                    i4 = -1;
                    break;
                }
                break;
            }
        }
        if (i4 == -1) {
            byte[] bArr2 = this.b;
            int length2 = bArr2.length;
            if (length2 <= 64) {
                return "[hex=" + c() + ']';
            }
            return "[size=" + length2 + " hex=" + new axii(atqq.aM(bArr2, 0, 64)).c() + "…]";
        }
        String str = this.d;
        if (str == null) {
            byte[] bArrF = f();
            bArrF.getClass();
            String str2 = new String(bArrF, awtd.a);
            this.d = str2;
            str = str2;
        }
        String strSubstring = str.substring(0, i4);
        strSubstring.getClass();
        String strC = awrc.C(awrc.C(awrc.C(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i4 >= str.length()) {
            return a.bU((byte) 93, strC, "[text=");
        }
        return "[size=" + this.b.length + " text=" + strC + "…]";
    }
}
