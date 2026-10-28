package defpackage;

import android.content.Context;
import com.google.cardboard.sdk.R;
import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gyu implements aheh {
    final /* synthetic */ xir a;
    final /* synthetic */ ajwo b;
    final /* synthetic */ Map c;
    final /* synthetic */ gyv d;

    public gyu(gyv gyvVar, xir xirVar, ajwo ajwoVar, Map map) {
        this.a = xirVar;
        this.b = ajwoVar;
        this.c = map;
        this.d = gyvVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        this.a.f(tau.ACTION_ABANDONED);
        ((agrc) ((agrc) ((agrc) gyv.a.b().i(agso.a, "WatchEndpointCmd")).j(th)).k("com/google/android/apps/youtube/music/command/WatchEndpointCommandResolver$1", "onFailure", (char) 133, "WatchEndpointCommandResolver.java")).t("Dropping WatchEndpointCommand without informing the user.");
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:0x014f A[PHI: r3
      0x014f: PHI (r3v61 int) = (r3v55 int), (r3v81 int) binds: [B:64:0x014d, B:40:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    @Override // defpackage.aheh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ajwo ajwoVar;
        aihl aihlVarCheckIsLite;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        aihl aihlVarCheckIsLite3;
        Object objK2;
        Object objC2;
        arid aridVar;
        aria ariaVar;
        arhz arhzVar;
        int iAS;
        if (!Objects.equals((Boolean) obj, Boolean.TRUE)) {
            this.a.f(tau.ACTION_ABANDONED);
            this.d.f.f();
            return;
        }
        gyv gyvVar = this.d;
        if (gyvVar.e.c()) {
            ajwo ajwoVar2 = this.b;
            if (!gzj.U(ajwoVar2) && !igs.b(gzj.P(ajwoVar2))) {
                this.a.f(tau.ACTION_ABANDONED);
                ((agrc) ((agrc) gyv.a.b().i(agso.a, "WatchEndpointCmd")).k("com/google/android/apps/youtube/music/command/WatchEndpointCommandResolver$1", "onSuccess", R.styleable.AppCompatTheme_windowNoTitle, "WatchEndpointCommandResolver.java")).t("Dropping WatchEndpointCommand without informing the user.");
                return;
            }
        }
        if (((Boolean) gyvVar.c.io()).booleanValue()) {
            ajwo ajwoVar3 = this.b;
            int iAf = gzj.af(ajwoVar3);
            int i = 1;
            if (ajwoVar3 != null) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arik.a);
                ajwoVar3.c(aihlVarCheckIsLite4);
                if (ajwoVar3.j.n(aihlVarCheckIsLite4.d)) {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(arik.a);
                    ajwoVar3.c(aihlVarCheckIsLite5);
                    Object objK3 = ajwoVar3.j.k(aihlVarCheckIsLite5.d);
                    if ((((arij) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).b & 2097152) != 0) {
                        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(arik.a);
                        ajwoVar3.c(aihlVarCheckIsLite6);
                        Object objK4 = ajwoVar3.j.k(aihlVarCheckIsLite6.d);
                        arid aridVar2 = ((arij) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4))).r;
                        if (aridVar2 == null) {
                            aridVar2 = arid.a;
                        }
                        aria ariaVar2 = aridVar2.b;
                        if (ariaVar2 == null) {
                            ariaVar2 = aria.a;
                        }
                        arhz arhzVar2 = ariaVar2.b;
                        if (arhzVar2 == null) {
                            arhzVar2 = arhz.a;
                        }
                        iAS = a.aS(arhzVar2.c);
                        if (iAS != 0) {
                            i = iAS;
                        }
                    } else {
                        aihlVarCheckIsLite = aihn.checkIsLite(arix.a);
                        ajwoVar3.c(aihlVarCheckIsLite);
                        if (ajwoVar3.j.n(aihlVarCheckIsLite.d)) {
                            aihlVarCheckIsLite2 = aihn.checkIsLite(arix.a);
                            ajwoVar3.c(aihlVarCheckIsLite2);
                            objK = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
                            if (objK == null) {
                                objC = aihlVarCheckIsLite2.b;
                            } else {
                                objC = aihlVarCheckIsLite2.c(objK);
                            }
                            if ((((ariw) objC).b & 64) != 0) {
                                aihlVarCheckIsLite3 = aihn.checkIsLite(arix.a);
                                ajwoVar3.c(aihlVarCheckIsLite3);
                                objK2 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
                                if (objK2 == null) {
                                    objC2 = aihlVarCheckIsLite3.b;
                                } else {
                                    objC2 = aihlVarCheckIsLite3.c(objK2);
                                }
                                aridVar = ((ariw) objC2).g;
                                if (aridVar == null) {
                                    aridVar = arid.a;
                                }
                                ariaVar = aridVar.b;
                                if (ariaVar == null) {
                                    ariaVar = aria.a;
                                }
                                arhzVar = ariaVar.b;
                                if (arhzVar == null) {
                                    arhzVar = arhz.a;
                                }
                                iAS = a.aS(arhzVar.c);
                                if (iAS != 0) {
                                    i = iAS;
                                }
                            }
                        }
                    }
                } else {
                    aihlVarCheckIsLite = aihn.checkIsLite(arix.a);
                    ajwoVar3.c(aihlVarCheckIsLite);
                    if (ajwoVar3.j.n(aihlVarCheckIsLite.d)) {
                        aihlVarCheckIsLite2 = aihn.checkIsLite(arix.a);
                        ajwoVar3.c(aihlVarCheckIsLite2);
                        objK = ajwoVar3.j.k(aihlVarCheckIsLite2.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite2.b;
                        } else {
                            objC = aihlVarCheckIsLite2.c(objK);
                        }
                        if ((((ariw) objC).b & 64) != 0) {
                            aihlVarCheckIsLite3 = aihn.checkIsLite(arix.a);
                            ajwoVar3.c(aihlVarCheckIsLite3);
                            objK2 = ajwoVar3.j.k(aihlVarCheckIsLite3.d);
                            if (objK2 == null) {
                                objC2 = aihlVarCheckIsLite3.b;
                            } else {
                                objC2 = aihlVarCheckIsLite3.c(objK2);
                            }
                            aridVar = ((ariw) objC2).g;
                            if (aridVar == null) {
                                aridVar = arid.a;
                            }
                            ariaVar = aridVar.b;
                            if (ariaVar == null) {
                                ariaVar = aria.a;
                            }
                            arhzVar = ariaVar.b;
                            if (arhzVar == null) {
                                arhzVar = arhz.a;
                            }
                            iAS = a.aS(arhzVar.c);
                            if (iAS != 0) {
                                i = iAS;
                            }
                        }
                    }
                }
            }
            anzw anzwVarP = gzj.P(ajwoVar3);
            if (iAf != 2 && i != 2 && i != 3 && !anzw.MUSIC_VIDEO_TYPE_PRIVATELY_OWNED_TRACK.equals(anzwVarP)) {
                this.a.f(tau.ACTION_ABANDONED);
                hzl hzlVar = (hzl) gyvVar.d.io();
                Context context = hzlVar.b;
                hzlVar.b(fhz.Q(context.getString(com.google.android.apps.youtube.music.R.string.audio_only_castability_missing_start_playback_all_content_toast), context.getString(com.google.android.apps.youtube.music.R.string.audio_only_castability_upgrade_button), hzl.a));
                return;
            }
        }
        xsc xscVar = gyvVar.g;
        ajwo ajwoVar4 = this.b;
        aihl aihlVarCheckIsLite7 = aihn.checkIsLite(arik.a);
        ajwoVar4.c(aihlVarCheckIsLite7);
        Object objK5 = ajwoVar4.j.k(aihlVarCheckIsLite7.d);
        arij arijVar = (arij) (objK5 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK5));
        arii ariiVar = arijVar.s;
        if (ariiVar == null) {
            ariiVar = arii.a;
        }
        arih arihVar = ariiVar.c;
        if (arihVar == null) {
            arihVar = arih.a;
        }
        if ((arihVar.b & 16) != 0) {
            arii ariiVar2 = arijVar.s;
            if (ariiVar2 == null) {
                ariiVar2 = arii.a;
            }
            arih arihVar2 = ariiVar2.c;
            if (arihVar2 == null) {
                arihVar2 = arih.a;
            }
            ajwoVar = arihVar2.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        if (ajwoVar != null) {
            ?? r3 = ((vxz) xscVar.b).l(21, 45652004L, false) ? xscVar.a : xscVar.c;
            if (r3.contains(ajwoVar4)) {
                ajwoVar4 = ajwoVar;
            } else {
                Iterator it = r3.iterator();
                if (it.hasNext()) {
                    ajwo ajwoVar5 = (ajwo) it.next();
                    aihl aihlVarCheckIsLite8 = aihn.checkIsLite(arik.a);
                    ajwoVar5.c(aihlVarCheckIsLite8);
                    if (ajwoVar5.j.n(aihlVarCheckIsLite8.d)) {
                        aihl aihlVarCheckIsLite9 = aihn.checkIsLite(arik.a);
                        ajwoVar4.c(aihlVarCheckIsLite9);
                        if (ajwoVar4.j.n(aihlVarCheckIsLite9.d)) {
                            aihl aihlVarCheckIsLite10 = aihn.checkIsLite(arik.a);
                            ajwoVar5.c(aihlVarCheckIsLite10);
                            Object objK6 = ajwoVar5.j.k(aihlVarCheckIsLite10.d);
                            String str = ((arij) (objK6 == null ? aihlVarCheckIsLite10.b : aihlVarCheckIsLite10.c(objK6))).e;
                            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(arik.a);
                            ajwoVar4.c(aihlVarCheckIsLite11);
                            Object objK7 = ajwoVar4.j.k(aihlVarCheckIsLite11.d);
                            if (str.equals(((arij) (objK7 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK7))).e)) {
                                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(arik.a);
                                ajwoVar5.c(aihlVarCheckIsLite12);
                                Object objK8 = ajwoVar5.j.k(aihlVarCheckIsLite12.d);
                                String str2 = ((arij) (objK8 == null ? aihlVarCheckIsLite12.b : aihlVarCheckIsLite12.c(objK8))).d;
                                aihl aihlVarCheckIsLite13 = aihn.checkIsLite(arik.a);
                                ajwoVar4.c(aihlVarCheckIsLite13);
                                Object objK9 = ajwoVar4.j.k(aihlVarCheckIsLite13.d);
                                if (str2.equals(((arij) (objK9 == null ? aihlVarCheckIsLite13.b : aihlVarCheckIsLite13.c(objK9))).d)) {
                                    ajwoVar4 = ajwoVar;
                                }
                            }
                        }
                    }
                }
                xscVar.c.add(ajwoVar4);
                xscVar.a.add(ajwoVar4);
            }
        }
        igy igyVar = gyvVar.b;
        Map map = this.c;
        xir xirVar = this.a;
        aase aaseVarA = hxb.a(map);
        aaseVarA.f(xirVar);
        igyVar.s(ajwoVar4, aaseVarA.d());
    }
}
