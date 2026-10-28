package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ptm extends doc {
    public ptm() {
        super(2, 3);
    }

    @Override // defpackage.doc
    public final void b(dpt dptVar) {
        azu.i(dptVar, "ALTER TABLE `threads` ADD COLUMN `send_timestamp_usec` INTEGER NOT NULL DEFAULT 0");
        azu.i(dptVar, "ALTER TABLE `threads` ADD COLUMN `notification_type` TEXT DEFAULT NULL");
    }
}
