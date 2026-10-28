package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asxo extends mew implements mes {
    volatile asxu d;
    volatile asxx e;
    volatile asxr f;

    public asxo() {
        super(asxn.a);
    }

    public final boolean aR() {
        if (this.f != null) {
            return true;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(8 + j);
        byte bPeekByte2 = Memory.peekByte(j + 9);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 3;
    }

    public final boolean aS() {
        if (this.d != null) {
            return true;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(8 + j);
        byte bPeekByte2 = Memory.peekByte(j + 9);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 1;
    }

    public final boolean aT() {
        if (this.e != null) {
            return true;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(8 + j);
        byte bPeekByte2 = Memory.peekByte(j + 9);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 2;
    }

    public final asxr aU() {
        if (this.f == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(8 + j);
            byte bPeekByte2 = Memory.peekByte(j + 9);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 3) {
                this.f = new asxr(cp(true != a ? 12 : 16, asxq.a));
            }
        }
        return this.f == null ? asxp.a : this.f;
    }

    public final asxu aV() {
        if (this.d == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(8 + j);
            byte bPeekByte2 = Memory.peekByte(j + 9);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 1) {
                this.d = new asxu(cp(true != a ? 12 : 16, asxt.a));
            }
        }
        return this.d == null ? asxs.a : this.d;
    }

    public final asxx aW() {
        if (this.e == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(8 + j);
            byte bPeekByte2 = Memory.peekByte(j + 9);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 2) {
                this.e = new asxx(cp(true != a ? 12 : 16, asxw.a));
            }
        }
        return this.e == null ? asxv.a : this.e;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
