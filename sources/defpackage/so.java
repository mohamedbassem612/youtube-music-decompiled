package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class so extends vm {
    public final float a;
    public final float b;
    public final byte[] c;

    public so(float f, float f2, byte[] bArr) {
        super((byte[]) null);
        this.a = f;
        this.b = f2;
        this.c = bArr;
        azs.f(bArr.length > 0, "quantizedValues cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            so soVar = (so) obj;
            if (Float.compare(soVar.a, this.a) == 0 && Float.compare(soVar.b, this.b) == 0 && Arrays.equals(this.c, soVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b)) * 31) + Arrays.hashCode(this.c);
    }
}
