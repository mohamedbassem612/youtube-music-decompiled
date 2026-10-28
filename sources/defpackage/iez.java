package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iez implements abos {
    private final aapa a;
    private final ige b;

    public iez(aapa aapaVar, ige igeVar) {
        this.a = aapaVar;
        this.b = igeVar;
    }

    @Override // defpackage.abos
    public final abor a(abnl abnlVar) {
        return (abnlVar == null || !gzj.X(abnlVar)) ? this.a : this.b;
    }
}
