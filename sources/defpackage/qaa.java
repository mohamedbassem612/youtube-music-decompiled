package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qaa {
    private final int a;
    private final String b;

    public qaa(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qaa) {
            qaa qaaVar = (qaa) obj;
            if (this.a == qaaVar.a && awrc.c(this.b, qaaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SlotLimit(limit=" + this.a + ", slotKey=" + this.b + ')';
    }
}
