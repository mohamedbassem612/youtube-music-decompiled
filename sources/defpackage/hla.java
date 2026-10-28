package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.music.notifications.FcmMessageListenerService;
import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class hla extends FirebaseMessagingService implements aupi {
    private volatile auoz a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
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
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            FcmMessageListenerService fcmMessageListenerService = (FcmMessageListenerService) this;
            gkf gkfVar = (gkf) generatedComponent();
            ght ghtVar = gkfVar.b;
            fcmMessageListenerService.a = (Intent) ghtVar.xG.io();
            fcmMessageListenerService.b = (vyo) ghtVar.av.io();
            fcmMessageListenerService.c = aupm.b(gkfVar.e);
            fcmMessageListenerService.d = ghtVar.bN;
            fcmMessageListenerService.e = (xgn) ghtVar.kk.io();
            fcmMessageListenerService.f = ghtVar.xy;
            fcmMessageListenerService.g = ghtVar.a.mj;
        }
        super.onCreate();
    }
}
