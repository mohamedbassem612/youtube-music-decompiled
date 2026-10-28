package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hsn implements aant {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/entitycontroller/MusicSmartDownloadTriggerEntityController");
    public static final aanp b;
    public final Context c;
    public final mbc d;
    public final hnq e;
    public final hlp f;
    public final SharedPreferences g;
    public final twf h;
    public final jkg i;
    public final hlz j;
    public final hpb k;
    public final hpk l;
    public final huh m;
    public final huf n;
    public final aany o;
    public final aunn p;
    public final hpy q;
    public final Executor r;
    public final tfq s;
    public final abxv t;
    public final xow u;
    public final hfn v;
    private final aacm w;
    private final zwb x;
    private final hsz y;
    private final syn z;

    static {
        aano aanoVar = new aano(aanp.b);
        aanoVar.d = 26;
        b = aanoVar.a();
    }

    public hsn(Context context, mbc mbcVar, hnq hnqVar, hlp hlpVar, SharedPreferences sharedPreferences, twf twfVar, tfq tfqVar, jkg jkgVar, hfn hfnVar, abxv abxvVar, hlz hlzVar, hpb hpbVar, hpk hpkVar, huh huhVar, huf hufVar, aany aanyVar, aacm aacmVar, aunn aunnVar, xow xowVar, hpy hpyVar, zwb zwbVar, syn synVar, hsz hszVar, Executor executor) {
        this.c = context;
        this.d = mbcVar;
        this.e = hnqVar;
        this.f = hlpVar;
        this.g = sharedPreferences;
        this.h = twfVar;
        this.s = tfqVar;
        this.i = jkgVar;
        this.v = hfnVar;
        this.t = abxvVar;
        this.j = hlzVar;
        this.k = hpbVar;
        this.l = hpkVar;
        this.m = huhVar;
        this.n = hufVar;
        this.o = aanyVar;
        this.w = aacmVar;
        this.p = aunnVar;
        this.u = xowVar;
        this.q = hpyVar;
        this.x = zwbVar;
        this.z = synVar;
        this.y = hszVar;
        this.r = executor;
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        return aans.c;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(zwa zwaVar, aofh aofhVar) {
        int i = aofhVar.c;
        int iBc = a.bc(i);
        if (iBc != 0 && iBc == 5) {
            throw new UnsupportedOperationException("UPDATE action is not supported.");
        }
        int iBc2 = a.bc(i);
        if (iBc2 != 0 && iBc2 == 3) {
            this.w.a(zwaVar.i());
            return ahng.n(aanp.a);
        }
        aofg aofgVar = aofhVar.e;
        if (aofgVar == null) {
            aofgVar = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aphe.b);
        aofgVar.c(aihlVarCheckIsLite);
        Object objK = aofgVar.j.k(aihlVarCheckIsLite.d);
        boolean z = !((aphe) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).d;
        afxd afxdVarF = afxd.f(d());
        oks oksVar = new oks(this, zwaVar, z, 1);
        Executor executor = this.r;
        return afxd.f(afxdVarF.g(oksVar, executor)).h(new gqb(this, zwaVar, 9), executor);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        throw new UnsupportedOperationException("Batch actions are not supported.");
    }

    public final ListenableFuture d() {
        afxd afxdVarF = afxd.f(this.z.n(this.x.e()));
        hrk hrkVar = new hrk(this, 3);
        Executor executor = this.r;
        return afxdVarF.g(hrkVar, executor).h(new gpr(7), executor);
    }

    public final void e(zwa zwaVar, allr allrVar, agkj agkjVar) {
        hsz hszVar = this.y;
        hszVar.c();
        HashSet hashSet = new HashSet();
        Collection.EL.stream(allrVar.e).filter(new hod(16)).forEach(new hnw(this, new int[]{this.e.c()}, agkjVar, (Set) hashSet, 2));
        if (!hashSet.isEmpty()) {
            ahno.at(this.q.a(kro.aq()), new hhi(this, hashSet, 5), this.r);
        }
        Context context = this.c;
        if (!txz.d(context) && !txz.g(context)) {
            List list = (List) Collection.EL.stream(allrVar.e).filter(new hod(17)).map(new hrn(7)).collect(Collectors.toCollection(new hcd(14)));
            if (!list.isEmpty()) {
                ahno.at(this.q.a(kro.aq()), new hhi(this, list, 4), this.r);
            }
        }
        hszVar.d(allrVar.c);
        int i = allrVar.c;
        aacm aacmVar = this.w;
        if (i > 0) {
            aacmVar.d(zwaVar.i(), i);
        } else {
            aacmVar.a(zwaVar.i());
        }
    }

    public final boolean f(float f, boolean z) {
        twf twfVar = this.h;
        if (twfVar.a() < f && !twfVar.b() && !txz.d(this.c)) {
            agrx agrxVar = agso.a;
            return false;
        }
        if ((z && txz.d(this.c)) || this.f.k()) {
            return true;
        }
        agrx agrxVar2 = agso.a;
        return false;
    }
}
