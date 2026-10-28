package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vmk extends vmr {
    private final String a;
    private final float b;

    public vmk(String str, float f) {
        if (str == null) {
            throw new NullPointerException("Null value");
        }
        this.a = str;
        this.b = f;
    }

    @Override // defpackage.vmr, defpackage.vmp
    public final float a() {
        return this.b;
    }

    @Override // defpackage.vmr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.vmr, defpackage.vmp
    public final /* synthetic */ Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmr) {
            vmr vmrVar = (vmr) obj;
            if (this.a.equals(vmrVar.b()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(vmrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "StaticLabel{value=" + this.a + ", width=" + this.b + '}';
    }
}
