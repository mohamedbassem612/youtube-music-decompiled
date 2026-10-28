package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ados implements adox {
    public final boolean a;

    public /* synthetic */ ados(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ados) && this.a == ((ados) obj).a;
    }

    public final int hashCode() {
        return a.aj(this.a);
    }

    public final String toString() {
        return "Boolean(value=" + this.a + ')';
    }
}
