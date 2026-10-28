package defpackage;

import android.app.Service;
import com.google.android.libraries.youtube.player.background.service.BackgroundPlayerService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aavy extends Service implements aupi {
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

    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        Object objGeneratedComponent = generatedComponent();
        BackgroundPlayerService backgroundPlayerService = (BackgroundPlayerService) this;
        ght ghtVar = ((gkf) objGeneratedComponent).b;
        backgroundPlayerService.a = (abvk) ghtVar.iF.io();
        backgroundPlayerService.b = (abrp) ghtVar.Ap.io();
        backgroundPlayerService.c = (abnc) ghtVar.hA.io();
        ghx ghxVar = ghtVar.a;
        backgroundPlayerService.d = (axsp) ghxVar.ms.io();
        backgroundPlayerService.e = (axsp) ghxVar.mt.io();
        ahhp ahhpVar = (ahhp) ((gil) ((ci) ghxVar.a.cG.io()).a).de.io();
        ahhpVar.getClass();
        backgroundPlayerService.f = ahhpVar;
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public void onCreate() {
        b();
        super.onCreate();
    }
}
