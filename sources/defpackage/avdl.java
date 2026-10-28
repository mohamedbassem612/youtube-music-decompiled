package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdl extends auys {
    private final avdm a;

    public avdl(avdm avdmVar, avkd avkdVar) {
        avdmVar.getClass();
        this.a = avdmVar;
        avkdVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST;
        }
        return Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.auys
    public final void a(int i, String str) {
        Level levelC = c(i);
        if (avdm.a.isLoggable(levelC)) {
            avdm.a(this.a.c, levelC, str);
        }
        d(i);
    }

    @Override // defpackage.auys
    public final void b(int i, String str, Object... objArr) {
        Level levelC = c(i);
        d(i);
        a(i, avdm.a.isLoggable(levelC) ? MessageFormat.format(str, objArr) : null);
    }
}
