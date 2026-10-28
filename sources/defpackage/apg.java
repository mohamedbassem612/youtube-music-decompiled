package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apg implements apf {
    private final float a = 1.0f;
    private final float b = 1.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apg)) {
            return false;
        }
        apg apgVar = (apg) obj;
        float f = apgVar.a;
        float f2 = apgVar.b;
        return true;
    }

    public final int hashCode() {
        return -268435456;
    }

    public final String toString() {
        return "DensityImpl(density=1.0, fontScale=1.0)";
    }
}
