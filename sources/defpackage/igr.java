package defpackage;

import android.content.SharedPreferences;
import j$.time.Duration;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igr implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/streamwifionly/StreamWifiOnlyController");
    public static final Duration b = Duration.ofSeconds(1);
    public final SharedPreferences c;
    public final abvk d;
    public final Set e;
    public final Executor f;
    public final ScheduledExecutorService g;
    public boolean h;
    public final axfd i;
    private final zwb j;
    private final abvn k;
    private final avlh l;
    private final tbt m;
    private final tfq p;
    private final avmm n = new avmm();
    private final hws q = new hws(this);
    private final igp o = new igp(this);

    public igr(SharedPreferences sharedPreferences, tfq tfqVar, zwb zwbVar, abvk abvkVar, abvn abvnVar, tbt tbtVar, avlh avlhVar, axfd axfdVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        sharedPreferences.getClass();
        this.c = sharedPreferences;
        zwbVar.getClass();
        this.j = zwbVar;
        abvkVar.getClass();
        this.d = abvkVar;
        tfqVar.getClass();
        this.p = tfqVar;
        this.e = new HashSet();
        this.k = abvnVar;
        this.m = tbtVar;
        this.l = avlhVar;
        this.i = axfdVar;
        this.f = executor;
        this.g = scheduledExecutorService;
    }

    public final void a() {
        if (this.j.u()) {
            this.c.registerOnSharedPreferenceChangeListener(this);
        }
        avmm avmmVar = this.n;
        hws hwsVar = this.q;
        abvn abvnVar = this.k;
        int i = 18;
        int i2 = 17;
        avmmVar.e(((avlh) abvnVar.r().n).al(new icy(hwsVar, 16), new hyx(i)), ((avlh) abvnVar.r().k).al(new icy(hwsVar, i2), new hyx(i)));
        this.m.f(this.o);
        this.l.al(new icy(this, 15), new hyx(i2));
    }

    public final void b() {
        iqc iqcVar = new iqc(this, 1);
        if (a.x()) {
            iqcVar.run();
        } else {
            this.f.execute(iqcVar);
        }
    }

    public final boolean c() {
        tfq tfqVar = this.p;
        return (tfqVar.j(1) && tfqVar.h()) || !this.c.getBoolean(gzj.STREAM_OVER_WIFI_ONLY, false);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (Objects.equals(str, gzj.STREAM_OVER_WIFI_ONLY)) {
            b();
        }
    }
}
