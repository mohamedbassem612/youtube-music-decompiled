package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yuz {
    public final tpq a;
    public final twv b;
    public volatile boolean c;
    public final tfq d;
    private final vyo e;
    private final ScheduledExecutorService f;

    public yuz(tfq tfqVar, tpq tpqVar, ScheduledExecutorService scheduledExecutorService, vyo vyoVar) {
        yuy yuyVar = new yuy(this);
        this.b = yuyVar;
        this.c = false;
        this.d = tfqVar;
        this.a = tpqVar;
        this.f = scheduledExecutorService;
        this.e = vyoVar;
        scheduledExecutorService.execute(new syd(yuyVar, 12));
    }

    private final aomt d() {
        alik alikVarB;
        vyo vyoVar = this.e;
        if (vyoVar == null || (alikVarB = vyoVar.b()) == null) {
            return null;
        }
        anew anewVar = alikVarB.j;
        if (anewVar == null) {
            anewVar = anew.a;
        }
        aomt aomtVar = anewVar.e;
        return aomtVar == null ? aomt.a : aomtVar;
    }

    final void a(long j, long j2) {
        boolean z;
        aomt aomtVarD = d();
        if (aomtVarD != null) {
            boolean z2 = aomtVarD.b;
            int i = aomtVarD.c;
            int i2 = aomtVarD.d;
            if (!z2 || j2 <= 0 || j <= 0) {
                return;
            }
            aihf aihfVarCreateBuilder = zif.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ((zif) aihfVarCreateBuilder.instance).d = j;
            aihfVarCreateBuilder.copyOnWrite();
            ((zif) aihfVarCreateBuilder.instance).b = j2;
            aihfVarCreateBuilder.copyOnWrite();
            ((zif) aihfVarCreateBuilder.instance).c = 0;
            zif zifVar = (zif) aihfVarCreateBuilder.build();
            synchronized (this) {
                z = this.c;
                this.c = true;
                ArrayDeque arrayDeque = (ArrayDeque) this.b.io();
                arrayDeque.add(zifVar);
                while (arrayDeque.size() > i) {
                    arrayDeque.pop();
                }
            }
            if (z) {
                return;
            }
            try {
                this.f.schedule(new ygz(this, 13), i2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                zvp.b(zvn.b, zvm.i, "Could not schedule the persisting of bandwidth samples.", e);
                synchronized (this) {
                    this.c = false;
                }
            }
        }
    }

    public final boolean b() {
        aomt aomtVarD = d();
        if (aomtVarD != null) {
            return aomtVarD.b;
        }
        return false;
    }
}
