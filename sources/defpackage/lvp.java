package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvp extends lxq implements lvr {
    public lvp() {
        super(lvq.DEFAULT_INSTANCE);
    }

    public final int a() {
        return ((lvq) this.a).accountProperties_.size();
    }

    @Override // defpackage.lxq, defpackage.ltu
    public final int b() {
        return ((lvq) this.a).c();
    }

    public final int d() {
        return ((lvq) this.a).b();
    }

    public final luw e(int i) {
        return ((lvq) this.a).d(i);
    }

    public final String f(int i) {
        return ((lvq) this.a).e(i);
    }

    @Override // defpackage.lxq, defpackage.lvr
    public final String g() {
        return ((lvq) this.a).schemaType_;
    }

    public final void h(int i, String str) {
        s();
        lvq lvqVar = (lvq) this.a;
        int i2 = lvq.SCHEMA_TYPE_FIELD_NUMBER;
        str.getClass();
        lvqVar.f();
        lvqVar.parentTypes_.set(i, str);
    }

    public final void i(String str) {
        s();
        lvq lvqVar = (lvq) this.a;
        int i = lvq.SCHEMA_TYPE_FIELD_NUMBER;
        str.getClass();
        lvqVar.bitField0_ |= 1;
        lvqVar.schemaType_ = str;
    }

    public final void j(int i, lxq lxqVar) {
        s();
        lvq lvqVar = (lvq) this.a;
        luw luwVar = (luw) lxqVar.o();
        int i2 = lvq.SCHEMA_TYPE_FIELD_NUMBER;
        luwVar.getClass();
        lvqVar.h();
        lvqVar.properties_.set(i, luwVar);
    }
}
