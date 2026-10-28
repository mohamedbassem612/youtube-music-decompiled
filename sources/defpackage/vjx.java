package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vjx implements tdk, vjy {
    public static final String a = "vjx";
    public Optional b = Optional.empty();
    private final avmm c;
    private final xsc d;

    public vjx(xsc xscVar) {
        Optional.empty();
        this.d = xscVar;
        this.c = new avmm();
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        nsi.m(this);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.b;
    }

    @Override // defpackage.vjy
    public final Optional d() {
        return this.b;
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        nsi.n(this);
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.c.c(this.d.K().af(new var(this, 10)));
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        this.c.dispose();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
