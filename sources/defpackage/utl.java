package defpackage;

import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class utl implements utu {
    private final augy a;
    private final uss b;

    public utl(augy augyVar, uss ussVar) {
        this.a = augyVar;
        this.b = ussVar;
    }

    @Override // defpackage.utu
    public final utv a(auhs auhsVar) throws utw {
        augy augyVar = this.a;
        if ((augyVar.b & 1) == 0) {
            throw new utw(new IllegalArgumentException("Added segment must have an ID"), this);
        }
        if (usj.n(auhsVar, augyVar.e).isPresent() || usj.m(auhsVar, augyVar.e).isPresent()) {
            throw new utw(new IllegalArgumentException("Tried to add graphical segment with conflicting ID"), this);
        }
        if (!this.b.a(augyVar)) {
            throw new utw(new IllegalArgumentException("Added graphical segment failed validation, skipping."), this);
        }
        Optional optionalOf = (augyVar.b & 4) != 0 ? Optional.of(Integer.valueOf(augyVar.g)) : Optional.empty();
        if (optionalOf.isPresent() && ((Integer) optionalOf.get()).intValue() <= 0) {
            throw new utw(new IllegalArgumentException("Adding graphical segment with invalid Z index"), this);
        }
        Optional optionalP = usj.p(auhsVar, usj.a(augyVar));
        if (true == optionalP.isPresent()) {
            optionalP = Optional.ofNullable(Integer.valueOf(((Integer) optionalP.get()).intValue() + 1));
        }
        int iIntValue = ((Integer) optionalOf.orElse((Integer) optionalP.orElse(1))).intValue();
        agjz agjzVar = new agjz(4);
        int i = 6;
        if (Collection.EL.stream(auhsVar.d).filter(new mob(iIntValue, 5)).anyMatch(new uso(yno.fZ(augyVar), i))) {
            agjzVar.j((Iterable) Collection.EL.stream(auhsVar.d).filter(new mob(iIntValue, i)).map(new ush(8)).collect(aghu.a));
        }
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        augyVar2.b |= 4;
        augyVar2.g = iIntValue;
        agjzVar.h(new utm((augy) jrrVar.build(), 0));
        return new utt(agjzVar.g());
    }

    @Override // defpackage.utu
    public final /* synthetic */ utv b(auhs auhsVar) {
        return a(auhsVar);
    }
}
