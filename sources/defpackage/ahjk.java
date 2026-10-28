package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjk {
    public static final /* synthetic */ int a = 0;
    private static final List b = Arrays.asList(ahjl.a, ahjl.e, ahjl.h, ahjl.b);
    private static final List c = Arrays.asList(ahjl.a, ahjl.b, ahjl.c, ahjl.f, ahjl.g, ahjl.i, ahjl.j);
    private static final List d = Arrays.asList(ahjl.c, ahjl.d, ahjl.f, ahjl.g);

    public static final ahjo a(ahjm ahjmVar, ahjl ahjlVar, ahjn ahjnVar) throws GeneralSecurityException {
        ahjm ahjmVar2 = ahjm.a;
        if (ahjmVar == ahjmVar2 && !b.contains(ahjlVar)) {
            throw new GeneralSecurityException("ML-DSA-44 is not compatible with the provided classical algorithm ".concat(ahjlVar.k));
        }
        ahjm ahjmVar3 = ahjm.b;
        if (ahjmVar == ahjmVar3 && !c.contains(ahjlVar)) {
            throw new GeneralSecurityException("ML-DSA-65 is not compatible with the provided classical algorithm ".concat(ahjlVar.k));
        }
        ahjm ahjmVar4 = ahjm.c;
        if (ahjmVar == ahjmVar4 && !d.contains(ahjlVar)) {
            throw new GeneralSecurityException("ML-DSA-87 is not compatible with the provided classical algorithm ".concat(ahjlVar.k));
        }
        if (ahjmVar == ahjmVar2 || ahjmVar == ahjmVar3 || ahjmVar == ahjmVar4) {
            return new ahjo(ahjmVar, ahjlVar, ahjnVar);
        }
        throw new GeneralSecurityException("Unknown ML-DSA instance: ".concat(ahjmVar.d));
    }
}
