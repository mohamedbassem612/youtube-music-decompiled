package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahs {
    public static final void a(ahk ahkVar) {
        boolean zT = ahkVar.t() | ahkVar.t();
        Object objC = ahkVar.c();
        if (zT || objC == ahj.a) {
            objC = new ahs();
            ahkVar.D();
        }
    }

    public static final void b(ahk ahkVar) {
        boolean zT = ahkVar.t();
        Object objC = ahkVar.c();
        if (zT || objC == ahj.a) {
            objC = new ahs();
            ahkVar.D();
        }
    }

    public static final void c(ahk ahkVar) {
        awou awouVarD = ahkVar.d();
        boolean zT = ahkVar.t() | ahkVar.t() | ahkVar.t() | ahkVar.t();
        Object objC = ahkVar.c();
        if (zT || objC == ahj.a) {
            objC = new ahv(awouVarD);
            ahkVar.D();
        }
    }

    public static final void d(Object[] objArr, ahk ahkVar) {
        int length = objArr.length;
        awou awouVarD = ahkVar.d();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        boolean zR = ahkVar.r();
        for (Object obj : objArrCopyOf) {
            zR |= ahkVar.t();
        }
        Object objC = ahkVar.c();
        if (zR || objC == ahj.a) {
            new ahv(awouVarD);
            ahkVar.D();
        }
    }

    public static final void e(ahk ahkVar) {
        awou awouVarD = ahkVar.d();
        boolean zT = ahkVar.t() | ahkVar.t() | ahkVar.t();
        Object objC = ahkVar.c();
        if (zT || objC == ahj.a) {
            objC = new ahv(awouVarD);
            ahkVar.D();
        }
    }

    public static final void f(ahk ahkVar) {
        awou awouVarD = ahkVar.d();
        boolean zT = ahkVar.t() | ahkVar.t();
        Object objC = ahkVar.c();
        if (zT || objC == ahj.a) {
            objC = new ahv(awouVarD);
            ahkVar.D();
        }
    }

    public static final Object g(ajm ajmVar, ahm ahmVar) {
        ahmVar.getClass();
        Object objA = ajmVar.get(ahmVar);
        if (objA == null) {
            objA = ahmVar.a();
        }
        return ((aiv) objA).a(ajmVar);
    }

    public static final int h(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void i(ajw ajwVar, ajw ajwVar2) {
        if (ajwVar != ajwVar2) {
            aka.f.t(ajwVar);
            ajwVar2.a();
        } else if (ajwVar instanceof ake) {
            ((ake) ajwVar).d = null;
        } else if (ajwVar instanceof akf) {
            ((akf) ajwVar).a = null;
        } else {
            Objects.toString(ajwVar);
            throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(ajwVar)));
        }
    }

    public static final long j() {
        return Thread.currentThread().getId();
    }

    public static final ais k(Object obj, ahk ahkVar) {
        Object objC = ahkVar.c();
        if (objC == ahj.a) {
            aid aidVar = new aid(obj, aii.c);
            ahkVar.D();
            objC = aidVar;
        }
        aia aiaVar = (aia) objC;
        aiaVar.f(obj);
        return aiaVar;
    }
}
