package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.ahoe;
import defpackage.ahof;
import defpackage.ahog;
import defpackage.ahoh;
import defpackage.ahoj;
import defpackage.ahox;
import defpackage.ahpd;
import defpackage.ahpm;
import defpackage.ahpn;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final ahox a = new ahox(new ahpm(0));
    public static final ahox b = new ahox(new ahpm(2));
    public static final ahox c = new ahox(new ahpm(3));
    public static final ahox d = new ahox(new ahpm(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ahoj ahojVar = new ahoj(new ahpd(ahoe.class, ScheduledExecutorService.class), new ahpd(ahoe.class, ExecutorService.class), new ahpd(ahoe.class, Executor.class));
        ahojVar.b = new ahpn(0);
        ahoj ahojVar2 = new ahoj(new ahpd(ahof.class, ScheduledExecutorService.class), new ahpd(ahof.class, ExecutorService.class), new ahpd(ahof.class, Executor.class));
        ahojVar2.b = new ahpn(2);
        ahoj ahojVar3 = new ahoj(new ahpd(ahog.class, ScheduledExecutorService.class), new ahpd(ahog.class, ExecutorService.class), new ahpd(ahog.class, Executor.class));
        ahojVar3.b = new ahpn(3);
        ahoj ahojVar4 = new ahoj(new ahpd(ahoh.class, Executor.class), new ahpd[0]);
        ahojVar4.b = new ahpn(4);
        return Arrays.asList(ahojVar.a(), ahojVar2.a(), ahojVar3.a(), ahojVar4.a());
    }
}
