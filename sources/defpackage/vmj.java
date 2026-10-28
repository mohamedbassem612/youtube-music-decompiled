package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vmj extends vmm {
    private final Integer a;
    private final float b;

    public vmj(Integer num, float f) {
        this.a = num;
        this.b = f;
    }

    @Override // defpackage.vmm, defpackage.vmp
    public final float a() {
        return this.b;
    }

    @Override // defpackage.vmm
    public final Integer b() {
        return this.a;
    }

    @Override // defpackage.vmm, defpackage.vmp
    public final /* synthetic */ Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmm) {
            vmm vmmVar = (vmm) obj;
            if (this.a.equals(vmmVar.b()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(vmmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RollingDigit{value=" + this.a + ", width=" + this.b + '}';
    }
}
