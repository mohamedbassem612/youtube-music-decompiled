package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class yac implements knj {
    private final Runnable a;

    public yac(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.knj
    public final /* synthetic */ void a(kni kniVar) {
        if (((kfk) kniVar).a().c()) {
            return;
        }
        agrx agrxVar = agso.a;
        this.a.run();
    }
}
