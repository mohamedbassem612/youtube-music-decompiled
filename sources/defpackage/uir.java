package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uir {
    public final String a;
    public final Function0 b;

    public uir(String str, Function0 function0) {
        str.getClass();
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uir) {
            uir uirVar = (uir) obj;
            if (awrc.c(this.a, uirVar.a) && awrc.c(this.b, uirVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PopupButton(text=" + this.a + ", listener=" + this.b + ')';
    }
}
