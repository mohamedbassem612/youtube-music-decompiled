package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awrd implements awqu {
    private final Class a;

    public awrd(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.awqu
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awrd) && awrc.c(this.a, ((awrd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a.toString()).concat(" (Kotlin reflection is not available)");
    }
}
