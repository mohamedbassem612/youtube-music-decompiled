package com.google.android.libraries.elements.converters.properties;

import defpackage.nuc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ClassPropertiesConverter {
    public final nuc a;

    public ClassPropertiesConverter(nuc nucVar) {
        this.a = nucVar;
    }

    public static final int a(int i) {
        switch (i - 1) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
            case 7:
                return 6;
            default:
                return 0;
        }
    }

    public native long[] nativeResolveStyle(String str, String str2, String str3);
}
