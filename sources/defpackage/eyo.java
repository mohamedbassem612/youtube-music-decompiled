package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eyo {
    public final String a;

    public eyo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eyo) {
            return this.a.equals(((eyo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
