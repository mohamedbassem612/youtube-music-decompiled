package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qgo implements qed {
    public boolean a = false;
    public Activity b;
    private final aunn c;

    public qgo(aunn aunnVar, agev agevVar, Executor executor) {
        this.c = aunnVar;
        executor.execute(new lph(this, agevVar, 10, (byte[]) null));
    }

    @Override // defpackage.qed
    public final synchronized void b(Activity activity) {
        if (this.a) {
            qgr qgrVar = (qgr) this.c.io();
            qhb qhbVarA = qhb.a(activity);
            agdf agdfVar = agdf.a;
            qgrVar.a(new qgt(qhbVarA, null, agdfVar, agdfVar, agdfVar, agdfVar, false));
        } else {
            activity.equals(this.b);
        }
        this.b = null;
    }

    @Override // defpackage.qed
    public final synchronized void c(Activity activity) {
        if (this.a) {
            ((qgr) this.c.io()).d(qhb.a(activity));
        } else {
            this.b = activity;
        }
    }

    @Override // defpackage.qed
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void f(int i) {
    }
}
