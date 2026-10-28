package defpackage;

import android.graphics.Bitmap;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ete implements eta {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final pj j;
    private int[] k;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] l = new int[SemanticState.Hidden];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public etc f = new etc();

    public ete(pj pjVar, etc etcVar, ByteBuffer byteBuffer, int i) {
        this.j = pjVar;
        c(etcVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ewn, java.lang.Object] */
    private final Bitmap e() {
        Boolean bool = this.h;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.i;
        Bitmap bitmapB = this.j.b.b(this.t, this.s, config);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v43, types: [short] */
    /* JADX WARN: Type inference failed for: r2v45 */
    @Override // defpackage.eta
    public final synchronized Bitmap a() {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short s;
        int i8;
        Bitmap bitmap;
        int i9;
        if (this.f.c <= 0 || this.e < 0) {
            this.q = 1;
        }
        int i10 = this.q;
        if (i10 == 1 || i10 == 2) {
            return null;
        }
        byte b2 = 0;
        this.q = 0;
        if (this.b == null) {
            this.b = this.j.O(255);
        }
        etb etbVar = (etb) this.f.e.get(this.e);
        int i11 = -1;
        int i12 = this.e - 1;
        etb etbVar2 = i12 >= 0 ? (etb) this.f.e.get(i12) : null;
        int[] iArr = etbVar.k;
        if (iArr == null) {
            iArr = this.f.a;
        }
        this.k = iArr;
        if (iArr == null) {
            this.q = 1;
            return null;
        }
        if (etbVar.f) {
            int[] iArr2 = this.l;
            System.arraycopy(iArr, 0, iArr2, 0, SemanticState.Hidden);
            this.k = iArr2;
            iArr2[etbVar.h] = 0;
            if (etbVar.g == 2 && this.e == 0) {
                this.h = Boolean.TRUE;
            }
        }
        int[] iArr3 = this.d;
        if (etbVar2 == null) {
            Bitmap bitmap2 = this.g;
            if (bitmap2 != null) {
                this.j.M(bitmap2);
            }
            this.g = null;
            Arrays.fill(iArr3, 0);
        }
        if (etbVar2 != null && etbVar2.g == 3 && this.g == null) {
            Arrays.fill(iArr3, 0);
        }
        if (etbVar2 != null && (i8 = etbVar2.g) > 0) {
            if (i8 == 2) {
                if (etbVar.f) {
                    i9 = 0;
                } else {
                    etc etcVar = this.f;
                    i9 = etcVar.l;
                    if (etbVar.k != null && etcVar.j == etbVar.h) {
                        i9 = 0;
                    }
                }
                int i13 = etbVar2.d;
                int i14 = this.r;
                int i15 = i13 / i14;
                int i16 = etbVar2.b / i14;
                int i17 = etbVar2.c / i14;
                int i18 = etbVar2.a / i14;
                int i19 = this.t;
                int i20 = (i16 * i19) + i18;
                int i21 = i15 * i19;
                int i22 = i20;
                while (i22 < i20 + i21) {
                    int i23 = i22 + i17;
                    for (int i24 = i22; i24 < i23; i24++) {
                        iArr3[i24] = i9;
                    }
                    i22 += this.t;
                }
            } else if (i8 == 3 && (bitmap = this.g) != null) {
                int i25 = this.t;
                bitmap.getPixels(iArr3, 0, i25, 0, 0, i25, this.s);
            }
        }
        if (etbVar != null) {
            this.a.position(etbVar.j);
            i = etbVar.c * etbVar.d;
        } else {
            etc etcVar2 = this.f;
            i = etcVar2.g * etcVar2.f;
        }
        byte[] bArrO = this.c;
        if (bArrO == null || bArrO.length < i) {
            bArrO = this.j.O(i);
            this.c = bArrO;
        }
        short[] sArr = this.m;
        if (sArr == null) {
            sArr = new short[SemanticState.Obscured];
            this.m = sArr;
        }
        byte[] bArr = this.n;
        if (bArr == null) {
            bArr = new byte[SemanticState.Obscured];
            this.n = bArr;
        }
        byte[] bArr2 = this.o;
        if (bArr2 == null) {
            bArr2 = new byte[4097];
            this.o = bArr2;
        }
        int iD = d();
        int i26 = 1 << iD;
        int i27 = i26 + 1;
        int i28 = i26 + 2;
        int i29 = iD + 1;
        int i30 = (1 << i29) - 1;
        int i31 = 0;
        while (i31 < i26) {
            sArr[i31] = 0;
            bArr[i31] = (byte) i31;
            i31++;
            i11 = i11;
        }
        int i32 = i11;
        byte[] bArr3 = this.b;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = i29;
        int i42 = i28;
        int i43 = i30;
        int i44 = i32;
        while (true) {
            if (i33 >= i) {
                b = b2;
                break;
            }
            if (i34 == 0) {
                int iD2 = d();
                if (iD2 <= 0) {
                    i34 = b2;
                } else {
                    ByteBuffer byteBuffer = this.a;
                    i34 = iD2;
                    byteBuffer.get(this.b, 0, Math.min(iD2, byteBuffer.remaining()));
                }
                if (i34 <= 0) {
                    this.q = 3;
                    b = 0;
                    break;
                }
                i37 = 0;
            } else {
                i33 = i33;
                bArr3 = bArr3;
            }
            i36 += (bArr3[i37] & 255) << i35;
            i37++;
            i34--;
            int i45 = i35 + 8;
            int i46 = i42;
            i41 = i41;
            i39 = i39;
            i33 = i33;
            while (true) {
                int i47 = i45;
                if (i45 < i41) {
                    i35 = i47;
                    b2 = 0;
                    i32 = -1;
                    break;
                }
                int i48 = i36 & i43;
                i36 >>= i41;
                i45 = i47 - i41;
                if (i48 == i26) {
                    i41 = i29;
                    i46 = i28;
                    i43 = i30;
                    i44 = i32;
                    i45 = i45;
                } else {
                    if (i48 == i27) {
                        i35 = i45;
                        b2 = 0;
                        break;
                    }
                    i33++;
                    int i49 = i38 + 1;
                    int i50 = i27;
                    if (i44 == i32) {
                        bArrO[i38] = bArr[i48];
                        i39 = i48;
                        i44 = i39;
                        i38 = i49;
                    } else {
                        if (i48 >= i46) {
                            bArr2[i40] = (byte) i39;
                            i40++;
                            s = i44;
                        } else {
                            s = i48;
                        }
                        while (s >= i26) {
                            bArr2[i40] = bArr[s];
                            s = sArr[s];
                            i40++;
                        }
                        int i51 = bArr[s] & 255;
                        byte b3 = (byte) i51;
                        bArrO[i38] = b3;
                        i38 = i49;
                        while (i40 > 0) {
                            i40--;
                            bArrO[i38] = bArr2[i40];
                            i33++;
                            i38++;
                        }
                        if (i46 < 4096) {
                            sArr[i46] = (short) i44;
                            bArr[i46] = b3;
                            i46++;
                            if ((i46 & i43) == 0 && i46 < 4096) {
                                i43 += i46;
                                i41++;
                            }
                        }
                        i39 = i51;
                        i44 = i48;
                    }
                    i27 = i50;
                    i32 = -1;
                }
            }
            i42 = i46;
        }
        Arrays.fill(bArrO, i38, i, b);
        if (etbVar.e || this.r != 1) {
            int[] iArr4 = this.d;
            int i52 = etbVar.d;
            int i53 = this.r;
            int i54 = i52 / i53;
            int i55 = etbVar.b / i53;
            int i56 = etbVar.c / i53;
            int i57 = etbVar.a / i53;
            int i58 = this.e;
            int i59 = this.t;
            int i60 = this.s;
            byte[] bArr4 = this.c;
            int[] iArr5 = this.k;
            Boolean bool = this.h;
            int i61 = 8;
            int i62 = 0;
            int i63 = 0;
            int i64 = 1;
            while (i63 < i54) {
                int i65 = i55;
                if (etbVar.e) {
                    if (i62 >= i54) {
                        int i66 = i64 + 1;
                        i2 = i62;
                        if (i66 == 2) {
                            i2 = 4;
                            i64 = i66;
                        } else if (i66 != 3) {
                            i64 = i66;
                            if (i66 == 4) {
                                i61 = 2;
                                i2 = 1;
                            }
                        } else {
                            i61 = 4;
                            i64 = i66;
                            i2 = 2;
                        }
                    } else {
                        i2 = i62;
                    }
                    i62 = i2 + i61;
                } else {
                    i2 = i63;
                }
                int i67 = i2 + i65;
                if (i67 < i60) {
                    int i68 = i67 * i59;
                    int i69 = i68 + i57;
                    i3 = i62;
                    int i70 = i69 + i56;
                    int i71 = i68 + i59;
                    i4 = i54;
                    int i72 = i63 * i53 * etbVar.c;
                    if (i71 < i70) {
                        i70 = i71;
                    }
                    if (i53 == 1) {
                        int i73 = i69;
                        while (i73 < i70) {
                            int i74 = i73;
                            int i75 = iArr5[bArr4[i72] & 255];
                            if (i75 != 0) {
                                iArr4[i74] = i75;
                            } else if (i58 == 0 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i73 = i74 + 1;
                            i72++;
                        }
                    } else {
                        int i76 = i72 + ((i70 - i69) * i53);
                        int i77 = i69;
                        while (i77 < i70) {
                            int i78 = i70;
                            int i79 = etbVar.c;
                            int i80 = i53;
                            int i81 = i72;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            while (true) {
                                if (i81 >= i72 + this.r) {
                                    i5 = i77;
                                    break;
                                }
                                byte[] bArr5 = this.c;
                                i5 = i77;
                                if (i81 >= bArr5.length || i81 >= i76) {
                                    break;
                                }
                                int i87 = this.k[bArr5[i81] & 255];
                                if (i87 != 0) {
                                    i82 += (i87 >> 24) & 255;
                                    i83 += (i87 >> 16) & 255;
                                    i84 += (i87 >> 8) & 255;
                                    i85 += i87 & 255;
                                    i86++;
                                }
                                i81++;
                                i77 = i5;
                            }
                            int i88 = i72 + i79;
                            int i89 = i88;
                            while (i89 < this.r + i88) {
                                byte[] bArr6 = this.c;
                                int i90 = i88;
                                if (i89 >= bArr6.length || i89 >= i76) {
                                    break;
                                }
                                int i91 = this.k[bArr6[i89] & 255];
                                if (i91 != 0) {
                                    i82 += (i91 >> 24) & 255;
                                    i83 += (i91 >> 16) & 255;
                                    i84 += (i91 >> 8) & 255;
                                    i85 += i91 & 255;
                                    i86++;
                                }
                                i89++;
                                i88 = i90;
                                i76 = i76;
                            }
                            int i92 = i76;
                            int i93 = i86 == 0 ? 0 : ((i82 / i86) << 24) | ((i83 / i86) << 16) | ((i84 / i86) << 8) | (i85 / i86);
                            if (i93 != 0) {
                                iArr4[i5] = i93;
                            } else if (i58 == 0 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i80;
                            i77 = i5 + 1;
                            i70 = i78;
                            i53 = i80;
                            i76 = i92;
                        }
                    }
                } else {
                    i3 = i62;
                    i4 = i54;
                }
                i63++;
                i55 = i65;
                i62 = i3;
                i54 = i4;
                i53 = i53;
            }
            if (this.h == null) {
                this.h = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr6 = this.d;
            int i94 = etbVar.d;
            int i95 = etbVar.b;
            int i96 = etbVar.c;
            int i97 = etbVar.a;
            int i98 = this.e;
            int i99 = this.t;
            byte[] bArr7 = this.c;
            int[] iArr7 = this.k;
            int i100 = b;
            byte b4 = -1;
            while (i100 < i94) {
                int i101 = (i100 + i95) * i99;
                int i102 = i101 + i97;
                int i103 = i102 + i96;
                int i104 = i101 + i99;
                int[] iArr8 = iArr6;
                int i105 = etbVar.c * i100;
                int i106 = i102;
                while (true) {
                    i7 = i94;
                    if (i106 < (i104 < i103 ? i104 : i103)) {
                        byte b5 = bArr7[i105];
                        int i107 = i106;
                        int i108 = b5 & 255;
                        if (i108 != b4) {
                            int i109 = iArr7[i108];
                            if (i109 != 0) {
                                iArr8[i107] = i109;
                            } else {
                                b4 = b5;
                            }
                        }
                        i106 = i107 + 1;
                        i105++;
                        i94 = i7;
                    }
                }
                i100++;
                iArr6 = iArr8;
                i94 = i7;
            }
            Boolean bool2 = this.h;
            this.h = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || (this.h == null && i98 == 0 && b4 != -1));
        }
        if (this.p && ((i6 = etbVar.g) == 0 || i6 == 1)) {
            Bitmap bitmapE = this.g;
            if (bitmapE == null) {
                bitmapE = e();
                this.g = bitmapE;
            }
            int i110 = this.t;
            bitmapE.setPixels(iArr3, 0, i110, 0, 0, i110, this.s);
        }
        Bitmap bitmapE2 = e();
        int i111 = this.t;
        bitmapE2.setPixels(iArr3, 0, i111, 0, 0, i111, this.s);
        return bitmapE2;
    }

    @Override // defpackage.eta
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(etc etcVar, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException(a.bR(i, "Sample size must be >=0, not: "));
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.q = 0;
            this.f = etcVar;
            this.e = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.a = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.a.order(ByteOrder.LITTLE_ENDIAN);
            this.p = false;
            Iterator it = etcVar.e.iterator();
            while (it.hasNext()) {
                if (((etb) it.next()).g == 3) {
                    this.p = true;
                    break;
                }
            }
            this.r = iHighestOneBit;
            int i2 = etcVar.f;
            this.t = i2 / iHighestOneBit;
            int i3 = etcVar.g;
            this.s = i3 / iHighestOneBit;
            pj pjVar = this.j;
            this.c = pjVar.O(i2 * i3);
            int i4 = this.t * this.s;
            Object obj = pjVar.a;
            this.d = obj == null ? new int[i4] : (int[]) ((ewv) obj).a(i4, int[].class);
        } catch (Throwable th) {
            throw th;
        }
    }
}
