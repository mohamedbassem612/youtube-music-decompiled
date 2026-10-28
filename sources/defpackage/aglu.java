package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aglu extends agqs {
    static final agqs a = new aglu(new Object[0]);
    private final Object[] b;

    public aglu(Object[] objArr) {
        super(objArr.length, 0);
        this.b = objArr;
    }

    @Override // defpackage.agqs
    public final Object a(int i) {
        return this.b[i];
    }
}
