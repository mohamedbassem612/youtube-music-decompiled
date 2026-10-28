package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyz implements eyv {
    public static final eyz a = new eyz(2, null);
    private final /* synthetic */ int $cid;

    public eyz(int i) {
        this.$cid = i;
    }

    @Override // defpackage.eyv
    public final boolean a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return obj.toString().startsWith("data:image");
        }
        return true;
    }

    @Override // defpackage.eyv
    public final hed b(Object obj, int i, int i2, ety etyVar) {
        int i3 = this.$cid;
        if (i3 != 0) {
            return i3 != 1 ? new hed(new ffd(obj), new eze(obj)) : new hed(new ffd(obj), new eyc(obj.toString()));
        }
        return null;
    }

    @Deprecated
    public eyz(int i, char[] cArr) {
        this.$cid = i;
    }
}
