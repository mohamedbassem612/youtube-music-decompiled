package com.google.firebase.dynamiclinks.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ahnr;
import defpackage.ahoa;
import defpackage.ahoj;
import defpackage.ahol;
import defpackage.ahos;
import defpackage.ahpn;
import defpackage.ahpu;
import defpackage.ahpy;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    public static /* synthetic */ ahpu lambda$getComponents$0(ahol aholVar) {
        ahnr ahnrVar = (ahnr) aholVar.e(ahnr.class);
        return new ahpu(new ahpy(ahnrVar.a()), ahnrVar, aholVar.b(ahoa.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ahoj ahojVar = new ahoj(ahpu.class, new Class[0]);
        ahojVar.b(new ahos(ahnr.class, 1, 0));
        ahojVar.b(new ahos(ahoa.class, 0, 1));
        ahojVar.b = new ahpn(8);
        return Arrays.asList(ahojVar.a());
    }
}
