package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class agqv {
    public final agsw a;

    protected agqv(agsw agswVar) {
        agswVar.getClass();
        this.a = agswVar;
    }

    public static void e(String str, agsu agsuVar) {
        StringBuilder sb = new StringBuilder();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(agsuVar.e() / 1000000)));
        sb.append(": logging error [");
        ahng.aa(1, agsuVar.f(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract agru a(Level level);

    public final agru b() {
        return a(Level.SEVERE);
    }

    public final agru c() {
        return a(Level.WARNING);
    }

    protected final String d() {
        return this.a.a();
    }

    protected final boolean f(Level level) {
        return this.a.d(level);
    }
}
