package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.LivePlayerConfigOuterClass$LivePlayerConfig;
import com.google.protos.youtube.api.innertube.ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$MediaCommonConfig;
import com.google.protos.youtube.api.innertube.MediaCommonConfigOuterClass$ServerReadaheadConfig;
import com.google.protos.youtube.api.innertube.NextRequestPolicyOuterClass$NextRequestPolicy;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wiu implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/model/media/PlayerConfigModel");
    public static final float[] b = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    public static final wiu c;
    private static final aoqd n;
    public final aoqd d;
    public Set e;
    public final List f = new ArrayList();
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public boolean l = true;
    public boolean m = false;
    private Set o;
    private Set p;
    private Set q;
    private agkj r;
    private amkq s;

    static {
        aoqd aoqdVar = aoqd.a;
        n = aoqdVar;
        c = new wiu(aoqdVar);
        CREATOR = new kwo(14);
    }

    public wiu(aoqd aoqdVar) {
        aoqdVar.getClass();
        this.d = aoqdVar;
    }

    private final Optional ba() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.c & 1073741824) == 0) {
            return Optional.empty();
        }
        ales alesVar = aoqdVar.J;
        if (alesVar == null) {
            alesVar = ales.a;
        }
        return Optional.of(alesVar);
    }

    public final wiu A() {
        aihf builder = this.d.toBuilder();
        builder.copyOnWrite();
        aoqd aoqdVar = (aoqd) builder.instance;
        aoqdVar.f = null;
        aoqdVar.b &= -3;
        return new wiu((aoqd) builder.build());
    }

    public final synchronized agkj B() {
        agkj agkjVarH;
        agkjVarH = this.r;
        if (agkjVarH == null) {
            aoqd aoqdVar = this.d;
            akwm akwmVar = aoqdVar.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (akwmVar.S.size() == 0) {
                agkjVarH = agpn.b;
            } else {
                akwm akwmVar2 = aoqdVar.f;
                if (akwmVar2 == null) {
                    akwmVar2 = akwm.b;
                }
                agkjVarH = agkj.h(DesugarCollections.unmodifiableMap(akwmVar2.S));
            }
            this.r = agkjVarH;
        }
        return agkjVarH;
    }

    public final akfp C() {
        if (!au()) {
            return null;
        }
        aptb aptbVar = this.d.M;
        if (aptbVar == null) {
            aptbVar = aptb.a;
        }
        apta aptaVar = aptbVar.b;
        if (aptaVar == null) {
            aptaVar = apta.a;
        }
        akfp akfpVar = aptaVar.e;
        return akfpVar == null ? akfp.a : akfpVar;
    }

    public final synchronized amkq D() {
        amkq amkqVar;
        amkqVar = this.s;
        if (amkqVar == null) {
            amkqVar = this.d.o;
            if (amkqVar == null) {
                amkqVar = amkq.a;
            }
            this.s = amkqVar;
        }
        return amkqVar;
    }

    public final MediaCommonConfigOuterClass$MediaCommonConfig E() {
        MediaCommonConfigOuterClass$MediaCommonConfig mediaCommonConfigOuterClass$MediaCommonConfig = this.d.e;
        return mediaCommonConfigOuterClass$MediaCommonConfig == null ? MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance() : mediaCommonConfigOuterClass$MediaCommonConfig;
    }

    public final NextRequestPolicyOuterClass$NextRequestPolicy F() {
        MediaCommonConfigOuterClass$ServerReadaheadConfig defaultInstance = E().h;
        if (defaultInstance == null) {
            defaultInstance = MediaCommonConfigOuterClass$ServerReadaheadConfig.getDefaultInstance();
        }
        NextRequestPolicyOuterClass$NextRequestPolicy nextRequestPolicyOuterClass$NextRequestPolicy = defaultInstance.c;
        return nextRequestPolicyOuterClass$NextRequestPolicy == null ? NextRequestPolicyOuterClass$NextRequestPolicy.getDefaultInstance() : nextRequestPolicyOuterClass$NextRequestPolicy;
    }

    public final Optional G() {
        aoqd aoqdVar = this.d;
        ajhg ajhgVar = aoqdVar.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        if ((ajhgVar.b & 4) == 0) {
            return Optional.empty();
        }
        ajhg ajhgVar2 = aoqdVar.g;
        if (ajhgVar2 == null) {
            ajhgVar2 = ajhg.a;
        }
        return Optional.of(Float.valueOf(ajhgVar2.e));
    }

    public final Optional H() {
        aoqd aoqdVar = this.d;
        ajhg ajhgVar = aoqdVar.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        if ((ajhgVar.b & SemanticState.ReadOnly) == 0) {
            return Optional.empty();
        }
        ajhg ajhgVar2 = aoqdVar.g;
        if (ajhgVar2 == null) {
            ajhgVar2 = ajhg.a;
        }
        return Optional.of(Float.valueOf(ajhgVar2.k));
    }

    public final Optional I() {
        aoqd aoqdVar = this.d;
        ajhg ajhgVar = aoqdVar.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        if ((ajhgVar.b & 8) == 0) {
            return Optional.empty();
        }
        ajhg ajhgVar2 = aoqdVar.g;
        if (ajhgVar2 == null) {
            ajhgVar2 = ajhg.a;
        }
        return Optional.of(Float.valueOf(ajhgVar2.f));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    public final Optional J() {
        Optional optionalEmpty;
        int i;
        aoqd aoqdVar = this.d;
        if ((aoqdVar.b & 32) == 0) {
            optionalEmpty = Optional.empty();
        } else {
            ajhg ajhgVar = aoqdVar.g;
            if (ajhgVar == null) {
                ajhgVar = ajhg.a;
            }
            if ((ajhgVar.b & SemanticState.Multiline) != 0) {
                ajhg ajhgVar2 = aoqdVar.g;
                if (ajhgVar2 == null) {
                    ajhgVar2 = ajhg.a;
                }
                ajbi ajbiVarA = ajbi.a(ajhgVar2.n);
                if (ajbiVarA == null) {
                    ajbiVarA = ajbi.ANDROID_AUDIO_CONTENT_TYPE_UNKNOWN;
                }
                optionalEmpty = Optional.of(ajbiVarA);
            } else {
                optionalEmpty = Optional.empty();
            }
        }
        if (true != optionalEmpty.isPresent()) {
            return optionalEmpty;
        }
        int iOrdinal = ((ajbi) optionalEmpty.get()).ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? 0 : 1;
        } else {
            i = 2;
        }
        return Optional.ofNullable(i);
    }

    public final Optional K() {
        aoqd aoqdVar = this.d;
        ajhg ajhgVar = aoqdVar.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        if ((ajhgVar.b & SemanticState.Modal) == 0) {
            return Optional.empty();
        }
        ajhg ajhgVar2 = aoqdVar.g;
        if (ajhgVar2 == null) {
            ajhgVar2 = ajhg.a;
        }
        return Optional.of(Float.valueOf(ajhgVar2.l));
    }

    public final Optional L() {
        aoqd aoqdVar = this.d;
        ajhg ajhgVar = aoqdVar.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        if ((ajhgVar.b & SemanticState.LiveRegion) == 0) {
            return Optional.empty();
        }
        ajhg ajhgVar2 = aoqdVar.g;
        if (ajhgVar2 == null) {
            ajhgVar2 = ajhg.a;
        }
        return Optional.of(Float.valueOf(ajhgVar2.j));
    }

    public final Optional M() {
        Optional optionalBa = ba();
        if (true == optionalBa.isPresent() && (((ales) optionalBa.get()).b & 2) == 0) {
            optionalBa = Optional.empty();
        }
        if (true == optionalBa.isPresent()) {
            optionalBa = Optional.ofNullable(Integer.valueOf(((ales) optionalBa.get()).d));
        }
        return true == optionalBa.isPresent() ? Optional.ofNullable(Float.valueOf(((Integer) optionalBa.get()).intValue() / 100.0f)) : optionalBa;
    }

    public final Optional N() {
        aoqd aoqdVar = this.d;
        ajhg ajhgVar = aoqdVar.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        amuq amuqVar = ajhgVar.m;
        if (amuqVar == null) {
            amuqVar = amuq.a;
        }
        if ((amuqVar.b & 8) == 0) {
            return Optional.empty();
        }
        ajhg ajhgVar2 = aoqdVar.g;
        if (ajhgVar2 == null) {
            ajhgVar2 = ajhg.a;
        }
        amuq amuqVar2 = ajhgVar2.m;
        if (amuqVar2 == null) {
            amuqVar2 = amuq.a;
        }
        return Optional.of(Float.valueOf(amuqVar2.f));
    }

    public final Optional O() {
        Optional optionalBa = ba();
        if (true == optionalBa.isPresent() && (((ales) optionalBa.get()).b & 1) == 0) {
            optionalBa = Optional.empty();
        }
        if (true == optionalBa.isPresent()) {
            optionalBa = Optional.ofNullable(Integer.valueOf(((ales) optionalBa.get()).c));
        }
        return true == optionalBa.isPresent() ? Optional.ofNullable(Float.valueOf(((Integer) optionalBa.get()).intValue() / 100.0f)) : optionalBa;
    }

    public final Optional P() {
        aoqd aoqdVar = this.d;
        ajhg ajhgVar = aoqdVar.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        if ((ajhgVar.b & 2) == 0) {
            return Optional.empty();
        }
        ajhg ajhgVar2 = aoqdVar.g;
        if (ajhgVar2 == null) {
            ajhgVar2 = ajhg.a;
        }
        return Optional.of(Float.valueOf(ajhgVar2.d));
    }

    public final Long Q() {
        aoqd aoqdVar = this.d;
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance = aoqdVar.G;
        if (defaultInstance == null) {
            defaultInstance = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        if ((defaultInstance.b & 8) == 0) {
            return null;
        }
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance2 = aoqdVar.G;
        if (defaultInstance2 == null) {
            defaultInstance2 = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        return Long.valueOf(defaultInstance2.f);
    }

    public final Long R() {
        aoqd aoqdVar = this.d;
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance = aoqdVar.G;
        if (defaultInstance == null) {
            defaultInstance = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        if ((defaultInstance.b & 2) == 0) {
            return null;
        }
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance2 = aoqdVar.G;
        if (defaultInstance2 == null) {
            defaultInstance2 = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        return Long.valueOf(defaultInstance2.d);
    }

    public final Long S() {
        aoqd aoqdVar = this.d;
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance = aoqdVar.G;
        if (defaultInstance == null) {
            defaultInstance = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        if ((defaultInstance.b & 4) == 0) {
            return null;
        }
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance2 = aoqdVar.G;
        if (defaultInstance2 == null) {
            defaultInstance2 = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        return Long.valueOf(defaultInstance2.e);
    }

    public final Long T() {
        aoqd aoqdVar = this.d;
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance = aoqdVar.G;
        if (defaultInstance == null) {
            defaultInstance = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        if ((defaultInstance.b & 1) == 0) {
            return null;
        }
        ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig defaultInstance2 = aoqdVar.G;
        if (defaultInstance2 == null) {
            defaultInstance2 = ManifestlessWindowedLiveConfigOuterClass$ManifestlessWindowedLiveConfig.getDefaultInstance();
        }
        return Long.valueOf(defaultInstance2.c);
    }

    public final List U() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.c & 32) == 0) {
            return Collections.EMPTY_LIST;
        }
        akjx akjxVar = aoqdVar.x;
        if (akjxVar == null) {
            akjxVar = akjx.b;
        }
        aihx aihxVar = new aihx(akjxVar.e, akjx.a);
        ArrayList arrayList = new ArrayList(aihxVar.size());
        Iterator<E> it = aihxVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((anil) it.next()).n));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized Set V() {
        if (this.p == null) {
            akwm akwmVar = this.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            this.p = agkz.n(akwmVar.Q);
        }
        return this.p;
    }

    public final synchronized Set W() {
        Set setN;
        if (this.q == null) {
            aoqd aoqdVar = this.d;
            akwm akwmVar = aoqdVar.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            if (akwmVar.R.size() == 0) {
                setN = agpr.a;
            } else {
                akwm akwmVar2 = aoqdVar.f;
                if (akwmVar2 == null) {
                    akwmVar2 = akwm.b;
                }
                setN = agkz.n(akwmVar2.R);
            }
            this.q = setN;
        }
        return this.q;
    }

    public final Set X() {
        Set setN;
        if (this.o == null) {
            aoqd aoqdVar = this.d;
            apld apldVar = aoqdVar.B;
            if (apldVar == null) {
                apldVar = apld.a;
            }
            if (apldVar.c.size() == 0) {
                setN = agpr.a;
            } else {
                apld apldVar2 = aoqdVar.B;
                if (apldVar2 == null) {
                    apldVar2 = apld.a;
                }
                setN = agkz.n(apldVar2.c);
            }
            this.o = setN;
        }
        return this.o;
    }

    public final void Y() {
        this.i = true;
    }

    public final boolean Z() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.U;
    }

    public final double a() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.aI;
    }

    public final boolean aA() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.c & 131072) != 0) {
            akjl akjlVar = aoqdVar.F;
            if (akjlVar == null) {
                akjlVar = akjl.a;
            }
            if (akjlVar.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean aB() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.d & 2) != 0) {
            aptb aptbVar = aoqdVar.M;
            if (aptbVar == null) {
                aptbVar = aptb.a;
            }
            apta aptaVar = aptbVar.b;
            if (aptaVar == null) {
                aptaVar = apta.a;
            }
            if (aptaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean aC() {
        LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance = this.d.D;
        if (defaultInstance == null) {
            defaultInstance = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
        }
        return defaultInstance.g;
    }

    public final boolean aD() {
        akcu akcuVar = this.d.I;
        if (akcuVar == null) {
            akcuVar = akcu.a;
        }
        return akcuVar.b.size() > 0;
    }

    public final boolean aE() {
        ajar ajarVar = this.d.v;
        if (ajarVar == null) {
            ajarVar = ajar.a;
        }
        return ajarVar.c;
    }

    public final boolean aF() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.b & Integer.MIN_VALUE) != 0) {
            argy argyVar = aoqdVar.u;
            if (argyVar == null) {
                argyVar = argy.a;
            }
            if (argyVar.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean aG() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.K;
    }

    public final boolean aH() {
        aoqd aoqdVar = this.d;
        akwm akwmVar = aoqdVar.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        if (akwmVar.A) {
            akwm akwmVar2 = aoqdVar.f;
            if (akwmVar2 == null) {
                akwmVar2 = akwm.b;
            }
            if (akwmVar2.G) {
                return true;
            }
        }
        return false;
    }

    public final boolean aI() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.I;
    }

    public final boolean aJ() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.ac;
    }

    public final boolean aK() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.E;
    }

    public final boolean aL() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.aS;
    }

    public final boolean aM(wiz wizVar) {
        if (!ao(wizVar)) {
            akwm akwmVar = this.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            int iBt = a.bt(akwmVar.ai);
            if (iBt == 0 || iBt != 2) {
                return false;
            }
        }
        return true;
    }

    public final boolean aN() {
        apld apldVar = this.d.B;
        if (apldVar == null) {
            apldVar = apld.a;
        }
        return apldVar.l;
    }

    public final boolean aO() {
        ajhg ajhgVar = this.d.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        return ajhgVar.g;
    }

    public final boolean aP() {
        MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance = this.d.e;
        if (defaultInstance == null) {
            defaultInstance = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
        }
        akpa akpaVar = defaultInstance.c;
        if (akpaVar == null) {
            akpaVar = akpa.a;
        }
        return akpaVar.h;
    }

    public final boolean aQ() {
        ajhg ajhgVar = this.d.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        return ajhgVar.h;
    }

    public final boolean aR() {
        ajhg ajhgVar = this.d.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        return ajhgVar.i;
    }

    public final boolean aS() {
        akjx akjxVar = this.d.x;
        if (akjxVar == null) {
            akjxVar = akjx.b;
        }
        return akjxVar.f;
    }

    public final boolean aT() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.F;
    }

    public final boolean aU() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.au;
    }

    public final boolean aV() {
        ajbx ajbxVar = this.d.k;
        if (ajbxVar == null) {
            ajbxVar = ajbx.a;
        }
        return ajbxVar.j;
    }

    public final boolean aW() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.Y;
    }

    public final boolean aX() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.ab;
    }

    public final boolean aY() {
        ajcn ajcnVar = this.d.y;
        if (ajcnVar == null) {
            ajcnVar = ajcn.a;
        }
        return ajcnVar.b;
    }

    public final boolean aZ() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.aF;
    }

    public final boolean aa() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.c & 131072) != 0) {
            akjl akjlVar = aoqdVar.F;
            if (akjlVar == null) {
                akjlVar = akjl.a;
            }
            if (akjlVar.h) {
                return true;
            }
        }
        return false;
    }

    public final boolean ab() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.N;
    }

    public final boolean ac() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.c & 131072) != 0) {
            akjl akjlVar = aoqdVar.F;
            if (akjlVar == null) {
                akjlVar = akjl.a;
            }
            if (akjlVar.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean ad() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.b & SemanticState.Obscured) != 0) {
            ajbx ajbxVar = aoqdVar.k;
            if (ajbxVar == null) {
                ajbxVar = ajbx.a;
            }
            if (ajbxVar.h) {
                return true;
            }
        }
        return false;
    }

    public final boolean ae() {
        akjx akjxVar = this.d.x;
        if (akjxVar == null) {
            akjxVar = akjx.b;
        }
        return akjxVar.g;
    }

    public final boolean af() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.V;
    }

    public final boolean ag() {
        akjl akjlVar = this.d.F;
        if (akjlVar == null) {
            akjlVar = akjl.a;
        }
        return akjlVar.d;
    }

    public final boolean ah() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.at;
    }

    public final boolean ai() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.aq;
    }

    public final boolean aj() {
        ajhg ajhgVar = this.d.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        amuq amuqVar = ajhgVar.m;
        if (amuqVar == null) {
            amuqVar = amuq.a;
        }
        return amuqVar.c;
    }

    public final boolean ak() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.aR && this.l;
    }

    public final boolean al() {
        aopd aopdVar = this.d.h;
        if (aopdVar == null) {
            aopdVar = aopd.a;
        }
        return aopdVar.d;
    }

    public final boolean am() {
        MediaCommonConfigOuterClass$ServerReadaheadConfig defaultInstance = E().h;
        if (defaultInstance == null) {
            defaultInstance = MediaCommonConfigOuterClass$ServerReadaheadConfig.getDefaultInstance();
        }
        return defaultInstance.b;
    }

    public final boolean an() {
        return !this.j && E().i;
    }

    public final boolean ao(wiz wizVar) {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.b & 2) == 0) {
            return false;
        }
        akwm akwmVar = aoqdVar.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int iBt = a.bt(akwmVar.ai);
        if (iBt == 0) {
            iBt = 1;
        }
        int i = iBt - 1;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    return wizVar.a();
                }
                return false;
            }
            if (wizVar != wiz.a && wizVar != wiz.d && wizVar != wiz.e) {
                return false;
            }
        }
        return true;
    }

    public final boolean ap() {
        aoqd aoqdVar = this.d;
        aopd aopdVar = aoqdVar.h;
        if (aopdVar == null) {
            aopdVar = aopd.a;
        }
        if ((aopdVar.b & 1) != 0) {
            return true;
        }
        aopd aopdVar2 = aoqdVar.h;
        if (aopdVar2 == null) {
            aopdVar2 = aopd.a;
        }
        return (aopdVar2.b & 4) != 0;
    }

    public final boolean aq() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.g;
    }

    public final boolean ar() {
        ajar ajarVar = this.d.v;
        if (ajarVar == null) {
            ajarVar = ajar.a;
        }
        return ajarVar.b;
    }

    public final boolean as() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.d & 2) != 0) {
            aptb aptbVar = aoqdVar.M;
            if (aptbVar == null) {
                aptbVar = aptb.a;
            }
            apta aptaVar = aptbVar.b;
            if (aptaVar == null) {
                aptaVar = apta.a;
            }
            if (aptaVar.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean at() {
        akcu akcuVar = this.d.I;
        if (akcuVar == null) {
            akcuVar = akcu.a;
        }
        int iBc = a.bc(akcuVar.d);
        return iBc != 0 && iBc == 4;
    }

    public final boolean au() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.d & 2) != 0) {
            aptb aptbVar = aoqdVar.M;
            if (aptbVar == null) {
                aptbVar = aptb.a;
            }
            apta aptaVar = aptbVar.b;
            if (aptaVar == null) {
                aptaVar = apta.a;
            }
            if ((aptaVar.b & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean av() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.c & 131072) != 0) {
            akjl akjlVar = aoqdVar.F;
            if (akjlVar == null) {
                akjlVar = akjl.a;
            }
            if (akjlVar.c) {
                return true;
            }
        }
        return false;
    }

    public final boolean aw(akwl akwlVar) {
        aoqd aoqdVar = this.d;
        akwm akwmVar = aoqdVar.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        if (akwmVar.aA.size() == 0) {
            return false;
        }
        akwm akwmVar2 = aoqdVar.f;
        if (akwmVar2 == null) {
            akwmVar2 = akwm.b;
        }
        return new aihx(akwmVar2.aA, akwm.a).contains(akwlVar);
    }

    public final boolean ax() {
        amyz amyzVar = this.d.r;
        if (amyzVar == null) {
            amyzVar = amyz.a;
        }
        return amyzVar.b;
    }

    public final boolean ay() {
        ajar ajarVar = this.d.v;
        if (ajarVar == null) {
            ajarVar = ajar.a;
        }
        return ajarVar.d;
    }

    public final boolean az() {
        MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance = this.d.e;
        if (defaultInstance == null) {
            defaultInstance = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
        }
        return defaultInstance.l;
    }

    public final float b() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        float f = akwmVar.l;
        if (f == 0.0f) {
            return 0.7f;
        }
        return f;
    }

    public final float c() {
        aoqd aoqdVar = this.d;
        akwm akwmVar = aoqdVar.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        if (akwmVar.as == 0.0f) {
            return 5.0f;
        }
        akwm akwmVar2 = aoqdVar.f;
        if (akwmVar2 == null) {
            akwmVar2 = akwm.b;
        }
        return akwmVar2.as;
    }

    public final float d() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.b & SemanticState.Obscured) != 0) {
            ajbx ajbxVar = aoqdVar.k;
            if (ajbxVar == null) {
                ajbxVar = ajbx.a;
            }
            if ((ajbxVar.b & SemanticState.Modal) != 0) {
                ajbx ajbxVar2 = aoqdVar.k;
                if (ajbxVar2 == null) {
                    ajbxVar2 = ajbx.a;
                }
                return ajbxVar2.f;
            }
        }
        return g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e(float f) {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        float f2 = akwmVar.ae;
        return f2 != 0.0f ? f2 : f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wiu) && this.d.equals(((wiu) obj).d);
    }

    public final float f(float f) {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        float f2 = akwmVar.aM;
        return f2 != 0.0f ? f2 : f;
    }

    public final float g() {
        aoqd aoqdVar = this.d;
        if ((aoqdVar.b & SemanticState.Obscured) == 0) {
            return 0.85f;
        }
        ajbx ajbxVar = aoqdVar.k;
        if (ajbxVar == null) {
            ajbxVar = ajbx.a;
        }
        return ajbxVar.e;
    }

    public final int h() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i = akwmVar.m;
        if (i == 0) {
            return 50;
        }
        return i;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final int i() {
        LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance = this.d.D;
        if (defaultInstance == null) {
            defaultInstance = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
        }
        double d = defaultInstance.f;
        if (d > 0.0d) {
            return (int) (d * 1000.0d);
        }
        return 40000;
    }

    public final int j() {
        aoqd aoqdVar = this.d;
        LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance = aoqdVar.D;
        if (defaultInstance == null) {
            defaultInstance = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
        }
        if ((defaultInstance.b & 1) == 0) {
            return 12000;
        }
        LivePlayerConfigOuterClass$LivePlayerConfig defaultInstance2 = aoqdVar.D;
        if (defaultInstance2 == null) {
            defaultInstance2 = LivePlayerConfigOuterClass$LivePlayerConfig.getDefaultInstance();
        }
        return (int) (defaultInstance2.c * 1000.0d);
    }

    public final int k() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.M;
    }

    public final int l() {
        apld apldVar = this.d.B;
        if (apldVar == null) {
            apldVar = apld.a;
        }
        return apldVar.j;
    }

    public final int m() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i = akwmVar.n;
        if (i == 0) {
            return 6500;
        }
        return i;
    }

    public final int n() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i = akwmVar.o;
        if (i == 0) {
            return 8000;
        }
        return i;
    }

    public final int o() {
        MediaCommonConfigOuterClass$MediaCommonConfig defaultInstance = this.d.e;
        if (defaultInstance == null) {
            defaultInstance = MediaCommonConfigOuterClass$MediaCommonConfig.getDefaultInstance();
        }
        akpa akpaVar = defaultInstance.c;
        if (akpaVar == null) {
            akpaVar = akpa.a;
        }
        return akpaVar.g;
    }

    public final int p() {
        akkf akkfVar = this.d.t;
        if (akkfVar == null) {
            akkfVar = akkf.a;
        }
        return akkfVar.b;
    }

    public final int q() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i = akwmVar.r;
        if (i <= 0) {
            return 1600;
        }
        return i;
    }

    public final int r() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        return akwmVar.W;
    }

    public final int s() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i = akwmVar.s;
        if (i <= 0) {
            return 5000;
        }
        return i;
    }

    public final long t(int i) {
        aihv aihvVar;
        aoqd aoqdVar = this.d;
        akwm akwmVar = aoqdVar.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i2 = akwmVar.k;
        if (i2 == 0) {
            i2 = 25000;
        }
        if ((aoqdVar.b & 2) != 0) {
            akwm akwmVar2 = aoqdVar.f;
            if (akwmVar2 == null) {
                akwmVar2 = akwm.b;
            }
            aihvVar = akwmVar2.ap;
        } else {
            aihvVar = null;
        }
        long jIntValue = i2;
        if (aihvVar != null && !aihvVar.isEmpty() && i < aihvVar.size()) {
            jIntValue = ((Integer) aihvVar.get(i)).intValue();
        }
        return jIntValue * 1000;
    }

    public final String toString() {
        return "PlayerConfigModel@" + this.d.hashCode();
    }

    public final long u() {
        aopd aopdVar = this.d.h;
        if (aopdVar == null) {
            aopdVar = aopd.a;
        }
        arev arevVar = aopdVar.g;
        if (arevVar == null) {
            arevVar = arev.a;
        }
        return arevVar.c;
    }

    public final long v() {
        aoqd aoqdVar = this.d;
        aopd aopdVar = aoqdVar.h;
        if (aopdVar == null) {
            aopdVar = aopd.a;
        }
        if ((aopdVar.b & 4) == 0) {
            return 0L;
        }
        aopd aopdVar2 = aoqdVar.h;
        if (aopdVar2 == null) {
            aopdVar2 = aopd.a;
        }
        arev arevVar = aopdVar2.c;
        if (arevVar == null) {
            arevVar = arev.a;
        }
        return arevVar.c;
    }

    public final long w() {
        aopd aopdVar = this.d.h;
        if (aopdVar == null) {
            aopdVar = aopd.a;
        }
        return aopdVar.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.d.toByteArray());
    }

    public final long x() {
        aopd aopdVar = this.d.h;
        if (aopdVar == null) {
            aopdVar = aopd.a;
        }
        return aopdVar.e;
    }

    public final long y() {
        akwm akwmVar = this.d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i = akwmVar.az;
        if (i != 0) {
            return i;
        }
        return 2000L;
    }

    public final long z() {
        akjx akjxVar = this.d.x;
        if (akjxVar == null) {
            akjxVar = akjx.b;
        }
        long j = akjxVar.d;
        if (j == 0) {
            return Long.MAX_VALUE;
        }
        return j;
    }
}
