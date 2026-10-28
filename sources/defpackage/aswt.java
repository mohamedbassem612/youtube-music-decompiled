package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aswt extends mew implements mes {
    static final mfc d = asws.a.d(1);
    public static final mfc e = asws.a.d(2);
    volatile String f;
    public volatile String g;
    public volatile atii h;

    public aswt() {
        super(asws.a);
    }

    public final String aR() {
        if (this.f == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(16 + j);
            byte bPeekByte2 = Memory.peekByte(j + 17);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            this.f = ((short) ((b << 8) | (bPeekByte & 255))) == 1 ? cq(d.b) : "";
        }
        return this.f;
    }

    public final boolean aS() {
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

    @Override // defpackage.mew
    public final void bJ() {
    }
}
