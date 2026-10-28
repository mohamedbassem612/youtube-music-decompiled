package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwq {
    public static final xgl a;
    public static final xgl b;

    static {
        xgl.h("gads:always_enable_crash_loop_counter_v3:enabled", false);
        xgl.h("gads:crash_loop_stats_signal_v3:enabled", false);
        xgl.h("gads:crash_without_flag_write_count_v3:enabled", false);
        a = xgl.g("gads:crash_without_write_reset_v3:count", -1L);
        xgl.h("gads:init_without_flag_write_count_v3:enabled", false);
        b = xgl.g("gads:init_without_write_reset_v3:count", -1L);
        xgl.h("gads:reset_app_settings_v3:enabled", false);
        xgl.h("gads:reset_counts_on_failure_service_v3:enabled", false);
        xgl.h("gads:reset_counts_on_local_flag_save_v3:enabled", false);
        xgl.h("gads:reset_counts_on_successful_service_v3:enabled", false);
    }
}
