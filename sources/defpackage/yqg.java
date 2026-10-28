package defpackage;

import android.net.Uri;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class yqg {
    static final Character[] n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final /* synthetic */ int o = 0;

    static Uri k(Uri uri) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            Character[] chArr = n;
            int length = chArr.length;
            sb.append(chArr[random.nextInt(16)].charValue());
        }
        tyt tytVar = new tyt(uri);
        tytVar.e("id", sb.toString());
        return tytVar.a();
    }

    public abstract long a();

    public abstract long b();

    public abstract long c();

    public abstract yth d();

    public abstract String e();

    public abstract void f(Uri uri);

    public abstract void g(String str);

    public abstract void j();
}
