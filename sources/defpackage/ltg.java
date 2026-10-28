package defpackage;

import android.content.ContentResolver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ltg {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    protected ltg(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static ltg b(String str) {
        return new lte(str, Boolean.FALSE);
    }

    public abstract Object a();
}
