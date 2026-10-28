package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aakv implements aans {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aakv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aans
    public final int a() {
        long jC;
        int i = this.$cid;
        if (i == 0) {
            jC = ((aakw) this.a).f.c(12, 45416993L, 0L);
        } else {
            if (i == 1) {
                return 5000;
            }
            jC = ((aakw) this.a).f.c(11, 45414381L, 0L);
        }
        return (int) jC;
    }

    @Override // defpackage.aans
    public final agex b() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new wix(7) : new hsb(this.a, 2);
        }
        return new wix(6);
    }
}
