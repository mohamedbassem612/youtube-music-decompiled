package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afma implements bnu {
    public final awut a;
    public final afpa b;
    private final auod c;

    public afma(auod auodVar, afpa afpaVar, awut awutVar) {
        this.c = auodVar;
        this.b = afpaVar;
        this.a = awutVar;
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        awrc.O(this.a);
        CommonApis.k();
        auod auodVar = this.c;
        auodVar.b();
        auodVar.a.remove(this);
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
