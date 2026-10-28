package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rrz implements rrl {
    public final aunn a;
    public aobj c = aobj.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
    public final awku b = new awku();

    public rrz(aunn aunnVar, aunn aunnVar2, avmb avmbVar, vxu vxuVar) {
        this.a = aunnVar2;
        aguu.al(new ope(this, 18));
        vxuVar.a.v(avmbVar).C(new gto((Object) this, (Object) aunnVar, (Object) avmbVar, 12, (byte[]) null));
    }

    @Override // defpackage.rrl
    public final aobj a() {
        return this.c;
    }
}
