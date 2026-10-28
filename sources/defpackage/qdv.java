package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qdv extends qdt {
    private final String a;

    public qdv(qci qciVar) {
        this.a = String.valueOf(qciVar);
    }

    @Override // defpackage.qdt
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.qdt
    public final String b() {
        return this.a;
    }

    public qdv(String str) {
        this.a = str;
    }

    public qdv(Class cls) {
        this.a = cls.getName();
    }

    public qdv(Enum r1) {
        this.a = r1.name();
    }
}
