package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nga extends mew implements mwx {
    static final mfc d = nfz.a.d(1);
    static final mfc e = nfz.a.d(2);
    volatile String f;
    volatile String g;
    volatile nlu h;

    @Override // defpackage.mwx
    public final /* synthetic */ ncf g() {
        if (this.h != null) {
            return this.h;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(16 + j);
        byte bPeekByte2 = Memory.peekByte(j + 17);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 3) {
            return null;
        }
        nlu nluVar = new nlu(cp(true != a ? 20 : 24, nlt.a));
        this.h = nluVar;
        return nluVar;
    }

    @Override // defpackage.mwx
    public final String h() {
        if (this.f == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(16 + j);
            byte bPeekByte2 = Memory.peekByte(j + 17);
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

    @Override // defpackage.mwx
    public final String i() {
        if (this.g == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(16 + j);
            byte bPeekByte2 = Memory.peekByte(j + 17);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 2) {
                this.g = cq(e.b);
            }
        }
        return this.g;
    }

    @Override // defpackage.mwx
    public final boolean j() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(16 + j);
        byte bPeekByte2 = Memory.peekByte(j + 17);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 1;
    }

    @Override // defpackage.mwx
    public final boolean k() {
        if (this.h != null) {
            return true;
        }
        long j = this.c;
        byte bPeekByte = Memory.peekByte(16 + j);
        byte bPeekByte2 = Memory.peekByte(j + 17);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 3;
    }

    @Override // defpackage.mwx
    public final boolean l() {
        long j = this.c;
        byte bPeekByte = Memory.peekByte(16 + j);
        byte bPeekByte2 = Memory.peekByte(j + 17);
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
