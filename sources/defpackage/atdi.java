package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atdi extends mew implements mes {
    public boolean e;
    public boolean f;
    public boolean g;
    public volatile atei h;
    public volatile atei i;
    public volatile atei j;

    public atdi() {
        super(atdh.a);
        this.e = false;
        this.f = false;
        this.g = false;
    }

    public void aR() {
        if (this.f) {
            bO(8, 2);
            bR(true != a ? 16 : 24, this.i);
            this.f = false;
        }
    }

    public void aS() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 16, this.h);
            this.e = false;
        }
    }

    public void aT() {
        if (this.g) {
            bO(8, 4);
            bR(true != a ? 20 : 32, this.j);
            this.g = false;
        }
    }

    public final boolean aU() {
        return (this.h == null && (Memory.peekByte(this.c + 8) & 1) == 0) ? false : true;
    }

    public final atei aV() {
        if (this.h == null && (Memory.peekByte(this.c + 8) & 1) != 0) {
            this.h = new atei(cp(true != a ? 12 : 16, ateh.a));
        }
        return this.h == null ? ateg.a : this.h;
    }

    @Override // defpackage.mew
    public final void bJ() {
        aS();
        aR();
        aT();
    }

    public atdi(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
        this.f = false;
        this.g = false;
    }
}
