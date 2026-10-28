package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aphf extends tzk {
    public final aihf a;

    public aphf(aihf aihfVar) {
        super(null);
        this.a = aihfVar;
    }

    @Override // defpackage.tzk
    public final /* bridge */ /* synthetic */ weh I(wek wekVar) {
        return new aphh((aphi) this.a.build());
    }

    public final void am(Long l) {
        aihf aihfVar = this.a;
        long jLongValue = l.longValue();
        aihfVar.copyOnWrite();
        aphi aphiVar = (aphi) aihfVar.instance;
        aihw aihwVar = aphi.a;
        aphiVar.c |= 2;
        aphiVar.e = jLongValue;
    }
}
