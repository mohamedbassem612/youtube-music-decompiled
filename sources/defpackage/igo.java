package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class igo extends igl implements View.OnClickListener {
    public vxe k;
    public xgm l;

    private final xgn o() {
        return this.l.hB();
    }

    private final void p(xhc xhcVar) {
        o().l(new xgj(xhcVar));
    }

    @Override // defpackage.qnw
    protected final int i() {
        return 2;
    }

    @Override // defpackage.qnw
    protected final AdapterView.OnItemClickListener j() {
        return null;
    }

    @Override // defpackage.qnw
    protected final /* bridge */ /* synthetic */ ListAdapter k() {
        return null;
    }

    @Override // defpackage.qnw
    protected final String l() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        super.iQ(false, false, false);
        if (view.getId() == R.id.dismiss) {
            o().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(93461)), null);
            return;
        }
        if (view.getId() == R.id.settings) {
            vxe vxeVar = this.k;
            aihh aihhVar = (aihh) ajwo.a.createBuilder();
            aihl aihlVar = aoaq.b;
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
            aoarVar.b |= 2;
            aoarVar.d = 20135;
            aihhVar.e(aihlVar, (aoar) aihfVarCreateBuilder.build());
            aihl aihlVar2 = ajfd.a;
            aihf aihfVarCreateBuilder2 = ajfc.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ajfc ajfcVar = (ajfc) aihfVarCreateBuilder2.instance;
            ajfcVar.b |= 8;
            ajfcVar.d = "music_settings_data_saving";
            aihhVar.e(aihlVar2, (ajfc) aihfVarCreateBuilder2.build());
            vxeVar.a((ajwo) aihhVar.build());
        }
    }

    @Override // defpackage.qnw, defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.stream_wifi_only_bottom_sheet, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.settings);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dismiss);
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        return viewInflate;
    }

    @Override // defpackage.qnw, defpackage.bp, defpackage.cc
    public final void onStart() {
        Window window;
        Dialog dialog;
        Window window2;
        super.onStart();
        if (Build.VERSION.SDK_INT >= 29 && (dialog = this.f) != null && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(Integer.MIN_VALUE);
            window2.getDecorView().setSystemUiVisibility(1792);
            View viewFindViewById = dialog.findViewById(R.id.container);
            if (viewFindViewById != null) {
                viewFindViewById.setFitsSystemWindows(false);
            }
            View decorView = window2.getDecorView();
            bcs bcsVar = new bcs(window2, 3);
            int i = bac.a;
            azs.c(decorView, bcsVar);
            window2.getDecorView().requestApplyInsets();
        }
        Dialog dialog2 = this.f;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.ytm_theme_main_color_primary);
        }
        p(xhb.b(93462));
        p(xhb.b(93461));
        p(xhb.b(20135));
    }
}
