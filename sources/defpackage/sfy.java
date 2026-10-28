package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sfy implements zzi {
    private final ofg a;
    private final Map b;

    public sfy(ofg ofgVar, Map map) {
        this.a = ofgVar;
        this.b = map;
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        Integer num = (Integer) sfz.a.get(str);
        if (num == null) {
            return null;
        }
        if (!zzj.f(this.b, str, uri)) {
            return (String) sfz.b.get(str);
        }
        int iIntValue = num.intValue();
        if (iIntValue == 49) {
            ofg ofgVar = this.a;
            if (ofgVar != null) {
                return ofgVar.a;
            }
        } else {
            if (iIntValue != 62) {
                return null;
            }
            ofg ofgVar2 = this.a;
            if (ofgVar2 != null) {
                return ofgVar2.b;
            }
        }
        return "";
    }

    @Override // defpackage.zzi
    public final String b() {
        return "sfy";
    }
}
