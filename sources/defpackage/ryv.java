package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@ryx(a = shp.class)
public final class ryv implements ryy {
    private final /* synthetic */ int $cid;

    public ryv(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ryy
    public final String a() {
        return this.$cid != 2 ? "0" : "";
    }

    @Override // defpackage.ryy
    public final String b(shh shhVar) {
        int i = this.$cid;
        if (i == 0) {
            return Integer.toString(((sfv) shhVar.d(shp.class)).b());
        }
        if (i == 1) {
            return true != ((sfv) shhVar.d(shp.class)).e() ? "0" : "1";
        }
        if (i != 2) {
            return i != 3 ? Integer.toString(((sfv) shhVar.d(shp.class)).c()) : Integer.toString(((sfv) shhVar.d(shp.class)).a());
        }
        String str = ((sfv) shhVar.d(shp.class)).b;
        return str == null ? "" : str;
    }
}
