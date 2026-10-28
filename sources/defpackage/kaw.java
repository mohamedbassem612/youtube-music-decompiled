package defpackage;

import j$.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kaw {
    public final long a;
    private final int b = 0;
    private final boolean c = false;
    private final JSONObject d = null;

    public kaw(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kaw) {
            kaw kawVar = (kaw) obj;
            if (this.a == kawVar.a) {
                int i = kawVar.b;
                boolean z = kawVar.c;
                JSONObject jSONObject = kawVar.d;
                if (Objects.equals(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), 0, Boolean.FALSE, null);
    }
}
