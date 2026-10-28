package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afuh extends aftp {
    public static final UUID a;
    public static final String b;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        a = uuidRandomUUID;
        b = afsx.kg(uuidRandomUUID);
    }

    private afuh(afuh afuhVar, String str, afuy afuyVar, afvh afvhVar) {
        super(str, afuhVar, afuyVar, afvhVar);
    }

    @Override // defpackage.afvl
    public final long l() {
        return -1L;
    }

    @Override // defpackage.afvl
    public final afuy n() {
        return afux.a;
    }

    @Override // defpackage.afvl
    public final afvl q(String str, int i, afuy afuyVar, afvh afvhVar) {
        return new afuh(this, str, afuyVar, afvhVar);
    }

    public afuh(String str, UUID uuid, String str2, afuy afuyVar, afvh afvhVar) {
        super(str, uuid, str2, afuyVar, afvhVar);
    }

    @Override // defpackage.afvl
    public final void r() {
    }

    @Override // defpackage.afvl
    public final void o(boolean z) {
    }

    @Override // defpackage.afvl
    public final void p(int i) {
    }

    @Override // defpackage.afvl
    public final void t(aguu aguuVar, Object obj) {
    }
}
