package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awtk implements Serializable {
    public final Pattern a;

    /* JADX WARN: Illegal instructions before constructor call */
    public awtk(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String strPattern = pattern.pattern();
        strPattern.getClass();
        return new awti(strPattern, pattern.flags());
    }

    public final String a(CharSequence charSequence, String str) {
        charSequence.getClass();
        String strReplaceAll = this.a.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final boolean b(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final String c(CharSequence charSequence) {
        charSequence.getClass();
        String strReplaceFirst = this.a.matcher(charSequence).replaceFirst("");
        strReplaceFirst.getClass();
        return strReplaceFirst;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    public awtk(Pattern pattern) {
        this.a = pattern;
    }
}
