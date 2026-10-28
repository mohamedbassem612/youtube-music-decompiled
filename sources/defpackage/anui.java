package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anui extends tzk {
    public final aihh a;

    public anui(aihh aihhVar) {
        super(null);
        this.a = aihhVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return aq();
    }

    public final void am(String str) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        anuu anuuVar = (anuu) aihhVar.instance;
        anuu anuuVar2 = anuu.a;
        str.getClass();
        anuuVar.b |= 4;
        anuuVar.e = str;
    }

    public final void an(aqmh aqmhVar) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        anuu anuuVar = (anuu) aihhVar.instance;
        anuu anuuVar2 = anuu.a;
        aqmhVar.getClass();
        anuuVar.h = aqmhVar;
        anuuVar.b |= 32;
    }

    public final void ao(String str) {
        aihh aihhVar = this.a;
        aihhVar.copyOnWrite();
        anuu anuuVar = (anuu) aihhVar.instance;
        anuu anuuVar2 = anuu.a;
        str.getClass();
        anuuVar.b |= 2;
        anuuVar.d = str;
    }

    public final void ap(Long l) {
        aihh aihhVar = this.a;
        long jLongValue = l.longValue();
        aihhVar.copyOnWrite();
        anuu anuuVar = (anuu) aihhVar.instance;
        anuu anuuVar2 = anuu.a;
        anuuVar.b |= SemanticState.Focused;
        anuuVar.k = jLongValue;
    }

    public final anuk aq() {
        return new anuk((anuu) this.a.build());
    }
}
