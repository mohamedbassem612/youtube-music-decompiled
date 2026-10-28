package defpackage;

import android.content.Context;
import android.os.Parcelable;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ixd extends adsv implements jal {
    private static final agrf i = agrf.h("com/google/android/apps/youtube/music/ui/components/carousel/MusicPlaceholderDownloadsCarouselShelfController");
    public final tbt a;
    public final admu b;
    public final tbk c;
    public final hlj d;
    public final hpb e;
    public final anto f;
    public anlm g;
    public final kwq h;
    private final Context j;
    private final Executor k;
    private final avmn l;
    private final hpy m;
    private final Executor n;
    private Parcelable o;
    private np p;

    public ixd(Context context, tbt tbtVar, kwq kwqVar, Executor executor, Executor executor2, mbc mbcVar, adxd adxdVar, hpy hpyVar, hpb hpbVar, anto antoVar) {
        this.j = context;
        this.a = tbtVar;
        this.h = kwqVar;
        this.k = executor;
        this.n = executor2;
        this.f = antoVar;
        this.m = hpyVar;
        this.e = hpbVar;
        this.d = new hlj(mbcVar);
        if (adxdVar instanceof ixc) {
            ixc ixcVar = (ixc) adxdVar;
            this.o = ixcVar.a;
            this.c = ixcVar.b;
            this.b = ixcVar.c;
        } else {
            this.c = new tbm();
            this.b = new admu();
            f();
        }
        this.l = avlr.L(agke.r(hpyVar.f(anjx.class), hpyVar.f(anuk.class))).ag(new iwb(this, 3), new ido(13));
        tbtVar.f(this);
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.b;
    }

    @Override // defpackage.jal
    public final void b(np npVar) {
        Parcelable parcelable;
        this.p = npVar;
        if (npVar != null && (parcelable = this.o) != null) {
            npVar.onRestoreInstanceState(parcelable);
        }
        this.o = null;
    }

    @Override // defpackage.jal
    public final void c() {
        np npVar = this.p;
        this.o = npVar == null ? null : npVar.onSaveInstanceState();
        this.p = null;
    }

    public final void f() {
        ahno.O(this.b.isEmpty());
        hpy hpyVar = this.m;
        anlm anlmVar = anlm.a;
        afxd afxdVarF = afxd.f(hpyVar.a(kro.aq()));
        isv isvVar = new isv(this, 18);
        Executor executor = this.n;
        afxd afxdVarH = afxdVarF.h(isvVar, executor);
        aihf aihfVarCreateBuilder = anll.a.createBuilder();
        alay alayVarD = ackj.d(this.j.getString(R.string.from_your_downloads));
        aihfVarCreateBuilder.copyOnWrite();
        anll anllVar = (anll) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anllVar.c = alayVarD;
        anllVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anll anllVar2 = (anll) aihfVarCreateBuilder.instance;
        int i2 = 3;
        anllVar2.h = 3;
        anllVar2.b |= 16;
        ajwo ajwoVarB = vxh.b("FEmusic_offline");
        aihfVarCreateBuilder.copyOnWrite();
        anll anllVar3 = (anll) aihfVarCreateBuilder.instance;
        ajwoVarB.getClass();
        anllVar3.f = ajwoVarB;
        anllVar3.b |= 8;
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihl aihlVar = aliy.a;
        aihf aihfVarCreateBuilder2 = alix.a.createBuilder();
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.CHEVRON_RIGHT;
        aihhVar2.copyOnWrite();
        alja aljaVar = (alja) aihhVar2.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        alix alixVar = (alix) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar2.build();
        aljaVar2.getClass();
        alixVar.d = aljaVar2;
        alixVar.b |= 2;
        aihhVar.e(aihlVar, (alix) aihfVarCreateBuilder2.build());
        apji apjiVar = (apji) aihhVar.build();
        aihfVarCreateBuilder.copyOnWrite();
        anll anllVar4 = (anll) aihfVarCreateBuilder.instance;
        apjiVar.getClass();
        aiie aiieVar = anllVar4.g;
        if (!aiieVar.c()) {
            anllVar4.g = aihn.mutableCopy(aiieVar);
        }
        anllVar4.g.add(apjiVar);
        taf.i(ahno.ar(afxdVarH, new hco(this, anlmVar, (anll) aihfVarCreateBuilder.build(), 4, (char[]) null), executor), this.k, new iul(i2), new ixb(this, 0), null);
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        Object obj = vvtVar.a;
        if (obj instanceof anzn) {
            tbk tbkVar = this.c;
            if (tbkVar.contains(obj)) {
                return;
            }
            if (kro.J(this.g.d, (anzn) obj)) {
                tbkVar.add(tbkVar.size(), obj);
            }
            anlm anlmVar = this.g;
            if (anlmVar == null || anlmVar.d.size() != tbkVar.size()) {
                return;
            }
            this.b.clear();
            tbkVar.clear();
        }
    }

    @tcc
    public void handleShowEnclosingEvent(gsj gsjVar) {
        Optional optional = (Optional) gsjVar.e;
        if (optional.isPresent() && (optional.get() instanceof anzn)) {
            tbk tbkVar = this.c;
            if (tbkVar.indexOf(optional.get()) != -1) {
                tbkVar.remove(tbkVar.indexOf(optional.get()));
            }
        }
    }

    @Override // defpackage.adsv, defpackage.advw
    public final adxd hq() {
        tbm tbmVar = new tbm();
        tbk tbkVar = this.c;
        tbmVar.addAll(0, tbkVar.subList(0, tbkVar.size()));
        np npVar = this.p;
        return new ixc(npVar == null ? null : npVar.onSaveInstanceState(), tbmVar, this.b);
    }

    @Override // defpackage.adsv, defpackage.twn
    public final void i() {
        this.o = null;
        this.c.clear();
        this.a.l(this);
        avnr.b((AtomicReference) this.l);
    }
}
