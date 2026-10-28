package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cuj implements ctm, cud {
    public int h;
    public SurfaceTexture i;
    private byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final cui c = new cui();
    public final eqq j = new eqq();
    public final bwn d = new bwn();
    public final bwn e = new bwn();
    public final float[] f = new float[16];
    public final float[] g = new float[16];
    private volatile int k = 0;
    private int l = -1;

    @Override // defpackage.cud
    public final void a(long j, float[] fArr) {
        ((bwn) this.j.c).e(j, fArr);
    }

    @Override // defpackage.cud
    public final void b() {
        this.d.f();
        eqq eqqVar = this.j;
        ((bwn) eqqVar.c).f();
        eqqVar.b = false;
        this.b.set(true);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    @Override // defpackage.ctm
    public final void c(long j, long j2, bse bseVar, MediaFormat mediaFormat) {
        this.d.e(j2, Long.valueOf(j));
        byte[] bArr = bseVar.E;
        byte[] bArr2 = this.m;
        int i = this.l;
        this.m = bArr;
        int i2 = bseVar.F;
        if (i2 == -1) {
            int i3 = this.k;
            i2 = 0;
        }
        this.l = i2;
        if (i == i2 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        ekr ekrVarA = bArr3 != null ? cuh.a(bArr3, this.l) : null;
        if (ekrVarA == null || !cui.b(ekrVarA)) {
            int i4 = this.l;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < 36) {
                int i8 = i5 + 1;
                int i9 = 0;
                while (i9 < 73) {
                    int i10 = 0;
                    while (i10 < 2) {
                        float f = (i8 * 0.08726647f) - 1.5707964f;
                        float f2 = (i5 * 0.08726647f) - 1.5707964f;
                        float f3 = i9 * 0.08726647f;
                        int i11 = i6 + 1;
                        int i12 = i5;
                        double d = (f3 + 3.1415927f) - 3.1415927f;
                        double dSin = Math.sin(d) * 50.0d;
                        if (i10 != 0) {
                            f2 = f;
                        }
                        double d2 = f2;
                        fArr[i6] = -((float) (dSin * Math.cos(d2)));
                        fArr[i11] = (float) (Math.sin(d2) * 50.0d);
                        int i13 = i6 + 3;
                        int i14 = i8;
                        fArr[i6 + 2] = (float) (Math.cos(d) * 50.0d * Math.cos(d2));
                        fArr2[i7] = f3 / 6.2831855f;
                        int i15 = i7 + 2;
                        fArr2[i7 + 1] = ((i12 + i10) * 0.08726647f) / 3.1415927f;
                        if (i9 == 0) {
                            if (i10 == 0) {
                                i10 = 0;
                                System.arraycopy(fArr, i6, fArr, i13, 3);
                                i6 += 6;
                                System.arraycopy(fArr2, i7, fArr2, i15, 2);
                                i7 += 4;
                            } else {
                                i6 = i13;
                                i7 = i15;
                            }
                        } else if (i9 == 72 && i10 == 1) {
                            i10 = 1;
                            System.arraycopy(fArr, i6, fArr, i13, 3);
                            i6 += 6;
                            System.arraycopy(fArr2, i7, fArr2, i15, 2);
                            i7 += 4;
                        } else {
                            i6 = i13;
                            i7 = i15;
                        }
                        i10++;
                        i8 = i14;
                        i5 = i12;
                    }
                    i9++;
                    i5 = i5;
                }
                i5 = i8;
            }
            zs zsVar = new zs(new erb[]{new erb(0, fArr, fArr2, 1)}, (byte[]) null);
            ekrVarA = new ekr(zsVar, zsVar, i4);
        }
        this.e.e(j2, ekrVarA);
    }
}
