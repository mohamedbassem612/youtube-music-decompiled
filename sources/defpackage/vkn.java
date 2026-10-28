package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vkn {
    public static final auir a = auir.YOUTUBE_SANS;
    public static final auir b = auir.CLASSIC_INTER_TIGHT;
    public static final Set c;
    public static final Set d;
    public static final agke e;
    public static final agke f;

    static {
        agkj.j(auir.SCRIPT, Float.valueOf(0.5f));
        agkh agkhVar = new agkh(4);
        auir auirVar = auir.SCRIPT;
        Float fValueOf = Float.valueOf(6.0f);
        agkhVar.e(auirVar, fValueOf);
        agkhVar.e(auir.CLASSIC_INTER_TIGHT, fValueOf);
        agkhVar.e(auir.LIGHT_INTER_TIGHT, fValueOf);
        agkhVar.e(auir.JOURNAL, fValueOf);
        agkhVar.e(auir.CHISEL, fValueOf);
        agkhVar.d(true);
        c = DesugarCollections.synchronizedSet(new HashSet());
        d = DesugarCollections.synchronizedSet(new HashSet());
        e = agke.x(auir.YOUTUBE_SANS, auir.HEAVY, auir.HANDWRITING, auir.TYPEWRITER, auir.MEME, auir.FUN, auir.LIGHT, auir.CLASSY);
        f = agke.y(auir.CLASSIC_INTER_TIGHT, auir.LIGHT_INTER_TIGHT, auir.MARKER, auir.JOURNAL, auir.CHISEL, auir.SCRIPT, auir.PRINTER, auir.NARROW, auir.COZY);
    }

    public static boolean a(auir auirVar) {
        return auirVar == auir.HEAVY || auirVar == auir.HANDWRITING;
    }
}
