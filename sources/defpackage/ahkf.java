package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahkf extends ahlo {
    public final ahkc a;
    public final ahnf b;
    public final ahnf c;
    public final Integer d;

    private ahkf(ahkc ahkcVar, ahnf ahnfVar, ahnf ahnfVar2, Integer num) {
        this.a = ahkcVar;
        this.b = ahnfVar;
        this.c = ahnfVar2;
        this.d = num;
    }

    public static ahkf e(ahkb ahkbVar, ahnf ahnfVar, Integer num) throws GeneralSecurityException {
        ahnf ahnfVarA;
        ahkc ahkcVar = new ahkc(ahkbVar);
        ahkb ahkbVar2 = ahkb.d;
        if (!ahkbVar.equals(ahkbVar2) && num == null) {
            throw new GeneralSecurityException("For given Variant " + ahkbVar.e + " the value of idRequirement must be non-null");
        }
        if (ahkbVar.equals(ahkbVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (ahnfVar.a() != 32) {
            throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + ahnfVar.a());
        }
        ahkb ahkbVar3 = ahkcVar.a;
        if (ahkbVar3 == ahkbVar2) {
            ahnfVarA = ahhk.a;
        } else if (ahkbVar3 == ahkb.b || ahkbVar3 == ahkb.c) {
            ahnfVarA = ahhk.a(num.intValue());
        } else {
            if (ahkbVar3 != ahkb.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(ahkbVar3.e));
            }
            ahnfVarA = ahhk.b(num.intValue());
        }
        return new ahkf(ahkcVar, ahnfVar, ahnfVarA, num);
    }

    @Override // defpackage.ahfv
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.ahlo, defpackage.ahfv
    public final /* synthetic */ afyd b() {
        return this.a;
    }

    @Override // defpackage.ahlo
    public final ahnf c() {
        return this.c;
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ afyd d() {
        return this.a;
    }
}
