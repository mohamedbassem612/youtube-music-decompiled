package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.jni.UnsafeMemory;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class aszd extends mew implements mes {
    public static final mfc e = aszc.a.d(3);
    static final mfc f = aszc.a.d(14);
    public volatile String g;
    volatile String h;
    public volatile asya i;
    public volatile asxo j;
    public volatile mew k;

    static {
        aszc.a.d(23);
        aszc.a.d(24);
    }

    public aszd() {
        super(aszc.a);
    }

    public final String aV() {
        if (this.h == null) {
            this.h = (Memory.peekByte(this.c + 9) & 8) != 0 ? cq(f.b) : "";
        }
        return this.h;
    }

    public final boolean aW() {
        return (this.i == null && (Memory.peekByte(this.c + 10) & 2) == 0) ? false : true;
    }

    public final int aX() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 56L : 52L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    public final int aY() {
        long j = this.c;
        int i = 0;
        int iPeekInt = Memory.peekInt(j + (true != a ? 44L : 40L), false);
        if (iPeekInt == 0) {
            i = 1;
        } else if (iPeekInt == 1) {
            i = 2;
        } else if (iPeekInt == 2) {
            i = 3;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.mew, defpackage.mxk
    public final boolean ck() {
        throw null;
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

    public aszd(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
