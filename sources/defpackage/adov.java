package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adov implements adox {
    public final float a;

    public final boolean equals(Object obj) {
        return (obj instanceof adov) && Float.compare(this.a, ((adov) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Number(value=" + this.a + ')';
    }
}
