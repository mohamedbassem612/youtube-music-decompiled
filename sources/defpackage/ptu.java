package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ptu extends doc {
    private final dob c;

    public ptu() {
        super(1, 2);
        this.c = new pts(0);
    }

    @Override // defpackage.doc
    public final void b(dpt dptVar) {
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `_new_gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT)");
        azu.i(dptVar, "INSERT INTO `_new_gnp_accounts` (`id`,`account_specific_id`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources`) SELECT `id`,`account_name`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources` FROM `gnp_accounts`");
        azu.i(dptVar, "DROP TABLE `gnp_accounts`");
        azu.i(dptVar, "ALTER TABLE `_new_gnp_accounts` RENAME TO `gnp_accounts`");
        apb.i(this.c, dptVar);
    }
}
