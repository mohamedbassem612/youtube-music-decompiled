package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bst {
    public static final /* synthetic */ int a = 0;
    private static final HashSet b = new HashSet();
    private static String c = "media3.common";

    public static synchronized String a() {
        return c;
    }

    public static synchronized void b(String str) {
        if (b.add(str)) {
            c = c + ", " + str;
        }
    }
}
