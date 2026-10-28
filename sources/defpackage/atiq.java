package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atiq extends mew implements mes {
    public static final /* synthetic */ int i = 0;
    public final AtomicReference f;
    public boolean g;
    public volatile mew h;

    static {
        atip.a.d(7);
    }

    public atiq() {
        super(atip.a);
        this.f = new AtomicReference();
        this.g = false;
    }

    public void aR() {
        if (this.g) {
            AtomicReference atomicReference = this.f;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 12 : 40);
            } else {
                bS(1, (ArrayList) atomicReference.get());
            }
            this.g = false;
        }
    }

    public final int aS() {
        aT();
        return ((ArrayList) this.f.get()).size();
    }

    public final void aT() {
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 12 : 40, atiu.a, new njk(14)));
        }
    }

    public final boolean aU() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 2) == 0) ? false : true;
    }

    public final int aV() {
        int iBt = a.bt(Memory.peekInt(this.c + (true != a ? 24L : 16L), false));
        if (iBt != 0) {
            return iBt;
        }
        return 1;
    }

    public final mew aW() {
        if (this.h == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.h = new mew(cp(true != a ? 20 : 48, atis.a));
        }
        return this.h == null ? atir.a : this.h;
    }

    public final int aX() {
        int iBc = a.bc(Memory.peekInt(this.c + (true != a ? 16L : 12L), false));
        if (iBc != 0) {
            return iBc;
        }
        return 1;
    }

    public final ativ aY(int i2) {
        aT();
        return (ativ) ((ArrayList) this.f.get()).get(i2);
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    public atiq(UpbMessage upbMessage) {
        super(upbMessage);
        this.f = new AtomicReference();
        this.g = false;
    }
}
