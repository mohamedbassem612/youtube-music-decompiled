package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class asxe extends mew implements mes {
    public static final /* synthetic */ int A = 0;
    static final mfc k = asxd.a.d(1);
    volatile String l;
    public final AtomicReference m;
    public boolean n;
    public final AtomicReference o;
    public boolean p;
    public final AtomicReference q;
    public boolean r;
    public final AtomicReference s;
    public boolean t;
    public boolean u;
    public final AtomicReference v;
    public boolean w;
    public final AtomicReference x;
    public boolean y;
    public volatile asye z;

    public asxe() {
        super(asxd.a);
        this.m = new AtomicReference();
        this.n = false;
        this.o = new AtomicReference();
        this.p = false;
        this.q = new AtomicReference();
        this.r = false;
        this.s = new AtomicReference();
        this.t = false;
        this.u = false;
        this.v = new AtomicReference();
        this.w = false;
        this.x = new AtomicReference();
        this.y = false;
    }

    public void aR() {
        if (this.r) {
            AtomicReference atomicReference = this.q;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 32 : 64);
            } else {
                bS(8, (ArrayList) atomicReference.get());
            }
            this.r = false;
        }
    }

    public void aS() {
        if (this.n) {
            AtomicReference atomicReference = this.m;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 24 : 48);
            } else {
                bS(5, (ArrayList) atomicReference.get());
            }
            this.n = false;
        }
    }

    public void aU() {
        if (this.t) {
            AtomicReference atomicReference = this.s;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 40 : 72);
            } else {
                bS(10, (ArrayList) atomicReference.get());
            }
            this.t = false;
        }
    }

    public void aV() {
        if (this.u) {
            bO(8, 64);
            bR(true != a ? 44 : 80, this.z);
            this.u = false;
        }
    }

    public void aW() {
        if (this.y) {
            AtomicReference atomicReference = this.x;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 56 : 104);
            } else {
                bS(14, (ArrayList) atomicReference.get());
            }
            this.y = false;
        }
    }

    public void aX() {
        if (this.w) {
            AtomicReference atomicReference = this.v;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 52 : 96);
            } else {
                bS(13, (ArrayList) atomicReference.get());
            }
            this.w = false;
        }
    }

    public void aY() {
        if (this.p) {
            AtomicReference atomicReference = this.o;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 28 : 56);
            } else {
                bS(6, (ArrayList) atomicReference.get());
            }
            this.p = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aS();
        aY();
        aR();
        aU();
        aX();
        aW();
        aV();
    }

    public final int bc() {
        bj();
        return ((ArrayList) this.q.get()).size();
    }

    public final int bd() {
        bk();
        return ((ArrayList) this.m.get()).size();
    }

    public final int be() {
        bl();
        return ((ArrayList) this.s.get()).size();
    }

    public final int bf() {
        bm();
        return ((ArrayList) this.x.get()).size();
    }

    public final int bg() {
        bn();
        return ((ArrayList) this.v.get()).size();
    }

    public final int bh() {
        bo();
        return ((ArrayList) this.o.get()).size();
    }

    public final String bi() {
        if (this.l == null) {
            this.l = (Memory.peekByte(this.c + 8) & 1) != 0 ? cq(k.b) : "";
        }
        return this.l;
    }

    public final void bj() {
        AtomicReference atomicReference = this.q;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 32 : 64, aswz.a, new njk(12)));
        }
    }

    public final void bk() {
        AtomicReference atomicReference = this.m;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 24 : 48, asxh.a, new njk(8)));
        }
    }

    public final void bl() {
        AtomicReference atomicReference = this.s;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 40 : 72, asxk.a, new njk(7)));
        }
    }

    public final void bm() {
        AtomicReference atomicReference = this.x;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 56 : 104, asyt.a, new njk(11)));
        }
    }

    public final void bn() {
        AtomicReference atomicReference = this.v;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 52 : 96, asyx.a, new njk(10)));
        }
    }

    final void bo() {
        AtomicReference atomicReference = this.o;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 28 : 56, aszc.a, new njk(9)));
        }
    }

    public final boolean bp() {
        return (this.z == null && (Memory.peekByte(this.c + 8) & 64) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f A[PHI: r3
      0x001f: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:6:0x0011, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final int bq() {
        long j = this.c + 20;
        int i = 0;
        int iPeekInt = Memory.peekInt(j, false);
        if (iPeekInt == 0) {
            i = 1;
        } else if (iPeekInt != 1) {
            int i2 = 4;
            if (iPeekInt == 3) {
                i = i2;
            } else if (iPeekInt != 4) {
                i2 = 6;
                if (iPeekInt == 5) {
                    i = i2;
                } else if (iPeekInt == 6) {
                    i = 7;
                }
            } else {
                i = 5;
            }
        } else {
            i = 2;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d A[PHI: r3
      0x001d: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0011, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x001f A[PHI: r2
      0x001f: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:5:0x000e, B:9:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public final int br() {
        long j = this.c + 16;
        int i = 0;
        int iPeekInt = Memory.peekInt(j, false);
        if (iPeekInt != 0) {
            int i2 = 2;
            if (iPeekInt != 1) {
                int i3 = 3;
                if (iPeekInt != 2) {
                    i2 = 4;
                    if (iPeekInt != 3) {
                        i3 = 5;
                        if (iPeekInt == 4) {
                            i = i3;
                        } else if (iPeekInt == 5) {
                            i = 6;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    i = i3;
                }
            } else {
                i = i2;
            }
        } else {
            i = 1;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0024 A[PHI: r3
      0x0024: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:11:0x0018, B:15:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[PHI: r1
      0x0026: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:9:0x0015, B:13:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public final int bs() {
        long j = this.c;
        int i = 0;
        int iPeekInt = Memory.peekInt(j + (true != a ? 36L : 24L), false);
        if (iPeekInt != 0) {
            int i2 = 2;
            if (iPeekInt != 1) {
                int i3 = 3;
                if (iPeekInt != 2) {
                    i2 = 4;
                    if (iPeekInt != 3) {
                        i3 = 5;
                        if (iPeekInt == 4) {
                            i = i3;
                        } else if (iPeekInt == 5) {
                            i = 6;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    i = i3;
                }
            } else {
                i = i2;
            }
        } else {
            i = 1;
        }
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final asxa bt(int i) {
        bj();
        return (asxa) ((ArrayList) this.q.get()).get(i);
    }

    public final asxi bu(int i) {
        bk();
        return (asxi) ((ArrayList) this.m.get()).get(i);
    }

    public final asxl bv(int i) {
        bl();
        return (asxl) ((ArrayList) this.s.get()).get(i);
    }

    public final asye bw() {
        if (this.z == null && (Memory.peekByte(this.c + 8) & 64) != 0) {
            this.z = new asye(cp(true != a ? 44 : 80, asyd.a));
        }
        return this.z == null ? asyc.a : this.z;
    }

    public final asyu bx(int i) {
        bm();
        return (asyu) ((ArrayList) this.x.get()).get(i);
    }

    public final asyy by(int i) {
        bn();
        return (asyy) ((ArrayList) this.v.get()).get(i);
    }

    public final aszd bz(int i) {
        bo();
        return (aszd) ((ArrayList) this.o.get()).get(i);
    }

    public asxe(UpbMessage upbMessage) {
        super(upbMessage);
        this.m = new AtomicReference();
        this.n = false;
        this.o = new AtomicReference();
        this.p = false;
        this.q = new AtomicReference();
        this.r = false;
        this.s = new AtomicReference();
        this.t = false;
        this.u = false;
        this.v = new AtomicReference();
        this.w = false;
        this.x = new AtomicReference();
        this.y = false;
    }
}
