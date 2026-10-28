package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aejs implements auyu {
    public static final avbb a;
    public final avbe b;
    public final String c;

    static {
        avba avbaVar = avbe.b;
        int i = avbb.c;
        a = new avaz("Authorization", avbaVar);
    }

    public aejs(avbe avbeVar, String str) {
        this.b = avbeVar;
        this.c = str;
    }

    @Override // defpackage.auyu
    public final auyt a(avbh avbhVar, auyq auyqVar, auyr auyrVar) {
        return new aejr(this, auyrVar.a(avbhVar, auyqVar));
    }
}
