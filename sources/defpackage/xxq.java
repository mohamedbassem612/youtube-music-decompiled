package defpackage;

import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xxq extends abhx implements xzf, tdi {
    private final boolean b;
    private final ycp c;

    public xxq(Resources resources, abvk abvkVar, hyt hytVar, ycp ycpVar, tqj tqjVar) {
        super(resources, abvkVar, hytVar);
        ycpVar.getClass();
        this.c = ycpVar;
        int i = tqr.a;
        this.b = tqjVar.a(1073951412) != 0;
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        taq.g(this);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.a;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        this.a.c(true);
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        taq.h(this);
    }

    @Override // defpackage.abhx
    @tcc
    public void handleFormatStreamChangeEvent(yvu yvuVar) {
        if (this.c.b == 1) {
            this.a.c(false);
        } else {
            super.handleFormatStreamChangeEvent(yvuVar);
        }
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        this.a.c(false);
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        if (this.b) {
            return;
        }
        this.c.a(this);
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        if (this.b) {
            return;
        }
        this.c.d(this);
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void h(xzc xzcVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
