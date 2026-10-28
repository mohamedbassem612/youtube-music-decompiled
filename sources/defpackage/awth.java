package defpackage;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awth implements awtg {
    public final Matcher a;
    private final CharSequence b;

    public awth(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.b = charSequence;
    }

    @Override // defpackage.awtg
    public final awsa a() {
        Matcher matcher = this.a;
        return awro.l(matcher.start(), matcher.end());
    }

    @Override // defpackage.awtg
    public final awtg b() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return avkz.g(matcher2, iEnd, charSequence);
    }
}
