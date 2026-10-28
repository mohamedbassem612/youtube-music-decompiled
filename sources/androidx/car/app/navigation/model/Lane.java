package androidx.car.app.navigation.model;

import defpackage.aad;
import defpackage.yf;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Lane {
    private final List mDirections;

    Lane(List list) {
        this.mDirections = aad.b(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lane) {
            return Objects.equals(this.mDirections, ((Lane) obj).mDirections);
        }
        return false;
    }

    public List getDirections() {
        return aad.a(this.mDirections);
    }

    public int hashCode() {
        return Objects.hashCode(this.mDirections);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[direction count: ");
        List list = this.mDirections;
        sb.append(list != null ? list.size() : 0);
        sb.append(']');
        return sb.toString();
    }

    private Lane() {
        this.mDirections = Collections.EMPTY_LIST;
    }
}
