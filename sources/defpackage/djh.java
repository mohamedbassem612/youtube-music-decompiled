package defpackage;

import android.content.ComponentName;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class djh {
    public final List a;
    public final boolean b = true;
    private final ComponentName c = null;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public djh(yu yuVar) {
        this.a = yuVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof djh) {
            djh djhVar = (djh) obj;
            if (this.a.equals(djhVar.a)) {
                boolean z = djhVar.b;
                ComponentName componentName = djhVar.c;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.TRUE, null);
    }
}
