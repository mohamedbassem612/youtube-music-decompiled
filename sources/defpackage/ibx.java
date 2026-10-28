package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ibx extends zik {
    final /* synthetic */ aesp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibx(aesp aespVar) {
        super((byte[]) null);
        this.a = aespVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    @Override // defpackage.zik
    public final void gV(String str) {
        ibv ibvVar;
        int iHashCode = str.hashCode();
        if (iHashCode != -2022932448) {
            if (iHashCode == -2022918939 && str.equals("LOOP_MODE_ONE")) {
                ibvVar = ibv.LOOP_ONE;
            } else {
                ibvVar = ibv.LOOP_OFF;
            }
        } else if (str.equals("LOOP_MODE_ALL")) {
            ibvVar = ibv.LOOP_ALL;
        } else {
            ibvVar = ibv.LOOP_OFF;
        }
        this.a.t(ibvVar, false);
    }
}
