package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aghy extends agib {
    final /* synthetic */ agif a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aghy(agif agifVar) {
        super(agifVar);
        this.a = agifVar;
    }

    @Override // defpackage.agib
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new agid(this.a, i);
    }
}
