package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tzi implements avmd {
    final /* synthetic */ tzj a;

    public tzi(tzj tzjVar) {
        this.a = tzjVar;
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void b(Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.avmd, defpackage.avlc, defpackage.avln
    public final void d(avmn avmnVar) {
        tzj tzjVar = this.a;
        tzjVar.a.set(avmnVar);
        if (tzjVar.isCancelled()) {
            tzjVar.c();
        }
    }

    @Override // defpackage.avmd, defpackage.avln
    public final void ki(Object obj) {
        this.a.set(obj);
    }
}
