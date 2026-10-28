package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vqw implements bnu {
    final /* synthetic */ View a;
    final /* synthetic */ vqx b;

    public vqw(vqx vqxVar, View view) {
        this.a = view;
        this.b = vqxVar;
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        vqx vqxVar = this.b;
        vqxVar.b.b();
        this.a.removeOnLayoutChangeListener(vqxVar);
        vqxVar.f.w.i(vqxVar);
        vqxVar.b();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
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
