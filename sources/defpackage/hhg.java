package defpackage;

import com.google.android.apps.youtube.music.mediabrowser.androidautoprojected.AndroidAutoCarAppServices;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hhg extends xk implements aupi {
    private volatile auoz c;
    private final Object d = new Object();
    private boolean e = false;

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final auoz componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new auoz(this);
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.e) {
            this.e = true;
            ((AndroidAutoCarAppServices) this).c = (ahgb) ((gkf) generatedComponent()).b.a.mi.io();
        }
        super.onCreate();
    }
}
