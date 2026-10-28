package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dfh {
    public final boolean a;
    public int c;
    public long h;
    public boolean k;
    public final SparseArray b = new SparseArray();
    public bug d = bug.a;
    public int e = -1;
    public aawx[] l = new aawx[0];
    public long f = -9223372036854775807L;
    public long g = -1;
    public long i = Long.MAX_VALUE;
    public long j = Long.MAX_VALUE;

    public dfh(boolean z) {
        this.a = z;
    }

    public final dfg a(int i) {
        SparseArray sparseArray = this.b;
        ahno.P(bwp.X(sparseArray, i), "Source not found.");
        return (dfg) sparseArray.get(i);
    }

    public final void b() {
        ahno.P(!this.d.equals(bug.a), "Audio mixer is not configured.");
    }

    public final void c() {
        if (this.k || !g()) {
            return;
        }
        int i = cat.a;
        this.k = true;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    public final void d(int i, ByteBuffer byteBuffer) {
        long j;
        int i2;
        boolean z;
        dfh dfhVar = this;
        ByteBuffer byteBuffer2 = byteBuffer;
        dfhVar.b();
        if (byteBuffer2.hasRemaining()) {
            dfg dfgVarA = a(i);
            if (dfgVarA.a < dfhVar.g) {
                int iRemaining = byteBuffer2.remaining();
                bug bugVar = dfgVarA.b;
                long jMin = Math.min(dfgVarA.a + ((long) (iRemaining / bugVar.e)), dfhVar.g);
                if (dfgVarA.e.a) {
                    dfgVarA.a(byteBuffer2, jMin);
                    return;
                }
                long j2 = dfgVarA.a;
                long j3 = dfhVar.h;
                if (j2 < j3) {
                    dfgVarA.a(byteBuffer2, Math.min(jMin, j3));
                    if (dfgVarA.a == jMin) {
                        return;
                    }
                }
                aawx[] aawxVarArr = dfhVar.l;
                int length = aawxVarArr.length;
                int i3 = 0;
                while (i3 < length) {
                    aawx aawxVar = aawxVarArr[i3];
                    long j4 = dfgVarA.a;
                    long j5 = aawxVar.b;
                    if (j4 < j5) {
                        int i4 = ((int) (j4 - aawxVar.a)) * dfhVar.d.e;
                        ByteBuffer byteBuffer3 = (ByteBuffer) aawxVar.c;
                        byteBuffer3.position(byteBuffer3.position() + i4);
                        long jMin2 = Math.min(jMin, j5);
                        bug bugVar2 = dfhVar.d;
                        ahno.F(((jMin2 > dfgVarA.a ? 1 : (jMin2 == dfgVarA.a ? 0 : -1)) ^ (-1)) >>> 31);
                        long j6 = jMin2 - dfgVarA.a;
                        avbs avbsVar = dfgVarA.e;
                        boolean z2 = dfgVarA.c.a;
                        int i5 = bugVar.d;
                        int i6 = bugVar2.d;
                        int i7 = avbsVar.c;
                        int i8 = avbsVar.b;
                        j = jMin;
                        float[] fArr = new float[i7];
                        float[] fArr2 = new float[i8];
                        int i9 = 0;
                        while (i9 < ((int) j6)) {
                            int iPosition = byteBuffer3.position();
                            int i10 = i9;
                            int i11 = length;
                            int i12 = 0;
                            while (true) {
                                z = i6 == 2;
                                if (i12 >= i8) {
                                    break;
                                }
                                fArr2[i12] = att.i(byteBuffer3, z, z);
                                i12++;
                            }
                            byteBuffer3.position(iPosition);
                            for (int i13 = 0; i13 < i7; i13++) {
                                fArr[i13] = att.i(byteBuffer2, i5 == 2, z);
                            }
                            int i14 = 0;
                            while (i14 < i8) {
                                for (int i15 = 0; i15 < i7; i15++) {
                                    fArr2[i14] = fArr2[i14] + (fArr[i15] * avbsVar.c(i15, i14));
                                }
                                if (z) {
                                    byteBuffer3.putShort((short) bwp.a(fArr2[i14], -32768.0f, 32767.0f));
                                } else {
                                    byteBuffer3.putFloat(z2 ? bwp.a(fArr2[i14], -1.0f, 1.0f) : fArr2[i14]);
                                }
                                fArr2[i14] = 0.0f;
                                i14++;
                                i5 = i5;
                            }
                            i9 = i10 + 1;
                            byteBuffer2 = byteBuffer;
                            length = i11;
                        }
                        i2 = length;
                        dfgVarA.a = jMin2;
                        byteBuffer3.reset();
                        if (dfgVarA.a == j) {
                            break;
                        }
                    } else {
                        j = jMin;
                        i2 = length;
                    }
                    i3++;
                    dfhVar = this;
                    byteBuffer2 = byteBuffer;
                    aawxVarArr = aawxVarArr;
                    bugVar = bugVar;
                    jMin = j;
                    length = i2;
                }
                int i16 = cat.a;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public final void e(int i, float f) {
        b();
        ahno.G(((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) ^ (-1)) >>> 31, "Volume must be non-negative.");
        dfg dfgVarA = a(i);
        avbs avbsVar = dfgVarA.d;
        float[] fArr = (float[]) avbsVar.d;
        float[] fArr2 = new float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = fArr[i2] * f;
        }
        dfgVarA.e = new avbs(avbsVar.c, avbsVar.b, fArr2);
    }

    public final void f() {
        this.g = Math.min(this.i, this.h + ((long) this.e));
    }

    public final boolean g() {
        b();
        long j = this.h;
        if (j < this.i) {
            return j >= this.j && this.b.size() == 0;
        }
        return true;
    }

    public final aawx h(long j) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(this.e * this.d.e).order(ByteOrder.nativeOrder());
        byteBufferOrder.mark();
        return new aawx(byteBufferOrder, j, j + ((long) this.e));
    }
}
