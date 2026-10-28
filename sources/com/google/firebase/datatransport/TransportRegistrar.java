package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ahoi;
import defpackage.ahoj;
import defpackage.ahol;
import defpackage.ahos;
import defpackage.ahpd;
import defpackage.ahpn;
import defpackage.ahps;
import defpackage.ahpt;
import defpackage.ahue;
import defpackage.jse;
import defpackage.jsh;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ jse lambda$getComponents$0(ahol aholVar) {
        jsh.b((Context) aholVar.e(Context.class));
        return jsh.a().c();
    }

    public static /* synthetic */ jse lambda$getComponents$1(ahol aholVar) {
        jsh.b((Context) aholVar.e(Context.class));
        return jsh.a().c();
    }

    public static /* synthetic */ jse lambda$getComponents$2(ahol aholVar) {
        jsh.b((Context) aholVar.e(Context.class));
        return jsh.a().c();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ahoj ahojVar = new ahoj(jse.class, new Class[0]);
        ahojVar.a = LIBRARY_NAME;
        ahojVar.b(new ahos(Context.class, 1, 0));
        ahojVar.b = new ahpn(5);
        ahoj ahojVar2 = new ahoj(new ahpd(ahps.class, jse.class), new ahpd[0]);
        ahojVar2.b(new ahos(Context.class, 1, 0));
        ahojVar2.b = new ahpn(6);
        ahoj ahojVar3 = new ahoj(new ahpd(ahpt.class, jse.class), new ahpd[0]);
        ahojVar3.b(new ahos(Context.class, 1, 0));
        ahojVar3.b = new ahpn(7);
        ahue ahueVar = new ahue(LIBRARY_NAME, "19.0.0_1p");
        ahoj ahojVar4 = new ahoj(ahue.class, new Class[0]);
        ahojVar4.c();
        ahojVar4.b = new ahoi(ahueVar, 1);
        return Arrays.asList(ahojVar.a(), ahojVar2.a(), ahojVar3.a(), ahojVar4.a());
    }
}
