package defpackage;

import android.opengl.GLES20;
import android.util.Range;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abcx {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    byte[] h;
    boolean k;
    public final int[] l;
    public yib n;
    public int o;
    public yib p;
    private final int q;
    private final int r;
    private abcl s;
    private acht w;
    private final abcw t = new abcw();
    private final ArrayDeque u = new ArrayDeque();
    private final ArrayDeque v = new ArrayDeque();
    long f = -1;
    long g = -1;
    long i = -1;
    long j = 0;
    public yia m = yia.c;

    public abcx(abcz abczVar) {
        int[] iArr = {0, 0, 0};
        this.l = iArr;
        yib yibVar = yib.c;
        this.n = yibVar;
        this.o = 500;
        this.p = yibVar;
        this.q = abczVar.d("uColorPrimaryTransform");
        this.r = abczVar.d("uLuminanceTransform");
        this.a = abczVar.d("uInputLut");
        this.b = abczVar.d("uOutputLut");
        this.c = abczVar.d("uKneeLut");
        this.d = abczVar.d("uLutSize");
        GLES20.glGenTextures(3, iArr, 0);
        for (int i = 0; i < 3; i++) {
            abbz.a(this.l[i]);
        }
    }

    private final void f(ByteBuffer byteBuffer, int i, int i2) {
        a(i, i2);
        GLES20.glPixelStorei(3317, 1);
        GLES20.glTexImage2D(3553, 0, 6410, 1, byteBuffer.capacity() / 2, 0, 6410, 5121, byteBuffer);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r5
      0x002f: PHI (r5v1 float) = (r5v0 float), (r5v4 float) binds: [B:6:0x0026, B:8:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    private static void g(abcl abclVar, abcw abcwVar) {
        float f = abcwVar.b / 4095.0f;
        abclVar.i = f;
        float f2 = abcwVar.c / 4095.0f;
        abclVar.j = f2;
        int i = abcwVar.d;
        abclVar.k = i;
        int i2 = abcwVar.g;
        if (i2 <= 0) {
            i2 = abcwVar.f;
        }
        float f3 = i2 * 0.1f;
        abclVar.e = f3;
        float f4 = abclVar.f;
        float f5 = 200.0f;
        if (f3 >= 200.0f) {
            f5 = 10000.0f;
            if (f3 > 10000.0f) {
                f3 = f5;
            }
        } else {
            f3 = f5;
        }
        abclVar.e = f3;
        if (f >= 1.0f || f3 < f4) {
            abclVar.k = 0;
            return;
        }
        float[] fArr = abclVar.l;
        if (fArr == null || fArr.length < i) {
            abclVar.l = new float[i];
        }
        float f6 = 1.0f - f2;
        String str = "";
        for (int i3 = 0; i3 < abclVar.k; i3++) {
            float[] fArr2 = abclVar.l;
            float f7 = abclVar.j + ((abcwVar.e[i3] / 1023.0f) * f6);
            fArr2[i3] = f7;
            str = str + f7 + ',';
        }
    }

    public final void a(int i, int i2) {
        GLES20.glActiveTexture(33988 + i);
        GLES20.glBindTexture(3553, this.l[i]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glUniform1i(i2, i + 4);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    public final void b(boolean z, byte[] bArr, long j, long j2) {
        if (this.f > j) {
            this.u.clear();
            this.v.clear();
            this.t.a = false;
            if (z) {
                this.k = true;
                this.e = 0;
                this.i = -1L;
                this.j = 0L;
                return;
            }
        } else if (z) {
            z = true;
            this.u.clear();
            this.v.clear();
            this.t.a = false;
            if (z) {
                this.k = true;
                this.e = 0;
                this.i = -1L;
                this.j = 0L;
                return;
            }
        }
        long j3 = this.i;
        if (j3 != -1 && Math.abs(j3 - j2) > 100000) {
            this.j = this.i - j2;
        }
        this.u.add(bArr);
        this.v.add(Long.valueOf(j));
        this.f = j;
    }

    public final void c(abcc abccVar) {
        abcx abcxVar;
        ByteBuffer byteBufferE = abccVar.e();
        if (byteBufferE == null || !byteBufferE.hasRemaining()) {
            abcxVar = this;
        } else {
            int iRemaining = byteBufferE.remaining();
            byte[] bArr = new byte[iRemaining + 1];
            bArr[0] = 0;
            byteBufferE.get(bArr, 1, iRemaining);
            byteBufferE.position(0);
            byteBufferE.limit(0);
            abcxVar = this;
            abcxVar.b(false, bArr, abccVar.c(), abccVar.c());
        }
        long jC = abccVar.c() - abcxVar.j;
        ArrayDeque arrayDeque = abcxVar.v;
        if (arrayDeque.isEmpty() || abcxVar.g == jC) {
            return;
        }
        abcxVar.g = jC;
        byte[] bArr2 = null;
        while (!arrayDeque.isEmpty() && jC >= ((Long) arrayDeque.getFirst()).longValue()) {
            ((Long) arrayDeque.removeFirst()).longValue();
            bArr2 = (byte[]) abcxVar.u.removeFirst();
        }
        if (bArr2 == null || Arrays.equals(bArr2, abcxVar.h)) {
            return;
        }
        abcxVar.h = bArr2;
        abcw abcwVar = abcxVar.t;
        abcwVar.a = false;
        try {
            dqp dqpVar = new dqp(bArr2, (byte[]) null);
            dqpVar.s(8);
            int i = dqpVar.i(8);
            int i2 = dqpVar.i(16);
            int i3 = dqpVar.i(16);
            if (i == 181 && i2 == 60 && i3 == 1) {
                dqpVar.s(16);
                if (dqpVar.i(2) <= 1) {
                    dqpVar.i(27);
                    if (dqpVar.i(1) <= 0) {
                        abcwVar.f = 0;
                        for (int i4 = 0; i4 < 3; i4++) {
                            abcwVar.f = Math.max(dqpVar.i(17), abcwVar.f);
                        }
                        dqpVar.s(17);
                        abcwVar.g = 0;
                        int i5 = dqpVar.i(4);
                        while (i5 > 0) {
                            int i6 = dqpVar.i(7);
                            int i7 = dqpVar.i(17);
                            i5--;
                            if (i6 >= 75) {
                                abcwVar.g = Math.max(abcwVar.g, i7);
                            }
                        }
                        dqpVar.i(10);
                        if (dqpVar.i(1) <= 0) {
                            if (dqpVar.i(1) > 0) {
                                abcwVar.b = dqpVar.i(12);
                                abcwVar.c = dqpVar.i(12);
                                abcwVar.d = dqpVar.i(4);
                                for (int i8 = 0; i8 < abcwVar.d; i8++) {
                                    abcwVar.e[i8] = dqpVar.i(10);
                                }
                            }
                            if (dqpVar.i(1) > 0) {
                                dqpVar.i(6);
                            }
                            abcwVar.a = true;
                            if (abcxVar.e == 0) {
                                abcxVar.e(null);
                                return;
                            }
                            g(abcxVar.s, abcxVar.t);
                            abcxVar.w.b(abcxVar.s);
                            abcxVar.f(ByteBuffer.wrap(abcxVar.w.c()), 2, abcxVar.c);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void d(abcc abccVar, int i, abcr abcrVar, boolean z) {
        if (z || this.k) {
            this.e = 0;
            if (i == 3 || (abcrVar != null && abcrVar.c() != null)) {
                e(abcrVar);
            }
            GLES20.glUniform1f(this.d, this.e);
            this.k = false;
        }
        c(abccVar);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:33:0x00ae, B:35:0x00b3, B:39:0x00c6, B:43:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:52:0x0102, B:56:0x0117, B:61:0x0134, B:63:0x0182, B:65:0x018f, B:57:0x011f, B:58:0x0124, B:59:0x0125, B:60:0x012d, B:51:0x00f9, B:44:0x00da, B:45:0x00e2, B:36:0x00bb, B:38:0x00bf), top: B:69:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9 A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:33:0x00ae, B:35:0x00b3, B:39:0x00c6, B:43:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:52:0x0102, B:56:0x0117, B:61:0x0134, B:63:0x0182, B:65:0x018f, B:57:0x011f, B:58:0x0124, B:59:0x0125, B:60:0x012d, B:51:0x00f9, B:44:0x00da, B:45:0x00e2, B:36:0x00bb, B:38:0x00bf), top: B:69:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0117 A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:33:0x00ae, B:35:0x00b3, B:39:0x00c6, B:43:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:52:0x0102, B:56:0x0117, B:61:0x0134, B:63:0x0182, B:65:0x018f, B:57:0x011f, B:58:0x0124, B:59:0x0125, B:60:0x012d, B:51:0x00f9, B:44:0x00da, B:45:0x00e2, B:36:0x00bb, B:38:0x00bf), top: B:69:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011f A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:33:0x00ae, B:35:0x00b3, B:39:0x00c6, B:43:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:52:0x0102, B:56:0x0117, B:61:0x0134, B:63:0x0182, B:65:0x018f, B:57:0x011f, B:58:0x0124, B:59:0x0125, B:60:0x012d, B:51:0x00f9, B:44:0x00da, B:45:0x00e2, B:36:0x00bb, B:38:0x00bf), top: B:69:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0125 A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:33:0x00ae, B:35:0x00b3, B:39:0x00c6, B:43:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:52:0x0102, B:56:0x0117, B:61:0x0134, B:63:0x0182, B:65:0x018f, B:57:0x011f, B:58:0x0124, B:59:0x0125, B:60:0x012d, B:51:0x00f9, B:44:0x00da, B:45:0x00e2, B:36:0x00bb, B:38:0x00bf), top: B:69:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012d A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:33:0x00ae, B:35:0x00b3, B:39:0x00c6, B:43:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:52:0x0102, B:56:0x0117, B:61:0x0134, B:63:0x0182, B:65:0x018f, B:57:0x011f, B:58:0x0124, B:59:0x0125, B:60:0x012d, B:51:0x00f9, B:44:0x00da, B:45:0x00e2, B:36:0x00bb, B:38:0x00bf), top: B:69:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0182 A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:33:0x00ae, B:35:0x00b3, B:39:0x00c6, B:43:0x00d4, B:46:0x00e7, B:47:0x00e9, B:49:0x00ed, B:52:0x0102, B:56:0x0117, B:61:0x0134, B:63:0x0182, B:65:0x018f, B:57:0x011f, B:58:0x0124, B:59:0x0125, B:60:0x012d, B:51:0x00f9, B:44:0x00da, B:45:0x00e2, B:36:0x00bb, B:38:0x00bf), top: B:69:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:64:0x018d  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [abch, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [abch, java.lang.Object] */
    final void e(abcr abcrVar) {
        abcg abcgVar;
        int i;
        int iOrdinal;
        abcf abcfVar;
        final double dB;
        if (this.w == null) {
            this.w = new acht();
            this.s = new abcl();
        }
        abcl abclVar = this.s;
        yib yibVar = yib.a;
        abclVar.b = yibVar;
        abclVar.f = 500.0f;
        abclVar.c = 6;
        abclVar.d = 1000.0f;
        abclVar.e = 0.0f;
        abclVar.h = yia.b;
        yib yibVar2 = yib.c;
        abclVar.g = yibVar2;
        abclVar.i = 0.75f;
        abclVar.j = 0.75f;
        abclVar.k = 0;
        abclVar.f = this.o;
        if (abcrVar != null) {
            if (abcrVar.a() != -1) {
                abclVar.c = abcrVar.a();
            }
            if (abcrVar.b() != -1) {
                int iB = abcrVar.b();
                if (iB == 6) {
                    yibVar2 = yibVar;
                } else if (iB == 7) {
                    yibVar2 = yib.b;
                }
                abclVar.b = yibVar2;
            }
            byte[] bArrC = abcrVar.c();
            if (bArrC != null && bArrC.length >= 25) {
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrC, 17, 8).order(ByteOrder.LITTLE_ENDIAN);
                short s = byteBufferOrder.getShort();
                byteBufferOrder.getShort();
                short s2 = byteBufferOrder.getShort();
                abcl abclVar2 = this.s;
                abclVar2.d = s2 > 0 ? s2 : s;
                abclVar = abclVar2;
            }
        } else {
            abclVar.b = this.p;
        }
        abclVar.h = this.m;
        abclVar.g = this.n;
        abcw abcwVar = this.t;
        if (abcwVar.a) {
            g(abclVar, abcwVar);
        }
        abcl abclVar3 = this.s;
        int i2 = abclVar3.c;
        yib yibVar3 = abclVar3.b;
        float f = abclVar3.e;
        float f2 = abclVar3.d;
        try {
            final acht achtVar = this.w;
            if (yibVar3 == yibVar) {
                achtVar.d = new abcg(3);
            } else if (yibVar3 != yib.b) {
                return;
            } else {
                achtVar.d = new abcg(0);
            }
            int iOrdinal2 = abclVar3.g.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 2) {
                    achtVar.f = new abcg(1);
                } else if (iOrdinal2 != 3) {
                    return;
                } else {
                    abcgVar = new abcg(2);
                }
                i = abclVar3.c;
                if (i == 6) {
                    achtVar.h = new abcf(abcf.a);
                } else if (i == 1) {
                    return;
                } else {
                    achtVar.h = new abcf(abcf.b);
                }
                achtVar.b = ((abcf) achtVar.h).d;
                iOrdinal = abclVar3.h.ordinal();
                if (iOrdinal != 0) {
                    abcfVar = new abcf(abcf.a);
                } else if (iOrdinal != 1) {
                    abcfVar = new abcf(abcf.c);
                } else {
                    if (iOrdinal == 2) {
                        throw new RuntimeException(null, null);
                    }
                    abcfVar = new abcf(abcf.b);
                }
                achtVar.k = abcfVar;
                achtVar.a = ((abcf) achtVar.k).e;
                achtVar.i = new grj((short[]) null);
                grj.A((grj) achtVar.a, (grj) achtVar.b, (grj) achtVar.i);
                achtVar.e = new Range(Double.valueOf(0.0d), Double.valueOf(10000.0d));
                int i3 = abclVar3.a;
                achtVar.c = new grj(SemanticState.Hidden, new abcm() { // from class: abcj
                    /* JADX WARN: Type inference failed for: r1v0, types: [abch, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v2, types: [abch, java.lang.Object] */
                    @Override // defpackage.abcm
                    public final double a(int i4, double d) {
                        acht achtVar2 = achtVar;
                        return ((Double) ((Range) achtVar2.e).clamp(Double.valueOf(achtVar2.d.c(((double) i4) / d) * achtVar2.d.b()))).doubleValue() / 10000.0d;
                    }
                });
                if (achtVar.f.d()) {
                    dB = ((double) abclVar3.f) / achtVar.f.b();
                } else {
                    dB = 1.0d;
                }
                achtVar.j = new grj(SemanticState.ReadOnly, new abcm() { // from class: abck
                    /* JADX WARN: Type inference failed for: r0v1, types: [abch, java.lang.Object] */
                    @Override // defpackage.abcm
                    public final double a(int i4, double d) {
                        return Math.min(1.0d, achtVar.f.a((((double) i4) / d) * dB));
                    }
                });
                achtVar.b(abclVar3);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) ((grj) this.w.c).a);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap((byte[]) ((grj) this.w.j).a);
                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(this.w.c());
                acht achtVar2 = this.w;
                Object obj = ((grj) achtVar2.i).a;
                Object obj2 = ((grj) achtVar2.b).a;
                int iCapacity = byteBufferWrap.capacity() / 2;
                this.e = iCapacity;
                GLES20.glUniform1f(this.d, iCapacity);
                f(byteBufferWrap, 0, this.a);
                f(byteBufferWrap3, 2, this.c);
                f(byteBufferWrap2, 1, this.b);
                GLES20.glUniformMatrix3fv(this.q, 1, true, (float[]) obj, 0);
                GLES20.glUniform3fv(this.r, 1, (float[]) obj2, 3);
            }
            abcgVar = new abcg(3);
            achtVar.f = abcgVar;
            i = abclVar3.c;
            if (i == 6) {
                achtVar.h = new abcf(abcf.a);
            } else if (i == 1) {
                return;
            } else {
                achtVar.h = new abcf(abcf.b);
            }
            achtVar.b = ((abcf) achtVar.h).d;
            iOrdinal = abclVar3.h.ordinal();
            if (iOrdinal != 0) {
                abcfVar = new abcf(abcf.a);
            } else if (iOrdinal != 1) {
                abcfVar = new abcf(abcf.c);
            } else {
                if (iOrdinal == 2) {
                    throw new RuntimeException(null, null);
                }
                abcfVar = new abcf(abcf.b);
            }
            achtVar.k = abcfVar;
            achtVar.a = ((abcf) achtVar.k).e;
            achtVar.i = new grj((short[]) null);
            grj.A((grj) achtVar.a, (grj) achtVar.b, (grj) achtVar.i);
            achtVar.e = new Range(Double.valueOf(0.0d), Double.valueOf(10000.0d));
            int i4 = abclVar3.a;
            achtVar.c = new grj(SemanticState.Hidden, new abcm() { // from class: abcj
                /* JADX WARN: Type inference failed for: r1v0, types: [abch, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v2, types: [abch, java.lang.Object] */
                @Override // defpackage.abcm
                public final double a(int i5, double d) {
                    acht achtVar3 = achtVar;
                    return ((Double) ((Range) achtVar3.e).clamp(Double.valueOf(achtVar3.d.c(((double) i5) / d) * achtVar3.d.b()))).doubleValue() / 10000.0d;
                }
            });
            if (achtVar.f.d()) {
                dB = ((double) abclVar3.f) / achtVar.f.b();
            } else {
                dB = 1.0d;
            }
            achtVar.j = new grj(SemanticState.ReadOnly, new abcm() { // from class: abck
                /* JADX WARN: Type inference failed for: r0v1, types: [abch, java.lang.Object] */
                @Override // defpackage.abcm
                public final double a(int i5, double d) {
                    return Math.min(1.0d, achtVar.f.a((((double) i5) / d) * dB));
                }
            });
            achtVar.b(abclVar3);
            ByteBuffer byteBufferWrap4 = ByteBuffer.wrap((byte[]) ((grj) this.w.c).a);
            ByteBuffer byteBufferWrap5 = ByteBuffer.wrap((byte[]) ((grj) this.w.j).a);
            ByteBuffer byteBufferWrap6 = ByteBuffer.wrap(this.w.c());
            acht achtVar3 = this.w;
            Object obj3 = ((grj) achtVar3.i).a;
            Object obj4 = ((grj) achtVar3.b).a;
            int iCapacity2 = byteBufferWrap4.capacity() / 2;
            this.e = iCapacity2;
            GLES20.glUniform1f(this.d, iCapacity2);
            f(byteBufferWrap4, 0, this.a);
            f(byteBufferWrap6, 2, this.c);
            f(byteBufferWrap5, 1, this.b);
            GLES20.glUniformMatrix3fv(this.q, 1, true, (float[]) obj3, 0);
            GLES20.glUniform3fv(this.r, 1, (float[]) obj4, 3);
        } catch (Exception unused) {
        }
    }
}
