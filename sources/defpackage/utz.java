package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class utz extends uuf {
    public utz(long j) {
        super(j);
    }

    @Override // defpackage.uuf
    public final aufa d(aufa aufaVar) throws utw {
        throw new utw("Should never be called for graphical segment mutation", this);
    }

    @Deprecated
    public abstract augy e(augy augyVar);

    @Override // defpackage.uuf
    public final augy f(augy augyVar) {
        return e(augyVar);
    }
}
