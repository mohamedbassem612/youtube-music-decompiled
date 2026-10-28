package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aefu extends tud {
    final /* synthetic */ aefv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aefu(aefv aefvVar, String str) {
        super(str);
        this.a = aefvVar;
    }

    @Override // defpackage.tud
    protected final void a() {
        View view;
        aefv aefvVar = this.a;
        aefl aeflVar = aefvVar.f;
        if (aeflVar == null || (view = aeflVar.c) == null || view.isShown() || ((Boolean) aefvVar.f.r.orElse(Boolean.FALSE)).booleanValue()) {
            return;
        }
        aefvVar.e(aefvVar.f);
    }
}
