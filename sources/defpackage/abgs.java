package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class abgs extends acde implements aupi {
    private aupc a;
    private boolean b;

    public abgs(Context context) {
        super(context);
        if (isInEditMode() || this.b) {
            return;
        }
        this.b = true;
        ((abgr) this).b = (abmt) ((gkj) generatedComponent()).a.cT.io();
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // defpackage.aupi
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final aupc componentManager() {
        aupc aupcVar = this.a;
        if (aupcVar != null) {
            return aupcVar;
        }
        aupc aupcVar2 = new aupc(this);
        this.a = aupcVar2;
        return aupcVar2;
    }
}
