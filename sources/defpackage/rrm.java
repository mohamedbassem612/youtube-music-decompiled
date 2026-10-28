package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrm {
    public int a;
    private aobj b;

    public final rrn a() {
        int i;
        aobj aobjVar = this.b;
        if (aobjVar != null && (i = this.a) != 0) {
            return new rrn(aobjVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" effectiveConnectionType");
        }
        if (this.a == 0) {
            sb.append(" networkTransportType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aobj aobjVar) {
        if (aobjVar == null) {
            throw new NullPointerException("Null effectiveConnectionType");
        }
        this.b = aobjVar;
    }
}
