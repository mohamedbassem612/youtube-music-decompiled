package defpackage;

import com.google.android.apps.youtube.music.application.YouTubeMusicTikTokRoot_Application;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gjp extends gjr {
    private boolean p = false;
    private final auok q = new auok(new hhb(this));

    @Override // defpackage.afos
    public final auok b() {
        return this.q;
    }

    @Override // defpackage.gjr
    public final void c() {
        if (this.p) {
            return;
        }
        this.p = true;
        Object objGeneratedComponent = generatedComponent();
        YouTubeMusicTikTokRoot_Application youTubeMusicTikTokRoot_Application = (YouTubeMusicTikTokRoot_Application) this;
        ghx ghxVar = ((ght) objGeneratedComponent).b.a;
        ght ghtVar = ghxVar.a;
        youTubeMusicTikTokRoot_Application.n = (afvq) ghtVar.mK.io();
        youTubeMusicTikTokRoot_Application.o = ghxVar.bK;
        youTubeMusicTikTokRoot_Application.b = ghxVar.bp;
        youTubeMusicTikTokRoot_Application.c = aupm.b(ghxVar.fB);
        youTubeMusicTikTokRoot_Application.d = aupm.b(ghxVar.fG);
        youTubeMusicTikTokRoot_Application.e = ghxVar.fI;
        youTubeMusicTikTokRoot_Application.f = (Executor) ghtVar.u.io();
        youTubeMusicTikTokRoot_Application.g = (Executor) ghtVar.aC.io();
        youTubeMusicTikTokRoot_Application.h = (tws) ghtVar.sQ.io();
        youTubeMusicTikTokRoot_Application.i = (wll) ghtVar.pT.io();
        youTubeMusicTikTokRoot_Application.j = (tqj) ghtVar.q.io();
        youTubeMusicTikTokRoot_Application.k = ghtVar.bd;
        youTubeMusicTikTokRoot_Application.l = ghtVar.cs;
        youTubeMusicTikTokRoot_Application.m = ghtVar.qt;
    }

    @Override // defpackage.afos, defpackage.aupi
    public final /* synthetic */ auph componentManager() {
        return this.q;
    }
}
