package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aurm implements aurl {
    private static final qmm a = new qmm(aurg.c, 86);

    @Override // defpackage.aurl
    public final long A() {
        return ((Long) a.b(41, "measurement.sgtm.batch.retry_max_count", -1L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long B() {
        return ((Long) a.b(42, "measurement.sgtm.batch.retry_max_wait", 7200000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long C() {
        return ((Long) a.b(43, "45786130", 20000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long D() {
        return ((Long) a.b(45, "45811200", 3600000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long E() {
        return ((Long) a.b(46, "45782767", 300000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long F() {
        return ((Long) a.b(50, "45784435", 50L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long G() {
        return ((Long) a.b(51, "measurement.sgtm.upload.batches_retrieval_limit", 5L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long H() {
        return ((Long) a.b(52, "measurement.sgtm.upload.max_queued_batches", 5000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long I() {
        return ((Long) a.b(53, "measurement.sgtm.upload.min_delay_after_background", 600000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long J() {
        return ((Long) a.b(54, "measurement.sgtm.upload.min_delay_after_broadcast", 1000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long K() {
        return ((Long) a.b(55, "measurement.sgtm.upload.min_delay_after_startup", 5000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long L() {
        return ((Long) a.b(56, "measurement.sgtm.upload.retry_interval", 120000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long M() {
        return ((Long) a.b(57, "measurement.sgtm.upload.retry_max_wait", 7200000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long N() {
        return ((Long) a.b(58, "measurement.upload.stale_data_deletion_interval", 86400000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long O() {
        return ((Long) a.b(62, "measurement.rb.attribution.max_queue_time", 864000000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long P() {
        return ((Long) a.b(66, "measurement.sdk.attribution.cache.ttl", 604800000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long Q() {
        return ((Long) a.b(67, "measurement.redaction.app_instance_id.ttl", 7200000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long R() {
        return ((Long) a.b(68, "measurement.upload.backoff_period", 43200000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long S() {
        return ((Long) a.b(69, "measurement.upload.initial_upload_delay_time", 15000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long T() {
        return ((Long) a.b(70, "measurement.upload.interval", 3600000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long U() {
        return ((Long) a.b(71, "measurement.upload.max_bundle_size", 65536L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long V() {
        return ((Long) a.b(72, "measurement.upload.max_bundles", 100L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long W() {
        return ((Long) a.b(73, "measurement.upload.max_conversions_per_day", 10000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long X() {
        return ((Long) a.b(74, "measurement.upload.max_error_events_per_day", 1000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long Y() {
        return ((Long) a.b(75, "measurement.upload.max_events_per_bundle", 1000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long Z() {
        return ((Long) a.b(76, "measurement.upload.max_events_per_day", 100000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long a() {
        return ((Long) a.b(0, "measurement.ad_id_cache_time", 10000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long aa() {
        return ((Long) a.b(77, "measurement.upload.max_public_events_per_day", 50000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long ab() {
        return ((Long) a.b(78, "measurement.upload.max_queue_time", 518400000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long ac() {
        return ((Long) a.b(79, "measurement.upload.max_realtime_events_per_day", 10L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long ad() {
        return ((Long) a.b(80, "measurement.upload.max_batch_size", 65536L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long ae() {
        return ((Long) a.b(81, "measurement.upload.retry_count", 6L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long af() {
        return ((Long) a.b(82, "measurement.upload.retry_time", 1800000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long ag() {
        return ((Long) a.b(84, "measurement.upload.window_interval", 3600000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final String ah() {
        return (String) a.c(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").io();
    }

    @Override // defpackage.aurl
    public final String ai() {
        return (String) a.c(7, "measurement.config.url_authority", "app-measurement.com").io();
    }

    @Override // defpackage.aurl
    public final String aj() {
        return (String) a.c(8, "measurement.config.url_scheme", "https").io();
    }

    @Override // defpackage.aurl
    public final String ak() {
        return (String) a.c(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").io();
    }

    @Override // defpackage.aurl
    public final String al() {
        return (String) a.c(44, "45811201", "de.aboutyou.mobile.app,de.zalando.prive,it.gruppobper.ams.android.bper,com.measurement.testapp,com.ingka.ikea.app,net.skyscanner.android.main,pl.com.rossmann.centauros").io();
    }

    @Override // defpackage.aurl
    public final String am() {
        return (String) a.c(47, "45787041", "de.aboutyou.mobile.app:100,de.zalando.prive:100,it.gruppobper.ams.android.bper:100").io();
    }

    @Override // defpackage.aurl
    public final String an() {
        return (String) a.c(48, "measurement.sgtm.service_upload_apps_list", "de.aboutyou.mobile.app").io();
    }

    @Override // defpackage.aurl
    public final String ao() {
        return (String) a.c(49, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").io();
    }

    @Override // defpackage.aurl
    public final String ap() {
        return (String) a.c(83, "measurement.upload.url", "https://app-measurement.com/a").io();
    }

    @Override // defpackage.aurl
    public final boolean aq() {
        return ((Boolean) a.d(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).io()).booleanValue();
    }

    @Override // defpackage.aurl
    public final boolean ar() {
        return ((Boolean) a.d(10, "measurement.config.default_flag_values", true).io()).booleanValue();
    }

    @Override // defpackage.aurl
    public final boolean as() {
        return ((Boolean) a.d(30, "measurement.config.notify_trigger_uris_on_backgrounded", true).io()).booleanValue();
    }

    @Override // defpackage.aurl
    public final long b() {
        return ((Long) a.b(1, "measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long c() {
        return ((Long) a.b(3, "measurement.max_bundles_per_iteration", 100L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long d() {
        return ((Long) a.b(5, "measurement.config.cache_time", 86400000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long e() {
        return ((Long) a.b(9, "measurement.upload.debug_upload_interval", 1000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long f() {
        return ((Long) a.b(11, "45769094", 3600000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long g() {
        return ((Long) a.b(12, "45776281", 10L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long h() {
        return ((Long) a.b(13, "measurement.session.engagement_interval", 3600000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long i() {
        return ((Long) a.b(15, "measurement.upload.google_signal_max_queue_time", 605000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long j() {
        return ((Long) a.b(17, "measurement.lifetimevalue.max_currency_tracked", 4L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long k() {
        return ((Long) a.b(18, "measurement.dma_consent.max_daily_dcu_realtime_events", 1L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long l() {
        return ((Long) a.b(19, "measurement.upload.max_event_parameter_value_length", 500L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long m() {
        return ((Long) a.b(20, "measurement.store.max_stored_events_per_app", 100000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long n() {
        return ((Long) a.b(21, "measurement.experiment.max_ids", 50L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long o() {
        return ((Long) a.b(22, "measurement.audience.filter_result_max_count", 200L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long p() {
        return ((Long) a.b(23, "measurement.upload.max_item_scoped_custom_parameters", 27L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long q() {
        return ((Long) a.b(24, "measurement.rb.max_trigger_registrations_per_day", 1000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long r() {
        return ((Long) a.b(26, "measurement.alarm_manager.minimum_interval", 60000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long s() {
        return ((Long) a.b(27, "measurement.upload.minimum_delay", 500L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long t() {
        return ((Long) a.b(28, "measurement.monitoring.sample_period_millis", 86400000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long u() {
        return ((Long) a.b(32, "measurement.upload.realtime_upload_interval", 10000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long v() {
        return ((Long) a.b(33, "measurement.upload.refresh_blacklisted_config_interval", 604800000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long w() {
        return ((Long) a.b(35, "measurement.service_client.idle_disconnect_millis", 5000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long x() {
        return ((Long) a.b(37, "measurement.service_client.reconnect_millis", 1000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long y() {
        return ((Long) a.b(39, "measurement.sgtm.batch.long_queuing_threshold", 14400000L).io()).longValue();
    }

    @Override // defpackage.aurl
    public final long z() {
        return ((Long) a.b(40, "measurement.sgtm.batch.retry_interval", 120000L).io()).longValue();
    }
}
