package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn implements dos {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public cn(fx fxVar, int i) {
        this.$cid = i;
        this.a = fxVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.dos
    public final Bundle a() {
        awml[] awmlVarArr;
        switch (this.$cid) {
            case 0:
                return ((dd) this.a).c();
            case 1:
                return ((cf) this.a).m676lambda$init$0$androidsupportv4appFragmentActivity();
            case 2:
                Bundle bundle = new Bundle();
                ((fx) this.a).getDelegate().B();
                return bundle;
            case 3:
                return qe._init_$lambda$3((qe) this.a);
            case 4:
                axfd axfdVar = (axfd) this.a;
                for (Map.Entry entry : atqq.D(axfdVar.e).entrySet()) {
                    axfdVar.ax((String) entry.getKey(), ((axaf) entry.getValue()).c());
                }
                for (Map.Entry entry2 : atqq.D(axfdVar.b).entrySet()) {
                    axfdVar.ax((String) entry2.getKey(), ((dos) entry2.getValue()).a());
                }
                ?? r5 = axfdVar.c;
                if (r5.isEmpty()) {
                    awmlVarArr = new awml[0];
                } else {
                    ArrayList arrayList = new ArrayList(r5.size());
                    for (Map.Entry entry3 : r5.entrySet()) {
                        arrayList.add(new awml((String) entry3.getKey(), entry3.getValue()));
                    }
                    awmlVarArr = (awml[]) arrayList.toArray(new awml[0]);
                }
                return aie.h((awml[]) Arrays.copyOf(awmlVarArr, awmlVarArr.length));
            case 5:
                Bundle bundle2 = new Bundle();
                afhh afhhVar = (afhh) this.a;
                bundle2.putBundle("state_account_state_bundle", afhhVar.a.a());
                bundle2.putBoolean("tiktok_accounts_disabled", afhhVar.b);
                return bundle2;
            case 6:
                Bundle bundle3 = new Bundle();
                afhk afhkVar = (afhk) this.a;
                afhkVar.a.e(bundle3);
                afgu afguVar = afhkVar.b;
                if (afguVar == null) {
                    return bundle3;
                }
                bundle3.putInt("KSCH$AC$callbacks_id", afguVar.a);
                bundle3.putInt("KSCH$AC$callbacks_state", afguVar.b);
                return bundle3;
            default:
                Bundle bundle4 = new Bundle();
                afkm afkmVar = (afkm) this.a;
                Set set = afkmVar.c;
                bundle4.putParcelableArray("future_wrappers", (Parcelable[]) set.toArray(new afko[set.size()]));
                bundle4.putInt("last_process_id", afkmVar.d);
                afkmVar.b.e(bundle4);
                return bundle4;
        }
    }

    public /* synthetic */ cn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
