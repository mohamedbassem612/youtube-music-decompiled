package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efd extends dlz {
    @Override // defpackage.dlz
    protected final String a() {
        return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    }

    @Override // defpackage.dlz
    public final /* bridge */ /* synthetic */ void b(dpb dpbVar, Object obj) {
        ees eesVar = (ees) obj;
        String str = eesVar.c;
        dpbVar.i(1, str);
        dpbVar.g(2, dms.l(eesVar.d));
        dpbVar.i(3, eesVar.e);
        dpbVar.i(4, eesVar.f);
        dyp dypVar = dyp.a;
        dpbVar.e(5, azx.h(eesVar.g));
        dpbVar.e(6, azx.h(eesVar.h));
        dpbVar.g(7, eesVar.i);
        dpbVar.g(8, eesVar.j);
        dpbVar.g(9, eesVar.k);
        dpbVar.g(10, eesVar.m);
        dpbVar.g(11, dms.v(eesVar.A));
        dpbVar.g(12, eesVar.n);
        dpbVar.g(13, eesVar.o);
        dpbVar.g(14, eesVar.p);
        dpbVar.g(15, eesVar.q);
        dpbVar.g(16, eesVar.r ? 1L : 0L);
        dpbVar.g(17, dms.s(eesVar.z));
        dpbVar.g(18, eesVar.s);
        dpbVar.g(19, eesVar.t);
        dpbVar.g(20, eesVar.u);
        dpbVar.g(21, eesVar.v);
        dpbVar.g(22, eesVar.w);
        String str2 = eesVar.x;
        if (str2 == null) {
            dpbVar.h(23);
        } else {
            dpbVar.i(23, str2);
        }
        Boolean bool = eesVar.y;
        Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
        if (numValueOf == null) {
            dpbVar.h(24);
        } else {
            dpbVar.g(24, numValueOf.intValue());
        }
        dyn dynVar = eesVar.l;
        dpbVar.g(25, dms.r(dynVar.j));
        dpbVar.e(26, dms.p(dynVar.b));
        dpbVar.g(27, dynVar.c ? 1L : 0L);
        dpbVar.g(28, dynVar.d ? 1L : 0L);
        dpbVar.g(29, dynVar.e ? 1L : 0L);
        dpbVar.g(30, dynVar.f ? 1L : 0L);
        dpbVar.g(31, dynVar.g);
        dpbVar.g(32, dynVar.h);
        dpbVar.e(33, dms.q(dynVar.i));
        dpbVar.i(34, str);
    }
}
