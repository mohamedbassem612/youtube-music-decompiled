package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qbx {
    public final qti a;
    public final agfr b = aguu.al(new ope(this, 7));
    public final agfr c = aguu.al(new ope(this, 8));
    public final agfr d = aguu.al(new ope(this, 9));
    public final agfr e = aguu.al(new ope(this, 10));
    private final qth f;

    public qbx(ScheduledExecutorService scheduledExecutorService, qtj qtjVar, Application application) {
        qti qtiVarD = qti.d("youtube_parent_tools_android");
        this.a = qtiVarD;
        qth qthVar = qtiVarD.a;
        if (qthVar == null) {
            this.f = qtl.a(qtjVar, scheduledExecutorService, qtiVarD, application);
        } else {
            this.f = qthVar;
            ((qtl) qthVar).b = qtjVar;
        }
    }
}
