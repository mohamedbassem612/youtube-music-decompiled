package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajpu extends tzk {
    public final aihf a;

    public ajpu(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return ap();
    }

    public final void am(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        ajpx ajpxVar = (ajpx) aihfVar.instance;
        ajpx ajpxVar2 = ajpx.a;
        ajpxVar.c |= 32;
        ajpxVar.i = str;
    }

    public final void an(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        ajpx ajpxVar = (ajpx) aihfVar.instance;
        ajpx ajpxVar2 = ajpx.a;
        str.getClass();
        ajpxVar.c |= 16;
        ajpxVar.h = str;
    }

    public final void ao(aonc aoncVar) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        ajpx ajpxVar = (ajpx) aihfVar.instance;
        ajpx ajpxVar2 = ajpx.a;
        ajpxVar.g = aoncVar.d;
        ajpxVar.c |= 8;
    }

    public final ajpw ap() {
        return new ajpw((ajpx) this.a.build());
    }
}
