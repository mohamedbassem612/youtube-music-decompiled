package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anos implements weh {
    static final anor a;
    public static final weq b;
    private final anox c;

    static {
        anor anorVar = new anor();
        a = anorVar;
        b = anorVar;
    }

    public anos(anox anoxVar) {
        this.c = anoxVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        anox anoxVar = this.c;
        if (anoxVar.d.size() > 0) {
            agkxVar.j(anoxVar.d);
        }
        if (anoxVar.e.size() > 0) {
            agkxVar.j(anoxVar.e);
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
        return new anoq(this.c.toBuilder());
    }

    public final List e() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof anos) && this.c.equals(((anos) obj).c);
    }

    public final List f() {
        return this.c.e;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicFormEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
