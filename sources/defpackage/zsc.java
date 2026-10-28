package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zsc implements zrx {
    private final aoni a;

    public zsc(int i, List list) {
        aihf aihfVarCreateBuilder = aoni.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aoni aoniVar = (aoni) aihfVarCreateBuilder.instance;
        aoniVar.b |= 1;
        aoniVar.c = i;
        aihfVarCreateBuilder.copyOnWrite();
        aoni aoniVar2 = (aoni) aihfVarCreateBuilder.instance;
        aihv aihvVar = aoniVar2.d;
        if (!aihvVar.c()) {
            aoniVar2.d = aihn.mutableCopy(aihvVar);
        }
        aifs.addAll(list, aoniVar2.d);
        aihfVarCreateBuilder.copyOnWrite();
        aoni aoniVar3 = (aoni) aihfVarCreateBuilder.instance;
        aoniVar3.b |= 2;
        aoniVar3.e = 60;
        aihfVarCreateBuilder.copyOnWrite();
        aoni aoniVar4 = (aoni) aihfVarCreateBuilder.instance;
        aoniVar4.b |= 4;
        aoniVar4.f = true;
        this.a = (aoni) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.zrx
    public final int a() {
        return this.a.c;
    }

    @Override // defpackage.zrx
    public final int b() {
        return this.a.e;
    }

    @Override // defpackage.zrx
    public final List c() {
        return this.a.d;
    }

    @Override // defpackage.zrx
    public final boolean d() {
        return this.a.f;
    }

    public zsc(aoni aoniVar) {
        aoniVar.getClass();
        this.a = aoniVar;
    }
}
