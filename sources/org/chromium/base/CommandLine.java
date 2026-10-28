package org.chromium.base;

import android.text.TextUtils;
import defpackage.a;
import internal.J.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class CommandLine {
    public static final CommandLine a = new CommandLine();
    public volatile int b;
    private Map c;
    private ArrayList d;

    private static boolean wasFlagsLoadedFromFile() {
        return false;
    }

    public final String a(String str) {
        String str2;
        String str3;
        Map map = this.c;
        if (map == null) {
            str3 = (String) N.MZJ2lrZY(str);
        } else {
            synchronized (this) {
                str2 = (String) map.get(str);
            }
            str3 = str2;
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        return str3;
    }

    public final synchronized void b(String str, String str2) {
        Map map = this.c;
        if (str2 == null) {
            str2 = "";
        }
        if (map == null) {
            N.MUoYiNbY(str, str2);
            return;
        }
        map.put(str, str2);
        String strValueOf = String.valueOf(str);
        boolean zIsEmpty = str2.isEmpty();
        String strConcat = "--".concat(strValueOf);
        if (!zIsEmpty) {
            strConcat = a.cl(str2, (byte) 61, strConcat);
        }
        ArrayList arrayList = this.d;
        int i = this.b;
        this.b = i + 1;
        arrayList.add(i, strConcat);
    }

    public final synchronized void c(String[] strArr) {
        this.d = new ArrayList();
        this.c = new HashMap();
        this.b = 1;
        String str = strArr[0];
        ArrayList arrayList = this.d;
        if (str == null) {
            arrayList.add("");
            return;
        }
        arrayList.add(str);
        char c = 1;
        boolean z = true;
        char c2 = 0;
        while (c2 <= 0) {
            String str2 = strArr[0];
            if (c <= 0) {
                z &= !str2.equals("--");
                if (z && str2.startsWith("--")) {
                    String[] strArrSplit = str2.split("=", 2);
                    b(strArrSplit[0].substring(2), strArrSplit.length > 1 ? strArrSplit[1] : null);
                } else {
                    this.d.add(str2);
                }
            }
            c2 = 1;
            c = 0;
        }
    }

    public final synchronized void d() {
        if (a.d != null) {
            N.MDkrKi31(this.d);
            this.d = null;
            this.c = null;
        }
    }

    public final boolean e(String str) {
        boolean zContainsKey;
        Map map = this.c;
        if (map == null) {
            return N.MsCvypjU(str);
        }
        synchronized (this) {
            zContainsKey = map.containsKey(str);
        }
        return zContainsKey;
    }
}
