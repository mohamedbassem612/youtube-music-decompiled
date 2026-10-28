package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class adaz implements agex {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adaz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.agex
    public final boolean a(Object obj) {
        if (this.$cid != 0) {
            return (obj == null || ((acyx) this.a).a(obj) == null) ? false : true;
        }
        Integer num = (Integer) obj;
        int i = adba.a;
        amve amveVar = ((vyo) this.a).b().f;
        if (amveVar == null) {
            amveVar = amve.a;
        }
        return amveVar.h.contains(num);
    }
}
