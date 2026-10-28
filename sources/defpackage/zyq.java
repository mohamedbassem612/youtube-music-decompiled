package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zyq implements tgm {
    public final awmd a;
    private final tgm b;
    private final Optional c;

    public zyq(awmd awmdVar, Optional optional, tgm tgmVar) {
        this.a = awmdVar;
        this.b = tgmVar;
        this.c = optional;
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [awmd, java.lang.Object] */
    @Override // defpackage.tgm
    public final tgg a(tgi tgiVar) {
        boolean z = tgiVar.k;
        tgg tggVarA = this.b.a(tgiVar);
        if (z) {
            return tggVarA;
        }
        Optional optionalOfNullable = this.c;
        zyp zypVar = new zyp(this, tggVarA, tgiVar);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            zyq zyqVar = zypVar.a;
            tgg tggVar = zypVar.b;
            tgi tgiVar2 = zypVar.c;
            abxv abxvVar = (abxv) obj;
            abfv abfvVar = (abfv) zyqVar.a.io();
            ahey aheyVar = (ahey) abfvVar.a.io();
            aheyVar.getClass();
            vxz vxzVar = (vxz) abfvVar.b.io();
            vxzVar.getClass();
            tggVar.getClass();
            Optional optional = tgiVar2.d;
            optional.getClass();
            Optional optional2 = tgiVar2.f;
            optional2.getClass();
            Executor executor = tgiVar2.h;
            executor.getClass();
            optionalOfNullable = Optional.ofNullable(new zyt(aheyVar, vxzVar, abxvVar, tggVar, optional, optional2, executor));
        }
        return (tgg) optionalOfNullable.orElse(tggVarA);
    }
}
