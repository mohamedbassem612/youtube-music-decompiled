package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eah extends doc {
    public static final eah c = new eah();

    private eah() {
        super(3, 4);
    }

    @Override // defpackage.doc
    public final void a(dpd dpdVar) {
        dpdVar.e("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
