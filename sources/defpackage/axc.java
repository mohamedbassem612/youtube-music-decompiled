package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class axc {
    public static final agm a = new agm(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final aha d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new axnt(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new aha(0);
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((awy) list.get(i2)).h);
            sb.append('-');
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(';');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static aami b(String str, Context context, List list, int i) {
        int i2;
        int length;
        Typeface typefaceA;
        Typeface typeface = (Typeface) a.b(str);
        if (typeface != null) {
            return new aami(typeface);
        }
        try {
            aami aamiVarA = awx.a(context, list, null);
            if (aamiVarA.a != 0) {
                i2 = -2;
            } else {
                axd[] axdVarArrD = aamiVarA.d();
                if (axdVarArrD == null || (length = axdVarArrD.length) == 0) {
                    i2 = 1;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i4 = axdVarArrD[i3].e;
                        if (i4 != 0) {
                            if (i4 >= 0) {
                                i2 = i4;
                                break;
                            }
                            i2 = -3;
                            break;
                        }
                        i3++;
                    }
                }
            }
            if (i2 != 0) {
                return new aami(i2);
            }
            ?? r1 = aamiVarA.b;
            if (r1.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                typefaceA = avy.a(context, null, aamiVarA.d(), i);
            } else {
                awg awgVar = avy.a;
                typefaceA = avy.a.h(context, r1, i);
            }
            if (typefaceA == null) {
                return new aami(-3);
            }
            a.c(str, typefaceA);
            return new aami(typefaceA);
        } catch (PackageManager.NameNotFoundException unused) {
            return new aami(-1);
        }
    }
}
