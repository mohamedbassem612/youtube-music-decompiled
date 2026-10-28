package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anov implements weh {
    static final anou a;
    public static final weq b;
    private final anoy c;

    static {
        anou anouVar = new anou();
        a = anouVar;
        b = anouVar;
    }

    public anov(anoy anoyVar) {
        this.c = anoyVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anoy anoyVar = this.c;
        if ((anoyVar.b & 2) != 0) {
            agkxVar.c(anoyVar.d);
        }
        if (anoyVar.e.size() > 0) {
            agkxVar.j(anoyVar.e);
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
        return new anot(this.c.toBuilder());
    }

    public final List e() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anov) && this.c.equals(((anov) obj).c);
    }

    public Boolean getRequiredChoice() {
        return Boolean.valueOf(this.c.f);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicFormGroupedBooleanChoiceEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
