package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agsh extends agro {
    private final StackTraceElement b;

    public agsh(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.agro
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.agro
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.agro
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.agro
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof agsh) && this.b.equals(((agsh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
