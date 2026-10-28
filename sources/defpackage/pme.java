package defpackage;

import android.os.Build;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class pme extends awpk implements awqk {
    int a;
    final /* synthetic */ ppw b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ pmg d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ long g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pme(ppw ppwVar, Bundle bundle, pmg pmgVar, String str, String str2, long j, boolean z, awoq awoqVar) {
        super(2, awoqVar);
        this.b = ppwVar;
        this.c = bundle;
        this.d = pmgVar;
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = z;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pme(this.b, this.c, this.d, this.e, this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pme) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strName;
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            agsn agsnVar = pmg.a;
            ppw ppwVar = this.b;
            Bundle bundle = this.c;
            this.a = 1;
            obj = ppwVar.c(bundle, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
        }
        pmg pmgVar = this.d;
        String str = this.e;
        String str2 = this.f;
        long j = this.g;
        boolean z = this.h;
        pky pkyVar = (pky) obj;
        String packageName = pmgVar.c.getPackageName();
        packageName.getClass();
        Object objIo = pmgVar.f.io();
        objIo.getClass();
        pwf pwfVar = (pwf) objIo;
        pkyVar.getClass();
        Objects.checkIndex(0, 5);
        boolean z2 = pkyVar instanceof pla;
        if (!z2) {
            if (pkyVar instanceof ppc) {
            } else if (pkyVar instanceof pkz) {
                ((agsj) ((agsj) pmg.a.c()).j(((pkz) pkyVar).b())).B("Job finished with permanent failure. Job ID: '%s', key: '%s'", str, str2);
            } else {
                if (!(pkyVar instanceof pld)) {
                    throw new awmj();
                }
            }
        }
        pls plsVar = pmgVar.e;
        int i2 = Build.VERSION.SDK_INT;
        String strE = pkyVar.e();
        pkx pkxVarC = pkyVar.c();
        if (pkxVarC == null || (strName = pkxVarC.name()) == null) {
            strName = "";
        }
        pwfVar.h(packageName, plsVar.a, i2, str2, strE, strName, z);
        pmgVar.b(j, str2, pkyVar);
        Objects.checkIndex(0, 4);
        if (pkyVar != null) {
            if (z2) {
                return new dzd();
            }
            if (pkyVar instanceof pld) {
                return new dzc();
            }
            if (pkyVar instanceof pkz) {
                return new dzb();
            }
        }
        throw new awmj();
    }
}
