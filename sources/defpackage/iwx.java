package defpackage;

import android.os.Parcelable;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iwx extends adsv implements jal {
    private final admu a;
    private final anlm b;
    private final tbt c;
    private final tbk d;
    private Parcelable e;
    private np f;

    public iwx(adxd adxdVar, tbt tbtVar, anlm anlmVar) {
        this.c = tbtVar;
        tbtVar.f(this);
        this.b = anlmVar;
        if (adxdVar instanceof iww) {
            iww iwwVar = (iww) adxdVar;
            this.e = iwwVar.a;
            this.d = iwwVar.b;
        } else {
            this.d = new tbm();
        }
        this.a = new admu();
        e(anlmVar);
    }

    private final void e(anlm anlmVar) {
        admu admuVar = this.a;
        ahno.O(admuVar.isEmpty());
        ixn ixnVar = new ixn(2, 3, false);
        if ((anlmVar.b & 64) != 0) {
            admuVar.e(new jeo(ixnVar, 1));
        } else {
            admuVar.add(ixnVar);
        }
        admuVar.add(anlmVar);
        if (!anlmVar.i) {
            admuVar.add(new ixn(4, 2, false));
        }
        admuVar.e(new jeo(this.d, 0));
        admuVar.e(new jeo(this, 2));
    }

    @Override // defpackage.advc
    public final adkz a() {
        return this.a;
    }

    @Override // defpackage.jal
    public final void b(np npVar) {
        Parcelable parcelable;
        this.f = npVar;
        if (npVar != null && (parcelable = this.e) != null) {
            npVar.onRestoreInstanceState(parcelable);
        }
        this.e = null;
    }

    @Override // defpackage.jal
    public final void c() {
        np npVar = this.f;
        this.e = npVar == null ? null : npVar.onSaveInstanceState();
        this.f = null;
    }

    @tcc
    public void handleHideEnclosingEvent(vvt vvtVar) {
        Object obj = vvtVar.a;
        if (obj instanceof anzn) {
            tbk tbkVar = this.d;
            if (tbkVar.contains(obj)) {
                return;
            }
            anzn anznVar = (anzn) obj;
            anlm anlmVar = this.b;
            if (kro.J(anlmVar.d, anznVar)) {
                tbkVar.add(tbkVar.size(), anznVar);
            }
            if (tbkVar.size() == anlmVar.d.size()) {
                this.a.clear();
            }
        }
    }

    @tcc
    public void handleShowEnclosingEvent(gsj gsjVar) {
        tbk tbkVar = this.d;
        if (tbkVar.isEmpty() || !tbkVar.get(tbkVar.size() - 1).equals(((Optional) gsjVar.e).orElse(null))) {
            return;
        }
        tbkVar.remove(tbkVar.size() - 1);
        if (this.a.isEmpty()) {
            e(this.b);
        }
    }

    @Override // defpackage.adsv, defpackage.advw
    public final adxd hq() {
        tbm tbmVar = new tbm();
        tbk tbkVar = this.d;
        tbmVar.addAll(0, tbkVar.subList(0, tbkVar.size()));
        np npVar = this.f;
        return new iww(npVar == null ? null : npVar.onSaveInstanceState(), tbmVar);
    }

    @Override // defpackage.adsv, defpackage.twn
    public final void i() {
        this.c.l(this);
        this.d.clear();
        this.e = null;
    }
}
