package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nig extends mew implements myz {
    final AtomicReference d;
    volatile njy e;
    volatile nhz f;
    volatile nla g;
    volatile mew h;
    volatile mew i;
    volatile mew j;
    volatile mew k;

    public nig() {
        super(nif.a);
        this.d = new AtomicReference();
    }

    @Override // defpackage.myz
    public final boolean A() {
        return (this.j == null && (Memory.peekByte(this.c + 9) & 8) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final int B() {
        int iAV = a.aV(Memory.peekInt(this.c + (true != a ? 44L : 32L), false));
        if (iAV != 0) {
            return iAV;
        }
        return 1;
    }

    @Override // defpackage.myz
    public final int C() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 24L : 20L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.myz
    public final int D() {
        int iAV = a.aV(Memory.peekInt(this.c + (true != a ? 56L : 36L), false));
        if (iAV != 0) {
            return iAV;
        }
        return 1;
    }

    @Override // defpackage.myz
    public final int E() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 40L : 28L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    @Override // defpackage.myz
    public final int F() {
        int iAS = a.aS(Memory.peekInt(this.c + (true != a ? 68L : 40L), false));
        if (iAS != 0) {
            return iAS;
        }
        return 1;
    }

    final void aR() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 20 : 48, nih.a, new ngh(6)));
        }
    }

    @Override // defpackage.myz
    @Deprecated
    public final int g() {
        aR();
        return ((ArrayList) this.d.get()).size();
    }

    @Override // defpackage.myz
    public final /* synthetic */ myr h() {
        if (this.f != null) {
            return this.f;
        }
        if ((Memory.peekByte(this.c + 9) & 64) == 0) {
            return null;
        }
        nhz nhzVar = new nhz(cp(true == a ? 96 : 64, nhy.a));
        this.f = nhzVar;
        return nhzVar;
    }

    @Override // defpackage.myz
    public final /* synthetic */ myw i() {
        if (this.k != null) {
            return this.k;
        }
        if ((Memory.peekByte(this.c + 9) & 32) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 60 : 88, nid.a));
        this.k = mewVar;
        return mewVar;
    }

    @Override // defpackage.myz
    @Deprecated
    public final /* bridge */ /* synthetic */ mzc j(int i) {
        aR();
        return (nii) ((ArrayList) this.d.get()).get(i);
    }

    @Override // defpackage.myz
    public final /* synthetic */ mzg k() {
        if (this.h != null) {
            return this.h;
        }
        if ((Memory.peekByte(this.c + 8) & 128) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 36 : 64, nij.a));
        this.h = mewVar;
        return mewVar;
    }

    @Override // defpackage.myz
    public final /* synthetic */ mzg l() {
        if (this.i != null) {
            return this.i;
        }
        if ((Memory.peekByte(this.c + 9) & 4) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 48 : 72, nij.a));
        this.i = mewVar;
        return mewVar;
    }

    @Override // defpackage.myz
    public final /* synthetic */ mzg m() {
        if (this.j != null) {
            return this.j;
        }
        if ((Memory.peekByte(this.c + 9) & 8) == 0) {
            return null;
        }
        mew mewVar = new mew(cp(true != a ? 52 : 80, nij.a));
        this.j = mewVar;
        return mewVar;
    }

    @Override // defpackage.myz
    public final /* synthetic */ nak n() {
        if (this.e != null) {
            return this.e;
        }
        if ((Memory.peekByte(this.c + 8) & 4) == 0) {
            return null;
        }
        njy njyVar = new njy(cp(true != a ? 32 : 56, njx.a));
        this.e = njyVar;
        return njyVar;
    }

    @Override // defpackage.myz
    public final /* synthetic */ nbn o() {
        if (this.g != null) {
            return this.g;
        }
        if ((Memory.peekByte(this.c + 10) & 8) == 0) {
            return null;
        }
        nla nlaVar = new nla(cp(true != a ? 72 : 104, nkz.a));
        this.g = nlaVar;
        return nlaVar;
    }

    @Override // defpackage.myz
    public final boolean p() {
        return Memory.peekByte(this.c + 15) != 0;
    }

    @Override // defpackage.myz
    public final boolean q() {
        return Memory.peekByte(this.c + 16) != 0;
    }

    @Override // defpackage.myz
    public final boolean r() {
        return Memory.peekByte(this.c + 17) != 0;
    }

    @Override // defpackage.myz
    public final boolean s() {
        return (this.f == null && (Memory.peekByte(this.c + 9) & 64) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final boolean t() {
        return (this.k == null && (Memory.peekByte(this.c + 9) & 32) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final boolean u() {
        return (this.e == null && (Memory.peekByte(this.c + 8) & 4) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final boolean v() {
        return (Memory.peekByte(this.c + 10) & 2) != 0;
    }

    @Override // defpackage.myz
    public final boolean w() {
        return (Memory.peekByte(this.c + 10) & 4) != 0;
    }

    @Override // defpackage.myz
    public final boolean x() {
        return (this.g == null && (Memory.peekByte(this.c + 10) & 8) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final boolean y() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 128) == 0) ? false : true;
    }

    @Override // defpackage.myz
    public final boolean z() {
        return (this.i == null && (Memory.peekByte(this.c + 9) & 4) == 0) ? false : true;
    }

    public nig(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
