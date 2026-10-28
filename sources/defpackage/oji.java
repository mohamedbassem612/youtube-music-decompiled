package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oji implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oji(ilp ilpVar, abjw abjwVar, boolean z, List list, zwa zwaVar, int i) {
        this.$cid = i;
        this.d = ilpVar;
        this.b = abjwVar;
        this.a = z;
        this.e = list;
        this.c = zwaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        boolean z;
        if (this.$cid != 0) {
            Object obj2 = this.d;
            ilp ilpVar = (ilp) obj2;
            icj icjVar = ilpVar.c;
            aldm aldmVar = (aldm) obj;
            if (!this.b.equals(icjVar.N())) {
                ((agrc) ((agrc) ilp.a.c()).k("com/google/android/apps/youtube/music/radiostar/RadioStarCommentaryControllerImpl", "initiateCommentaryRequest", 209, "RadioStarCommentaryControllerImpl.java")).t("Discarding commentary response due to changed queue list.");
                return aher.a;
            }
            if (this.a) {
                if (!Collection.EL.stream(this.e).findFirst().equals(Collection.EL.stream(abjg.c(icjVar, 1)).findFirst())) {
                    ((agrc) ((agrc) ilp.a.c()).k("com/google/android/apps/youtube/music/radiostar/RadioStarCommentaryControllerImpl", "initiateCommentaryRequest", 223, "RadioStarCommentaryControllerImpl.java")).t("Discarding commentary response due to changed next autonav video at end of queue.");
                    return aher.a;
                }
            }
            afxd afxdVarA = ilpVar.a(this.c);
            idw idwVar = new idw(obj2, aldmVar, 7);
            Executor executor = ilpVar.j;
            return afxdVarA.g(idwVar, executor).b(Throwable.class, new idw(obj2, aldmVar, 8), executor);
        }
        omi omiVar = (omi) obj;
        oip oipVar = omiVar.a;
        if (oipVar != null) {
            return ahng.n(new okf(oipVar));
        }
        Object obj3 = this.d;
        boolean z2 = this.a;
        oip oipVar2 = omiVar.b;
        if (oipVar2 == null) {
            Object obj4 = this.c;
            acb acbVarA = oig.a();
            acbVarA.b = oif.GROUP_NOT_FOUND_ERROR;
            acbVarA.c = "Nothing to download for file group: ".concat(String.valueOf(((oiw) obj4).c));
            oig oigVarA = acbVarA.a();
            if (z2) {
                ((oih) obj3).e.c();
                onb.g(oigVarA, "%s: onFailure", "DownloadListener");
            }
            return ahng.m(oigVarA);
        }
        Object obj5 = this.b;
        if (z2) {
            Object obj6 = ((zpw) obj5).l;
            oih oihVar = (oih) obj3;
            String str = oihVar.a;
            oihVar.e.c();
            ((ooe) ((agfa) obj6).a).i(str);
            z = true;
        } else {
            z = false;
        }
        Object obj7 = this.e;
        agev agevVarH = zpw.h(oipVar2);
        oih oihVar2 = (oih) obj3;
        boolean z3 = oihVar2.f;
        zpw zpwVar = (zpw) obj5;
        Object obj8 = zpwVar.j;
        ?? r9 = zpwVar.o;
        boolean z4 = z;
        ooi ooiVarE = ooi.d(zpw.k(oipVar2, agevVarH, null, 2, z3, (olp) obj8, r9, (ayq) zpwVar.b)).e(new kke(15), r9).e(new roy(zpwVar, z4, oihVar2, (String) obj7, 1), r9);
        ahno.at(ooiVarE.b, new acua(obj5, z4, obj7, 1), r9);
        return ooiVarE.e(new kke(13), MoreExecutors.directExecutor());
    }

    public /* synthetic */ oji(zpw zpwVar, oiw oiwVar, boolean z, oih oihVar, String str, int i) {
        this.$cid = i;
        this.b = zpwVar;
        this.c = oiwVar;
        this.a = z;
        this.d = oihVar;
        this.e = str;
    }
}
