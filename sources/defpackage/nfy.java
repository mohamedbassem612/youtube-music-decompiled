package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nfy extends mew implements mww {
    volatile nga d;
    volatile nga e;
    volatile mew f;
    volatile mew g;
    volatile mew h;
    volatile mew i;
    volatile mew j;
    volatile mew k;

    public nfy() {
        super(nfx.a);
    }

    @Override // defpackage.mww
    public final boolean A() {
        if (this.h != null) {
            return true;
        }
        long j = this.c + ((long) (true != a ? 72 : 40));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 10;
    }

    @Override // defpackage.mww
    public final boolean B() {
        if (this.f != null) {
            return true;
        }
        long j = this.c + ((long) (true != a ? 64 : 36));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 8;
    }

    @Override // defpackage.mww
    public final int C() {
        int iAV = a.aV(Memory.peekInt(this.c + (true != a ? 32L : 28L), false));
        if (iAV != 0) {
            return iAV;
        }
        return 1;
    }

    @Override // defpackage.mww
    public final int D() {
        int iBc = a.bc(Memory.peekInt(this.c + (true != a ? 36L : 32L), false));
        if (iBc != 0) {
            return iBc;
        }
        return 1;
    }

    @Override // defpackage.mww
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 20L : 16L), false));
    }

    @Override // defpackage.mww
    public final float h() {
        if ((Memory.peekByte(this.c + 8) & 8) != 0) {
            return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 24L : 20L), false));
        }
        return 1.0f;
    }

    @Override // defpackage.mww
    public final /* synthetic */ mwq i() {
        if (this.g != null) {
            return this.g;
        }
        boolean z = a;
        long j = this.c + ((long) (true != z ? 64 : 36));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 9) {
            return null;
        }
        mew mewVar = new mew(cp(true != z ? 68 : 104, nfu.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ mwr j() {
        if (this.f != null) {
            return this.f;
        }
        boolean z = a;
        long j = this.c + ((long) (true != z ? 64 : 36));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 8) {
            return null;
        }
        mew mewVar = new mew(cp(true != z ? 68 : 104, nfv.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ mwx k() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 9) & 32) == 0) {
            return null;
        }
        nga ngaVar = new nga(cp(true != a ? 56 : 88, nfz.a));
        this.e = ngaVar;
        return ngaVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ mwx l() {
        if (this.d != null) {
            return this.d;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        nga ngaVar = new nga(cp(true != a ? 16 : 48, nfz.a));
        this.d = ngaVar;
        return ngaVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ mzg m() {
        if (this.i != null) {
            return this.i;
        }
        boolean z = a;
        long j = this.c + ((long) (true != z ? 72 : 40));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 11) {
            return null;
        }
        mew mewVar = new mew(cp(true != z ? 76 : 112, nij.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ mzg n() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 9) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 48 : 72, nij.a));
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ mzg o() {
        if (this.k != null) {
            return this.k;
        }
        if ((Memory.peekByte(this.c + 9) & 16) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 52 : 80, nij.a));
        this.k = mewVar;
        return mewVar;
    }

    @Override // defpackage.mww
    public final /* synthetic */ mzg p() {
        if (this.h != null) {
            return this.h;
        }
        boolean z = a;
        long j = this.c + ((long) (true != z ? 72 : 40));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 10) {
            return null;
        }
        mew mewVar = new mew(cp(true != z ? 76 : 112, nij.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.mww
    public final boolean q() {
        return Memory.peekByte(this.c + 12) != 0;
    }

    @Override // defpackage.mww
    public final boolean r() {
        return Memory.peekByte(this.c + 11) != 0;
    }

    @Override // defpackage.mww
    public final boolean s() {
        return Memory.peekByte(this.c + 10) != 0;
    }

    @Override // defpackage.mww
    public final boolean t() {
        return (this.e == null && (Memory.peekByte(this.c + 9) & 32) == 0) ? false : true;
    }

    @Override // defpackage.mww
    public final boolean u() {
        return (this.d == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mww
    public final boolean v() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    @Override // defpackage.mww
    public final boolean w() {
        if (this.g != null) {
            return true;
        }
        long j = this.c + ((long) (true != a ? 64 : 36));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 9;
    }

    @Override // defpackage.mww
    public final boolean x() {
        if (this.i != null) {
            return true;
        }
        long j = this.c + ((long) (true != a ? 72 : 40));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 11;
    }

    @Override // defpackage.mww
    public final boolean y() {
        return (this.j == null && (Memory.peekByte(this.c + 9) & 8) == 0) ? false : true;
    }

    @Override // defpackage.mww
    public final boolean z() {
        return (this.k == null && (Memory.peekByte(this.c + 9) & 16) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
