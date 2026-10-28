package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xcn extends xbs {
    public xcn(Context context, wxi wxiVar, awmd awmdVar, Activity activity, wyx wyxVar, tbt tbtVar, vxe vxeVar, ahgb ahgbVar, xcc xccVar, awmd awmdVar2, mbc mbcVar, tun tunVar, xpl xplVar, vxz vxzVar, xsc xscVar, ahey aheyVar, vxz vxzVar2) {
        super(context, wxiVar, awmdVar, activity, wyxVar, tbtVar, vxeVar, ahgbVar, xccVar, awmdVar2, mbcVar, tunVar, xplVar, vxzVar, xscVar, aheyVar, vxzVar2);
    }

    @Override // defpackage.xbs
    public final void x(View view, wyc wycVar) {
        super.x(view, wycVar);
        view.findViewById(R.id.emoji_picker_icon).setVisibility(4);
    }
}
