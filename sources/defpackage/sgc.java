package defpackage;

import android.net.Uri;
import android.util.Base64;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgc implements zzi {
    private final ains a;

    public sgc(ains ainsVar) {
        this.a = ainsVar;
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        ains ainsVar;
        Integer num = (Integer) sfz.a.get(str);
        if (num == null || num.intValue() != 72 || (ainsVar = this.a) == null) {
            return null;
        }
        return Base64.encodeToString(ainsVar.toByteArray(), 8);
    }

    @Override // defpackage.zzi
    public final String b() {
        return "sgc";
    }
}
