package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obx implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;
    private final aupr e;

    public obx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
        this.e = auprVar5;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        Object obnVar;
        olt oltVar;
        switch (this.$cid) {
            case 0:
                aupr auprVar = this.c;
                Object obj = ((aupo) this.a).b;
                Object objIo = this.b.io();
                obr obrVar = (obr) auprVar.io();
                Object obj2 = ((aupo) this.d).b;
                return new obw((oaq) obj, (obu) objIo, obrVar, (ExecutorService) obj2);
            case 1:
                Context context = (Context) ((aupo) this.d).b;
                obc obcVar = (obc) this.e.io();
                ExecutorService executorService = (ExecutorService) ((aupo) this.c).b;
                axnp axnpVar = (axnp) this.a.io();
                oaq oaqVar = (oaq) ((aupo) this.b).b;
                Random random = new Random();
                oax oaxVar = oaqVar.j;
                if (oaxVar == null) {
                    oaxVar = oax.a;
                }
                String str = oaxVar.c;
                oax oaxVar2 = oaqVar.j;
                long j = (oaxVar2 == null ? oax.a : oaxVar2).e;
                long j2 = (oaxVar2 == null ? oax.a : oaxVar2).f;
                if (oaxVar2 == null) {
                    oaxVar2 = oax.a;
                }
                double d = oaxVar2.d;
                String str2 = oaqVar.g;
                int iAY = a.aY(oaqVar.h);
                int i = iAY == 0 ? 1 : iAY;
                int iBc = a.bc(oaqVar.c);
                obnVar = new obn(context, obcVar, executorService, axnpVar, random, str, j, j2, d, str2, i, (iBc != 0 ? iBc : 1) - 1);
                return obnVar;
            case 2:
                obnVar = new ocv((fxg) ((aupo) this.b).b, (ocu) this.a.io(), (View) ((aupo) this.c).b, (Activity) ((aupo) this.d).b, (omj) this.e.io());
                return obnVar;
            case 3:
                obnVar = new odd((fxg) ((aupo) this.c).b, (ocu) this.d.io(), (Map) ((aupo) this.a).b, (Context) ((aupo) this.e).b, (omj) this.b.io());
                return obnVar;
            case 4:
                obnVar = new odi((fxg) ((aupo) this.a).b, (ocu) this.c.io(), (Map) ((aupo) this.b).b, (Context) ((aupo) this.d).b, (omj) this.e.io());
                return obnVar;
            case 5:
                obnVar = new odm((fxg) ((aupo) this.c).b, (ocu) this.d.io(), (obb) ((aupo) this.a).b, (Map) ((aupo) this.b).b, (omj) this.e.io());
                return obnVar;
            case 6:
                obnVar = new odn((fxg) ((aupo) this.a).b, (ocu) this.c.io(), (Map) ((aupo) this.b).b, (DisplayMetrics) this.d.io(), (omj) this.e.io());
                return obnVar;
            case 7:
                obnVar = new odo((fxg) ((aupo) this.b).b, (ocu) this.a.io(), (DisplayMetrics) this.c.io(), (View) ((aupo) this.d).b, (omj) this.e.io());
                return obnVar;
            case 8:
                obnVar = new oes((Context) ((aupo) this.d).b, (omj) this.e.io(), (ahex) this.c.io(), (oaq) ((aupo) this.a).b, (obc) this.b.io());
                return obnVar;
            case 9:
                oltVar = new olt(((omk) this.d).io(), (qnl) this.e.io(), (qrx) this.c.io(), (Executor) this.b.io(), (oii) this.a.io());
                return oltVar;
            case 10:
                ((omk) this.d).io();
                return new olq((omj) this.e.io(), (qnl) this.b.io(), (qrx) this.c.io(), (Executor) this.a.io());
            default:
                oltVar = new olt(((omk) this.d).io(), (qnl) this.e.io(), (qrx) this.c.io(), (Executor) this.b.io(), (oii) this.a.io());
                return oltVar;
        }
    }

    public obx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, int i, byte[] bArr) {
        this.$cid = i;
        this.d = auprVar;
        this.e = auprVar2;
        this.c = auprVar3;
        this.a = auprVar4;
        this.b = auprVar5;
    }

    public obx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, int i, char[] cArr) {
        this.$cid = i;
        this.b = auprVar;
        this.a = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
        this.e = auprVar5;
    }

    public obx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, int i, float[] fArr) {
        this.$cid = i;
        this.a = auprVar;
        this.c = auprVar2;
        this.b = auprVar3;
        this.d = auprVar4;
        this.e = auprVar5;
    }

    public obx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, int i, short[] sArr) {
        this.$cid = i;
        this.c = auprVar;
        this.d = auprVar2;
        this.a = auprVar3;
        this.e = auprVar4;
        this.b = auprVar5;
    }

    public obx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, int i, boolean[] zArr) {
        this.$cid = i;
        this.c = auprVar;
        this.d = auprVar2;
        this.a = auprVar3;
        this.b = auprVar4;
        this.e = auprVar5;
    }

    public obx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, int i, int[][] iArr) {
        this.$cid = i;
        this.d = auprVar;
        this.e = auprVar2;
        this.b = auprVar3;
        this.c = auprVar4;
        this.a = auprVar5;
    }

    public obx(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, int i, short[][] sArr) {
        this.$cid = i;
        this.d = auprVar;
        this.e = auprVar2;
        this.c = auprVar3;
        this.b = auprVar4;
        this.a = auprVar5;
    }
}
