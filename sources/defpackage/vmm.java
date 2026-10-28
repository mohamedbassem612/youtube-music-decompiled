package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class vmm implements vmp {
    public static vmm d(int i, float f) {
        return new vmj(Integer.valueOf(i), f);
    }

    @Override // defpackage.vmp
    public abstract float a();

    public abstract Integer b();

    @Override // defpackage.vmp
    public /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    @Override // defpackage.vmp
    public final boolean e(vmp vmpVar) {
        if (vmpVar instanceof vmm) {
            return b().equals(((vmm) vmpVar).b());
        }
        return false;
    }

    @Override // defpackage.vmp
    public final vmp f() {
        return d(b().intValue(), 0.0f);
    }
}
