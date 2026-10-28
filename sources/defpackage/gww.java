package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gww implements zza {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private final Object b;

    public gww(aczl aczlVar, String str, int i) {
        this.$cid = i;
        this.a = aczlVar;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, vwx] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, zza] */
    @Override // defpackage.tnh
    public final /* synthetic */ void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            alto altoVar = (alto) obj;
            ((gwx) this.a).a.d(altoVar.c, null);
            ?? r3 = this.b;
            if (r3 != 0) {
                r3.a(altoVar);
                return;
            }
            return;
        }
        if (i == 1) {
            altb altbVar = (altb) obj;
            ((gsp) this.a).a.d(altbVar.c, null);
            ?? r4 = this.b;
            if (r4 != 0) {
                r4.a(altbVar);
                return;
            }
            return;
        }
        alvy alvyVar = (alvy) obj;
        Iterator it = alvyVar.g.iterator();
        while (it.hasNext()) {
            ((aczl) this.a).d.a((ajwo) it.next());
        }
        aczl aczlVar = (aczl) this.a;
        aczlVar.y((String) this.b, false);
        ((jij) aczlVar.g).m(alvyVar);
        ((isi) aczlVar.b).k();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zza] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, zza] */
    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        abkh abkhVar;
        int i = this.$cid;
        if (i == 0) {
            ttm ttmVar = ((gwx) this.a).b;
            ttmVar.d(ttmVar.b(toeVar));
            ?? r2 = this.b;
            if (r2 != 0) {
                r2.jj(toeVar);
                return;
            }
            return;
        }
        if (i == 1) {
            ttm ttmVar2 = ((gsp) this.a).b;
            ttmVar2.d(ttmVar2.b(toeVar));
            ?? r3 = this.b;
            if (r3 != 0) {
                r3.jj(toeVar);
                return;
            }
            return;
        }
        Object obj = this.b;
        aczl aczlVar = (aczl) this.a;
        String str = (String) obj;
        aczlVar.y(str, true);
        if (str.equals("DELETE")) {
            abkhVar = abkh.c;
        } else {
            abkhVar = str.equals("REORDER") ? abkh.b : abkh.a;
        }
        ((isi) aczlVar.b).g(abkhVar);
    }

    public gww(gut gutVar, zza zzaVar, int i) {
        this.$cid = i;
        this.a = gutVar;
        this.b = zzaVar;
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
