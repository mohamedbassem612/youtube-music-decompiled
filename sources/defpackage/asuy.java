package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class asuy extends mew implements mes {
    static final mfc e = asuo.a.d(1);
    static final mfc f = asuo.a.d(8);
    static final mfc g = asuo.a.d(9);
    public static final mfc h = asuo.a.d(10);
    public static final mfc i = asuo.a.d(11);
    volatile String j;
    volatile String k;
    volatile String l;
    public volatile String m;
    public volatile String n;
    public final AtomicReference o;

    public asuy() {
        super(asuo.a);
        this.o = new AtomicReference();
    }

    public final int aR() {
        aV();
        return ((ArrayList) this.o.get()).size();
    }

    public final String aS() {
        if (this.k == null) {
            this.k = (Memory.peekByte(this.c + 8) & 128) != 0 ? cq(f.b) : "";
        }
        return this.k;
    }

    public final String aT() {
        if (this.j == null) {
            this.j = (Memory.peekByte(this.c + 8) & 1) != 0 ? cq(e.b) : "";
        }
        return this.j;
    }

    public final String aU() {
        if (this.l == null) {
            this.l = (Memory.peekByte(this.c + 9) & 1) != 0 ? cq(g.b) : "";
        }
        return this.l;
    }

    public final void aV() {
        AtomicReference atomicReference = this.o;
        if (atomicReference.get() == null) {
            a.ap(atomicReference, bE(true != a ? 24 : 104, asvi.a, new njk(4)));
        }
    }

    public final int aW() {
        long j = this.c + 16;
        int i2 = 0;
        switch (Memory.peekInt(j, false)) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 10;
                break;
            case 10:
                i2 = 11;
                break;
            case 11:
                i2 = 12;
                break;
            case 12:
                i2 = 13;
                break;
            case 13:
                i2 = 14;
                break;
            case 14:
                i2 = 15;
                break;
            case 15:
                i2 = 16;
                break;
        }
        if (i2 != 0) {
            return i2;
        }
        return 1;
    }

    public asuy(UpbMessage upbMessage) {
        super(upbMessage);
        this.o = new AtomicReference();
    }

    @Override // defpackage.mew
    public final void bJ() {
    }
}
