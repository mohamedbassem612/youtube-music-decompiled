package defpackage;

import java.lang.annotation.Annotation;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahqk {
    private final String a;
    private final Map b;

    public ahqk(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final Annotation a(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahqk) {
            ahqk ahqkVar = (ahqk) obj;
            if (this.a.equals(ahqkVar.a) && this.b.equals(ahqkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + String.valueOf(this.b.values()) + '}';
    }
}
