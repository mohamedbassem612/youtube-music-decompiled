package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class accb {
    public static final accb a;
    public static final accb b;
    public static final accb c;
    public static final accb d;
    public static final Map e;
    public static final Map f;
    private static final /* synthetic */ accb[] g;

    static {
        accb accbVar = new accb("UNKNOWN", 0);
        a = accbVar;
        accb accbVar2 = new accb("OFF", 1);
        b = accbVar2;
        accb accbVar3 = new accb("ON", 2);
        c = accbVar3;
        accb accbVar4 = new accb("ON_RECOMMENDED", 3);
        d = accbVar4;
        g = new accb[]{accbVar, accbVar2, accbVar3, accbVar4};
        HashMap map = new HashMap();
        map.put(ajok.CAPTIONS_INITIAL_STATE_UNKNOWN, accbVar);
        map.put(ajok.CAPTIONS_INITIAL_STATE_ON_REQUIRED, accbVar3);
        map.put(ajok.CAPTIONS_INITIAL_STATE_ON_RECOMMENDED, accbVar4);
        map.put(ajok.CAPTIONS_INITIAL_STATE_OFF_REQUIRED, accbVar2);
        map.put(ajok.CAPTIONS_INITIAL_STATE_OFF_RECOMMENDED, accbVar);
        f = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put(aopw.UNKNOWN, accbVar);
        map2.put(aopw.ON, accbVar3);
        map2.put(aopw.OFF, accbVar2);
        map2.put(aopw.ON_WEAK, accbVar);
        map2.put(aopw.OFF_WEAK, accbVar);
        map2.put(aopw.FORCED_ON, accbVar3);
        e = DesugarCollections.unmodifiableMap(map2);
    }

    public static accb[] values() {
        return (accb[]) g.clone();
    }
}
