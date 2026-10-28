package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class asiu extends mew implements mes {
    boolean d;
    volatile atas e;

    public asiu() {
        super(asit.a);
        this.d = false;
    }

    public void aR() {
        if (this.d) {
            bO(8, 1);
            bR(true != a ? 12 : 16, this.e);
            this.d = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
    }

    public asiu(UpbMessage upbMessage) {
        super(upbMessage);
        this.d = false;
    }
}
