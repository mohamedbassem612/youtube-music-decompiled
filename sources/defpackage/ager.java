package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ager {
    public final String c;

    public ager(String str) {
        str.getClass();
        this.c = str;
    }

    public static ager d(char c) {
        return new ager(String.valueOf(c));
    }

    public CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public String b(Iterable iterable) {
        return e(iterable.iterator());
    }

    public void c(Appendable appendable, Iterator it) throws IOException {
        if (it.hasNext()) {
            appendable.append(a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.c);
                appendable.append(a(it.next()));
            }
        }
    }

    public final String e(Iterator it) {
        StringBuilder sb = new StringBuilder();
        h(sb, it);
        return sb.toString();
    }

    public final String f(Object[] objArr) {
        return b(Arrays.asList(objArr));
    }

    public final String g(Object obj, Object obj2, Object... objArr) {
        return b(new ageq(objArr, obj, obj2));
    }

    public final void h(StringBuilder sb, Iterator it) {
        try {
            c(sb, it);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void i(StringBuilder sb, Iterable iterable) {
        h(sb, iterable.iterator());
    }

    public ager(ager agerVar) {
        this.c = agerVar.c;
    }
}
