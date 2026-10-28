package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abbw {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public abbw(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof abbw)) {
                return false;
            }
            abbw abbwVar = (abbw) obj;
            if (this.a != abbwVar.a || this.c != abbwVar.c || this.d != abbwVar.d || this.b != abbwVar.b) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d));
    }
}
