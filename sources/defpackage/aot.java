package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aot {
    private final String a;
    private final Function0 b;

    public aot(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aot) {
            aot aotVar = (aot) obj;
            if (awrc.c(this.a, aotVar.a) && this.b == aotVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
