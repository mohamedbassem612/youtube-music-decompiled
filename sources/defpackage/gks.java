package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gks implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gks(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v42, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v43, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, mbb] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        Object obj2;
        gny gnyVar;
        gpl gplVar;
        boolean z;
        int i = 0;
        switch (this.$cid) {
            case 0:
                long j = gkt.a;
                ((awlk) this.a).kn();
                break;
            case 1:
                if (!((gmu) obj).a()) {
                    ((get) this.a).f();
                }
                break;
            case 2:
                ((glh) this.a).a();
                break;
            case 3:
                aihf aihfVarCreateBuilder = afyp.a.createBuilder();
                int iE = agcl.e((hww) obj);
                aihfVarCreateBuilder.copyOnWrite();
                afyp afypVar = (afyp) aihfVarCreateBuilder.instance;
                afypVar.c = iE - 1;
                afypVar.b |= 1;
                this.a.d((afyp) aihfVarCreateBuilder.build());
                break;
            case 4:
                ((gms) this.a).y();
                break;
            case 5:
                ((gms) this.a).v(((Boolean) obj).booleanValue());
                break;
            case 6:
                ((gms) this.a).x((hww) obj);
                break;
            case 7:
                if (((Boolean) obj).booleanValue() && (gplVar = (gnyVar = (gny) (obj2 = this.a)).j) != null) {
                    int i2 = 2;
                    taf.k(gplVar, gnyVar.d.h(), new gnx(i2), new glm(obj2, i2));
                    break;
                }
                break;
            case 8:
                ((gnf) this.a).R(false, 1);
                break;
            case 9:
                annv annvVar = (annv) obj;
                Object obj3 = this.a;
                gny gnyVar2 = (gny) obj3;
                annv annvVar2 = gnyVar2.f;
                if (annvVar2 != null) {
                    Set setE = gny.e(annvVar2);
                    Set setE2 = gny.e(annvVar);
                    if (setE.containsAll(setE2)) {
                        z = false;
                    } else {
                        gnyVar2.j.W();
                        z = true;
                    }
                    if (!setE2.containsAll(setE)) {
                        agqr it = ((agqb) ahng.ae(setE, setE2)).iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            Map map = gnyVar2.g;
                            if (map.containsKey(str)) {
                                gnyVar2.c.c(new vvt(map.get(str)));
                            }
                        }
                        gnyVar2.a();
                        gnyVar2.i = gnyVar2.a.a(kro.aq());
                        taf.k(gnyVar2.j, gnyVar2.i, new gnx(i), new glm(obj3, 3));
                    } else if (z) {
                    }
                    gnyVar2.b.h = true;
                }
                gnyVar2.f = annvVar;
                break;
            case 10:
                ((gpl) this.a).ar = ((guz) obj).a;
                break;
            case 11:
                Object obj4 = this.a;
                gpl gplVar2 = (gpl) obj4;
                if (gplVar2.isResumed()) {
                    ((gnf) obj4).R(true, 1);
                    gplVar2.ax.l(false);
                }
                break;
            case 12:
                ((gpl) this.a).ac();
                break;
            case 13:
                final gpm gpmVar = (gpm) obj;
                final gpl gplVar3 = (gpl) this.a;
                gplVar3.ao = gpmVar;
                Optional optional = gplVar3.ap;
                if (true == optional.isPresent()) {
                    ((gpv) optional.get()).d();
                }
                gplVar3.an = false;
                RecyclerView recyclerView = gplVar3.al;
                if (recyclerView != null && recyclerView.E != null) {
                    gplVar3.al.E.h = true != (gplVar3.ao.equals(gpm.b) || gplVar3.ao.equals(gpm.a)) ? 125L : 0L;
                }
                gplVar3.Y(false);
                if (gplVar3.w.isPresent()) {
                    admc admcVar = ((adsr) gplVar3.w.get()).m;
                    admb admbVar = gplVar3.aq;
                    if (admbVar != null) {
                        admcVar.i(admbVar);
                    }
                    gplVar3.aq = new admb() { // from class: gpb
                        @Override // defpackage.admb
                        public final void a(adma admaVar, Object obj5) {
                            Optional optionalU = gplVar3.U(gpmVar);
                            gfi gfiVar = new gfi(obj5, 14);
                            if (true == optionalU.isPresent()) {
                                ((gpv) optionalU.get()).f(gfiVar.a);
                            }
                        }
                    };
                    admcVar.g(gplVar3.aq);
                }
                break;
            case 14:
                Object obj5 = this.a;
                gpl gplVar4 = (gpl) obj5;
                gplVar4.Y(true);
                gplVar4.ap = gplVar4.U((gpm) obj);
                Optional optional2 = gplVar4.ap;
                gfi gfiVar = new gfi(obj5, 15);
                if (true == optional2.isPresent()) {
                    ((gpv) optional2.get()).c((gpl) gfiVar.a);
                }
                cf activity = gplVar4.getActivity();
                if (activity != null) {
                    activity.invalidateOptionsMenu();
                }
                break;
            case 15:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                grf grfVar = (grf) this.a;
                grfVar.ax = zBooleanValue;
                grfVar.aD.g(bool.booleanValue());
                break;
            case 16:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                grm grmVar = (grm) this.a;
                grmVar.l = zBooleanValue2;
                grmVar.i(zBooleanValue2);
                break;
            case 17:
                Throwable th = (Throwable) obj;
                String message = th.getMessage() == null ? "ExecuteEntityCommand error" : th.getMessage();
                Object obj6 = this.a;
                ((agrc) ((agrc) ((agrc) gtp.a.b()).j(th)).k("com/google/android/apps/youtube/music/command/ExecuteEntityCommandResolver", "resolve", 'Q', "ExecuteEntityCommandResolver.java")).w("%s", message);
                zvp.b(zvn.b, zvm.n, message, th);
                jio jioVarE = jin.e();
                gtp gtpVar = (gtp) obj6;
                ((jik) jioVarE).k(gtpVar.c.getText(R.string.navigation_unavailable));
                gtpVar.d.d(jioVarE.b());
                break;
            case 18:
                this.a.invoke(obj);
                break;
            case 19:
                this.a.invoke(obj);
                break;
            default:
                weh wehVar = ((weo) obj).c;
                Object obj7 = this.a;
                if (wehVar != null && !((ajxn) wehVar).getCommentText().isEmpty()) {
                    gze gzeVar = (gze) obj7;
                    aevy aevyVar = gzeVar.a.b;
                    if (aevyVar != null && aevyVar.isAdded()) {
                        gzeVar.b.f();
                        gzeVar.i.o(gzeVar.h);
                    }
                }
                gze gzeVar2 = (gze) obj7;
                gzeVar2.i.p(gzeVar2.h);
                break;
        }
    }
}
