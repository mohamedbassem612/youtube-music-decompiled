package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oai extends ahch {
    Object a;

    public oai(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ahch
    protected final void gH() {
        this.a = null;
    }

    @Override // defpackage.ahch
    public final String jK() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }
}
