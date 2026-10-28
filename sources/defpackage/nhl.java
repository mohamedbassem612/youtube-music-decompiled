package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhl extends mew implements myh {
    volatile nhp d;
    volatile mew e;
    volatile mew f;
    volatile mew g;

    public nhl() {
        super(nhk.a);
    }

    @Override // defpackage.myh
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.myh
    public final float h() {
        boolean z = a;
        long j = this.c + ((long) (true != z ? 44 : 24));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) == 3) {
            return Float.intBitsToFloat(Memory.peekInt(this.c + (true != z ? 48L : 28L), false));
        }
        return 0.0f;
    }

    @Override // defpackage.myh
    public final int i() {
        return Memory.peekInt(this.c + (true != a ? 32L : 20L), false);
    }

    @Override // defpackage.myh
    public final int j() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.myh
    public final /* synthetic */ mye k() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 64) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 36 : 56, nhi.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.myh
    public final /* synthetic */ myj l() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        nhp nhpVar = new nhp(cp(true != a ? 20 : 32, nho.a));
        this.d = nhpVar;
        return nhpVar;
    }

    @Override // defpackage.myh
    public final /* synthetic */ myk m() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 24 : 40, nhr.a));
        this.e = mewVar;
        return mewVar;
    }

    @Override // defpackage.myh
    public final /* synthetic */ nei n() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 8) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 28 : 48, nns.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.myh
    public final boolean o() {
        boolean z = a;
        long j = this.c + ((long) (true != z ? 44 : 24));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) == 4) {
            if (Memory.peekByte(this.c + ((long) (true != z ? 48 : 28))) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.myh
    public final boolean p() {
        return (Memory.peekByte(this.c + 8) & 32) != 0;
    }

    @Override // defpackage.myh
    public final boolean q() {
        long j = this.c + ((long) (true != a ? 44 : 24));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 3;
    }

    @Override // defpackage.myh
    public final boolean r() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    @Override // defpackage.myh
    public final boolean s() {
        return (this.f == null && (Memory.peekByte(this.c + 8) & 16) == 0) ? false : true;
    }

    @Override // defpackage.myh
    public final boolean t() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 8) == 0) ? false : true;
    }

    @Override // defpackage.myh
    public final boolean u() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
