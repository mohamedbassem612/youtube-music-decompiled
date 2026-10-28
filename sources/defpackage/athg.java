package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class athg extends mew implements mes {
    public boolean e;
    public volatile ateu f;

    public athg() {
        super(athf.a);
        this.e = false;
    }

    public void aS() {
        if (this.e) {
            bO(8, 8);
            bR(true != a ? 20 : 24, this.f);
            this.e = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aS();
    }

    public athg(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
    }
}
