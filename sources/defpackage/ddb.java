package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ddb {
    public int f;
    public int h;
    public float n;
    public String a = "";
    public String b = "";
    public Set c = Collections.EMPTY_SET;
    public String d = "";
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int o = -1;
    public boolean p = false;

    public static int b(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public final int a() {
        int i = this.k;
        if (i == -1 && this.l == -1) {
            return -1;
        }
        return (this.l == 1 ? 2 : 0) | (i == 1 ? 1 : 0);
    }
}
