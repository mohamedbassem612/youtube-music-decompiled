package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class amta extends tzk {
    private final aihf a;

    public amta(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return ao();
    }

    public final void am(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        amtd amtdVar = (amtd) aihfVar.instance;
        amtd amtdVar2 = amtd.a;
        str.getClass();
        amtdVar.b |= 4;
        amtdVar.e = str;
    }

    public final void an(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        amtd amtdVar = (amtd) aihfVar.instance;
        amtd amtdVar2 = amtd.a;
        str.getClass();
        amtdVar.b |= 2;
        amtdVar.d = str;
    }

    public final amtc ao() {
        return new amtc((amtd) this.a.build());
    }
}
