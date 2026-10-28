package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eeu implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ eeu(int i, String str, int i2) {
        this.$cid = i2;
        this.a = "UPDATE workspec SET stop_reason=? WHERE id=?";
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        if (this.$cid != 0) {
            dpt dptVar = (dpt) obj;
            dptVar.getClass();
            dpb dpbVarA = dptVar.a(this.a);
            int i = this.b;
            try {
                dpbVarA.i(1, this.c);
                dpbVarA.g(2, i);
                return dpbVarA.l() ? new eeg(dpbVarA.d(ape.m(dpbVarA, "work_spec_id")), (int) dpbVarA.b(ape.m(dpbVarA, "generation")), (int) dpbVarA.b(ape.m(dpbVarA, "system_id"))) : null;
            } finally {
                dpbVarA.close();
            }
        }
        dpt dptVar2 = (dpt) obj;
        dptVar2.getClass();
        dpb dpbVarA2 = dptVar2.a(this.a);
        String str = this.c;
        try {
            dpbVarA2.g(1, this.b);
            dpbVarA2.i(2, str);
            dpbVarA2.l();
            return awmy.a;
        } finally {
            dpbVarA2.close();
        }
    }

    public /* synthetic */ eeu(String str, int i, int i2) {
        this.$cid = i2;
        this.a = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        this.c = str;
        this.b = i;
    }
}
