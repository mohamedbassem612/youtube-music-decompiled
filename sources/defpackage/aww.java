package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class aww {
    final String a;
    final String b;
    final List c;

    public aww(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aww) {
            aww awwVar = (aww) obj;
            if (Objects.equals(this.a, awwVar.a) && Objects.equals(this.b, awwVar.b) && Objects.equals(this.c, awwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
