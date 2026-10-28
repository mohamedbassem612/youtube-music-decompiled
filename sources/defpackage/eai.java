package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eai extends doc {
    public static final eai c = new eai();

    private eai() {
        super(4, 5);
    }

    @Override // defpackage.doc
    public final void a(dpd dpdVar) {
        dpdVar.e("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        dpdVar.e("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
