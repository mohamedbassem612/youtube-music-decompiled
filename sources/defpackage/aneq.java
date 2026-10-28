package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aneq implements weh {
    static final anep a;
    public static final weq b;
    private final anen c;

    static {
        anep anepVar = new anep();
        a = anepVar;
        b = anepVar;
    }

    public aneq(anen anenVar) {
        this.c = anenVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new aneo(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aneq) && this.c.equals(((aneq) obj).c);
    }

    public anev getInitialState() {
        anev anevVar = this.c.d;
        return anevVar == null ? anev.a : anevVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MediaGenTextComposerParamsEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
