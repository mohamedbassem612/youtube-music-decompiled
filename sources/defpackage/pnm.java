package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pnm implements pnl {
    private static final agsn b = agsn.h("GnpSdk");
    public final pmk a;
    private final mbc c;
    private final pxh d;
    private final aunn e;
    private final aunn f;
    private final awou g;
    private final pml h;

    public pnm(mbc mbcVar, pmk pmkVar, pxh pxhVar, aunn aunnVar, aunn aunnVar2, awou awouVar, pml pmlVar) {
        mbcVar.getClass();
        pmkVar.getClass();
        pxhVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        awouVar.getClass();
        this.c = mbcVar;
        this.a = pmkVar;
        this.d = pxhVar;
        this.e = aunnVar;
        this.f = aunnVar2;
        this.g = awouVar;
        this.h = pmlVar;
    }

    @Override // defpackage.pnl
    public final boolean a(Context context, ahth ahthVar) throws Throwable {
        int iB;
        int iIntValue;
        context.getClass();
        this.d.a(context);
        String str = (String) ahthVar.a().get("casp");
        Bundle bundle = ahthVar.a;
        byte[] byteArray = bundle.getByteArray("rawData");
        String str2 = (String) ahthVar.a().get("chm");
        String str3 = (String) ahthVar.a().get("ki");
        String str4 = (String) ahthVar.a().get("cid");
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        String string2 = bundle.getString("google.delivered_priority");
        if (string2 != null) {
            iB = ahth.b(string2);
        } else if ("1".equals(bundle.getString("google.priority_reduced"))) {
            iB = 2;
        } else {
            string2 = bundle.getString("google.priority");
            iB = ahth.b(string2);
        }
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            iIntValue = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                iIntValue = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(String.valueOf(obj))));
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        Bundle bundle2 = ahthVar.a;
        Integer numValueOf = Integer.valueOf(iIntValue);
        int iC = pmi.c(bundle2.getString("message_type"));
        String string3 = bundle2.getString("google.message_id");
        if (string3 == null) {
            string3 = bundle2.getString("message_id");
        }
        int iB2 = ahth.b(string);
        int iA = nxb.a(iB);
        if (true == TextUtils.isEmpty(string3)) {
            string3 = null;
        }
        pmi pmiVar = new pmi(string3, iC, nxb.a(iB2), iA, numValueOf, str, byteArray, str2, str3, str4);
        if (!this.h.a(pmiVar)) {
            return false;
        }
        try {
            awqx.l(this.g, new ply(this, pmiVar, context, TimeUnit.MILLISECONDS.toMicros(this.c.f().toEpochMilli()), (awoq) null, 2));
        } catch (Exception e) {
            pny pnyVar = (pny) this.e.io();
            pnz pnzVarA = ((pob) this.f.io()).a(e);
            ((poc) pnzVarA).s = "push";
            pnyVar.a(pnzVarA);
            ((agsj) ((agsj) b.c()).j(e)).t("Push intent handler failed to handle message.");
        }
        return true;
    }
}
