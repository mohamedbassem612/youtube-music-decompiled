package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ilm implements aheh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    public ilm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj3;
        this.c = obj4;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [aaqn, java.lang.Object] */
    @Override // defpackage.aheh
    public final void a(Throwable th) {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.c;
                Object obj2 = this.b;
                ?? r1 = this.a;
                ((hnz) this.d).f(r1, (String) obj2, (allr) obj, agpn.b);
                return;
            }
            agev agevVar = ((oih) this.d).e;
            agevVar.g();
            agevVar.c();
            onb.g(th, "%s: onFailure", "DownloadListener");
            ((ooe) ((agfa) ((zpw) this.a).l).a).h((String) this.b);
            ((syn) ((zpw) this.a).h).r(((oka) this.c).a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [aaqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, zwa] */
    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((hnz) this.d).f(this.a, (String) this.b, (allr) this.c, (agkj) Collection.EL.stream((List) obj).collect(aghu.a(new hnf(19), new hnf(20))));
            return;
        }
        if (((ilo) obj) != ilo.b) {
            Object obj2 = this.d;
            ?? r8 = this.a;
            Object obj3 = this.b;
            Object obj4 = this.c;
            ilp ilpVar = (ilp) obj2;
            icj icjVar = ilpVar.c;
            abjw abjwVarN = icjVar.N();
            int i2 = abjwVarN.b;
            List listC = abjg.c(icjVar, 1);
            if (i2 == -1) {
                ((agrc) ((agrc) ilp.a.c()).k("com/google/android/apps/youtube/music/radiostar/RadioStarCommentaryControllerImpl", "initiateCommentaryRequest", 150, "RadioStarCommentaryControllerImpl.java")).t("No currently playing video ID. Not requesting commentary.");
                ListenableFuture listenableFuture = aher.a;
                return;
            }
            boolean z = abjwVarN.a.size() + (-1) <= i2;
            wby wbyVarE = ((wbz) ilpVar.h.io()).e(r8);
            String strG = wfs.g(592, "radio_star_session_state_entity_key");
            afxd afxdVarF = afxd.f(tzk.e(wbyVarE.g(strG).v((avmb) ilpVar.k.io())));
            hlk hlkVar = new hlk(obj2, (Object) r8, strG, 7);
            Executor executor = ilpVar.j;
            afxd afxdVarH = afxdVarF.h(hlkVar, executor);
            afxd afxdVarG = afxd.f(((syn) ilpVar.f.io()).n(((zwb) ilpVar.e.io()).e())).g(new iii(obj2, 4), executor);
            afxd afxdVarF2 = afxd.f(ahng.j(afxdVarH, afxdVarG).b(afwl.c(new itk(afxdVarH, afxdVarG, (aigj) obj4, (apji) obj3, abjwVarN, listC, 1)), executor));
            ilpVar.l = afxdVarF2;
            afxdVarF2.h(new oji(ilpVar, abjwVarN, z, listC, (zwa) r8, 1), executor).g(new idw(obj2, afxdVarF2, 9), executor).c(Throwable.class, new gqb(obj2, afxdVarF2, 13), executor);
        }
    }

    public ilm(zpw zpwVar, oih oihVar, String str, oka okaVar, int i) {
        this.$cid = i;
        this.d = oihVar;
        this.b = str;
        this.c = okaVar;
        this.a = zpwVar;
    }
}
