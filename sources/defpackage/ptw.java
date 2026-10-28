package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ptw extends doc {
    public ptw() {
        super(3, 4);
    }

    @Override // defpackage.doc
    public final void b(dpt dptVar) {
        azu.i(dptVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `sync_version` INTEGER NOT NULL DEFAULT 0");
        azu.i(dptVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0");
        azu.i(dptVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0");
        azu.i(dptVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `first_registration_version` INTEGER NOT NULL DEFAULT 0");
    }
}
