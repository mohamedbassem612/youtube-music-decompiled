package defpackage;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatBannerContainerLayout;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xcd extends xbi {
    private final awmd A;

    public xcd(advb advbVar, wyx wyxVar, vxe vxeVar, ci ciVar, acyx acyxVar, Handler handler, awmd awmdVar, View view, xgn xgnVar) {
        super(advbVar, wyxVar, vxeVar, acyxVar, ciVar, xgnVar, handler, awmdVar, view);
        this.A = awmdVar;
    }

    @Override // defpackage.xbi, defpackage.wxk
    public final void d(amno amnoVar) {
        aiqd aiqdVar;
        amnn amnnVar = amnoVar.k;
        if (amnnVar == null) {
            amnnVar = amnn.a;
        }
        if (amnnVar.g) {
            if (((vxz) this.A.io()).m(28, 45825352L)) {
                e();
                return;
            }
            return;
        }
        int i = amnoVar.b;
        if ((i & 8) != 0) {
            if ((i & 4) != 0) {
                apji apjiVar = amnoVar.e;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(amnm.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    return;
                }
            }
            apji apjiVar2 = amnoVar.f;
            if (apjiVar2 == null) {
                apjiVar2 = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ampf.a);
            apjiVar2.c(aihlVarCheckIsLite2);
            if (!apjiVar2.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite3);
                if (!apjiVar2.j.n(aihlVarCheckIsLite3.d)) {
                    return;
                }
            }
            this.l = amnoVar.d;
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.p.end();
            }
            LiveChatBannerContainerLayout liveChatBannerContainerLayout = this.c;
            liveChatBannerContainerLayout.a = !amnoVar.g;
            int i2 = amnoVar.c;
            ajwo ajwoVar = amnoVar.h;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            this.t = ajwoVar;
            ajwo ajwoVar2 = amnoVar.i;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            this.u = ajwoVar2;
            this.i.removeCallbacks(this.m);
            awmd awmdVar = this.k;
            boolean zM = ((vxz) awmdVar.io()).m(12, 45756228L);
            boolean z = this.r;
            if (zM) {
                if (!z) {
                    v(false);
                }
            } else if (z) {
                v(false);
            }
            adly adlyVar = this.h;
            adlyVar.h();
            adlyVar.f("on_content_clicked_listener", this);
            adlyVar.f("accessibility_data_receiver_key", this);
            adlyVar.a(this.j);
            this.f.removeAllViews();
            if ((amnoVar.b & 4) != 0) {
                this.s = true;
                apji apjiVar3 = amnoVar.e;
                if (apjiVar3 == null) {
                    apjiVar3 = apji.a;
                }
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(amnm.a);
                apjiVar3.c(aihlVarCheckIsLite4);
                Object objK = apjiVar3.j.k(aihlVarCheckIsLite4.d);
                amnl amnlVar = (amnl) (objK == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK));
                if ((amnlVar.b & 4) != 0) {
                    apji apjiVar4 = amnlVar.d;
                    if (apjiVar4 == null) {
                        apjiVar4 = apji.a;
                    }
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajnp.a);
                    apjiVar4.c(aihlVarCheckIsLite5);
                    Object objK2 = apjiVar4.j.k(aihlVarCheckIsLite5.d);
                    ajnf ajnfVar = (ajnf) (objK2 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK2));
                    if ((ajnfVar.b & 262144) != 0) {
                        aiqe aiqeVar = ajnfVar.v;
                        if (aiqeVar == null) {
                            aiqeVar = aiqe.a;
                        }
                        aiqdVar = aiqeVar.c;
                        if (aiqdVar == null) {
                            aiqdVar = aiqd.a;
                        }
                    } else {
                        aiqdVar = ajnfVar.u;
                        if (aiqdVar == null) {
                            aiqdVar = aiqd.a;
                        }
                    }
                    if (aiqdVar != null) {
                        this.d.setContentDescription(aiqdVar.c);
                    }
                    if ((ajnfVar.b & SemanticState.Multiline) != 0) {
                        ajwo ajwoVar3 = ajnfVar.s;
                        if (ajwoVar3 == null) {
                            ajwoVar3 = ajwo.a;
                        }
                        this.n = ajwoVar3;
                    }
                    ImageButton imageButton = this.d;
                    imageButton.setOnClickListener(this);
                    imageButton.setVisibility(0);
                } else {
                    this.d.setVisibility(8);
                }
                TextView textView = this.e;
                alay alayVar = amnlVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                tuk.u(textView, ackj.k(null, alayVar, null, false));
            } else {
                this.s = false;
                TextView textView2 = this.e;
                textView2.setText((CharSequence) null);
                textView2.setVisibility(8);
                this.d.setVisibility(8);
            }
            apji apjiVar5 = amnoVar.f;
            if (apjiVar5 == null) {
                apjiVar5 = apji.a;
            }
            this.o = apjiVar5;
            super.u(this.o);
            ci ciVar = this.z;
            if (ciVar != null) {
                ciVar.af(amnoVar, this.g);
            }
            super.s();
            amnn amnnVar2 = amnoVar.k;
            if (((amnnVar2 == null ? amnn.a : amnnVar2).b & 4) != 0) {
                if (amnnVar2 == null) {
                    amnnVar2 = amnn.a;
                }
                aigu aiguVar = amnnVar2.d;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                Duration durationAw = ahng.aw(aiguVar);
                if (a.y(durationAw)) {
                    this.v = durationAw;
                }
            } else {
                this.v = xbi.a;
            }
            amnn amnnVar3 = amnoVar.k;
            if (((amnnVar3 == null ? amnn.a : amnnVar3).b & 8) != 0) {
                if (amnnVar3 == null) {
                    amnnVar3 = amnn.a;
                }
                this.w = amnnVar3.e;
            } else {
                this.w = false;
            }
            liveChatBannerContainerLayout.setTranslationY(0.0f);
            if (this.q) {
                super.t();
                return;
            }
            if (((vxz) awmdVar.io()).m(12, 45756228L)) {
                i();
            } else {
                this.x.b(this);
            }
            this.q = true;
        }
    }

    @Override // defpackage.xbi
    protected final ViewGroup l() {
        return (ViewGroup) this.b.findViewById(R.id.banner_content);
    }

    @Override // defpackage.xbi
    protected final ViewGroup m() {
        return (ViewGroup) this.b.findViewById(R.id.foreground_content);
    }

    @Override // defpackage.xbi
    protected final ViewGroup n() {
        return (ViewGroup) this.b.findViewById(R.id.header_mid_section_container);
    }

    @Override // defpackage.xbi
    protected final ViewGroup o() {
        return (ViewGroup) this.b.findViewById(R.id.live_chat_banner_container);
    }

    @Override // defpackage.xbi
    protected final ImageButton p() {
        return (ImageButton) this.b.findViewById(R.id.context_menu_toggle);
    }

    @Override // defpackage.xbi
    protected final TextView q() {
        return (TextView) this.b.findViewById(R.id.header_text);
    }

    @Override // defpackage.xbi
    protected final LiveChatBannerContainerLayout r() {
        return (LiveChatBannerContainerLayout) this.b.findViewById(R.id.live_chat_banner);
    }
}
