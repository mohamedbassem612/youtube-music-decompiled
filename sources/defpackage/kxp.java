package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
abstract class kxp extends kny {
    public kxp(knc kncVar) {
        super(kxd.a, kncVar);
    }

    @Override // defpackage.kny
    protected final /* bridge */ /* synthetic */ void b(kmp kmpVar) {
        kxt kxtVar = (kxt) kmpVar;
        Context context = kxtVar.p;
        n((kxv) kxtVar.C());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kny, defpackage.knz
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.l(obj);
    }

    protected abstract void n(kxv kxvVar);
}
