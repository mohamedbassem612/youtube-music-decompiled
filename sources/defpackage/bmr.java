package defpackage;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmr {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public bmr(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static bmr c(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new bmr(1, 1, -1L, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(bmu.l);
        return new bmr(1, bytes.length, -1L, bytes);
    }

    public static bmr d(String str) {
        byte[] bytes = (str + (char) 0).getBytes(bmu.l);
        return new bmr(2, bytes.length, -1L, bytes);
    }

    public static bmr e(long j, ByteOrder byteOrder) {
        return f(new long[]{j}, byteOrder);
    }

    public static bmr f(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[bmu.g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = jArr.length;
            if (i >= length) {
                return new bmr(4, length, -1L, byteBufferWrap.array());
            }
            byteBufferWrap.putInt((int) jArr[i]);
            i++;
        }
    }

    public static bmr g(bmt bmtVar, ByteOrder byteOrder) {
        return h(new bmt[]{bmtVar}, byteOrder);
    }

    public static bmr h(bmt[] bmtVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[bmu.g[5] * bmtVarArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = bmtVarArr.length;
            if (i >= length) {
                return new bmr(5, length, -1L, byteBufferWrap.array());
            }
            bmt bmtVar = bmtVarArr[i];
            byteBufferWrap.putInt((int) bmtVar.a);
            byteBufferWrap.putInt((int) bmtVar.b);
            i++;
        }
    }

    public static bmr i(int i, ByteOrder byteOrder) {
        return j(new int[]{i}, byteOrder);
    }

    public static bmr j(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[bmu.g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return new bmr(3, length, -1L, byteBufferWrap.array());
            }
            byteBufferWrap.putShort((short) iArr[i]);
            i++;
        }
    }

    public final int a(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objK instanceof String) {
            return Integer.parseInt((String) objK);
        }
        if (objK instanceof long[]) {
            long[] jArr = (long[]) objK;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objK instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objK;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final int b() {
        return bmu.g[this.a] * this.b;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x012b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:300), block:B:81:0x012b */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v12, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [bmt[]] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v16, types: [bmt[]] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    final Object k(ByteOrder byteOrder) throws Throwable {
        bmp bmpVar;
        bmp bmpVar2;
        ?? str;
        byte b;
        bmp bmpVar3 = null;
        string = null;
        String string = null;
        try {
            try {
                bmpVar = new bmp(this.d);
                try {
                    bmpVar.c = byteOrder;
                    int i = 0;
                    switch (this.a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.d;
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(this.d, bmu.l);
                                try {
                                    bmpVar.close();
                                    break;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                bmpVar.close();
                                break;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                            }
                            return str2;
                        case 2:
                        case 7:
                            int i2 = this.b;
                            byte[] bArr2 = bmu.h;
                            int length = bArr2.length;
                            if (i2 >= 8) {
                                int i3 = 0;
                                while (true) {
                                    int length2 = bArr2.length;
                                    if (i3 >= 8) {
                                        i = 8;
                                    } else if (this.d[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            try {
                                while (i < i2) {
                                    byte b2 = this.d[i];
                                    if (b2 == 0) {
                                        string = sb.toString();
                                        bmpVar.close();
                                        return string;
                                    }
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i++;
                                }
                                bmpVar.close();
                                return string;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return string;
                            }
                            string = sb.toString();
                        case 3:
                            int i4 = this.b;
                            str = new int[i4];
                            while (i < i4) {
                                str[i] = bmpVar.readUnsignedShort();
                                i++;
                            }
                            bmpVar.close();
                            return str;
                        case 4:
                            int i5 = this.b;
                            str = new long[i5];
                            while (i < i5) {
                                str[i] = bmpVar.a();
                                i++;
                            }
                            bmpVar.close();
                            return str;
                        case 5:
                            int i6 = this.b;
                            str = new bmt[i6];
                            while (i < i6) {
                                str[i] = new bmt(bmpVar.a(), bmpVar.a());
                                i++;
                            }
                            bmpVar.close();
                            return str;
                        case 8:
                            int i7 = this.b;
                            str = new int[i7];
                            while (i < i7) {
                                str[i] = bmpVar.readShort();
                                i++;
                            }
                            bmpVar.close();
                            return str;
                        case 9:
                            int i8 = this.b;
                            str = new int[i8];
                            while (i < i8) {
                                str[i] = bmpVar.readInt();
                                i++;
                            }
                            bmpVar.close();
                            return str;
                        case 10:
                            int i9 = this.b;
                            str = new bmt[i9];
                            while (i < i9) {
                                str[i] = new bmt(bmpVar.readInt(), bmpVar.readInt());
                                i++;
                            }
                            bmpVar.close();
                            return str;
                        case 11:
                            int i10 = this.b;
                            str = new double[i10];
                            while (i < i10) {
                                str[i] = bmpVar.readFloat();
                                i++;
                            }
                            bmpVar.close();
                            return str;
                        case 12:
                            int i11 = this.b;
                            str = new double[i11];
                            while (i < i11) {
                                str[i] = bmpVar.readDouble();
                                i++;
                            }
                            bmpVar.close();
                            return str;
                        default:
                            bmpVar.close();
                            return string;
                    }
                } catch (IOException e4) {
                    e = e4;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bmpVar == null) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                bmpVar3 = bmpVar2;
                if (bmpVar3 != null) {
                    try {
                        bmpVar3.close();
                    } catch (IOException e5) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                    }
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            bmpVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (bmpVar3 != null) {
                bmpVar3.close();
            }
            throw th;
        }
    }

    public final String l(ByteOrder byteOrder) throws Throwable {
        Object objK = k(byteOrder);
        if (objK != null) {
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (!(objK instanceof long[])) {
                if (!(objK instanceof int[])) {
                    if (!(objK instanceof double[])) {
                        if (objK instanceof bmt[]) {
                            bmt[] bmtVarArr = (bmt[]) objK;
                            while (true) {
                                int length = bmtVarArr.length;
                                if (i >= length) {
                                    break;
                                }
                                sb.append(bmtVarArr[i].a);
                                sb.append('/');
                                sb.append(bmtVarArr[i].b);
                                i++;
                                if (i != length) {
                                    sb.append(',');
                                }
                            }
                        }
                    } else {
                        double[] dArr = (double[]) objK;
                        while (true) {
                            int length2 = dArr.length;
                            if (i >= length2) {
                                break;
                            }
                            sb.append(dArr[i]);
                            i++;
                            if (i != length2) {
                                sb.append(',');
                            }
                        }
                    }
                } else {
                    int[] iArr = (int[]) objK;
                    while (true) {
                        int length3 = iArr.length;
                        if (i >= length3) {
                            break;
                        }
                        sb.append(iArr[i]);
                        i++;
                        if (i != length3) {
                            sb.append(',');
                        }
                    }
                }
            } else {
                long[] jArr = (long[]) objK;
                while (true) {
                    int length4 = jArr.length;
                    if (i >= length4) {
                        break;
                    }
                    sb.append(jArr[i]);
                    i++;
                    if (i != length4) {
                        sb.append(',');
                    }
                }
            }
            return sb.toString();
        }
        return null;
    }

    public final String toString() {
        return "(" + bmu.f[this.a] + ", data length:" + this.d.length + ')';
    }
}
