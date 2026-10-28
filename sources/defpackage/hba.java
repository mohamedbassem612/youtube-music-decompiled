package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hba implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hba(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v104, types: [hpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v106, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v130, types: [hpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v38, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v40, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        byte[] bArr = null;
        int i = 2;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                kyr kyrVarM = ((hbb) aguu.aw(((hbc) this.a).b, hbb.class, (affd) obj)).M();
                return ahno.ar(((qrx) kyrVarM.b).c(), new cbs(15), kyrVarM.a);
            case 1:
                return ((gld) aguu.aw((Context) ((jan) this.a).b.io(), gld.class, (affd) obj)).f().a();
            case 2:
                kyr kyrVarL = ((hdo) aguu.aw(((hdp) this.a).b, hdo.class, (affd) obj)).L();
                return ahno.ar(((qrx) kyrVarL.a).c(), new hdn(i), kyrVarL.b);
            case 3:
                iqg iqgVar = (iqg) obj;
                return iqgVar != null ? iqgVar.a(((zot) this.a).b) : ahng.n(ailn.UNKNOWN_STATE);
            case 4:
                iqg iqgVar2 = (iqg) obj;
                return iqgVar2 != null ? iqgVar2.a(((zot) this.a).b) : ahng.n(ailn.UNKNOWN_STATE);
            case 5:
                return a.k(this.a, obj);
            case 6:
                return a.k(this.a, obj);
            case 7:
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    return ((hmm) this.a).c.h((weh) optional.get());
                }
                return ahng.n(null);
            case 8:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return ahng.n(new HashMap());
                }
                annv annvVar = (annv) optional2.get();
                agke agkeVar = (agke) Stream.CC.concat(Collection.EL.stream(annvVar.e()), Collection.EL.stream(annvVar.i())).collect(aghu.a);
                if (agkeVar.isEmpty()) {
                    return ahng.n(new HashMap());
                }
                hnl hnlVar = (hnl) this.a;
                return afxd.f(hnlVar.c.b(agkeVar)).g(new hdn(14), hnlVar.d);
            case 9:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i3 = 12;
                Stream streamFilter = Collection.EL.stream((List) obj).filter(new gqk(i3));
                Object obj2 = this.a;
                streamFilter.forEach(new hrr(obj2, arrayList2, arrayList, i2));
                ListenableFuture listenableFutureK = ahng.k(arrayList);
                ListenableFuture listenableFutureK2 = ahng.k(arrayList2);
                return ahng.h(listenableFutureK, listenableFutureK2).a(afwl.j(new uf(listenableFutureK, listenableFutureK2, i3, bArr)), ((hnl) obj2).d);
            case 10:
                Optional optional3 = (Optional) obj;
                if (optional3.isEmpty()) {
                    return ahng.n(new HashMap());
                }
                annv annvVar2 = (annv) optional3.get();
                agke agkeVar2 = (agke) Stream.CC.concat(Collection.EL.stream(annvVar2.g()), Collection.EL.stream(annvVar2.j())).collect(aghu.a);
                if (agkeVar2.isEmpty()) {
                    return ahng.n(new HashMap());
                }
                hnl hnlVar2 = (hnl) this.a;
                return afxd.f(hnlVar2.c.b(agkeVar2)).g(new hdn(11), hnlVar2.d);
            case 11:
                return ((hnp) aguu.aw(((hnq) this.a).e, hnp.class, (affd) obj)).f().c();
            case 12:
                hnz hnzVar = (hnz) this.a;
                return ahno.ar(((hnx) aguu.aw(hnzVar.b, hnx.class, (affd) obj)).f().a(), new hdn(16), hnzVar.c);
            case 13:
                if (!((Boolean) obj).booleanValue()) {
                    return ahng.n(agpi.a);
                }
                Object obj3 = this.a;
                hpt hptVarA = hpu.a();
                hptVarA.f(false);
                hptVarA.b(false);
                hptVarA.c(true);
                hptVarA.g(true);
                return ((hnz) obj3).j.e(hptVarA.a());
            case 14:
                Optional optionalOfNullable = (Optional) obj;
                hlx hlxVar = new hlx(this.a, 4);
                if (true == optionalOfNullable.isPresent()) {
                    annv annvVar3 = (annv) ((weh) optionalOfNullable.get());
                    hoe hoeVar = (hoe) hlxVar.a;
                    optionalOfNullable = Optional.ofNullable(ahno.ar(hoeVar.a.m((List) Stream.CC.concat(Collection.EL.stream(annvVar3.g()), Collection.EL.stream(annvVar3.e())).map(new hnv(3)).collect(aghu.a), false), new hdn(18), hoeVar.b));
                }
                return (ListenableFuture) optionalOfNullable.orElse(ahng.n(agpi.a));
            case 15:
                return ((hoj) this.a).c((List) obj);
            case 16:
                return this.a.b((agke) obj);
            case 17:
                return a.k(this.a, obj);
            case 18:
                Optional optional4 = (Optional) obj;
                if (optional4.isEmpty()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj4 = this.a;
                weh wehVar = (weh) optional4.get();
                if (wehVar instanceof anjx) {
                    return ((hpb) obj4).c.j(((anjx) wehVar).e());
                }
                if (wehVar instanceof anuk) {
                    return ((hpb) obj4).c.j(((anuk) wehVar).j());
                }
                throw new IllegalArgumentException(String.format("List Entity key is not associated with a %s or %s", anjx.class.getSimpleName(), anuk.class.getSimpleName()));
            case 19:
                Optional optional5 = (Optional) obj;
                if (optional5.isEmpty()) {
                    return ahng.n(agpi.a);
                }
                ArrayList arrayList3 = new ArrayList();
                weh wehVar2 = (weh) optional5.get();
                if (wehVar2 instanceof anjx) {
                    arrayList3.addAll(((anjx) wehVar2).e());
                } else {
                    if (!(wehVar2 instanceof anuk)) {
                        throw new IllegalArgumentException(String.format("List Entity key is not associated with a %s or %s", anjx.class.getSimpleName(), anuk.class.getSimpleName()));
                    }
                    anuk anukVar = (anuk) wehVar2;
                    List listJ = anukVar.j();
                    if (hpb.s(anukVar)) {
                        return ahno.ar(((hpb) this.a).f(listJ), new hoh(7), MoreExecutors.directExecutor());
                    }
                    arrayList3.addAll(listJ);
                }
                return ahng.n(agke.n(arrayList3));
            default:
                return this.a.b((agke) obj);
        }
    }
}
