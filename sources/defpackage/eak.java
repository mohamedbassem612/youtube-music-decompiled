package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eak extends doc {
    public static final eak c = new eak();

    private eak() {
        super(7, 8);
    }

    @Override // defpackage.doc
    public final void a(dpd dpdVar) {
        dpdVar.e("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
