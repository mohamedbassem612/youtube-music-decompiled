package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eac extends doc {
    public static final eac c = new eac();

    private eac() {
        super(11, 12);
    }

    @Override // defpackage.doc
    public final void a(dpd dpdVar) {
        dpdVar.e("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
