package defpackage;

import com.google.android.apps.youtube.music.settings.SettingsCompatActivity;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iop extends ioq {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/settings/SettingsCompatActivityPeer");
    public final SettingsCompatActivity b;
    public final Set c;
    public final tbt d;
    public final hlv e;
    public final xgn f;
    public final Executor g;
    public final jkx h;
    public final jab i;
    public final adxj j;
    public wtt k;
    public ios l;
    public String m;
    public ipz n;
    public final vxz o;
    public final aciz p;
    private final zwb r;
    private final tfq s;
    private final xpl t;

    public iop(SettingsCompatActivity settingsCompatActivity, Set set, tfq tfqVar, tbt tbtVar, xpl xplVar, hlv hlvVar, xgn xgnVar, Executor executor, jkx jkxVar, aciz acizVar, zwb zwbVar, jab jabVar, adxj adxjVar, vxz vxzVar) {
        this.b = settingsCompatActivity;
        this.c = set;
        this.s = tfqVar;
        this.d = tbtVar;
        this.t = xplVar;
        this.e = hlvVar;
        this.f = xgnVar;
        this.g = executor;
        this.h = jkxVar;
        this.p = acizVar;
        this.r = zwbVar;
        this.i = jabVar;
        this.j = adxjVar;
        this.o = vxzVar;
    }

    public final List a() {
        if (this.k == null) {
            return agpi.a;
        }
        boolean zD = d();
        wtt wttVar = this.k;
        return zD ? wttVar.c() : wttVar.b();
    }

    public final void b() {
        ios iosVar = this.l;
        if (iosVar != null) {
            iosVar.onSettingsLoaded();
        }
    }

    public final void c() {
        taf.i(this.t.h(this.r.e()), this.g, new ihw(5), new hvn(this, 11), null);
    }

    public final boolean d() {
        return !this.s.h();
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        c();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        c();
    }
}
