package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cry {
    public final String a;
    public final agkj b;
    public final agkj c;
    public final agkj d;

    public cry(String str, Map map, Map map2, Map map3) {
        this.a = str;
        this.b = agkj.h(map);
        this.c = agkj.h(map2);
        this.d = agkj.h(map3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cry) {
            cry cryVar = (cry) obj;
            if (Objects.equals(this.a, cryVar.a) && Objects.equals(this.b, cryVar.b) && Objects.equals(this.c, cryVar.c) && Objects.equals(this.d, cryVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
