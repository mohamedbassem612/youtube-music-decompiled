package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ahnr;
import defpackage.ahoe;
import defpackage.ahof;
import defpackage.ahoi;
import defpackage.ahoj;
import defpackage.ahol;
import defpackage.ahos;
import defpackage.ahpd;
import defpackage.ahpn;
import defpackage.ahpo;
import defpackage.ahra;
import defpackage.ahrb;
import defpackage.ahrc;
import defpackage.ahrv;
import defpackage.ahrw;
import defpackage.ahue;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ ahrw lambda$getComponents$0(ahol aholVar) {
        return new ahrv((ahnr) aholVar.e(ahnr.class), aholVar.b(ahrc.class), (ExecutorService) aholVar.d(new ahpd(ahoe.class, ExecutorService.class)), new ahpo((Executor) aholVar.d(new ahpd(ahof.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ahoj ahojVar = new ahoj(ahrw.class, new Class[0]);
        ahojVar.a = LIBRARY_NAME;
        ahojVar.b(new ahos(ahnr.class, 1, 0));
        ahojVar.b(new ahos(ahrc.class, 0, 1));
        ahojVar.b(new ahos(new ahpd(ahoe.class, ExecutorService.class), 1, 0));
        ahojVar.b(new ahos(new ahpd(ahof.class, Executor.class), 1, 0));
        ahojVar.b = new ahpn(11);
        ahrb ahrbVar = new ahrb();
        ahoj ahojVar2 = new ahoj(ahra.class, new Class[0]);
        ahojVar2.c();
        ahojVar2.b = new ahoi(ahrbVar, 1);
        ahue ahueVar = new ahue(LIBRARY_NAME, "19.1.1_1p");
        ahoj ahojVar3 = new ahoj(ahue.class, new Class[0]);
        ahojVar3.c();
        ahojVar3.b = new ahoi(ahueVar, 1);
        return Arrays.asList(ahojVar.a(), ahojVar2.a(), ahojVar3.a());
    }
}
