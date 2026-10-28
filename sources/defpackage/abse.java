package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class abse {
    public final String a;
    public final sxu b;
    final /* synthetic */ absg c;
    private final alvl d;

    public abse(absg absgVar, alvl alvlVar, sxu sxuVar, String str) {
        this.c = absgVar;
        this.a = str;
        this.d = alvlVar;
        this.b = sxuVar;
    }

    public void a() {
        alvl alvlVar = this.d;
        int i = alvlVar.c;
        aony aonyVarA = aony.a(i);
        if (aonyVarA == null) {
            aonyVarA = aony.OK;
        }
        if (aonyVarA == aony.LOGIN_REQUIRED) {
            this.c.c(alvlVar, this.b, this.a);
            return;
        }
        aony aonyVarA2 = aony.a(i);
        if (aonyVarA2 == null) {
            aonyVarA2 = aony.OK;
        }
        if (aonyVarA2 == aony.AGE_CHECK_REQUIRED) {
            absg absgVar = this.c;
            absgVar.e = ahng.n(Boolean.TRUE);
            absgVar.e();
        }
        aony aonyVarA3 = aony.a(alvlVar.c);
        if (aonyVarA3 == null) {
            aonyVarA3 = aony.OK;
        }
        if (aonyVarA3 == aony.CONTENT_CHECK_REQUIRED) {
            this.c.q(true);
        }
        absh.b(this.b);
    }

    public final void b() {
        absh.a(this.b, absg.h(this.d, this.a));
    }
}
