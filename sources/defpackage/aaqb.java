package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aaqb extends wlu {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    protected aaqb(abxv abxvVar, zwa zwaVar, boolean z) {
        super("offline", abxvVar, zwaVar, 1, z, null, null);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = altu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        altu altuVar = (altu) aihfVarCreateBuilder.instance;
        aiie aiieVar = altuVar.d;
        if (!aiieVar.c()) {
            altuVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, altuVar.d);
        List list = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        altu altuVar2 = (altu) aihfVarCreateBuilder.instance;
        aiie aiieVar2 = altuVar2.g;
        if (!aiieVar2.c()) {
            altuVar2.g = aihn.mutableCopy(aiieVar2);
        }
        aifs.addAll(list, altuVar2.g);
        List list2 = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        altu altuVar3 = (altu) aihfVarCreateBuilder.instance;
        aiie aiieVar3 = altuVar3.e;
        if (!aiieVar3.c()) {
            altuVar3.e = aihn.mutableCopy(aiieVar3);
        }
        aifs.addAll(list2, altuVar3.e);
        List list3 = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        altu altuVar4 = (altu) aihfVarCreateBuilder.instance;
        aiie aiieVar4 = altuVar4.f;
        if (!aiieVar4.c()) {
            altuVar4.f = aihn.mutableCopy(aiieVar4);
        }
        aifs.addAll(list3, altuVar4.f);
        aihfVarCreateBuilder.copyOnWrite();
        altu altuVar5 = (altu) aihfVarCreateBuilder.instance;
        altuVar5.b |= 2;
        altuVar5.h = false;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        boolean z = true;
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            z = false;
        }
        ahno.O(z);
    }
}
