package defpackage;

import android.app.job.JobService;
import com.google.android.libraries.youtube.offline.transfer.service.OfflineUserInitiatedDataTransferJobService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aatd extends JobService implements aupi {
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
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            OfflineUserInitiatedDataTransferJobService offlineUserInitiatedDataTransferJobService = (OfflineUserInitiatedDataTransferJobService) this;
            gkf gkfVar = (gkf) generatedComponent();
            ght ghtVar = gkfVar.b;
            offlineUserInitiatedDataTransferJobService.a = ghtVar.rE;
            offlineUserInitiatedDataTransferJobService.e = (isi) ghtVar.ru.io();
            offlineUserInitiatedDataTransferJobService.b = (aauk) ghtVar.iL.io();
            offlineUserInitiatedDataTransferJobService.c = ghtVar.so;
            offlineUserInitiatedDataTransferJobService.d = new aath(gkfVar.f, (ScheduledExecutorService) ghtVar.u.io(), (mbc) ghtVar.l.io(), (aauk) ghtVar.iL.io(), (aesq) ghtVar.rV.io());
            offlineUserInitiatedDataTransferJobService.f = (aesq) ghtVar.rV.io();
        }
        super.onCreate();
    }
}
