package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adot implements adox {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof adot) && this.a == ((adot) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Color(value=" + this.a + ')';
    }
}
