package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhk implements bnu {
    public final afkh a;
    public afgu b;
    private final List c;
    private final afpa d;

    public afhk(afpa afpaVar) {
        afpaVar.getClass();
        this.d = afpaVar;
        this.a = new afkh("KeepStateCallbacksHandler");
        this.c = new ArrayList();
        afpaVar.getLifecycle().b(this);
        afpaVar.getSavedStateRegistry().b("tiktok_keep_state_callback_handler", new cn(this, 6));
    }

    public final void a() {
        qpj.c();
        afgu afguVar = this.b;
        if (afguVar != null) {
            if (afguVar.b == 1) {
                ((afhj) this.a.b(afguVar.a)).a();
            }
            this.b = null;
        }
    }

    public final void b() {
        qpj.c();
        afgu afguVar = this.b;
        afguVar.getClass();
        int i = afguVar.a;
        int i2 = afguVar.b;
        afhj afhjVar = (afhj) this.a.b(i);
        if (i2 == 1) {
            afhjVar.a();
        }
        afhjVar.c();
        this.b = null;
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        afpa afpaVar = this.d;
        afgu afguVar = null;
        Bundle bundleA = afpaVar.getSavedStateRegistry().a.b ? afpaVar.getSavedStateRegistry().a("tiktok_keep_state_callback_handler") : null;
        if (bundleA != null) {
            this.a.d(bundleA);
            if (bundleA.containsKey("KSCH$AC$callbacks_id")) {
                if (!bundleA.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                afguVar = new afgu(bundleA.getInt("KSCH$AC$callbacks_id"), bundleA.getInt("KSCH$AC$callbacks_state"));
            } else if (bundleA.containsKey("KSCH$AC$callbacks_state")) {
                throw new IllegalStateException("Check failed.");
            }
            this.b = afguVar;
        }
        List list = this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.c((afhj) it.next());
        }
        list.clear();
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

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
