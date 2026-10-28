package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mpl implements ntm {
    final /* synthetic */ ntq a;
    final /* synthetic */ nru b;
    final /* synthetic */ nsl c;
    final /* synthetic */ mpo d;
    final /* synthetic */ omj e;

    public mpl(mpo mpoVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar) {
        this.e = omjVar;
        this.a = ntqVar;
        this.b = nruVar;
        this.c = nslVar;
        this.d = mpoVar;
    }

    @Override // defpackage.ntm
    public final void a(View view) {
        ntq ntqVar = this.a;
        nru nruVar = this.b;
        nsl nslVar = this.c;
        mpo mpoVar = this.d;
        mpoVar.i(mpoVar.b.a(this.e.x(), mpo.j(view, null, 18, null, null, ntqVar, nruVar, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
    }
}
