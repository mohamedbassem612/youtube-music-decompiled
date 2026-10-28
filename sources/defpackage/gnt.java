package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gnt extends qr {
    final /* synthetic */ gnv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnt(gnv gnvVar) {
        super(false);
        this.a = gnvVar;
    }

    @Override // defpackage.qr
    public final void b() {
        Optional optionalEmpty;
        gnv gnvVar = this.a;
        if (gnvVar.a()) {
            if (gnvVar.Z.g()) {
                aihf aihfVarCreateBuilder = anta.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                anta antaVar = (anta) aihfVarCreateBuilder.instance;
                antaVar.b |= 1;
                antaVar.c = true;
                aihfVarCreateBuilder.copyOnWrite();
                anta antaVar2 = (anta) aihfVarCreateBuilder.instance;
                antaVar2.b |= 2;
                antaVar2.d = true;
                anta antaVar3 = (anta) aihfVarCreateBuilder.build();
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihhVar.e(antb.a, antaVar3);
                optionalEmpty = Optional.of((ajwo) aihhVar.build());
            } else {
                optionalEmpty = Optional.empty();
            }
            gfi gfiVar = new gfi(gnvVar, 11);
            if (true == optionalEmpty.isPresent()) {
                ((gnv) gfiVar.a).c.a((ajwo) optionalEmpty.get());
            }
        }
        g(false);
        gnvVar.requireActivity().getOnBackPressedDispatcher().d();
    }
}
