package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xvy implements Iterable {
    public static final xvy a = new xvy(Collections.EMPTY_MAP);
    public final Map b;

    public xvy(Map map) {
        this.b = new HashMap(map);
    }

    public final void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xvy) {
            return this.b.equals(((xvy) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xvw(this);
    }

    public final String toString() {
        return TextUtils.join(", ", this);
    }

    public xvy() {
        this(new HashMap());
    }
}
