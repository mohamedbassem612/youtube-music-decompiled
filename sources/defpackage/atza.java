package defpackage;

import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atza {
    public static final /* synthetic */ int a = 0;

    static {
        aihf aihfVarCreateBuilder = atyx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((atyx) aihfVarCreateBuilder.instance).b = 24;
        aihfVarCreateBuilder.copyOnWrite();
        final int i = 0;
        ((atyx) aihfVarCreateBuilder.instance).c = 0;
        aihfVarCreateBuilder.copyOnWrite();
        ((atyx) aihfVarCreateBuilder.instance).d = 0;
        aihfVarCreateBuilder.copyOnWrite();
        ((atyx) aihfVarCreateBuilder.instance).e = 0;
        final int i2 = 1;
        Comparator comparatorThenComparingInt = Comparator$EL.thenComparingInt(Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ddc(20)), new ToIntFunction() { // from class: atyz
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int i3 = i2;
                if (i3 != 0) {
                    return i3 != 1 ? ((atyx) obj).e : ((atyx) obj).c;
                }
                return ((atyx) obj).d;
            }
        }), new ToIntFunction() { // from class: atyz
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int i3 = i;
                if (i3 != 0) {
                    return i3 != 1 ? ((atyx) obj).e : ((atyx) obj).c;
                }
                return ((atyx) obj).d;
            }
        });
        final int i3 = 2;
        Comparator$EL.thenComparingInt(comparatorThenComparingInt, new ToIntFunction() { // from class: atyz
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int i4 = i3;
                if (i4 != 0) {
                    return i4 != 1 ? ((atyx) obj).e : ((atyx) obj).c;
                }
                return ((atyx) obj).d;
            }
        });
    }
}
