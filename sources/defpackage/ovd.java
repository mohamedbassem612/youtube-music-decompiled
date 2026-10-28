package defpackage;

import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ovd {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final float j;

    public ovd(boolean z, int i, int i2, boolean z2, boolean z3, int i3, boolean z4, int i4, boolean z5, float f) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = i3;
        this.g = z4;
        this.h = i4;
        this.i = z5;
        this.j = f;
    }

    public static ovd a(mew mewVar) {
        boolean z;
        boolean z2;
        long j = mewVar.c;
        long j2 = 10 + j;
        byte bPeekByte = Memory.peekByte(14 + j);
        boolean z3 = false;
        int iPeekInt = Memory.peekInt(96 + j, false);
        int iPeekInt2 = Memory.peekInt(100 + j, false);
        byte bPeekByte2 = Memory.peekByte(15 + j);
        byte bPeekByte3 = Memory.peekByte(16 + j);
        int iPeekInt3 = Memory.peekInt(104 + j, false);
        int iPeekByte = Memory.peekByte(j2) & 64;
        int iPeekInt4 = Memory.peekInt(108 + j, false);
        int iPeekByte2 = Memory.peekByte(j2) & 128;
        float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j + 44, false));
        boolean z4 = iPeekByte2 != 0;
        boolean z5 = iPeekByte != 0;
        if (bPeekByte3 != 0) {
            z = true;
            z2 = true;
        } else {
            z = true;
            z2 = false;
        }
        if (bPeekByte2 != 0) {
            z3 = z;
        }
        if (bPeekByte == 0) {
            z = false;
        }
        return new ovd(z, iPeekInt, iPeekInt2, z3, z2, iPeekInt3, z5, iPeekInt4, z4, fIntBitsToFloat);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ovd) {
            ovd ovdVar = (ovd) obj;
            if (this.a == ovdVar.a && this.b == ovdVar.b && this.c == ovdVar.c && this.d == ovdVar.d && this.e == ovdVar.e && this.f == ovdVar.f && this.g == ovdVar.g && this.h == ovdVar.h && this.i == ovdVar.i) {
                if (Float.floatToIntBits(this.j) == Float.floatToIntBits(ovdVar.j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int i2 = this.b;
        int i3 = this.c;
        return ((((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h) * 1000003) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.j);
    }

    public final String toString() {
        return "ResolvedRippleProperties{isRippleEnabled=" + this.a + ", getRippleColor=" + this.b + ", getRippleRadius=" + this.c + ", isRippleClipToView=" + this.d + ", isTouchFeedbackEnabled=" + this.e + ", getTouchFeedbackColor=" + this.f + ", hasTouchFeedbackColor=" + this.g + ", getTouchFeedbackBorderRadius=" + this.h + ", hasTouchFeedbackBorderRadius=" + this.i + ", getBorderRadius=" + this.j + '}';
    }

    public ovd() {
        throw null;
    }
}
