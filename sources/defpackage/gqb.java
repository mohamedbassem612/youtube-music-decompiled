package defpackage;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gqb implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gqb(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.util.concurrent.Executor] */
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
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        int i = 14;
        int i2 = 6;
        int i3 = 15;
        int i4 = 13;
        int i5 = 4;
        int i6 = 3;
        int i7 = 8;
        int i8 = 2;
        switch (this.$cid) {
            case 0:
                return ahng.m((Throwable) obj);
            case 1:
                return ((gmy) this.a).e.g((woo) obj, ((heh) this.b).c, Optional.empty(), new gqd(0));
            case 2:
                iqk iqkVar = (iqk) obj;
                aunn aunnVar = iqkVar.a;
                ListenableFuture listenableFutureI = ((ayq) aunnVar.io()).i();
                iqj iqjVar = new iqj(i8);
                Executor executor = iqkVar.b;
                ListenableFuture listenableFutureAr = ahno.ar(listenableFutureI, iqjVar, executor);
                ListenableFuture listenableFutureAr2 = ahno.ar(((ayq) aunnVar.io()).i(), new iam(19), executor);
                return ahno.av(listenableFutureAr, listenableFutureAr2).k(new egz(listenableFutureAr, listenableFutureAr2, this.a, 4, (char[]) null), ((hcw) this.b).b);
            case 3:
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                Object obj2 = this.a;
                if (zIsPresent) {
                    agrx agrxVar = agso.a;
                    ((wkf) obj2).Y();
                    return ahng.n((amzv) optional.get());
                }
                Object obj3 = this.b;
                agrx agrxVar2 = agso.a;
                ((wkf) obj2).Y();
                kwq kwqVar = (kwq) obj3;
                hev hevVar = (hev) obj2;
                return ahno.ar(((wqm) kwqVar.b).m(hevVar), new gqa(kwqVar, hevVar, i5), MoreExecutors.directExecutor());
            case 4:
                hin hinVar = (hin) this.a;
                return !hhs.a(hinVar.a, (zne) this.b, (hlp) obj) ? ahng.n(Boolean.FALSE) : ((iup) hinVar.b.io()).A();
            case 5:
                hng hngVar = (hng) this.a;
                aajv aajvVar = hngVar.f;
                ?? r0 = this.b;
                aajvVar.g(4, r0);
                tc tcVar = new tc(hngVar.k.y());
                tcVar.b(r0);
                return ((ug) obj).c(tcVar.a());
            case 6:
                wer werVarE = ((how) this.a).j.e();
                werVarE.h((Iterable) Collection.EL.stream((List) ahng.v(this.b)).flatMap(new hnv(i4)).collect(Collectors.toCollection(new hcd(10))));
                return tzk.g(werVarE.b());
            case 7:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return ahng.n(agpi.a);
                }
                Object obj4 = this.b;
                annv annvVar = (annv) optional2.get();
                afx afxVar = new afx(0);
                hpu hpuVar = (hpu) obj4;
                if (hpuVar.b) {
                    afxVar.add(ahng.n(agke.n(annvVar.h())));
                }
                if (hpuVar.a) {
                    afxVar.add(ahng.n(agke.n(annvVar.f())));
                }
                if (hpuVar.c) {
                    afxVar.add(ahng.n(agke.n(annvVar.k())));
                }
                Object obj5 = this.a;
                ArrayList arrayList = new ArrayList();
                boolean z = hpuVar.d;
                if (z || hpuVar.e) {
                    afxVar.addAll((java.util.Collection) Collection.EL.stream(annvVar.g()).map(new hph(obj5, obj4, 0)).collect(aghu.a));
                    if (z) {
                        arrayList.addAll(annvVar.e());
                    }
                }
                if (hpuVar.f) {
                    arrayList.addAll(annvVar.i());
                    arrayList.addAll(annvVar.j());
                }
                Stream stream = Collection.EL.stream(arrayList);
                hpb hpbVar = ((hpk) obj5).d;
                hpbVar.getClass();
                int i9 = 17;
                afxVar.addAll((java.util.Collection) stream.map(new hfw(hpbVar, i9)).collect(aghu.a));
                return ahno.au(afxVar).k(new ub(afxVar, i9), MoreExecutors.directExecutor());
            case 8:
                allr allrVar = (allr) obj;
                allrVar.e.size();
                agrx agrxVar3 = agso.a;
                List list = (List) Collection.EL.stream(allrVar.e).filter(new hod(i3)).map(new hrn(i2)).filter(new hod(18)).map(new hrn(i7)).collect(Collectors.toCollection(new hcd(14)));
                Object obj6 = this.a;
                hsn hsnVar = (hsn) obj6;
                ahno.at(hsnVar.k.m(list, false), new hqd(obj6, this.b, allrVar, 2), hsnVar.r);
                return ahng.n(aanp.a);
            case 9:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj7 = this.a;
                if (!zBooleanValue) {
                    return ((hsn) obj7).e.g() ? ahng.n(hsn.b) : ahng.n(aanp.c);
                }
                hsn hsnVar2 = (hsn) obj7;
                wog wogVarG = hsnVar2.u.g();
                wogVarG.m();
                abxv abxvVar = hsnVar2.t;
                wogVarG.c = abxvVar.a();
                wogVarG.e = 0;
                wogVarG.d = abxvVar.d();
                twf twfVar = hsnVar2.h;
                float fA = twfVar.b() ? 1.0f : twfVar.a();
                Object obj8 = this.b;
                wogVarG.D = fA;
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(15) + calendar.get(16);
                mbc mbcVar = hsnVar2.d;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                wogVarG.E = (int) ((mbcVar.f().toEpochMilli() + ((long) i10)) / 1000);
                ListenableFuture listenableFutureA = hsnVar2.q.a(kro.aq());
                hpk hpkVar = hsnVar2.l;
                hpt hptVarA = hpu.a();
                hptVarA.f(false);
                hptVarA.b(false);
                hptVarA.c(true);
                hptVarA.g(true);
                ListenableFuture listenableFutureE = hpkVar.e(hptVarA.a());
                ListenableFuture listenableFutureD = hsnVar2.d();
                ahud ahudVarAv = ahno.av(listenableFutureA, listenableFutureE, listenableFutureD);
                hni hniVar = new hni(hsnVar2, listenableFutureA, listenableFutureE, listenableFutureD, wogVarG, 4);
                Executor executor2 = hsnVar2.r;
                return afxd.f(ahudVarAv.k(hniVar, executor2)).h(new hqj(obj7, i6), executor2).h(new gqb(obj7, obj8, i7), MoreExecutors.directExecutor());
            case 10:
                Optional optional3 = (Optional) obj;
                if (optional3.isEmpty()) {
                    return ahng.n(agpi.a);
                }
                ?? r3 = this.b;
                Object obj9 = this.a;
                return ahno.ar(((iev) obj9).a((anyx) optional3.get(), 0), new iat(obj9, i), r3);
            case 11:
                hcg hcgVar = (hcg) obj;
                if (hcgVar != null) {
                    agke agkeVar = hcgVar.c;
                    if (!agkeVar.isEmpty()) {
                        Object obj10 = this.b;
                        Object obj11 = this.a;
                        apzf apzfVar = (apzf) obj10;
                        int iA = ige.a(agkeVar, apzfVar);
                        apzg apzgVar = apzfVar.g;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        ige igeVar = (ige) obj11;
                        return igeVar.c.a(igeVar.a, hcgVar, iA, apzgVar);
                    }
                }
                return ahng.n(null);
            case 12:
                hcg hcgVar2 = (hcg) obj;
                if (hcgVar2 != null) {
                    agke agkeVar2 = hcgVar2.c;
                    if (!agkeVar2.isEmpty()) {
                        apzf apzfVar2 = (apzf) this.b;
                        int iA2 = ige.a(agkeVar2, apzfVar2);
                        if (iA2 == -1) {
                            return ahng.n(null);
                        }
                        Object obj12 = this.a;
                        apzg apzgVar2 = apzfVar2.g;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        ige igeVar2 = (ige) obj12;
                        Context context = igeVar2.a;
                        igh ighVar = igeVar2.c;
                        return ahno.ar(ighVar.a(context, hcgVar2, iA2, apzgVar2), new iam(i4), ighVar.a);
                    }
                }
                return ahng.n(null);
            case 13:
                Object obj13 = this.b;
                ilp ilpVar = (ilp) this.a;
                if (ilpVar.l == obj13) {
                    ilpVar.l = null;
                }
                return aher.a;
            case 14:
                itd itdVar = (itd) this.a;
                itdVar.f.ah(6);
                MediaScannerConnection.scanFile(itdVar.b, new String[]{((File) this.b).getAbsolutePath()}, null, new itb());
                return aher.a;
            case 15:
                Object obj14 = this.a;
                Object obj15 = this.b;
                iuf iufVar = (iuf) obj15;
                return ahno.as(iufVar.t((Uri) obj14), new hlk(obj15, (agke) obj, obj14, 9, null), iufVar.d);
            case 16:
                return ahng.t((Iterable) Collection.EL.stream((agke) obj).map(new hph(this.a, this.b, 8)).collect(aghu.a));
            case 17:
                return ((hfn) ((iuf) this.b).g.io()).R(iuf.b((Uri) this.a), (agke) obj);
            case 18:
                return ((hfn) ((iuf) this.b).g.io()).R(iuf.b((Uri) this.a), (agke) obj);
            case 19:
                return Objects.equals((Boolean) obj, Boolean.TRUE) ? ((hfn) ((iuf) this.a).g.io()).ac((agke) this.b) : ahng.n(0);
            default:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(null);
                }
                Object obj16 = this.b;
                Object obj17 = this.a;
                iuf iufVar2 = (iuf) obj17;
                return ahno.as(iufVar2.G(), new iub(obj17, obj16, i6), iufVar2.c);
        }
    }

    public /* synthetic */ gqb(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
