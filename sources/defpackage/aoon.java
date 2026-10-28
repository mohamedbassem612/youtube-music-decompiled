package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoon extends tzk {
    public final aihh a;

    private aoon() {
        super(null);
        this.a = (aihh) aooq.a.createBuilder();
    }

    @Override // defpackage.tzk
    /* JADX INFO: renamed from: am, reason: merged with bridge method [inline-methods] */
    public final aoop I(wek wekVar) {
        return new aoop((aooq) this.a.build(), wekVar);
    }

    public final void an(String str) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        aooq aooqVar = (aooq) aihhVar.instance;
        aooq aooqVar2 = aooq.a;
        str.getClass();
        aooqVar.b |= SemanticState.ReadOnly;
        aooqVar.o = str;
    }

    public final void ao(String str) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        aooq aooqVar = (aooq) aihhVar.instance;
        aooq aooqVar2 = aooq.a;
        str.getClass();
        aooqVar.b |= SemanticState.Hidden;
        aooqVar.l = str;
    }

    public final void ap(String str) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        aooq aooqVar = (aooq) aihhVar.instance;
        aooq aooqVar2 = aooq.a;
        str.getClass();
        aooqVar.b |= SemanticState.Modal;
        aooqVar.p = str;
    }

    public final void aq(aigj aigjVar) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        aooq aooqVar = (aooq) aihhVar.instance;
        aooq aooqVar2 = aooq.a;
        aooqVar.b |= 2;
        aooqVar.d = aigjVar;
    }

    public final void ar(Long l) {
        aihh aihhVar = this.a;
        long jLongValue = l.longValue();
        aihhVar.copyOnWrite();
        aooq aooqVar = (aooq) aihhVar.instance;
        aooq aooqVar2 = aooq.a;
        aooqVar.b |= 16;
        aooqVar.g = jLongValue;
    }

    public aoon(aihh aihhVar) {
        super(null);
        this.a = aihhVar;
    }
}
