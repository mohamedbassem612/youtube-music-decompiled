package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import io.grpc.Status;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aasv implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aasv(aasw aaswVar, aamw aamwVar, aogv aogvVar, aamg aamgVar, int i) {
        this.$cid = i;
        this.a = aaswVar;
        this.b = aamwVar;
        this.c = aogvVar;
        this.d = aamgVar;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x040c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0133  */
    /* JADX WARN: Code duplicated, block: B:43:0x015d A[LOOP:2: B:42:0x015b->B:43:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x019c  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, wjf] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r3v21, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, jyq] */
    /* JADX WARN: Type inference failed for: r3v33, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [avjv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        aamo aamoVarAj;
        Object obj;
        Object objB;
        Map map;
        int i;
        abun abunVarF;
        boolean z;
        agke agkeVarC;
        int i2;
        int i3;
        int i4;
        abun abunVarF2;
        Integer num = null;
        Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                aarz aarzVar = ((aasw) this.a).a;
                aatc aatcVar = (aatc) aarzVar;
                boolean z2 = aatcVar.l;
                Object obj2 = this.b;
                if (z2) {
                    aamw aamwVar = (aamw) obj2;
                    if (aamwVar.d()) {
                        aatcVar.c.remove(aamwVar.a);
                    } else {
                        aatcVar.c.put(((aamw) obj2).a, obj2);
                    }
                } else {
                    aatcVar.c.put(((aamw) obj2).a, obj2);
                }
                aatcVar.k(new gyr(obj2, this.c, this.d, 18, (char[]) null));
                aamw aamwVar2 = (aamw) obj2;
                if (aarq.l(aamwVar2)) {
                    aqpc aqpcVar = aamwVar2.b;
                    if (aqpcVar == aqpc.TRANSFER_STATE_COMPLETE) {
                        if (aamwVar2.a.equals(aatcVar.b)) {
                            aatcVar.b = null;
                        }
                    } else if (aqpcVar == aqpc.TRANSFER_STATE_TRANSFERRING) {
                        aatcVar.b = aamwVar2.a;
                    }
                }
                aatcVar.p.execute(new aadw(aarzVar, obj2, 16, (byte[]) null));
                return;
            case 1:
                aady aadyVar = ((aadx) this.d).a;
                aamw aamwVar3 = (aamw) this.a;
                String strE = aarq.e(aamwVar3.f);
                aaew aaewVar = (aaew) aadyVar.h.io();
                aaewVar.X(strE, aamwVar3);
                Object obj3 = this.b;
                aaewVar.S(strE, (aamg) obj3);
                aqpc aqpcVar2 = aqpc.TRANSFER_STATE_COMPLETE;
                aqpc aqpcVar3 = aamwVar3.b;
                if (aqpcVar3 != aqpcVar2) {
                    if (aqpcVar3 == aqpc.TRANSFER_STATE_TRANSFERRING) {
                        ((aanl) aadyVar.e.io()).o(strE);
                    }
                    aadyVar.n(strE, (aogv) this.c);
                } else if (obj3 == aamg.COMPLETE && (aamoVarAj = aaewVar.aj(strE)) != null) {
                    aaewVar.G(aamoVarAj);
                    aamt aamtVarB = aadyVar.b(strE, true);
                    if (aamtVarB != null) {
                        aadyVar.n.y(new aahz(aamtVarB));
                    }
                }
                aaqx aaqxVar = (aaqx) aadyVar.j.io();
                if (aaqxVar.c().contains(strE)) {
                    aaqz aaqzVarB = aaqxVar.b();
                    if (aaqzVarB.d(aamwVar3)) {
                        aadyVar.o(aaqzVarB.a());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((abdl) this.b).a.x(this.d, (atqd) this.c, (amdd) this.a);
                return;
            case 3:
                ((abdl) this.d).a.y(this.a, (aigj) this.b, (amdd) this.c);
                return;
            case 4:
                ((abdl) this.b).a.q(this.d, (atqe) this.c, (amdd) this.a);
                return;
            case 5:
                ((abdl) this.b).a.o((ameb) this.c, this.d, (amdd) this.a);
                return;
            case 6:
                Object obj4 = this.b;
                LruCache lruCache = ((abom) obj4).b;
                ?? r3 = this.a;
                ?? r4 = this.d;
                Object obj5 = this.c;
                synchronized (lruCache) {
                    if (((abom) obj4).c((Pair) lruCache.get(obj5))) {
                        return;
                    }
                    ((abom) obj4).d.c(new aaxp());
                    if (r4 != 0) {
                        r4.f(tau.PLAYER_EARLY_FETCH_ATTEMPTED);
                    }
                    lruCache.put(obj5, Pair.create(r3.io(), Long.valueOf(((abom) obj4).c.b() + abom.a)));
                    return;
                }
            case 7:
                Object obj6 = this.b;
                sxs sxsVar = new sxs((Activity) this.d, ((absa) obj6).f);
                String strValueOf = String.valueOf(Uri.encode((String) this.a));
                Object obj7 = this.c;
                try {
                    Activity activity = (Activity) ((absa) obj6).a.get();
                    if (activity != null) {
                        kjc kjcVar = new kjc((Context) activity, (byte[]) null);
                        Account account = new Account((String) obj7, "com.google");
                        Bundle bundle = new Bundle();
                        aupw aupwVar = aupw.a;
                        if (aupwVar.io().d()) {
                            kjc.k(account);
                        }
                        String packageName = activity.getPackageName();
                        ?? r5 = kjcVar.a;
                        boolean zC = kro.C(packageName, r5, activity, klt.a);
                        String strConcat = "weblogin:continue=".concat(strValueOf);
                        if (zC) {
                            try {
                                String str = account.name;
                                String str2 = jxs.a;
                                String strA = jxz.a(activity, str);
                                if (TextUtils.isEmpty(strA)) {
                                    throw new IOException("Could not fetch gaia id for account.");
                                }
                                objB = ((jyo) mda.n(r5.c(aupwVar.io().h() ? kro.A(strA, strConcat, bundle).a() : kro.B(account, strConcat, r5, bundle).a()))).a;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new IOException();
                            } catch (ExecutionException e) {
                                kro.D(e);
                                String str3 = jxs.a;
                                objB = jxz.b(activity, account, strConcat, bundle);
                            }
                        } else {
                            String str4 = jxs.a;
                            objB = jxz.b(activity, account, strConcat, bundle);
                        }
                    } else {
                        objB = null;
                    }
                    obj = null;
                } catch (Exception e2) {
                    obj = null;
                    sxsVar.iT(null, e2);
                    objB = null;
                }
                if (objB == null) {
                    sxsVar.iT(obj, new Exception());
                    return;
                } else {
                    sxsVar.b(obj, objB);
                    return;
                }
            case 8:
                ((abty) this.d).e((agke) this.c, (abuk) this.b, (abul) this.a);
                return;
            case 9:
                ?? r1 = this.c;
                Object obj8 = this.a;
                abvs abvsVar = (abvs) obj8;
                boolean zEquals = Objects.equals(abvsVar.i, r1);
                abun abunVarF3 = aasc.f(abvsVar.j, abvsVar.i);
                Object obj9 = this.b;
                Map map2 = abvsVar.g;
                Collection.EL.removeIf(map2.entrySet(), new iab(obj8, obj9, 9, objArr == true ? 1 : 0));
                agjz agjzVar = new agjz(4);
                for (int i5 = 1; i5 < r1.size(); i5++) {
                    abul abulVarE = aasc.e((abul) obj9, r1, abvsVar.m.c, i5);
                    if (abulVarE == null || (abunVarF2 = aasc.f(abulVarE, r1)) == null || !map2.containsKey(abunVarF2.e())) {
                        abvsVar.k = ((agpi) agjzVar.g()).d;
                        agke agkeVar = (agke) r1;
                        abvsVar.i = agkeVar;
                        map = abvsVar.h;
                        map.clear();
                        i = 0;
                        while (i < abvsVar.i.size()) {
                            map.put(((abun) abvsVar.i.get(i)).e(), new abul(i, num));
                            agkeVarC = ((abun) abvsVar.i.get(i)).c();
                            i2 = ((agpi) agkeVarC).d;
                            i3 = 0;
                            i4 = 0;
                            while (i3 < i2) {
                                map.put(((abun) agkeVarC.get(i3)).e(), new abul(i, Integer.valueOf(i4)));
                                i3++;
                                i4++;
                            }
                            i++;
                            num = null;
                        }
                        abvsVar.m = (abuk) this.d;
                        abul abulVar = (abul) obj9;
                        abvsVar.j = abulVar;
                        abunVarF = aasc.f(abulVar, r1);
                        if (abunVarF == null && Objects.equals(abunVarF.d(), abvz.class)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((abunVarF3 != null || !Objects.equals(abunVarF3, abunVarF)) && !z) {
                            abvsVar.bo(true);
                        }
                        if (!zEquals && abvsVar.l) {
                            if (abvsVar.f.aS()) {
                                Iterable$EL.forEach(abvsVar.c, new aavj(2));
                            } else {
                                abvsVar.e.execute(afwl.i(new abbj(obj8, 20)));
                            }
                        }
                        abvsVar.d.h(agkeVar, abvsVar.m, abulVar);
                        return;
                    }
                    agjzVar.h(abunVarF2);
                }
                abvsVar.k = ((agpi) agjzVar.g()).d;
                agke agkeVar2 = (agke) r1;
                abvsVar.i = agkeVar2;
                map = abvsVar.h;
                map.clear();
                i = 0;
                while (i < abvsVar.i.size()) {
                    map.put(((abun) abvsVar.i.get(i)).e(), new abul(i, num));
                    agkeVarC = ((abun) abvsVar.i.get(i)).c();
                    i2 = ((agpi) agkeVarC).d;
                    i3 = 0;
                    i4 = 0;
                    while (i3 < i2) {
                        map.put(((abun) agkeVarC.get(i3)).e(), new abul(i, Integer.valueOf(i4)));
                        i3++;
                        i4++;
                    }
                    i++;
                    num = null;
                }
                abvsVar.m = (abuk) this.d;
                abul abulVar2 = (abul) obj9;
                abvsVar.j = abulVar2;
                abunVarF = aasc.f(abulVar2, r1);
                if (abunVarF == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (abunVarF3 != null) {
                    abvsVar.bo(true);
                } else {
                    abvsVar.bo(true);
                }
                if (!zEquals) {
                    if (abvsVar.f.aS()) {
                        Iterable$EL.forEach(abvsVar.c, new aavj(2));
                    } else {
                        abvsVar.e.execute(afwl.i(new abbj(obj8, 20)));
                    }
                }
                abvsVar.d.h(agkeVar2, abvsVar.m, abulVar2);
                return;
            case 10:
                ((abwn) this.a).e.c(this.d, ((absh) this.b).b, this.c);
                return;
            case 11:
                ((acvx) this.b).c((ViewGroup) this.d, (akrn) this.a, (String) this.c);
                return;
            case 12:
                Object obj10 = this.b;
                fjw fjwVar = (fjw) obj10;
                if (fjwVar.w != this.d || ((aebp) ((abgn) this.c).a).h.containsKey(obj10)) {
                    return;
                }
                Object obj11 = this.a;
                if (obj11 != null) {
                    ((fqh) obj11).k();
                }
                fjwVar.H();
                fjwVar.O();
                fjwVar.K(null, true);
                return;
            case 13:
                ((aejo) this.d).h((FileDescriptor) this.b, ((Long) this.a).longValue(), (byte[]) this.c);
                return;
            case 14:
                ((avdb) this.a).c((Status) this.b, (avdv) this.c, (avbe) this.d);
                return;
            case 15:
                ((avet) this.c).a.a((Status) this.b, (avdv) this.a, (avbe) this.d);
                return;
            case 16:
                avjh avjhVar = (avjh) this.c;
                avjhVar.A = true;
                avjhVar.w.a((Status) this.b, (avdv) this.a, (avbe) this.d);
                return;
            default:
                Object obj12 = this.a;
                synchronized (obj12) {
                    if (((avju) this.d).b != 0) {
                        return;
                    }
                    IdentityHashMap identityHashMap = ((avjw) obj12).a;
                    ?? r6 = this.b;
                    identityHashMap.remove(r6);
                    if (identityHashMap.isEmpty()) {
                        ((avjw) obj12).b.shutdown();
                        ((avjw) obj12).b = null;
                    }
                    r6.b(this.c);
                    return;
                }
        }
    }

    public /* synthetic */ aasv(abdl abdlVar, xgz xgzVar, aihn aihnVar, amdd amddVar, int i) {
        this.$cid = i;
        this.b = abdlVar;
        this.d = xgzVar;
        this.c = aihnVar;
        this.a = amddVar;
    }

    public /* synthetic */ aasv(abgn abgnVar, fjw fjwVar, ComponentTree componentTree, fqh fqhVar, int i) {
        this.$cid = i;
        this.c = abgnVar;
        this.b = fjwVar;
        this.d = componentTree;
        this.a = fqhVar;
    }

    public /* synthetic */ aasv(absa absaVar, String str, String str2, Activity activity, int i) {
        this.$cid = i;
        this.b = absaVar;
        this.a = str;
        this.c = str2;
        this.d = activity;
    }

    public /* synthetic */ aasv(abty abtyVar, agke agkeVar, abuk abukVar, abul abulVar, int i) {
        this.$cid = i;
        this.d = abtyVar;
        this.c = agkeVar;
        this.b = abukVar;
        this.a = abulVar;
    }

    public /* synthetic */ aasv(abvs abvsVar, agke agkeVar, abul abulVar, abuk abukVar, int i) {
        this.$cid = i;
        this.a = abvsVar;
        this.c = agkeVar;
        this.b = abulVar;
        this.d = abukVar;
    }

    public /* synthetic */ aasv(abwn abwnVar, wjf wjfVar, absh abshVar, acey aceyVar, int i) {
        this.$cid = i;
        this.a = abwnVar;
        this.d = wjfVar;
        this.b = abshVar;
        this.c = aceyVar;
    }

    public /* synthetic */ aasv(acvx acvxVar, ViewGroup viewGroup, akrn akrnVar, String str, int i) {
        this.$cid = i;
        this.b = acvxVar;
        this.d = viewGroup;
        this.a = akrnVar;
        this.c = str;
    }

    public /* synthetic */ aasv(aejo aejoVar, FileDescriptor fileDescriptor, Long l, byte[] bArr, int i) {
        this.$cid = i;
        this.d = aejoVar;
        this.b = fileDescriptor;
        this.a = l;
        this.c = bArr;
    }

    public aasv(avdb avdbVar, Status status, avdv avdvVar, avbe avbeVar, int i) {
        this.$cid = i;
        this.b = status;
        this.c = avdvVar;
        this.d = avbeVar;
        this.a = avdbVar;
    }

    public aasv(avjw avjwVar, avju avjuVar, avjv avjvVar, Object obj, int i) {
        this.$cid = i;
        this.d = avjuVar;
        this.b = avjvVar;
        this.c = obj;
        this.a = avjwVar;
    }

    public aasv(Object obj, Status status, avdv avdvVar, avbe avbeVar, int i) {
        this.$cid = i;
        this.b = status;
        this.a = avdvVar;
        this.d = avbeVar;
        this.c = obj;
    }

    public /* synthetic */ aasv(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.d = obj;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ aasv(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = obj4;
    }
}
