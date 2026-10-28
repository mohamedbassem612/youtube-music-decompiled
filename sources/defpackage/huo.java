package defpackage;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Collection;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class huo implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ huo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Failed to inline method: hmy.T(com.google.common.util.concurrent.ListenableFuture):java.lang.Boolean */
    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v74, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, wbz] */
    /* JADX WARN: Unknown register number '(r13v0 'this' iug A[IMMUTABLE_TYPE, THIS])' in method call: hmy.T(com.google.common.util.concurrent.ListenableFuture):java.lang.Boolean */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 19;
        int i2 = 17;
        int i3 = 10;
        boolean z = false;
        int i4 = 1;
        arfz arfzVar = null;
        avmb avmbVar = null;
        switch (this.$cid) {
            case 0:
                agrf agrfVar = hur.a;
                return (afzx) ((Container) this.a.io()).a(new afyq(7));
            case 1:
                jan janVar = (jan) this.a;
                aaex aaexVarE = ((aanb) janVar.h).b().e();
                aaexVarE.getClass();
                List listJ = aaexVarE.e.j();
                List listAp = aaexVarE.ap();
                agkj agkjVar = (agkj) Collection.EL.stream(aaexVarE.ao()).collect(aghu.a(new hpp(i3), new hfw(aaexVarE, i)));
                agkj agkjVar2 = (agkj) Collection.EL.stream(listAp).collect(aghu.a(new hpp(i2), new hfw(aaexVarE, 20)));
                agkj agkjVar3 = (agkj) Collection.EL.stream(listAp).filter(new hod(i3)).collect(aghu.a(new hpp(i2), new hqs(aaexVarE, i4)));
                jnm jnmVar = (jnm) janVar.a;
                return Optional.of(jnmVar.k(listJ, listAp, agkjVar3, agkjVar, agkjVar2).I(jnmVar.d.e(jnmVar.b.e())));
            case 2:
                return (ailx) ahng.v(this.a);
            case 3:
                jnm jnmVar2 = (jnm) this.a;
                wuq wuqVarA = ((wup) jnmVar2.c).a(null);
                wuqVarA.H = amac.WATCH_NEXT_TYPE_GET_QUEUE;
                wuqVarA.m();
                wuqVarA.M = ((jij) jnmVar2.d).j();
                return ((wuo) jnmVar2.b).g(wuqVarA);
            case 4:
                Object obj = this.a;
                if (obj != null) {
                    aihf aihfVarCreateBuilder = arfz.a.createBuilder();
                    String strH = ((BaseClient) obj).h();
                    aihfVarCreateBuilder.copyOnWrite();
                    arfz arfzVar2 = (arfz) aihfVarCreateBuilder.instance;
                    strH.getClass();
                    arfzVar2.b |= 1;
                    arfzVar2.c = strH;
                    arfzVar = (arfz) aihfVarCreateBuilder.build();
                }
                aihh aihhVar = (aihh) aslf.a.createBuilder();
                aihl aihlVar = argx.b;
                aihf aihfVarCreateBuilder2 = argx.a.createBuilder();
                arfzVar.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                argx argxVar = (argx) aihfVarCreateBuilder2.instance;
                argxVar.d = arfzVar;
                argxVar.c |= 1;
                aihhVar.e(aihlVar, (argx) aihfVarCreateBuilder2.build());
                return (aslf) aihhVar.build();
            case 5:
                Object obj2 = this.a;
                return (afyh) ((Container) ((ikn) obj2).c.io()).b(new afzb(1), new hqs(obj2, i2));
            case 6:
                Object obj3 = this.a;
                ilc ilcVar = (ilc) obj3;
                avlh avlhVar = ilcVar.r;
                if (avlhVar == null) {
                    awrc.b("likeActionEventFlowable");
                    avlhVar = null;
                }
                int i5 = 12;
                avlh avlhVarX = avlhVar.x(new hhw(new hhn(14), i5));
                avmb avmbVar2 = ilcVar.s;
                if (avmbVar2 == null) {
                    awrc.b("uiScheduler");
                } else {
                    avmbVar = avmbVar2;
                }
                return avlhVarX.L(avmbVar).al(new ifo(new hol(obj3, 9), 11), new ifo(new hol(obj3, i3), i5));
            case 7:
                taq.c();
                try {
                    return (alxg) aihn.parseFrom(alxg.a, agyo.e(((inu) this.a).a()), ExtensionRegistryLite.getGeneratedRegistry());
                } catch (FileNotFoundException e) {
                    ((agrc) ((agrc) ((agrc) inu.a.b().i(agso.a, "ZeroPrefixCache")).j(e)).k("com/google/android/apps/youtube/music/search/ZeroPrefixSearchSuggestionsResponseCache", "getSuggestions", 'U', "ZeroPrefixSearchSuggestionsResponseCache.java")).t("Zero-prefix cache does not exist");
                    return null;
                } catch (IOException e2) {
                    ((agrc) ((agrc) ((agrc) inu.a.b().i(agso.a, "ZeroPrefixCache")).j(e2)).k("com/google/android/apps/youtube/music/search/ZeroPrefixSearchSuggestionsResponseCache", "getSuggestions", 'W', "ZeroPrefixSearchSuggestionsResponseCache.java")).t("Error fetching zero-prefix cache file");
                    return null;
                }
            case 8:
                return ((itd) this.a).b();
            case 9:
                agrf agrfVar2 = itq.a;
                return (afzx) ((Container) this.a.io()).a(new afyq(7));
            case 10:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) ahng.v((ListenableFuture) it.next())).booleanValue()) {
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 11:
                List list = (List) ahng.v(this.a);
                if (list.isEmpty()) {
                    return null;
                }
                return (ankr) list.get(0);
            case 12:
                return hmy.T(this.a);
            case 13:
                return hmy.T(this.a);
            case 14:
                return hmy.S(this.a);
            case 15:
                List list2 = (List) ahng.v(this.a);
                if (list2.isEmpty()) {
                    return null;
                }
                return (anyx) list2.get(0);
            case 16:
                return (List) Collection.EL.stream((List) ahng.v(this.a)).filter(new hud(i)).collect(aghu.a);
            case 17:
                List list3 = (List) ahng.v(this.a);
                if (list3.isEmpty()) {
                    return null;
                }
                return (anjx) list3.get(0);
            case 18:
                return (List) Collection.EL.stream((List) ahng.v(this.a)).filter(new hud(18)).collect(aghu.a);
            case 19:
                return hmy.T(this.a);
            default:
                return (ankr) ((List) ahng.v(this.a)).get(0);
        }
    }
}
