package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatSwipeableContainerLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyj extends xbw {
    public final boolean a;

    public wyj(Context context, aduv aduvVar, adhv adhvVar, vxe vxeVar, ahey aheyVar, wxi wxiVar, ci ciVar, wyx wyxVar, wbz wbzVar, ahgb ahgbVar, adsa adsaVar, vxz vxzVar, View view, xgn xgnVar) {
        Context context2;
        Context contextThemeWrapper;
        if (vxzVar.m(12, 45756228L)) {
            context2 = context;
            contextThemeWrapper = new ContextThemeWrapper(context2, svy.a(context) ? R.style.Themed_YouTube_LiveChat_Dark_DarkerPalette : vxzVar.m(21, 45787845L) ? R.style.Themed_YouTube_LiveChat_Light_ImprovedVisibility : R.style.Themed_YouTube_LiveChat_Light_DarkerPalette);
        } else {
            context2 = context;
            contextThemeWrapper = context2;
        }
        super(contextThemeWrapper, aduvVar, adhvVar, vxeVar, aheyVar, wxiVar, ciVar, wyxVar, wbzVar, ahgbVar, adsaVar, vxzVar, view, xgnVar);
        this.a = svy.a(context2);
    }

    @Override // defpackage.xbw, defpackage.wyw
    public final int a() {
        return 1;
    }

    @Override // defpackage.xbw
    protected final ViewGroup d() {
        return (ViewGroup) this.n.findViewById(R.id.poll_choices_container);
    }

    @Override // defpackage.xbw
    protected final ImageButton e() {
        return (ImageButton) this.n.findViewById(R.id.live_chat_poll_context_menu_toggle);
    }

    @Override // defpackage.xbw
    protected final ImageView g() {
        return (ImageView) this.n.findViewById(R.id.poll_question_thumbnail);
    }

    @Override // defpackage.xbw
    protected final ImageView h() {
        return (ImageView) this.n.findViewById(R.id.poll_thumbnail);
    }

    @Override // defpackage.xbw
    protected final TextView j() {
        return (TextView) this.n.findViewById(R.id.poll_metadata_text);
    }

    @Override // defpackage.xbw
    protected final TextView k() {
        return (TextView) this.n.findViewById(R.id.poll_question_subtext);
    }

    @Override // defpackage.xbw
    protected final TextView l() {
        return (TextView) this.n.findViewById(R.id.poll_question_text);
    }

    @Override // defpackage.xbw
    protected final LiveChatSwipeableContainerLayout m() {
        return (LiveChatSwipeableContainerLayout) this.o.findViewById(R.id.live_chat_poll_container);
    }

    @Override // defpackage.xbw
    protected final xcs n() {
        return this.w.m(12, 45756228L) ? new xcs(R.drawable.live_chat_modern_action_panel_background, R.attr.ytTextPrimary, R.attr.ytTextPrimary, R.attr.ytTextPrimary) : new xcs(R.drawable.live_chat_modern_action_panel_background_old, R.attr.ytBaseBackground, R.attr.ytBaseBackground, R.attr.ytBaseBackground);
    }

    @Override // defpackage.xbw
    public final void o() {
        LiveChatSwipeableContainerLayout liveChatSwipeableContainerLayoutM = m();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) liveChatSwipeableContainerLayoutM.getLayoutParams();
        if (layoutParams != null) {
            int dimensionPixelSize = liveChatSwipeableContainerLayoutM.getResources().getDimensionPixelSize(R.dimen.live_chat_modern_polls_margin);
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, liveChatSwipeableContainerLayoutM.getResources().getDimensionPixelSize(R.dimen.live_chat_modern_polls_margin_bottom));
            liveChatSwipeableContainerLayoutM.setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.xbw
    protected final void p() {
    }
}
