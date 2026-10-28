package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mpg implements ntp {
    final /* synthetic */ ntq a;
    final /* synthetic */ nru b;
    final /* synthetic */ nsl c;
    final /* synthetic */ mpo d;
    final /* synthetic */ omj e;

    public mpg(mpo mpoVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar) {
        this.e = omjVar;
        this.a = ntqVar;
        this.b = nruVar;
        this.c = nslVar;
        this.d = mpoVar;
    }

    @Override // defpackage.ntp
    public final void d(View view, View view2) {
        ntq ntqVar = this.a;
        nru nruVar = this.b;
        mpo mpoVar = this.d;
        nry nryVar = mpoVar.b;
        nsl nslVar = this.c;
        mpoVar.i(nryVar.a(this.e.x(), mpo.j(view, view2, 13, null, null, ntqVar, nruVar, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
    }
}
