package defpackage;

import com.google.android.libraries.jni.UnsafeMemory;
import java.nio.ByteBuffer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ativ extends mew implements mes {
    static final mfc e = atiu.a.d(1);
    public static final mfc f = atiu.a.d(2);
    volatile String g;
    public volatile ByteBuffer h;
    public volatile atii i;
    public volatile mew j;

    public ativ() {
        super(atiu.a);
    }

    public final String aR() {
        if (this.g == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(20 + j);
            byte bPeekByte2 = Memory.peekByte(j + 21);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            this.g = ((short) ((b << 8) | (bPeekByte & 255))) == 1 ? cq(e.b) : "";
        }
        return this.g;
    }

    public final boolean aS() {
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
        return ((short) ((b << 8) | (bPeekByte & 255))) == 3;
    }

    public final boolean aT() {
        if (this.j != null) {
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

    public final atii aU() {
        if (this.i == null) {
            long j = this.c;
            byte bPeekByte = Memory.peekByte(20 + j);
            byte bPeekByte2 = Memory.peekByte(j + 21);
            boolean z = UnsafeMemory.a;
            byte b = true != z ? bPeekByte2 : bPeekByte;
            if (true == z) {
                bPeekByte = bPeekByte2;
            }
            if (((short) ((b << 8) | (bPeekByte & 255))) == 3) {
                this.i = new atii(cp(24, atih.a));
            }
        }
        if (this.i != null) {
            return this.i;
        }
        int i = atii.f;
        return atig.a;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
