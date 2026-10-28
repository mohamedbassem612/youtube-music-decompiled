package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dcf implements dbn {
    private static final byte[] a = {0, 7, 8, 15};
    private static final byte[] b = {0, 119, -120, -1};
    private static final byte[] c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint d;
    private final Paint e;
    private final Canvas f;
    private final dce g;
    private Bitmap h;
    private final dci i;
    private final yvh j;

    public dcf(List list) {
        bwb bwbVar = new bwb((byte[]) list.get(0));
        int iS = bwbVar.s();
        int iS2 = bwbVar.s();
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new Canvas();
        this.i = new dci(719, 575, 0, 719, 0, 575, null);
        this.j = new yvh(0, f(), g(), h());
        this.g = new dce(iS, iS2);
    }

    private static void e(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Paint paint2 = paint;
        dqp dqpVar = new dqp(bArr, (byte[]) null);
        int i14 = i2;
        int i15 = i3;
        byte[] bArrJ = null;
        byte[] bArrJ2 = null;
        byte[] bArrJ3 = null;
        while (dqpVar.f() != 0) {
            int i16 = dqpVar.i(8);
            if (i16 != 240) {
                int i17 = 4;
                int i18 = 1;
                int i19 = 2;
                switch (i16) {
                    case 16:
                        if (i == 3) {
                            if (bArrJ == null) {
                                bArr3 = b;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrJ;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrJ3 == null) {
                            bArr3 = a;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrJ3;
                        }
                        boolean z = false;
                        while (true) {
                            int i20 = dqpVar.i(2);
                            if (i20 != 0) {
                                i4 = i20;
                                z = z;
                                i5 = 1;
                            } else {
                                if (dqpVar.u()) {
                                    i6 = dqpVar.i(3) + 3;
                                    i4 = dqpVar.i(2);
                                } else {
                                    if (dqpVar.u()) {
                                        i5 = 1;
                                    } else {
                                        int i21 = dqpVar.i(2);
                                        if (i21 == 0) {
                                            z = true;
                                        } else if (i21 == 1) {
                                            i5 = 2;
                                        } else if (i21 == 2) {
                                            z = z;
                                            i5 = dqpVar.i(4) + 12;
                                            i4 = dqpVar.i(2);
                                        } else if (i21 != 3) {
                                            z = z;
                                        } else {
                                            i6 = dqpVar.i(8) + 29;
                                            i4 = dqpVar.i(2);
                                        }
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    i4 = 0;
                                }
                                i5 = i6;
                                z = z;
                            }
                            if (i5 != 0 && paint2 != null) {
                                int i22 = i15 + 1;
                                float f = i15;
                                if (bArr2 != 0) {
                                    i4 = bArr2[i4];
                                }
                                paint2.setColor(iArr[i4]);
                                canvas.drawRect(i14, f, i14 + i5, i22, paint2);
                            }
                            i14 += i5;
                            if (z) {
                                dqpVar.m();
                            } else {
                                paint2 = paint;
                                z = z;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrJ2 == null ? c : bArrJ2 : null;
                        boolean z2 = false;
                        while (true) {
                            int i23 = dqpVar.i(i17);
                            if (i23 != 0) {
                                z2 = z2;
                                i7 = 1;
                            } else if (dqpVar.u()) {
                                if (dqpVar.u()) {
                                    int i24 = dqpVar.i(i19);
                                    if (i24 == 0) {
                                        i7 = 1;
                                    } else if (i24 == 1) {
                                        i7 = i19;
                                    } else if (i24 == i19) {
                                        i8 = dqpVar.i(i17) + 9;
                                        i9 = dqpVar.i(i17);
                                    } else if (i24 != 3) {
                                        z2 = z2;
                                        i23 = 0;
                                        i7 = 0;
                                    } else {
                                        i8 = dqpVar.i(8) + 25;
                                        i9 = dqpVar.i(i17);
                                    }
                                    i23 = 0;
                                } else {
                                    i8 = dqpVar.i(i19) + i17;
                                    i9 = dqpVar.i(i17);
                                }
                                i7 = i8;
                                z2 = z2;
                                i23 = i9;
                            } else {
                                int i25 = dqpVar.i(3);
                                if (i25 != 0) {
                                    i7 = i25 + 2;
                                    i23 = 0;
                                } else {
                                    z2 = true;
                                    i23 = 0;
                                    i7 = 0;
                                }
                            }
                            if (i7 == 0 || paint2 == null) {
                                i10 = i19;
                            } else {
                                int i26 = i15 + 1;
                                float f2 = i15;
                                if (bArr4 != 0) {
                                    i23 = bArr4[i23];
                                }
                                paint2.setColor(iArr[i23]);
                                i10 = 2;
                                canvas.drawRect(i14, f2, i14 + i7, i26, paint2);
                            }
                            i14 += i7;
                            if (z2) {
                                dqpVar.m();
                                continue;
                            } else {
                                i19 = i10;
                                z2 = z2;
                                i17 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i27 = i14;
                        int i28 = 0;
                        while (true) {
                            int i29 = dqpVar.i(8);
                            if (i29 != 0) {
                                i11 = i28;
                                i12 = i18;
                            } else if (dqpVar.u()) {
                                i11 = i28;
                                i12 = dqpVar.i(7);
                                i29 = dqpVar.i(8);
                            } else {
                                int i30 = dqpVar.i(7);
                                if (i30 != 0) {
                                    i11 = i28;
                                    i12 = i30;
                                    i29 = 0;
                                } else {
                                    i11 = i18;
                                    i29 = 0;
                                    i12 = 0;
                                }
                            }
                            if (i12 == 0 || paint2 == null) {
                                i13 = i18;
                            } else {
                                paint2.setColor(iArr[i29]);
                                i13 = i18;
                                canvas.drawRect(i27, i15, i27 + i12, i15 + 1, paint2);
                            }
                            i27 += i12;
                            if (i11 != 0) {
                                i14 = i27;
                                continue;
                            } else {
                                i18 = i13;
                                i28 = i11;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i16) {
                            case 32:
                                bArrJ3 = j(4, 4, dqpVar);
                                break;
                            case 33:
                                bArrJ = j(4, 8, dqpVar);
                                break;
                            case 34:
                                bArrJ2 = j(16, 8, dqpVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i15 += 2;
                i14 = i2;
            }
            paint2 = paint;
        }
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = ((1 != i4 ? 0 : 255) << 16) | (-16777216) | ((i3 != 0 ? 255 : 0) << 8) | (i2 == 0 ? 0 : 255);
            } else {
                iArr[i] = ((1 != i4 ? 0 : 127) << 16) | (-16777216) | ((i3 != 0 ? 127 : 0) << 8) | (i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[SemanticState.Hidden];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = ((1 != (i & 1) ? 0 : 255) << 16) | 1056964608 | (((i & 2) != 0 ? 255 : 0) << 8) | ((i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = (((1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0)) << 16) | (-16777216) | ((((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0)) << 8) | (((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = (((1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0)) << 16) | 2130706432 | ((((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0)) << 8) | (((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = ((((1 != (i & 1) ? 0 : 43) + 127) + ((i & 16) != 0 ? 85 : 0)) << 16) | (-16777216) | (((((i & 2) != 0 ? 43 : 0) + 127) + ((i & 32) != 0 ? 85 : 0)) << 8) | (((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = (((1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0)) << 16) | (-16777216) | ((((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0)) << 8) | (((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static ekr i(dqp dqpVar) {
        byte[] bArr;
        int i = dqpVar.i(16);
        dqpVar.s(4);
        int i2 = dqpVar.i(2);
        boolean zU = dqpVar.u();
        dqpVar.s(1);
        byte[] bArr2 = bwp.e;
        if (i2 != 1) {
            if (i2 == 0) {
                int i3 = dqpVar.i(16);
                int i4 = dqpVar.i(16);
                if (i3 > 0) {
                    bArr2 = new byte[i3];
                    dqpVar.w(bArr2, i3);
                }
                if (i4 > 0) {
                    bArr = new byte[i4];
                    dqpVar.w(bArr, i4);
                }
            }
            return new ekr(i, zU, bArr2, bArr);
        }
        dqpVar.s(dqpVar.i(8) << 4);
        bArr = bArr2;
        return new ekr(i, zU, bArr2, bArr);
    }

    private static byte[] j(int i, int i2, dqp dqpVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) dqpVar.i(i2);
        }
        return bArr;
    }

    private static yvh k(dqp dqpVar, int i) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 8;
        int i7 = dqpVar.i(8);
        dqpVar.s(8);
        int[] iArrF = f();
        int[] iArrG = g();
        int[] iArrH = h();
        int i8 = i - 2;
        while (i8 > 0) {
            int i9 = dqpVar.i(i6);
            int i10 = dqpVar.i(i6);
            if ((i10 & SemanticState.Focused) != 0) {
                iArr = iArrF;
            } else {
                iArr = (i10 & 64) != 0 ? iArrG : iArrH;
            }
            if ((i10 & 1) != 0) {
                i4 = dqpVar.i(i6);
                i5 = dqpVar.i(i6);
                i2 = dqpVar.i(i6);
                i3 = dqpVar.i(i6);
                i8 -= 6;
            } else {
                int i11 = dqpVar.i(6) << 2;
                int i12 = dqpVar.i(4) << 4;
                i8 -= 4;
                i2 = dqpVar.i(4) << 4;
                i3 = dqpVar.i(2) << 6;
                i4 = i11;
                i5 = i12;
            }
            if (i4 == 0) {
                i3 = 255;
                i5 = 0;
                i2 = 0;
            }
            int i13 = i6;
            double d = i4;
            double d2 = i5 - 128;
            int[] iArr2 = iArr;
            double d3 = i2 - 128;
            iArr2[i9] = (((byte) (255 - (i3 & 255))) << 24) | (bwp.c((int) (d + (1.402d * d2)), 0, 255) << 16) | (bwp.c((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | bwp.c((int) (d + (d3 * 1.772d)), 0, 255);
            i6 = i13;
            i7 = i7;
        }
        return new yvh(i7, iArrF, iArrG, iArrH);
    }

    @Override // defpackage.dbn
    public final int a() {
        return 2;
    }

    @Override // defpackage.dbn
    public final /* synthetic */ dbd b(byte[] bArr, int i, int i2) {
        return dco.a(this, bArr, i2);
    }

    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        boolean z;
        abnx abnxVar;
        Canvas canvas;
        Canvas canvas2;
        int i3;
        dcd dcdVar;
        int i4;
        int i5;
        int i6;
        int i7;
        dqp dqpVar = new dqp(bArr, i + i2);
        dqpVar.q(i);
        while (true) {
            z = true;
            if (dqpVar.f() >= 48 && dqpVar.i(8) == 15) {
                dce dceVar = this.g;
                int i8 = dqpVar.i(8);
                int i9 = 16;
                int i10 = dqpVar.i(16);
                int i11 = dqpVar.i(16);
                int iG = dqpVar.g() + i11;
                if ((i11 << 3) > dqpVar.f()) {
                    bvx.e("DvbParser", "Data field length exceeds limit");
                    dqpVar.s(dqpVar.f());
                } else {
                    switch (i8) {
                        case 16:
                            if (i10 == dceVar.a) {
                                aerm aermVar = dceVar.i;
                                dqpVar.i(8);
                                int i12 = dqpVar.i(4);
                                int i13 = dqpVar.i(2);
                                dqpVar.s(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i14 = i11 - 2; i14 > 0; i14 -= 6) {
                                    int i15 = dqpVar.i(8);
                                    dqpVar.s(8);
                                    sparseArray.put(i15, new ys(dqpVar.i(16), dqpVar.i(16), null));
                                }
                                aerm aermVar2 = new aerm(i12, i13, sparseArray);
                                if (aermVar2.a != 0) {
                                    dceVar.i = aermVar2;
                                    dceVar.c.clear();
                                    dceVar.d.clear();
                                    dceVar.e.clear();
                                } else if (aermVar != null) {
                                    if (aermVar.b != aermVar2.b) {
                                        dceVar.i = aermVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            aerm aermVar3 = dceVar.i;
                            if (i10 == dceVar.a && aermVar3 != null) {
                                int i16 = dqpVar.i(8);
                                dqpVar.s(4);
                                boolean zU = dqpVar.u();
                                dqpVar.s(3);
                                int i17 = dqpVar.i(16);
                                int i18 = dqpVar.i(16);
                                dqpVar.i(3);
                                int i19 = dqpVar.i(3);
                                dqpVar.s(2);
                                int i20 = dqpVar.i(8);
                                int i21 = dqpVar.i(8);
                                int i22 = dqpVar.i(4);
                                int i23 = dqpVar.i(2);
                                dqpVar.s(2);
                                int i24 = i11 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i24 > 0) {
                                    int i25 = dqpVar.i(i9);
                                    int i26 = dqpVar.i(2);
                                    dqpVar.i(2);
                                    int i27 = dqpVar.i(12);
                                    dqpVar.s(4);
                                    int i28 = dqpVar.i(12);
                                    int i29 = i24 - 6;
                                    if (i26 == 1 || i26 == 2) {
                                        dqpVar.i(8);
                                        dqpVar.i(8);
                                        i24 -= 8;
                                    } else {
                                        i24 = i29;
                                    }
                                    sparseArray2.put(i25, new ys(i27, i28, null));
                                    i9 = 16;
                                }
                                dcd dcdVar2 = new dcd(i16, zU, i17, i18, i19, i20, i21, i22, i23, sparseArray2);
                                if (aermVar3.a == 0 && (dcdVar = (dcd) dceVar.c.get(dcdVar2.a)) != null) {
                                    int i30 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = dcdVar.j;
                                        if (i30 < sparseArray3.size()) {
                                            dcdVar2.j.put(sparseArray3.keyAt(i30), (ys) sparseArray3.valueAt(i30));
                                            i30++;
                                        }
                                    }
                                }
                                dceVar.c.put(dcdVar2.a, dcdVar2);
                            }
                            break;
                        case 18:
                            if (i10 == dceVar.a) {
                                yvh yvhVarK = k(dqpVar, i11);
                                dceVar.d.put(yvhVarK.a, yvhVarK);
                            } else if (i10 == dceVar.b) {
                                yvh yvhVarK2 = k(dqpVar, i11);
                                dceVar.f.put(yvhVarK2.a, yvhVarK2);
                            }
                            break;
                        case 19:
                            if (i10 == dceVar.a) {
                                ekr ekrVarI = i(dqpVar);
                                dceVar.e.put(ekrVarI.b, ekrVarI);
                            } else if (i10 == dceVar.b) {
                                ekr ekrVarI2 = i(dqpVar);
                                dceVar.g.put(ekrVarI2.b, ekrVarI2);
                            }
                            break;
                        case 20:
                            if (i10 == dceVar.a) {
                                dqpVar.s(4);
                                boolean zU2 = dqpVar.u();
                                dqpVar.s(3);
                                int i31 = dqpVar.i(16);
                                int i32 = dqpVar.i(16);
                                if (zU2) {
                                    int i33 = dqpVar.i(16);
                                    i4 = dqpVar.i(16);
                                    i7 = dqpVar.i(16);
                                    i5 = dqpVar.i(16);
                                    i6 = i33;
                                } else {
                                    i4 = i31;
                                    i5 = i32;
                                    i6 = 0;
                                    i7 = 0;
                                }
                                dceVar.h = new dci(i31, i32, i6, i4, i7, i5, null);
                            }
                            break;
                    }
                    dqpVar.t(iG - dqpVar.g());
                }
            }
        }
        dce dceVar2 = this.g;
        aerm aermVar4 = dceVar2.i;
        if (aermVar4 == null) {
            abnxVar = new abnx(agpi.a, -9223372036854775807L, -9223372036854775807L);
        } else {
            dci dciVar = dceVar2.h;
            if (dciVar == null) {
                dciVar = this.i;
            }
            Bitmap bitmap = this.h;
            if (bitmap == null || dciVar.e + 1 != bitmap.getWidth() || dciVar.c + 1 != this.h.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dciVar.e + 1, dciVar.c + 1, Bitmap.Config.ARGB_8888);
                this.h = bitmapCreateBitmap;
                this.f.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            Object obj = aermVar4.c;
            int i34 = 0;
            while (true) {
                SparseArray sparseArray4 = (SparseArray) obj;
                if (i34 < sparseArray4.size()) {
                    Canvas canvas3 = this.f;
                    canvas3.save();
                    ys ysVar = (ys) sparseArray4.valueAt(i34);
                    dcd dcdVar3 = (dcd) dceVar2.c.get(sparseArray4.keyAt(i34));
                    int i35 = ysVar.b + dciVar.f;
                    int i36 = ysVar.a + dciVar.d;
                    int i37 = dcdVar3.c;
                    int i38 = i35 + i37;
                    int iMin = Math.min(i38, dciVar.a);
                    boolean z2 = z;
                    int i39 = dcdVar3.d;
                    int i40 = i36 + i39;
                    canvas3.clipRect(i35, i36, iMin, Math.min(i40, dciVar.b));
                    SparseArray sparseArray5 = dceVar2.d;
                    int i41 = dcdVar3.f;
                    yvh yvhVar = (yvh) sparseArray5.get(i41);
                    if (yvhVar == null && (yvhVar = (yvh) dceVar2.f.get(i41)) == null) {
                        yvhVar = this.j;
                    }
                    SparseArray sparseArray6 = dcdVar3.j;
                    Object obj2 = obj;
                    int i42 = i34;
                    int i43 = 0;
                    while (i43 < sparseArray6.size()) {
                        int iKeyAt = sparseArray6.keyAt(i43);
                        int i44 = i43;
                        ys ysVar2 = (ys) sparseArray6.valueAt(i43);
                        SparseArray sparseArray7 = sparseArray6;
                        ekr ekrVar = (ekr) dceVar2.e.get(iKeyAt);
                        if (ekrVar == null) {
                            ekrVar = (ekr) dceVar2.g.get(iKeyAt);
                        }
                        if (ekrVar != null) {
                            Paint paint = ekrVar.a ? null : this.d;
                            i3 = i35;
                            int i45 = dcdVar3.e;
                            int i46 = ysVar2.b + i3;
                            int i47 = ysVar2.a + i36;
                            int[] iArr = (int[]) (i45 == 3 ? yvhVar.d : i45 == 2 ? yvhVar.c : yvhVar.b);
                            canvas2 = canvas3;
                            e((byte[]) ekrVar.c, iArr, i45, i46, i47, paint, canvas2);
                            e((byte[]) ekrVar.d, iArr, i45, i46, i47 + 1, paint, canvas2);
                        } else {
                            canvas2 = canvas3;
                            i3 = i35;
                        }
                        i36 = i36;
                        i37 = i37;
                        i43 = i44 + 1;
                        i35 = i3;
                        i38 = i38;
                        canvas3 = canvas2;
                        sparseArray6 = sparseArray7;
                        dceVar2 = dceVar2;
                        arrayList = arrayList;
                    }
                    dce dceVar3 = dceVar2;
                    ArrayList arrayList2 = arrayList;
                    Canvas canvas4 = canvas3;
                    int i48 = i36;
                    int i49 = i35;
                    int i50 = i37;
                    int i51 = i38;
                    float f = i48;
                    float f2 = i49;
                    if (dcdVar3.b) {
                        int i52 = dcdVar3.e;
                        int i53 = i52 == 3 ? ((int[]) yvhVar.d)[dcdVar3.g] : i52 == 2 ? ((int[]) yvhVar.c)[dcdVar3.h] : ((int[]) yvhVar.b)[dcdVar3.i];
                        Paint paint2 = this.e;
                        paint2.setColor(i53);
                        canvas = canvas4;
                        canvas.drawRect(f2, f, i51, i40, paint2);
                    } else {
                        canvas = canvas4;
                    }
                    bur burVar = new bur();
                    burVar.b(Bitmap.createBitmap(this.h, i49, i48, i50, i39));
                    float f3 = dciVar.e;
                    burVar.e = f2 / f3;
                    burVar.f = 0;
                    float f4 = dciVar.c;
                    burVar.c(f / f4, 0);
                    burVar.d = 0;
                    burVar.g = i50 / f3;
                    burVar.h = i39 / f4;
                    arrayList = arrayList2;
                    arrayList.add(burVar.a());
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    canvas.restore();
                    z = z2;
                    i34 = i42 + 1;
                    obj = obj2;
                    dceVar2 = dceVar3;
                } else {
                    abnxVar = new abnx(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        bvhVar.a(abnxVar);
    }

    @Override // defpackage.dbn
    public final void d() {
        dce dceVar = this.g;
        dceVar.c.clear();
        dceVar.d.clear();
        dceVar.e.clear();
        dceVar.f.clear();
        dceVar.g.clear();
        dceVar.h = null;
        dceVar.i = null;
    }
}
