package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcs extends wlu {
    private final List a;

    public vcs(abxv abxvVar, zwa zwaVar, List list) {
        super("upload/create_user_media", abxvVar, zwaVar, 1, true, null, null);
        this.a = list;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alze.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alze alzeVar = (alze) aihfVarCreateBuilder.instance;
        aiie aiieVar = alzeVar.d;
        if (!aiieVar.c()) {
            alzeVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, alzeVar.d);
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
