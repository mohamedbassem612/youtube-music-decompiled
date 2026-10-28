package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.litho.ComponentHost;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fiw extends fgy {
    public SparseArray a;
    public boolean b = false;

    protected fiw() {
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return new ComponentHost(context);
    }

    @Override // defpackage.fgy
    protected final void J(fhd fhdVar, Object obj, fiz fizVar) {
        ((ComponentHost) obj).i();
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        ComponentHost componentHost = (ComponentHost) obj;
        componentHost.setAlpha(1.0f);
        componentHost.s = this.b;
    }

    @Override // defpackage.fgy
    public final boolean R() {
        SparseArray sparseArray = this.a;
        return sparseArray != null && sparseArray.size() > 0;
    }

    @Override // defpackage.fgy, defpackage.fvm
    public final boolean ac() {
        boolean z = fna.a;
        return true;
    }

    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
        componentHost.s = false;
        componentHost.q = false;
    }

    @Override // defpackage.fgy
    public final String c() {
        return "HostComponent";
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        return this == fgyVar;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 45;
    }

    @Override // defpackage.fgy
    public final SparseArray i() {
        return this.a;
    }

    @Override // defpackage.fgy
    protected final fjy s() {
        return new fix(fna.s);
    }
}
