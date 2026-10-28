package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzf implements hyz, hyw, hza, abkg {
    public aoun a;
    public boolean b;
    private final long c;

    public hzf(long j, aoun aounVar, boolean z) {
        this.c = j;
        aounVar.getClass();
        this.a = aounVar;
        this.b = z;
    }

    @Override // defpackage.hyw
    public final alay a() {
        if (this.b) {
            aoun aounVar = this.a;
            if ((aounVar.b & 4) != 0) {
                alay alayVar = aounVar.f;
                return alayVar == null ? alay.a : alayVar;
            }
        }
        return null;
    }

    @Override // defpackage.hyw
    public final alay b() {
        if (this.b) {
            aoun aounVar = this.a;
            if ((aounVar.b & 1) != 0) {
                alay alayVar = aounVar.d;
                return alayVar == null ? alay.a : alayVar;
            }
        }
        return null;
    }

    @Override // defpackage.hyw
    public final anfy c() {
        int i;
        angb angbVar = this.a.p;
        if (angbVar == null) {
            angbVar = angb.a;
        }
        if (this.b && (i = angbVar.b) == 66439850) {
            return i == 66439850 ? (anfy) angbVar.c : anfy.a;
        }
        return null;
    }

    @Override // defpackage.hyw
    public final aoia d() {
        int i;
        aoum aoumVar = this.a.u;
        if (aoumVar == null) {
            aoumVar = aoum.a;
        }
        if (this.b && (i = aoumVar.b) == 60572968) {
            return i == 60572968 ? (aoia) aoumVar.c : aoia.a;
        }
        return null;
    }

    @Override // defpackage.hyw
    public final aqmh e() {
        if (!this.b) {
            return null;
        }
        aqmh aqmhVar = this.a.g;
        return aqmhVar == null ? aqmh.a : aqmhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hzf)) {
            return false;
        }
        abnl abnlVarN = n();
        abnl abnlVarN2 = ((hzf) obj).n();
        if (abnlVarN == null) {
            return abnlVarN2 == null;
        }
        if (abnlVarN2 != null) {
            return gzj.ae(abnlVarN, abnlVarN2);
        }
        return false;
    }

    @Override // defpackage.hyw
    public final Optional f() {
        aoup aoupVar = this.a.y;
        if (aoupVar == null) {
            aoupVar = aoup.a;
        }
        if ((aoupVar.b & 1) == 0) {
            return Optional.empty();
        }
        aoup aoupVar2 = this.a.y;
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

    public final int hashCode() {
        String strR;
        String strW;
        abnl abnlVarN = n();
        if (abnlVarN != null) {
            strR = abnlVarN.r();
            strW = abnlVarN.w();
        } else {
            strR = null;
            strW = null;
        }
        return Objects.hash(strR, strW, Boolean.valueOf(abnlVarN != null && abnlVarN.J()));
    }

    @Override // defpackage.hyw
    public final List i() {
        return this.a.o;
    }

    @Override // defpackage.hyw
    public final boolean j() {
        ajwo ajwoVar = this.a.l;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        return igs.b(gzj.P(ajwoVar));
    }

    @Override // defpackage.hyz
    public final List k() {
        return agke.q(t());
    }

    @Override // defpackage.hza
    public final hzb l() {
        return new hzb(t(), r(), s());
    }

    @Override // defpackage.hzh, defpackage.abkf
    public final long m() {
        return this.c;
    }

    @Override // defpackage.abke
    public final abnl n() {
        if ((this.a.b & SemanticState.Hidden) == 0) {
            return null;
        }
        abnk abnkVar = new abnk();
        ajwo ajwoVar = this.a.l;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        abnkVar.a = ajwoVar;
        return abnkVar.a();
    }

    @Override // defpackage.abkg
    public final ajwo o() {
        if (this.b) {
            aoun aounVar = this.a;
            if ((aounVar.b & 131072) != 0) {
                ajwo ajwoVar = aounVar.q;
                return ajwoVar == null ? ajwo.a : ajwoVar;
            }
        }
        return null;
    }

    @Override // defpackage.abkf
    public final ajwo p() {
        aoun aounVar = this.a;
        if ((aounVar.b & 262144) == 0) {
            return null;
        }
        ajwo ajwoVar = aounVar.r;
        return ajwoVar == null ? ajwo.a : ajwoVar;
    }

    @Override // defpackage.abkg
    public final String q() {
        if (this.b) {
            aoun aounVar = this.a;
            if ((aounVar.c & 2) != 0) {
                return aounVar.v;
            }
        }
        return "";
    }

    @Override // defpackage.abkg
    public final String r() {
        abnl abnlVarN = n();
        return abnlVarN != null ? abnlVarN.u() : "";
    }

    @Override // defpackage.abkg
    public final String s() {
        abnl abnlVarN = n();
        return abnlVarN == null ? this.a.s : gzj.S(abnlVarN.b);
    }

    @Override // defpackage.abke
    public final String t() {
        abnl abnlVarN = n();
        return abnlVarN == null ? this.a.n : abnlVarN.w();
    }

    public final String toString() {
        abnl abnlVarN = n();
        return "{" + t() + ',' + (abnlVarN != null ? abnlVarN.u() : "null") + '}';
    }

    public final void u(aoun aounVar) {
        this.b = true;
        this.a = aounVar;
    }
}
