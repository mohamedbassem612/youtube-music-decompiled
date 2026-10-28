package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avac {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final agyg b = avbe.c;

    public static avbb a(String str, avab avabVar) {
        char cCharAt = str.charAt(0);
        int i = avbb.c;
        return new avbc(str, cCharAt == ':', avabVar);
    }
}
