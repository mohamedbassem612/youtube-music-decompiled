package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import j$.util.Optional;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aasz implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aasz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v19, types: [acey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v66, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v67, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        ajwo ajwoVar;
        ajwo ajwoVar2;
        switch (this.$cid) {
            case 0:
                aarp aarpVar = (aarp) obj;
                agrf agrfVar = aatc.a;
                aarpVar.getClass();
                aarpVar.e((aamw) this.a);
                return;
            case 1:
                aarp aarpVar2 = (aarp) obj;
                agrf agrfVar2 = aatc.a;
                aarpVar2.getClass();
                aarpVar2.d((aamw) this.a);
                return;
            case 2:
                aarp aarpVar3 = (aarp) obj;
                agrf agrfVar3 = aatc.a;
                aarpVar3.getClass();
                aarpVar3.i((aamw) this.a);
                return;
            case 3:
                aarp aarpVar4 = (aarp) obj;
                agrf agrfVar4 = aatc.a;
                aarpVar4.getClass();
                aarpVar4.j((aamw) this.a);
                return;
            case 4:
                aarp aarpVar5 = (aarp) obj;
                agrf agrfVar5 = aatc.a;
                aarpVar5.getClass();
                aarpVar5.h((aamw) this.a);
                return;
            case 5:
                aarp aarpVar6 = (aarp) obj;
                agrf agrfVar6 = aatc.a;
                aarpVar6.getClass();
                aarpVar6.a((aamw) this.a);
                return;
            case 6:
                aarp aarpVar7 = (aarp) obj;
                agrf agrfVar7 = aatc.a;
                aarpVar7.getClass();
                aarpVar7.l((aamw) this.a);
                return;
            case 7:
                aarp aarpVar8 = (aarp) obj;
                agrf agrfVar8 = aatc.a;
                aarpVar8.getClass();
                aamw aamwVar = (aamw) this.a;
                aarpVar8.f(aamwVar);
                if ((aamwVar.c & SemanticState.LiveRegion) != 0) {
                    aarpVar8.b(aamwVar);
                    return;
                }
                return;
            case 8:
                acca accaVar = (acca) obj;
                ?? r10 = ((abwk) this.a).d;
                if (r10 != 0) {
                    r10.ay(accaVar);
                    return;
                }
                return;
            case 9:
                aawu aawuVar = (aawu) obj;
                acip acipVar = ((acag) this.a).q;
                if (acipVar == null || aawuVar == null) {
                    return;
                }
                acipVar.av().kk(aawuVar);
                return;
            case 10:
                ((acga) this.a).j((acfx) obj);
                return;
            case 11:
                ((acln) obj).a((agkz) this.a);
                return;
            case 12:
                Throwable th = (Throwable) obj;
                if (((acnk) this.a).o.isCancelled()) {
                    return;
                }
                ((agrc) ((agrc) ((agrc) acnk.a.b()).j(th)).k("com/google/android/libraries/youtube/reel/internal/fragment/ReelWatchErrorController", "scheduleShowOfflineError", (char) 528, "ReelWatchErrorController.java")).t("Failed to show reel offline error");
                return;
            case 13:
                Object obj2 = this.a;
                acnk acnkVar = (acnk) obj2;
                final ilv ilvVar = acnkVar.p;
                int i = 4;
                if (ilvVar.f) {
                    if (ilvVar.d.isPresent()) {
                        int i2 = ((LoadingFrameLayout) ((ilt) ilvVar.d.get()).a.c).d;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i2 == 4) {
                            return;
                        }
                    }
                } else if (ilvVar.e.isPresent() && ((ilu) ilvVar.e.get()).a.getVisibility() == 0) {
                    return;
                }
                ilvVar.c = Optional.of(new abyz(obj2, 14));
                if (ilvVar.f) {
                    if (ilvVar.d.isEmpty()) {
                        LoadingFrameLayout loadingFrameLayout = new LoadingFrameLayout(ilvVar.a);
                        loadingFrameLayout.c(new gna(ilvVar, i));
                        loadingFrameLayout.d(new ixy() { // from class: ils
                            @Override // defpackage.ixy
                            public final void a() {
                                ilvVar.N();
                            }
                        });
                        ((ViewGroup) ilvVar.b.get()).addView(loadingFrameLayout);
                        ilvVar.d = Optional.of(ilvVar.a(loadingFrameLayout));
                    }
                    ((ilt) ilvVar.d.get()).a.o(true, new IOException("no network connection"));
                } else {
                    if (ilvVar.e.isEmpty()) {
                        ViewGroup viewGroup = (ViewGroup) ilvVar.b.get();
                        viewGroup.removeAllViews();
                        LayoutInflater.from(ilvVar.a).inflate(R.layout.music_playback_error_overlay, viewGroup);
                        View viewFindViewById = ((ViewGroup) ilvVar.b.get()).findViewById(R.id.music_playback_error_root);
                        viewFindViewById.getClass();
                        ilu iluVarB = ilvVar.b(viewFindViewById);
                        iluVarB.getClass();
                        ilvVar.e = Optional.of(iluVarB);
                    }
                    hwj hwjVar = ((ilu) ilvVar.e.get()).b;
                    hwjVar.c(hww.c);
                    hwjVar.b(true);
                    hwjVar.a(new aboe(4, true, 1, ilvVar.a.getString(R.string.no_connection), null, null, null, null));
                }
                acnkVar.f();
                return;
            case 14:
                acra acraVar = (acra) obj;
                if (acraVar == null || (ajwoVar = acraVar.f) == null || !aecm.aD(ajwoVar)) {
                    return;
                }
                this.a.add(aecm.ad(ajwoVar));
                return;
            case 15:
                this.a.add(Optional.ofNullable(((acra) obj).d));
                return;
            case 16:
                acra acraVar2 = (acra) obj;
                if (acraVar2 == null || (ajwoVar2 = acraVar2.f) == null) {
                    return;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar2.c(aihlVarCheckIsLite);
                if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                    ajwoVar2.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                    if (((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).i == 44) {
                        ((qtf) ((acqz) this.a).ad.x.io()).b(1L, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ((acwq) this.a).b("There was an error showing text dialog", (Throwable) obj);
                return;
            case 18:
                ((acwq) this.a).b("There was an error showing confirm dialog", (Throwable) obj);
                return;
            case 19:
                ((acwq) this.a).b("There was an error showing text dialog", (Throwable) obj);
                return;
            default:
                Throwable th2 = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) adfn.a.b()).j(th2)).k("com/google/android/libraries/youtube/rendering/elements/dialog/ModernElementsDialogController", "showDialog", '}', "ModernElementsDialogController.java")).t("Failed to retrieve the account id");
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 36;
                zvjVarA.i = 171;
                zvjVarA.d("ElementsDialogFragment Failed to retrieve the account id");
                th2.getClass();
                zvjVarA.f(th2);
                ((adfn) this.a).c.a(zvjVarA.a());
                return;
        }
    }
}
