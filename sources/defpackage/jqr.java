package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqr extends nh {
    public final tbk a;
    public final adhv e;
    public final cf f;
    public final aunn g;
    public final Executor h;
    public final avmn i;
    public final aunn j;
    public final int k;
    public int l;
    public int m;
    public Optional n = Optional.empty();
    public final hwz o;

    public jqr(tbk tbkVar, adhv adhvVar, hwz hwzVar, cf cfVar, aunn aunnVar, Executor executor, avmb avmbVar, aunn aunnVar2, aunn aunnVar3) {
        this.a = tbkVar;
        this.e = adhvVar;
        this.o = hwzVar;
        this.f = cfVar;
        this.g = aunnVar;
        this.h = executor;
        this.j = aunnVar2;
        this.m = tbkVar.size();
        this.i = ((jod) aunnVar3.io()).a().L(avmbVar).N().p().al(new jqi(this, 2), new jop(3));
        this.k = ((vxz) aunnVar2.io()).l(118, 45823962L, false) ? cfVar.getResources().getDimensionPixelSize(R.dimen.item_extra_small_spacing) : cfVar.getResources().getDimensionPixelSize(R.dimen.watch_fragment_corner_radius_minimized);
    }

    @Override // defpackage.nh
    public final int a() {
        return ((vxz) this.j.io()).l(85, 45746502L, false) ? this.m : this.a.size();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return new jqq(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.swipeable_mini_player_item_container, viewGroup, false));
    }

    @Override // defpackage.nh
    public final /* synthetic */ void o(oh ohVar, int i) {
        aqmh aqmhVarE;
        String strG;
        String strH;
        jqq jqqVar = (jqq) ohVar;
        if (i >= 0) {
            tbk tbkVar = this.a;
            if (i >= tbkVar.size() || i >= a()) {
                return;
            }
            abjr abjrVar = (abjr) tbkVar;
            hyz hyzVar = (hyz) abjrVar.get(i);
            int i2 = jqq.y;
            jqr jqrVar = jqqVar.x;
            boolean z = hyzVar instanceof hzg;
            ibh ibhVarF = jqrVar.o.f();
            if (z) {
                aqmhVarE = ((hzg) hyzVar).v(ibhVarF).g;
                if (aqmhVarE == null) {
                    aqmhVarE = aqmh.a;
                }
            } else {
                aqmhVarE = hyzVar instanceof hyw ? ((hyw) hyzVar).e() : null;
            }
            if (aqmhVarE != null) {
                View view = jqqVar.s;
                aqmg aqmgVarK = aawb.K(aqmhVarE, view.getResources().getDisplayMetrics().widthPixels, view.getResources().getDisplayMetrics().heightPixels);
                if (aqmgVarK != null) {
                    aihh aihhVar = (aihh) aqmhVarE.toBuilder();
                    aihhVar.copyOnWrite();
                    ((aqmh) aihhVar.instance).c = aqmh.emptyProtobufList();
                    aihhVar.r(aqmgVarK);
                    aqmhVarE = (aqmh) aihhVar.build();
                }
            }
            if (aqmhVarE != null) {
                jqqVar.u.f(aqmhVarE, null);
            }
            hyz hyzVar2 = (hyz) abjrVar.get(i);
            if (hyzVar2 instanceof hyw) {
                hyw hywVar = (hyw) hyzVar2;
                strH = hywVar.h();
                strG = hywVar.g();
            } else if (hyzVar2 instanceof hzg) {
                hzg hzgVar = (hzg) hyzVar2;
                strH = hzgVar.h();
                strG = hzgVar.g();
            } else {
                strG = null;
                strH = null;
            }
            if (jqrVar.n.isPresent()) {
                strG = (String) jqrVar.n.get();
            }
            cf cfVar = jqrVar.f;
            yco ycoVar = ((ycp) jqrVar.g.io()).e;
            TextView textView = jqqVar.v;
            TextView textView2 = jqqVar.w;
            joe joeVarA = joe.a(cfVar, ycoVar, textView, textView2, typ.c(strH), typ.c(strG));
            textView.setText(ackj.k(null, joeVarA.a, null, false));
            textView2.setText(joeVarA.b);
            jqqVar.C();
        }
    }
}
