package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eal extends doc {
    public static final eal c = new eal();

    private eal() {
        super(8, 9);
    }

    @Override // defpackage.doc
    public final void a(dpd dpdVar) {
        dpdVar.e("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
