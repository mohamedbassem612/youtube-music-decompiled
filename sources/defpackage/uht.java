package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class uht implements bnu {
    final /* synthetic */ uhv a;
    private final cc b;
    private final boq c;

    public uht(final uhv uhvVar, final cc ccVar) {
        this.a = uhvVar;
        this.b = ccVar;
        this.c = new boq() { // from class: uhs
            @Override // defpackage.boq
            public final void a(Object obj) {
                bog bogVar = (bog) obj;
                if (bogVar != null) {
                    cc ccVar2 = ccVar;
                    bogVar.getLifecycle().b(new uhu(uhvVar, ccVar2));
                }
            }
        };
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        this.b.getViewLifecycleOwnerLiveData().d(this.c);
        this.a.iV();
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        this.b.getViewLifecycleOwnerLiveData().g(this.c);
        uhv uhvVar = this.a;
        uhvVar.d();
        uhvVar.a = false;
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        this.a.iX();
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        this.a.g();
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.a.h();
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        this.a.i();
    }
}
