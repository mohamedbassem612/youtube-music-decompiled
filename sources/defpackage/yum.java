package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yum implements zll {
    final /* synthetic */ yuo a;

    public yum(yuo yuoVar) {
        this.a = yuoVar;
    }

    @Override // defpackage.zll
    public final void b() {
        d();
    }

    @Override // defpackage.zll
    public final void c() {
        yuo yuoVar = this.a;
        yuoVar.c.o(yuoVar.j);
        yuoVar.f.e(yuoVar.m);
    }

    @Override // defpackage.zll
    public final void d() {
        yuo yuoVar = this.a;
        yuoVar.c.p(yuoVar.j);
        yuoVar.f.e(null);
        yuoVar.Q(false);
        zlm zlmVar = yuoVar.m;
        if (zlmVar != null) {
            zlmVar.q();
        }
    }

    @Override // defpackage.zll
    public final void e(boolean z, String str) {
        yuo yuoVar = this.a;
        yuoVar.c.q(yuoVar.j);
    }

    @Override // defpackage.zll
    public final void f(Surface surface, int i, int i2) {
        this.a.y();
    }

    @Override // defpackage.zll
    public final /* synthetic */ void a(String str, String str2) {
    }
}
