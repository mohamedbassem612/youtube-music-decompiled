package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awwo extends awuq {
    protected final String h() {
        awwo awwoVarJ;
        awuq awuqVar = awvi.a;
        awwo awwoVar = axds.a;
        if (this == awwoVar) {
            return "Dispatchers.Main";
        }
        try {
            awwoVarJ = awwoVar.j();
        } catch (UnsupportedOperationException unused) {
            awwoVarJ = null;
        }
        if (this == awwoVarJ) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract awwo j();

    @Override // defpackage.awuq
    public String toString() {
        String strH = h();
        if (strH != null) {
            return strH;
        }
        return awuw.a(this) + '@' + awuw.b(this);
    }

    @Override // defpackage.awuq
    public final awuq e(int i) {
        return this;
    }
}
