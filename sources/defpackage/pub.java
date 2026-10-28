package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pub extends doc {
    public pub() {
        super(9, 10);
    }

    @Override // defpackage.doc
    public final void b(dpt dptVar) {
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `gnp_experiments` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_id` TEXT, `experiment_id` INTEGER NOT NULL, `experiment_type` INTEGER, `insertion_time` INTEGER NOT NULL, `experiment_source` INTEGER)");
        azu.i(dptVar, "CREATE INDEX IF NOT EXISTS `index_gnp_experiments_experiment_id` ON `gnp_experiments` (`experiment_id`)");
    }
}
