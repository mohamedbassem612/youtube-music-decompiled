package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fol extends flf {
    final /* synthetic */ foq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fol(foq foqVar, flf flfVar) {
        super(flfVar);
        this.a = foqVar;
    }

    @Override // defpackage.flf
    public final void a(flf flfVar) {
        try {
            this.a.i();
        } catch (IndexOutOfBoundsException e) {
            foq foqVar = this.a;
            throw foq.b(foqVar, foqVar.i, e);
        }
    }
}
