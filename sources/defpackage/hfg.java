package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hfg implements tab {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hfg(gwa gwaVar, aoht aohtVar, ajwo ajwoVar, hxb hxbVar, int i) {
        this.$cid = i;
        this.a = gwaVar;
        this.c = aohtVar;
        this.b = ajwoVar;
        this.d = hxbVar;
    }

    @Override // defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        switch (this.$cid) {
            case 0:
                a((Throwable) obj);
                break;
            case 1:
                a((Throwable) obj);
                break;
            case 2:
                a((Throwable) obj);
                break;
            case 3:
                a((Throwable) obj);
                break;
            case 4:
                a((Throwable) obj);
                break;
            case 5:
                a((Throwable) obj);
                break;
            case 6:
                a((Throwable) obj);
                break;
            default:
                a((Throwable) obj);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.tab
    /* JADX INFO: renamed from: b */
    public final void a(Throwable th) {
        switch (this.$cid) {
            case 0:
                ((hfk) this.a).a(fhz.t((amlg) this.b, (amlg) this.c));
                boolean z = th instanceof toe;
                Object obj = this.d;
                if (!z) {
                    ((hfl) obj).jj(new toe(th));
                } else {
                    ((hfl) obj).jj((toe) th);
                }
                break;
            case 1:
                agrx agrxVar = agso.a;
                String str = ((aoht) this.c).c;
                ((gwa) this.a).a.s((ajwo) this.b, (hxb) this.d);
                break;
            case 2:
                ((hfk) this.a).a(fhz.t((amlg) this.b, (amlg) this.c));
                boolean z2 = th instanceof toe;
                Object obj2 = this.d;
                if (!z2) {
                    ((hfq) obj2).jj(new toe(th));
                } else {
                    ((hfq) obj2).jj((toe) th);
                }
                break;
            case 3:
                ((hfk) this.d).a(fhz.t((amlg) this.b, (amlg) this.c));
                boolean z3 = th instanceof toe;
                Object obj3 = this.a;
                if (!z3) {
                    ((hfd) obj3).jj(new toe(th));
                } else {
                    ((hfd) obj3).jj((toe) th);
                }
                break;
            case 4:
                ((awlx) this.c).ki(((hgy) this.d).h((ajwo) this.b, (Bundle) this.a));
                break;
            case 5:
                amlg amlgVar = (amlg) this.b;
                ((hhd) this.a).c((String) this.c, fhz.t((amlg) this.d, amlgVar));
                zvp.a(zvn.a, zvm.n, th.getMessage() != null ? th.getMessage() : String.valueOf(amlgVar.name()).concat(" request not sent."));
                break;
            case 6:
                ((hzp) this.a).e((aihh) this.d, fhz.t((amlg) this.b, (amlg) this.c));
                ((agrc) ((agrc) ((agrc) hzp.a.b().i(agso.a, "NotificationLikeBtnCtlr")).j(th)).k("com/google/android/apps/youtube/music/player/notification/DefaultNotificationLikeButtonController", "handleRateAction", (char) 349, "DefaultNotificationLikeButtonController.java")).t("Error rating");
                break;
            default:
                Object obj4 = this.d;
                wxa wxaVar = (wxa) obj4;
                String strB = wxaVar.g.b(th);
                ?? r4 = this.c;
                wxaVar.e.s(strB, new xhv(obj4, this.a, this.b, (Object) r4, 1));
                if (r4 != 0) {
                    r4.run();
                }
                break;
        }
    }

    public /* synthetic */ hfg(hfk hfkVar, amlg amlgVar, amlg amlgVar2, hfa hfaVar, int i) {
        this.$cid = i;
        this.a = hfkVar;
        this.b = amlgVar;
        this.c = amlgVar2;
        this.d = hfaVar;
    }

    public /* synthetic */ hfg(hfk hfkVar, amlg amlgVar, amlg amlgVar2, hfd hfdVar, int i) {
        this.$cid = i;
        this.d = hfkVar;
        this.b = amlgVar;
        this.c = amlgVar2;
        this.a = hfdVar;
    }

    public /* synthetic */ hfg(hgy hgyVar, awlx awlxVar, ajwo ajwoVar, Bundle bundle, int i) {
        this.$cid = i;
        this.d = hgyVar;
        this.c = awlxVar;
        this.b = ajwoVar;
        this.a = bundle;
    }

    public /* synthetic */ hfg(hhd hhdVar, String str, amlg amlgVar, amlg amlgVar2, int i) {
        this.$cid = i;
        this.a = hhdVar;
        this.c = str;
        this.d = amlgVar;
        this.b = amlgVar2;
    }

    public /* synthetic */ hfg(hzp hzpVar, aihh aihhVar, amlg amlgVar, amlg amlgVar2, int i) {
        this.$cid = i;
        this.a = hzpVar;
        this.d = aihhVar;
        this.b = amlgVar;
        this.c = amlgVar2;
    }

    public /* synthetic */ hfg(wxa wxaVar, wlu wluVar, acjx acjxVar, Runnable runnable, int i) {
        this.$cid = i;
        this.d = wxaVar;
        this.a = wluVar;
        this.b = acjxVar;
        this.c = runnable;
    }
}
