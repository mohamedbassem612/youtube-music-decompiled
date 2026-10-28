package defpackage;

import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpc implements bps {
    private final /* synthetic */ int $cid;

    public bpc(int i) {
        this.$cid = i;
    }

    public final String toString() {
        int i = this.$cid;
        if (i == 0) {
            String string = Integer.toString(hashCode(), 16);
            string.getClass();
            int i2 = awrn.a;
            return "CreationExtras.Key@" + string + '<' + new awqv(bpp.class).c() + '>';
        }
        if (i == 1) {
            String string2 = Integer.toString(hashCode(), 16);
            string2.getClass();
            int i3 = awrn.a;
            return "CreationExtras.Key@" + string2 + '<' + new awqv(dow.class).c() + '>';
        }
        if (i == 2) {
            String string3 = Integer.toString(hashCode(), 16);
            string3.getClass();
            int i4 = awrn.a;
            return "CreationExtras.Key@" + string3 + '<' + new awqv(Bundle.class).c() + '>';
        }
        if (i == 3) {
            String string4 = Integer.toString(hashCode(), 16);
            string4.getClass();
            int i5 = awrn.a;
            return "CreationExtras.Key@" + string4 + '<' + new awqv(Application.class).c() + '>';
        }
        if (i != 4) {
            String string5 = Integer.toString(hashCode(), 16);
            string5.getClass();
            int i6 = awrn.a;
            return "CreationExtras.Key@" + string5 + '<' + new awqv(aupe.class).c() + '>';
        }
        String string6 = Integer.toString(hashCode(), 16);
        string6.getClass();
        int i7 = awrn.a;
        return "CreationExtras.Key@" + string6 + '<' + new awqv(String.class).c() + '>';
    }
}
