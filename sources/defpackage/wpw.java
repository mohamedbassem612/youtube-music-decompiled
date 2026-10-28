package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wpw extends wlu {
    public Boolean a;
    private final ArrayList b;

    public wpw(abxv abxvVar, zwa zwaVar) {
        super("feedback", abxvVar, zwaVar, 1, true, null, null);
        this.b = new ArrayList();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alpd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alpd alpdVar = (alpd) aihfVarCreateBuilder.instance;
        aiie aiieVar = alpdVar.d;
        if (!aiieVar.c()) {
            alpdVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.b, alpdVar.d);
        Boolean bool = this.a;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            aihfVarCreateBuilder.copyOnWrite();
            alpd alpdVar2 = (alpd) aihfVarCreateBuilder.instance;
            alpdVar2.b |= 2;
            alpdVar2.e = zBooleanValue;
        }
        aihf aihfVarCreateBuilder2 = alpb.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alpd alpdVar3 = (alpd) aihfVarCreateBuilder.instance;
        alpb alpbVar = (alpb) aihfVarCreateBuilder2.build();
        alpbVar.getClass();
        alpdVar3.f = alpbVar;
        alpdVar3.b |= 4;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!this.b.isEmpty());
    }

    public final void e(String str) {
        this.b.add(str);
    }
}
