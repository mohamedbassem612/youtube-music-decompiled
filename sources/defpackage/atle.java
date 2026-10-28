package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atle extends atlh implements mes {
    private boolean f = false;

    private final void aW() {
        if (this.f) {
            this.f = false;
            bG();
        }
    }

    @Override // defpackage.atlh
    public final void aR() {
        if (this.d) {
            aW();
            bO(8, 8);
            bR(true != a ? 24 : 32, this.e);
            this.d = false;
        }
    }

    public final atlh aS() {
        if (this.f) {
            bG();
        } else {
            this.f = true;
        }
        atlh atlhVar = new atlh(this.b);
        if (this.e != null) {
            atlhVar.e = this.e;
            atlhVar.d = this.d;
        }
        atlhVar.aR();
        return atlhVar;
    }

    public final void aT(atln atlnVar) {
        if (atlnVar != this.e) {
            this.e = atlnVar;
            this.d = true;
        }
    }

    public final void aU() {
        aW();
        bO(8, 4);
        bQ(20, 2);
    }
}
