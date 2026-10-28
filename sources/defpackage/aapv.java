package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aapv extends wlu {
    public int a;
    private final List b;

    public aapv(abxv abxvVar, zwa zwaVar) {
        super("offline/get_video_entity", abxvVar, zwaVar, 1, false, null, null);
        this.b = new ArrayList();
        this.a = 1;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alue.a.createBuilder();
        int i = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alue alueVar = (alue) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        alueVar.e = i2;
        alueVar.b |= 2;
        List list = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alue alueVar2 = (alue) aihfVarCreateBuilder.instance;
        aiie aiieVar = alueVar2.d;
        if (!aiieVar.c()) {
            alueVar2.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, alueVar2.d);
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        boolean z = true;
        ahno.F(!this.b.isEmpty());
        int i = this.a;
        if (i != 2 && i != 4) {
            z = false;
        }
        ahno.F(z);
    }

    public final void e(alug alugVar) {
        this.b.add(alugVar);
    }
}
