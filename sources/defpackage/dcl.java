package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dcl {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b = Pattern.compile(bwp.K("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern c = Pattern.compile(bwp.K("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern d = Pattern.compile("\\\\an(\\d+)");
}
