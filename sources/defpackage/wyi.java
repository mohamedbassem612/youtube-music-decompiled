package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyi extends xag {
    private final awmd c;
    private final vxe d;

    public wyi(awmd awmdVar, Context context, vxe vxeVar, aduv aduvVar, xsc xscVar, adsa adsaVar, aciz acizVar, aeda aedaVar) {
        super(context, aduvVar, xscVar, adsaVar, acizVar, aedaVar);
        awmdVar.getClass();
        this.c = awmdVar;
        vxeVar.getClass();
        this.d = vxeVar;
        int dimensionPixelOffset = this.b.getDimensionPixelOffset(R.dimen.live_chat_vem_margin_vertical);
        int dimensionPixelOffset2 = this.b.getDimensionPixelOffset(R.dimen.live_chat_vem_margin_horizontal);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.a.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.xag
    public final vxe d() {
        return this.d;
    }

    @Override // defpackage.xag
    public final Map e() {
        HashMap map = new HashMap();
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", (wwn) this.c.io());
        return map;
    }

    @Override // defpackage.xag
    public final int f(aciz acizVar) {
        return acizVar.C() ? R.layout.live_chat_light_overlay_viewer_engagement_message_modern_type : R.layout.live_chat_light_overlay_viewer_engagement_message;
    }
}
