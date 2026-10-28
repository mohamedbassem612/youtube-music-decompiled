package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pwf {
    public final Object A;
    public final Object B;
    public final Object C;
    public final awmd a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public pwf(ScheduledExecutorService scheduledExecutorService, qtj qtjVar, Application application) {
        this.c = aguu.al(new cbr(this, 20));
        final int i = 0;
        this.d = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        final int i2 = 13;
        this.e = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i2) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        final int i3 = 4;
        this.f = aguu.al(new pwe(this, i3));
        final int i4 = 5;
        this.g = aguu.al(new pwe(this, i4));
        final int i5 = 6;
        this.h = aguu.al(new pwe(this, i5));
        final int i6 = 7;
        this.i = aguu.al(new pwe(this, i6));
        final int i7 = 8;
        this.j = aguu.al(new pwe(this, i7));
        final int i8 = 9;
        this.k = aguu.al(new pwe(this, i8));
        final int i9 = 10;
        this.l = aguu.al(new pwe(this, i9));
        this.m = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i9) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        final int i10 = 1;
        this.n = aguu.al(new pwe(this, i10));
        final int i11 = 11;
        this.o = aguu.al(new pwe(this, i11));
        final int i12 = 12;
        this.p = aguu.al(new pwe(this, i12));
        this.q = aguu.al(new pwe(this, i2));
        final int i13 = 14;
        this.r = aguu.al(new pwe(this, i13));
        final int i14 = 15;
        this.s = aguu.al(new pwe(this, i14));
        final int i15 = 16;
        aguu.al(new pwe(this, i15));
        final int i16 = 17;
        aguu.al(new pwe(this, i16));
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i10) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        final int i17 = 2;
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i17) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        final int i18 = 3;
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i18) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i3) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i4) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i5) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i6) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i7) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i8) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i11) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        this.t = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i12) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        this.u = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i13) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        this.v = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i14) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i15) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        this.w = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i16) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        final int i19 = 18;
        this.x = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i19) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        final int i20 = 19;
        this.y = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i20) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        final int i21 = 20;
        this.z = aguu.al(new agfr(this) { // from class: pwd
            public final /* synthetic */ pwf a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i21) {
                    case 0:
                        qtc qtcVarC = ((qti) this.a.a).c("/client_streamz/gnp_android/operation_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("domain", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 1:
                        qtf qtfVarF = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_promotions_fetched", new qte("package_name", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 2:
                        qtf qtfVarF2 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_network_library_count", new qte("package_name", String.class), new qte("status", String.class), new qte("fetch_reason", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 3:
                        qtc qtcVarC2 = ((qti) this.a.a).c("/client_streamz/gnp_android/growthkit_sync_latency", new qte("package_name", String.class), new qte("fetch_reason", String.class), new qte("promotions_synced", Integer.class));
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtc qtcVarC3 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 5:
                        qtc qtcVarC4 = ((qti) this.a.a).c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new qte("package_name", String.class), new qte("did_fail", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 6:
                        qtf qtfVarF3 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/username_change_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 7:
                        qtf qtfVarF4 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/account/account_removal_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_failure", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 8:
                        qtf qtfVarF5 = ((qti) this.a.a).f("/client_streamz/gnp_android/customtabs/customtab_launch_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("url_type", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 9:
                        qtf qtfVarF6 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_browser_redirect_count", new qte("app_package_name", String.class), new qte("is_chrome_ecct_supported", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 10:
                        qtf qtfVarF7 = ((qti) this.a.a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class), new qte("registration_reason", String.class), new qte("target_type", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 11:
                        qtf qtfVarF8 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_hyperlinks_count", new qte("app_package_name", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 12:
                        qtf qtfVarF9 = ((qti) this.a.a).f("/client_streamz/gnp_android/blocking_notification_receiver_exception", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_timeout_exception", Boolean.class), new qte("exception_class_name", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 13:
                        qtc qtcVarC5 = ((qti) this.a.a).c("/client_streamz/gnp_android/gnp_job_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                        qtcVarC5.c();
                        return qtcVarC5;
                    case 14:
                        qtf qtfVarF10 = ((qti) this.a.a).f("/client_streamz/gnp_android/device_payload_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("source", String.class), new qte("is_pseudonymous", Boolean.class), new qte("is_null", Boolean.class), new qte("result", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 15:
                        qtf qtfVarF11 = ((qti) this.a.a).f("/client_streamz/gnp_android/system_tray/notification_post_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("is_summary_notification", Boolean.class), new qte("exceed_post_threshold", Boolean.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 16:
                        qtf qtfVarF12 = ((qti) this.a.a).f("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new qte("app_package_name", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 17:
                        qtf qtfVarF13 = ((qti) this.a.a).f("/client_streamz/gnp_android/storage/database_migration", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 18:
                        qtf qtfVarF14 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("is_success", Boolean.class), new qte("asset_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 19:
                        qtf qtfVarF15 = ((qti) this.a.a).f("/client_streamz/gnp_android/media/image_download_dedup_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("uri_type", String.class), new qte("image_source", String.class), new qte("asset_type", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    default:
                        qtf qtfVarF16 = ((qti) this.a.a).f("/client_streamz/gnp_android/auth/get_spatula_header_result", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                }
            }
        });
        this.A = aguu.al(new pwe(this, 0));
        this.B = aguu.al(new pwe(this, 2));
        this.C = aguu.al(new pwe(this, i18));
        qti qtiVarD = qti.d("gnp_android");
        this.a = qtiVarD;
        qth qthVar = qtiVarD.a;
        if (qthVar == null) {
            this.b = qtl.a(qtjVar, scheduledExecutorService, qtiVarD, application);
        } else {
            this.b = qthVar;
            ((qtl) qthVar).b = qtjVar;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void a(String str, String str2, String str3, String str4, String str5) {
        ((qtf) this.A.io()).b(1L, str, str2, str3, str4, str5);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void b(String str, String str2, boolean z, String str3) {
        ((qtf) this.t.io()).b(1L, str, str2, Boolean.valueOf(z), str3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void c(String str, String str2, int i, boolean z, String str3, boolean z2, String str4, String str5, boolean z3) {
        ((qtf) this.q.io()).b(1L, str, str2, Integer.valueOf(i), Boolean.valueOf(z), str3, Boolean.valueOf(z2), str4, str5, Boolean.valueOf(z3));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void d(String str, String str2, int i, boolean z, String str3, String str4) {
        ((qtf) this.r.io()).b(1L, str, str2, Integer.valueOf(i), Boolean.valueOf(z), str3, str4);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void e(String str, String str2, String str3) {
        ((qtf) this.w.io()).b(1L, str, str2, str3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void f(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        ((qtf) this.u.io()).b(1L, str, str2, str3, Boolean.valueOf(z), Boolean.valueOf(z2), str4);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void g(String str, String str2, String str3) {
        ((qtf) this.z.io()).b(1L, str, str2, str3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void h(String str, String str2, int i, String str3, String str4, String str5, boolean z) {
        ((qtf) this.c.io()).b(1L, str, str2, Integer.valueOf(i), str3, str4, str5, Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void i(String str, String str2, String str3, String str4, String str5) {
        ((qtf) this.C.io()).b(1L, str, str2, str3, str4, str5);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void j(String str, String str2, String str3, String str4, String str5) {
        ((qtf) this.m.io()).b(1L, str, str2, str3, str4, str5);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void k(int i, String str, String str2, String str3) {
        ((qtf) this.l.io()).b(i, str, str2, str3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void l(String str, String str2, int i, String str3) {
        ((qtf) this.o.io()).b(1L, str, str2, Integer.valueOf(i), str3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void m(String str, String str2, int i, String str3) {
        ((qtf) this.i.io()).b(1L, str, str2, Integer.valueOf(i), str3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void n(double d, String str, String str2, String str3, String str4, String str5) {
        ((qtc) this.B.io()).b(d, str, str2, str3, str4, str5);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [agfr, java.lang.Object] */
    public final void o(double d, String str, String str2, int i, String str3) {
        ((qtc) this.d.io()).b(d, str, str2, Integer.valueOf(i), str3);
    }

    public pwf(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14, awmd awmdVar15, awmd awmdVar16, awmd awmdVar17, awmd awmdVar18, awmd awmdVar19, awmd awmdVar20, awmd awmdVar21, awmd awmdVar22, awmd awmdVar23, awmd awmdVar24, awmd awmdVar25, awmd awmdVar26, awmd awmdVar27, awmd awmdVar28, awmd awmdVar29) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.C = awmdVar2;
        awmdVar3.getClass();
        this.l = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
        this.n = awmdVar5;
        awmdVar6.getClass();
        this.h = awmdVar6;
        awmdVar7.getClass();
        this.p = awmdVar7;
        this.j = awmdVar8;
        this.v = awmdVar9;
        awmdVar10.getClass();
        this.t = awmdVar10;
        awmdVar11.getClass();
        this.A = awmdVar11;
        awmdVar12.getClass();
        this.d = awmdVar12;
        awmdVar13.getClass();
        this.i = awmdVar13;
        awmdVar14.getClass();
        this.k = awmdVar14;
        this.s = awmdVar15;
        this.x = awmdVar16;
        awmdVar17.getClass();
        this.m = awmdVar17;
        this.y = awmdVar18;
        this.c = awmdVar19;
        awmdVar20.getClass();
        this.r = awmdVar20;
        this.B = awmdVar21;
        this.o = awmdVar22;
        this.z = awmdVar23;
        this.f = awmdVar24;
        this.q = awmdVar25;
        this.g = awmdVar26;
        awmdVar27.getClass();
        this.w = awmdVar27;
        awmdVar28.getClass();
        this.e = awmdVar28;
        this.u = awmdVar29;
    }
}
