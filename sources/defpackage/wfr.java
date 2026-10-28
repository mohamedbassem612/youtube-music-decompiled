package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wfr {
    private final wfp a;

    static {
        wfn.a().a();
    }

    public wfr(agev agevVar) {
        this.a = (wfp) agevVar.e(new wfq(0));
    }

    public final int a(String str) {
        rmm rmmVar = new rmm(8);
        akve akveVarA = this.a.a(str);
        return ((Integer) (akveVarA != null ? rmmVar.apply(akveVarA) : Integer.MIN_VALUE)).intValue();
    }
}
