package defpackage;

import android.app.Service;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xut extends Service implements aupi {
    private volatile auoz a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final auoz componentManager() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new auoz(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            RemotePlaybackControlsService remotePlaybackControlsService = (RemotePlaybackControlsService) this;
            ght ghtVar = ((gkf) generatedComponent()).b;
            remotePlaybackControlsService.b = (tbt) ghtVar.I.io();
            remotePlaybackControlsService.c = (abvn) ghtVar.kp.io();
            ghx ghxVar = ghtVar.a;
            remotePlaybackControlsService.d = (abrt) ghxVar.mk.io();
            remotePlaybackControlsService.e = (abrt) ghxVar.mp.io();
            remotePlaybackControlsService.l = (hzt) ghtVar.Ak.io();
            remotePlaybackControlsService.m = (xuu) ghxVar.mq.io();
            remotePlaybackControlsService.f = (xuu) ghxVar.mr.io();
            remotePlaybackControlsService.g = (abrp) ghtVar.Ap.io();
            remotePlaybackControlsService.h = ghtVar.po;
            remotePlaybackControlsService.i = ghtVar.kx;
            remotePlaybackControlsService.j = (xmr) ghtVar.dh.io();
            remotePlaybackControlsService.k = (abru) ghtVar.Ao.io();
        }
        super.onCreate();
    }
}
