package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class epg {
    public Object a;
    public epk b;
    public epl c = new epl();
    private boolean d;

    public final void a(Object obj) {
        this.d = true;
        epk epkVar = this.b;
        if (epkVar == null || !epkVar.b.c(obj)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    protected final void finalize() {
        epl eplVar;
        epk epkVar = this.b;
        if (epkVar != null && !epkVar.isDone()) {
            epkVar.a(new eph("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(String.valueOf(this.a)))));
        }
        if (this.d || (eplVar = this.c) == null) {
            return;
        }
        eplVar.c(null);
    }
}
