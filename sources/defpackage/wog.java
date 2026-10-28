package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wog extends wlu {
    public float D;
    public int E;
    private final List F;
    private final List G;
    private final List H;
    public final List a;
    public alln b;
    public long c;
    public long d;
    public int e;

    public wog(abxv abxvVar, zwa zwaVar, boolean z) {
        super("offline/auto_offline", abxvVar, zwaVar, 1, z, null, null);
        this.a = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.b = alln.a;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = allq.a.createBuilder();
        long j = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar = (allq) aihfVarCreateBuilder.instance;
        allqVar.b |= 2;
        allqVar.d = j;
        long j2 = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar2 = (allq) aihfVarCreateBuilder.instance;
        allqVar2.b |= 4;
        allqVar2.e = j2;
        int i = this.e;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar3 = (allq) aihfVarCreateBuilder.instance;
        allqVar3.b |= 8;
        allqVar3.f = i;
        float f = this.D;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar4 = (allq) aihfVarCreateBuilder.instance;
        allqVar4.b |= 16;
        allqVar4.g = f;
        int i2 = this.E;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar5 = (allq) aihfVarCreateBuilder.instance;
        allqVar5.b |= 32;
        allqVar5.h = i2;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar6 = (allq) aihfVarCreateBuilder.instance;
        aiie aiieVar = allqVar6.i;
        if (!aiieVar.c()) {
            allqVar6.i = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, allqVar6.i);
        List list = this.F;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar7 = (allq) aihfVarCreateBuilder.instance;
        aiie aiieVar2 = allqVar7.k;
        if (!aiieVar2.c()) {
            allqVar7.k = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(list, allqVar7.k);
        List list2 = this.G;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar8 = (allq) aihfVarCreateBuilder.instance;
        aiie aiieVar3 = allqVar8.l;
        if (!aiieVar3.c()) {
            allqVar8.l = aihn.mutableCopy(aiieVar3);
        }
        aifs.addAll(list2, allqVar8.l);
        List list3 = this.H;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar9 = (allq) aihfVarCreateBuilder.instance;
        aiie aiieVar4 = allqVar9.j;
        if (!aiieVar4.c()) {
            allqVar9.j = aihn.mutableCopy(aiieVar4);
        }
        aifs.addAll(list3, allqVar9.j);
        alln allnVar = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        allq allqVar10 = (allq) aihfVarCreateBuilder.instance;
        allnVar.getClass();
        allqVar10.m = allnVar;
        allqVar10.b |= 64;
        return aihfVarCreateBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(((this.c > 0L ? 1 : (this.c == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        ahno.F(((this.d > 0L ? 1 : (this.d == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        float f = this.D;
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        ahno.F(z);
        ahno.F((this.E ^ (-1)) >>> 31);
    }

    public final void e(aoie aoieVar) {
        this.H.add(aoieVar);
    }
}
