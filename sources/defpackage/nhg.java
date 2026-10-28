package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhg extends mew implements mxy {
    static final mfc d = nhf.a.d(3);
    static final mfc e = nhf.a.d(14);
    volatile String f;
    volatile String g;
    volatile ngo h;
    volatile mew i;
    volatile mew j;

    static {
        nhf.a.d(23);
        nhf.a.d(24);
    }

    public nhg() {
        super(nhf.a);
    }

    @Override // defpackage.mxy
    public final boolean A() {
        return (Memory.peekByte(this.c + 9) & 1) != 0;
    }

    @Override // defpackage.mxy
    public final boolean B() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.mxy
    public final int C() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 56L : 52L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.mxy
    public final int D() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 44L : 40L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.mxy
    public final int E() {
        int iBc = a.bc(Memory.peekInt(this.c + (true != a ? 40L : 36L), false));
        if (iBc != 0) {
            return iBc;
        }
        return 1;
    }

    @Override // defpackage.mxy
    public final int F() {
        int iBc = a.bc(Memory.peekInt(this.c + 28, false));
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    @Override // defpackage.mew, defpackage.mxk
    public final int aO() {
        int iBi = a.bi(Memory.peekInt(this.c + (true != a ? 80L : 60L), false));
        if (iBi != 0) {
            return iBi;
        }
        return 1;
    }

    @Override // defpackage.mew, defpackage.mxk
    public final boolean ck() {
        long j = this.c + ((long) (true != a ? 76 : 56));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 7;
    }

    @Override // defpackage.mew, defpackage.mxk
    public final boolean cl() {
        long j = this.c + ((long) (true != a ? 76 : 56));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 8;
    }

    @Override // defpackage.mxy
    @Deprecated
    public final float g() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 52L : 48L), false));
    }

    @Override // defpackage.mxy
    public final float h() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + 20, false));
    }

    @Override // defpackage.mxy
    public final float i() {
        return Float.intBitsToFloat(Memory.peekInt(this.c + (true != a ? 36L : 32L), false));
    }

    @Override // defpackage.mxy
    @Deprecated
    public final int j() {
        return Memory.peekInt(this.c + (true != a ? 48L : 44L), false);
    }

    @Override // defpackage.mxy
    public final int k() {
        return Memory.peekInt(this.c + 24, false);
    }

    @Override // defpackage.mxy
    public final int l() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.mxy
    public final int m() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.mxy
    public final int n() {
        boolean z = a;
        long j = this.c + ((long) (true != z ? 76 : 56));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) == 7) {
            return Memory.peekInt(this.c + (true != z ? 80L : 60L), false);
        }
        return 0;
    }

    @Override // defpackage.mxy
    public final /* synthetic */ mxg o() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 10) & 1) == 0) {
            return null;
        }
        ngo ngoVar = new ngo(cp(true != a ? 64 : SemanticState.Focused, ngn.a));
        this.h = ngoVar;
        return ngoVar;
    }

    @Override // defpackage.mxy
    public final /* synthetic */ mxk p() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 10) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 68 : 136, ngu.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.mxy
    public final /* synthetic */ mxz q() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 32 : 112, nhe.a));
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.mxy
    public final String r() {
        if (this.g == null && (Memory.peekByte(this.c + 9) & 8) != 0) {
            this.g = cq(e.b);
        }
        return this.g;
    }

    @Override // defpackage.mxy
    public final String s() {
        if (this.f == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.f = cq(d.b);
        }
        return this.f;
    }

    @Override // defpackage.mxy
    public final boolean t() {
        return Memory.peekByte(this.c + 11) != 0;
    }

    @Override // defpackage.mxy
    public final boolean u() {
        return (this.h == null && (Memory.peekByte(this.c + 10) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mxy
    public final boolean v() {
        return (this.i == null && (Memory.peekByte(this.c + 10) & 2) == 0) ? false : true;
    }

    @Override // defpackage.mxy
    public final boolean w() {
        return (Memory.peekByte(this.c + 8) & 16) != 0;
    }

    @Override // defpackage.mxy
    public final boolean x() {
        return (Memory.peekByte(this.c + 9) & 8) != 0;
    }

    @Override // defpackage.mxy
    public final boolean y() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    @Override // defpackage.mxy
    public final boolean z() {
        return (Memory.peekByte(this.c + 8) & 2) != 0;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
