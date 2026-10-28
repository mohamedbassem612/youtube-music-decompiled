package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atlu extends mew implements mes {
    public boolean e;
    public boolean f;
    public volatile atks g;
    public volatile atna h;

    public atlu() {
        super(atlt.a);
        this.e = false;
        this.f = false;
    }

    public void aR() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 16, this.g);
            this.e = false;
        }
    }

    public void aS() {
        if (this.f) {
            bO(8, 2);
            bR(true != a ? 16 : 24, this.h);
            this.f = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
        aS();
    }

    public atlu(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
        this.f = false;
    }
}
