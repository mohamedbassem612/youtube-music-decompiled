package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wpk extends wlu {
    public String D;
    public List E;
    private final String F;
    private final String G;
    private final String H;
    private final String I;
    private final String J;
    private final String K;
    private final agke L;
    private final agke M;
    public String a;
    public String b;
    public Long c;
    public String d;
    public Integer e;

    public wpk(abxv abxvVar, zwa zwaVar) {
        super("comment/create_comment", abxvVar, zwaVar, 1, true, null, null);
        this.a = "";
        this.b = "";
        this.F = "";
        this.G = "";
        this.H = "";
        this.I = "";
        this.J = "";
        this.K = "";
        agke agkeVar = agpi.a;
        this.L = agkeVar;
        this.M = agkeVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.D = "";
        this.E = null;
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alnt.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alnt alntVar = (alnt) aihfVarCreateBuilder.instance;
        str.getClass();
        alntVar.b |= 2;
        alntVar.f = str;
        String str2 = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alnt alntVar2 = (alnt) aihfVarCreateBuilder.instance;
        str2.getClass();
        alntVar2.b |= 4;
        alntVar2.g = str2;
        aihfVarCreateBuilder.copyOnWrite();
        alnt alntVar3 = (alnt) aihfVarCreateBuilder.instance;
        alntVar3.b |= 32768;
        alntVar3.n = false;
        Long l = this.c;
        if (l != null) {
            long jLongValue = l.longValue();
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar4 = (alnt) aihfVarCreateBuilder.instance;
            alntVar4.b |= SemanticState.LiveRegion;
            alntVar4.j = jLongValue;
        }
        Integer num = this.e;
        if (num != null) {
            int iIntValue = num.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar5 = (alnt) aihfVarCreateBuilder.instance;
            alntVar5.b |= SemanticState.Obscured;
            alntVar5.k = iIntValue;
        }
        String str3 = this.d;
        if (str3 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar6 = (alnt) aihfVarCreateBuilder.instance;
            alntVar6.b |= 8;
            alntVar6.h = str3;
        }
        String str4 = this.F;
        if (!TextUtils.isEmpty(str4)) {
            aihf aihfVarCreateBuilder2 = alnc.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            alnc alncVar = (alnc) aihfVarCreateBuilder2.instance;
            alncVar.b |= 1;
            alncVar.c = str4;
            String str5 = this.J;
            if (!TextUtils.isEmpty(str5)) {
                aihfVarCreateBuilder2.copyOnWrite();
                alnc alncVar2 = (alnc) aihfVarCreateBuilder2.instance;
                alncVar2.b |= 2;
                alncVar2.d = str5;
            }
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar7 = (alnt) aihfVarCreateBuilder.instance;
            alnc alncVar3 = (alnc) aihfVarCreateBuilder2.build();
            alncVar3.getClass();
            alntVar7.d = alncVar3;
            alntVar7.c = 9;
        }
        String str6 = this.G;
        if (!TextUtils.isEmpty(str6)) {
            aihf aihfVarCreateBuilder3 = alnh.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            alnh alnhVar = (alnh) aihfVarCreateBuilder3.instance;
            alnhVar.b |= 1;
            alnhVar.c = str6;
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar8 = (alnt) aihfVarCreateBuilder.instance;
            alnh alnhVar2 = (alnh) aihfVarCreateBuilder3.build();
            alnhVar2.getClass();
            alntVar8.d = alnhVar2;
            alntVar8.c = 7;
        }
        String str7 = this.H;
        if (!TextUtils.isEmpty(str7)) {
            aihf aihfVarCreateBuilder4 = alnd.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            alnd alndVar = (alnd) aihfVarCreateBuilder4.instance;
            alndVar.b |= 1;
            alndVar.c = str7;
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar9 = (alnt) aihfVarCreateBuilder.instance;
            alnd alndVar2 = (alnd) aihfVarCreateBuilder4.build();
            alndVar2.getClass();
            alntVar9.d = alndVar2;
            alntVar9.c = 10;
        }
        String str8 = this.K;
        if (!TextUtils.isEmpty(str8)) {
            aihf aihfVarCreateBuilder5 = alng.a.createBuilder();
            aihfVarCreateBuilder5.copyOnWrite();
            alng alngVar = (alng) aihfVarCreateBuilder5.instance;
            alngVar.b |= 1;
            alngVar.c = str8;
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar10 = (alnt) aihfVarCreateBuilder.instance;
            alng alngVar2 = (alng) aihfVarCreateBuilder5.build();
            alngVar2.getClass();
            alntVar10.d = alngVar2;
            alntVar10.c = 15;
        }
        String str9 = this.I;
        if (!TextUtils.isEmpty(str9)) {
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar11 = (alnt) aihfVarCreateBuilder.instance;
            alntVar11.b |= 64;
            alntVar11.i = str9;
        }
        agke agkeVar = this.L;
        if (!agkeVar.isEmpty()) {
            aihf aihfVarCreateBuilder6 = aoxi.a.createBuilder();
            aihfVarCreateBuilder6.copyOnWrite();
            aoxi aoxiVar = (aoxi) aihfVarCreateBuilder6.instance;
            aiie aiieVar = aoxiVar.b;
            if (!aiieVar.c()) {
                aoxiVar.b = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(agkeVar, aoxiVar.b);
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar12 = (alnt) aihfVarCreateBuilder.instance;
            aoxi aoxiVar2 = (aoxi) aihfVarCreateBuilder6.build();
            aoxiVar2.getClass();
            alntVar12.d = aoxiVar2;
            alntVar12.c = 20;
        }
        agke agkeVar2 = this.M;
        if (!agkeVar2.isEmpty()) {
            aihf aihfVarCreateBuilder7 = aoxk.a.createBuilder();
            aihfVarCreateBuilder7.copyOnWrite();
            aoxk aoxkVar = (aoxk) aihfVarCreateBuilder7.instance;
            aiie aiieVar2 = aoxkVar.b;
            if (!aiieVar2.c()) {
                aoxkVar.b = aihn.mutableCopy(aiieVar2);
            }
            aifs.addAll(agkeVar2, aoxkVar.b);
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar13 = (alnt) aihfVarCreateBuilder.instance;
            aoxk aoxkVar2 = (aoxk) aihfVarCreateBuilder7.build();
            aoxkVar2.getClass();
            alntVar13.d = aoxkVar2;
            alntVar13.c = 24;
        }
        if (!TextUtils.isEmpty(this.D)) {
            String str10 = this.D;
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar14 = (alnt) aihfVarCreateBuilder.instance;
            str10.getClass();
            alntVar14.b |= SemanticState.Multiline;
            alntVar14.l = str10;
        }
        List list = this.E;
        if (list != null && !list.isEmpty()) {
            List list2 = this.E;
            aihfVarCreateBuilder.copyOnWrite();
            alnt alntVar15 = (alnt) aihfVarCreateBuilder.instance;
            aiie aiieVar3 = alntVar15.m;
            if (!aiieVar3.c()) {
                alntVar15.m = aihn.mutableCopy(aiieVar3);
            }
            aifs.addAll(list2, alntVar15.m);
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.a);
        boolean z = true;
        if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.F) && TextUtils.isEmpty(this.d)) {
            z = false;
        }
        ahno.F(z);
    }
}
