package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abda implements awmd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ abdb a;
    public final /* synthetic */ int b;

    public /* synthetic */ abda(abdb abdbVar, int i, int i2) {
        this.$cid = i2;
        this.a = abdbVar;
        this.b = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            int i2 = this.b;
            abdb abdbVar = this.a;
            return i2 == 2 ? abdbVar.e : abdbVar.d;
        }
        int i3 = this.b;
        abdb abdbVar2 = this.a;
        if (i != 1) {
            return i3 == 2 ? abdbVar2.c : abdbVar2.b;
        }
        return i3 == 2 ? abdbVar2.g : abdbVar2.f;
    }
}
