package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.youtube.music.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gdr extends gds implements View.OnClickListener, rpq, rpr {
    public View k;
    public final admu l = new admu();
    public tnh m;
    public rpq n;
    public xgn o;
    public ajwo p;
    public int q;
    public int r;
    public gdt s;
    public ci t;
    public kyr u;

    @Override // defpackage.rpq
    public final void i(wnq wnqVar) {
        rpq rpqVar = this.n;
        if (rpqVar != null) {
            rpqVar.i(wnqVar);
        }
        super.iQ(false, false, false);
    }

    @Override // defpackage.rpr
    public final void j(wnr wnrVar) {
        Intent intent = wnrVar.a;
        if (intent != null) {
            afwl.m(requireActivity(), intent);
        } else {
            k();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zwb] */
    public final void k() {
        this.l.clear();
        tuk.l(this.k, true);
        rqo rqoVar = new rqo(this, 1);
        this.m = rqoVar;
        kyr kyrVar = this.u;
        ?? r1 = kyrVar.b;
        ((rlw) kyrVar.a).a(r1.u() ? (rlt) r1.e() : null, rqoVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    /* JADX INFO: renamed from: onCreate */
    public final void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m658lambda$performCreate$3$androidsupportv4appFragment(bundle);
        iO(0, this.r);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.o.b(xhb.a(14586), this.p, null);
        View viewInflate = layoutInflater.inflate(this.q, viewGroup, false);
        Toolbar toolbar = (Toolbar) viewInflate.findViewById(R.id.toolbar);
        toolbar.C();
        toolbar.s(this);
        toolbar.setBackgroundColor(requireContext().getColor(R.color.black_header_color));
        ListView listView = (ListView) viewInflate.findViewById(R.id.account_list);
        this.k = viewInflate.findViewById(R.id.accounts_loading);
        gdt gdtVar = this.s;
        gdtVar.a = new WeakReference(this);
        gdtVar.b = new WeakReference(this);
        this.s.b(wnt.class);
        adln adlnVarAi = this.t.ai(this.s.c);
        adlnVarAi.jR(new adlk(this.o, 0));
        adlnVarAi.h(this.l);
        listView.setAdapter((ListAdapter) adlnVarAi);
        k();
        return viewInflate;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        this.l.clear();
        this.k = null;
        super.onDestroyView();
    }

    @Override // defpackage.cc
    public final void onPause() {
        super.onPause();
        super.iQ(false, false, false);
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.f;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(R.style.SlideUpDownAnimation);
        window.setTitle(getResources().getString(R.string.account_switcher_header_title));
        window.setStatusBarColor(requireContext().getColor(R.color.black_header_color));
        window.setNavigationBarColor(window.getStatusBarColor());
    }
}
