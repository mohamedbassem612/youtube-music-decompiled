package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aunr implements bog, bpp, bny {
    private final Activity a;
    private final cc b;
    private final afpa c;

    public aunr(Activity activity, afpa afpaVar, cc ccVar) {
        int i = activity != null ? 1 : 0;
        i = afpaVar != null ? i + 1 : i;
        atqq.c((ccVar != null ? i + 1 : i) == 1, "Exactly one of the host components must be non-null.", new Object[0]);
        this.a = activity;
        this.c = afpaVar;
        this.b = ccVar;
    }

    public final Activity a() {
        Activity activity = this.a;
        activity.getClass();
        return activity;
    }

    public final cc b() {
        cc ccVar = this.b;
        atqq.d(ccVar);
        return ccVar;
    }

    public final Object c() {
        int iD = d() - 1;
        if (iD != 0) {
            return iD != 1 ? b() : e();
        }
        return a();
    }

    public final int d() {
        if (this.a != null) {
            return 1;
        }
        if (this.b != null) {
            return 3;
        }
        if (this.c != null) {
            return 2;
        }
        throw new AssertionError("Shouldn't reach here.");
    }

    public final afpa e() {
        afpa afpaVar = this.c;
        atqq.d(afpaVar);
        return afpaVar;
    }

    @Override // defpackage.bny
    public final bpt getDefaultViewModelCreationExtras() {
        return ((bny) c()).getDefaultViewModelCreationExtras();
    }

    @Override // defpackage.bny
    public final bpl getDefaultViewModelProviderFactory() {
        return ((bny) c()).getDefaultViewModelProviderFactory();
    }

    @Override // defpackage.bog
    public final boc getLifecycle() {
        return ((bog) c()).getLifecycle();
    }

    @Override // defpackage.bpp
    public final bpo getViewModelStore() {
        return ((bpp) c()).getViewModelStore();
    }

    public final String toString() {
        return "ScreenHost{host=" + c().toString() + '}';
    }
}
