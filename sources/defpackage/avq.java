package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avq {
    final Resources a;
    final Resources.Theme b;

    public avq(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avq avqVar = (avq) obj;
            if (this.a.equals(avqVar.a) && Objects.equals(this.b, avqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
