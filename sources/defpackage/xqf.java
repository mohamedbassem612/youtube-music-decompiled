package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xqf extends xqa {
    public xqe a;

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        setHasOptionsMenu(true);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        xqe xqeVar = this.a;
        View viewInflate = layoutInflater.inflate(R.layout.mdx_pair_with_tv_fragment, viewGroup, false);
        xqeVar.h = viewInflate.getContext();
        xqeVar.w = new Handler(Looper.getMainLooper());
        xqeVar.g = xqeVar.e;
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(amzf.a, amze.a);
        xqeVar.g.b(xhb.a(27846), (ajwo) aihhVar.build(), null);
        xqeVar.i = (ScrollView) viewInflate;
        xqeVar.j = (TextView) viewInflate.findViewById(R.id.header);
        xqeVar.k = (LinearLayout) viewInflate.findViewById(R.id.available_tv_container);
        xqeVar.l = new ArrayList(10);
        xqeVar.m = new xpr(xqeVar, 2);
        xqeVar.n = viewInflate.findViewById(R.id.no_tvs_found_title);
        xqeVar.o = (TextView) viewInflate.findViewById(R.id.no_tvs_found_summary);
        xqeVar.p = (TextView) viewInflate.findViewById(R.id.no_tvs_found_button);
        xqeVar.p.setOnClickListener(new xpr(xqeVar, 3));
        xqeVar.q = (TextView) viewInflate.findViewById(R.id.enter_tv_code_text_field);
        xqeVar.r = viewInflate.findViewById(R.id.tv_code);
        xqeVar.r.setOnClickListener(new xpr(xqeVar, 4));
        xqeVar.s = viewInflate.findViewById(R.id.delete_tv_codes_separator);
        xqeVar.t = viewInflate.findViewById(R.id.delete_tv_codes_title);
        xqeVar.t.setOnClickListener(new xpr(xqeVar, 5));
        viewInflate.findViewById(R.id.not_finding_tv_title).setOnClickListener(new xpr(xqeVar, 6));
        xqeVar.g.l(new xgj(xhb.b(27852)));
        return viewInflate;
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        xqe xqeVar = this.a;
        xqeVar.d.L();
        if (xqeVar.u == null) {
            xqeVar.u = new xqd(xqeVar);
        }
        avg.f(xqeVar.h, xqeVar.u, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, 4);
        xqeVar.d();
        ((dij) xqeVar.b.io()).p(xqeVar.c, xqeVar.x, 1);
        xqeVar.c();
    }

    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        xqe xqeVar = this.a;
        xqeVar.h.unregisterReceiver(xqeVar.u);
        ((dij) xqeVar.b.io()).q(xqeVar.x);
        xqeVar.d.M();
    }
}
