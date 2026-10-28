package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hye extends hxy {
    public TextView k;
    public avmb l;
    public avmb m;
    public abvn n;
    public igk o;
    public hbf p;
    public jij q;
    private avmn s;
    private avmn t;

    public static hye o(cf cfVar) {
        cc ccVarG = cfVar.getSupportFragmentManager().g("SLEEP_TIMER_STATUS_BOTTOM_SHEET_FRAGMENT");
        return ccVarG != null ? (hye) ccVarG : new hye();
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
        return this.p.d();
    }

    @Override // defpackage.qnw, defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.timer_status_bottom_sheet, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.until_end_of_track_message);
        ((TextView) viewInflate.findViewById(R.id.bottom_sheet_title)).setText(l());
        tuk.l(textView, this.o.a() == igi.c);
        anzw anzwVar = anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
        abvk abvkVarO = this.n.o();
        if (abvkVarO.h() != null && abvkVarO.h().c() != null) {
            alvw alvwVar = abvkVarO.h().c().u().g;
            if (alvwVar == null) {
                alvwVar = alvw.a;
            }
            anzw anzwVarA = anzw.a(alvwVar.p);
            if (anzwVarA != null) {
                anzwVar = anzwVarA;
            }
        }
        textView.setText(true != igs.c(anzwVar) ? R.string.end_of_current_song : R.string.end_of_current_episode);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.cancel);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.add_five);
        View viewFindViewById = viewInflate.findViewById(R.id.cancel_container);
        View viewFindViewById2 = viewInflate.findViewById(R.id.add_five_container);
        ajnf ajnfVar = ajnf.a;
        aihh aihhVar = (aihh) ajnfVar.createBuilder();
        alay alayVarD = ackj.d(getResources().getString(R.string.add_five_minutes));
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alayVarD.getClass();
        ajnfVar2.m = alayVarD;
        ajnfVar2.b |= 64;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.i = 3;
        ajnfVar3.b |= 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar.instance;
        ajnfVar4.d = 2;
        ajnfVar4.c = 1;
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.ADD;
        aihhVar2.copyOnWrite();
        alja aljaVar = (alja) aihhVar2.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar.instance;
        alja aljaVar2 = (alja) aihhVar2.build();
        aljaVar2.getClass();
        ajnfVar5.f = aljaVar2;
        ajnfVar5.e = 8;
        ajnf ajnfVar6 = (ajnf) aihhVar.build();
        aihh aihhVar3 = (aihh) ajnfVar.createBuilder();
        alay alayVarD2 = ackj.d(getResources().getString(R.string.timer_cancel));
        aihhVar3.copyOnWrite();
        ajnf ajnfVar7 = (ajnf) aihhVar3.instance;
        alayVarD2.getClass();
        ajnfVar7.m = alayVarD2;
        ajnfVar7.b |= 64;
        aihhVar3.copyOnWrite();
        ajnf ajnfVar8 = (ajnf) aihhVar3.instance;
        ajnfVar8.i = 3;
        ajnfVar8.b |= 1;
        aihhVar3.copyOnWrite();
        ajnf ajnfVar9 = (ajnf) aihhVar3.instance;
        ajnfVar9.d = 43;
        ajnfVar9.c = 1;
        ajnf ajnfVar10 = (ajnf) aihhVar3.build();
        jbm jbmVarA = this.q.a(textView3, viewFindViewById2, new hdf(this, 5), null, false);
        jbm jbmVarA2 = this.q.a(textView2, viewFindViewById, new hdf(this, 6), null, false);
        jbmVarA.hU(new adly(), ajnfVar6);
        jbmVarA2.hU(new adly(), ajnfVar10);
        tuk.l(viewFindViewById2, this.o.a() == igi.b);
        this.k = (TextView) viewInflate.findViewById(R.id.time_remaining);
        return viewInflate;
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onDestroyView() {
        avmn avmnVar = this.t;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.t);
        }
        super.onDestroyView();
    }

    @Override // defpackage.hyb, defpackage.adya, defpackage.qnw, defpackage.bp, defpackage.cc
    public final void onStart() {
        super.onStart();
        this.s = this.o.b().L(this.m).al(new hva(this, 18), new hmd(18));
    }

    @Override // defpackage.bp, defpackage.cc
    public final void onStop() {
        super.onStop();
        avmn avmnVar = this.s;
        if (avmnVar == null || avmnVar.f()) {
            return;
        }
        awka.f((AtomicReference) this.s);
    }

    public final void p(igi igiVar) {
        avmn avmnVar = this.t;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.t);
        }
        int iOrdinal = igiVar.ordinal();
        if (iOrdinal == 0) {
            super.iQ(false, false, false);
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            q();
        }
    }

    public final void q() {
        avmn avmnVar = this.t;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.t);
        }
        this.t = avlr.I(0L, 1L, TimeUnit.SECONDS, this.l).O(this.m).ag(new hva(this, 17), new hmd(18));
    }

    public final void r(cf cfVar) {
        if (isAdded() || isVisible()) {
            return;
        }
        h(cfVar.getSupportFragmentManager(), "SLEEP_TIMER_STATUS_BOTTOM_SHEET_FRAGMENT");
    }

    public final /* synthetic */ void s() {
        this.o.h();
        super.iQ(false, false, false);
    }
}
