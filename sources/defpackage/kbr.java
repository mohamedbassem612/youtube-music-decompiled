package defpackage;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kbr implements lot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ kbr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    @Override // defpackage.lot
    public final void a(lpa lpaVar) {
        kbn kbnVar;
        amth amthVar;
        switch (this.$cid) {
            case 0:
                ((kbu) ((kby) this.a).a).l(lpaVar);
                break;
            case 1:
                ((kbu) ((kby) this.a).a).l(lpaVar);
                break;
            case 2:
                boolean zJ = lpaVar.j();
                Object obj = this.a;
                if (zJ) {
                    Bundle bundle = (Bundle) lpaVar.f();
                    if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                        ((kdx) obj).g = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        khn.e();
                    }
                    if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK")) {
                        ((kdx) obj).h = bundle.getBoolean("com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK");
                        khn.e();
                    }
                }
                kdx kdxVar = (kdx) obj;
                boolean z = kdxVar.g;
                boolean z2 = kdxVar.h;
                if (kdxVar.b != null && (kbnVar = kdxVar.c) != null) {
                    boolean z3 = z2 && kbnVar.l;
                    Boolean bool = kbnVar.t;
                    boolean z4 = z && (bool != null ? bool.booleanValue() : kdxVar.f);
                    boolean z5 = kbnVar.m;
                    dil dilVar = new dil();
                    dilVar.a(z4);
                    dilVar.b(z5);
                    if (Build.VERSION.SDK_INT >= 30) {
                        dilVar.d = z3;
                    }
                    boolean z6 = kbnVar.s;
                    if (Build.VERSION.SDK_INT >= 30) {
                        dilVar.f = z6;
                    }
                    kdxVar.j = new dim(dilVar);
                    dij.n(kdxVar.j);
                    kdx.a.a("media transfer receiver in manifest = %b, session transfer = %s, media transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(kdxVar.f), bool == null ? "not defined" : bool.booleanValue() ? "enabled" : "disabled", Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z3));
                    kdz kdzVar = kdxVar.e;
                    if (kdzVar != null) {
                        kdzVar.d = z4;
                    }
                    if (z4) {
                        kdd.e(agzl.CAST_OUTPUT_SWITCHER_ENABLED);
                    }
                    if (z5) {
                        kdd.e(agzl.CAST_TRANSFER_TO_LOCAL_ENABLED);
                    }
                    break;
                }
                break;
            case 3:
                ((CountDownLatch) this.a).countDown();
                break;
            case 4:
                this.a.run();
                break;
            case 5:
                this.a.run();
                break;
            case 6:
                ((CountDownLatch) this.a).countDown();
                break;
            case 7:
                ((kul) this.a).close();
                break;
            case 8:
                Location location = (Location) lpaVar.f();
                if (location == null) {
                    amthVar = null;
                } else {
                    aihf aihfVarCreateBuilder = amth.a.createBuilder();
                    double longitude = location.getLongitude();
                    aihfVarCreateBuilder.copyOnWrite();
                    amth amthVar2 = (amth) aihfVarCreateBuilder.instance;
                    amthVar2.b |= 2;
                    amthVar2.d = longitude;
                    double latitude = location.getLatitude();
                    aihfVarCreateBuilder.copyOnWrite();
                    amth amthVar3 = (amth) aihfVarCreateBuilder.instance;
                    amthVar3.b |= 1;
                    amthVar3.c = latitude;
                    double accuracy = location.getAccuracy();
                    aihfVarCreateBuilder.copyOnWrite();
                    amth amthVar4 = (amth) aihfVarCreateBuilder.instance;
                    amthVar4.b |= 4;
                    amthVar4.e = accuracy;
                    amthVar = (amth) aihfVarCreateBuilder.build();
                }
                Object obj2 = this.a;
                if (amthVar != null) {
                    vce vceVar = (vce) ((qcb) obj2).a;
                    vcd vcdVar = vceVar.d;
                    vcdVar.a = amthVar;
                    vcdVar.filter(vceVar.e.a.getText());
                }
                break;
            case 9:
                ahtt.b((Intent) this.a);
                break;
            case 10:
                ((ahtv) this.a).b();
                break;
            default:
                this.a.cancel(false);
                break;
        }
    }
}
