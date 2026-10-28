package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhc extends ahfv {
    public final ahgb a;

    public ahhc(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        d(ahgbVar, ahgjVar);
        this.a = ahgbVar;
    }

    private static void d(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        Object obj = ahgbVar.c;
        if (obj.equals(ahfz.b) || obj.equals(ahfz.c)) {
            ahgj.a(ahgjVar);
        }
    }

    @Override // defpackage.ahfv
    public final Integer a() {
        return (Integer) this.a.e;
    }

    @Override // defpackage.ahfv
    public final afyd b() {
        ahgb ahgbVar = this.a;
        return new ahhb((String) ahgbVar.a, (ahga) ahgbVar.d);
    }

    public final ahgb c(ahgj ahgjVar) throws GeneralSecurityException {
        ahgb ahgbVar = this.a;
        d(ahgbVar, ahgjVar);
        return ahgbVar;
    }
}
