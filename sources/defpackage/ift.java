package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ift implements SharedPreferences.OnSharedPreferenceChangeListener, abjh, abji {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/player/sequence/QueueSequencerUpdater");
    public final ifn b;
    public final jkp c;
    public final aunn d;
    public final abvn e;
    public final avlh f;
    public final avmb g;
    public final Executor h;
    public final avmm i;
    public final abvk j;
    public abjl k;
    public iqn l;
    public final vxz m;
    public final heg n;
    private final ifa o;
    private final awut p;

    public ift(ifa ifaVar, ifn ifnVar, heg hegVar, jkp jkpVar, aunn aunnVar, vxz vxzVar, abvn abvnVar, avlh avlhVar, avmb avmbVar, Executor executor, awut awutVar) {
        ifaVar.getClass();
        ifnVar.getClass();
        hegVar.getClass();
        jkpVar.getClass();
        aunnVar.getClass();
        vxzVar.getClass();
        abvnVar.getClass();
        avlhVar.getClass();
        avmbVar.getClass();
        executor.getClass();
        awutVar.getClass();
        this.o = ifaVar;
        this.b = ifnVar;
        this.n = hegVar;
        this.c = jkpVar;
        this.d = aunnVar;
        this.m = vxzVar;
        this.e = abvnVar;
        this.f = avlhVar;
        this.g = avmbVar;
        this.h = executor;
        this.p = awutVar;
        this.i = new avmm();
        this.j = abvnVar.o();
    }

    @Override // defpackage.abjh
    public final void a(int i, int i2, int i3) {
        if (this.k != null) {
            g(null, false, this.n.a == ibv.LOOP_ONE);
        }
    }

    @Override // defpackage.abjh
    public final void b(int i, int i2, int i3, int i4) {
        if (this.k != null) {
            g(null, false, this.n.a == ibv.LOOP_ONE);
        }
    }

    @Override // defpackage.abjh
    public final void c(int i, int i2, int i3) {
        if (this.k != null) {
            g(null, false, this.n.a == ibv.LOOP_ONE);
        }
    }

    public final void d() {
        abjl abjlVar = this.k;
        if (abjlVar != null) {
            abjlVar.he(this);
            abjlVar.hf(this);
        }
    }

    public final void e(List list, int i, abnl abnlVar, boolean z) {
        igd igdVar;
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                atqq.M();
            }
            abun abunVar = (abun) obj;
            if (i2 == i && (abunVar instanceof abvz) && abnlVar != null) {
                abut abutVarI = abuu.i((abvz) abunVar);
                abutVarI.b(abnlVar);
                abuu abuuVarA = abutVarI.a();
                if (abunVar instanceof igd) {
                    igd igdVar2 = (igd) abunVar;
                    igdVar = new igd(abuuVarA, igdVar2.b, igdVar2.c, 8);
                } else {
                    igdVar = new igd(abuuVarA, 0L, (abjk) null, 14);
                }
                abunVar = igdVar;
            }
            arrayList.add(abunVar);
            i2 = i3;
        }
        ifa ifaVar = this.o;
        abuk abukVarB = this.b.b();
        zj zjVarT = abuc.t();
        zjVarT.h(i);
        ifaVar.a(arrayList, abukVarB, zjVarT.f(), true, z);
    }

    public final void f() {
        abjl abjlVar = this.k;
        if (abjlVar != null) {
            abjlVar.hj(this);
            abjlVar.hk(this);
        }
    }

    public final void g(abnl abnlVar, boolean z, boolean z2) {
        awro.t(this.p, null, 0, new ifs(this, z2, abnlVar, z, null), 3);
    }

    public final boolean h() {
        return this.k == null;
    }

    @Override // defpackage.abji
    public final /* bridge */ /* synthetic */ void hp(Object obj, abjm abjmVar) {
        hyz hyzVar = (hyz) obj;
        if (h()) {
            return;
        }
        abnl abnlVarA = null;
        if (abjmVar != null && hyzVar != null) {
            abnlVarA = abjmVar.a(hyzVar);
        }
        g(abnlVarA, true, this.n.a == ibv.LOOP_ONE);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        if (h() || !awrc.c(str, this.c.b(gzj.AUTOPLAY_ENABLED))) {
            return;
        }
        g(null, false, this.n.a == ibv.LOOP_ONE);
    }
}
