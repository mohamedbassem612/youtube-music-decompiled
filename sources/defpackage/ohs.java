package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ohs extends Exception {
    public final agke a;

    private ohs(String str, Throwable th, agke agkeVar) {
        super(str, th);
        this.a = agkeVar;
    }

    static Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        return (cause == null || !th.getClass().equals(ExecutionException.class)) ? th : a(cause);
    }

    public static void b(Collection collection, Object... objArr) {
        Iterator it = collection.iterator();
        agjz agjzVar = null;
        while (it.hasNext()) {
            try {
                ahng.v((ListenableFuture) it.next());
            } catch (CancellationException | ExecutionException e) {
                if (agjzVar == null) {
                    agjzVar = new agjz(4);
                }
                agjzVar.h(a(e));
            }
        }
        if (agjzVar == null) {
            return;
        }
        agke agkeVarG = agjzVar.g();
        String strConcat = String.format(Locale.US, "Failed to download file group %s", objArr);
        int i = ((agpi) agkeVarG).d;
        if (i > 1) {
            String str = strConcat + '\n' + i + " failure(s) in total:\n";
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        printWriter.println(str);
                        int i2 = 0;
                        while (i2 < i) {
                            Throwable th = (Throwable) agkeVarG.get(i2);
                            i2++;
                            printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i2));
                            printWriter.println(c(th, 1));
                        }
                        printWriter.println("-------------------------------------------");
                        strConcat = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                    } catch (Throwable th2) {
                        try {
                            printWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        stringWriter.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                strConcat = "Failed to build string from throwables: ".concat(th6.toString());
            }
        }
        throw new ohs(strConcat, (Throwable) agkeVarG.get(0), agkeVarG);
    }

    private static String c(Throwable th, int i) {
        String str = th.getClass().getName() + ": " + th.getMessage();
        Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        if (i >= 5) {
            return str.concat("\n(...)");
        }
        return str + "\nCaused by: " + c(cause, i + 1);
    }
}
