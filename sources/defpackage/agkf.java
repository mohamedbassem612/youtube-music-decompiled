package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agkf extends agkn {
    public final agkg a() {
        return (agkg) super.e();
    }

    public final void b(Object obj, Object obj2) {
        super.g(obj, obj2);
    }

    public final void c(agom agomVar) {
        for (Map.Entry entry : agomVar.n().entrySet()) {
            h(entry.getKey(), (Iterable) entry.getValue());
        }
    }
}
