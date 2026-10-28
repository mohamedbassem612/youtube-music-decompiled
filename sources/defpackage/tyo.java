package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tyo extends toe {
    public static final atxp a;
    public final atxp c;

    static {
        aihf aihfVarCreateBuilder = atxp.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((atxp) aihfVarCreateBuilder.instance).b = 2;
        a = (atxp) aihfVarCreateBuilder.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tyo(toe toeVar) {
        atxp atxpVar;
        tnm tnmVar = toeVar.b;
        for (Throwable cause = toeVar.getCause(); (cause instanceof toe) && tnmVar == null; cause = cause.getCause()) {
            tnmVar = ((toe) cause).b;
        }
        super(tnmVar);
        if (tnmVar != null) {
            tnm tnmVar2 = this.b;
            if (tnmVar2 == null) {
                atxpVar = (atxp) c().d(new tar(this, 2));
                break;
            }
            Iterator it = tnmVar2.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    atxpVar = (atxp) c().d(new tar(this, 2));
                    break;
                }
                tnd tndVar = (tnd) it.next();
                if ("Content-Type".equalsIgnoreCase(tndVar.a)) {
                    if (!"application/x-protobuf".equalsIgnoreCase(tndVar.b)) {
                        if ("application/json".equalsIgnoreCase(tndVar.b)) {
                            atxpVar = (atxp) a().e(a);
                            break;
                        }
                    } else {
                        atxpVar = (atxp) c().e(a);
                        break;
                    }
                }
            }
            this.c = atxpVar;
        } else {
            this.c = a;
        }
        initCause(toeVar);
    }

    private final agev c() {
        try {
            tnm tnmVar = this.b;
            tnmVar.getClass();
            return agev.i((atxp) aihn.parseFrom(atxp.a, tnmVar.e(), ExtensionRegistryLite.getGeneratedRegistry()));
        } catch (aiik e) {
            twu.c(5, "Could not parse proto error payload.", e);
            return agdf.a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r4.equals("OK") != false) goto L65;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.agev a() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyo.a():agev");
    }

    public final List b() {
        return this.c.d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b != null ? this.c.c : super.getMessage();
    }
}
