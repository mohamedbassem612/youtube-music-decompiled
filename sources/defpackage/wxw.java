package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxw implements vxc {
    private final wxi a;

    public wxw(wxi wxiVar) {
        this.a = wxiVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amnb.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amnb.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            ammv ammvVar = (ammv) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            int i = ammvVar.c;
            int iBc = a.bc(i);
            if (iBc != 0 && iBc == 2) {
                wxl wxlVarC = this.a.c();
                if (wxlVarC != null) {
                    if ((ammvVar.b & 2) == 0) {
                        wxlVarC.m();
                        return;
                    }
                    apji apjiVar = ammvVar.d;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(amqv.a);
                    apjiVar.c(aihlVarCheckIsLite3);
                    if (!apjiVar.j.n(aihlVarCheckIsLite3.d)) {
                        ((agrc) ((agrc) wvs.a.c()).k("com/google/android/libraries/youtube/livechat/action/LiveChatActionHandlerUtils", "performReplaceLiveChatActionPanel", 357, "LiveChatActionHandlerUtils.java")).t("Unable to replace input action panel. Unknown replacement renderer");
                        return;
                    }
                    aihf aihfVarCreateBuilder = amqj.a.createBuilder();
                    apji apjiVar2 = ammvVar.d;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amqv.a);
                    apjiVar2.c(aihlVarCheckIsLite4);
                    if (apjiVar2.j.n(aihlVarCheckIsLite4.d)) {
                        apji apjiVar3 = ammvVar.d;
                        if (apjiVar3 == null) {
                            apjiVar3 = apji.a;
                        }
                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(amqv.a);
                        apjiVar3.c(aihlVarCheckIsLite5);
                        Object objK2 = apjiVar3.j.k(aihlVarCheckIsLite5.d);
                        amqt amqtVar = (amqt) (objK2 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK2));
                        aihfVarCreateBuilder.copyOnWrite();
                        amqj amqjVar = (amqj) aihfVarCreateBuilder.instance;
                        amqtVar.getClass();
                        amqjVar.c = amqtVar;
                        amqjVar.b = 132498670;
                    }
                    wxlVarC.f((amqj) aihfVarCreateBuilder.build());
                    return;
                }
                return;
            }
            int iBc2 = a.bc(i);
            if (iBc2 == 0 || iBc2 != 3) {
                int iBc3 = a.bc(i);
                if (iBc3 == 0 || iBc3 != 4) {
                    return;
                }
                wvs.a(ajwoVar, this.a);
                return;
            }
            wwn wwnVarB = this.a.B();
            if (wwnVarB == null || (ammvVar.b & 2) == 0) {
                return;
            }
            apji apjiVar4 = ammvVar.d;
            if (apjiVar4 == null) {
                apjiVar4 = apji.a;
            }
            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(amom.a);
            apjiVar4.c(aihlVarCheckIsLite6);
            if (!apjiVar4.j.n(aihlVarCheckIsLite6.d)) {
                ((agrc) ((agrc) wvs.a.c()).k("com/google/android/libraries/youtube/livechat/action/LiveChatActionHandlerUtils", "performReplaceLiveChatHeader", 382, "LiveChatActionHandlerUtils.java")).t("Unable to replace LiveChatHeader. Unknown replacement renderer");
                return;
            }
            apji apjiVar5 = ammvVar.d;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(amom.a);
            apjiVar5.c(aihlVarCheckIsLite7);
            Object objK3 = apjiVar5.j.k(aihlVarCheckIsLite7.d);
            amol amolVar = (amol) (objK3 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK3));
            if (wwnVarB.h != null) {
                aihf aihfVarCreateBuilder2 = amqk.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amqk amqkVar = (amqk) aihfVarCreateBuilder2.instance;
                amolVar.getClass();
                amqkVar.c = amolVar;
                amqkVar.b = 130028801;
                wwnVarB.h.an((amqk) aihfVarCreateBuilder2.build());
            }
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
