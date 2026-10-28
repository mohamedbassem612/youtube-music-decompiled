package defpackage;

import android.os.Looper;
import android.util.Log;
import app.rive.semantics.SemanticState;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpy {
    public final bqb a;
    private final bog b;

    public bpy(bog bogVar, bpo bpoVar) {
        this.b = bogVar;
        this.a = (bqb) new bpn(bpoVar, bqb.a).a(bqb.class);
    }

    public static bpy a(bog bogVar) {
        return new bpy(bogVar, ((bpp) bogVar).getViewModelStore());
    }

    public static boolean c(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Deprecated
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ahb ahbVar = this.a.b;
        if (ahbVar.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strValueOf = String.valueOf(str);
            for (int i = 0; i < ahbVar.c(); i++) {
                String strConcat = strValueOf.concat("    ");
                bpz bpzVar = (bpz) ahbVar.d(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(ahbVar.b(i));
                printWriter.print(": ");
                printWriter.println(bpzVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(bpzVar.i);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                bqg bqgVar = bpzVar.j;
                printWriter.println(bqgVar);
                bqgVar.d(strConcat.concat("  "), fileDescriptor, printWriter, strArr);
                if (bpzVar.k != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(bpzVar.k);
                    bqa bqaVar = bpzVar.k;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bqaVar.c);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                Object obj = bpzVar.e;
                printWriter.println(bqg.o(obj != boo.a ? obj : null));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(bpzVar.c > 0);
            }
        }
    }

    public final void d(int i, bpx bpxVar) {
        bqb bqbVar = this.a;
        if (bqbVar.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        bpz bpzVarA = bqbVar.a(i);
        if (c(2)) {
            toString();
        }
        if (bpzVarA != null) {
            if (c(3)) {
                Objects.toString(bpzVarA);
            }
            bpzVarA.l(this.b, bpxVar);
            return;
        }
        try {
            bqbVar.c = true;
            bqg bqgVarA = bpxVar.a();
            if (bqgVarA.getClass().isMemberClass() && !Modifier.isStatic(bqgVarA.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bqgVarA);
            }
            bpz bpzVar = new bpz(i, bqgVarA);
            if (c(3)) {
                bpzVar.toString();
            }
            bqbVar.b.f(i, bpzVar);
            bqbVar.b();
            bpzVar.l(this.b, bpxVar);
        } catch (Throwable th) {
            this.a.b();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bog bogVar = this.b;
        sb.append(bogVar.getClass().getSimpleName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(bogVar)));
        sb.append("}}");
        return sb.toString();
    }
}
