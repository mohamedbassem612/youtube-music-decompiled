package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatSwipeableContainerLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class wvx implements wxk, wyw {
    protected final View a;
    public final avlw b;
    public final adly c = new adly();
    public final acyx d;
    public final advb e;
    public final xgn f;
    public adma g;
    public String h;
    public final wyx i;
    public wwk j;
    public final ci k;

    /* JADX WARN: Type inference failed for: r2v2, types: [avlw, java.lang.Object] */
    public wvx(acyx acyxVar, advb advbVar, ci ciVar, xgn xgnVar, wyx wyxVar, xsc xscVar, View view) {
        this.d = acyxVar;
        this.e = advbVar;
        this.k = ciVar;
        this.f = xgnVar;
        this.i = wyxVar;
        this.a = view;
        advbVar.b(amqm.class);
        this.b = xscVar.b;
    }

    private final void l(boolean z) {
        if (b().getVisibility() == 8 || b().getChildCount() == 0) {
            return;
        }
        b().setVisibility(8);
        if (z) {
            b().removeAllViews();
            this.i.a(this);
            wwk wwkVar = this.j;
            if (wwkVar != null) {
                wwkVar.d();
            }
        }
    }

    @Override // defpackage.wyw
    public final int a() {
        return 0;
    }

    protected abstract LiveChatSwipeableContainerLayout b();

    @Override // defpackage.wxk
    public final void c() {
        if (b() != null) {
            e();
        }
        adma admaVar = this.g;
        if (admaVar != null) {
            admaVar.b((admh) this.e.io());
            this.g = null;
        }
        this.b.kk(Boolean.FALSE);
        this.h = null;
    }

    @Override // defpackage.wxk
    public void d(amno amnoVar) {
        throw null;
    }

    @Override // defpackage.wxk
    public final void e() {
        l(true);
        this.b.kk(Boolean.FALSE);
    }

    @Override // defpackage.wyw
    public final void i() {
        LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayoutB = b();
        Object tag = liveChatSwipeableContainerLayoutB.getTag(R.id.live_chat_banner_intentionally_hidden_tag);
        if (tag == null || !((Boolean) tag).booleanValue()) {
            liveChatSwipeableContainerLayoutB.setVisibility(0);
        }
        wwk wwkVar = this.j;
        if (wwkVar != null) {
            wwkVar.e();
        }
    }

    @Override // defpackage.wxk
    public final void j(wwk wwkVar) {
        this.j = wwkVar;
    }

    @Override // defpackage.wyw
    public final void jm() {
        l(false);
    }

    @Override // defpackage.wxs
    public final void h() {
    }

    @Override // defpackage.wxk
    public final void k() {
    }

    @Override // defpackage.wxk
    public final void g(ajwo ajwoVar) {
    }
}
