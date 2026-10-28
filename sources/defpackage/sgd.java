package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sgd implements zzi {
    private final int a;
    private final int b;

    public sgd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.zzi
    public final String a(Uri uri, String str) {
        Integer num = (Integer) sfz.a.get(str);
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 22) {
                return Integer.toString(this.a);
            }
            if (iIntValue == 23) {
                return Integer.toString(this.b);
            }
        }
        return null;
    }

    @Override // defpackage.zzi
    public final String b() {
        return "sgd";
    }
}
