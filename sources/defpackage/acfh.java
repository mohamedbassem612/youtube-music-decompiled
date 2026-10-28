package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acfh implements acfw {
    public WeakReference a;
    public WeakReference b = new WeakReference(null);

    public acfh(acfg acfgVar) {
        this.a = new WeakReference(acfgVar);
    }

    private final acfg f() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return (acfg) weakReference.get();
    }

    private final acip i() {
        WeakReference weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return (acip) weakReference.get();
    }

    @Override // defpackage.acfw
    public final long a() {
        acip acipVarI = i();
        if (acipVarI != null) {
            return acipVarI.w().f;
        }
        return 0L;
    }

    @Override // defpackage.acfw
    public final long b() {
        acip acipVarI = i();
        if (acipVarI != null) {
            return acipVarI.w().i;
        }
        return 0L;
    }

    @Override // defpackage.acfw
    public final wjf c() {
        acip acipVarI = i();
        if (acipVarI != null) {
            return acipVarI.f();
        }
        return null;
    }

    @Override // defpackage.acfw
    public final acjb d() {
        acfg acfgVarF = f();
        if (acfgVarF != null) {
            return acfgVarF.g;
        }
        return null;
    }

    @Override // defpackage.acfw
    public final String e() {
        acfg acfgVarF = f();
        if (acfgVarF != null) {
            return acfgVarF.p();
        }
        return null;
    }

    @Override // defpackage.acfw
    public final acga g() {
        acip acipVarI = i();
        if (acipVarI != null) {
            return acipVarI.bq();
        }
        return null;
    }

    @Override // defpackage.acfw
    public final acig h() {
        acfg acfgVarF = f();
        if (acfgVarF != null) {
            return acfgVarF.at();
        }
        return null;
    }
}
