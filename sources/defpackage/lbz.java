package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lbz {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final lcc g;

    public lbz(ldr ldrVar, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        lcc lccVar;
        kro.i(str2);
        kro.i(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            ldrVar.aT().f.b("Event created with reverse previous/current timestamps. appId", lcz.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            lccVar = new lcc(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    ldrVar.aT().c.a("Param name can't be null");
                    it.remove();
                } else {
                    Object objV = ldrVar.l().v(next, bundle2.get(next));
                    if (objV == null) {
                        ldrVar.aT().f.b("Param value can't be null", ldrVar.h.d(next));
                        it.remove();
                    } else {
                        ldrVar.l().S(bundle2, next, objV);
                    }
                }
            }
            lccVar = new lcc(bundle2);
        }
        this.g = lccVar;
    }

    public final String toString() {
        return "Event{appId='" + this.a + "', name='" + this.b + "', params=" + this.g.toString() + '}';
    }

    public lbz(ldr ldrVar, String str, String str2, String str3, long j, long j2, long j3, lcc lccVar) {
        kro.i(str2);
        kro.i(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            ldrVar.aT().f.c("Event created with reverse previous/current timestamps. appId, name", lcz.a(str2), lcz.a(str3));
        }
        this.g = lccVar;
    }
}
