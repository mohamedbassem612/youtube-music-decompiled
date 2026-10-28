package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atad extends mew implements mes {
    public ArrayList d;
    public ArrayList e;
    public volatile ataa f;

    public atad() {
        super(atac.a);
    }

    public final int aR() {
        aS();
        return this.d.size();
    }

    public final void aS() {
        if (this.d == null) {
            this.d = bD(true != a ? 8 : 16);
        }
    }

    public final void aT() {
        if (this.e == null) {
            this.e = bC(true != a ? 12 : 24);
        }
    }

    public final ataa aU() {
        if (this.f == null) {
            boolean z = a;
            long j = this.c + ((long) (true != z ? 16 : 8));
            byte bPeekByte = Memory.peekByte(j);
            byte bPeekByte2 = Memory.peekByte(1 + j);
            boolean z2 = UnsafeMemory.a;
            byte b = true != z2 ? bPeekByte2 : bPeekByte;
            if (true == z2) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 4) {
                this.f = new ataa(cp(true != z ? 20 : 32, aszz.a));
            }
        }
        return this.f == null ? aszy.a : this.f;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
