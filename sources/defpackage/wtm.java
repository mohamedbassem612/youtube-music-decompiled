package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtm extends wlu {
    public boolean D;
    public alxq E;
    private final List F;
    private final String G;
    private final alxr H;
    private final aihf I;
    public String a;
    public String b;
    public alxu c;
    public alap d;
    public String e;

    public wtm(abxv abxvVar, zwa zwaVar, boolean z, boolean z2) {
        super(abxvVar, zwaVar, z, z2);
        this.F = new ArrayList();
        this.G = "";
        this.H = alxr.SEARCH_PAGE_TYPE_UNKNOWN;
        this.E = alxq.MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED;
        this.I = alxc.a.createBuilder();
        m();
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVarE = E();
        dovVarE.F("query", this.a);
        dovVarE.F("params", this.b);
        dovVarE.F("conversationId", null);
        dovVarE.F("continuation", this.i);
        dovVarE.H("filterOptions", ((alxc) this.I.build()).toByteArray());
        alap alapVar = this.d;
        if (alapVar != null) {
            dovVarE.H("genericFormData", alapVar.toByteArray());
        }
        alxq alxqVar = this.E;
        if (alxqVar != alxq.MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED) {
            dovVarE.E("musicSearchRequestType", alxqVar.h);
        }
        return dovVarE.D();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alxh.a.createBuilder();
        String str = this.b;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar = (alxh) aihfVarCreateBuilder.instance;
            alxhVar.b |= 8;
            alxhVar.g = str;
        }
        aihf aihfVar = this.I;
        if (aihfVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar2 = (alxh) aihfVarCreateBuilder.instance;
            alxc alxcVar = (alxc) aihfVar.build();
            alxcVar.getClass();
            alxhVar2.j = alxcVar;
            alxhVar2.b |= 64;
        }
        String str2 = this.a;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar3 = (alxh) aihfVarCreateBuilder.instance;
            alxhVar3.b |= 2;
            alxhVar3.e = str2;
        }
        alap alapVar = this.d;
        if (alapVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar4 = (alxh) aihfVarCreateBuilder.instance;
            alxhVar4.k = alapVar;
            alxhVar4.b |= SemanticState.Hidden;
        }
        String str3 = this.e;
        if (str3 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar5 = (alxh) aihfVarCreateBuilder.instance;
            alxhVar5.b |= 8388608;
            alxhVar5.n = str3;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alxh alxhVar6 = (alxh) aihfVarCreateBuilder.instance;
        alxhVar6.i = 0;
        alxhVar6.b |= 32;
        if (!TextUtils.isEmpty(this.i)) {
            String str4 = this.i;
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar7 = (alxh) aihfVarCreateBuilder.instance;
            str4.getClass();
            alxhVar7.b |= 16;
            alxhVar7.h = str4;
        }
        List list = this.F;
        aihfVarCreateBuilder.copyOnWrite();
        alxh alxhVar8 = (alxh) aihfVarCreateBuilder.instance;
        aihv aihvVar = alxhVar8.p;
        if (!aihvVar.c()) {
            alxhVar8.p = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(list, alxhVar8.p);
        alxu alxuVar = this.c;
        if (alxuVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar9 = (alxh) aihfVarCreateBuilder.instance;
            alxhVar9.l = alxuVar;
            alxhVar9.b |= SemanticState.Obscured;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alxh alxhVar10 = (alxh) aihfVarCreateBuilder.instance;
        alxhVar10.b |= 2097152;
        alxhVar10.m = false;
        boolean z = this.D;
        aihfVarCreateBuilder.copyOnWrite();
        alxh alxhVar11 = (alxh) aihfVarCreateBuilder.instance;
        alxhVar11.b |= 16777216;
        alxhVar11.o = z;
        aihf aihfVarCreateBuilder2 = apnh.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        apnh apnhVar = (apnh) aihfVarCreateBuilder2.instance;
        apnhVar.b |= 2;
        apnhVar.c = false;
        aihfVarCreateBuilder2.copyOnWrite();
        apnh apnhVar2 = (apnh) aihfVarCreateBuilder2.instance;
        apnhVar2.b |= 8;
        apnhVar2.d = false;
        apnh apnhVar3 = (apnh) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        alxh alxhVar12 = (alxh) aihfVarCreateBuilder.instance;
        apnhVar3.getClass();
        alxhVar12.q = apnhVar3;
        alxhVar12.b |= 1073741824;
        aihf aihfVarCreateBuilder3 = apne.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        apne apneVar = (apne) aihfVarCreateBuilder3.instance;
        apneVar.b |= 1;
        apneVar.c = false;
        String str5 = this.G;
        aihfVarCreateBuilder3.copyOnWrite();
        apne apneVar2 = (apne) aihfVarCreateBuilder3.instance;
        apneVar2.b |= 2;
        apneVar2.d = str5;
        apne apneVar3 = (apne) aihfVarCreateBuilder3.build();
        aihfVarCreateBuilder.copyOnWrite();
        alxh alxhVar13 = (alxh) aihfVarCreateBuilder.instance;
        apneVar3.getClass();
        alxhVar13.r = apneVar3;
        alxhVar13.b |= Integer.MIN_VALUE;
        alxr alxrVar = this.H;
        if (alxrVar != alxr.SEARCH_PAGE_TYPE_UNKNOWN) {
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar14 = (alxh) aihfVarCreateBuilder.instance;
            alxhVar14.f = alxrVar.i;
            alxhVar14.b |= 4;
        }
        alxq alxqVar = this.E;
        if (alxqVar != alxq.MUSIC_SEARCH_REQUEST_TYPE_UNSPECIFIED) {
            aihfVarCreateBuilder.copyOnWrite();
            alxh alxhVar15 = (alxh) aihfVarCreateBuilder.instance;
            alxhVar15.s = alxqVar.h;
            alxhVar15.c |= 32;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        if (wto.c.contains(this.H)) {
            return;
        }
        A(this.a, this.i);
    }
}
