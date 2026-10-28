package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ngo extends mew implements mxg {
    volatile ngs d;
    volatile ngq e;
    volatile mew f;

    @Override // defpackage.mxg
    public final /* synthetic */ mxh g() {
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
        if (((short) ((b << 8) | (bPeekByte & 255))) != 3) {
            return null;
        }
        ngq ngqVar = new ngq(cp(true != a ? 12 : 16, ngp.a));
        this.e = ngqVar;
        return ngqVar;
    }

    @Override // defpackage.mxg
    public final /* synthetic */ mxi h() {
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
        if (((short) ((b << 8) | (bPeekByte & 255))) != 1) {
            return null;
        }
        ngs ngsVar = new ngs(cp(true != a ? 12 : 16, ngr.a));
        this.d = ngsVar;
        return ngsVar;
    }

    @Override // defpackage.mxg
    public final /* synthetic */ mxj i() {
        if (this.f != null) {
            return this.f;
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
        mew mewVar = new mew(cp(true != a ? 12 : 16, ngt.a));
        this.f = mewVar;
        return mewVar;
    }

    @Override // defpackage.mxg
    public final boolean j() {
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
        return ((short) ((b << 8) | (bPeekByte & 255))) == 3;
    }

    @Override // defpackage.mxg
    public final boolean k() {
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

    @Override // defpackage.mxg
    public final boolean l() {
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
        return ((short) ((b << 8) | (bPeekByte & 255))) == 2;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
