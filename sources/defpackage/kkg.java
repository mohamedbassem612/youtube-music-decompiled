package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.CommonApis;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kkg extends kid {
    private final aulu b;
    private final int c;

    public kkg(int i, kil kilVar) {
        Random random = new Random();
        aihh aihhVar = (aihh) aulu.a.createBuilder();
        double d = kilVar.c;
        aihhVar.copyOnWrite();
        aulu auluVar = (aulu) aihhVar.instance;
        auluVar.b |= 1;
        auluVar.c = d;
        aulu auluVar2 = (aulu) aihhVar.build();
        super(random);
        this.c = i;
        this.b = auluVar2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    @Override // defpackage.kid
    public final ListenableFuture a(kiy kiyVar) {
        kiz kizVarA;
        aulu auluVar = this.b;
        double d = auluVar.c;
        if (d <= 0.0d) {
            kizVarA = kiz.a;
        } else if (d == 1.0d && (auluVar.b & 2) == 0) {
            kizVarA = kiz.e;
        } else {
            double dNextDouble = this.a.nextDouble();
            double d2 = auluVar.c;
            ?? r4 = (dNextDouble > d2 ? 1 : (dNextDouble == d2 ? 0 : -1)) >>> 31;
            if ((auluVar.b & 2) != 0) {
                d2 = auluVar.d;
            }
            kizVarA = kiz.a(r4, d2);
        }
        return ahng.n(kizVarA);
    }

    @Override // defpackage.kid
    public final auli b() {
        aihf aihfVarCreateBuilder = auli.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        auli auliVar = (auli) aihfVarCreateBuilder.instance;
        auliVar.c = CommonApis.q(this.c);
        auliVar.b |= 1;
        aihf aihfVarCreateBuilder2 = aulh.a.createBuilder();
        float f = (float) this.b.c;
        aihfVarCreateBuilder2.copyOnWrite();
        aulh aulhVar = (aulh) aihfVarCreateBuilder2.instance;
        aulhVar.b |= 1;
        aulhVar.c = f;
        aihfVarCreateBuilder.copyOnWrite();
        auli auliVar2 = (auli) aihfVarCreateBuilder.instance;
        aulh aulhVar2 = (aulh) aihfVarCreateBuilder2.build();
        aulhVar2.getClass();
        auliVar2.e = aulhVar2;
        auliVar2.b |= 4;
        return (auli) aihfVarCreateBuilder.build();
    }
}
