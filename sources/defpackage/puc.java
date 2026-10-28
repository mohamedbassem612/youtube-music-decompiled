package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class puc extends dmt {
    final /* synthetic */ GnpRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puc(GnpRoomDatabase_Impl gnpRoomDatabase_Impl) {
        super(11, "96ef747075977340544a7fd178d7b145", "971093f20d339fcd3f21f8ebaf20b8db");
        this.d = gnpRoomDatabase_Impl;
    }

    @Override // defpackage.dmt
    public final void a(dpt dptVar) {
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `actual_account_name` TEXT, `actual_account_oid` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT, `representative_target_id` TEXT, `sync_version` INTEGER NOT NULL DEFAULT 0, `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0, `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0, `first_registration_version` INTEGER NOT NULL DEFAULT 0, `internal_target_id` TEXT, `fitbit_decoded_id` INTEGER NOT NULL DEFAULT 0)");
        azu.i(dptVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_gnp_accounts_account_specific_id` ON `gnp_accounts` (`account_specific_id`)");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        azu.i(dptVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96ef747075977340544a7fd178d7b145')");
    }

    @Override // defpackage.dmt
    public final void b(dpt dptVar) {
        azu.i(dptVar, "DROP TABLE IF EXISTS `gnp_accounts`");
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
        HashMap map = new HashMap(16);
        map.put("id", new dok("id", "INTEGER", true, 1, null, 1));
        map.put("account_specific_id", new dok("account_specific_id", "TEXT", false, 0, null, 1));
        map.put("account_type", new dok("account_type", "INTEGER", false, 0, null, 1));
        map.put("obfuscated_gaia_id", new dok("obfuscated_gaia_id", "TEXT", false, 0, null, 1));
        map.put("actual_account_name", new dok("actual_account_name", "TEXT", false, 0, null, 1));
        map.put("actual_account_oid", new dok("actual_account_oid", "TEXT", false, 0, null, 1));
        map.put("registration_status", new dok("registration_status", "INTEGER", true, 0, null, 1));
        map.put("registration_id", new dok("registration_id", "TEXT", false, 0, null, 1));
        map.put("sync_sources", new dok("sync_sources", "TEXT", false, 0, null, 1));
        map.put("representative_target_id", new dok("representative_target_id", "TEXT", false, 0, null, 1));
        map.put("sync_version", new dok("sync_version", "INTEGER", true, 0, "0", 1));
        map.put("last_registration_time_ms", new dok("last_registration_time_ms", "INTEGER", true, 0, "0", 1));
        map.put("last_registration_request_hash", new dok("last_registration_request_hash", "INTEGER", true, 0, "0", 1));
        map.put("first_registration_version", new dok("first_registration_version", "INTEGER", true, 0, "0", 1));
        map.put("internal_target_id", new dok("internal_target_id", "TEXT", false, 0, null, 1));
        map.put("fitbit_decoded_id", new dok("fitbit_decoded_id", "INTEGER", true, 0, "0", 1));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new dom("index_gnp_accounts_account_specific_id", true, Arrays.asList("account_specific_id"), Arrays.asList("ASC")));
        don donVar = new don("gnp_accounts", map, hashSet, hashSet2);
        don donVarA = don.a(dptVar, "gnp_accounts");
        if (api.n(donVar, donVarA)) {
            return new ahek(true, (String) null);
        }
        return new ahek(false, "gnp_accounts(com.google.android.libraries.notifications.platform.data.entities.GnpAccount).\n Expected:\n" + api.l(donVar) + "\n Found:\n" + api.l(donVarA));
    }

    @Override // defpackage.dmt
    public final void e() {
    }

    @Override // defpackage.dmt
    public final void f() {
    }
}
