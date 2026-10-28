package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tro implements afvn {
    public final trh a;
    public final trh b;

    public tro(trh trhVar) {
        this.a = new trh("SPAWN", trhVar.g, SemanticState.Hidden);
        this.b = trhVar;
    }

    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.g();
    }
}
