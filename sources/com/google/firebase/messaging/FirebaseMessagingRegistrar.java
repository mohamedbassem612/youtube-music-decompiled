package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ahnr;
import defpackage.ahoi;
import defpackage.ahoj;
import defpackage.ahol;
import defpackage.ahos;
import defpackage.ahpd;
import defpackage.ahpt;
import defpackage.ahqy;
import defpackage.ahrd;
import defpackage.ahrr;
import defpackage.ahrs;
import defpackage.ahrw;
import defpackage.ahtd;
import defpackage.ahtf;
import defpackage.ahue;
import defpackage.ahuh;
import defpackage.jse;
import defpackage.kli;
import defpackage.ktb;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ahpd ahpdVar, ahol aholVar) {
        ahnr ahnrVar = (ahnr) aholVar.e(ahnr.class);
        ahrr ahrrVar = (ahrr) aholVar.e(ahrr.class);
        ahrs ahrsVarB = aholVar.b(ahuh.class);
        ahrs ahrsVarB2 = aholVar.b(ahrd.class);
        ahrw ahrwVar = (ahrw) aholVar.e(ahrw.class);
        ahrs ahrsVarA = aholVar.a(ahpdVar);
        ahqy ahqyVar = (ahqy) aholVar.e(ahqy.class);
        ahtf ahtfVar = new ahtf(ahnrVar.a());
        return new FirebaseMessaging(ahnrVar, ahrrVar, ahrsVarA, ahqyVar, ahtfVar, new ahtd(ahnrVar, ahtfVar, new kli(ahnrVar.a()), ahrsVarB, ahrsVarB2, ahrwVar), ahrwVar, Executors.newSingleThreadExecutor(new ktb("Firebase-Messaging-Task", 0)), new ScheduledThreadPoolExecutor(1, new ktb("Firebase-Messaging-Init", 0)), new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ktb("Firebase-Messaging-File-Io", 0)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ahpd ahpdVar = new ahpd(ahpt.class, jse.class);
        ahoj ahojVar = new ahoj(FirebaseMessaging.class, new Class[0]);
        ahojVar.a = LIBRARY_NAME;
        ahojVar.b(new ahos(ahnr.class, 1, 0));
        ahojVar.b(new ahos(ahrr.class, 0, 0));
        ahojVar.b(new ahos(ahuh.class, 0, 1));
        ahojVar.b(new ahos(ahrd.class, 0, 1));
        ahojVar.b(new ahos(ahrw.class, 1, 0));
        ahojVar.b(new ahos(ahpdVar, 0, 1));
        ahojVar.b(new ahos(ahqy.class, 1, 0));
        ahojVar.b = new ahoi(ahpdVar, 3);
        ahojVar.d(1);
        ahue ahueVar = new ahue(LIBRARY_NAME, "25.1.2_1p");
        ahoj ahojVar2 = new ahoj(ahue.class, new Class[0]);
        ahojVar2.c();
        ahojVar2.b = new ahoi(ahueVar, 1);
        return Arrays.asList(ahojVar.a(), ahojVar2.a());
    }
}
