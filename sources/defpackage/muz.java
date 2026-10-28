package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class muz extends mff implements nbo {
    private final ahuj a;

    public muz(ahuj ahujVar) {
        this.a = ahujVar;
    }

    @Override // defpackage.nbo
    public final float ah() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(8);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return Float.NaN;
    }

    @Override // defpackage.nbo
    public final float ai() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(4);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return Float.NaN;
    }

    @Override // defpackage.nbo
    public final float aj() {
        ahuj ahujVar = this.a;
        int iB = ahujVar.b(6);
        if (iB != 0) {
            return ahujVar.b.getFloat(iB + ahujVar.a);
        }
        return Float.NaN;
    }

    @Override // defpackage.nbo
    public final boolean ak() {
        return true;
    }

    @Override // defpackage.nbo
    public final boolean al() {
        return true;
    }

    @Override // defpackage.nbo
    public final boolean am() {
        return true;
    }
}
