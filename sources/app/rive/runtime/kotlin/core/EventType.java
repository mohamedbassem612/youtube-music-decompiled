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
public enum EventType {
    OpenURLEvent(131),
    GeneralEvent(128);

    private static final Map map;
    private final short value;
    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
    public static final Companion Companion = new Companion(null);

    static {
        awpl entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(Short.valueOf(((EventType) obj).value), obj);
        }
        map = linkedHashMap;
    }

    EventType(short s) {
        this.value = s;
    }

    public static awpl getEntries() {
        return $ENTRIES;
    }

    public final short getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final EventType fromInt(short s) {
            return (EventType) EventType.map.get(Short.valueOf(s));
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
