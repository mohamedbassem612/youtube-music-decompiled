package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agen extends agdx implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public agen(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.agdx
    public final ahub a(CharSequence charSequence) {
        return new ahub(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
