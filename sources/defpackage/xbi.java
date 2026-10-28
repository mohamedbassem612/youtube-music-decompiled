package defpackage;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatBannerContainerLayout;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xbi implements View.OnClickListener, wxk, wyw, xbb {
    public static final Duration a = Duration.ofSeconds(7);
    private final ViewGroup A;
    private final ViewGroup B;
    private final vxe C;
    private final advb D;
    private final acyx E;
    private adma F;
    protected final View b;
    public final LiveChatBannerContainerLayout c;
    public final ImageButton d;
    public final TextView e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final Handler i;
    public final xgn j;
    public final awmd k;
    public String l;
    public ajwo n;
    public apji o;
    public ObjectAnimator p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ajwo t;
    public ajwo u;
    public Duration v;
    public boolean w;
    public final wyx x;
    public wwk y;
    protected final ci z;
    public final adly h = new adly();
    public final Runnable m = new wvr(this, 12);

    public xbi(advb advbVar, wyx wyxVar, vxe vxeVar, acyx acyxVar, ci ciVar, xgn xgnVar, Handler handler, awmd awmdVar, View view) {
        this.C = vxeVar;
        this.b = view;
        this.D = advbVar;
        this.E = acyxVar;
        this.z = ciVar;
        this.j = xgnVar;
        this.x = wyxVar;
        this.i = handler;
        this.k = awmdVar;
        LiveChatBannerContainerLayout liveChatBannerContainerLayoutR = r();
        this.c = liveChatBannerContainerLayoutR;
        ViewGroup viewGroupM = m();
        this.A = viewGroupM;
        this.e = q();
        this.d = p();
        this.f = l();
        this.B = n();
        this.g = o();
        viewGroupM.setOnClickListener(this);
        liveChatBannerContainerLayoutR.c = new xxj(this, null);
        this.v = a;
        advbVar.b(amqm.class);
    }

    private final void w(boolean z) {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.p.end();
        }
        LiveChatBannerContainerLayout liveChatBannerContainerLayout = this.c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(liveChatBannerContainerLayout, (Property<LiveChatBannerContainerLayout, Float>) View.TRANSLATION_Y, liveChatBannerContainerLayout.getTranslationY(), liveChatBannerContainerLayout.b ? liveChatBannerContainerLayout.getHeight() : -liveChatBannerContainerLayout.getHeight());
        this.p = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.p.addListener(new xbg(this, z));
        this.p.start();
    }

    @Override // defpackage.wyw
    public final int a() {
        return 0;
    }

    @Override // defpackage.xbb
    public final void b(CharSequence charSequence) {
        this.f.setContentDescription(charSequence);
    }

    @Override // defpackage.wxk
    public final void c() {
        e();
        this.i.removeCallbacks(this.m);
        this.y = null;
        this.r = ((vxz) this.k.io()).m(12, 45756228L);
        ajwo ajwoVar = this.u;
        if (ajwoVar != null) {
            this.C.c(ajwoVar, null);
        }
        this.o = null;
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.p = null;
        adma admaVar = this.F;
        if (admaVar != null) {
            admaVar.b((admh) this.D.io());
            this.F = null;
        }
        this.A.setVisibility(0);
        this.l = null;
    }

    @Override // defpackage.wxk
    public void d(amno amnoVar) {
        throw null;
    }

    @Override // defpackage.wxk
    public final void e() {
        if (this.q) {
            w(true);
        }
    }

    @Override // defpackage.wxk
    public final void g(ajwo ajwoVar) {
        if (this.q) {
            this.f.removeAllViews();
            this.h.f("live_chat_item_action", ajwoVar);
            u(this.o);
            t();
        }
    }

    @Override // defpackage.wxs
    public final void h() {
        v(false);
    }

    @Override // defpackage.wyw
    public final void i() {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.p.end();
        }
        LiveChatBannerContainerLayout liveChatBannerContainerLayout = this.c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(liveChatBannerContainerLayout, (Property<LiveChatBannerContainerLayout, Float>) View.TRANSLATION_Y, liveChatBannerContainerLayout.b ? liveChatBannerContainerLayout.getHeight() : -liveChatBannerContainerLayout.getHeight(), 0.0f);
        this.p = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.p.addListener(new xbh(this));
        this.p.start();
        boolean zM = ((vxz) this.k.io()).m(12, 45756228L);
        if (this.r) {
            ViewGroup viewGroup = this.A;
            if (zM) {
                viewGroup.setBackgroundResource(R.drawable.live_chat_banner_container_background_collapsed);
            } else {
                viewGroup.setBackgroundResource(R.drawable.live_chat_banner_container_background_collapsed_inverse);
            }
        } else {
            ViewGroup viewGroup2 = this.A;
            if (zM) {
                viewGroup2.setBackgroundResource(R.drawable.live_chat_banner_container_background_expanded);
            } else {
                viewGroup2.setBackgroundResource(R.drawable.live_chat_banner_container_background_expanded_inverse);
            }
        }
        this.i.postDelayed(this.m, this.v.toMillis());
        wwk wwkVar = this.y;
        if (wwkVar != null) {
            wwkVar.e();
        }
    }

    @Override // defpackage.wxk
    public final void j(wwk wwkVar) {
        this.y = wwkVar;
    }

    @Override // defpackage.wyw
    public final void jm() {
        this.i.removeCallbacks(this.m);
        w(false);
    }

    protected abstract ViewGroup l();

    protected abstract ViewGroup m();

    protected abstract ViewGroup n();

    protected abstract ViewGroup o();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.d) {
            this.C.a(this.n);
        } else {
            v(false);
        }
    }

    protected abstract ImageButton p();

    protected abstract TextView q();

    protected abstract LiveChatBannerContainerLayout r();

    public final void s() {
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        tym.h(this.f, new tyi((!this.s || this.r) ? 0 : this.b.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_content_bottom_margin), 1), ViewGroup.MarginLayoutParams.class);
        if (this.s) {
            dimensionPixelOffset = this.b.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_padding_start);
            dimensionPixelOffset2 = this.b.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_padding_end);
        } else {
            dimensionPixelOffset = 0;
            dimensionPixelOffset2 = 0;
        }
        this.A.setPaddingRelative(dimensionPixelOffset, 0, dimensionPixelOffset2, 0);
    }

    public final void t() {
        this.i.postDelayed(this.m, this.v.toMillis());
        wwk wwkVar = this.y;
        if (wwkVar != null) {
            wwkVar.e();
        }
    }

    public final void u(apji apjiVar) {
        Object objC;
        if (apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                acyx acyxVar = this.E;
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                objC = acyxVar.c((akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK)));
            } else {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ampf.a);
                apjiVar.c(aihlVarCheckIsLite3);
                Object objK2 = apjiVar.j.k(aihlVarCheckIsLite3.d);
                objC = objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2);
            }
            adma admaVarE = adul.e((admh) this.D.io(), objC, (ViewGroup) this.b);
            this.F = admaVarE;
            if (admaVarE != null) {
                admaVarE.hU(this.h, objC);
                this.f.addView(this.F.a());
            }
        }
    }

    public final void v(boolean z) {
        if ((z && this.r) || this.w) {
            return;
        }
        boolean z2 = true;
        if (!z && this.r) {
            z2 = false;
        }
        this.r = z2;
        this.i.removeCallbacks(this.m);
        ViewGroup viewGroup = this.f;
        viewGroup.removeAllViews();
        this.h.f("render_content_collapsed", Boolean.valueOf(this.r));
        awmd awmdVar = this.k;
        if (!((vxz) awmdVar.io()).m(12, 45756228L)) {
            dsi dsiVar = new dsi();
            dsiVar.O(new drn());
            dsiVar.O(new drp());
            dsiVar.P(0);
            LiveChatBannerContainerLayout liveChatBannerContainerLayout = this.c;
            dsiVar.E(liveChatBannerContainerLayout);
            dsiVar.E(this.g);
            dsiVar.E(this.B);
            dsiVar.E(this.e);
            dsiVar.E(this.A);
            dsiVar.E(viewGroup);
            dse.b(liveChatBannerContainerLayout, dsiVar);
        }
        TextView textView = this.e;
        textView.setVisibility((this.r || textView.length() == 0) ? 8 : 0);
        u(this.o);
        s();
        if (this.r) {
            boolean zM = ((vxz) awmdVar.io()).m(12, 45756228L);
            ViewGroup viewGroup2 = this.A;
            if (zM) {
                viewGroup2.setBackgroundResource(R.drawable.live_chat_banner_container_background_collapsed);
            } else {
                viewGroup2.setBackgroundResource(R.drawable.live_chat_banner_container_background_collapsed_inverse);
            }
            ajwo ajwoVar = this.t;
            if (ajwoVar != null) {
                this.C.a(ajwoVar);
            }
        } else {
            boolean zM2 = ((vxz) awmdVar.io()).m(12, 45756228L);
            ViewGroup viewGroup3 = this.A;
            if (zM2) {
                viewGroup3.setBackgroundResource(R.drawable.live_chat_banner_container_background_expanded);
            } else {
                viewGroup3.setBackgroundResource(R.drawable.live_chat_banner_container_background_expanded_inverse);
            }
            ajwo ajwoVar2 = this.u;
            if (ajwoVar2 != null) {
                this.C.a(ajwoVar2);
            }
        }
        try {
            this.A.sendAccessibilityEvent(8);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Override // defpackage.wxk
    public final void k() {
    }
}
