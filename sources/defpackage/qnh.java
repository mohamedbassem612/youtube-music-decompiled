package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qnh implements agfr {
    boolean a;
    Object b;
    final /* synthetic */ agfr c;

    public qnh(agfr agfrVar) {
        this.c = agfrVar;
    }

    @Override // defpackage.agfr
    public final Object io() {
        if (this.a) {
            return this.b;
        }
        Object objIo = this.c.io();
        this.b = objIo;
        this.a = true;
        return objIo;
    }
}
