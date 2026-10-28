package defpackage;

import android.graphics.Bitmap;
import app.rive.semantics.SemanticState;
import com.google.android.gms.cast.CastDevice;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class row implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ row(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [ahey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [ahey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r2v23, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, java.util.Collection] */
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
        Optional optionalEmpty;
        ListenableFuture listenableFutureAr;
        oib oibVar;
        agev agevVarI;
        final arks arksVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i = 8;
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                afig afigVar = (afig) obj;
                Iterator it = ((ovo) this.b).i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        apzh apzhVar = ((wnq) it.next()).c;
                        if (apzhVar != null && (apzhVar.b & SemanticState.Hidden) != 0) {
                            ajue ajueVar = apzhVar.g;
                            if (ajueVar == null) {
                                ajueVar = ajue.b;
                            }
                            rlt rltVarA = rlt.a(ajueVar);
                            ajue ajueVar2 = apzhVar.g;
                            if (ajueVar2 == null) {
                                ajueVar2 = ajue.b;
                            }
                            int iAV = a.aV(ajueVar2.f);
                            if (iAV == 0) {
                                iAV = 1;
                            }
                            if (iAV == 2) {
                                optionalEmpty = Optional.of(rltVarA);
                            }
                        }
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                }
                if (optionalEmpty.isPresent()) {
                    return ((rpa) this.a).e.a((rlt) optionalEmpty.get());
                }
                ((agrc) ((agrc) ((agrc) rpa.a.b()).j(afigVar)).k("com/google/android/libraries/youtube/account/offline/OfflineAccountSwitcherStoreImpl", "getOrCreateAccountId", (char) 419, "OfflineAccountSwitcherStoreImpl.java")).t("Could not resolve accountId while saving offline account items");
                return ahng.n(Optional.empty());
            case 1:
                return ((axfd) ((rmo) this.b).g.io()).O(this.a, MoreExecutors.directExecutor());
            case 2:
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                Object obj2 = this.a;
                if (!zIsPresent) {
                    ((rpa) obj2).f.i("ERROR");
                    ((agrc) ((agrc) rpa.a.b()).k("com/google/android/libraries/youtube/account/offline/OfflineAccountSwitcherStoreImpl", "saveOfflineAccountsListResponse", 123, "OfflineAccountSwitcherStoreImpl.java")).t("Could not resolve accountId while saving offline account items");
                    return aher.a;
                }
                ovo ovoVar = (ovo) this.b;
                final agke agkeVar = (agke) Collection.EL.stream(ovoVar.i()).map(new ris(15)).collect(aghu.a);
                rpa rpaVar = (rpa) obj2;
                rou rouVarA = rpaVar.a((affd) optional.get());
                alkz alkzVar = (alkz) ovoVar.a;
                if ((alkzVar.b & SemanticState.Modal) != 0) {
                    apji apjiVar = alkzVar.h;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(arkt.a);
                    apjiVar.c(aihlVarCheckIsLite);
                    Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                    arksVar = (arks) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                }
                if (agkeVar.isEmpty()) {
                    listenableFutureAr = aher.a;
                } else {
                    final aijp aijpVarAv = ahng.av(rouVarA.b.f().plusSeconds(2592000L));
                    listenableFutureAr = ahno.ar(rouVarA.d.j(new axp() { // from class: rot
                        @Override // defpackage.axp
                        public final Object a(Object obj3) {
                            int i5 = rou.e;
                            aihf builder = ((rov) obj3).toBuilder();
                            builder.copyOnWrite();
                            ((rov) builder.instance).c = rov.emptyProtobufList();
                            builder.copyOnWrite();
                            rov rovVar = (rov) builder.instance;
                            aiie aiieVar = rovVar.c;
                            if (!aiieVar.c()) {
                                rovVar.c = aihn.mutableCopy(aiieVar);
                            }
                            arks arksVar2 = arksVar;
                            aijp aijpVar = aijpVarAv;
                            aifs.addAll(agkeVar, rovVar.c);
                            builder.copyOnWrite();
                            rov rovVar2 = (rov) builder.instance;
                            aijpVar.getClass();
                            rovVar2.d = aijpVar;
                            rovVar2.b |= 1;
                            if (arksVar2 != null) {
                                builder.copyOnWrite();
                                rov rovVar3 = (rov) builder.instance;
                                rovVar3.e = arksVar2;
                                rovVar3.b |= 2;
                            }
                            return (rov) builder.build();
                        }
                    }), new rmk(2), MoreExecutors.directExecutor());
                }
                rpaVar.f.i("SUCCESS");
                break;
                break;
            case 3:
                return ahno.ar(((tpn) obj).b(this.b), new rwj(this.a, i2), MoreExecutors.directExecutor());
            case 4:
                alps alpsVar = (alps) obj;
                int i5 = alpsVar.b & SemanticState.Focused;
                Object obj3 = this.a;
                if (i5 != 0) {
                    amud amudVar = alpsVar.g;
                    if (amudVar == null) {
                        amudVar = amud.b;
                    }
                    xgj xgjVar = new xgj(amudVar);
                    roq roqVar = ((vcl) obj3).o;
                    new ugo(roqVar, xgjVar).c();
                    new ugo(roqVar, xgjVar).f();
                }
                if ((alpsVar.b & 8) != 0) {
                    vcl vclVar = (vcl) obj3;
                    vxe vxeVar = vclVar.c;
                    ajwo ajwoVar = alpsVar.e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                    IllegalStateException illegalStateException = new IllegalStateException("Received error during YouTube Video to Video.");
                    vclVar.f(illegalStateException, "Received error during YouTube Video to Video.", 0);
                    vclVar.h("aa");
                    return ahng.m(illegalStateException);
                }
                if (alpsVar.d.size() == 0) {
                    vcl vclVar2 = (vcl) obj3;
                    vclVar2.g("[MediaGeneration][Android] Received zero prompt.");
                    vclVar2.h("aa");
                    return ahng.m(new IllegalArgumentException("Received zero prompt."));
                }
                aihf aihfVarCreateBuilder = asdf.a.createBuilder();
                for (akgn akgnVar : alpsVar.d) {
                    int i6 = akgnVar.b;
                    if (i6 == 6) {
                        aihfVarCreateBuilder.cv(i6 == 6 ? (akhn) akgnVar.c : akhn.a);
                    }
                }
                Object obj4 = this.b;
                asdf asdfVar = (asdf) aihfVarCreateBuilder.build();
                ((vcl) obj3).i.put(obj4, asdfVar);
                return ahng.n(asdfVar);
            case 5:
                alps alpsVar2 = (alps) obj;
                int i7 = alpsVar2.b & 8;
                Object obj5 = this.a;
                if (i7 != 0) {
                    vcl vclVar3 = (vcl) obj5;
                    vxe vxeVar2 = vclVar3.c;
                    ajwo ajwoVar2 = alpsVar2.e;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    vxeVar2.a(ajwoVar2);
                    IllegalStateException illegalStateException2 = new IllegalStateException("Received error during suggested audio generation.");
                    vclVar3.f(illegalStateException2, "Received error during suggested audio generation.", 0);
                    return ahng.m(illegalStateException2);
                }
                Object obj6 = this.b;
                aihf aihfVarCreateBuilder2 = asdd.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                asdd asddVar = (asdd) aihfVarCreateBuilder2.instance;
                alpsVar2.getClass();
                asddVar.c = alpsVar2;
                asddVar.b |= 1;
                asdd asddVar2 = (asdd) aihfVarCreateBuilder2.build();
                Map map = ((vcl) obj5).h;
                aljl aljlVar = ((asdc) obj6).b;
                if (aljlVar == null) {
                    aljlVar = aljl.a;
                }
                map.put(aljlVar, asddVar2);
                return ahng.n(asddVar2);
            case 6:
                vfb vfbVar = (vfb) this.a;
                return vfbVar.e((Bitmap) obj, this.b, vfbVar.m());
            case 7:
                vfb vfbVar2 = (vfb) this.a;
                return vfbVar2.e((Bitmap) obj, this.b, vfbVar2.m());
            case 8:
                ayq ayqVar = (ayq) obj;
                ayqVar.getClass();
                return ayqVar.j(new vvg((String) this.b, this.a, i4));
            case 9:
                zpw zpwVar = (zpw) ((vzt) this.b).c.io();
                Object obj7 = this.a;
                agdf agdfVar = agdf.a;
                aihf builder = ((aihn) obj7).toBuilder();
                ohz ohzVar = (ohz) obj7;
                if ((ohzVar.b & SemanticState.Modal) != 0) {
                    oibVar = ohzVar.f;
                    if (oibVar == null) {
                        oibVar = oib.a;
                    }
                } else {
                    oibVar = (oib) ohv.a.e(oib.a);
                }
                builder.copyOnWrite();
                ohz ohzVar2 = (ohz) builder.instance;
                oibVar.getClass();
                ohzVar2.f = oibVar;
                ohzVar2.b |= SemanticState.Modal;
                ohz ohzVar3 = (ohz) builder.build();
                if (ohzVar3 == null) {
                    throw new NullPointerException("Null dataFileGroup");
                }
                ohr ohrVar = new ohr(ohzVar3, agdfVar, agdfVar);
                long jG = ((omj) zpwVar.d).g();
                ListenableFuture listenableFutureC = ((omj) zpwVar.a).c(new gwj(zpwVar, ohrVar, i, objArr2 == true ? 1 : 0), zpwVar.o);
                aihf aihfVarCreateBuilder3 = ahai.a.createBuilder();
                ohz ohzVar4 = ohrVar.a;
                String str = ohzVar4.c;
                aihfVarCreateBuilder3.copyOnWrite();
                ahai ahaiVar = (ahai) aihfVarCreateBuilder3.instance;
                str.getClass();
                ahaiVar.b |= 1;
                ahaiVar.c = str;
                long j = ohzVar4.h;
                aihfVarCreateBuilder3.copyOnWrite();
                ahai ahaiVar2 = (ahai) aihfVarCreateBuilder3.instance;
                ahaiVar2.b |= 64;
                ahaiVar2.i = j;
                String str2 = ohzVar4.i;
                aihfVarCreateBuilder3.copyOnWrite();
                ahai ahaiVar3 = (ahai) aihfVarCreateBuilder3.instance;
                str2.getClass();
                ahaiVar3.b |= SemanticState.Focused;
                ahaiVar3.j = str2;
                aihfVarCreateBuilder3.copyOnWrite();
                ahai ahaiVar4 = (ahai) aihfVarCreateBuilder3.instance;
                ahaiVar4.b |= 32;
                ahaiVar4.h = false;
                aihfVarCreateBuilder3.copyOnWrite();
                ahai ahaiVar5 = (ahai) aihfVarCreateBuilder3.instance;
                ahaiVar5.b |= SemanticState.Hidden;
                ahaiVar5.k = false;
                int i8 = ohzVar4.e;
                aihfVarCreateBuilder3.copyOnWrite();
                ahai ahaiVar6 = (ahai) aihfVarCreateBuilder3.instance;
                ahaiVar6.b |= 2;
                ahaiVar6.d = i8;
                String str3 = ohzVar4.d;
                aihfVarCreateBuilder3.copyOnWrite();
                ahai ahaiVar7 = (ahai) aihfVarCreateBuilder3.instance;
                str3.getClass();
                ahaiVar7.b |= 4;
                ahaiVar7.e = str3;
                int size = ohzVar4.g.size();
                aihfVarCreateBuilder3.copyOnWrite();
                ahai ahaiVar8 = (ahai) aihfVarCreateBuilder3.instance;
                ahaiVar8.b |= 8;
                ahaiVar8.f = size;
                ahai ahaiVar9 = (ahai) aihfVarCreateBuilder3.build();
                listenableFutureC.addListener(afwl.i(new lel(zpwVar, jG, ahaiVar9, listenableFutureC, new qcb(ahaiVar9, objArr == true ? 1 : 0), 3)), MoreExecutors.directExecutor());
                return listenableFutureC;
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    return aher.a;
                }
                ohz ohzVar5 = (ohz) this.a;
                ((zs) ((vzt) this.b).d.io()).B(6, ohzVar5.c);
                return ahng.m(new IOException("Unable to add filegroup: ".concat(String.valueOf(ohzVar5.c))));
            case 11:
                Object obj8 = this.b;
                xxj xxjVar = new xxj(obj8);
                vzt vztVar = (vzt) obj8;
                zpw zpwVar2 = (zpw) vztVar.c.io();
                Object obj9 = this.a;
                agdf agdfVar2 = agdf.a;
                ohz ohzVar6 = (ohz) obj9;
                String str4 = ohzVar6.c;
                if (str4 == null) {
                    throw new NullPointerException("Null groupName");
                }
                if ((ohzVar6.b & SemanticState.Modal) != 0) {
                    oib oibVar2 = ohzVar6.f;
                    if (oibVar2 == null) {
                        oibVar2 = oib.a;
                    }
                    agevVarI = agev.i(oibVar2);
                } else {
                    agevVarI = ohv.a;
                }
                agev agevVar = agevVarI;
                if (agevVar != null) {
                    return afxd.f(ahno.aq(new gwj(zpwVar2, new oih(str4, agdfVar2, agdfVar2, agdfVar2, agdfVar2, agdfVar2, agevVar, agev.i(xxjVar), 2, true), 7, objArr3 == true ? 1 : 0), zpwVar2.o)).g(new vdm(obj8, 9), vztVar.e);
                }
                throw new NullPointerException("Null downloadConditionsOptional");
            case 12:
                return ((abxv) this.a).r((String) this.b);
            case 13:
                Object obj10 = this.b;
                woz wozVar = (woz) obj10;
                syn synVar = wozVar.g;
                Object obj11 = this.a;
                return afxd.f(ahng.m(new Exception("Not implemented"))).h(new qzc(obj10, obj11, (toe) obj, 12, (short[]) null), MoreExecutors.directExecutor());
            case 14:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    ((agrc) ((agrc) xqw.a.b().i(agso.a, "MDX.MediaRouteFilter")).k("com/google/android/libraries/youtube/mdx/mediaroute/MdxMediaRouteFilter", "filterRoutesAsync", 464, "MdxMediaRouteFilter.java")).t("Could not retrieve RouteInfo to CastDevice map.");
                    return ahng.m(new Throwable());
                }
                agkh agkhVar = new agkh(4);
                for (Map.Entry entry : map2.entrySet()) {
                    dii diiVar = (dii) entry.getKey();
                    Optional optional2 = (Optional) entry.getValue();
                    if (optional2 != null && !optional2.isEmpty()) {
                        agkhVar.e(xqw.p(diiVar, (CastDevice) optional2.get()), (CastDevice) optional2.get());
                    }
                }
                ?? r3 = this.b;
                Object obj12 = this.a;
                agkj agkjVarD = agkhVar.d(false);
                xqw xqwVar = (xqw) obj12;
                Set setE = xqwVar.e();
                ArrayList arrayList = new ArrayList((java.util.Collection) r3);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    dii diiVar2 = (dii) it2.next();
                    String str5 = xqwVar.d;
                    if (ahno.aa(str5) || Arrays.asList(str5.split(",")).contains(diiVar2.e)) {
                        Optional optional3 = (Optional) map2.get(diiVar2);
                        Optional optionalEmpty2 = Optional.empty();
                        if (xsa.g(diiVar2)) {
                            optionalEmpty2 = xqwVar.d(diiVar2, agkjVarD);
                        }
                        boolean zQ = xqw.r(diiVar2) ? xqw.q(diiVar2, setE) : false;
                        if (!xqwVar.b.a(diiVar2)) {
                            it2.remove();
                        } else if (optionalEmpty2.isPresent() && !xqwVar.o((CastDevice) optionalEmpty2.get())) {
                            it2.remove();
                        } else if (optional3 != null && optional3.isPresent() && xrx.e((CastDevice) optional3.get()) && !xqwVar.c) {
                            it2.remove();
                        } else if (xqwVar.i(diiVar2) && xqwVar.h(diiVar2)) {
                            it2.remove();
                        } else if (zQ && xqwVar.n(diiVar2)) {
                            it2.remove();
                        }
                    } else {
                        it2.remove();
                    }
                }
                return ahng.n(arrayList);
            case 15:
                return ((yay) this.a).aC((Optional) this.b, (Boolean) obj);
            case 16:
                ydu yduVar = (ydu) this.a;
                yds ydsVar = yduVar.e;
                ydsVar.l();
                int[] iArr = yduVar.c;
                iArr[0] = iArr[0] + 1;
                return ydsVar.c((Optional) this.b, iArr, yduVar.d, 2, Optional.empty());
            case 17:
                return ahcs.e(((qrx) ((elr) this.a).a).a(new xwd(this.b, 18), MoreExecutors.directExecutor()), new xwd((aigj) obj, 19), MoreExecutors.directExecutor());
            case 18:
                aajr aajrVar = (aajr) this.a;
                aajv aajvVar = aajrVar.f;
                ?? r0 = this.b;
                aajvVar.g(4, r0);
                tc tcVar = new tc(aajrVar.k.y());
                tcVar.b(r0);
                return ((ug) obj).c(tcVar.a());
            case 19:
                ug ugVar = (ug) obj;
                azs.h(!ugVar.g, "AppSearchSession has already been closed");
                ListenableFuture listenableFutureB = ugVar.b(new uf(ugVar, this.a, i4));
                ugVar.h();
                ((aajt) this.b).g.g(5, agpi.a);
                return listenableFutureB;
            default:
                ((agrc) ((agrc) ((agrc) aajt.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/offline/features/appsearch/indexing/DefaultOfflineAppSearchManager", "initInternal", (char) 179, "DefaultOfflineAppSearchManager.java")).t("SetSchema request failed");
                Object obj13 = this.a;
                listenableFutureAr = ahcs.f(this.b, new aajs(obj13, i3), ((aajt) obj13).h);
                taf.g(listenableFutureAr, new yqj(obj13, 5));
                break;
        }
        return listenableFutureAr;
    }

    public /* synthetic */ row(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
