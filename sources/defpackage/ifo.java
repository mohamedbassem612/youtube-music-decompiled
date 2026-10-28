package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import j$.util.stream.IntStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ifo implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ifo(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        adsr adsrVar;
        int i = 1;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                this.a.invoke(obj);
                break;
            case 1:
                this.a.invoke(obj);
                break;
            case 2:
                this.a.invoke(obj);
                break;
            case 3:
                this.a.invoke(obj);
                break;
            case 4:
                this.a.invoke(obj);
                break;
            case 5:
                igk igkVar = (igk) this.a;
                ((abvk) igkVar.a.io()).ap(false, 44);
                igkVar.h();
                break;
            case 6:
                iix iixVar = (iix) this.a;
                Context context = iixVar.a;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int iIntValue = ((Integer) twm.p(context).second).intValue();
                hfn hfnVar = iixVar.k;
                iixVar.f.b("MUSIC_PLAYLIST_PICKER_MAX_HEIGHT", aihd.a(twm.m(displayMetrics, (iIntValue - hfnVar.K()) - hfnVar.J())).toByteArray());
                break;
            case 7:
                ((ikf) this.a).n();
                break;
            case 8:
                ((ikf) this.a).l((hzh) obj);
                break;
            case 9:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ikf ikfVar = (ikf) this.a;
                if (zBooleanValue != ikfVar.b) {
                    ikfVar.b = bool.booleanValue();
                    ikfVar.n();
                }
                break;
            case 10:
                weh wehVar = ((weo) obj).c;
                if (wehVar instanceof amld) {
                    amld amldVar = (amld) wehVar;
                    if (amldVar.getLikeStatus() == amlg.INDIFFERENT || amldVar.getLikeStatus() == amlg.DISLIKE) {
                        String strB = amldVar.b();
                        if (!TextUtils.isEmpty(strB)) {
                            while (true) {
                                ikn iknVar = (ikn) this.a;
                                if (i2 < iknVar.a.size()) {
                                    anzi anziVarP = ikn.p(iknVar.a.get(i2));
                                    if (anziVarP != null && (anziVarP.b & 16384) != 0) {
                                        anzh anzhVar = anziVarP.q;
                                        if (anzhVar == null) {
                                            anzhVar = anzh.a;
                                        }
                                        if (strB.equals(anzhVar.f)) {
                                            iknVar.f(anziVarP);
                                            break;
                                        }
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                this.a.invoke(obj);
                break;
            case 12:
                this.a.invoke(obj);
                break;
            case 13:
                if (aawb.B(((aboe) obj).j)) {
                    ime imeVar = (ime) this.a;
                    imeVar.h.l();
                    imeVar.f = true;
                }
                break;
            case 14:
                ((ime) this.a).g();
                break;
            case 15:
                ((ime) this.a).h.l();
                break;
            case 16:
                ((ime) this.a).f = false;
                break;
            case 17:
                ((ioc) this.a).f((Boolean) obj);
                break;
            case 18:
                ((iog) this.a).f((Boolean) obj);
                break;
            case 19:
                aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
                ajwo ajwoVar = ((guz) obj).a;
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    ((iog) this.a).A = ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).c;
                }
                break;
            default:
                iog iogVar = (iog) this.a;
                jhs jhsVar = iogVar.B;
                if (jhsVar != null) {
                    TabbedView tabbedView = iogVar.E;
                    int iOrElse = tabbedView != null ? IntStream.CC.range(0, tabbedView.d()).filter(new aagx(tabbedView, i)).findFirst().orElse(-1) : -1;
                    aftj aftjVarD = jhsVar.a.D(iOrElse);
                    if (aftjVarD != null && (adsrVar = (adsr) jhsVar.c.get(aftjVarD)) != null) {
                        if (iOrElse != jhsVar.b()) {
                            adsrVar.W();
                        } else {
                            adsrVar.hP();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
