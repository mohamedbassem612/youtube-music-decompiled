package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class annv implements weh {
    static final annu a;
    public static final weq b;
    public final wek c;
    public final annw d;

    static {
        annu annuVar = new annu();
        a = annuVar;
        b = annuVar;
    }

    public annv(annw annwVar, wek wekVar) {
        this.d = annwVar;
        this.c = wekVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        annw annwVar = this.d;
        if (annwVar.d.size() > 0) {
            agkxVar.j(annwVar.d);
        }
        if (annwVar.e.size() > 0) {
            agkxVar.j(annwVar.e);
        }
        if (annwVar.f.size() > 0) {
            agkxVar.j(annwVar.f);
        }
        if (annwVar.g.size() > 0) {
            agkxVar.j(annwVar.g);
        }
        if (annwVar.h.size() > 0) {
            agkxVar.j(annwVar.h);
        }
        if (annwVar.i.size() > 0) {
            agkxVar.j(annwVar.i);
        }
        if (annwVar.j.size() > 0) {
            agkxVar.j(annwVar.j);
        }
        if (annwVar.k.size() > 0) {
            agkxVar.j(annwVar.k);
        }
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.d.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.d.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new annt(this.d.toBuilder());
    }

    public final List e() {
        return this.d.g;
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof annv) && this.d.equals(((annv) obj).d);
    }

    public final List f() {
        return this.d.f;
    }

    public final List g() {
        return this.d.i;
    }

    public final List h() {
        return this.d.d;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.d.hashCode() ^ 1008001;
    }

    public final List i() {
        return this.d.h;
    }

    public final List j() {
        return this.d.j;
    }

    public final List k() {
        return this.d.e;
    }

    public final String toString() {
        return "MusicDownloadsLibraryEntityModel{" + String.valueOf(this.d) + '}';
    }

    public weq getType() {
        return b;
    }
}
