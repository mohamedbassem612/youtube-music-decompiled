package app.rive.runtime.kotlin.core;

import defpackage.atqq;
import defpackage.awpl;
import defpackage.awqx;
import defpackage.awro;
import internal.org.jni_zero.JniZero;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum Direction {
    BACKWARDS(-1),
    FORWARDS(1),
    AUTO(0);

    private static final Map map;
    private final int value;
    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
    public static final Companion Companion = new Companion(null);

    static {
        awpl entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((Direction) obj).value), obj);
        }
        map = linkedHashMap;
    }

    Direction(int i) {
        this.value = i;
    }

    public static awpl getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final Direction fromInt(int i) {
            return (Direction) Direction.map.get(Integer.valueOf(i));
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
