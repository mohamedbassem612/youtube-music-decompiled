package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abnl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kwo(18);
    public jrk a;
    public ajwo b;
    public String c;
    public int d;
    public boolean e;
    public String f = "";
    public final int g;
    private final abnh h;

    public abnl(jrk jrkVar, int i, ajwo ajwoVar, abnh abnhVar) {
        this.a = jrkVar;
        this.g = i;
        this.b = ajwoVar;
        this.h = abnhVar;
    }

    public static ajwo h(jrk jrkVar) {
        if ((jrkVar.b & 8388608) != 0) {
            try {
                return (ajwo) aihn.parseFrom(ajwo.a, jrkVar.y, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused) {
            }
        }
        return null;
    }

    public final void A(long j) {
        aihf builder = this.a.toBuilder();
        builder.copyOnWrite();
        jrk jrkVar = (jrk) builder.instance;
        jrkVar.b |= SemanticState.ReadOnly;
        jrkVar.o = j;
        this.a = (jrk) builder.build();
    }

    public final void B(long j) {
        aihf builder = this.a.toBuilder();
        builder.copyOnWrite();
        jrk jrkVar = (jrk) builder.instance;
        jrkVar.b |= SemanticState.Modal;
        jrkVar.p = j;
        this.a = (jrk) builder.build();
    }

    public final boolean C() {
        return this.a.P;
    }

    public final boolean D() {
        return this.a.M;
    }

    public final boolean E() {
        return (this.a.b & SemanticState.ReadOnly) != 0;
    }

    public final boolean F() {
        return (this.a.b & SemanticState.LiveRegion) != 0;
    }

    public final boolean G() {
        return (this.a.b & SemanticState.Modal) != 0;
    }

    public final boolean H() {
        return this.a.A;
    }

    public final boolean I() {
        return this.a.z;
    }

    public final boolean J() {
        return this.a.k;
    }

    public final boolean K() {
        return this.a.u;
    }

    public final boolean L() {
        return this.a.B;
    }

    public final boolean M() {
        return this.a.l;
    }

    public final boolean N() {
        return this.a.C;
    }

    public final boolean O() {
        return !this.a.t;
    }

    public final boolean P() {
        return this.a.s;
    }

    public final byte[] Q() {
        return this.a.j.G();
    }

    public final byte[] R() {
        return this.a.I.G();
    }

    public final int S() {
        int iBc = a.bc(this.a.F);
        if (iBc == 0) {
            return 1;
        }
        return iBc;
    }

    public final int a() {
        return this.a.g;
    }

    public final long b() {
        return this.a.o;
    }

    public final long c() {
        return this.a.n;
    }

    public final long d() {
        return this.a.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final jrj e() {
        jrj jrjVarA = jrj.a(this.a.D);
        return jrjVarA == null ? jrj.AUDIO_ROUTE_UNSPECIFIED : jrjVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abnl) {
            abnl abnlVar = (abnl) obj;
            if (Objects.equals(this.a, abnlVar.a) && this.g == abnlVar.g && Objects.equals(this.b, abnlVar.b) && Objects.equals(this.c, abnlVar.c) && Objects.equals(this.h, abnlVar.h) && this.d == abnlVar.d && this.e == abnlVar.e && Objects.equals(this.f, abnlVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final abnk f() {
        abnk abnkVar = new abnk();
        abnkVar.q = this.a;
        abnkVar.a = this.b;
        abnkVar.y = this.g;
        abnkVar.o = this.h;
        abnkVar.d = this.e;
        abnkVar.b = H();
        abnkVar.c = I();
        abnkVar.e = N();
        return abnkVar;
    }

    public final abnk g() {
        abnk abnkVarF = f();
        abnkVarF.v = this.c;
        return abnkVarF;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.g), this.b, this.c, this.h, Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f);
    }

    public final arig i() {
        arig arigVar = this.a.H;
        return arigVar == null ? arig.a : arigVar;
    }

    public final Duration j() {
        if (F()) {
            return Duration.ofMillis(c());
        }
        return null;
    }

    public final Optional k() {
        return Optional.ofNullable(this.h);
    }

    public final Optional l() {
        jrk jrkVar = this.a;
        if ((jrkVar.b & 4194304) == 0) {
            return Optional.empty();
        }
        aojt aojtVar = jrkVar.x;
        if (aojtVar == null) {
            aojtVar = aojt.a;
        }
        return Optional.of(aojtVar);
    }

    public final Optional m() {
        jrk jrkVar = this.a;
        return (jrkVar.c & 16) != 0 ? Optional.of(jrkVar.J) : Optional.empty();
    }

    public final Optional n() {
        jrk jrkVar = this.a;
        if ((jrkVar.c & 32) == 0) {
            return Optional.empty();
        }
        apla aplaVar = jrkVar.K;
        if (aplaVar == null) {
            aplaVar = apla.a;
        }
        return Optional.of(aplaVar);
    }

    public final Optional o() {
        return Optional.ofNullable(this.c);
    }

    public final String p(txp txpVar) {
        String strQ = q(txpVar);
        this.c = null;
        return strQ;
    }

    public final String q(txp txpVar) {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String strA = txpVar.a();
        this.c = strA;
        return strA;
    }

    public final String r() {
        return this.a.i;
    }

    public final String s() {
        return this.a.q;
    }

    public final String t() {
        jrk jrkVar = this.a;
        if ((jrkVar.b & SemanticState.Multiline) != 0) {
            return jrkVar.r;
        }
        return null;
    }

    public final String toString() {
        List listX = x();
        return String.format(Locale.getDefault(), "PlaybackStartDescriptor:\n  VideoId:%s\n  PlaylistId:%s\n  Index:%d\n  VideoIds:%s", w(), u(), Integer.valueOf(a()), listX != null ? listX.toString() : "");
    }

    public final String u() {
        return this.a.f;
    }

    public final String v() {
        return this.a.h;
    }

    public final String w() {
        return this.a.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.toByteArray());
        parcel.writeString(this.c);
    }

    public final List x() {
        if (this.a.e.size() > 0) {
            return this.a.e;
        }
        return null;
    }

    public final Map y() {
        return DesugarCollections.unmodifiableMap(this.a.E);
    }

    public final void z(abnl abnlVar) {
        if (abnlVar == null || abnlVar == this) {
            return;
        }
        if (abnlVar != this) {
            this.c = abnlVar.c;
        }
        abnlVar.c = null;
    }
}
