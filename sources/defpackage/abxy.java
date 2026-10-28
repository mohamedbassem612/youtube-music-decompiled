package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abxy implements abxx {
    private final /* synthetic */ int $cid;
    public static final abxy d = new abxy(3);
    public static final abxy c = new abxy(2);
    public static final abxy b = new abxy(1);
    public static final abxy a = new abxy(0);

    private abxy(int i) {
        this.$cid = i;
    }

    @Override // defpackage.abxx
    public final boolean a(abxw abxwVar) {
        int i = this.$cid;
        if (i == 0 || i == 1 || i == 2) {
            return true;
        }
        return (abmt.aM(abxwVar.c) || abxwVar.b.f() != null) && !abxwVar.a.ar(abob.d);
    }
}
