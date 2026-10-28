package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ioa extends qr {
    final /* synthetic */ ioc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioa(ioc iocVar) {
        super(true);
        this.a = iocVar;
    }

    @Override // defpackage.qr
    public final void b() {
        ioc iocVar = this.a;
        if (iocVar.B) {
            aihf aihfVarCreateBuilder = ajmf.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            ajmf ajmfVar = (ajmf) aihfVarCreateBuilder.instance;
            ajmfVar.b |= 1;
            ajmfVar.c = "FEmusic_home";
            ajmf ajmfVar2 = (ajmf) aihfVarCreateBuilder.build();
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihhVar.e(ajmj.a, ajmfVar2);
            iocVar.E.c("FEmusic_home", (ajwo) aihhVar.build());
            iocVar.D.h();
        }
    }
}
