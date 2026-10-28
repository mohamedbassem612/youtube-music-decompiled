package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class suk implements svj {
    final /* synthetic */ amaz a;
    final /* synthetic */ sum b;

    public suk(sum sumVar, amaz amazVar) {
        this.a = amazVar;
        this.b = sumVar;
    }

    @Override // defpackage.svj
    public final void a() {
        amaz amazVar = this.a;
        int i = amazVar.b & SemanticState.Obscured;
        sum sumVar = this.b;
        if (i == 0) {
            sumVar.c();
            return;
        }
        vxe vxeVar = (vxe) sumVar.d.io();
        ajwo ajwoVar = amazVar.o;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        vxeVar.a(ajwoVar);
    }

    @Override // defpackage.svj
    public final void b(String str) {
        sum sumVar = this.b;
        if (TextUtils.isEmpty(str)) {
            sumVar.d(null);
        } else {
            sumVar.d(new Error(str));
        }
    }

    @Override // defpackage.svj
    public final void c(Intent intent) {
        String strJ;
        byte[] byteArrayExtra;
        acb acbVar;
        amaz amazVar = this.a;
        int i = amazVar.e;
        sum sumVar = this.b;
        if (i == 12) {
            vxe vxeVar = (vxe) sumVar.d.io();
            ajwo ajwoVar = amazVar.e == 12 ? (ajwo) amazVar.f : ajwo.a;
            HashMap map = new HashMap();
            if (intent != null) {
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_CALLBACK_DATA_TOKEN");
                if (byteArrayExtra2 != null) {
                    map.put("FUNDS_GUARANTEE_CALLBACK_CLIENT_DATA", agyg.d.j(byteArrayExtra2));
                }
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
                if (byteArrayExtra3 != null) {
                    map.put("PAYMENTS_PAYLOAD", agyg.d.j(byteArrayExtra3));
                }
                byte[] byteArrayExtra4 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN");
                if (byteArrayExtra4 != null) {
                    map.put("SERIALIZED_BACKEND_ANALYTICS_EVENT", byteArrayExtra4);
                }
                map.put("com.google.android.libraries.youtube.logging.interaction_logger", sumVar.a());
            }
            vxeVar.c(ajwoVar, map);
            return;
        }
        if (intent != null) {
            byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_SERVER_ANALYTICS_TOKEN");
            byte[] byteArrayExtra5 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN");
            strJ = byteArrayExtra5 != null ? agyg.d.j(byteArrayExtra5) : null;
        } else {
            strJ = null;
            byteArrayExtra = null;
        }
        if ((!amazVar.h.isEmpty() ? 1 : 0) + (!amazVar.i.isEmpty() ? 1 : 0) != 1) {
            acb acbVar2 = new acb((char[]) null);
            acbVar2.a = 18;
            if ((amazVar.b & 64) != 0) {
                acbVar2.d = amazVar.l;
            }
            xeu xeuVar = sumVar.c;
            if (xeuVar.b) {
                xff xffVarA = xeuVar.a(acbVar2.o(), alot.TRANSACTION_FLOW_FAILED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
            } else {
                xeuVar.b(acbVar2.h());
            }
            sumVar.d(null);
            return;
        }
        if (TextUtils.isEmpty(strJ)) {
            acb acbVar3 = new acb((char[]) null);
            acbVar3.a = 17;
            if ((amazVar.b & 64) != 0) {
                acbVar3.d = amazVar.l;
            }
            xeu xeuVar2 = sumVar.c;
            if (xeuVar2.b) {
                xff xffVarA2 = xeuVar2.a(acbVar3.o(), alot.TRANSACTION_FLOW_FAILED);
                ztf ztfVar2 = xffVarA2.k.e;
                xffVarA2.l = ztfVar2.a();
                ztfVar2.k(xffVarA2);
            } else {
                xeuVar2.b(acbVar3.h());
            }
            sumVar.d(null);
            return;
        }
        wvi wviVar = sumVar.a;
        wvf wvfVarA = wviVar.a();
        wvfVarA.e(amazVar.h);
        wvfVarA.a = wvf.j(amazVar.i);
        wvfVarA.b = aigj.x(strJ);
        if (byteArrayExtra != null) {
            wvfVarA.c = byteArrayExtra;
        }
        wvfVarA.o(amazVar.k.G());
        if (sumVar.m.m(13, 45616898L)) {
            sumVar.b.iR(false);
        }
        sud sudVar = sumVar.b;
        cf cfVar = sumVar.e;
        sudVar.h(cfVar.getSupportFragmentManager(), sud.k);
        if ((amazVar.b & 64) != 0) {
            acbVar = new acb((char[]) null);
            acbVar.d = amazVar.l;
            acbVar.a = 3;
        } else {
            acbVar = new acb((char[]) null);
            acbVar.a = 3;
        }
        taf.k(cfVar, wviVar.d(wvfVarA, sumVar.h), new hcq(sumVar, acbVar, 15), new gyr((Object) sumVar, (Object) acbVar, (Object) amazVar, 11));
    }
}
