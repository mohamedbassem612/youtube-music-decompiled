package defpackage;

import com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ptn extends dmt {
    final /* synthetic */ GnpPerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptn(GnpPerAccountRoomDatabase_Impl gnpPerAccountRoomDatabase_Impl) {
        super(3, "84319eff82fa715dd9f27196c67a319c", "6807f1b0919d1d796ba7bf2c8b1a1ac1");
        this.d = gnpPerAccountRoomDatabase_Impl;
    }

    @Override // defpackage.dmt
    public final void a(dpt dptVar) {
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `threads` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `last_updated_version` INTEGER NOT NULL, `last_notification_version` INTEGER NOT NULL, `creation_id` INTEGER NOT NULL, `payload_type` TEXT, `payload` BLOB, `insertion_time_ms` INTEGER NOT NULL, `storage_mode` INTEGER NOT NULL, `opaque_backend_data` BLOB NOT NULL, `thread_type` INTEGER NOT NULL, `type_specific_data` BLOB NOT NULL, `external_experiment_ids` TEXT NOT NULL, `rendering_metadata` BLOB NOT NULL DEFAULT X'', `send_timestamp_usec` INTEGER NOT NULL DEFAULT 0, `notification_type` TEXT DEFAULT NULL)");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        azu.i(dptVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '84319eff82fa715dd9f27196c67a319c')");
    }

    @Override // defpackage.dmt
    public final void b(dpt dptVar) {
        azu.i(dptVar, "DROP TABLE IF EXISTS `threads`");
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
        HashMap map = new HashMap(20);
        map.put("id", new dok("id", "INTEGER", true, 1, null, 1));
        map.put("thread_id", new dok("thread_id", "TEXT", true, 0, null, 1));
        map.put("read_state", new dok("read_state", "INTEGER", true, 0, null, 1));
        map.put("deletion_status", new dok("deletion_status", "INTEGER", true, 0, null, 1));
        map.put("count_behavior", new dok("count_behavior", "INTEGER", true, 0, null, 1));
        map.put("system_tray_behavior", new dok("system_tray_behavior", "INTEGER", true, 0, null, 1));
        map.put("last_updated_version", new dok("last_updated_version", "INTEGER", true, 0, null, 1));
        map.put("last_notification_version", new dok("last_notification_version", "INTEGER", true, 0, null, 1));
        map.put("creation_id", new dok("creation_id", "INTEGER", true, 0, null, 1));
        map.put("payload_type", new dok("payload_type", "TEXT", false, 0, null, 1));
        map.put("payload", new dok("payload", "BLOB", false, 0, null, 1));
        map.put("insertion_time_ms", new dok("insertion_time_ms", "INTEGER", true, 0, null, 1));
        map.put("storage_mode", new dok("storage_mode", "INTEGER", true, 0, null, 1));
        map.put("opaque_backend_data", new dok("opaque_backend_data", "BLOB", true, 0, null, 1));
        map.put("thread_type", new dok("thread_type", "INTEGER", true, 0, null, 1));
        map.put("type_specific_data", new dok("type_specific_data", "BLOB", true, 0, null, 1));
        map.put("external_experiment_ids", new dok("external_experiment_ids", "TEXT", true, 0, null, 1));
        map.put("rendering_metadata", new dok("rendering_metadata", "BLOB", true, 0, "X''", 1));
        map.put("send_timestamp_usec", new dok("send_timestamp_usec", "INTEGER", true, 0, "0", 1));
        map.put("notification_type", new dok("notification_type", "TEXT", false, 0, "NULL", 1));
        don donVar = new don("threads", map, new HashSet(0), new HashSet(0));
        don donVarA = don.a(dptVar, "threads");
        if (api.n(donVar, donVarA)) {
            return new ahek(true, (String) null);
        }
        return new ahek(false, "threads(com.google.android.libraries.notifications.platform.internal.room.ChimeThreadEntity).\n Expected:\n" + api.l(donVar) + "\n Found:\n" + api.l(donVarA));
    }

    @Override // defpackage.dmt
    public final void e() {
    }

    @Override // defpackage.dmt
    public final void f() {
    }
}
