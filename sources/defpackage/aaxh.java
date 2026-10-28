package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aaxh {
    private static final arbl[] e = new arbl[0];
    public final boolean a;
    public final arbl[] b;
    public final float c;
    public final Float d;

    public aaxh(boolean z, wjf wjfVar, float f) {
        this.a = z;
        this.b = a(wjfVar);
        this.c = f;
        this.d = null;
    }

    public static arbl[] a(wjf wjfVar) {
        if (wjfVar == null) {
            return e;
        }
        aoqd aoqdVar = wjfVar.f().d;
        arbm arbmVar = aoqdVar.s;
        if (arbmVar == null) {
            arbmVar = arbm.a;
        }
        if (arbmVar.b.size() != 0) {
            arbm arbmVar2 = aoqdVar.s;
            if (arbmVar2 == null) {
                arbmVar2 = arbm.a;
            }
            return (arbl[]) arbmVar2.b.toArray(new arbl[0]);
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.0#");
        arbl[] arblVarArr = new arbl[7];
        for (int i = 0; i < 7; i++) {
            aihf aihfVarCreateBuilder = arbl.a.createBuilder();
            float f = wiu.b[i];
            aihh aihhVar = (aihh) alay.a.createBuilder();
            aihh aihhVar2 = (aihh) alba.a.createBuilder();
            String str = decimalFormat.format(f);
            aihhVar2.copyOnWrite();
            alba albaVar = (alba) aihhVar2.instance;
            str.getClass();
            albaVar.b |= 1;
            albaVar.c = str;
            aihhVar.f((alba) aihhVar2.build());
            aihfVarCreateBuilder.copyOnWrite();
            arbl arblVar = (arbl) aihfVarCreateBuilder.instance;
            alay alayVar = (alay) aihhVar.build();
            alayVar.getClass();
            arblVar.c = alayVar;
            arblVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            arbl arblVar2 = (arbl) aihfVarCreateBuilder.instance;
            arblVar2.b |= 2;
            arblVar2.d = f;
            arblVarArr[i] = (arbl) aihfVarCreateBuilder.build();
        }
        return arblVarArr;
    }

    public aaxh(boolean z, wjf wjfVar, float f, Float f2) {
        this.a = z;
        this.b = a(wjfVar);
        this.c = f;
        this.d = f2;
    }
}
