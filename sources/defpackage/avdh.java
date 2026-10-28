package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avdh implements avjj {
    public static final Logger a = Logger.getLogger(avdh.class.getName());
    public final ScheduledExecutorService b;
    public final avcj c;
    public avfa d;
    public axoz e;

    public avdh(ScheduledExecutorService scheduledExecutorService, avcj avcjVar) {
        this.b = scheduledExecutorService;
        this.c = avcjVar;
    }

    @Override // defpackage.avjj
    public final void a() {
        avcj avcjVar = this.c;
        avcjVar.c();
        avcjVar.execute(new afjc(this, 18));
    }
}
