package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ahno;
import defpackage.ahnr;
import defpackage.ahoa;
import defpackage.ahob;
import defpackage.ahoc;
import defpackage.ahoi;
import defpackage.ahoj;
import defpackage.ahol;
import defpackage.ahos;
import defpackage.ahpn;
import defpackage.ahqy;
import defpackage.ahue;
import defpackage.lay;
import defpackage.vp;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static /* synthetic */ ahoa lambda$getComponents$0(ahol aholVar) {
        ahnr ahnrVar = (ahnr) aholVar.e(ahnr.class);
        Context context = (Context) aholVar.e(Context.class);
        ahqy ahqyVar = (ahqy) aholVar.e(ahqy.class);
        if (ahnrVar == null) {
            throw new NullPointerException("null reference");
        }
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        if (ahqyVar == null) {
            throw new NullPointerException("null reference");
        }
        if (context.getApplicationContext() == null) {
            throw new NullPointerException("null reference");
        }
        if (ahoc.a == null) {
            synchronized (ahoc.class) {
                if (ahoc.a == null) {
                    Bundle bundle = new Bundle(1);
                    if (ahnrVar.k()) {
                        ahqyVar.b(ahno.class, new vp(7), new ahob());
                        bundle.putBoolean("dataCollectionDefaultEnabled", ahnrVar.j());
                    }
                    ahoc.a = new ahoc(lay.c(context, bundle).c);
                }
            }
        }
        return ahoc.a;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ahoj ahojVar = new ahoj(ahoa.class, new Class[0]);
        ahojVar.b(new ahos(ahnr.class, 1, 0));
        ahojVar.b(new ahos(Context.class, 1, 0));
        ahojVar.b(new ahos(ahqy.class, 1, 0));
        ahojVar.b = new ahpn(1);
        ahojVar.d(2);
        ahue ahueVar = new ahue("fire-analytics", "24.0.1");
        ahoj ahojVar2 = new ahoj(ahue.class, new Class[0]);
        ahojVar2.c();
        ahojVar2.b = new ahoi(ahueVar, 1);
        return Arrays.asList(ahojVar.a(), ahojVar2.a());
    }
}
