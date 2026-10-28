package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ataq extends mew implements mes {
    boolean e;
    volatile atax f;

    public ataq() {
        super(atap.a);
        this.e = false;
    }

    public void aR() {
        if (this.e) {
            bO(8, 2);
            bR(32, this.f);
            this.e = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    public ataq(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
    }
}
