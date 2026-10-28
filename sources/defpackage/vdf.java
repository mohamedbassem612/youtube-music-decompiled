package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vdf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new vde();
    private long A;
    private boolean B;
    private long C;
    private Duration D;
    private Duration E;
    private boolean F;
    private float G;
    private boolean H;
    private short I;
    public String a;
    public String b;
    public String c;
    public ajwo d;
    public ajwo e;
    public aqmh f;
    public String g;
    public Uri h;
    public apvm i;
    public apvy j;
    public Optional k;
    public Optional l;
    public Optional m;
    public String n;
    public ajwo o;
    public auhu p;
    public agke q;
    public agke r;
    public String s;
    public wgs t;
    public wiu u;
    public ajai v;
    private boolean w;
    private boolean x;
    private long y;
    private long z;

    public vdf(vdg vdgVar) {
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.w = vdgVar.b;
        this.x = vdgVar.c;
        this.a = vdgVar.d;
        this.b = vdgVar.e;
        this.y = vdgVar.f;
        this.c = vdgVar.g;
        this.d = vdgVar.h;
        this.e = vdgVar.i;
        this.f = vdgVar.j;
        this.g = vdgVar.k;
        this.h = vdgVar.l;
        this.i = vdgVar.m;
        this.j = vdgVar.n;
        this.z = vdgVar.o;
        this.A = vdgVar.p;
        this.B = vdgVar.q;
        this.k = vdgVar.r;
        this.l = vdgVar.s;
        this.m = vdgVar.t;
        this.C = vdgVar.u;
        this.n = vdgVar.v;
        this.o = vdgVar.w;
        this.p = vdgVar.x;
        this.q = vdgVar.y;
        this.r = vdgVar.z;
        this.s = vdgVar.A;
        this.D = vdgVar.B;
        this.E = vdgVar.C;
        this.F = vdgVar.D;
        this.G = vdgVar.E;
        this.t = vdgVar.F;
        this.u = vdgVar.G;
        this.v = vdgVar.H;
        this.H = vdgVar.I;
        this.I = (short) 1023;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    public final vdg a() {
        if (this.a == null && this.p == null) {
            if (f()) {
                if ((this.I & 1) == 0) {
                    throw new IllegalStateException("Property \"wasReadFromParcel\" has not been set");
                }
                if (!this.w) {
                    throw new IllegalStateException("Missing ID when building track");
                }
            }
            zvp.a(zvn.b, zvm.f, "[ShortsCreation][Android][Music]Missing videoId and missing dynamicCreationMusicAsset when building track.");
        }
        if (this.a != null && this.p != null) {
            this.p = null;
            zvp.a(zvn.b, zvm.f, "[ShortsCreation][Android][Music]VideoId and dynamicCreationMusicAsset both present when building track.");
        }
        auhu auhuVar = this.p;
        if (auhuVar == null) {
            if (d() < 0 || (this.k.isPresent() && d() >= ((Long) this.k.get()).longValue())) {
                zvp.a(zvn.b, zvm.f, "[ShortsCreation][Android][Music]Invalid startTimeMs when building track.");
                p(0L);
            }
            if (b() <= 0) {
                zvp.a(zvn.b, zvm.f, "[ShortsCreation][Android][Music]Invalid maxAudioDurationMs when building track.");
                l(15000L);
            }
            long jC = c();
            if (jC <= 0) {
                zvp.a(zvn.b, zvm.f, "[ShortsCreation][Android][Music]Invalid selectedAudioDurationMs when building track.");
                jC = b();
            }
            long jMin = Math.min(jC, b());
            if (this.k.isPresent()) {
                if (((Long) this.k.get()).longValue() <= 0) {
                    zvp.a(zvn.b, zvm.f, "[ShortsCreation][Android][Music]Invalid audioDurationMs when building track.");
                }
                l(Math.min(((Long) this.k.get()).longValue(), b()));
                jMin = Math.max(0L, Math.min(jMin, ((Long) this.k.get()).longValue() - d()));
            }
            s(jMin);
            return e();
        }
        akhc akhcVar = auhuVar.e;
        if (akhcVar == null) {
            akhcVar = akhc.a;
        }
        this.g = akhcVar.c;
        akhc akhcVar2 = auhuVar.e;
        if (akhcVar2 == null) {
            akhcVar2 = akhc.a;
        }
        aqmh aqmhVar = akhcVar2.b;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        this.f = aqmhVar;
        aigu aiguVar = auhuVar.f;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        long jB = aikw.b(aiguVar);
        this.k = Optional.of(Long.valueOf(jB));
        l(jB);
        long jD = d();
        if (jD != 0 && (jD < 0 || jD >= jB)) {
            zvp.a(zvn.b, zvm.f, "[ShortsCreation][Android][Music]Invalid dynamic asset start point when building track.");
            jD = 0;
        }
        p(jD);
        aigu aiguVar2 = auhuVar.h;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        long jB2 = aikw.b(aiguVar2);
        if (jD > 0) {
            jB2 = Math.min(jB2, jB - jD);
        }
        if (auhuVar.g != jD) {
            aihf builder = auhuVar.toBuilder();
            builder.copyOnWrite();
            auhu auhuVar2 = (auhu) builder.instance;
            auhuVar2.b |= 64;
            auhuVar2.g = jD;
            aigu aiguVarC = aikw.c(jB2);
            builder.copyOnWrite();
            auhu auhuVar3 = (auhu) builder.instance;
            aiguVarC.getClass();
            auhuVar3.h = aiguVarC;
            auhuVar3.b |= SemanticState.Focused;
            auhuVar = (auhu) builder.build();
            this.p = auhuVar;
        } else {
            aigu aiguVar3 = auhuVar.h;
            if (aiguVar3 == null) {
                aiguVar3 = aigu.a;
            }
            if (aikw.b(aiguVar3) != jB2) {
                aihf builder2 = auhuVar.toBuilder();
                builder2.copyOnWrite();
                auhu auhuVar4 = (auhu) builder2.instance;
                auhuVar4.b |= 64;
                auhuVar4.g = jD;
                aigu aiguVarC2 = aikw.c(jB2);
                builder2.copyOnWrite();
                auhu auhuVar5 = (auhu) builder2.instance;
                aiguVarC2.getClass();
                auhuVar5.h = aiguVarC2;
                auhuVar5.b |= SemanticState.Focused;
                auhuVar = (auhu) builder2.build();
                this.p = auhuVar;
            }
        }
        o(jB2);
        this.h = Uri.parse(auhuVar.d);
        return e();
    }

    public final long b() {
        if ((this.I & 16) != 0) {
            return this.A;
        }
        throw new IllegalStateException("Property \"maxAudioDurationMs\" has not been set");
    }

    public final long c() {
        if ((this.I & 8) != 0) {
            return this.z;
        }
        throw new IllegalStateException("Property \"selectedAudioDurationMs\" has not been set");
    }

    public final long d() {
        if ((this.I & 4) != 0) {
            return this.y;
        }
        throw new IllegalStateException("Property \"startTimeMs\" has not been set");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final vdg e() {
        agke agkeVar;
        agke agkeVar2;
        String str;
        Duration duration;
        Duration duration2;
        if (this.I == 1023 && (agkeVar = this.q) != null && (agkeVar2 = this.r) != null && (str = this.s) != null && (duration = this.D) != null && (duration2 = this.E) != null) {
            return new vdg(this.w, this.x, this.a, this.b, this.y, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.z, this.A, this.B, this.k, this.l, this.m, this.C, this.n, this.o, this.p, agkeVar, agkeVar2, str, duration, duration2, this.F, this.G, this.t, this.u, this.v, this.H);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.I & 1) == 0) {
            sb.append(" wasReadFromParcel");
        }
        if ((this.I & 2) == 0) {
            sb.append(" hasHandledNavigationCommand");
        }
        if ((this.I & 4) == 0) {
            sb.append(" startTimeMs");
        }
        if ((this.I & 8) == 0) {
            sb.append(" selectedAudioDurationMs");
        }
        if ((this.I & 16) == 0) {
            sb.append(" maxAudioDurationMs");
        }
        if ((this.I & 32) == 0) {
            sb.append(" isPendingResponse");
        }
        if ((this.I & 64) == 0) {
            sb.append(" initialSelectedDurationMs");
        }
        if (this.q == null) {
            sb.append(" remixSources");
        }
        if (this.r == null) {
            sb.append(" creationFeatureConfigList");
        }
        if (this.s == null) {
            sb.append(" associatedVideoSegmentAbsoluteOriginalFilePath");
        }
        if (this.D == null) {
            sb.append(" relativeStartTime");
        }
        if (this.E == null) {
            sb.append(" relativeDuration");
        }
        if ((this.I & 128) == 0) {
            sb.append(" isLinkedToVideoInternal");
        }
        if ((this.I & 256) == 0) {
            sb.append(" volume");
        }
        if ((this.I & 512) == 0) {
            sb.append(" isTrackBuildTryCatchEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final boolean f() {
        if ((this.I & 512) != 0) {
            return this.H;
        }
        throw new IllegalStateException("Property \"isTrackBuildTryCatchEnabled\" has not been set");
    }

    public final void g(boolean z) {
        this.x = z;
        this.I = (short) (this.I | 2);
    }

    public final void h(long j) {
        this.C = j;
        this.I = (short) (this.I | 64);
    }

    public final void i(boolean z) {
        this.F = z;
        this.I = (short) (this.I | 128);
    }

    public final void j(boolean z) {
        this.B = z;
        this.I = (short) (this.I | 32);
    }

    public final void k(boolean z) {
        this.H = z;
        this.I = (short) (this.I | 512);
    }

    public final void l(long j) {
        this.A = j;
        this.I = (short) (this.I | 16);
    }

    public final void m(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null relativeDuration");
        }
        this.E = duration;
    }

    public final void n(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null relativeStartTime");
        }
        this.D = duration;
    }

    public final void o(long j) {
        this.z = j;
        this.I = (short) (this.I | 8);
    }

    public final void p(long j) {
        this.y = j;
        this.I = (short) (this.I | 4);
    }

    public final void q(float f) {
        this.G = f;
        this.I = (short) (this.I | 256);
    }

    public final void r(boolean z) {
        this.w = z;
        this.I = (short) (this.I | 1);
    }

    public final void s(long j) {
        auhu auhuVar = this.p;
        if (auhuVar != null) {
            aigu aiguVar = auhuVar.f;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            if (j <= aikw.b(aiguVar)) {
                aihf builder = auhuVar.toBuilder();
                aigu aiguVarC = aikw.c(j);
                builder.copyOnWrite();
                auhu auhuVar2 = (auhu) builder.instance;
                aiguVarC.getClass();
                auhuVar2.h = aiguVarC;
                auhuVar2.b |= SemanticState.Focused;
                this.p = (auhu) builder.build();
            }
        }
        o(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(d());
        parcel.writeString(this.c);
        aqmh aqmhVar = this.f;
        parcel.writeInt(aqmhVar != null ? 1 : 0);
        if (aqmhVar != null) {
            parcel.writeByteArray(aqmhVar.toByteArray());
        }
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeLong(((Long) this.k.orElse(-1L)).longValue());
        parcel.writeInt(this.l.isPresent() ? 1 : 0);
        if (this.l.isPresent()) {
            parcel.writeString((String) this.l.get());
        }
        Object[] objArr = this.l.isEmpty() && this.m.isPresent();
        parcel.writeInt(objArr != false ? ((byte[]) this.m.get()).length : -1);
        if (objArr != false) {
            parcel.writeByteArray((byte[]) this.m.get());
        }
        ajwo ajwoVar = this.d;
        parcel.writeInt(ajwoVar != null ? 1 : 0);
        if (ajwoVar != null) {
            parcel.writeByteArray(ajwoVar.toByteArray());
        }
        ajwo ajwoVar2 = this.e;
        parcel.writeInt(ajwoVar2 != null ? 1 : 0);
        if (ajwoVar2 != null) {
            parcel.writeByteArray(ajwoVar2.toByteArray());
        }
        parcel.writeLong(c());
        parcel.writeLong(b());
        if ((this.I & 64) == 0) {
            throw new IllegalStateException("Property \"initialSelectedDurationMs\" has not been set");
        }
        parcel.writeLong(this.C);
        apvm apvmVar = this.i;
        parcel.writeInt(apvmVar != null ? 1 : 0);
        if (apvmVar != null) {
            parcel.writeByteArray(apvmVar.toByteArray());
        }
        apvy apvyVar = this.j;
        parcel.writeInt(apvyVar != null ? 1 : 0);
        if (apvyVar != null) {
            parcel.writeByteArray(apvyVar.toByteArray());
        }
        parcel.writeString(this.n);
        auhu auhuVar = this.p;
        parcel.writeInt(auhuVar != null ? 1 : 0);
        if (auhuVar != null) {
            parcel.writeByteArray(auhuVar.toByteArray());
        }
        String str = this.s;
        if (str == null) {
            throw new IllegalStateException("Property \"associatedVideoSegmentAbsoluteOriginalFilePath\" has not been set");
        }
        parcel.writeString(str);
        Duration duration = this.D;
        if (duration == null) {
            throw new IllegalStateException("Property \"relativeStartTime\" has not been set");
        }
        parcel.writeLong(duration.toMillis());
        Duration duration2 = this.E;
        if (duration2 == null) {
            throw new IllegalStateException("Property \"relativeDuration\" has not been set");
        }
        parcel.writeLong(duration2.toMillis());
        if ((this.I & 128) == 0) {
            throw new IllegalStateException("Property \"isLinkedToVideoInternal\" has not been set");
        }
        parcel.writeInt(this.F ? 1 : 0);
        if ((this.I & 256) == 0) {
            throw new IllegalStateException("Property \"volume\" has not been set");
        }
        parcel.writeFloat(this.G);
        wgs wgsVar = this.t;
        parcel.writeInt(wgsVar != null ? 1 : 0);
        if (wgsVar != null) {
            parcel.writeParcelable(wgsVar, 0);
        }
        wiu wiuVar = this.u;
        parcel.writeInt(wiuVar != null ? 1 : 0);
        if (wiuVar != null) {
            parcel.writeParcelable(wiuVar, 0);
        }
        ajai ajaiVar = this.v;
        parcel.writeInt(ajaiVar == null ? 0 : 1);
        if (ajaiVar != null) {
            parcel.writeByteArray(ajaiVar.toByteArray());
        }
        if ((this.I & 32) == 0) {
            throw new IllegalStateException("Property \"isPendingResponse\" has not been set");
        }
        parcel.writeInt(this.B ? 1 : 0);
        if ((this.I & 2) == 0) {
            throw new IllegalStateException("Property \"hasHandledNavigationCommand\" has not been set");
        }
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(f() ? 1 : 0);
    }

    public vdf() {
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
    }
}
