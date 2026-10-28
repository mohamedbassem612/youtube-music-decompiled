package defpackage;

import j$.util.Comparator$CC;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class but {
    public static final /* synthetic */ int b = 0;
    private static final Comparator c = Comparator$CC.comparingInt(new crt(1));
    public final agke a;

    static {
        new but(agpi.a);
        int i = bwp.a;
    }

    public but(List list) {
        Comparator comparator = c;
        comparator.getClass();
        Object[] array = aguu.O(list).toArray();
        int length = array.length;
        aguu.j(array, length);
        Arrays.sort(array, comparator);
        this.a = agke.i(array, length);
    }
}
