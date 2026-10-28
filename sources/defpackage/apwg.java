package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apwg implements weh {
    static final apwf a;
    public static final weq b;
    private final apwh c;

    static {
        apwf apwfVar = new apwf();
        a = apwfVar;
        b = apwfVar;
    }

    public apwg(apwh apwhVar) {
        this.c = apwhVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        apwh apwhVar = this.c;
        if (apwhVar.d.size() > 0) {
            agkxVar.j(apwhVar.d);
        }
        return agkxVar.g();
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
        return new apwe(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof apwg) && this.c.equals(((apwg) obj).c);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ShortsCreationProjectsListEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
