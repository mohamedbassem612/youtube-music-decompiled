package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lac extends laq {
    final /* synthetic */ Context a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ lay c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lac(lay layVar, Context context, Bundle bundle) {
        super(layVar, true);
        this.a = context;
        this.b = bundle;
        this.c = layVar;
    }

    @Override // defpackage.laq
    public final void a() {
        try {
            Context context = this.a;
            Object obj = ahny.a.a;
            String strU = mda.u(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strU)) {
                strU = mda.u(context);
            }
            Boolean boolV = mda.v(resources, strU);
            lay layVar = this.c;
            layVar.e = layVar.b(context, boolV == null || !boolV.booleanValue());
            if (layVar.e == null) {
                Log.w(layVar.a, "Failed to connect to measurement client.");
                return;
            }
            int iA = kvc.a(context, ModuleDescriptor.MODULE_ID);
            int iB = kvc.b(context, ModuleDescriptor.MODULE_ID, false);
            int iMax = Math.max(iA, iB);
            boolean z = Boolean.TRUE.equals(boolV) || iB < iA;
            long j = iMax;
            layVar.f = j;
            kzu kzuVar = new kzu(192008L, j, z, this.b, mda.u(context));
            if (layVar.f >= 169) {
                kzj kzjVar = layVar.e;
                if (kzjVar == null) {
                    throw new NullPointerException("null reference");
                }
                kzjVar.initializeWithElapsedTime(new kun(context), kzuVar, this.f, this.g);
                return;
            }
            kzj kzjVar2 = layVar.e;
            if (kzjVar2 == null) {
                throw new NullPointerException("null reference");
            }
            kzjVar2.initialize(new kun(context), kzuVar, this.f);
        } catch (Exception e) {
            this.c.f(e, true, false);
        }
    }
}
