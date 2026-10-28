package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igd implements abvz {
    public final abvz a;
    public final long b;
    public final abjk c;
    private final String e;

    public /* synthetic */ igd(abvz abvzVar, long j, abjk abjkVar, int i) {
        this(abvzVar, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? abjk.a : abjkVar, "");
    }

    public static /* synthetic */ igd h(igd igdVar, abvz abvzVar, long j, abjk abjkVar, String str, int i) {
        if ((i & 1) != 0) {
            abvzVar = igdVar.a;
        }
        if ((i & 2) != 0) {
            j = igdVar.b;
        }
        if ((i & 4) != 0) {
            abjkVar = igdVar.c;
        }
        if ((i & 8) != 0) {
            str = igdVar.e;
        }
        abvzVar.getClass();
        abjkVar.getClass();
        str.getClass();
        return new igd(abvzVar, j, abjkVar, str);
    }

    @Override // defpackage.abvz
    public final abnl a() {
        abnl abnlVarA = this.a.a();
        abnlVarA.getClass();
        return abnlVarA;
    }

    @Override // defpackage.abvz
    public final abnp b() {
        abnp abnpVarB = this.a.b();
        abnpVarB.getClass();
        return abnpVarB;
    }

    @Override // defpackage.abun
    public final /* synthetic */ agke c() {
        return agpi.a;
    }

    @Override // defpackage.abun
    public final Class d() {
        return abvz.class;
    }

    @Override // defpackage.abun
    public final String e() {
        igc igcVarZ = hna.z(this);
        Objects.toString(igcVarZ);
        return igcVarZ.toString().concat(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof igd) {
            igd igdVar = (igd) obj;
            if (awrc.c(this.a, igdVar.a) && this.b == igdVar.b && this.c == igdVar.c && awrc.c(this.e, igdVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abvz
    public final awmd f() {
        return this.a.f();
    }

    @Override // defpackage.abvz
    public final boolean g() {
        return this.a.g();
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + a.ak(this.b)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MusicVideoPlaybackItem(videoPlaybackItem=" + this.a + ", uid=" + this.b + ", queueType=" + this.c + ", loopOneNonce=" + this.e + ')';
    }

    public igd(abvz abvzVar, long j, abjk abjkVar, String str) {
        abjkVar.getClass();
        this.a = abvzVar;
        this.b = j;
        this.c = abjkVar;
        this.e = str;
    }
}
