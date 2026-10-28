package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hyd extends hxx implements AdapterView.OnItemClickListener {
    public abvn k;
    public igk l;
    public hbf m;
    private qnv n;

    public static hyd o(cf cfVar) {
        cc ccVarG = cfVar.getSupportFragmentManager().g("SLEEP_TIMER_MENU_BOTTOM_SHEET_FRAGMENT");
        return ccVarG != null ? (hyd) ccVarG : new hyd();
    }

    @Override // defpackage.qnw
    protected final int i() {
        return 2;
    }

    @Override // defpackage.qnw
    protected final String l() {
        return this.m.d();
    }

    @Override // defpackage.qnw, defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.tinted_title_bottom_sheet_list_view, viewGroup, false);
        AdapterView adapterView = (AdapterView) viewInflate.findViewById(R.id.bottom_sheet_list_view);
        qnv qnvVarK = k();
        this.n = qnvVarK;
        adapterView.setAdapter(qnvVarK);
        adapterView.setOnItemClickListener(this);
        ((TextView) viewInflate.findViewById(R.id.bottom_sheet_title)).setText(l());
        return viewInflate;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        qnv qnvVar = this.n;
        qnvVar.getClass();
        hxu hxuVar = (hxu) qnvVar.getItem(i);
        if (hxuVar != null) {
            if (hxuVar.a) {
                igk igkVar = hxuVar.c;
                if (igkVar.i()) {
                    igkVar.e();
                    igkVar.f(igi.c);
                    igkVar.b.f();
                    igkVar.h.o(igkVar.d);
                    if (igkVar.g.l(115, 45819408L, false)) {
                        igkVar.f.a(igkVar.e);
                    }
                }
            } else {
                Duration duration = hxuVar.b;
                if (duration != null) {
                    hxuVar.c.g(duration);
                }
            }
        }
        super.iQ(false, false, false);
    }

    public final void p(cf cfVar) {
        if (isAdded() || isVisible()) {
            return;
        }
        h(cfVar.getSupportFragmentManager(), "SLEEP_TIMER_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qnw
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final qnv k() {
        qnv qnvVar = new qnv(requireContext());
        qnvVar.add(new hxu(requireContext(), false, Duration.ofMinutes(5L), getResources().getQuantityString(R.plurals.menu_option_minutes, 5, 5), this.l));
        qnvVar.add(new hxu(requireContext(), false, Duration.ofMinutes(15L), getResources().getQuantityString(R.plurals.menu_option_minutes, 15, 15), this.l));
        qnvVar.add(new hxu(requireContext(), false, Duration.ofMinutes(30L), getResources().getQuantityString(R.plurals.menu_option_minutes, 30, 30), this.l));
        qnvVar.add(new hxu(requireContext(), false, Duration.ofMinutes(60L), getResources().getQuantityString(R.plurals.menu_option_hours, 1, 1), this.l));
        if (this.l.i()) {
            abvk abvkVarO = this.k.o();
            acfw acfwVarH = abvkVarO.h();
            int i = R.string.end_of_song;
            if (acfwVarH != null && abvkVarO.h().c() != null && hna.y(abvkVarO.h().c())) {
                i = R.string.end_of_episode;
            }
            qnvVar.add(new hxu(requireContext(), true, null, getResources().getString(i), this.l));
        }
        return qnvVar;
    }

    @Override // defpackage.qnw
    protected final AdapterView.OnItemClickListener j() {
        return this;
    }
}
