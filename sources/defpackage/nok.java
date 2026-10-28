package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nok extends mew implements ney {
    volatile nnr d;
    volatile mew e;

    @Override // defpackage.ney
    public final float g() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(8 + j);
        byte bPeekByte2 = Memory.peekByte(j + 9);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) == 1) {
            return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 12L : 16L), false));
        }
        return 0.0f;
    }

    @Override // defpackage.ney
    public final /* synthetic */ ndq h() {
        if (this.e != null) {
            return this.e;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(8 + j);
        byte bPeekByte2 = Memory.peekByte(j + 9);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 2) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 16, nmy.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.ney
    public final /* synthetic */ neh i() {
        if (this.d != null) {
            return this.d;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(8 + j);
        byte bPeekByte2 = Memory.peekByte(j + 9);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 3) {
            return null;
        }
        nnr nnrVar = new nnr(cp(true != a ? 12 : 16, nnq.a));
        this.d = nnrVar;
        return nnrVar;
    }

    @Override // defpackage.ney
    public final boolean j() {
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

    @Override // defpackage.ney
    public final boolean k() {
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

    @Override // defpackage.ney
    public final boolean l() {
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
        return ((short) ((b << 8) | (bPeekByte & 255))) == 3;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
