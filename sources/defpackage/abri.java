package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abri extends wlu implements tmv {
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public alvs J;
    public long K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public String Q;
    public boolean R;
    public boolean S;
    public String T;
    public String U;
    public String V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public String a;
    public aooj aa;
    public aphs ab;
    public String ac;
    public zfp ad;
    public amyf ae;
    public Duration af;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    private final Set ak;
    private final aunn al;
    private final abmt am;
    private final Set an;
    private String ao;
    private Integer ap;
    private String aq;
    private final List ar;
    private final dov as;
    public boolean b;
    public String c;
    public String d;
    public int e;

    public abri(abxv abxvVar, zwa zwaVar, boolean z, dov dovVar, Set set, aunn aunnVar, abmt abmtVar) {
        super("player", abxvVar, zwaVar, 3, z, null, null);
        this.e = -1;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.an = new HashSet();
        this.K = -1L;
        this.L = -1;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.P = false;
        this.Q = "";
        this.R = false;
        this.S = false;
        this.ap = null;
        this.U = null;
        this.ag = 1;
        this.ah = 1;
        this.ai = 1;
        this.V = "";
        this.W = -1;
        this.X = -1;
        this.Y = 0;
        this.Z = -1;
        this.aj = 1;
        this.ar = new ArrayList();
        this.as = dovVar;
        this.ak = new HashSet(set);
        this.al = aunnVar;
        this.am = abmtVar;
    }

    public final void F(abrh abrhVar) {
        this.an.add(abrhVar);
    }

    public final void G(int i) {
        this.ap = Integer.valueOf(i);
    }

    public final void H(boolean z) {
        this.H = z;
        e();
    }

    public final void I(aihf aihfVar) {
        if (!this.S) {
            this.a.getClass();
        } else if (!this.b) {
            ahno.F((TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.d)) ? false : true);
        }
        typ.f(this.r);
        ahno.O((((InnertubeContext$InnerTubeContext) aihfVar.instance).b & SemanticState.Hidden) != 0);
        aloi aloiVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).i;
        if (aloiVar == null) {
            aloiVar = aloi.a;
        }
        boolean z = false;
        for (amgu amguVar : aloiVar.c) {
            if (amguVar.e.equals("ms") && amguVar.c == 2) {
                z = true;
            }
        }
        ahno.O(z);
        if ((((InnertubeContext$InnerTubeContext) aihfVar.instance).b & 2) == 0) {
            if (this.G) {
                if (this.F) {
                    return;
                }
                typ.f(this.V);
            } else if (this.ap == null) {
                ahno.O(this.F || this.h);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // defpackage.wkf
    public final String Y() {
        String str = this.ao;
        if (str != null) {
            return str;
        }
        dov dovVarE = E();
        boolean z = true;
        if (!this.I) {
            abmt abmtVar = this.am;
            if (!abmtVar.aI() && (!abmtVar.e.m(30, 45368601L) || !this.H)) {
                z = false;
            }
        }
        abmt abmtVar2 = this.am;
        boolean zL = abmtVar2.e.l(39, 45370174L, false);
        if (z || zL) {
            dovVarE.F("clickTrackingParams", "shared");
            if (!z || abmtVar2.q.l(270, 45813015L, false)) {
                dovVarE.G("autoplay", this.O);
                dovVarE.G("autonav", this.P);
            }
        } else {
            dovVarE.G("autoplay", this.O);
            dovVarE.G("autonav", this.P);
        }
        dovVarE.F("videoId", this.a);
        dovVarE.F("playlistId", j(this.d));
        dovVarE.E("playlistIndex", f(this.e));
        String str2 = this.U;
        if (str2 != null) {
            dovVarE.F("cacheToken", str2);
        } else {
            dovVarE.F("playerParams", j(this.c));
        }
        dovVarE.E("dataExpiredForSeconds", f(this.Z));
        dovVarE.G("isOfflineRequest", this.F);
        int i = this.aj;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        dovVarE.E("offlineDownloadUserChoice", i2);
        dovVarE.E("offlineStorageFormat", 0L);
        dovVarE.H("offlineSharingWrappedKey", y(null));
        String str3 = this.ac;
        if (str3 != null) {
            dovVarE.F("offlinePlayerToken", str3);
        }
        dovVarE.G("scriptedPlay", this.R);
        dovVarE.F("serializedThirdPartyEmbedConfig", null);
        Iterator it = this.an.iterator();
        while (it.hasNext()) {
            ((abrh) it.next()).a(dovVarE);
        }
        String strD = dovVarE.D();
        this.ao = strD;
        return strD;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alvr.a.createBuilder();
        boolean z = this.E;
        aihfVarCreateBuilder.copyOnWrite();
        alvr alvrVar = (alvr) aihfVarCreateBuilder.instance;
        alvrVar.b |= 8;
        alvrVar.f = z;
        boolean z2 = this.D;
        aihfVarCreateBuilder.copyOnWrite();
        alvr alvrVar2 = (alvr) aihfVarCreateBuilder.instance;
        alvrVar2.b |= 4;
        alvrVar2.e = z2;
        boolean z3 = this.F;
        aihfVarCreateBuilder.copyOnWrite();
        alvr alvrVar3 = (alvr) aihfVarCreateBuilder.instance;
        alvrVar3.b |= 32;
        alvrVar3.h = z3;
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar4 = (alvr) aihfVarCreateBuilder.instance;
            str.getClass();
            alvrVar4.b |= 2;
            alvrVar4.d = str;
        }
        if (!TextUtils.isEmpty(this.T)) {
            String str2 = this.T;
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar5 = (alvr) aihfVarCreateBuilder.instance;
            str2.getClass();
            alvrVar5.b |= 262144;
            alvrVar5.n = str2;
        }
        aihf aihfVarCreateBuilder2 = aooi.a.createBuilder();
        if (!TextUtils.isEmpty(this.c)) {
            String str3 = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar6 = (alvr) aihfVarCreateBuilder.instance;
            str3.getClass();
            alvrVar6.b |= SemanticState.Modal;
            alvrVar6.l = str3;
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str4 = this.d;
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar7 = (alvr) aihfVarCreateBuilder.instance;
            str4.getClass();
            alvrVar7.b |= SemanticState.Hidden;
            alvrVar7.i = str4;
            int i = this.e;
            if (i >= 0) {
                aihfVarCreateBuilder.copyOnWrite();
                alvr alvrVar8 = (alvr) aihfVarCreateBuilder.instance;
                alvrVar8.b |= SemanticState.LiveRegion;
                alvrVar8.j = i;
            }
        }
        Set set = (Set) this.al.io();
        if (!set.isEmpty()) {
            aihf aihfVarCreateBuilder3 = aoof.a.createBuilder();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((abqz) it.next()).a();
            }
            aoof aoofVar = (aoof) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aooi aooiVar = (aooi) aihfVarCreateBuilder2.instance;
            aoofVar.getClass();
            aooiVar.i = aoofVar;
            aooiVar.b |= 64;
        }
        if (this.G) {
            aihf aihfVarCreateBuilder4 = aiuk.a.createBuilder();
            int i2 = this.ag;
            aihfVarCreateBuilder4.copyOnWrite();
            aiuk aiukVar = (aiuk) aihfVarCreateBuilder4.instance;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            aiukVar.c = i3;
            aiukVar.b |= 1;
            int i4 = this.ah;
            aihfVarCreateBuilder4.copyOnWrite();
            aiuk aiukVar2 = (aiuk) aihfVarCreateBuilder4.instance;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            aiukVar2.d = i5;
            aiukVar2.b |= 2;
            int i6 = this.ai;
            aihfVarCreateBuilder4.copyOnWrite();
            aiuk aiukVar3 = (aiuk) aihfVarCreateBuilder4.instance;
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            aiukVar3.e = i7;
            aiukVar3.b |= 4;
            String str5 = this.V;
            aihfVarCreateBuilder4.copyOnWrite();
            aiuk aiukVar4 = (aiuk) aihfVarCreateBuilder4.instance;
            str5.getClass();
            aiukVar4.b |= 16;
            aiukVar4.f = str5;
            aiuk aiukVar5 = (aiuk) aihfVarCreateBuilder4.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aooi aooiVar2 = (aooi) aihfVarCreateBuilder2.instance;
            aiukVar5.getClass();
            aooiVar2.d = aiukVar5;
            aooiVar2.b |= 2;
        } else {
            aihf aihfVarCreateBuilder5 = aooe.a.createBuilder();
            Iterator it2 = this.ak.iterator();
            while (it2.hasNext()) {
                ((abqy) it2.next()).a();
            }
            long j = this.K;
            if (j != -1) {
                aihfVarCreateBuilder5.copyOnWrite();
                aooe aooeVar = (aooe) aihfVarCreateBuilder5.instance;
                aooeVar.b |= 4;
                aooeVar.d = j;
            }
            int i8 = this.L;
            if (i8 != -1) {
                aihfVarCreateBuilder5.copyOnWrite();
                aooe aooeVar2 = (aooe) aihfVarCreateBuilder5.instance;
                aooeVar2.b |= 2;
                aooeVar2.c = i8;
            }
            int i9 = this.N;
            if (i9 != -1) {
                aihfVarCreateBuilder5.copyOnWrite();
                aooe aooeVar3 = (aooe) aihfVarCreateBuilder5.instance;
                aooeVar3.b |= 8;
                aooeVar3.e = i9;
            }
            Integer num = this.ap;
            if (num != null && num.intValue() != -1) {
                int iIntValue = this.ap.intValue();
                aihfVarCreateBuilder5.copyOnWrite();
                aooe aooeVar4 = (aooe) aihfVarCreateBuilder5.instance;
                aooeVar4.b |= 32;
                aooeVar4.g = iIntValue;
            }
            int i10 = this.W;
            if (i10 != -1) {
                aihfVarCreateBuilder5.copyOnWrite();
                aooe aooeVar5 = (aooe) aihfVarCreateBuilder5.instance;
                aooeVar5.b |= 64;
                aooeVar5.h = i10;
            }
            int i11 = this.X;
            if (i11 != -1) {
                aihfVarCreateBuilder5.copyOnWrite();
                aooe aooeVar6 = (aooe) aihfVarCreateBuilder5.instance;
                aooeVar6.b |= SemanticState.Focused;
                aooeVar6.i = i11;
            }
            int i12 = this.Y;
            aihfVarCreateBuilder5.copyOnWrite();
            aooe aooeVar7 = (aooe) aihfVarCreateBuilder5.instance;
            aooeVar7.b |= SemanticState.Hidden;
            aooeVar7.j = i12;
            boolean z4 = this.O;
            aihfVarCreateBuilder5.copyOnWrite();
            aooe aooeVar8 = (aooe) aihfVarCreateBuilder5.instance;
            aooeVar8.b |= SemanticState.Modal;
            aooeVar8.l = z4;
            boolean z5 = this.P;
            aihfVarCreateBuilder5.copyOnWrite();
            aooe aooeVar9 = (aooe) aihfVarCreateBuilder5.instance;
            aooeVar9.b |= 4194304;
            aooeVar9.n = z5;
            String str6 = this.Q;
            aihfVarCreateBuilder5.copyOnWrite();
            aooe aooeVar10 = (aooe) aihfVarCreateBuilder5.instance;
            str6.getClass();
            aooeVar10.b |= 16384;
            aooeVar10.m = str6;
            boolean z6 = this.R;
            aihfVarCreateBuilder5.copyOnWrite();
            aooe aooeVar11 = (aooe) aihfVarCreateBuilder5.instance;
            aooeVar11.b |= SemanticState.ReadOnly;
            aooeVar11.k = z6;
            int i13 = this.M;
            aihfVarCreateBuilder5.copyOnWrite();
            aooe aooeVar12 = (aooe) aihfVarCreateBuilder5.instance;
            aooeVar12.b |= 16;
            aooeVar12.f = i13;
            if (this.ae != null) {
                aihf aihfVarCreateBuilder6 = aoog.a.createBuilder();
                amyf amyfVar = this.ae;
                aihfVarCreateBuilder6.copyOnWrite();
                aoog aoogVar = (aoog) aihfVarCreateBuilder6.instance;
                amyfVar.getClass();
                aoogVar.c = amyfVar;
                aoogVar.b |= 8;
                aoog aoogVar2 = (aoog) aihfVarCreateBuilder6.build();
                aihfVarCreateBuilder5.copyOnWrite();
                aooe aooeVar13 = (aooe) aihfVarCreateBuilder5.instance;
                aoogVar2.getClass();
                aooeVar13.p = aoogVar2;
                aooeVar13.b |= 67108864;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aooi aooiVar3 = (aooi) aihfVarCreateBuilder2.instance;
            aooe aooeVar14 = (aooe) aihfVarCreateBuilder5.build();
            aooeVar14.getClass();
            aooiVar3.c = aooeVar14;
            aooiVar3.b |= 1;
            if (this.ad != null) {
                aihf aihfVarCreateBuilder7 = appy.a.createBuilder();
                aigj aigjVarV = aigj.v(this.ad.b);
                aihfVarCreateBuilder7.copyOnWrite();
                appy appyVar = (appy) aihfVarCreateBuilder7.instance;
                aigjVarV.getClass();
                appyVar.b |= 1;
                appyVar.c = aigjVarV;
                appy appyVar2 = (appy) aihfVarCreateBuilder7.build();
                aihfVarCreateBuilder.copyOnWrite();
                alvr alvrVar9 = (alvr) aihfVarCreateBuilder.instance;
                appyVar2.getClass();
                alvrVar9.p = appyVar2;
                alvrVar9.b |= 2097152;
            }
        }
        if (this.Z != -1) {
            aihf aihfVarCreateBuilder8 = aool.a.createBuilder();
            int i14 = this.Z;
            aihfVarCreateBuilder8.copyOnWrite();
            aool aoolVar = (aool) aihfVarCreateBuilder8.instance;
            aoolVar.b |= 1;
            aoolVar.c = i14;
            aool aoolVar2 = (aool) aihfVarCreateBuilder8.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aooi aooiVar4 = (aooi) aihfVarCreateBuilder2.instance;
            aoolVar2.getClass();
            aooiVar4.f = aoolVar2;
            aooiVar4.b |= 8;
        }
        aooj aoojVar = this.aa;
        if (aoojVar != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            aooi aooiVar5 = (aooi) aihfVarCreateBuilder2.instance;
            aooiVar5.e = aoojVar;
            aooiVar5.b |= 4;
        }
        if (this.aj != 1 || this.ac != null) {
            aihf aihfVarCreateBuilder9 = aooh.a.createBuilder();
            int i15 = this.aj;
            aihfVarCreateBuilder9.copyOnWrite();
            aooh aoohVar = (aooh) aihfVarCreateBuilder9.instance;
            int i16 = i15 - 1;
            if (i15 == 0) {
                throw null;
            }
            aoohVar.c = i16;
            aoohVar.b |= 1;
            aihfVarCreateBuilder9.copyOnWrite();
            aooh aoohVar2 = (aooh) aihfVarCreateBuilder9.instance;
            aoohVar2.d = 0;
            aoohVar2.b |= 4;
            String str7 = this.ac;
            if (str7 != null) {
                aihfVarCreateBuilder9.copyOnWrite();
                aooh aoohVar3 = (aooh) aihfVarCreateBuilder9.instance;
                aoohVar3.b |= 8;
                aoohVar3.e = str7;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aooi aooiVar6 = (aooi) aihfVarCreateBuilder2.instance;
            aooh aoohVar4 = (aooh) aihfVarCreateBuilder9.build();
            aoohVar4.getClass();
            aooiVar6.g = aoohVar4;
            aooiVar6.b |= 16;
        }
        aphs aphsVar = this.ab;
        if (aphsVar != null) {
            aihf aihfVarCreateBuilder10 = aook.a.createBuilder();
            aihfVarCreateBuilder10.copyOnWrite();
            aook aookVar = (aook) aihfVarCreateBuilder10.instance;
            aookVar.c = aphsVar;
            aookVar.b |= 1;
            aihfVarCreateBuilder2.copyOnWrite();
            aooi aooiVar7 = (aooi) aihfVarCreateBuilder2.instance;
            aook aookVar2 = (aook) aihfVarCreateBuilder10.build();
            aookVar2.getClass();
            aooiVar7.h = aookVar2;
            aooiVar7.b |= 32;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alvr alvrVar10 = (alvr) aihfVarCreateBuilder.instance;
        aooi aooiVar8 = (aooi) aihfVarCreateBuilder2.build();
        aooiVar8.getClass();
        alvrVar10.g = aooiVar8;
        alvrVar10.b |= 16;
        List list = this.ar;
        aihfVarCreateBuilder.copyOnWrite();
        alvr alvrVar11 = (alvr) aihfVarCreateBuilder.instance;
        aihv aihvVar = alvrVar11.m;
        if (!aihvVar.c()) {
            alvrVar11.m = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(list, alvrVar11.m);
        alvs alvsVar = this.J;
        if (alvsVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar12 = (alvr) aihfVarCreateBuilder.instance;
            alvrVar12.o = alvsVar;
            alvrVar12.b |= 1048576;
        }
        Duration duration = this.af;
        if (duration != null) {
            int seconds = (int) duration.toSeconds();
            aihfVarCreateBuilder.copyOnWrite();
            alvr alvrVar13 = (alvr) aihfVarCreateBuilder.instance;
            alvrVar13.b |= SemanticState.ReadOnly;
            alvrVar13.k = seconds;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        I(B());
    }

    public final void e() {
        this.ao = null;
    }

    @Override // defpackage.wkf
    public final Map k() {
        if (this.f == null) {
            super.k();
            if (this.aq == null) {
                this.aq = this.as.af(9);
            }
            this.f.put("id", this.a);
            this.f.put("t", this.aq);
        }
        return this.f;
    }
}
