package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alf {
    public static final float a(long j) {
        if ((63 & j) == 0) {
            return 1.0f;
        }
        return ((float) (((j >>> 6) & 1023) + 0.0d)) / 1023.0f;
    }

    public static final float b(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) (((j >>> 32) & 255) + 0.0d)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        char c = (char) s;
        int i3 = c & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - alg.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i5 << 16) | (i2 << 23) | i);
    }

    public static final float c(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) (((j >>> 40) & 255) + 0.0d)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        char c = (char) s;
        int i3 = c & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - alg.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i5 << 16) | (i2 << 23) | i);
    }

    public static final float d(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) ((j3 & 255) + 0.0d)) / 255.0f;
        }
        short s = (short) j3;
        char c = (char) s;
        int i3 = c & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i3 + 1056964608) - alg.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i5 << 16) | (i2 << 23) | i);
    }

    public static final long e(long j, alo aloVar) {
        alt altVarI;
        float[] fArr = alq.a;
        alo aloVar2 = alq.l[(int) (63 & j)];
        int i = aloVar2.c;
        int i2 = aloVar.c;
        if ((i | i2) < 0) {
            altVarI = ace.i(aloVar2, aloVar);
        } else {
            int i3 = i | (i2 << 6);
            aga agaVar = alu.a;
            Object objA = agaVar.a(i3);
            if (objA == null) {
                objA = ace.i(aloVar2, aloVar);
                agaVar.h(i3, objA);
            }
            altVarI = (alt) objA;
        }
        return altVarI.a(j);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
