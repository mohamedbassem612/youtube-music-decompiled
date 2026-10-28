package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlx extends mew implements nci {
    static final mfc d = nlw.a.d(7);
    final AtomicReference e;
    volatile ByteBuffer f;
    volatile mew g;

    public nlx(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = new AtomicReference();
    }

    final void aR() {
        AtomicReference atomicReference = this.e;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 12 : 40, nlz.a, new ngh(8)));
        }
    }

    @Override // defpackage.nci
    public final int g() {
        aR();
        return ((ArrayList) this.e.get()).size();
    }

    @Override // defpackage.nci
    public final /* synthetic */ nck h() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 20 : 48, nly.a));
        this.g = mewVar;
        return mewVar;
    }

    @Override // defpackage.nci
    public final /* bridge */ /* synthetic */ ncl i(int i) {
        aR();
        return (nma) ((ArrayList) this.e.get()).get(i);
    }

    @Override // defpackage.nci
    public final ByteBuffer j() {
        if ((Memory.peekByte(this.c + 8) & 32) == 0) {
            return null;
        }
        if (this.f == null) {
            if ((Memory.peekByte(this.c + 8) & 32) != 0) {
                this.f = cr(d.b);
            } else {
                this.f = ByteBuffer.allocate(0);
            }
        }
        return this.f.asReadOnlyBuffer();
    }

    @Override // defpackage.nci
    public final boolean k() {
        return Memory.peekByte(this.c + 9) != 0;
    }

    @Override // defpackage.nci
    public final boolean l() {
        return (Memory.peekByte(this.c + 8) & 32) != 0;
    }

    @Override // defpackage.nci
    public final boolean m() {
        return (this.g == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nci
    public final int n() {
        int iBt = a.bt(Memory.peekInt(this.c + (true != a ? 24L : 16L), false));
        if (iBt != 0) {
            return iBt;
        }
        return 1;
    }

    @Override // defpackage.nci
    public final int o() {
        int iBc = a.bc(Memory.peekInt(this.c + (true != a ? 16L : 12L), false));
        if (iBc != 0) {
            return iBc;
        }
        return 1;
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
