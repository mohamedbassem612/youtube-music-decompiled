package defpackage;

import android.content.Context;
import android.net.Uri;
import android.telephony.TelephonyManager;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tar implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tar(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v40, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, mbc] */
    @Override // defpackage.agfr
    public final Object io() {
        xid xidVar;
        switch (this.$cid) {
            case 0:
                try {
                    return aigj.I(((Context) this.a).getAssets().open("youtube_mobile_master_cert_2026_public_key"));
                } catch (IOException unused) {
                    return aigj.d;
                }
            case 1:
                try {
                    return Boolean.valueOf(((addn) this.a).f().b);
                } catch (Exception unused2) {
                    return Boolean.TRUE;
                }
            case 2:
                return (atxp) ((tyo) this.a).a().e(tyo.a);
            case 3:
                TelephonyManager telephonyManager = (TelephonyManager) ((Context) this.a).getSystemService("phone");
                telephonyManager.getClass();
                return telephonyManager;
            case 4:
                vrx vrxVar = (vrx) this.a;
                return vrxVar.l.p(vrxVar.d);
            case 5:
                ((axfd) this.a).D();
                return null;
            case 6:
                return Uri.parse(((wjc) this.a).a);
            case 7:
                return Uri.parse(((wjc) this.a).a);
            case 8:
                return txz.b((Context) this.a);
            case 9:
                xidVar = new xid(((xej) this.a.io()).b(xel.b(true)));
                break;
            case 10:
                return Boolean.valueOf(((xhf) this.a).d());
            case 11:
                xidVar = new xid(((xej) this.a).b(xel.b(true)));
                break;
            case 12:
                return (File) this.a.io();
            case 13:
                return this.a;
            case 14:
                return (File) this.a.io();
            case 15:
                return ((zhl) this.a).T();
            case 16:
                return Long.valueOf(this.a.b());
            case 17:
                return ((zcf) this.a).y;
            case 18:
                return Long.valueOf(((zfc) this.a).c());
            case 19:
                return this.a;
            default:
                return this.a;
        }
        return xidVar;
    }
}
