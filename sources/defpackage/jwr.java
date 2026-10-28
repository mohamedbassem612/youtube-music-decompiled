package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwr {
    public static final xgl a;
    public static final xgl b;
    public static final xgl c;
    public static final xgl d;
    public static final xgl e;

    static {
        xgl.h("gads:flags_check_if_updating_v3:enabled", false);
        a = xgl.h("gads:disable_adapter_flag_shared_pref_listener_v3:enabled", false);
        b = xgl.h("gads:disable_flag_shared_pref_listener_v3:enabled", false);
        xgl.h("gads:disable_sdkcore_refresh_client:enabled", false);
        c = xgl.h("gads:enable_adapter_flags:enabled", false);
        xgl.h("gads:include_package_name_v3:enabled", false);
        xgl.h("gads:js_flags:mf", false);
        xgl.g("gads:js_flags:update_interval", 14400000L);
        xgl.h("gads:persist_js_flag:ars", true);
        xgl.h("gads:persist_js_flag:as", true);
        xgl.h("gads:persist_js_flag:scar", true);
        d = xgl.h("gads:read_local_flags_v3:enabled", false);
        e = xgl.h("gads:read_local_flags_cld_v3:enabled", false);
        xgl.h("gads:save_flags_on_background_thread:enabled", false);
        xgl.h("gads:write_local_flags_cld_v3:enabled", false);
        xgl.h("gads:write_local_flags_client_v3:enabled", false);
        xgl.h("gads:write_local_flags_service_v3:enabled", false);
    }
}
