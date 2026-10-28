package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xps implements bnu {
    final /* synthetic */ xpw a;

    public xps(xpw xpwVar) {
        this.a = xpwVar;
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        bp bpVar;
        cc ccVar = this.a.a;
        if (ccVar == null || (bpVar = (bp) ccVar.getActivity().getSupportFragmentManager().g("confirmRemoveDialog")) == null) {
            return;
        }
        bpVar.setTargetFragment(ccVar, 0);
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        this.a.a();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
