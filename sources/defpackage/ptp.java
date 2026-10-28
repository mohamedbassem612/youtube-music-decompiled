package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ptp extends dmt {
    final /* synthetic */ GnpPerDeviceRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptp(GnpPerDeviceRoomDatabase_Impl gnpPerDeviceRoomDatabase_Impl) {
        super(1, "8ad347fd733bd73ae79a04cad7afe8a7", "f47de4f50f676117a489ac8cd91e3f8f");
        this.d = gnpPerDeviceRoomDatabase_Impl;
    }

    @Override // defpackage.dmt
    public final void a(dpt dptVar) {
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `gnp_experiments` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_name` TEXT NOT NULL, `experiment_id` INTEGER NOT NULL, `experiment_type` INTEGER NOT NULL, `insertion_time` INTEGER NOT NULL, `experiment_source` INTEGER NOT NULL)");
        azu.i(dptVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_gnp_experiments_experiment_id` ON `gnp_experiments` (`experiment_id`)");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        azu.i(dptVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8ad347fd733bd73ae79a04cad7afe8a7')");
    }

    @Override // defpackage.dmt
    public final void b(dpt dptVar) {
        azu.i(dptVar, "DROP TABLE IF EXISTS `gnp_experiments`");
    }

    @Override // defpackage.dmt
    public final void c(dpt dptVar) throws Exception {
        this.d.t(dptVar);
    }

    @Override // defpackage.dmt
    public final void d(dpt dptVar) throws Exception {
        apb.h(dptVar);
    }

    @Override // defpackage.dmt
    public final ahek g(dpt dptVar) {
        HashMap map = new HashMap(6);
        map.put("id", new dok("id", "INTEGER", true, 1, null, 1));
        map.put("account_name", new dok("account_name", "TEXT", true, 0, null, 1));
        map.put("experiment_id", new dok("experiment_id", "INTEGER", true, 0, null, 1));
        map.put("experiment_type", new dok("experiment_type", "INTEGER", true, 0, null, 1));
        map.put("insertion_time", new dok("insertion_time", "INTEGER", true, 0, null, 1));
        map.put("experiment_source", new dok("experiment_source", "INTEGER", true, 0, null, 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new dom("index_gnp_experiments_experiment_id", true, Arrays.asList("experiment_id"), Arrays.asList("ASC")));
        don donVar = new don("gnp_experiments", map, hashSet, hashSet2);
        don donVarA = don.a(dptVar, "gnp_experiments");
        if (api.n(donVar, donVarA)) {
            return new ahek(true, (String) null);
        }
        return new ahek(false, "gnp_experiments(com.google.android.libraries.notifications.platform.internal.room.GnpExperimentEntity).\n Expected:\n" + api.l(donVar) + "\n Found:\n" + api.l(donVarA));
    }

    @Override // defpackage.dmt
    public final void e() {
    }

    @Override // defpackage.dmt
    public final void f() {
    }
}
