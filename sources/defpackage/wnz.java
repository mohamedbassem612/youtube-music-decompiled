package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wnz extends wlu {
    public long D;
    public int E;
    public long F;
    public aldg G;
    public long H;
    public int I;
    public int J;
    public int K;
    public int L;
    public String M;
    public boolean N;
    public aigj O;
    public aigj P;
    public Boolean Q;
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;

    public wnz(abxv abxvVar, zwa zwaVar, boolean z) {
        super("player/ad_break", abxvVar, zwaVar, true == z ? 3 : 1, true, null, null);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = -2L;
        this.D = -1L;
        this.E = -1;
        this.F = -1L;
        this.G = null;
        this.H = -1L;
        this.I = -1;
        this.J = -1;
        this.K = 0;
        this.L = 0;
        this.M = "";
        this.N = false;
        this.O = null;
        this.P = aigj.d;
        this.Q = null;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = allb.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        allb allbVar = (allb) aihfVarCreateBuilder.instance;
        str.getClass();
        allbVar.b |= 4;
        allbVar.d = str;
        long j = this.e;
        aihfVarCreateBuilder.copyOnWrite();
        allb allbVar2 = (allb) aihfVarCreateBuilder.instance;
        allbVar2.b |= 8;
        allbVar2.e = j;
        int i = this.E;
        aihfVarCreateBuilder.copyOnWrite();
        allb allbVar3 = (allb) aihfVarCreateBuilder.instance;
        allbVar3.b |= 16;
        allbVar3.f = i;
        String str2 = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        allb allbVar4 = (allb) aihfVarCreateBuilder.instance;
        str2.getClass();
        allbVar4.b |= 64;
        allbVar4.h = str2;
        boolean z = this.N;
        aihfVarCreateBuilder.copyOnWrite();
        allb allbVar5 = (allb) aihfVarCreateBuilder.instance;
        allbVar5.b |= 1048576;
        allbVar5.n = z;
        long j2 = this.F;
        if (j2 >= 0) {
            aihfVarCreateBuilder.copyOnWrite();
            allb allbVar6 = (allb) aihfVarCreateBuilder.instance;
            allbVar6.b |= 65536;
            allbVar6.k = j2;
        }
        if (!this.c.equals("")) {
            String str3 = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            allb allbVar7 = (allb) aihfVarCreateBuilder.instance;
            str3.getClass();
            allbVar7.b |= SemanticState.ReadOnly;
            allbVar7.i = str3;
        }
        long j3 = this.D;
        if (j3 >= 0) {
            aihfVarCreateBuilder.copyOnWrite();
            allb allbVar8 = (allb) aihfVarCreateBuilder.instance;
            allbVar8.b |= SemanticState.Modal;
            allbVar8.j = j3;
        }
        aldg aldgVar = this.G;
        if (aldgVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            allb allbVar9 = (allb) aihfVarCreateBuilder.instance;
            allbVar9.l = aldgVar;
            allbVar9.b |= 131072;
        }
        aihf aihfVarCreateBuilder2 = aooe.a.createBuilder();
        String str4 = this.M;
        aihfVarCreateBuilder2.copyOnWrite();
        aooe aooeVar = (aooe) aihfVarCreateBuilder2.instance;
        str4.getClass();
        aooeVar.b |= 16384;
        aooeVar.m = str4;
        long j4 = this.H;
        aihfVarCreateBuilder2.copyOnWrite();
        aooe aooeVar2 = (aooe) aihfVarCreateBuilder2.instance;
        aooeVar2.b |= 4;
        aooeVar2.d = j4;
        int i2 = this.I;
        aihfVarCreateBuilder2.copyOnWrite();
        aooe aooeVar3 = (aooe) aihfVarCreateBuilder2.instance;
        aooeVar3.b |= 2;
        aooeVar3.c = i2;
        int i3 = this.J;
        if (i3 != -1) {
            aihfVarCreateBuilder2.copyOnWrite();
            aooe aooeVar4 = (aooe) aihfVarCreateBuilder2.instance;
            aooeVar4.b |= 32;
            aooeVar4.g = i3;
        }
        int i4 = this.K;
        aihfVarCreateBuilder2.copyOnWrite();
        aooe aooeVar5 = (aooe) aihfVarCreateBuilder2.instance;
        aooeVar5.b |= 16;
        aooeVar5.f = i4;
        int i5 = this.L;
        aihfVarCreateBuilder2.copyOnWrite();
        aooe aooeVar6 = (aooe) aihfVarCreateBuilder2.instance;
        aooeVar6.b |= 8;
        aooeVar6.e = i5;
        if (!this.d.equals("")) {
            String str5 = this.d;
            aihfVarCreateBuilder.copyOnWrite();
            allb allbVar10 = (allb) aihfVarCreateBuilder.instance;
            str5.getClass();
            allbVar10.b |= 524288;
            allbVar10.m = str5;
        }
        aigj aigjVar = this.O;
        if (aigjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            allb allbVar11 = (allb) aihfVarCreateBuilder.instance;
            allbVar11.b |= 2097152;
            allbVar11.o = aigjVar;
        }
        if (!this.P.E()) {
            aigj aigjVar2 = this.P;
            aihfVarCreateBuilder.copyOnWrite();
            allb allbVar12 = (allb) aihfVarCreateBuilder.instance;
            aigjVar2.getClass();
            allbVar12.b |= 4194304;
            allbVar12.p = aigjVar2;
        }
        Boolean bool = this.Q;
        if (bool != null) {
            aihf aihfVarCreateBuilder3 = aizw.a.createBuilder();
            boolean zBooleanValue = bool.booleanValue();
            aihfVarCreateBuilder3.copyOnWrite();
            aizw aizwVar = (aizw) aihfVarCreateBuilder3.instance;
            aizwVar.b |= 2;
            aizwVar.c = zBooleanValue;
            aigj byteString = ((aizw) aihfVarCreateBuilder3.build()).toByteString();
            aihfVarCreateBuilder.copyOnWrite();
            allb allbVar13 = (allb) aihfVarCreateBuilder.instance;
            allbVar13.b |= 8388608;
            allbVar13.q = byteString;
        }
        aihf aihfVarCreateBuilder4 = aooi.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        aooi aooiVar = (aooi) aihfVarCreateBuilder4.instance;
        aooe aooeVar7 = (aooe) aihfVarCreateBuilder2.build();
        aooeVar7.getClass();
        aooiVar.c = aooeVar7;
        aooiVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        allb allbVar14 = (allb) aihfVarCreateBuilder.instance;
        aooi aooiVar2 = (aooi) aihfVarCreateBuilder4.build();
        aooiVar2.getClass();
        allbVar14.g = aooiVar2;
        allbVar14.b |= 32;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(!"".equals(this.a));
        ahno.O(!"".equals(this.b));
        ahno.O(this.E != -1);
        ahno.O(this.I != -1);
        ahno.O(this.J != -1);
        ahno.O(this.L != -1);
        ahno.O(!"".equals(this.M));
    }
}
