package org.chromium.url;

import android.icu.text.IDNA;
import defpackage.ie$$ExternalSyntheticApiModelOutline0;
import j$.util.StringJoiner;
import java.net.IDN;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class IDNStringUtil {
    private static final IDNA a;

    static {
        IDNA uTS46Instance = IDNA.getUTS46Instance(48);
        if (uTS46Instance == null) {
            throw new IllegalStateException("Failed to create IDNA instance");
        }
        a = uTS46Instance;
    }

    public static String a(String str) {
        IDNA idna = a;
        if (idna == null) {
            return IDN.toASCII(str, 2);
        }
        StringBuilder sb = new StringBuilder();
        IDNA.Info info = new IDNA.Info();
        idna.nameToASCII(str, sb, info);
        if (!info.hasErrors()) {
            String string = sb.toString();
            IDN.toASCII(string, 2);
            return string;
        }
        StringJoiner stringJoiner = new StringJoiner(", ");
        Iterator it = info.getErrors().iterator();
        while (it.hasNext()) {
            stringJoiner.add(ie$$ExternalSyntheticApiModelOutline0.m(it.next()).toString());
        }
        throw new IllegalArgumentException("Failed to convert IDN to ASCII: ".concat(stringJoiner.toString()));
    }

    private static String nativeIdnToASCII(String str) {
        try {
            return a(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
