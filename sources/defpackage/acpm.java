package defpackage;

import android.app.Activity;
import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acpm implements tdz, bnu {
    public final Set a = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final awli b = new awli("");
    private final tqj c;
    private final awmd d;

    /* JADX WARN: Multi-variable type inference failed */
    public acpm(tqj tqjVar, awmd awmdVar, Activity activity) {
        this.c = tqjVar;
        this.d = awmdVar;
        if (tym.au(tqjVar)) {
            if (activity instanceof bog) {
                ((bog) activity).getLifecycle().b(this);
            }
            ((tes) awmdVar.io()).b(this, tew.b, tew.c, tew.d, tew.e, tew.f, tew.g);
        }
    }

    public final boolean b(String str) {
        return this.a.contains(str);
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.tdz
    public final void jz() {
        this.a.clear();
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        bogVar.getLifecycle().c(this);
        if (tym.au(this.c)) {
            ((tes) this.d.io()).e(this);
        }
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
