package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sd extends si {
    public final String a() {
        String str = this.a.d;
        azs.l(str);
        return str;
    }

    public final List b() {
        vb vbVar = this.a.f;
        return vbVar == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(vbVar.b);
    }

    public final boolean c() {
        vb vbVar = this.a.f;
        if (vbVar == null) {
            return false;
        }
        return vbVar.a;
    }
}
