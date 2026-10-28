package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ytx implements agfr {
    private final wis a;
    private wiu b;

    public ytx(wis wisVar) {
        this.a = wisVar;
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized wiu io() {
        wiu wiuVarIo;
        wiuVarIo = this.b;
        if (wiuVarIo == null) {
            wiuVarIo = this.a.io();
        }
        return wiuVarIo;
    }

    public final synchronized void c(wiu wiuVar) {
        this.b = wiuVar;
    }
}
