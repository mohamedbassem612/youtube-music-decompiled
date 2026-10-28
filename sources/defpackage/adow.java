package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adow implements adox {
    public final String a;

    public /* synthetic */ adow(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof adow) && awrc.c(this.a, ((adow) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "String(value=" + this.a + ')';
    }
}
