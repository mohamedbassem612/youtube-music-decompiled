package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nkl extends mew implements nay {
    static final mfc e = nkk.a.d(4);
    public static final /* synthetic */ int k = 0;
    public boolean f;
    public final AtomicReference g;
    volatile String h;
    public volatile mew i;
    public volatile mew j;

    public nkl() {
        super(nkk.a);
        this.f = false;
        this.g = new AtomicReference();
    }

    public void aR() {
        if (this.f) {
            bO(8, 1);
            bR(true != a ? 12 : 32, this.j);
            this.f = false;
        }
    }

    final void aS() {
        AtomicReference atomicReference = this.g;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 20 : 48, nkk.a, new ngh(7)));
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    @Override // defpackage.nay
    public final int g() {
        aS();
        return ((ArrayList) this.g.get()).size();
    }

    @Override // defpackage.nay
    public final /* bridge */ /* synthetic */ nay h(int i) {
        aS();
        return (nkl) ((ArrayList) this.g.get()).get(i);
    }

    @Override // defpackage.nay
    public final /* synthetic */ nds i() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 8) & 2) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 16 : 40, nnc.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.nay
    public final /* bridge */ /* synthetic */ nff j() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 8) & 1) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 12 : 32, nor.a), (short[]) null);
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.nay
    public final String k() {
        if (this.h == null && (Memory.peekByte(this.c + 8) & 4) != 0) {
            this.h = cq(e.b);
        }
        return this.h;
    }

    @Override // defpackage.nay
    public final boolean l() {
        return (Memory.peekByte(this.c + 8) & 4) != 0;
    }

    @Override // defpackage.nay
    public final boolean m() {
        return (this.i == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    @Override // defpackage.nay
    public final boolean n() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public nkl(UpbMessage upbMessage) {
        super(upbMessage);
        this.f = false;
        this.g = new AtomicReference();
    }
}
