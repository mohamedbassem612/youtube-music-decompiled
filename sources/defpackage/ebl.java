package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebl extends dmt {
    final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebl(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.dmt
    public final void a(dpt dptVar) {
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        azu.i(dptVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        azu.i(dptVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        azu.i(dptVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        azu.i(dptVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        azu.i(dptVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        azu.i(dptVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        azu.i(dptVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        azu.i(dptVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.dmt
    public final void b(dpt dptVar) {
        azu.i(dptVar, "DROP TABLE IF EXISTS `Dependency`");
        azu.i(dptVar, "DROP TABLE IF EXISTS `WorkSpec`");
        azu.i(dptVar, "DROP TABLE IF EXISTS `WorkTag`");
        azu.i(dptVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
        azu.i(dptVar, "DROP TABLE IF EXISTS `WorkName`");
        azu.i(dptVar, "DROP TABLE IF EXISTS `WorkProgress`");
        azu.i(dptVar, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.dmt
    public final void c(dpt dptVar) throws Exception {
        azu.i(dptVar, "PRAGMA foreign_keys = ON");
        this.d.t(dptVar);
    }

    @Override // defpackage.dmt
    public final void d(dpt dptVar) throws Exception {
        apb.h(dptVar);
    }

    @Override // defpackage.dmt
    public final ahek g(dpt dptVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new dok("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new dok("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List listSingletonList = Collections.singletonList("work_spec_id");
        listSingletonList.getClass();
        List listSingletonList2 = Collections.singletonList("id");
        listSingletonList2.getClass();
        linkedHashSet.add(new dol("WorkSpec", "CASCADE", "CASCADE", listSingletonList, listSingletonList2));
        List listSingletonList3 = Collections.singletonList("prerequisite_id");
        listSingletonList3.getClass();
        List listSingletonList4 = Collections.singletonList("id");
        listSingletonList4.getClass();
        linkedHashSet.add(new dol("WorkSpec", "CASCADE", "CASCADE", listSingletonList3, listSingletonList4));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        List listSingletonList5 = Collections.singletonList("work_spec_id");
        listSingletonList5.getClass();
        List listSingletonList6 = Collections.singletonList("ASC");
        listSingletonList6.getClass();
        linkedHashSet2.add(new dom("index_Dependency_work_spec_id", false, listSingletonList5, listSingletonList6));
        List listSingletonList7 = Collections.singletonList("prerequisite_id");
        listSingletonList7.getClass();
        List listSingletonList8 = Collections.singletonList("ASC");
        listSingletonList8.getClass();
        linkedHashSet2.add(new dom("index_Dependency_prerequisite_id", false, listSingletonList7, listSingletonList8));
        don donVar = new don("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        don donVar2 = new don("Dependency", ape.h(dptVar, "Dependency"), ape.i(dptVar, "Dependency"), ape.j(dptVar, "Dependency"));
        if (!api.n(donVar, donVar2)) {
            return new ahek(false, a.bZ(donVar2, donVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new dok("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new dok("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new dok("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new dok("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new dok("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new dok("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new dok("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new dok("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new dok("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new dok("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new dok("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new dok("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new dok("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new dok("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new dok("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new dok("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new dok("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new dok("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new dok("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new dok("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new dok("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new dok("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new dok("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new dok("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new dok("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new dok("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new dok("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new dok("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new dok("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new dok("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new dok("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new dok("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new dok("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        List listSingletonList9 = Collections.singletonList("schedule_requested_at");
        listSingletonList9.getClass();
        List listSingletonList10 = Collections.singletonList("ASC");
        listSingletonList10.getClass();
        linkedHashSet4.add(new dom("index_WorkSpec_schedule_requested_at", false, listSingletonList9, listSingletonList10));
        List listSingletonList11 = Collections.singletonList("last_enqueue_time");
        listSingletonList11.getClass();
        List listSingletonList12 = Collections.singletonList("ASC");
        listSingletonList12.getClass();
        linkedHashSet4.add(new dom("index_WorkSpec_last_enqueue_time", false, listSingletonList11, listSingletonList12));
        don donVar3 = new don("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        don donVar4 = new don("WorkSpec", ape.h(dptVar, "WorkSpec"), ape.i(dptVar, "WorkSpec"), ape.j(dptVar, "WorkSpec"));
        if (!api.n(donVar3, donVar4)) {
            return new ahek(false, a.bZ(donVar4, donVar3, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new dok("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new dok("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        List listSingletonList13 = Collections.singletonList("work_spec_id");
        listSingletonList13.getClass();
        List listSingletonList14 = Collections.singletonList("id");
        listSingletonList14.getClass();
        linkedHashSet5.add(new dol("WorkSpec", "CASCADE", "CASCADE", listSingletonList13, listSingletonList14));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        List listSingletonList15 = Collections.singletonList("work_spec_id");
        listSingletonList15.getClass();
        List listSingletonList16 = Collections.singletonList("ASC");
        listSingletonList16.getClass();
        linkedHashSet6.add(new dom("index_WorkTag_work_spec_id", false, listSingletonList15, listSingletonList16));
        don donVar5 = new don("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        don donVar6 = new don("WorkTag", ape.h(dptVar, "WorkTag"), ape.i(dptVar, "WorkTag"), ape.j(dptVar, "WorkTag"));
        if (!api.n(donVar5, donVar6)) {
            return new ahek(false, a.bZ(donVar6, donVar5, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new dok("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new dok("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new dok("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        List listSingletonList17 = Collections.singletonList("work_spec_id");
        listSingletonList17.getClass();
        List listSingletonList18 = Collections.singletonList("id");
        listSingletonList18.getClass();
        linkedHashSet7.add(new dol("WorkSpec", "CASCADE", "CASCADE", listSingletonList17, listSingletonList18));
        don donVar7 = new don("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        don donVar8 = new don("SystemIdInfo", ape.h(dptVar, "SystemIdInfo"), ape.i(dptVar, "SystemIdInfo"), ape.j(dptVar, "SystemIdInfo"));
        if (!api.n(donVar7, donVar8)) {
            return new ahek(false, a.bZ(donVar8, donVar7, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new dok("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new dok("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        List listSingletonList19 = Collections.singletonList("work_spec_id");
        listSingletonList19.getClass();
        List listSingletonList20 = Collections.singletonList("id");
        listSingletonList20.getClass();
        linkedHashSet8.add(new dol("WorkSpec", "CASCADE", "CASCADE", listSingletonList19, listSingletonList20));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        List listSingletonList21 = Collections.singletonList("work_spec_id");
        listSingletonList21.getClass();
        List listSingletonList22 = Collections.singletonList("ASC");
        listSingletonList22.getClass();
        linkedHashSet9.add(new dom("index_WorkName_work_spec_id", false, listSingletonList21, listSingletonList22));
        don donVar9 = new don("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        don donVar10 = new don("WorkName", ape.h(dptVar, "WorkName"), ape.i(dptVar, "WorkName"), ape.j(dptVar, "WorkName"));
        if (!api.n(donVar9, donVar10)) {
            return new ahek(false, a.bZ(donVar10, donVar9, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new dok("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new dok("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        List listSingletonList23 = Collections.singletonList("work_spec_id");
        listSingletonList23.getClass();
        List listSingletonList24 = Collections.singletonList("id");
        listSingletonList24.getClass();
        linkedHashSet10.add(new dol("WorkSpec", "CASCADE", "CASCADE", listSingletonList23, listSingletonList24));
        don donVar11 = new don("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        don donVar12 = new don("WorkProgress", ape.h(dptVar, "WorkProgress"), ape.i(dptVar, "WorkProgress"), ape.j(dptVar, "WorkProgress"));
        if (!api.n(donVar11, donVar12)) {
            return new ahek(false, a.bZ(donVar12, donVar11, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new dok("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new dok("long_value", "INTEGER", false, 0, null, 1));
        don donVar13 = new don("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        don donVar14 = new don("Preference", ape.h(dptVar, "Preference"), ape.i(dptVar, "Preference"), ape.j(dptVar, "Preference"));
        return !api.n(donVar13, donVar14) ? new ahek(false, a.bZ(donVar14, donVar13, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new ahek(true, (String) null);
    }

    @Override // defpackage.dmt
    public final void e() {
    }

    @Override // defpackage.dmt
    public final void f() {
    }
}
