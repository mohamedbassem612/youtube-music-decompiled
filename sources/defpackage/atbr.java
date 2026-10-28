package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class atbr extends mew implements mes {
    public boolean e;
    public boolean f;
    public boolean g;
    public volatile atks h;
    public volatile atks i;
    public volatile atna j;

    public atbr() {
        super(atbq.a);
        this.e = false;
        this.f = false;
        this.g = false;
    }

    public void aR() {
        if (this.e) {
            bO(8, 1);
            bR(true != a ? 12 : 24, this.h);
            this.e = false;
        }
    }

    public void aS() {
        if (this.g) {
            bO(8, 8);
            bR(true != a ? 24 : 32, this.j);
            this.g = false;
        }
    }

    public void aU() {
        if (this.f) {
            bO(8, 32);
            bR(true == a ? 40 : 32, this.i);
            this.f = false;
        }
    }

    @Override // defpackage.mew
    public final void bJ() {
        aR();
        aU();
        aS();
    }

    public atbr(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
        this.f = false;
        this.g = false;
    }
}
