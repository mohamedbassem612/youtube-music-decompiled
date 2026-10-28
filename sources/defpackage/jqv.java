package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqv extends nh {
    public final tbk a;
    public final adhv e;
    public final aunn f;
    public final aunn g;
    public final cf h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public boolean m;
    public View n;
    public final kjc o;
    public final hwz p;

    public jqv(tbk tbkVar, cf cfVar, adhv adhvVar, hwz hwzVar, aunn aunnVar, aunn aunnVar2, kjc kjcVar) {
        this.a = tbkVar;
        this.e = adhvVar;
        this.p = hwzVar;
        this.h = cfVar;
        this.g = aunnVar;
        this.f = aunnVar2;
        this.o = kjcVar;
        this.l = tbkVar.size();
        this.i = cfVar.getResources().getDimensionPixelSize(R.dimen.watch_fragment_corner_radius_maximized_large);
        this.j = cfVar.getResources().getDimensionPixelSize(R.dimen.watch_fragment_corner_radius_maximized_medium);
    }

    @Override // defpackage.nh
    public final int a() {
        return ((vxz) this.f.io()).l(85, 45746502L, false) ? this.l : this.a.size();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return new jqt(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.swipeable_thumbnail_item_container, viewGroup, false));
    }

    @Override // defpackage.nh
    public final /* synthetic */ void o(oh ohVar, int i) {
        aqmh aqmhVarE;
        jqt jqtVar = (jqt) ohVar;
        if (i >= 0) {
            tbk tbkVar = this.a;
            if (i >= tbkVar.size() || i >= a()) {
                return;
            }
            hyz hyzVar = (hyz) ((abjr) tbkVar).get(i);
            int i2 = jqt.x;
            jqv jqvVar = jqtVar.w;
            boolean z = hyzVar instanceof hzg;
            ibh ibhVarF = jqvVar.p.f();
            if (z) {
                aqmhVarE = ((hzg) hyzVar).v(ibhVarF).g;
                if (aqmhVarE == null) {
                    aqmhVarE = aqmh.a;
                }
            } else {
                aqmhVarE = hyzVar instanceof hyw ? ((hyw) hyzVar).e() : null;
            }
            boolean z2 = false;
            if (aqmhVarE != null) {
                View view = jqtVar.s;
                aqmg aqmgVarK = aawb.K(aqmhVarE, view.getResources().getDisplayMetrics().widthPixels, view.getResources().getDisplayMetrics().heightPixels);
                if (aqmgVarK != null) {
                    aihh aihhVar = (aihh) aqmhVarE.toBuilder();
                    aihhVar.copyOnWrite();
                    ((aqmh) aihhVar.instance).c = aqmh.emptyProtobufList();
                    aihhVar.r(aqmgVarK);
                    aqmhVarE = (aqmh) aihhVar.build();
                    int i3 = aqmgVarK.e;
                    if (i3 > 0 && aqmgVarK.d / i3 > 1.2f) {
                        z2 = true;
                    }
                }
            }
            if (aqmhVarE != null) {
                jqtVar.u.f(aqmhVarE, null);
            }
            jqtVar.v = z2;
            jqtVar.D(new jqu(((hfn) jqvVar.g.io()).x(), jqvVar.m));
            jqtVar.C(this.k);
        }
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void p(oh ohVar, int i, List list) {
        jqt jqtVar = (jqt) ohVar;
        Iterator it = list.iterator();
        jqu jquVar = null;
        jqu jquVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                jquVar = jquVar2;
                break;
            }
            Object next = it.next();
            if (!(next instanceof jqu)) {
                break;
            } else {
                jquVar2 = (jqu) next;
            }
        }
        if (jquVar == null) {
            o(jqtVar, i);
            return;
        }
        int i2 = this.k;
        int i3 = jqt.x;
        jqtVar.C(i2);
        jqtVar.D(jquVar);
    }

    public final void z(int i) {
        if (this.k != i) {
            this.k = i;
            jW();
        }
    }
}
