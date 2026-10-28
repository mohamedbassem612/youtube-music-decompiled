package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebf extends doc {
    public ebf() {
        super(18, 19);
    }

    @Override // defpackage.doc
    public final void b(dpt dptVar) {
        azu.i(dptVar, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
