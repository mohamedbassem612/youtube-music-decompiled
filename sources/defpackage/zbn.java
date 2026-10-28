package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zbn implements cph {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ cpb a;

    public /* synthetic */ zbn(cpb cpbVar, int i) {
        this.$cid = i;
        this.a = cpbVar;
    }

    @Override // defpackage.cph
    public final cwj a(int i, int i2) {
        int i3 = this.$cid;
        cpb cpbVar = this.a;
        if (i3 != 0) {
            cwj cwjVarA = cpbVar.d().a(i, i2);
            zbb zbbVar = ((zbe) cpbVar).s;
            zbbVar.h(cwjVarA);
            return zbbVar;
        }
        cwj cwjVarA2 = cpbVar.d().a(i, i2);
        zbb zbbVar2 = ((zbo) cpbVar).o;
        zbbVar2.h(cwjVarA2);
        return zbbVar2;
    }
}
