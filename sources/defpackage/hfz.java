package defpackage;

import com.google.android.apps.youtube.music.mediabrowser.MusicBrowserService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hfz extends bre implements aupi {
    private volatile auoz i;
    private final Object j = new Object();
    private boolean k = false;

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final auoz componentManager() {
        if (this.i == null) {
            synchronized (this.j) {
                if (this.i == null) {
                    this.i = new auoz(this);
                }
            }
        }
        return this.i;
    }

    @Override // defpackage.bre, android.app.Service
    public void onCreate() {
        if (!this.k) {
            this.k = true;
            MusicBrowserService musicBrowserService = (MusicBrowserService) this;
            gkf gkfVar = (gkf) generatedComponent();
            ght ghtVar = gkfVar.b;
            musicBrowserService.i = (mbc) ghtVar.l.io();
            musicBrowserService.z = (qcb) gkfVar.c.io();
            musicBrowserService.y = (qcb) gkfVar.d.io();
            ghx ghxVar = ghtVar.a;
            musicBrowserService.j = aupm.b(ghxVar.me);
            musicBrowserService.k = aupm.b(ghtVar.Ap);
            musicBrowserService.l = aupm.b(ghtVar.pg);
            musicBrowserService.m = aupm.b(ghtVar.op);
            musicBrowserService.n = aupm.b(ghtVar.cH);
            musicBrowserService.o = aupm.b(ghxVar.mf);
            musicBrowserService.p = aupm.b(ghtVar.zZ);
            musicBrowserService.q = aupm.b(ghtVar.Fe);
            musicBrowserService.r = aupm.b(ghxVar.mg);
            musicBrowserService.s = aupm.b(ghtVar.Gd);
            musicBrowserService.t = aupm.b(ghtVar.dC);
            musicBrowserService.u = aupm.b(ghtVar.dA);
            musicBrowserService.v = aupm.b(ghtVar.cu);
            musicBrowserService.w = aupm.b(ghtVar.Fg);
            musicBrowserService.x = aupm.b(ghxVar.mh);
        }
        super.onCreate();
    }
}
