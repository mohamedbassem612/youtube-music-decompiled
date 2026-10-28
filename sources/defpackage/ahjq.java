package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjq extends ahlo {
    public static final Map a = e();
    public final ahjo b;
    public final ahkk c;
    public final ahlo d;
    public final ahnf e;
    public final Integer f;

    public ahjq(ahjo ahjoVar, ahkk ahkkVar, ahlo ahloVar, ahnf ahnfVar, Integer num) {
        this.b = ahjoVar;
        this.c = ahkkVar;
        this.d = ahloVar;
        this.e = ahnfVar;
        this.f = num;
    }

    private static Map e() {
        HashMap map = new HashMap();
        try {
            map.put(ahjl.a, new ahkc(ahkb.d));
            ahjl ahjlVar = ahjl.b;
            ahjs ahjsVar = ahjs.a;
            ahjr ahjrVar = ahjr.a;
            ahju ahjuVar = ahju.d;
            ahjt ahjtVar = ahjt.b;
            map.put(ahjlVar, aedi.I(ahjtVar, ahjrVar, ahjsVar, ahjuVar));
            map.put(ahjl.c, aedi.I(ahjtVar, ahjr.b, ahjs.b, ahjuVar));
            map.put(ahjl.d, aedi.I(ahjtVar, ahjr.c, ahjs.c, ahjuVar));
            ahjl ahjlVar2 = ahjl.e;
            BigInteger bigInteger = ahkz.a;
            ahkw ahkwVar = new ahkw();
            ahkwVar.b(SemanticState.Modal);
            ahkx ahkxVar = ahkx.a;
            ahkwVar.b = ahkxVar;
            ahkwVar.c = ahkxVar;
            ahkwVar.c(32);
            ahky ahkyVar = ahky.d;
            ahkwVar.d = ahkyVar;
            map.put(ahjlVar2, ahkwVar.a());
            ahjl ahjlVar3 = ahjl.f;
            ahkw ahkwVar2 = new ahkw();
            ahkwVar2.b(3072);
            ahkwVar2.b = ahkxVar;
            ahkwVar2.c = ahkxVar;
            ahkwVar2.c(32);
            ahkwVar2.d = ahkyVar;
            map.put(ahjlVar3, ahkwVar2.a());
            ahjl ahjlVar4 = ahjl.g;
            ahkw ahkwVar3 = new ahkw();
            ahkwVar3.b(SemanticState.Obscured);
            ahkx ahkxVar2 = ahkx.b;
            ahkwVar3.b = ahkxVar2;
            ahkwVar3.c = ahkxVar2;
            ahkwVar3.c(48);
            ahkwVar3.d = ahkyVar;
            map.put(ahjlVar4, ahkwVar3.a());
            ahjl ahjlVar5 = ahjl.h;
            BigInteger bigInteger2 = ahks.a;
            ahkp ahkpVar = new ahkp();
            ahkpVar.b(SemanticState.Modal);
            ahkq ahkqVar = ahkq.a;
            ahkpVar.b = ahkqVar;
            ahkr ahkrVar = ahkr.d;
            ahkpVar.c = ahkrVar;
            map.put(ahjlVar5, ahkpVar.a());
            ahjl ahjlVar6 = ahjl.i;
            ahkp ahkpVar2 = new ahkp();
            ahkpVar2.b(3072);
            ahkpVar2.b = ahkqVar;
            ahkpVar2.c = ahkrVar;
            map.put(ahjlVar6, ahkpVar2.a());
            ahjl ahjlVar7 = ahjl.j;
            ahkp ahkpVar3 = new ahkp();
            ahkpVar3.b(SemanticState.Obscured);
            ahkpVar3.b = ahkq.b;
            ahkpVar3.c = ahkrVar;
            map.put(ahjlVar7, ahkpVar3.a());
            return DesugarCollections.unmodifiableMap(map);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Could not create supported classical parameters", e);
        }
    }

    @Override // defpackage.ahfv
    public final Integer a() {
        return this.f;
    }

    @Override // defpackage.ahlo, defpackage.ahfv
    public final /* synthetic */ afyd b() {
        return this.b;
    }

    @Override // defpackage.ahlo
    public final ahnf c() {
        return this.e;
    }

    @Override // defpackage.ahlo
    public final /* synthetic */ afyd d() {
        return this.b;
    }
}
