package defpackage;

import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.jni.UnsafeMemory;
import java.util.ArrayList;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhp extends mew implements myj {
    ArrayList d;
    ArrayList e;
    volatile nhn f;

    public nhp(UpbArena upbArena) {
        super(UpbMessage.b(nho.a, upbArena));
    }

    public static nhp aT(byte[] bArr, UpbArena upbArena) {
        nhp nhpVar = new nhp(upbArena);
        nhpVar.bH(bArr);
        return nhpVar;
    }

    final void aR() {
        if (this.d == null) {
            this.d = bD(true != a ? 8 : 16);
        }
    }

    final void aS() {
        if (this.e == null) {
            this.e = bC(true != a ? 12 : 24);
        }
    }

    @Override // defpackage.myj
    public final float g() {
        boolean z = a;
        long j = this.c + ((long) (true != z ? 16 : 8));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) == 3) {
            return Float.intBitsToFloat(Memory.peekInt(this.c + (true != z ? 20L : 32L), false));
        }
        return 0.0f;
    }

    @Override // defpackage.myj
    public final float h(int i) {
        aS();
        return ((Float) this.e.get(i)).floatValue();
    }

    @Override // defpackage.myj
    public final int i(int i) {
        aR();
        return ((Integer) this.d.get(i)).intValue();
    }

    @Override // defpackage.myj
    public final int j() {
        aR();
        return this.d.size();
    }

    @Override // defpackage.myj
    public final int k() {
        aS();
        return this.e.size();
    }

    @Override // defpackage.myj
    public final /* synthetic */ myi l() {
        if (this.f != null) {
            return this.f;
        }
        boolean z = a;
        long j = this.c + ((long) (true != z ? 16 : 8));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z2 = UnsafeMemory.a;
        byte b = true != z2 ? bPeekByte2 : bPeekByte;
        if (true == z2) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b << 8) | (bPeekByte & 255))) != 4) {
            return null;
        }
        nhn nhnVar = new nhn(cp(true != z ? 20 : 32, nhm.a));
        this.f = nhnVar;
        return nhnVar;
    }

    @Override // defpackage.myj
    public final boolean m() {
        if (this.f != null) {
            return true;
        }
        long j = this.c + ((long) (true != a ? 16 : 8));
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(1 + j);
        boolean z = UnsafeMemory.a;
        byte b = true != z ? bPeekByte2 : bPeekByte;
        if (true == z) {
            bPeekByte = bPeekByte2;
        }
        return ((short) ((b << 8) | (bPeekByte & 255))) == 4;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
