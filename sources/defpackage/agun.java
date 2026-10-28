package defpackage;

import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agun extends LogRecord {
    private static final Object[] b;
    public final agtr a;
    private final agsu c;

    static {
        new agum();
        b = new Object[0];
    }

    protected agun(agsu agsuVar, agta agtaVar) {
        super(agsuVar.q(), null);
        this.c = agsuVar;
        this.a = agtr.g(agtaVar, agsuVar.m());
        agro agroVarF = agsuVar.f();
        setSourceClassName(agroVarF.b());
        setSourceMethodName(agroVarF.d());
        setLoggerName(agsuVar.p());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        setMillis(agsuVar.e() / 1000000);
        super.setParameters(b);
    }

    private static void a(agsu agsuVar, StringBuilder sb) {
        sb.append("  original message: ");
        if (agsuVar.n() == null) {
            sb.append(agsy.b(agsuVar.o()));
        } else {
            sb.append(agsuVar.n().b);
            sb.append("\n  original arguments:");
            for (Object obj : agsuVar.K()) {
                sb.append("\n    ");
                sb.append(agsy.b(obj));
            }
        }
        agta agtaVarM = agsuVar.m();
        if (agtaVarM.b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < agtaVarM.b(); i++) {
                sb.append("\n    ");
                sb.append(agtaVarM.c(i).a);
                sb.append(": ");
                sb.append(agsy.b(agtaVarM.e(i)));
            }
        }
        sb.append("\n  level: ");
        sb.append(agsy.b(agsuVar.q()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(agsuVar.e());
        sb.append("\n  class: ");
        sb.append(agsuVar.f().b());
        sb.append("\n  method: ");
        sb.append(agsuVar.f().d());
        sb.append("\n  line number: ");
        sb.append(agsuVar.f().a());
    }

    @Override // java.util.logging.LogRecord
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            agsu agsuVar = this.c;
            agtr agtrVar = this.a;
            agsv agsvVar = agtv.a;
            if (agtv.a(agsuVar, agtrVar, agsvVar.b)) {
                StringBuilder sb = new StringBuilder();
                agvh.e(agsuVar, sb);
                agtv.b(agtrVar, agsvVar.a, sb);
                message = sb.toString();
            } else {
                Object objO = agsuVar.o();
                try {
                    message = agsy.c(objO);
                } catch (RuntimeException e) {
                    message = agsy.a(objO, e);
                }
            }
            super.setMessage(message);
        }
        return message;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(String str) {
    }

    protected agun(RuntimeException runtimeException, agsu agsuVar, agta agtaVar) {
        this(agsuVar, agtaVar);
        setLevel(agsuVar.q().intValue() < Level.WARNING.intValue() ? Level.WARNING : agsuVar.q());
        setThrown(runtimeException);
        StringBuilder sb = new StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        a(agsuVar, sb);
        super.setMessage(sb.toString());
    }

    public agun(agsu agsuVar, agta agtaVar, byte[] bArr) {
        this(agsuVar, agtaVar);
        setThrown((Throwable) this.a.b(agrj.a));
        getMessage();
    }
}
