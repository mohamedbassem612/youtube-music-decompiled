package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldl extends lea {
    static final Pair a = new Pair("", 0L);
    public SharedPreferences b;
    public ldj c;
    public final ldi d;
    public final ldi e;
    public final ldk f;
    public final ldi g;
    public final ldg h;
    public final ldk i;
    public final ldg j;
    public final ldi k;
    public final ldi l;
    public boolean m;
    public final ldg n;
    public final ldi o;
    public final ldk p;
    public final ldk q;
    public final ldi r;
    public final ldh s;
    private SharedPreferences u;
    private String v;
    private boolean w;
    private long x;

    public ldl(ldr ldrVar) {
        super(ldrVar);
        this.g = new ldi(this, "session_timeout", 1800000L);
        this.h = new ldg(this, "start_new_session", true);
        this.k = new ldi(this, "last_pause_time", 0L);
        this.l = new ldi(this, "session_id", 0L);
        this.i = new ldk(this, "non_personalized_ads");
        new ldh(this, "last_received_uri_timestamps_by_source");
        this.j = new ldg(this, "allow_remote_dynamite", false);
        this.d = new ldi(this, "first_open_time", 0L);
        this.e = new ldi(this, "app_install_time", 0L);
        this.f = new ldk(this, "app_instance_id");
        this.n = new ldg(this, "deep_link_retrieval_complete", false);
        this.o = new ldi(this, "deep_link_retrieval_attempts", 0L);
        this.p = new ldk(this, "firebase_feature_rollouts");
        this.q = new ldk(this, "deferred_attribution_cache");
        this.r = new ldi(this, "deferred_attribution_cache_timestamp", 0L);
        this.s = new ldh(this, "default_event_parameters");
    }

    protected final SharedPreferences a() {
        o();
        m();
        SharedPreferences sharedPreferences = this.u;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        String strValueOf = String.valueOf(aS().getPackageName());
        lcx lcxVar = aT().k;
        String strConcat = strValueOf.concat("_preferences");
        lcxVar.b("Default prefs file", strConcat);
        SharedPreferences sharedPreferences2 = aS().getSharedPreferences(strConcat, 0);
        this.u = sharedPreferences2;
        return sharedPreferences2;
    }

    @Override // defpackage.lea
    protected final void aX() {
        SharedPreferences sharedPreferences = aS().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.m = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.b.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.c = new ldj(this, Math.max(0L, ((Long) lcl.d.b(null)).longValue()));
    }

    public final SharedPreferences b() {
        o();
        m();
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new NullPointerException("null reference");
    }

    final Pair c(String str) {
        o();
        if (!f().m()) {
            return new Pair("", Boolean.FALSE);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.v;
        if (str2 != null && jElapsedRealtime < this.x) {
            return new Pair(str2, Boolean.valueOf(this.w));
        }
        this.x = jElapsedRealtime + G().i(str);
        try {
            jwa jwaVarE = jwb.e(aS());
            this.v = "";
            String str3 = jwaVarE.a;
            if (str3 != null) {
                this.v = str3;
            }
            this.w = jwaVarE.b;
        } catch (Exception e) {
            aT().j.b("Unable to get advertising id", e);
            this.v = "";
        }
        return new Pair(this.v, Boolean.valueOf(this.w));
    }

    final lgd d() {
        o();
        return lgd.b(b().getString("dma_consent_settings", null));
    }

    @Override // defpackage.lea
    protected final boolean e() {
        return true;
    }

    public final lgh f() {
        o();
        return lgh.g(b().getString("consent_settings", "G1"), b().getInt("consent_source", 100));
    }

    final Boolean g() {
        o();
        if (b().contains("measurement_enabled")) {
            return Boolean.valueOf(b().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final void i(Boolean bool) {
        o();
        SharedPreferences.Editor editorEdit = b().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final void j(boolean z) {
        o();
        aT().k.b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = b().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean k(long j) {
        return j - this.g.a() > this.k.a();
    }

    final boolean l(int i) {
        return lgh.p(i, b().getInt("consent_source", 100));
    }
}
