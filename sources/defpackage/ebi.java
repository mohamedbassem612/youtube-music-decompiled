package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebi extends doc {
    public ebi() {
        super(22, 23);
    }

    @Override // defpackage.doc
    public final void b(dpt dptVar) {
        azu.i(dptVar, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
