package defpackage;

import j$.util.Objects;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class sx extends vm {
    public final String a;
    public final boolean b;
    public final te c;
    final List d;

    public sx(String str, boolean z, te teVar, List list) {
        super((byte[]) null);
        this.b = z;
        str.getClass();
        this.a = str;
        this.c = teVar;
        list.getClass();
        this.d = list;
    }

    public final Set a() {
        return new afx(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof sx)) {
            sx sxVar = (sx) obj;
            if (this.b == sxVar.b && Objects.equals(this.a, sxVar.a) && Objects.equals(this.c, sxVar.c) && Objects.equals(this.d, sxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), this.a, this.c, this.d);
    }
}
