package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sfw implements zzi {
    private final sfv a;

    public sfw(sfv sfvVar) {
        this.a = sfvVar;
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        Integer num = (Integer) sfz.a.get(str);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 4) {
            return Integer.toString(this.a.c());
        }
        if (iIntValue == 10) {
            return this.a.e() ? "1" : "0";
        }
        if (iIntValue == 24) {
            return Integer.toString(this.a.a());
        }
        if (iIntValue == 16) {
            return Integer.toString(this.a.b());
        }
        if (iIntValue != 17) {
            return null;
        }
        String str2 = this.a.b;
        return str2 == null ? "" : str2;
    }

    @Override // defpackage.zzi
    public final String b() {
        return "sfw";
    }
}
