package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqzn extends tzk {
    private final aihf a;

    public aqzn(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return at();
    }

    public final void am(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        aqzq aqzqVar = (aqzq) aihfVar.instance;
        aqzq aqzqVar2 = aqzq.a;
        str.getClass();
        aqzqVar.b |= 2;
        aqzqVar.d = str;
    }

    public final void an(Integer num) {
        aihf aihfVar = this.a;
        int iIntValue = num.intValue();
        aihfVar.copyOnWrite();
        aqzq aqzqVar = (aqzq) aihfVar.instance;
        aqzq aqzqVar2 = aqzq.a;
        aqzqVar.b |= 32;
        aqzqVar.h = iIntValue;
    }

    public final void ao(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        aqzq aqzqVar = (aqzq) aihfVar.instance;
        aqzq aqzqVar2 = aqzq.a;
        str.getClass();
        aqzqVar.b |= 16;
        aqzqVar.g = str;
    }

    public final void ap(Integer num) {
        aihf aihfVar = this.a;
        int iIntValue = num.intValue();
        aihfVar.copyOnWrite();
        aqzq aqzqVar = (aqzq) aihfVar.instance;
        aqzq aqzqVar2 = aqzq.a;
        aqzqVar.b |= SemanticState.Focused;
        aqzqVar.j = iIntValue;
    }

    public final void aq(Boolean bool) {
        aihf aihfVar = this.a;
        boolean zBooleanValue = bool.booleanValue();
        aihfVar.copyOnWrite();
        aqzq aqzqVar = (aqzq) aihfVar.instance;
        aqzq aqzqVar2 = aqzq.a;
        aqzqVar.b |= 8;
        aqzqVar.f = zBooleanValue;
    }

    public final void ar(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        aqzq aqzqVar = (aqzq) aihfVar.instance;
        aqzq aqzqVar2 = aqzq.a;
        str.getClass();
        aqzqVar.b |= 4;
        aqzqVar.e = str;
    }

    public final void as(Integer num) {
        aihf aihfVar = this.a;
        int iIntValue = num.intValue();
        aihfVar.copyOnWrite();
        aqzq aqzqVar = (aqzq) aihfVar.instance;
        aqzq aqzqVar2 = aqzq.a;
        aqzqVar.b |= 64;
        aqzqVar.i = iIntValue;
    }

    public final aqzp at() {
        return new aqzp((aqzq) this.a.build());
    }
}
