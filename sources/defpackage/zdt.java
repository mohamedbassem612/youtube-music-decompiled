package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.media.interfaces.RestartPrefetchEvaluationSource;
import com.google.android.libraries.youtube.media.interfaces.Time;
import j$.time.Duration;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zdt implements ytp {
    public final /* synthetic */ zdx a;

    public zdt(zdx zdxVar) {
        this.a = zdxVar;
    }

    @Override // defpackage.ytp
    public final cno a(zcf zcfVar, boolean z, Handler handler, ytw ytwVar) {
        zdx zdxVar = this.a;
        if (zdxVar.e.bD()) {
            zdn zdnVar = zdxVar.v;
            zdnVar.d(zcfVar, zdnVar.e);
        }
        ytp ytpVar = (ytp) zdxVar.d.io();
        if (ytpVar != null) {
            return ytpVar.a(zcfVar, z, handler, ytwVar);
        }
        return null;
    }

    @Override // defpackage.ytp
    public final cno b(long j, zcf zcfVar, boolean z, Handler handler, ytw ytwVar) {
        zdx zdxVar = this.a;
        if (zdxVar.e.bD()) {
            zdn zdnVar = zdxVar.v;
            zdnVar.d(zcfVar, zdnVar.e);
        }
        ytp ytpVar = (ytp) zdxVar.d.io();
        if (ytpVar != null) {
            return ytpVar.b(j, zcfVar, z, handler, ytwVar);
        }
        return null;
    }

    @Override // defpackage.ytp
    public final zcf c(String str, long j, long j2) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            return ytpVar.c(str, j, j2);
        }
        return null;
    }

    @Override // defpackage.ytp
    public final void d(zcf zcfVar) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.d(zcfVar);
        }
    }

    @Override // defpackage.ytp
    public final void e() {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.e();
        }
    }

    @Override // defpackage.ytp
    public final void f(boolean z) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.f(z);
        }
    }

    @Override // defpackage.ytp
    public final void g(zeh zehVar) {
        throw null;
    }

    @Override // defpackage.ytp
    public final void h() {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.h();
        }
    }

    @Override // defpackage.ytp
    public final void i(zcf zcfVar, boolean z) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.i(zcfVar, z);
        }
    }

    @Override // defpackage.ytp
    public final void j() {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.j();
        }
    }

    @Override // defpackage.zan
    public final boolean jx(Time time) {
        ytp ytpVar = (ytp) this.a.d.io();
        return ytpVar != null && ytpVar.jx(time);
    }

    @Override // defpackage.ytp
    public final void k(zcf zcfVar, boolean z) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.k(zcfVar, z);
        }
    }

    @Override // defpackage.ytp
    public final void l() {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.l();
        }
    }

    @Override // defpackage.ytp
    public final void m(RestartPrefetchEvaluationSource restartPrefetchEvaluationSource, boolean z) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.m(restartPrefetchEvaluationSource, z);
        }
    }

    @Override // defpackage.ytp
    public final void n(zcf zcfVar, boolean z) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.n(zcfVar, z);
        }
    }

    @Override // defpackage.ytp
    public final void o(zcf zcfVar) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.o(zcfVar);
        }
    }

    @Override // defpackage.ytp
    public final void p(boolean z) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.p(z);
        }
    }

    @Override // defpackage.ytp
    public final void q(ywn ywnVar, zcj zcjVar) {
        ytp ytpVar;
        zdx zdxVar = this.a;
        if ((!zdxVar.e.bD() || Objects.equals(zcjVar, zdxVar.v.e)) && (ytpVar = (ytp) zdxVar.d.io()) != null) {
            ytpVar.q(ywnVar, zcjVar);
        }
    }

    @Override // defpackage.ytp
    public final void r(zcf zcfVar, boolean z) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.r(zcfVar, z);
        }
    }

    @Override // defpackage.ytp
    public final void s(zcf zcfVar) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.s(zcfVar);
        }
    }

    @Override // defpackage.ytp
    public final boolean t() {
        ytp ytpVar = (ytp) this.a.d.io();
        return ytpVar != null && ytpVar.t();
    }

    @Override // defpackage.ytp
    public final boolean u(zcf zcfVar, Duration duration) {
        ytp ytpVar = (ytp) this.a.d.io();
        return ytpVar != null && ytpVar.u(zcfVar, duration);
    }

    @Override // defpackage.ytp
    public final boolean v(boolean z, Runnable runnable, boolean z2) {
        ytp ytpVar = (ytp) this.a.d.io();
        return ytpVar != null && ytpVar.v(z, runnable, z2);
    }

    @Override // defpackage.ytp
    public final void w() {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.w();
        }
    }

    @Override // defpackage.ytp
    public final void x(zcf zcfVar, boolean z) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.x(zcfVar, z);
        }
    }

    @Override // defpackage.ytp
    public final void y(acca accaVar, zcf zcfVar) {
        ytp ytpVar = (ytp) this.a.d.io();
        if (ytpVar != null) {
            ytpVar.y(accaVar, zcfVar);
        }
    }
}
