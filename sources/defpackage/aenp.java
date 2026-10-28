package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aenp implements awmd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aenp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [awmd, java.lang.Object] */
    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            return ((aenq) this.a).a;
        }
        if (i == 1) {
            return ((aenq) this.a).a;
        }
        ?? r2 = this.a;
        if (i == 2) {
            return (aflf) r2.io();
        }
        if (i == 3) {
            return r2;
        }
        try {
            Context context = ((ahvr) r2).b;
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new AssertionError("Could not find our own package, this should be impossible.\nNo app version will appear in logs.", e);
        }
    }
}
