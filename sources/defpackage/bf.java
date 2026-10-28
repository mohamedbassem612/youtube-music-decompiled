package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.preference.Preference;
import androidx.work.impl.WorkDatabase;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bf(ViewGroup viewGroup, View view, ba baVar, int i) {
        this.$cid = i;
        this.b = viewGroup;
        this.a = view;
        this.c = baVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [awuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [androidx.car.app.IOnDoneCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v29, types: [cfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v36, types: [cua, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v39, types: [cty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, xz] */
    /* JADX WARN: Type inference failed for: r1v29, types: [cjv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [cjv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aex, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awqk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        boolean zC = false;
        switch (this.$cid) {
            case 0:
                bj bjVar = (bj) this.c;
                C0027do.a(((ea) this.a).a, ((ea) this.b).a, bjVar.f, bjVar.e, false);
                return;
            case 1:
                int i = az.e;
                ((ViewGroup) this.b).endViewTransition((View) this.a);
                Object obj = this.c;
                ((ba) obj).a.a.f((dy) obj);
                return;
            case 2:
                ?? r0 = this.b;
                ?? r1 = this.a;
                this.c.a();
                return;
            case 3:
                ?? r2 = this.c;
                Object obj2 = this.a;
                if (obj2 != null) {
                    try {
                        if (((boc) obj2).a().a(bob.c)) {
                            r2.a();
                            return;
                        }
                    } catch (aeq e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat((String) this.b), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + ((Object) r2));
                return;
            case 4:
                ?? r3 = this.a;
                Object obj3 = this.b;
                ?? r11 = this.c;
                try {
                    aag.g(r11, (String) obj3, r3.a());
                    return;
                } catch (aeq e2) {
                    aag.f(r11, (String) obj3, e2);
                    return;
                } catch (RuntimeException e3) {
                    aag.f(r11, (String) obj3, e3);
                    throw new RuntimeException(e3);
                }
            case 5:
                agke agkeVarG = ((agjz) this.b).g();
                ces cesVar = ((cdc) this.c).l;
                bth bthVar = cesVar.c;
                bthVar.getClass();
                agke agkeVarN = agke.n(agkeVarG);
                dhf dhfVar = cesVar.f;
                dhfVar.a = agkeVarN;
                if (!agkeVarG.isEmpty()) {
                    Object obj4 = this.a;
                    dhfVar.d = (cnm) agkeVarG.get(0);
                    obj4.getClass();
                    dhfVar.c = obj4;
                }
                if (dhfVar.e == null) {
                    dhfVar.e = dhf.p(bthVar, (agke) dhfVar.a, (cnm) dhfVar.d, (btl) dhfVar.b);
                }
                dhfVar.q(bthVar.w());
                return;
            case 6:
                Pair pair = (Pair) this.c;
                int iIntValue = ((Integer) pair.first).intValue();
                cnm cnmVar = (cnm) pair.second;
                cnmVar.getClass();
                ((cdg) this.a).a.i.gm(iIntValue, cnmVar, (cni) this.b);
                return;
            case 7:
                Pair pair2 = (Pair) this.c;
                ((cdg) this.a).a.i.gn(((Integer) pair2.first).intValue(), (cnm) pair2.second, (auq) this.b);
                return;
            case 8:
                Pair pair3 = (Pair) this.c;
                ((cdg) this.a).a.i.d(((Integer) pair3.first).intValue(), (cnm) pair3.second, (Exception) this.b);
                return;
            case 9:
                Pair pair4 = (Pair) this.c;
                ((cdg) this.a).a.i.gd(((Integer) pair4.first).intValue(), (cnm) pair4.second, (cni) this.b);
                return;
            case 10:
                int i2 = bwp.a;
                ((boy) this.b).a.x((bse) this.c);
                return;
            case 11:
                Object obj5 = this.b;
                ?? r4 = this.a;
                aae aaeVar = (aae) this.c;
                r4.d(aaeVar.a, (cnm) aaeVar.b, (Exception) obj5);
                return;
            case 12:
                Object obj6 = this.b;
                ?? r5 = this.a;
                aae aaeVar2 = (aae) this.c;
                r5.gn(aaeVar2.a, (cnm) aaeVar2.b, (auq) obj6);
                return;
            case 13:
                bse bseVar = ((ctg) this.a).a;
                bseVar.getClass();
                this.b.a(new cub((Throwable) this.c, bseVar));
                return;
            case 14:
                int i3 = bwp.a;
                ((pj) this.b).b.s((bse) this.c, (caz) this.a);
                return;
            case 15:
                dky dkyVar = (dky) this.a;
                nh nhVar = dkyVar.mList.m;
                if (!(nhVar instanceof dlb)) {
                    if (nhVar != null) {
                        throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
                    }
                    return;
                }
                Object obj7 = this.c;
                int iZ = obj7 != null ? ((dlb) nhVar).z((Preference) obj7) : ((dlb) nhVar).A((String) this.b);
                if (iZ != -1) {
                    dkyVar.mList.ab(iZ);
                    return;
                } else {
                    nhVar.x(new dkx(nhVar, dkyVar.mList, (Preference) obj7, (String) this.b));
                    return;
                }
            case 16:
                try {
                    ?? r6 = this.b;
                    awqx.l(((awud) r6).b.minusKey(awor.j), new adqx((dmq) this.c, (awuc) r6, (awqk) this.a, (awoq) null, 1));
                    return;
                } catch (Throwable th) {
                    this.b.f(th);
                    return;
                }
            case 17:
                dyj.a((AtomicBoolean) this.a, (aqi) this.c, this.b);
                return;
            case 18:
                Object obj8 = this.c;
                Object obj9 = this.a;
                Object obj10 = this.b;
                if (!(obj8 instanceof ebu)) {
                    if (obj8 instanceof ebt) {
                        ((eby) obj9).f(new dzb());
                        ((awri) obj10).a = false;
                        return;
                    } else if (obj8 instanceof ebv) {
                        ((awri) obj10).a = ((eby) obj9).c(((ebv) obj8).a);
                        return;
                    } else {
                        if (!(obj8 instanceof ebw)) {
                            throw new awmj();
                        }
                        if (((ebw) obj8).a) {
                            zC = ((eby) obj9).c(-256);
                        } else {
                            ((eby) obj9).f(new dzb());
                        }
                        ((awri) obj10).a = zC;
                        return;
                    }
                }
                bbl bblVar = ((ebu) obj8).a;
                eby ebyVar = (eby) obj9;
                eet eetVar = ebyVar.f;
                String str = ebyVar.c;
                WorkDatabase workDatabase = ebyVar.e;
                dzr dzrVarB = eetVar.b(str);
                workDatabase.B().a(str);
                if (dzrVarB == null) {
                    z = false;
                } else if (dzrVarB == dzr.b) {
                    if (bblVar instanceof dzd) {
                        String str2 = eca.a;
                        dzf.b();
                        if (ebyVar.a.e()) {
                            ebyVar.e();
                        } else {
                            eetVar.A(dzr.c, str);
                            dyp dypVar = ((dzd) bblVar).a;
                            dypVar.getClass();
                            eetVar.q(str, dypVar);
                            edw edwVar = ebyVar.g;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            for (String str3 : edwVar.a(str)) {
                                if (eetVar.b(str3) == dzr.e && edwVar.b(str3)) {
                                    dzf.b();
                                    eetVar.A(dzr.a, str3);
                                    eetVar.p(str3, jCurrentTimeMillis);
                                    ebyVar.i.add(str3);
                                }
                            }
                        }
                    } else if (bblVar instanceof dzc) {
                        String str4 = eca.a;
                        dzf.b();
                        ebyVar.d(-256);
                    } else {
                        String str5 = eca.a;
                        dzf.b();
                        if (ebyVar.a.e()) {
                            ebyVar.e();
                        } else {
                            ebyVar.g(bblVar);
                        }
                    }
                    z = false;
                } else if (dzrVarB.a()) {
                    z = false;
                } else {
                    ebyVar.d(-512);
                }
                ((awri) obj10).a = z;
                return;
            case 19:
                fax faxVarA = fax.a();
                ffs.g();
                faxVarA.c.set(true);
                fcw fcwVar = ((fcv) this.b).b;
                fcwVar.b = true;
                ((View) this.c).getViewTreeObserver().removeOnDrawListener(this.a);
                fcwVar.a.clear();
                return;
            default:
                Bundle bundle = (Bundle) this.a;
                int iA = gfn.a(bundle);
                if (iA <= 500000) {
                    if (iA > 50000) {
                        agrx agrxVar = agso.a;
                        return;
                    }
                    return;
                }
                Object obj11 = this.b;
                agrc agrcVar = (agrc) ((agrc) gfn.a.b().i(agso.a, "TransactionTooLargeHdlr")).k("com/google/android/apps/youtube/music/activities/TransactionTooLargeHandler$1", "run", 69, "TransactionTooLargeHandler.java");
                Object obj12 = this.c;
                agrcVar.y("TransactionTooLargeHandler: activity bundle too large, clearing. Size (bytes): %d Activity: %s", iA, obj12);
                String str6 = "TransactionTooLargeHandler: activity bundle too large, clearing. Size (bytes): " + iA + " Activity: " + String.valueOf(obj12);
                String string = Integer.toString(Thread.currentThread().getStackTrace()[1].getLineNumber());
                gdw gdwVar = ((gfn) obj11).b;
                long epochMilli = gdwVar.a.f().toEpochMilli();
                Map map = gdwVar.c;
                if (map.containsKey(string)) {
                    yxq yxqVar = (yxq) map.get(string);
                    if (epochMilli - yxqVar.a > gdwVar.b) {
                        fhz.aq(yxqVar.b, str6);
                        yxqVar.a = epochMilli;
                        yxqVar.b = 0;
                    } else {
                        yxqVar.b++;
                    }
                } else {
                    map.put(string, new yxq(epochMilli));
                    fhz.aq(0, str6);
                }
                bundle.clear();
                return;
        }
    }

    public bf(awuc awucVar, dmq dmqVar, awqk awqkVar, int i) {
        this.$cid = i;
        this.b = awucVar;
        this.c = dmqVar;
        this.a = awqkVar;
    }

    public bf(dky dkyVar, Preference preference, String str, int i) {
        this.$cid = i;
        this.a = dkyVar;
        this.c = preference;
        this.b = str;
    }

    public bf(fcv fcvVar, View view, ViewTreeObserver.OnDrawListener onDrawListener, int i) {
        this.$cid = i;
        this.c = view;
        this.a = onDrawListener;
        this.b = fcvVar;
    }

    public bf(gfn gfnVar, Bundle bundle, Activity activity, int i) {
        this.$cid = i;
        this.a = bundle;
        this.c = activity;
        this.b = gfnVar;
    }

    public /* synthetic */ bf(Object obj, bse bseVar, caz cazVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = bseVar;
        this.a = cazVar;
    }

    public /* synthetic */ bf(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ bf(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ bf(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ bf(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
