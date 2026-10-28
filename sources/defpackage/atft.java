package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atft extends mew implements mes {
    public boolean e;
    public volatile atfm f;
    public volatile asxe g;

    public atft() {
        super(atfs.a);
        this.e = false;
    }

    public void aS() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 32, this.g);
            this.e = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aS();
    }

    public atft(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
    }
}
