package defpackage;

import android.view.View;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mpf implements ntp {
    final /* synthetic */ mzl a;
    final /* synthetic */ ntq b;
    final /* synthetic */ nru c;
    final /* synthetic */ nsl d;
    final /* synthetic */ mpo e;
    final /* synthetic */ omj f;

    public mpf(mpo mpoVar, mzl mzlVar, omj omjVar, ntq ntqVar, nru nruVar, nsl nslVar) {
        this.a = mzlVar;
        this.f = omjVar;
        this.b = ntqVar;
        this.c = nruVar;
        this.d = nslVar;
        this.e = mpoVar;
    }

    @Override // defpackage.ntp
    public final /* synthetic */ void d(View view, View view2) {
        Set set = mpo.a;
        mzl mzlVar = this.a;
        if (set.contains(mzlVar)) {
            return;
        }
        set.add(mzlVar);
        mpo mpoVar = this.e;
        omj omjVar = this.f;
        ntq ntqVar = this.b;
        nru nruVar = this.c;
        nsl nslVar = this.d;
        mpoVar.i(mpoVar.b.a(omjVar.x(), mpo.j(view, null, 12, null, null, ntqVar, nruVar, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
    }
}
