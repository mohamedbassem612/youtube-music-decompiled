package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aikw {
    public static final aigu a;

    static {
        aihf aihfVarCreateBuilder = aigu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((aigu) aihfVarCreateBuilder.instance).b = -315576000000L;
        aihfVarCreateBuilder.copyOnWrite();
        ((aigu) aihfVarCreateBuilder.instance).c = -999999999;
        aihf aihfVarCreateBuilder2 = aigu.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((aigu) aihfVarCreateBuilder2.instance).b = 315576000000L;
        aihfVarCreateBuilder2.copyOnWrite();
        ((aigu) aihfVarCreateBuilder2.instance).c = 999999999;
        aihf aihfVarCreateBuilder3 = aigu.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ((aigu) aihfVarCreateBuilder3.instance).b = 0L;
        aihfVarCreateBuilder3.copyOnWrite();
        ((aigu) aihfVarCreateBuilder3.instance).c = 0;
        a = (aigu) aihfVarCreateBuilder3.build();
    }

    public static long a(aigu aiguVar) {
        f(aiguVar);
        return a.d(aext.w(aiguVar.b, 1000000L), aiguVar.c / 1000);
    }

    public static long b(aigu aiguVar) {
        f(aiguVar);
        return a.d(aext.w(aiguVar.b, 1000L), aiguVar.c / 1000000);
    }

    public static aigu c(long j) {
        return d(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static aigu d(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = a.d(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        aihf aihfVarCreateBuilder = aigu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((aigu) aihfVarCreateBuilder.instance).b = j;
        aihfVarCreateBuilder.copyOnWrite();
        ((aigu) aihfVarCreateBuilder.instance).c = i;
        aigu aiguVar = (aigu) aihfVarCreateBuilder.build();
        f(aiguVar);
        return aiguVar;
    }

    public static boolean e(aigu aiguVar) {
        f(aiguVar);
        long j = aiguVar.b;
        if (j == 0) {
            if (aiguVar.c < 0) {
                return true;
            }
        } else if (j < 0) {
            return true;
        }
        return false;
    }

    public static void f(aigu aiguVar) {
        long j = aiguVar.b;
        int i = aiguVar.c;
        if (a.aG(j, i)) {
            return;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
