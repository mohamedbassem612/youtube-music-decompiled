package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzg implements hyz, hyw, hza {
    public aouu a;
    public aoun b;
    public aoun c;
    public aoun d;
    public aoun e;
    public agek f;
    public kyr g;
    private final long h;
    private final hwz i;

    public hzg(long j, aouu aouuVar, hwz hwzVar) {
        this.a = aouuVar;
        this.i = hwzVar;
        this.h = j;
        z();
    }

    private final void z() {
        Optional optionalEmpty;
        aout aoutVar;
        apji apjiVar = this.a.b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aouq.b);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        aoun aounVar = (aoun) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        this.b = aounVar;
        this.c = aounVar;
        aouu aouuVar = this.a;
        int i = 2;
        if (aouuVar == null || aouuVar.c.size() == 0 || ((aour) aouuVar.c.get(0)).b != 2) {
            optionalEmpty = Optional.empty();
        } else {
            aour aourVar = (aour) aouuVar.c.get(0);
            optionalEmpty = Optional.ofNullable((aoun) aavv.s(aourVar.b == 2 ? (apji) aourVar.c : apji.a, aouq.b));
        }
        if (optionalEmpty.isEmpty()) {
            zvp.a(zvn.b, zvm.n, "Counterpart renderer absent in response. ");
        }
        ajwo ajwoVar = this.b.l;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        anzw anzwVarP = gzj.P(ajwoVar);
        anzw anzwVar = anzw.MUSIC_VIDEO_TYPE_ATV;
        aoun aounVar2 = this.b;
        if (anzwVarP == anzwVar) {
            this.d = aounVar2;
            this.e = (aoun) (true != optionalEmpty.isPresent() ? ((hzg) new hly(this, i).a).b : optionalEmpty.get());
        } else {
            this.e = aounVar2;
            this.d = (aoun) (true != optionalEmpty.isPresent() ? ((hzg) new hly(this, 3).a).b : optionalEmpty.get());
        }
        if (this.a.c.size() <= 0 || (aoutVar = ((aour) this.a.c.get(0)).d) == null) {
            aoutVar = aout.a;
        }
        this.g = new kyr(aoutVar, anzwVarP, (char[]) null);
    }

    @Override // defpackage.hyw
    public final alay a() {
        aoun aounVar = this.c;
        if ((aounVar.b & 4) == 0) {
            return null;
        }
        alay alayVar = aounVar.f;
        return alayVar == null ? alay.a : alayVar;
    }

    @Override // defpackage.hyw
    public final alay b() {
        aoun aounVar = this.c;
        if ((aounVar.b & 1) == 0) {
            return null;
        }
        alay alayVar = aounVar.d;
        return alayVar == null ? alay.a : alayVar;
    }

    @Override // defpackage.hyw
    public final anfy c() {
        angb angbVar = this.c.p;
        if (angbVar == null) {
            angbVar = angb.a;
        }
        int i = angbVar.b;
        if (i == 66439850) {
            return i == 66439850 ? (anfy) angbVar.c : anfy.a;
        }
        return null;
    }

    @Override // defpackage.hyw
    public final aoia d() {
        aoum aoumVar = this.c.u;
        if (aoumVar == null) {
            aoumVar = aoum.a;
        }
        int i = aoumVar.b;
        if (i == 60572968) {
            return i == 60572968 ? (aoia) aoumVar.c : aoia.a;
        }
        return null;
    }

    @Override // defpackage.hyw
    public final aqmh e() {
        aoun aounVarV = v(this.i.f());
        if ((aounVarV.b & 8) == 0) {
            return null;
        }
        aqmh aqmhVar = aounVarV.g;
        return aqmhVar == null ? aqmh.a : aqmhVar;
    }

    @Override // defpackage.hyw
    public final Optional f() {
        aoup aoupVar = this.c.y;
        if (aoupVar == null) {
            aoupVar = aoup.a;
        }
        if ((aoupVar.b & 1) == 0) {
            return Optional.empty();
        }
        aoup aoupVar2 = this.c.y;
        if (aoupVar2 == null) {
            aoupVar2 = aoup.a;
        }
        return Optional.of(Float.valueOf(aoupVar2.c));
    }

    @Override // defpackage.hyw
    public final String g() {
        alay alayVarA = a();
        if (alayVarA != null) {
            return ackj.k(null, alayVarA, null, false).toString();
        }
        return null;
    }

    @Override // defpackage.hyw
    public final String h() {
        alay alayVarB = b();
        if (alayVarB != null) {
            return ackj.k(null, alayVarB, null, false).toString();
        }
        return null;
    }

    @Override // defpackage.hyw
    public final List i() {
        return this.c.o;
    }

    @Override // defpackage.hyw
    public final boolean j() {
        ajwo ajwoVar = this.c.l;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        return igs.b(gzj.P(ajwoVar));
    }

    @Override // defpackage.hyz
    public final List k() {
        return agke.r(this.d.n, this.e.n);
    }

    @Override // defpackage.hza
    public final hzb l() {
        abnl abnlVarU = u(this.b);
        return abnlVarU == null ? new hzb(null, null, null) : new hzb(abnlVarU.w(), abnlVarU.u(), gzj.S(abnlVarU.b));
    }

    @Override // defpackage.hzh, defpackage.abkf
    public final long m() {
        return this.h;
    }

    @Override // defpackage.abke
    public final abnl n() {
        return u(this.c);
    }

    @Override // defpackage.abkg
    public final ajwo o() {
        aoun aounVar = this.c;
        if ((aounVar.b & 131072) == 0) {
            return null;
        }
        ajwo ajwoVar = aounVar.q;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.abkf
    public final ajwo p() {
        aoun aounVar = this.c;
        if ((aounVar.b & 262144) == 0) {
            return null;
        }
        ajwo ajwoVar = aounVar.r;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.abkg
    public final String q() {
        aoun aounVar = this.c;
        return (aounVar.c & 2) != 0 ? aounVar.v : "";
    }

    @Override // defpackage.abkg
    public final String r() {
        abnl abnlVarN = n();
        return abnlVarN != null ? abnlVarN.u() : "";
    }

    @Override // defpackage.abkg
    public final String s() {
        abnl abnlVarN = n();
        return abnlVarN == null ? this.c.s : gzj.S(abnlVarN.b);
    }

    @Override // defpackage.abke
    public final String t() {
        abnl abnlVarN = n();
        return abnlVarN == null ? this.c.n : abnlVarN.w();
    }

    public final abnl u(aoun aounVar) {
        if ((aounVar.b & SemanticState.Hidden) == 0) {
            return null;
        }
        Object objApply = aounVar.l;
        if (objApply == null) {
            objApply = ajwo.a;
        }
        agek agekVar = this.f;
        if (agekVar != null) {
            objApply = agekVar.apply(objApply);
        }
        abnk abnkVar = new abnk();
        abnkVar.a = (ajwo) objApply;
        return abnkVar.a();
    }

    public final aoun v(ibh ibhVar) {
        return hwz.k(ibhVar) ? this.d : this.e;
    }

    public final void w(ibh ibhVar) {
        this.c = v(ibhVar);
    }

    public final void x(aouu aouuVar) {
        this.a = aouuVar;
        z();
    }

    public final boolean y(abnl abnlVar) {
        if (abnlVar != null) {
            return gzj.ae(abnlVar, u(this.d)) || gzj.ae(abnlVar, u(this.e));
        }
        return false;
    }
}
