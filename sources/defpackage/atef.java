package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atef extends atei implements mes {
    private boolean h = false;

    private final void ba() {
        if (this.h) {
            this.h = false;
            bG();
        }
    }

    @Override // defpackage.atei
    public final void aR() {
        if (this.e) {
            ba();
            bO(8, 2);
            bR(true != a ? 16 : 24, this.g);
            this.e = false;
        }
    }

    @Override // defpackage.atei
    public final void aS() {
        if (this.d) {
            ba();
            bO(8, 1);
            bR(true != a ? 12 : 16, this.f);
            this.d = false;
        }
    }

    public final atei aT() {
        if (this.h) {
            bG();
        } else {
            this.h = true;
        }
        atei ateiVar = new atei(this.b);
        if (this.f != null) {
            ateiVar.f = this.f;
            ateiVar.d = this.d;
        }
        if (this.g != null) {
            ateiVar.g = this.g;
            ateiVar.e = this.e;
        }
        ateiVar.bJ();
        return ateiVar;
    }

    public final void aU(atks atksVar) {
        if (atksVar != this.g) {
            this.g = atksVar;
            this.e = true;
        }
    }

    public final void aV(atna atnaVar) {
        if (atnaVar != this.f) {
            this.f = atnaVar;
            this.d = true;
        }
    }
}
