package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arjp extends tzk {
    public final aihf a;

    public arjp(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return an();
    }

    public final void am(String str) {
        aihf aihfVar = this.a;
        aihfVar.copyOnWrite();
        arjs arjsVar = (arjs) aihfVar.instance;
        arjs arjsVar2 = arjs.a;
        str.getClass();
        arjsVar.b |= 2;
        arjsVar.d = str;
    }

    public final arjr an() {
        return new arjr((arjs) this.a.build());
    }
}
