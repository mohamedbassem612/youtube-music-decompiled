package defpackage;

import android.net.Uri;
import android.util.Log;
import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nqx {
    public static avlb a(mew mewVar) {
        try {
            boolean z = osu.a;
            return avlb.e();
        } catch (aiik e) {
            Log.w("RENDER_NEXT", "Failed to parse upb command: " + e.getMessage());
            return null;
        }
    }

    public static final pxk b(pyl pylVar) {
        int i;
        int i2 = pylVar.b;
        if (i2 == 0) {
            i = 6;
        } else if (i2 == 1) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 != 4) {
            i = i2 != 5 ? 0 : 5;
        } else {
            i = 4;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            String str = (i2 == 1 ? (pyi) pylVar.c : pyi.a).b;
            str.getClass();
            return new pxo(str);
        }
        if (i3 == 1) {
            return pyd.a;
        }
        if (i3 == 2) {
            return pyb.a;
        }
        if (i3 == 3) {
            String str2 = (i2 == 4 ? (pyg) pylVar.c : pyg.a).b;
            str2.getClass();
            return new pxl(str2);
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new awmj();
            }
            throw new IllegalStateException("Account not set in account representation proto");
        }
        String str3 = (i2 == 5 ? (pyh) pylVar.c : pyh.a).b;
        str3.getClass();
        return new pxn(str3, (pylVar.b == 5 ? (pyh) pylVar.c : pyh.a).c);
    }

    public static final boolean c(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    public static float d(float f, Size size) {
        return (f * Math.min(size.getWidth(), size.getHeight())) / 2.0f;
    }

    public static float e(float f, int i) {
        return (f * 160.0f) / i;
    }

    public static qwy f(Uri uri) {
        uri.getClass();
        return new qwp(uri);
    }
}
