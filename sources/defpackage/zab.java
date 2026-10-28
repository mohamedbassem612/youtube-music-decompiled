package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zab {
    public final zjr a;
    public final zdo b;
    public final ahey c;
    public Spatializer d;
    public zaa e;
    boolean f;
    private final Context g;
    private volatile boolean h;

    public zab(zjr zjrVar, zdo zdoVar, Context context, ahey aheyVar) {
        this.a = zjrVar;
        this.b = zdoVar;
        this.c = aheyVar;
        this.g = context;
        if (zjrVar.j.l(205, 45631078L, false)) {
            return;
        }
        a();
    }

    public final void a() {
        AudioManager audioManager;
        if (this.h) {
            return;
        }
        this.h = true;
        Spatializer spatializer = null;
        if (a.aM() && this.a.fz() && (audioManager = (AudioManager) this.g.getSystemService("audio")) != null) {
            spatializer = audioManager.getSpatializer();
            this.f = spatializer.isEnabled() && spatializer.isAvailable();
        }
        this.d = spatializer;
    }

    public final boolean b() {
        Spatializer spatializer;
        a();
        return Build.VERSION.SDK_INT >= 33 && (spatializer = this.d) != null && spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer;
        a();
        return Build.VERSION.SDK_INT >= 33 && (spatializer = this.d) != null && spatializer.isEnabled();
    }
}
