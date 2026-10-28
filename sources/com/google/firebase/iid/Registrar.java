package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.afts;
import defpackage.ahnr;
import defpackage.ahoi;
import defpackage.ahoj;
import defpackage.ahok;
import defpackage.ahol;
import defpackage.ahos;
import defpackage.ahpn;
import defpackage.ahrd;
import defpackage.ahri;
import defpackage.ahro;
import defpackage.ahrr;
import defpackage.ahrw;
import defpackage.ahue;
import defpackage.ahuh;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class Registrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseInstanceId lambda$getComponents$0(ahol aholVar) {
        ahnr ahnrVar = (ahnr) aholVar.e(ahnr.class);
        return new FirebaseInstanceId(ahnrVar, new afts(ahnrVar.a()), ahri.a(), ahri.a(), aholVar.b(ahuh.class), aholVar.b(ahrd.class), (ahrw) aholVar.e(ahrw.class));
    }

    public static /* synthetic */ ahrr lambda$getComponents$1(ahol aholVar) {
        return new ahro((FirebaseInstanceId) aholVar.e(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ahoj ahojVar = new ahoj(FirebaseInstanceId.class, new Class[0]);
        ahojVar.b(new ahos(ahnr.class, 1, 0));
        ahojVar.b(new ahos(ahuh.class, 0, 1));
        ahojVar.b(new ahos(ahrd.class, 0, 1));
        ahojVar.b(new ahos(ahrw.class, 1, 0));
        ahojVar.b = new ahpn(9);
        ahojVar.d(1);
        ahok ahokVarA = ahojVar.a();
        ahoj ahojVar2 = new ahoj(ahrr.class, new Class[0]);
        ahojVar2.b(new ahos(FirebaseInstanceId.class, 1, 0));
        ahojVar2.b = new ahpn(10);
        ahok ahokVarA2 = ahojVar2.a();
        ahue ahueVar = new ahue("fire-iid", "21.1.1");
        ahoj ahojVar3 = new ahoj(ahue.class, new Class[0]);
        ahojVar3.c();
        ahojVar3.b = new ahoi(ahueVar, 1);
        return Arrays.asList(ahokVarA, ahokVarA2, ahojVar3.a());
    }
}
