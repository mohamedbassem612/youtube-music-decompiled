package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vvm extends sye {
    public final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;
    private final awmd h;
    private final Context i;
    private final tqj j;

    public vvm(awmd awmdVar, Context context, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, tqj tqjVar) {
        this.b = awmdVar;
        this.i = context;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.f = awmdVar5;
        this.g = awmdVar6;
        this.a = awmdVar7;
        this.h = awmdVar8;
        this.j = tqjVar;
    }

    @Override // defpackage.sye
    protected final void a() {
        int i = tqr.a;
        tqj tqjVar = this.j;
        if (tqjVar.k(1073814936)) {
            ((ScheduledExecutorService) this.h.io()).schedule(new vlj(this, 11), 30L, TimeUnit.SECONDS);
        }
        this.g.io();
        ((tgg) this.c.io()).d();
        ((tgg) this.d.io()).d();
        if (tqjVar.k(1073828820)) {
            ((tir) this.e.io()).d();
            ((tir) this.f.io()).d();
        }
        ((Application) this.i).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.b.io());
    }
}
