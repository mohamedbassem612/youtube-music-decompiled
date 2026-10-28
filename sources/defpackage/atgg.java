package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atgg extends mew implements mes {
    static final mfc d = atgf.a.d(4);
    public static final /* synthetic */ int l = 0;
    boolean e;
    boolean f;
    final AtomicReference g;
    boolean h;
    volatile String i;
    volatile mew j;
    volatile mew k;

    public atgg() {
        super(atgf.a);
        this.e = false;
        this.f = false;
        this.g = new AtomicReference();
        this.h = false;
    }

    public void aR() {
        if (this.h) {
            AtomicReference atomicReference = this.g;
            if (((ArrayList) atomicReference.get()).isEmpty()) {
                bI(true != a ? 20 : 48);
            } else {
                bS(3, (ArrayList) atomicReference.get());
            }
            this.h = false;
        }
    }

    public void aS() {
        if (this.f) {
            bO(8, 2);
            bR(true != a ? 16 : 40, this.k);
            this.f = false;
        }
    }

    public void aT() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 32, this.j);
            this.e = false;
        }
    }

    public final String aY() {
        if (this.i == null) {
            this.i = (Memory.peekByte(this.c + 8) & 4) != 0 ? cq(d.b) : "";
        }
        return this.i;
    }

    public final boolean aZ() {
        return (this.j == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
        aT();
        aS();
    }

    public final mew ba() {
        if (this.k == null && (Memory.peekByte(this.c + 8) & 2) != 0) {
            this.k = new mew(cp(true != a ? 16 : 40, atkx.a), (float[]) null);
        }
        return this.k == null ? atkw.a : this.k;
    }

    public final mew bb() {
        if (this.j == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.j = new mew(cp(true != a ? 12 : 32, atoe.a), (byte[][]) null);
        }
        return this.j == null ? atod.a : this.j;
    }

    public atgg(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
        this.f = false;
        this.g = new AtomicReference();
        this.h = false;
    }
}
