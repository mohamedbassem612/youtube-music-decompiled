package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class aftp extends afsx {
    private final afuy a;

    public aftp(String str, afvl afvlVar, afuy afuyVar, afvh afvhVar) {
        super(str, afvlVar, afvhVar);
        if (!afuyVar.d) {
            throw new IllegalArgumentException();
        }
        this.a = afuyVar;
    }

    @Override // defpackage.afvl
    public afuy j() {
        return afuy.e(this.a, n());
    }

    @Override // defpackage.afvl
    public afuv k(aguu aguuVar) {
        return afuy.j(aguuVar, j());
    }

    public aftp(String str, UUID uuid, String str2, afuy afuyVar, afvh afvhVar) {
        super(str, uuid, str2, afvhVar);
        if (afuyVar.d) {
            this.a = afuyVar;
            return;
        }
        throw new IllegalArgumentException();
    }
}
