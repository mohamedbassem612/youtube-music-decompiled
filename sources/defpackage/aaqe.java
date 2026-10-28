package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aaqe extends wlu {
    private final List a;

    public aaqe(abxv abxvVar, zwa zwaVar, boolean z) {
        super("offline/get_playback_data_entity", abxvVar, zwaVar, 1, z, null, null);
        this.a = new ArrayList();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alua.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alua aluaVar = (alua) aihfVarCreateBuilder.instance;
        aiie aiieVar = aluaVar.d;
        if (!aiieVar.c()) {
            aluaVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, aluaVar.d);
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!this.a.isEmpty());
    }

    public final void e(Collection collection) {
        this.a.addAll(collection);
    }
}
