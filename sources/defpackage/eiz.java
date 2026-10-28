package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class eiz extends enp {
    final /* synthetic */ enp a;

    public eiz(enp enpVar) {
        this.a = enpVar;
    }

    @Override // defpackage.enp
    public final /* bridge */ /* synthetic */ Object a(eno enoVar) {
        Float f = (Float) this.a.a(enoVar);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
