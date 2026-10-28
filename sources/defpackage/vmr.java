package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vmr implements vmp {
    public static vmr d(String str, vmn vmnVar) {
        return new vmk(str, vmnVar.b(str));
    }

    @Override // defpackage.vmp
    public abstract float a();

    public abstract String b();

    @Override // defpackage.vmp
    public /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    @Override // defpackage.vmp
    public final boolean e(vmp vmpVar) {
        if (vmpVar instanceof vmr) {
            return b().equals(((vmr) vmpVar).b());
        }
        return false;
    }

    @Override // defpackage.vmp
    public final vmp f() {
        return new vmk(b(), 0.0f);
    }
}
