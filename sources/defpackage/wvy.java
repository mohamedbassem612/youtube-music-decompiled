package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatSwipeableContainerLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wvy extends wvx {
    private LiveChatSwipeableContainerLayout l;

    public wvy(acyx acyxVar, advb advbVar, ci ciVar, xgm xgmVar, wyx wyxVar, xsc xscVar, View view) {
        super(acyxVar, advbVar, ciVar, xgmVar.hB(), wyxVar, xscVar, view);
    }

    @Override // defpackage.wvx
    protected final LiveChatSwipeableContainerLayout b() {
        LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayout = this.l;
        if (liveChatSwipeableContainerLayout != null) {
            return liveChatSwipeableContainerLayout;
        }
        LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayout2 = (LiveChatSwipeableContainerLayout) this.a.findViewById(R.id.live_chat_elements_banner_container);
        this.l = liveChatSwipeableContainerLayout2;
        return liveChatSwipeableContainerLayout2;
    }

    @Override // defpackage.wvx, defpackage.wxk
    public final void d(amno amnoVar) {
        amnn amnnVar = amnoVar.k;
        if (amnnVar == null) {
            amnnVar = amnn.a;
        }
        if (!amnnVar.g) {
            e();
            return;
        }
        if ((amnoVar.b & 8) != 0) {
            apji apjiVar = amnoVar.f;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                this.h = amnoVar.d;
                int iBe = a.be(amnoVar.c);
                if (iBe != 0 && iBe == 3) {
                    this.b.kk(Boolean.TRUE);
                }
                b().f = new xbt(this, 1);
                if (amnoVar.g) {
                    b().e(false);
                } else {
                    b().e(true);
                }
                apji apjiVar2 = amnoVar.f;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                if (apjiVar2 != null) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    if (apjiVar2.j.n(aihlVarCheckIsLite2.d)) {
                        b().removeAllViews();
                        adly adlyVar = this.c;
                        adlyVar.h();
                        adlyVar.a(this.f);
                        acyx acyxVar = this.d;
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                        apjiVar2.c(aihlVarCheckIsLite3);
                        Object objK = apjiVar2.j.k(aihlVarCheckIsLite3.d);
                        acxm acxmVarC = acyxVar.c((akrn) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK)));
                        this.g = adul.e((admh) this.e.io(), acxmVarC, (ViewGroup) this.a);
                        adma admaVar = this.g;
                        if (admaVar != null) {
                            admaVar.hU(adlyVar, acxmVarC);
                            b().addView(this.g.a());
                            this.k.af(amnoVar, b());
                            this.i.b(this);
                        }
                    }
                }
            }
        }
    }
}
