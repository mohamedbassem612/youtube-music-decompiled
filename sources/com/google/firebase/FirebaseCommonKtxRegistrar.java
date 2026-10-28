package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ahns;
import defpackage.ahoe;
import defpackage.ahof;
import defpackage.ahog;
import defpackage.ahoh;
import defpackage.ahoj;
import defpackage.ahok;
import defpackage.ahos;
import defpackage.ahpd;
import defpackage.atqq;
import defpackage.awuq;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ahoj ahojVarA = ahok.a(new ahpd(ahoe.class, awuq.class));
        ahojVarA.b(new ahos(new ahpd(ahoe.class, Executor.class), 1, 0));
        ahojVarA.b = ahns.b;
        ahoj ahojVarA2 = ahok.a(new ahpd(ahog.class, awuq.class));
        ahojVarA2.b(new ahos(new ahpd(ahog.class, Executor.class), 1, 0));
        ahojVarA2.b = ahns.a;
        ahoj ahojVarA3 = ahok.a(new ahpd(ahof.class, awuq.class));
        ahojVarA3.b(new ahos(new ahpd(ahof.class, Executor.class), 1, 0));
        ahojVarA3.b = ahns.c;
        ahoj ahojVarA4 = ahok.a(new ahpd(ahoh.class, awuq.class));
        ahojVarA4.b(new ahos(new ahpd(ahoh.class, Executor.class), 1, 0));
        ahojVarA4.b = ahns.d;
        return atqq.aL(new ahok[]{ahojVarA.a(), ahojVarA2.a(), ahojVarA3.a(), ahojVarA4.a()});
    }
}
