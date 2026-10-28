package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fik implements fil {
    public static final int a = 9;
    public float[] b;
    private long c = -1;
    private boolean d;

    @Override // defpackage.fil
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        fik fikVar = (fik) obj;
        if (this != fikVar) {
            return fikVar != null && this.c == fikVar.c && this.d == fikVar.d && Arrays.equals(this.b, fikVar.b);
        }
        return true;
    }

    public final byte b(int i) {
        return (byte) ((this.c >> (i << 2)) & 15);
    }

    public final float c(int i) {
        byte b = b(i);
        if (b == 15) {
            return Float.NaN;
        }
        return this.b[b];
    }

    public final float d(int i) {
        if (this.c != -1) {
            byte b = b(i - 1);
            if (b != 15) {
                return this.b[b];
            }
            if (this.d) {
                int i2 = 7;
                if (i != 2 && i != 4) {
                    i2 = 6;
                }
                byte b2 = b(i2);
                if (b2 != 15) {
                    return this.b[b2];
                }
                if (b(8) != 15) {
                    return this.b[b(8)];
                }
            }
        }
        return 0.0f;
    }

    public final void e(int i, float f) {
        byte b;
        int i2 = i - 1;
        float fC = c(i2);
        if (Float.isNaN(fC) || Float.isNaN(f)) {
            if (Float.isNaN(fC) && Float.isNaN(f)) {
                return;
            }
        } else if (Math.abs(f - fC) < 1.0E-5f) {
            return;
        }
        byte b2 = b(i2);
        if (kro.bg(f)) {
            this.c |= 15 << (i2 << 2);
            this.b[b2] = Float.NaN;
        } else {
            float[] fArr = this.b;
            if (b2 == 15) {
                if (fArr != null) {
                    int i3 = 0;
                    while (true) {
                        float[] fArr2 = this.b;
                        int length = fArr2.length;
                        if (i3 >= length) {
                            float[] fArr3 = new float[Math.min(length << 1, 9)];
                            this.b = fArr3;
                            System.arraycopy(fArr2, 0, fArr3, 0, length);
                            float[] fArr4 = this.b;
                            Arrays.fill(fArr4, length, fArr4.length, Float.NaN);
                            b = (byte) length;
                            break;
                        }
                        if (kro.bg(fArr2[i3])) {
                            b = (byte) i3;
                            break;
                        }
                        i3++;
                    }
                } else {
                    this.b = new float[]{Float.NaN, Float.NaN};
                    b = 0;
                }
                if (b >= 9) {
                    throw new IllegalStateException("The newIndex for the array cannot be bigger than the amount of Yoga Edges.");
                }
                int i4 = i2 << 2;
                this.c = (this.c & (~(15 << i4))) | (((long) b) << i4);
                this.b[b] = f;
            } else {
                fArr[b2] = f;
            }
        }
        this.d = ((~((int) (this.c >> 24))) & 4095) != 0;
    }
}
