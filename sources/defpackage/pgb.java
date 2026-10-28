package defpackage;

import com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pgb extends dmt {
    final /* synthetic */ ChimePerAccountRoomDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgb(ChimePerAccountRoomDatabase_Impl chimePerAccountRoomDatabase_Impl) {
        super(2, "4dff45f02f3e689be0f6f1524b0cca0c", "557f59ae5db83868cf5aa3ce16101df1");
        this.d = chimePerAccountRoomDatabase_Impl;
    }

    @Override // defpackage.dmt
    public final void a(dpt dptVar) {
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `chime_thread_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `thread_id` TEXT NOT NULL, `last_updated_version` INTEGER NOT NULL, `read_state` INTEGER NOT NULL, `deletion_status` INTEGER NOT NULL, `count_behavior` INTEGER NOT NULL, `system_tray_behavior` INTEGER NOT NULL, `modified_timestamp` INTEGER NOT NULL)");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        azu.i(dptVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4dff45f02f3e689be0f6f1524b0cca0c')");
    }

    @Override // defpackage.dmt
    public final void b(dpt dptVar) {
        azu.i(dptVar, "DROP TABLE IF EXISTS `chime_thread_states`");
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
        HashMap map = new HashMap(8);
        map.put("id", new dok("id", "INTEGER", true, 1, null, 1));
        map.put("thread_id", new dok("thread_id", "TEXT", true, 0, null, 1));
        map.put("last_updated_version", new dok("last_updated_version", "INTEGER", true, 0, null, 1));
        map.put("read_state", new dok("read_state", "INTEGER", true, 0, null, 1));
        map.put("deletion_status", new dok("deletion_status", "INTEGER", true, 0, null, 1));
        map.put("count_behavior", new dok("count_behavior", "INTEGER", true, 0, null, 1));
        map.put("system_tray_behavior", new dok("system_tray_behavior", "INTEGER", true, 0, null, 1));
        map.put("modified_timestamp", new dok("modified_timestamp", "INTEGER", true, 0, null, 1));
        don donVar = new don("chime_thread_states", map, new HashSet(0), new HashSet(0));
        don donVarA = don.a(dptVar, "chime_thread_states");
        if (api.n(donVar, donVarA)) {
            return new ahek(true, (String) null);
        }
        return new ahek(false, "chime_thread_states(com.google.android.libraries.notifications.internal.storage.impl.room.ChimeThreadState).\n Expected:\n" + api.l(donVar) + "\n Found:\n" + api.l(donVarA));
    }

    @Override // defpackage.dmt
    public final void e() {
    }

    @Override // defpackage.dmt
    public final void f() {
    }
}
