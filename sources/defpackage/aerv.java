package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerv {
    public final agfr A;
    private final agfr B;
    private final agfr C;
    private final agfr D;
    private final agfr E;
    private final agfr F;
    private final agfr G;
    private final agfr H;
    private final agfr I;
    private final agfr J;
    private final agfr K;
    private final agfr L;
    public final qti a;
    public final qth b;
    public final agfr c;
    public final agfr d;
    public final agfr e;
    public final agfr f;
    public final agfr g;
    public final agfr h;
    public final agfr i;
    public final agfr j;
    public final agfr k;
    public final agfr l;
    public final agfr m;
    public final agfr n;
    public final agfr o;
    public final agfr p;
    public final agfr q;
    public final agfr r;
    public final agfr s;
    public final agfr t;
    public final agfr u;
    public final agfr v;
    public final agfr w;
    public final agfr x;
    public final agfr y;
    public final agfr z;

    public aerv(ScheduledExecutorService scheduledExecutorService, qtj qtjVar) {
        aguu.al(new adav(this, 11));
        final int i = 13;
        aguu.al(new adav(this, i));
        final int i2 = 4;
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i2) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i3 = 16;
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i3) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i4 = 7;
        aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i4) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i5 = 19;
        aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i5) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i6 = 10;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i6) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i7 = 17;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i7) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i8 = 18;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i8) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.c = aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i5) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i9 = 0;
        this.d = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i9) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i10 = 12;
        this.e = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i10) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i11 = 2;
        aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i11) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i12 = 3;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i12) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i13 = 14;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i13) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i14 = 20;
        this.B = aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i14) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i15 = 1;
        this.f = aguu.al(new aeru(this, i15));
        aguu.al(new aeru(this, i9));
        aguu.al(new adav(this, i10));
        aguu.al(new adav(this, i13));
        final int i16 = 15;
        this.C = aguu.al(new adav(this, i16));
        this.D = aguu.al(new adav(this, i3));
        aguu.al(new adav(this, i7));
        aguu.al(new adav(this, i8));
        this.g = aguu.al(new adav(this, i5));
        aguu.al(new adav(this, i14));
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i15) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        this.E = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i11) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i12) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i17 = 5;
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i17) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i18 = 6;
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i18) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        this.h = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i4) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i19 = 8;
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i19) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i20 = 9;
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i20) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i6) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i21 = 11;
        this.i = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i21) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        final int i22 = 13;
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i22) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        this.F = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i13) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i16) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        this.G = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i7) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        this.H = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i8) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        this.j = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i5) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        this.k = aguu.al(new agfr(this) { // from class: aerr
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i14) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/elements/orientation_check_count", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/identity/who_is_watching_cache_store_status", new qte("status", String.class), new qte("refresh_trigger", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/image_load", new qte("image_service_type", String.class), new qte("cache_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/kazoo/edit_a11y_enabled_count", new qte("is_a11y_enabled", Boolean.class), new qte("kazoo_client", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_bg_notif_sent_status", new qte("status", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/livecreation/screencast_capture_monitor_result", new qte("result", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/livecreation/webrtc_encoder", new qte("encoder", String.class), new qte("codec", String.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/living_room/mdx/mediahub/cast_icon_awareness_state_change", new qte("previous_state", String.class), new qte("current_state", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 8:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/refresh_errors", new qte("pairing_type", String.class), new qte("previous_connection_state", String.class), new qte("error_type", String.class), new qte("refreshed_token_count", Integer.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 9:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/living_room/mdx/short_lived_lounge_token/sessions_started", new qte("pairing_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 10:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/media/scripted/onesie_cache_read", new qte("result", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 11:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/music/empty_autoload_continuation_count", new qte[0]);
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 12:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/feedback_psd_size", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 13:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/music/home/optimistic_fetch/android_prefetch_job_status", new qte("result", String.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 14:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/music/home_autoload_funnel", new qte("step", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 15:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/music/offline/client_smart_downloads_payload_evaluation", new qte("trimming_status", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 16:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/cross_device/cross_device_main_app_status", new qte("status", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    case 17:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/music/offline/missing_offline_music_data", new qte("type", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                    case 18:
                        qtf qtfVarF18 = this.a.a.f("/client_streamz/youtube/music/queue/creation_event_count", new qte("queue_creation_status", String.class));
                        qtfVarF18.c();
                        return qtfVarF18;
                    case 19:
                        qtf qtfVarF19 = this.a.a.f("/client_streamz/youtube/notifications/background_data_count", new qte("background_data_event", String.class));
                        qtfVarF19.c();
                        return qtfVarF19;
                    default:
                        qtf qtfVarF20 = this.a.a.f("/client_streamz/youtube/notifications/direct_reply_count", new qte("event_type", String.class));
                        qtfVarF20.c();
                        return qtfVarF20;
                }
            }
        });
        this.l = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i15) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.m = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i9) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.I = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i12) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i23 = 4;
        this.n = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i23) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.o = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i17) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.p = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i18) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i24 = 8;
        this.q = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i24) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.r = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i20) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i25 = 10;
        this.J = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i25) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i26 = 11;
        aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i26) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i27 = 12;
        this.K = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i27) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.L = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i13) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i16) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i28 = 16;
        this.s = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i28) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.t = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i7) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.u = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i8) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.v = aguu.al(new agfr(this) { // from class: aers
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i14) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/notifications/message_count", new qte("message_type", String.class));
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/notifications/invalidation_count", new qte("invalidation_event", String.class));
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/gaming/iap_flow", new qte("result", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 3:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/notifications/push_count", new qte("event_type", String.class), new qte("is_error", Boolean.class), new qte("is_chime_notif", Boolean.class), new qte("is_background_notif", Boolean.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 4:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/notifications/registration_attempt", new qte("registration_trigger", String.class));
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 5:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/notifications/registration_event", new qte("registration_event", String.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 6:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/notifications/topic_sub_count", new qte("event_type", String.class), new qte("is_success", Boolean.class));
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 7:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/ads/cross_device/cross_device_main_app_success_ping_count", new qte[0]);
                        qtcVarC.c();
                        return qtcVarC;
                    case 8:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/offline/stream_verification", new qte("verify_type", String.class), new qte("verify_result", String.class), new qte("verify_strategy", String.class), new qte("playback_exception_type", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 9:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/offline_privacy_migration", new qte("migration_location", String.class), new qte("migration_state", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 10:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/queue/edit_request_count", new qte("queue_edit_request_type", String.class), new qte("is_error", Boolean.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 11:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/search/suggest/error_count", new qte("suggest_error", String.class), new qte("error_source", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 12:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/sharing/share_executed", new qte("destination", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 13:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_actual_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 14:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/sharing/share_sheet_latency", new qte("status", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 15:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/shorts/initial_playback_missing_psd", new qte[0]);
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 16:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/shorts/reel_smart_scale_cut_off_rate", new qte("video_type", String.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/shorts/reel_smart_scale_mode", new qte("smart_scale_mode", String.class), new qte("video_type", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_not_registered", new qte[0]);
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_changed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_creator_registered_but_not_used", new qte("command_has_rwe_extension", Boolean.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.w = aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i15) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.x = aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i9) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i29 = 2;
        this.y = aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i29) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i30 = 4;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i30) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i17) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i18) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i31 = 7;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i31) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i32 = 8;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i32) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        this.z = aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i20) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i33 = 11;
        this.A = aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i33) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i34 = 12;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i34) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i35 = 13;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i35) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i16) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        final int i36 = 16;
        aguu.al(new agfr(this) { // from class: aert
            public final /* synthetic */ aerv a;

            {
                this.a = this;
            }

            @Override // defpackage.agfr
            public final Object io() {
                switch (i36) {
                    case 0:
                        qtf qtfVarF = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response_not_used", new qte[0]);
                        qtfVarF.c();
                        return qtfVarF;
                    case 1:
                        qtf qtfVarF2 = this.a.a.f("/client_streamz/youtube/shorts/reel_watch_endpoint_inline_response", new qte[0]);
                        qtfVarF2.c();
                        return qtfVarF2;
                    case 2:
                        qtc qtcVarC = this.a.a.c("/client_streamz/youtube/shorts/swipe_back_distance", new qte("end_reason", String.class));
                        qtcVarC.c();
                        return qtcVarC;
                    case 3:
                        qtc qtcVarC2 = this.a.a.c("/client_streamz/youtube/home/optimistic_fetch/context_fence_registered_start_times", new qte[0]);
                        qtcVarC2.c();
                        return qtcVarC2;
                    case 4:
                        qtf qtfVarF3 = this.a.a.f("/client_streamz/youtube/startup/account_scoped_bss_loading", new qte("is_blocking", Boolean.class), new qte("exception", String.class));
                        qtfVarF3.c();
                        return qtfVarF3;
                    case 5:
                        qtf qtfVarF4 = this.a.a.f("/client_streamz/youtube/startup/app_startup_destination", new qte("destination", String.class));
                        qtfVarF4.c();
                        return qtfVarF4;
                    case 6:
                        qtf qtfVarF5 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_bounce", new qte[0]);
                        qtfVarF5.c();
                        return qtfVarF5;
                    case 7:
                        qtf qtfVarF6 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_eligibility_diff", new qte("r2s_diff", Boolean.class), new qte("st_diff", Boolean.class));
                        qtfVarF6.c();
                        return qtfVarF6;
                    case 8:
                        qtf qtfVarF7 = this.a.a.f("/client_streamz/youtube/startup/shorts_first_pause", new qte[0]);
                        qtfVarF7.c();
                        return qtfVarF7;
                    case 9:
                        qtc qtcVarC3 = this.a.a.c("/client_streamz/youtube/system_health/profiling_manager_profile_size_kb", new qte("trigger_type", String.class));
                        qtcVarC3.c();
                        return qtcVarC3;
                    case 10:
                        qtf qtfVarF8 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/external_weak_reference_removed", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF8.c();
                        return qtfVarF8;
                    case 11:
                        qtf qtfVarF9 = this.a.a.f("/client_streamz/youtube/system_health/profiling_manager_triggered_count", new qte("trigger_type", String.class), new qte("status", String.class), new qte("device_brand", String.class));
                        qtfVarF9.c();
                        return qtfVarF9;
                    case 12:
                        qtf qtfVarF10 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_count", new qte("page_type", String.class));
                        qtfVarF10.c();
                        return qtfVarF10;
                    case 13:
                        qtf qtfVarF11 = this.a.a.f("/client_streamz/youtube/thumbnail_loading_error_count", new qte("page_type", String.class));
                        qtfVarF11.c();
                        return qtfVarF11;
                    case 14:
                        qtf qtfVarF12 = this.a.a.f("/client_streamz/youtube/home/optimistic_fetch/context_fence_state_dropped", new qte("reason", String.class));
                        qtfVarF12.c();
                        return qtfVarF12;
                    case 15:
                        qtc qtcVarC4 = this.a.a.c("/client_streamz/youtube/video_ads/cue_duration", new qte("cue_duration_state", String.class), new qte("is_forced_return", Boolean.class));
                        qtcVarC4.c();
                        return qtcVarC4;
                    case 16:
                        qtf qtfVarF13 = this.a.a.f("/client_streamz/youtube/video_ads/cue_state", new qte("is_cue_start_time_changed", Boolean.class), new qte("has_predict_start_cuepoint", Boolean.class), new qte("has_start_cuepoint", Boolean.class), new qte("has_continue_cuepoint", Boolean.class), new qte("has_stop_cuepoint", Boolean.class));
                        qtfVarF13.c();
                        return qtfVarF13;
                    case 17:
                        qtf qtfVarF14 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/missing_identifier", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF14.c();
                        return qtfVarF14;
                    case 18:
                        qtf qtfVarF15 = this.a.a.f("/client_streamz/youtube/ads/persistent_state_controller/state_reused_after_eviction", new qte("state_entry_data_type", String.class), new qte("exp_tag", String.class));
                        qtfVarF15.c();
                        return qtfVarF15;
                    case 19:
                        qtf qtfVarF16 = this.a.a.f("/client_streamz/youtube/elements/mismatched_orientation", new qte("is_orientation_fix_enabled", Boolean.class));
                        qtfVarF16.c();
                        return qtfVarF16;
                    default:
                        qtf qtfVarF17 = this.a.a.f("/client_streamz/youtube/identity/access_token_refresh_failure", new qte("error_category", String.class), new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
                        qtfVarF17.c();
                        return qtfVarF17;
                }
            }
        });
        qti qtiVarD = qti.d("youtube_android");
        this.a = qtiVarD;
        qth qthVar = qtiVarD.a;
        if (qthVar != null) {
            this.b = qthVar;
            ((qtl) qthVar).b = qtjVar;
        } else {
            qtl qtlVar = new qtl(qtjVar, scheduledExecutorService, qtiVarD);
            qtiVarD.a = qtlVar;
            this.b = qtlVar;
        }
    }

    public final void a(String str, boolean z, String str2) {
        ((qtf) this.B.io()).b(1L, str, Boolean.valueOf(z), str2);
    }

    public final void b(String str) {
        ((qtf) this.F.io()).b(1L, str);
    }

    public final void c(String str) {
        ((qtf) this.H.io()).b(1L, str);
    }

    public final void d(String str, boolean z) {
        ((qtf) this.J.io()).b(1L, str, Boolean.valueOf(z));
    }

    public final void e(String str) {
        ((qtf) this.K.io()).b(1L, str);
    }

    public final void f(double d, String str) {
        ((qtc) this.L.io()).b(d, str);
    }

    public final void g() {
        ((qtf) this.G.io()).b(1L, "VIDEO");
    }

    public final void h(String str) {
        ((qtf) this.C.io()).b(1L, str, "ACCOUNT_LIST_ITEMS");
    }

    public final void i(String str) {
        ((qtf) this.D.io()).b(1L, str, "ACCOUNT_LIST_ITEMS");
    }

    public final void j(String str, boolean z) {
        ((qtf) this.E.io()).b(1L, "GLIDE", str, Boolean.valueOf(z));
    }

    public final void k(String str, boolean z, boolean z2) {
        ((qtf) this.I.io()).b(1L, str, Boolean.FALSE, Boolean.valueOf(z), Boolean.valueOf(z2));
    }
}
