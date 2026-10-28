package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wuq extends wlu implements tmv {
    public final List D;
    public boolean E;
    public boolean F;
    public long G;
    public amac H;
    public amyf I;
    public boolean J;
    public boolean K;
    public ajmm L;
    public Optional M;
    public Optional N;
    public Optional O;
    private String P;
    private String Q;
    private String R;
    private final Optional S;
    private final Optional T;
    private final Optional U;
    private final Optional V;
    private int W;
    public int a;
    public String b;
    public String c;
    public volatile boolean d;
    public volatile boolean e;

    public wuq(abxv abxvVar, zwa zwaVar, boolean z, Optional optional) {
        super("next", abxvVar, zwaVar, 3, z, optional);
        this.a = 0;
        this.d = false;
        this.e = false;
        this.W = 3;
        this.D = new ArrayList();
        this.E = false;
        this.F = false;
        this.G = -1L;
        this.J = false;
        this.K = false;
        this.M = Optional.empty();
        this.N = Optional.empty();
        this.S = Optional.empty();
        this.T = Optional.empty();
        this.U = Optional.empty();
        this.V = Optional.empty();
        this.O = Optional.empty();
    }

    public final void F(String str) {
        str.getClass();
        this.R = str;
    }

    public final void G(String str) {
        str.getClass();
        this.Q = str;
    }

    public final void H(String str) {
        str.getClass();
        this.P = str;
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVarE = E();
        dovVarE.F("videoId", this.P);
        dovVarE.F("playlistId", this.Q);
        int i = this.a;
        if (i < 0) {
            i = 0;
        }
        dovVarE.E("playlistIndex", i);
        dovVarE.F("params", this.R);
        dovVarE.F("adParams", this.c);
        dovVarE.F("continuation", this.i);
        dovVarE.G("isAdPlayback", this.d);
        dovVarE.G("mdxUseDevServer", false);
        amac amacVar = this.H;
        if (amacVar != null) {
            dovVarE.E("watchNextType", amacVar.h);
        }
        dovVarE.F("forceAdUrls", "null");
        dovVarE.F("forceAdGroupId", null);
        dovVarE.F("forceBibliotecaAdId", null);
        dovVarE.F("forceViralAdResponseUrl", null);
        dovVarE.F("forcePresetAd", null);
        dovVarE.G("isAudioOnly", this.E);
        dovVarE.F("serializedThirdPartyEmbedConfig", null);
        dovVarE.E("playerTimestamp", -1L);
        dovVarE.F("lastScrubbedInlinePlaybackId", null);
        dovVarE.F("lastAudioTurnedOnInlinePlaybackId", null);
        dovVarE.F("lastAudioTurnedOffInlinePlaybackId", null);
        dovVarE.G("captionsRequested", false);
        dovVarE.G("allowAdultContent", this.K);
        dovVarE.G("allowControversialContent", this.J);
        this.T.isPresent();
        this.U.isPresent();
        this.V.isPresent();
        if (this.O.isPresent()) {
            dovVarE.G("isReloadWatchNextRequest", ((Boolean) this.O.get()).booleanValue());
        }
        return dovVarE.D();
    }

    @Override // defpackage.wlu
    public final /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = amad.a.createBuilder();
        boolean z = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar = (amad) aihfVarCreateBuilder.instance;
        amadVar.b |= SemanticState.Focused;
        amadVar.k = z;
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar2 = (amad) aihfVarCreateBuilder.instance;
        amadVar2.b |= SemanticState.Modal;
        amadVar2.o = false;
        boolean z2 = this.E;
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar3 = (amad) aihfVarCreateBuilder.instance;
        amadVar3.b |= 1048576;
        amadVar3.r = z2;
        boolean z3 = this.F;
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar4 = (amad) aihfVarCreateBuilder.instance;
        amadVar4.b |= 8388608;
        amadVar4.s = z3;
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar5 = (amad) aihfVarCreateBuilder.instance;
        amadVar5.c |= 64;
        amadVar5.u = false;
        boolean z4 = this.K;
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar6 = (amad) aihfVarCreateBuilder.instance;
        amadVar6.b |= SemanticState.ReadOnly;
        amadVar6.n = z4;
        boolean z5 = this.J;
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar7 = (amad) aihfVarCreateBuilder.instance;
        amadVar7.b |= SemanticState.LiveRegion;
        amadVar7.m = z5;
        if (!TextUtils.isEmpty(this.P)) {
            String str = this.P;
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar8 = (amad) aihfVarCreateBuilder.instance;
            str.getClass();
            amadVar8.b |= 2;
            amadVar8.e = str;
        }
        if (!TextUtils.isEmpty(this.Q)) {
            String str2 = this.Q;
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar9 = (amad) aihfVarCreateBuilder.instance;
            str2.getClass();
            amadVar9.b |= 4;
            amadVar9.f = str2;
        }
        if (!TextUtils.isEmpty(this.b)) {
            String str3 = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar10 = (amad) aihfVarCreateBuilder.instance;
            str3.getClass();
            amadVar10.b |= 64;
            amadVar10.j = str3;
        }
        int i = this.a;
        if (i > 0) {
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar11 = (amad) aihfVarCreateBuilder.instance;
            amadVar11.b |= 32;
            amadVar11.i = i;
        }
        String str4 = this.R;
        if (str4 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar12 = (amad) aihfVarCreateBuilder.instance;
            amadVar12.b |= 8;
            amadVar12.g = str4;
        }
        String str5 = this.c;
        if (str5 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar13 = (amad) aihfVarCreateBuilder.instance;
            amadVar13.b |= SemanticState.Hidden;
            amadVar13.l = str5;
        }
        amac amacVar = this.H;
        if (amacVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar14 = (amad) aihfVarCreateBuilder.instance;
            amadVar14.p = amacVar.h;
            amadVar14.b |= 16384;
        }
        if (!TextUtils.isEmpty(this.i)) {
            String str6 = this.i;
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar15 = (amad) aihfVarCreateBuilder.instance;
            str6.getClass();
            amadVar15.b |= 16;
            amadVar15.h = str6;
        }
        List list = this.D;
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar16 = (amad) aihfVarCreateBuilder.instance;
        aihv aihvVar = amadVar16.q;
        if (!aihvVar.c()) {
            amadVar16.q = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(list, amadVar16.q);
        amyf amyfVar = this.I;
        if (amyfVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar17 = (amad) aihfVarCreateBuilder.instance;
            amadVar17.v = amyfVar;
            amadVar17.c |= SemanticState.Focused;
        }
        ajmm ajmmVar = this.L;
        if (ajmmVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar18 = (amad) aihfVarCreateBuilder.instance;
            amadVar18.y = ajmmVar;
            amadVar18.c |= SemanticState.Modal;
        }
        if (this.M.isPresent() && !((aigj) this.M.get()).E()) {
            aigj aigjVar = (aigj) this.M.get();
            aihfVarCreateBuilder.copyOnWrite();
            amad amadVar19 = (amad) aihfVarCreateBuilder.instance;
            amadVar19.c |= SemanticState.LiveRegion;
            amadVar19.x = aigjVar;
        }
        Optional optional = this.N;
        hkp hkpVar = new hkp(aihfVarCreateBuilder, 12);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) hkpVar.a;
            aihfVar.copyOnWrite();
            amad amadVar20 = (amad) aihfVar.instance;
            amadVar20.w = (apla) obj;
            amadVar20.c |= SemanticState.Hidden;
        }
        this.S.isPresent();
        this.T.isPresent();
        this.U.isPresent();
        Optional optional2 = this.O;
        hkp hkpVar2 = new hkp(aihfVarCreateBuilder, 13);
        if (true == optional2.isPresent()) {
            Object obj2 = optional2.get();
            Object obj3 = hkpVar2.a;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            aihf aihfVar2 = (aihf) obj3;
            aihfVar2.copyOnWrite();
            amad amadVar21 = (amad) aihfVar2.instance;
            amadVar21.c |= 131072;
            amadVar21.z = zBooleanValue;
        }
        aihf aihfVarCreateBuilder2 = alzy.a.createBuilder();
        long j = this.G;
        aihfVarCreateBuilder2.copyOnWrite();
        alzy alzyVar = (alzy) aihfVarCreateBuilder2.instance;
        alzyVar.b |= 1;
        alzyVar.c = j;
        this.V.isPresent();
        aihfVarCreateBuilder.copyOnWrite();
        amad amadVar22 = (amad) aihfVarCreateBuilder.instance;
        alzy alzyVar2 = (alzy) aihfVarCreateBuilder2.build();
        alzyVar2.getClass();
        amadVar22.t = alzyVar2;
        amadVar22.b |= 134217728;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.i) && TextUtils.isEmpty(this.R)) {
            ajmm ajmmVar = this.L;
            if ((ajmmVar == null || ajmmVar.b != 440168742) && this.H != amac.WATCH_NEXT_TYPE_GET_QUEUE) {
                throw new IllegalStateException();
            }
        }
    }

    public final void e() {
        this.A = (this.d && this.e) ? 3 : this.W;
    }

    @Override // defpackage.wkf
    public final void z(int i) {
        this.A = i;
        this.W = i;
        e();
    }
}
