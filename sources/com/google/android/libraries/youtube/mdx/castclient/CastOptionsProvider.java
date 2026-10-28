package com.google.android.libraries.youtube.mdx.castclient;

import android.content.Context;
import defpackage.abhi;
import defpackage.agfa;
import defpackage.aguu;
import defpackage.kap;
import defpackage.kbl;
import defpackage.kbn;
import defpackage.kcm;
import defpackage.keh;
import defpackage.xla;
import defpackage.xmh;
import defpackage.xmr;
import defpackage.xra;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class CastOptionsProvider implements kcm {
    public String castAppId;
    public xla mdxConfig;
    public xra mdxMediaTransferReceiverEnabler;
    public xmr mdxModuleConfig;

    @Override // defpackage.kcm
    public List getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // defpackage.kcm
    public kbn getCastOptions(Context context) {
        ((xmh) aguu.av(context, xmh.class)).dP(this);
        boolean z = !this.mdxConfig.ag();
        boolean zAe = this.mdxConfig.ae();
        ArrayList arrayList = new ArrayList();
        new kap();
        ArrayList arrayList2 = new ArrayList();
        String str = this.castAppId;
        boolean zC = this.mdxMediaTransferReceiverEnabler.c();
        boolean zC2 = this.mdxMediaTransferReceiverEnabler.c();
        Boolean boolValueOf = Boolean.valueOf(zC2);
        kap kapVar = new kap();
        if (!this.mdxConfig.Z()) {
            int i = this.mdxModuleConfig.f;
        }
        kapVar.a = false;
        kapVar.c = this.mdxConfig.ao();
        abhi abhiVar = new abhi((byte[]) null);
        abhiVar.d();
        return new kbn(str, arrayList, false, kapVar, z, (keh) new agfa(abhiVar.c()).e(kbn.c), z, 0.05000000074505806d, false, false, zC, arrayList2, zC2, false, (kbl) new agfa(new kbl(zAe)).e(kbn.a), kbn.b, false, false, boolValueOf);
    }
}
