package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import java.nio.ByteBuffer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nma extends mew implements ncl {
    static final mfc d = nlz.a.d(1);
    static final mfc e = nlz.a.d(2);
    volatile String f;
    volatile ByteBuffer g;
    volatile nlu h;
    volatile mew i;

    public nma() {
        super(nlz.a);
    }

    @Override // defpackage.ncl
    public final int g() {
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.ncl
    public final int h() {
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.ncl
    public final /* synthetic */ ncf i() {
        if (this.h != null) {
            return this.h;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(20 + j);
        byte bPeekByte2 = Memory.peekByte(j + 21);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 3) {
            return null;
        }
        nlu nluVar = new nlu(cp(24, nlt.a));
        this.h = nluVar;
        return nluVar;
    }

    @Override // defpackage.ncl
    public final /* synthetic */ nch j() {
        if (this.i != null) {
            return this.i;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(20 + j);
        byte bPeekByte2 = Memory.peekByte(j + 21);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 6) {
            return null;
        }
        mew mewVar = new mew(cp(24, nlv.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.ncl
    public final String k() {
        if (this.f == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(20 + j);
            byte bPeekByte2 = Memory.peekByte(j + 21);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 1) {
                this.f = cq(d.b);
            }
        }
        return this.f;
    }

    @Override // defpackage.ncl
    public final ByteBuffer l() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(j + 20);
        byte bPeekByte2 = Memory.peekByte(j + 21);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 2) {
            return null;
        }
        if (this.g == null) {
            long j2 = this.c;
            byte bPeekByte3 = Memory.peekByte(20 + j2);
            byte bPeekByte4 = Memory.peekByte(j2 + 21);
            byte b2 = true != z ? bPeekByte4 : bPeekByte3;
            if (true == z) {
                bPeekByte3 = bPeekByte4;
            }
            if (((short) ((b2 << 8) | (bPeekByte3 & 255))) == 2) {
                this.g = cr(e.b);
            } else {
                this.g = ByteBuffer.allocate(0);
            }
        }
        return this.g.asReadOnlyBuffer();
    }

    @Override // defpackage.ncl
    public final boolean m() {
        if (this.h != null) {
            return true;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(20 + j);
        byte bPeekByte2 = Memory.peekByte(j + 21);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 3;
    }

    @Override // defpackage.ncl
    public final boolean n() {
        if (this.i != null) {
            return true;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(20 + j);
        byte bPeekByte2 = Memory.peekByte(j + 21);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 6;
    }

    @Override // defpackage.ncl
    public final boolean o() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(20 + j);
        byte bPeekByte2 = Memory.peekByte(j + 21);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 2;
    }

    @Override // defpackage.ncl
    public final boolean p() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(20 + j);
        byte bPeekByte2 = Memory.peekByte(j + 21);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 1;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
