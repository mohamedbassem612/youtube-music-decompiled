package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asyz extends aszd implements mes {
    public boolean d;

    public asyz() {
        this.d = false;
    }

    public final void aR() {
        if (this.d) {
            this.d = false;
            bG();
        }
    }

    public final void aS(int i) {
        aR();
        bO(8, 2);
        bQ(16, i);
    }

    public final void aT(int i) {
        aR();
        bO(8, 1);
        bQ(12, i);
    }

    public final aszd aU() {
        if (this.d) {
            bG();
        } else {
            this.d = true;
        }
        aszd aszdVar = new aszd(this.b);
        if (this.i != null) {
            aszdVar.i = this.i;
        }
        if (this.k != null) {
            aszdVar.k = this.k;
        }
        if (this.j != null) {
            aszdVar.j = this.j;
        }
        return aszdVar;
    }

    public asyz(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = false;
    }
}
