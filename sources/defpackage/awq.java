package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awq {
    public static final awq a = b(new Locale[0]);
    private final awr b;

    public awq(awr awrVar) {
        this.b = awrVar;
    }

    public static awq b(Locale... localeArr) {
        return new awq(new awr(new LocaleList(localeArr)));
    }

    public static awq c(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new awq(new awr(new LocaleList(localeArr)));
    }

    public static awq d(LocaleList localeList) {
        return new awq(new awr(localeList));
    }

    public final int a() {
        return this.b.a.size();
    }

    public final String e() {
        return this.b.a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awq) && this.b.equals(((awq) obj).b);
    }

    public final Locale f(int i) {
        return this.b.a.get(i);
    }

    public final boolean g() {
        return this.b.a.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
