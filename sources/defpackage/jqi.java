package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jqi implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jqi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, nxa] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, nxa] */
    /* JADX WARN: Type inference failed for: r14v29, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v30, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = 3;
        switch (this.$cid) {
            case 0:
                jqo jqoVar = (jqo) this.a;
                if (!((vxz) jqoVar.j.io()).l(95, 45762151L, false)) {
                    jqoVar.f.jX(jqoVar.k.a);
                    jqoVar.m.jX(jqoVar.l.a);
                } else {
                    jqv jqvVar = jqoVar.f;
                    jqvVar.j(0, jqvVar.a());
                    jqr jqrVar = jqoVar.m;
                    jqrVar.j(0, jqrVar.a());
                }
                break;
            case 1:
                hww hwwVar = (hww) obj;
                jqo jqoVar2 = (jqo) this.a;
                jqoVar2.h(true);
                jqoVar2.g(true);
                jqoVar2.a();
                if (((vxz) jqoVar2.j.io()).l(85, 45746502L, false) && jqoVar2.j()) {
                    jqv jqvVar2 = jqoVar2.f;
                    jqvVar2.jZ(0, jqvVar2.a(), new jqu(hwwVar, jqvVar2.m));
                    break;
                }
                break;
            case 2:
                Optional optional = (Optional) obj;
                Object obj2 = this.a;
                jqr jqrVar2 = (jqr) obj2;
                if (!jqrVar2.n.equals(optional)) {
                    jqrVar2.n = optional;
                    ((nh) obj2).jX(jqrVar2.l);
                }
                break;
            case 3:
                this.a.g();
                break;
            case 4:
                this.a.b();
                break;
            case 5:
                ((mlg) this.a).a = (byte[]) obj;
                break;
            case 6:
                ((EnvironmentDataObserver) this.a).environmentDataDidChange();
                break;
            case 7:
                ci ciVar = ((mrl) this.a).o;
                mrk mrkVar = (mrk) obj;
                if (ciVar != null) {
                    if (mrkVar.b) {
                        adbe adbeVar = new adbe(mrkVar.d, 0);
                        Optional optional2 = (Optional) ciVar.a;
                        optional2.isPresent();
                        ((qtf) ((aerv) optional2.get()).d.io()).b(1L, Boolean.valueOf(adbeVar.a));
                    }
                    if (mrkVar.c) {
                        adbe adbeVar2 = new adbe(mrkVar.d, 1);
                        Optional optional3 = (Optional) ciVar.a;
                        optional3.isPresent();
                        ((qtf) ((aerv) optional3.get()).c.io()).b(1L, Boolean.valueOf(adbeVar2.a));
                    }
                }
                break;
            case 8:
                ((rkt) this.a).i = !((Boolean) obj).booleanValue();
                break;
            case 9:
                this.a.invoke(obj);
                break;
            case 10:
                this.a.invoke(obj);
                break;
            case 11:
                aobj aobjVar = (aobj) obj;
                rsa rsaVar = (rsa) this.a;
                rsaVar.b = aobjVar;
                rrm rrmVarA = rrn.a();
                rrmVarA.b(aobjVar);
                tfq tfqVar = rsaVar.c;
                if (tfqVar.j(0)) {
                    i = 2;
                } else if (!tfqVar.j(1)) {
                    i = 1;
                }
                awku awkuVar = rsaVar.a;
                rrmVarA.a = i;
                awkuVar.kk(rrmVarA.a());
                break;
            case 12:
                rme rmeVar = new rme((aaxa) obj, 8);
                rts rtsVar = (rts) this.a;
                rtsVar.i(rmeVar, taq.ac(rtsVar.D) ? agkz.r(rtsVar.C, rtsVar.f, rtsVar.i) : agkz.q(rtsVar.f, rtsVar.i));
                break;
            case 13:
                ((rts) this.a).K = Optional.of(((aaza) obj).a);
                break;
            case 14:
                aazj aazjVar = (aazj) obj;
                int iOrdinal = aazjVar.a.ordinal();
                Object obj3 = this.a;
                if (iOrdinal == 0) {
                    rts rtsVar2 = (rts) obj3;
                    rtsVar2.H.clear();
                    rtsVar2.K = Optional.empty();
                } else if (iOrdinal == 2) {
                    wjf wjfVar = aazjVar.b;
                    if (wjfVar != null) {
                        rts rtsVar3 = (rts) obj3;
                        rtsVar3.L = Boolean.valueOf(wjfVar.P());
                        rtsVar3.M = Boolean.valueOf(wjfVar.f().aA());
                    }
                    String str = aazjVar.g;
                    if (!TextUtils.isEmpty(str)) {
                        rts rtsVar4 = (rts) obj3;
                        if (!str.equals(rtsVar4.O)) {
                            rtsVar4.O = str;
                        }
                    }
                    acfw acfwVar = aazjVar.f;
                    if (!TextUtils.isEmpty(str)) {
                        if (acfwVar != null) {
                            ((rts) obj3).I.put(str, acfwVar);
                        }
                        if (wjfVar != null) {
                            ((rts) obj3).J.put(str, wjfVar);
                        }
                    }
                }
                rts rtsVar5 = (rts) obj3;
                rtsVar5.i(new rme(aazjVar, 10), agkz.u(rtsVar5.t, rtsVar5.u, rtsVar5.k, rtsVar5.x, rtsVar5.y, rtsVar5.w, rtsVar5.f, rtsVar5.j, rtsVar5.h, rtsVar5.i, rtsVar5.d, rtsVar5.e));
                break;
            case 15:
                hgi hgiVar = new hgi(16);
                rts rtsVar6 = (rts) this.a;
                rtsVar6.i(hgiVar, new agqj(rtsVar6.w));
                break;
            case 16:
                rts rtsVar7 = (rts) this.a;
                rtsVar7.G = null;
                acip acipVar = ((aazq) obj).b;
                ((run) rtsVar7.h).b = Optional.ofNullable((xir) acipVar.d().a());
                rtsVar7.s.a = (ahhp) acipVar.e().a();
                break;
            case 17:
                Pair pair = (Pair) obj;
                hrr hrrVar = new hrr((Object) ((aazm) pair.second).b, (Object) ((acip) pair.first).au(), (Object) ((acip) pair.first).f(), 7, (byte[]) null);
                rts rtsVar8 = (rts) this.a;
                rtsVar8.i(hrrVar, new agqj(rtsVar8.z));
                break;
            case 18:
                aazk aazkVar = (aazk) obj;
                final String str2 = aazkVar.i;
                final long j = aazkVar.a;
                final long j2 = aazkVar.e;
                final long j3 = aazkVar.d;
                final boolean z = aazkVar.h;
                Consumer consumer = new Consumer() { // from class: rto
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void r(Object obj4) {
                        ((rsq) obj4).m(str2, j, j2, j3, z);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                rts rtsVar9 = (rts) this.a;
                rsq rsqVar = rtsVar9.y;
                rsq rsqVar2 = rtsVar9.x;
                rtsVar9.i(consumer, agkz.u(rtsVar9.b, rtsVar9.A, rtsVar9.a, rtsVar9.g, rsqVar2, rsqVar, new rsq[0]));
                break;
            case 19:
                ((rts) this.a).g((aazp) obj);
                break;
            default:
                aaxo aaxoVar = (aaxo) obj;
                final abnr abnrVar = aaxoVar.b;
                final abnr abnrVar2 = aaxoVar.a;
                final int i2 = aaxoVar.c;
                final int i3 = aaxoVar.d;
                boolean z2 = aaxoVar.e;
                Consumer consumer2 = new Consumer() { // from class: rtp
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void r(Object obj4) {
                        ((rsq) obj4).au(abnrVar, abnrVar2, i2, i3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer3) {
                        return Consumer$CC.$default$andThen(this, consumer3);
                    }
                };
                rts rtsVar10 = (rts) this.a;
                rsq[] rsqVarArr = {rtsVar10.q, rtsVar10.w};
                rsq rsqVar3 = rtsVar10.p;
                rtsVar10.i(consumer2, agkz.u(rtsVar10.a, rtsVar10.g, rtsVar10.m, rtsVar10.n, rtsVar10.o, rsqVar3, rsqVarArr));
                break;
        }
    }
}
