package defpackage;

import com.google.android.libraries.youtube.reel.internal.pager.ReelRecyclerView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acna implements acrm {
    final /* synthetic */ acnb a;
    final /* synthetic */ int b;

    public acna(acnb acnbVar, int i) {
        this.a = acnbVar;
        this.b = i;
    }

    @Override // defpackage.acrm
    public final void a() {
        acnb acnbVar = this.a;
        acnbVar.c();
        acnbVar.b();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [awqg, java.lang.Object] */
    @Override // defpackage.acrm
    public final void b() {
        String str;
        acnb acnbVar = this.a;
        hno hnoVar = acnbVar.l;
        if (hnoVar.V()) {
            acqz acqzVar = acnbVar.b;
            int i = acqzVar.Q;
            acqzVar.Q = 0;
            ReelRecyclerView reelRecyclerView = acqzVar.y;
            if (reelRecyclerView != null) {
                reelRecyclerView.an();
                if (i != 0) {
                    acqzVar.y.ab(0);
                }
            }
        }
        acqz acqzVar2 = acnbVar.b;
        Set setU = acqzVar2.U(0, this.b + 1, 7);
        actm actmVar = acnbVar.d;
        actmVar.f("r_rrwsr");
        if (hnoVar.P() && setU != null) {
            aclm aclmVar = acnbVar.g;
            ArrayList arrayList = new ArrayList(atqq.N(setU, 10));
            Iterator it = setU.iterator();
            while (it.hasNext()) {
                arrayList.add(aecm.ad(((acra) it.next()).f));
            }
            aclmVar.a(aguu.V(arrayList));
        }
        Optional optionalK = acqzVar2.k(acqzVar2.c());
        int i2 = 15;
        vre vreVar = new vre(new acjn(acnbVar, 14), 15);
        if (true == optionalK.isPresent()) {
            optionalK = Optional.ofNullable(vreVar.a.invoke(optionalK.get()));
        }
        if (optionalK.isPresent()) {
            apfp apfpVarC = ((acra) optionalK.get()).c();
            actmVar.j(apfpVarC, acnbVar.f.hx());
            String str2 = apfpVarC.U;
            str2.getClass();
            if (str2.length() > 0) {
                aunn aunnVar = acnbVar.h;
                if (((aenu) aunnVar.io()).m() && (str = acnbVar.k) != null) {
                    ((aenu) aunnVar.io()).i(str, aewo.v(41, null, null, null, 3, 14).a(new acjn(str2, i2)));
                    acnbVar.k = null;
                }
            }
        } else {
            acnbVar.b();
        }
        acnbVar.c();
    }
}
