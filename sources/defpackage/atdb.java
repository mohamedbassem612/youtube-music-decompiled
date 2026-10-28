package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class atdb extends mew implements mes {
    public boolean e;
    public boolean f;
    public boolean g;
    public volatile atks h;
    public volatile atks i;
    public volatile atks j;

    public atdb() {
        super(atda.a);
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

    @Override // defpackage.mew
    public final void bJ() {
        aS();
        aR();
        aT();
    }

    public atdb(UpbMessage upbMessage) {
        super(upbMessage);
        this.e = false;
        this.f = false;
        this.g = false;
    }
}
