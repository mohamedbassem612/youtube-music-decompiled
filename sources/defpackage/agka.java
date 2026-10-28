package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agka extends agqs {
    private final agke a;

    public agka(agke agkeVar, int i) {
        super(agkeVar.size(), i);
        this.a = agkeVar;
    }

    @Override // defpackage.agqs
    public final Object a(int i) {
        return this.a.get(i);
    }
}
