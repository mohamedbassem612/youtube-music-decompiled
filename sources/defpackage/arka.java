package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arka extends tzk {
    public final aihf a;

    public arka(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return an();
    }

    public final void am(Boolean bool) {
        aihf aihfVar = this.a;
        boolean zBooleanValue = bool.booleanValue();
        aihfVar.copyOnWrite();
        arkd arkdVar = (arkd) aihfVar.instance;
        arkd arkdVar2 = arkd.a;
        arkdVar.b |= SemanticState.LiveRegion;
        arkdVar.l = zBooleanValue;
    }

    public final arkc an() {
        return new arkc((arkd) this.a.build());
    }
}
